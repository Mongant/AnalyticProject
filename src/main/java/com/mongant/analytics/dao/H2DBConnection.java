package com.mongant.analytics.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2DBConnection {

    private Connection connection;

    private final String JDBC_DRIVER = "org.h2.Driver";
    private final String URL = "jdbc:h2:~/Workspace/Analytics/src/main/resources/main_db";
    private final String USER = "sa";
    private final String PASSWORD = "";

    public Connection getConnection() {
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return connection;
    }
}
