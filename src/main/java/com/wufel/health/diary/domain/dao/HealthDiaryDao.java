package com.wufel.health.diary.domain.dao;

import com.wufel.health.diary.domain.model.Fart;

import java.util.List;

public interface HealthDiaryDao {
    List<Fart> getAllFarts();
    void insertFart(Fart fart);
    Fart getFart(Long id);
}
