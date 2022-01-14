/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author zepeda
 */
public class Conexion {

    public DriverManagerDataSource Conectar(){
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        datasource.setUrl("jdbc:sqlserver://LAPTOP-DEIFNHU5\\SQLEXPRESS:1433;databaseName=hibernate;");
        datasource.setUsername("sa");
        datasource.setPassword("1234");
        return datasource;
    }
    
}
