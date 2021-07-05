package com.wufel.health.diary.domain.dao;

import com.wufel.health.diary.domain.model.Fart;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface FartRepository {

    @Transactional(readOnly = true)
    List<Fart> getAllFarts();

    @Transactional(readOnly = true)
    Fart getFart(Integer id);

    void saveFart(Fart fart);

    void deleteFart(Integer id);
}
