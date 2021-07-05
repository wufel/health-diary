package com.wufel.health.diary.infrastructure.dao;

public class MariaDbQueryConstants {
    public static final String GET_ALL_FARTS = "SELECT * FROM fart order by timestamp desc";
    public static final String GET_FART_BY_ID = "SELECT * FROM fart where id = ?";
    public static final String INSERT_FART = "INSERT INTO fart(TIMESTAMP, SMELLINESS, LOUDNESS) VALUES (?, ?, ?)";
    public static final String DELETE_FART_BY_ID = "DELETE FROM fart where id = ?";
}
