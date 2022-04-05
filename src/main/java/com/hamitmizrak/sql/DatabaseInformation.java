package com.hamitmizrak.sql;

import lombok.Getter;
import lombok.Setter;
//Dikkat: user veya password hatalı ==> Access denied for user 'root44'@'localhost' (using password: YES)

@Getter
@Setter
 abstract public class DatabaseInformation {

    //for database connection
    private String url;
    private String userName;
    private String userPassword;

    //for mysql Driver class
    private String forNameData;

    //parametresiz constructor
    public DatabaseInformation() {
        //Mysql
        //this.url="jdbc:mysql://localhost:3306/techcareer_springboot_1";
        //this.userName="root";
        //this.userPassword="root";
        //this.forNameData="com.mysql.jdbc.Driver";
        //this.forNameData="com.mysql.cj.jdbc.Driver";

        //Postgresql
        //this.url="jdbc:postgresql://localhost:5432/techcareer_springboot_1";
        //this.userName="root";
        //this.userPassword="root";
        //this.forNameData="org.postgresql.Driver";

        //H2Db
        //http://localhost:8080/h2-console
        this.url="jdbc:h2:file:./memory_persist/denemedb";
        this.userName="root";
        this.userPassword="";
        this.forNameData="org.h2.Driver";

    }
}
