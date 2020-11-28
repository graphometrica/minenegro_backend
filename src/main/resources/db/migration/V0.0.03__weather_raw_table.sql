DROP TABLE IF EXISTS weather_raw;

CREATE TABLE weather_raw
(
    id INTEGER PRIMARY KEY GENERATED ALWAYS as identity,
    subject_id int,
    timestamp TIMESTAMP,
    temp DOUBLE PRECISION
);