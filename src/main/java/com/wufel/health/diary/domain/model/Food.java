package com.wufel.health.diary.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "food")
public class Food extends BaseEntity {

    @Column(name = "timestamp")
    private Timestamp timestamp;
    @Column(name = "foodName")
    private String foodName;
    @Column(name = "meal")
    private Meal meal;

    public Food(Integer id) {
        super(id);
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }
}
