package com.wufel.health.diary.application.config.rest;

import com.wufel.health.diary.domain.dao.FartRepository;
import com.wufel.health.diary.domain.model.Fart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fart")
@CrossOrigin
public class FartController {

    @Autowired
    private FartRepository fartRepository;

    @GetMapping("/all")
    public List<Fart> listAllFarts() {
        List<Fart> allFarts = fartRepository.getAllFarts();
        System.out.println(allFarts);
        return allFarts;
    }

    @PostMapping
    public void create(@RequestBody Fart fart) {
        fartRepository.saveFart(fart);
    }

    @GetMapping("/{id}")
    public Fart get(@PathVariable("id") Integer id) {
        Fart fart = fartRepository.getFart(id);
        System.out.println(fart);
        return fart;
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        System.out.println("deleting fart id=" + id);
        fartRepository.deleteFart(id);
    }
}
