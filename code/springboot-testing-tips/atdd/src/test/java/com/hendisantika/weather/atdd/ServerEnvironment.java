package com.hendisantika.weather.atdd;


import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class ServerEnvironment {
    private static List<SpringApplicationWrapper> instances = new ArrayList<>();
    public static final int SERVER_PORT = 8090;
    public static final int STATION_1_PORT = 8091;
    public static final int STATION_2_PORT = 8092;
    public static final int STATION_3_PORT = 8093;

    static {
        List<String> defaultArgs = Lists
                .newArrayList(
                        "--endpoints.shutdown.sensitive=false",
                        "--endpoints.shutdown.enabled=true",
                        "--management.context-path=/manage",
                        "--logging.level.org.springframework=WARN");
        instances.add(createWeatherServerInstance(Lists.newArrayList(defaultArgs)));
        instances.add(createWeatherStationInstance(Lists.newArrayList(defaultArgs), STATION_1_PORT, -3.5, 30));
        instances.add(createWeatherStationInstance(Lists.newArrayList(defaultArgs), STATION_2_PORT, 2, 35));
        instances.add(createWeatherStationInstance(Lists.newArrayList(defaultArgs), STATION_3_PORT, 6.3, 40));
    }

    public static void start() {
        instances.forEach(instance -> instance.start());
    }

    public static void shutdown() {
        instances.forEach(instance -> instance.shutdown());
    }

    private static SpringApplicationWrapper createWeatherServerInstance(List<String> defaultArgs) {
        String jarFilePath = PathUtil
                .getJarfile(PathUtil.getProjectRoot() + "/springboot-testing-tips/weatherserver/target");
        defaultArgs.add("--server.port=" + SERVER_PORT);
        defaultArgs.add("--weather.host.1000-3000=http://localhost:" + STATION_1_PORT + "/weather");
        defaultArgs.add("--weather.host.3001-6000=http://localhost:" + STATION_2_PORT + "/weather");
        defaultArgs.add("--weather.host.6001-9999=http://localhost:" + STATION_3_PORT + "/weather");
        return new SpringApplicationWrapper("http://localhost:8090/manage", jarFilePath, defaultArgs);
    }

    private static SpringApplicationWrapper createWeatherStationInstance(List<String> defaultArgs, int port, double temperature, int humidity) {
        String jarFilePath = PathUtil
                .getJarfile(PathUtil.getProjectRoot() + "/springboot-testing-tips/weatherstation/target");
        String managementUrl = String.format("http://localhost:%d/manage", port);
        defaultArgs.add("--server.port=" + port);
        defaultArgs.add("--temperature=" + temperature);
        defaultArgs.add("--humidity=" + humidity);
        return new SpringApplicationWrapper(managementUrl, jarFilePath, defaultArgs);
    }

}
