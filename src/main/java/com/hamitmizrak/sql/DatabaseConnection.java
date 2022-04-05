package com.hamitmizrak.sql;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Log4j2
public class DatabaseConnection extends DatabaseInformation {
    //database connection
    private Connection connection;

    //database get username,password,url
    private String url = this.getUrl();
    private String userName = this.getUserName();
    private String userPassword = this.getUserPassword();

    //singleton design pattern
    private static DatabaseConnection instance;

    //singleton parametresiz constructor
    private DatabaseConnection() {
        try {
            Class.forName(this.getForNameData());
            log.info("Driver Yüklendi");
            connection = DriverManager.getConnection(url, userName, userPassword);
            log.info("Bağlantı Başarılı");
        } catch (Exception e) {
            log.error("!!!! Error Connection Failed !!!!");
            e.printStackTrace();
        }
    }

    //singleton
    public static DatabaseConnection getInstance() {
        try {
            if (instance == null || instance.connection.isClosed()) {
                instance = new DatabaseConnection();
            }
        } catch (SQLException sql) {
            log.error("!!! instance error !!!");
            sql.printStackTrace();
        }
        return instance;
    }

    //connection yani dış dünya bağlantısına dair
    public Connection getConnection() {
        return connection;
    }

    public DatabaseConnection setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }

    public static void main(String[] args) {
        DatabaseConnection databaseConnection=new DatabaseConnection();

    }
}
