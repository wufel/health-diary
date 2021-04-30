package com.wufel.health.diary.application.config.rest;

import com.wufel.health.diary.domain.dao.HealthDiaryDao;
import com.wufel.health.diary.domain.model.Fart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fart")
public class FartController {
    @Autowired
    private HealthDiaryDao healthDiaryDao;

    @GetMapping("/all")
    public List<Fart> listAllFarts() {
        List<Fart> allFarts = healthDiaryDao.getAllFarts();
        System.out.println(allFarts);
        return allFarts;
    }

    @PostMapping
    public void create(@RequestBody Fart fart) {
        healthDiaryDao.insertFart(fart);
    }

    @GetMapping("/{id}")
    public Fart get(@PathVariable("id") Long id) {
        Fart fart = healthDiaryDao.getFart(id);
        System.out.println(fart);
        return fart;
    }
}
