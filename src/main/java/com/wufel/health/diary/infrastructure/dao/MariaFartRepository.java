package com.wufel.health.diary.infrastructure.dao;

import com.wufel.health.diary.domain.dao.FartRepository;
import com.wufel.health.diary.domain.model.Fart;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.wufel.health.diary.infrastructure.dao.FartModelRowMappers.fartRowMapper;
import static com.wufel.health.diary.infrastructure.dao.MariaDbQueryConstants.*;


public class MariaFartRepository implements FartRepository {

    private final JdbcTemplate jdbcTemplate;

    public MariaFartRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Fart> getAllFarts() {
        return jdbcTemplate.query(GET_ALL_FARTS, fartRowMapper);
    }

    @Override
    public void saveFart(Fart fart) {
        System.out.println(fart);
        jdbcTemplate.update(INSERT_FART, ps -> {
            ps.setTimestamp(1, fart.getTimestamp());
            ps.setString(2, fart.getSmelliness().toString());
            ps.setString(3, fart.getLoudness().toString());
        });
    }

    @Override
    public Fart getFart(Integer id) {
        return DataAccessUtils.singleResult(jdbcTemplate.query(GET_FART_BY_ID, ps -> ps.setInt(1, id), fartRowMapper));
    }

    @Override
    public void deleteFart(Integer id) {
        jdbcTemplate.update(DELETE_FART_BY_ID, ps -> ps.setInt(1, id));
    }
}
