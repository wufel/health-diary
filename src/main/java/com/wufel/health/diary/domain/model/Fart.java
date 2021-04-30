package com.wufel.health.diary.domain.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.sql.Timestamp;

public class Fart {

    private Long id;
    private Timestamp timestamp;
    private com.wufel.fartDiary.domain.model.Smelliness smelliness;
    private Loudness loudness;

    public Fart(FartBuilder builder) {
        this.id = builder.id;
        this.timestamp = builder.timestamp;
        this.smelliness = builder.smelliness;
        this.loudness = builder.loudness;
    }

    private Fart(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public com.wufel.fartDiary.domain.model.Smelliness getSmelliness() {
        return smelliness;
    }

    public void setSmelliness(com.wufel.fartDiary.domain.model.Smelliness smelliness) {
        this.smelliness = smelliness;
    }

    public Loudness getLoudness() {
        return loudness;
    }

    public void setLoudness(Loudness loudness) {
        this.loudness = loudness;
    }

    public static FartBuilder newFartBuilder() {
        return new FartBuilder();
    }

    public static class FartBuilder {
        private Long id;
        private Timestamp timestamp;
        private com.wufel.fartDiary.domain.model.Smelliness smelliness;
        private Loudness loudness;

        public FartBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public FartBuilder setTimestamp(Timestamp timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public FartBuilder setSmelliness(com.wufel.fartDiary.domain.model.Smelliness smelliness) {
            this.smelliness = smelliness;
            return this;
        }

        public FartBuilder setLoudness(Loudness loudness) {
            this.loudness = loudness;
            return this;
        }

        public Fart build() {
            return new Fart(this);
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
