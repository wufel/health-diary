DROP TABLE IF EXISTS health_diary.fart;
DROP TABLE IF EXISTS health_diary.food;
CREATE TABLE
    health_diary.fart(
        id BIGINT NOT NULL AUTO_INCREMENT,
        timestamp TIMESTAMP NOT NULL,
        smelliness VARCHAR(50),
        loudness VARCHAR(50),
        PRIMARY KEY (id)
    );

CREATE TABLE
    health_diary.food
    (
        id BIGINT NOT NULL AUTO_INCREMENT,
        timestamp TIMESTAMP NOT NULL,
        food_name VARCHAR(50),
        meal VARCHAR(50),
        PRIMARY KEY(id)
    );

CREATE TABLE
    health_diary.hibernate_sequence
    (
        next_val BIGINT
    );

CREATE TABLE
    health_diary.food_sequence
    (
        next_val BIGINT
    );
