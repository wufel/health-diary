package com.wufel.health.diary.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "fart")
public class Fart extends BaseEntity {

    @Column(name = "timestamp")
    private Timestamp timestamp;
    @Column(name = "smelliness")
    private Smelliness smelliness;
    @Column(name = "loudness")
    private Loudness loudness;

    public Fart(Integer id, Timestamp timestamp, Smelliness smelliness, Loudness loudness) {
        super(id);
        this.timestamp = timestamp;
        this.smelliness = smelliness;
        this.loudness = loudness;
    }

    public Fart(FartBuilder builder) {
        super(builder.id);
        this.timestamp = builder.timestamp;
        this.smelliness = builder.smelliness;
        this.loudness = builder.loudness;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Smelliness getSmelliness() {
        return smelliness;
    }

    public void setSmelliness(Smelliness smelliness) {
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
        private Integer id;
        private Timestamp timestamp;
        private Smelliness smelliness;
        private Loudness loudness;

        public FartBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public FartBuilder setTimestamp(Timestamp timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public FartBuilder setSmelliness(Smelliness smelliness) {
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

}
