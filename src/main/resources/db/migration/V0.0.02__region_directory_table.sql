DROP TABLE IF EXISTS region_directory;

CREATE TABLE region_directory
(
    id INTEGER PRIMARY KEY GENERATED ALWAYS as identity,
    oes TEXT,
    name TEXT,
    subject_id INTEGER UNIQUE,
    power_system_id INTEGER
);

INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Северо-Запада', 'Архангельская область', 11, 840000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Северо-Запада', 'Калининградская область', 27, 840000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Северо-Запада', 'Ленинградская область', 41, 840000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Северо-Запада', 'Мурманская область', 47, 840000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Северо-Запада', 'Новгородская область', 49, 840000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Северо-Запада', 'Псковская область', 58, 840000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Северо-Запада', 'Республика Карелия', 86, 840000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Северо-Запада', 'Республика Коми', 87, 840000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Центра', 'Белгородская область', 14, 530000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Центра', 'Брянская область', 15, 530000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Центра', 'Владимирская область', 17, 530000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Центра', 'Вологодская область', 19, 530000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Центра', 'Воронежская область', 20, 530000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Центра', 'Ивановская область', 24, 530000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Центра', 'Калужская область', 29, 530000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Центра', 'Костромская область', 34, 530000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Центра', 'Курская область', 38, 530000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Центра', 'Липецкая область', 42, 530000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Центра', 'Московская область', 46, 530000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Центра', 'Орловская область', 54, 530000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Центра', 'Рязанская область', 61, 530000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Центра', 'Смоленская область', 66, 530000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Центра', 'Тамбовская область', 68, 530000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Центра', 'Тверская область', 28, 530000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Центра', 'Тульская область', 70, 530000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Центра', 'Ярославская область', 78, 530000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Средней Волги', 'Марий Эл', 88, 600000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Средней Волги', 'Мордовия', 89, 600000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Средней Волги', 'Нижегородская область', 22, 600000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Средней Волги', 'Пензенская область', 56, 600000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Средней Волги', 'Республика Татарстан (Татарстан)', 92, 600000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Средней Волги', 'Самарская область', 36, 600000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Средней Волги', 'Саратовская область', 63, 600000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Средней Волги', 'Ульяновская область', 73, 600000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Средней Волги', 'Чувашская Республика - Чувашия', 97, 600000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Юга', 'Астраханская область', 12, 550000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Юга', 'Волгоградская область', 18, 550000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Юга', 'Кабардино-Балкарская Республика', 83, 550000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Юга', 'Карачаево-Черкесская Республика', 91, 550000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Юга', 'Краснодарский край', 3, 550000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Юга', 'Республика Дагестан', 82, 550000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Юга', 'Республика Ингушетия', 26, 550000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Юга', 'Республика Калмыкия', 85, 550000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Юга', 'Республика Крым', 35, 550000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Юга', 'Республика Северная Осетия-Алания', 90, 550000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Юга', 'Ростовская область', 60, 550000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Юга', 'Ставропольский край', 7, 550000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Юга', 'Чеченская республика', 96, 550000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Урала', 'Кировская область', 33, 630000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Урала', 'Курганская область', 37, 630000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Урала', 'Оренбургская область', 53, 630000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Урала', 'Пермский край', 57, 630000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Урала', 'Республика Башкортостан', 80, 630000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Урала', 'Свердловская область', 65, 630000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Урала', 'Тюменская область', 71, 630000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Урала', 'Удмурдская Республика', 94, 630000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Урала', 'Челябинская область', 75, 630000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Сибири', 'Алтайский край', 1, 610000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Сибири', 'Забайкальский край', 76, 610000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Сибири', 'Иркутская область', 25, 610000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Сибири', 'Кемеровская область', 32, 610000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Сибири', 'Красноярский край', 4, 610000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Сибири', 'Новосибирская область', 50, 610000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Сибири', 'Омская область', 52, 610000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Сибири', 'Республика Бурятия', 81, 610000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Сибири', 'Республика Тыва', 93, 610000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Сибири', 'Республика Хакасия', 95, 610000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Сибири', 'Томская область', 69, 610000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Востока', 'Амурская область', 10, 540000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Востока', 'Еврейская автономная область', 99, 540000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Востока', 'Западный энергорайон Якутии', 100, 540000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Востока', 'ОЭР Хабаровского края', 8, 540000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Востока', 'Приморский край', 5, 540000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Востока', 'Центральный энергорайон Якутии', 101, 540000);
INSERT INTO minenergo_schema.region_directory (oes, name, subject_id, power_system_id) VALUES ('ОЭС Востока', 'Южно-Якутский энергорайон', 98, 540000);
