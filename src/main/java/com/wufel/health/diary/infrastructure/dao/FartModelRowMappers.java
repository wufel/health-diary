package com.wufel.health.diary.infrastructure.dao;

import com.wufel.health.diary.domain.model.Fart;
import com.wufel.health.diary.domain.model.Loudness;
import com.wufel.health.diary.domain.model.Smelliness;
import org.springframework.jdbc.core.RowMapper;

public class FartModelRowMappers {
    public static RowMapper<Fart> fartRowMapper = (rs, rowNum) -> Fart.newFartBuilder()
            .setId(rs.getInt("ID"))
            .setTimestamp(rs.getTimestamp("TIMESTAMP"))
            .setLoudness(Loudness.valueOf(rs.getString("LOUDNESS")))
            .setSmelliness(Smelliness.valueOf(rs.getString("SMELLINESS")))
            .build();
}
