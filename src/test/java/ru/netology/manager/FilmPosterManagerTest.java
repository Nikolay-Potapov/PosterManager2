package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmPosterManagerTest {
    FilmPosterManager manager = new FilmPosterManager(10);

    @Test
    void PosterEmpty() {

        FilmPoster[] actual = manager.getLastFilms();
        FilmPoster[] expected = new FilmPoster[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAdd() {
        FilmPoster movie01 = new FilmPoster(391772, "https://www.kinopoisk.ru/film/391772/", "Всегда говори «ДА»", "Комедия");
        FilmPoster movie02 = new FilmPoster(361, "https://www.kinopoisk.ru/film/361/", "Бойцовский клуб", "Триллер");
        FilmPoster movie03 = new FilmPoster(1188529, "https://www.kinopoisk.ru/film/1188529/", "Достать ножи", "Детектив");

        manager.add(movie01);
        manager.add(movie02);
        manager.add(movie03);

        FilmPoster[] actual = manager.getLastFilms();
        FilmPoster[] expected = new FilmPoster[]{movie03, movie02, movie01};

        assertArrayEquals(expected, actual);
    }

    @Test
    void FilmManagerAddTest() {
        FilmPoster movie01 = new FilmPoster(43425, "https://www.kinopoisk.ru/film/43425/", "Шерлок", "Детектив");
        FilmPoster movie02 = new FilmPoster(23423, "https://www.kinopoisk.ru/film/23423/", "Остров проклятых", "Триллер");
        FilmPoster movie03 = new FilmPoster(45654, "https://www.kinopoisk.ru/film/45654/", "Мы — Миллеры", "Комедия");
        FilmPoster movie04 = new FilmPoster(34545, "https://www.kinopoisk.ru/film/34545/", "Черное зеркало", "Финтастика");
        FilmPoster movie05 = new FilmPoster(34634, "https://www.kinopoisk.ru/film/34634/", "Ветреная река", "Детектив");
        FilmPoster movie06 = new FilmPoster(3434, "https://www.kinopoisk.ru/film/3434/", "Третий лишний", "Комедия");
        FilmPoster movie07 = new FilmPoster(34534, "https://www.kinopoisk.ru/film/34534/", "Отступники ", "Триллер");
        FilmPoster movie08 = new FilmPoster(35345, "https://www.kinopoisk.ru/film/35345/", "Невероятная жизнь Уолтера Митти", "Комедия");
        FilmPoster movie09 = new FilmPoster(567, "https://www.kinopoisk.ru/film/567/", "Дорога", "Постапокалипсис");
        FilmPoster movie10 = new FilmPoster(654, "https://www.kinopoisk.ru/film/654/", "Воздушный маршал", "Детектив");
        FilmPoster movie11 = new FilmPoster(5667, "https://www.kinopoisk.ru/series/5667/", "Черное зеркало", "Финтастика");
        FilmPoster movie12 = new FilmPoster(435346, "https://www.kinopoisk.ru/film/435346/", "Гнев человеческий ", "боевик");

        manager.add(movie01);
        manager.add(movie02);
        manager.add(movie03);
        manager.add(movie04);
        manager.add(movie05);
        manager.add(movie06);
        manager.add(movie07);
        manager.add(movie08);
        manager.add(movie09);
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);

        FilmPoster[] actual = manager.getLastFilms();
        FilmPoster[] expected = new FilmPoster[]{
                movie12, movie11, movie10, movie09,
                movie08, movie07, movie06, movie05,
                movie04, movie03, movie02, movie01
        };

        assertArrayEquals(expected, actual);

    }
}