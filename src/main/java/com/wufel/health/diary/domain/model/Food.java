package com.wufel.health.diary.domain.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.sql.Timestamp;

public class Food {

    private Long id;
    private Timestamp timestamp;
    private String foodName;
    private Meal meal;

    public Food(FoodBuilder builder) {
        this.id = builder.id;
        this.timestamp = builder.timestamp;
        this.foodName = builder.foodName;
        this.meal = builder.meal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public FoodBuilder newFoodBuilder() {
        return new FoodBuilder();
    }

    public static class FoodBuilder {
        private Long id;
        private Timestamp timestamp;
        private String foodName;
        private Meal meal;

        public FoodBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public FoodBuilder setTimestamp(Timestamp timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public FoodBuilder setFoodName(String foodName) {
            this.foodName = foodName;
            return this;
        }

        public FoodBuilder setMeal(Meal meal) {
            this.meal = meal;
            return this;
        }

        public Food build() {
            return new Food(this);
        }
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
