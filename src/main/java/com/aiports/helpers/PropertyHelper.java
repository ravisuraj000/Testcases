package com.aiports.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;

public class PropertyHelper {
    private static final Properties properties = new Properties();
    private static Logger logger = LoggerFactory.getLogger(PropertyHelper.class);
    static {
        try {
            properties.load(PropertyHelper.class
                    .getClassLoader()
                    .getResourceAsStream("application.properties"));
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }
    public static String getProperty(String key) {
        if (properties.containsKey(key)) {
            return properties.getProperty(key);
        } else {
            return "";
        }
    }
}
