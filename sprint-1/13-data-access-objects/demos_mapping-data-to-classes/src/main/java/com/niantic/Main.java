package com.niantic;

import org.apache.commons.dbcp2.BasicDataSource;

public class Main
{
    public static void main(String[] args)
    {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername("root");
        dataSource.setPassword("P@ssw0rd");

   //execute SQL statements

        var jdbcTemplate = new JdbcTemplate(dataSource);

        String sql = """
                SELECT actor_id,
                first_name,
                last_name
                
                FROM actor;
                """;
        va




    }
}