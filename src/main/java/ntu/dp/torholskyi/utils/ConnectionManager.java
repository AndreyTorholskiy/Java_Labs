package ntu.dp.torholskyi.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
    PropertiesUtil propertiesUtil = new PropertiesUtil();

    private final String URL = propertiesUtil.getProperty("db.url");
    private final String USER = propertiesUtil.getProperty("db.user");
    private final String PASSWORD = propertiesUtil.getProperty("db.password");

    public Connection open() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
