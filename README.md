# Миграционные скрипты и Kotlin ETL

Компоненты для миграции и управления БД, а также часть ETL-пайплайнов.

* **Вся база может быть поднята из Бэкапа и сырых данных при помощи скриптов**
* **Дополнительные ETL-пайплайны по сбору и парсингу данных температуры**

Данные температуры выгружались с портала [RP5](https://rp5.ru/), который дает бсеплатный доступ к глубоким историческим данным по погоде.

**Все локальные блоки могут быть переведены на "прод"-режим, что позволит автоматизировать работу сервиса полностью!**

## Описание технологий

| Поле | Значение | Комментарий |
| ---------------- | ----------- | -------------------------------------------|
| Язык программирования | Kotlin | |
| WEB-Framework | Spring Boot | [Документация](https://spring.io/projects/spring-boot) |
| ORM | Spring Data JPA | [Документация](https://spring.io/projects/spring-data-jpa) |
| Работа с CSV | OpenCSV | [Документация](http://opencsv.sourceforge.net/) |

## Описание решения

- [CsvWeatherCrawlerService](https://github.com/graphometrica/minenegro_backend/blob/main/src/main/kotlin/com/graphometrica/minenergo/backend/weather/service/CsvWeatherCrawlerService.kt)
  * Сервис который сканирует папку weather_csv, куда загружаются csv файлы с историческими данными о погоде, разбирает их, нормализует и складывает в базу (таблица с сырыми данными).
- [TemperatureService](https://github.com/graphometrica/minenegro_backend/blob/main/src/main/kotlin/com/graphometrica/minenergo/backend/weather/service/TemperatureService.kt)
  * Сервис берет данных из таблицы с погодой, считает среднечаовую температуру на каждый день в каждом из 75 регионов за последние 3 года и записывает эти данные в таблицу со среднечасовой температурой.
- [Pro3dCrawlerService](https://github.com/graphometrica/minenegro_backend/blob/main/src/main/kotlin/com/graphometrica/minenergo/backend/pro3d/service/Pro3dCrawlerService.kt)
  * Сервис сканирует папку pro_data, в которую загружены статистические данные с стайта 3dpro.info, разбирает их, нормализует, объединяет в энергитические зоны и записывает в таблицу.
