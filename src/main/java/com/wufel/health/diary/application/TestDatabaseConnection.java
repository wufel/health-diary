package com.wufel.health.diary.application;

import com.wufel.health.diary.domain.model.Fart;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

//import static com.wufel.health.diary.infrastructure.dao.FartModelRowMappers.fartRowMapper;

public class TestDatabaseConnection {

    public static void main(String[] args) throws SQLException {

        String host = "jdbc:mariadb://demo.cqfx2rvokss6.eu-west-2.rds.amazonaws.com:3306";
        String user = "admin";
        String password = "admin123";
        DriverManager.getConnection(host, user, password);
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
        dataSource.setUrl(host);
        dataSource.setUsername(user);
        dataSource.setPassword(password);

        System.out.println("executing query");
        JdbcTemplate template = new JdbcTemplate(dataSource);
        String sql = "SELECT * FROM health_diary.fart";

//        List<Fart> result = template.query(sql, fartRowMapper);
//        result.forEach(System.out::println);
//        System.out.println("done");
    }
}
