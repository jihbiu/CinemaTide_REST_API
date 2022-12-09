package com.example.cinema_tide.movie;

import com.example.cinema_tide.MovieHall.MovieHall;
import com.example.cinema_tide.MovieHall.MovieHallRepository;
import com.example.cinema_tide.Screening.Screening;
import com.example.cinema_tide.Screening.ScreeningRepository;
import com.example.cinema_tide.Seat.SeatRepository;
import com.example.cinema_tide.reservation.ReservationRepository;
import com.example.cinema_tide.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class MovieConfig {

    @Bean
    CommandLineRunner commandLineRunnerMovie(
            MovieRepository movieRepository,
            MovieHallRepository movieHallRepository,
            ScreeningRepository screeningRepository,
            SeatRepository seatRepository,
            UserRepository userRepository,
            ReservationRepository reservationRepository){
        return args -> {
            Movie movie1 = new Movie(
                  "Sing 2",
                  "Animacja, Komedia, Musical",
                  "10-03-2022",
                  "Aby wystąpić w teatrze Crystal, Buster Moon i jego ekipa muszą odnaleźć i przekonać legendę rocka do powrotu na scenę.",
                  110,
                  "Dubbing",
                  "sing-2.jpg"
            );
            Movie movie2 = new Movie(
                    "Morbius",
                    "Akcja, Sci-fi",
                    "01-04.2022",
                    "Biochemik Michael Morbius, próbując wyleczyć się z rzadkiej choroby krwi, niechcący zaraża się pewnym rodzajem wampiryzmu.",
                    108,
                    "Dubbing / Napisy",
                    "morbius.jpg"
            );
            Movie movie3 = new Movie(
                    "Spider-Man: Bez drogi do domu",
                    "Akcja, Sci-fi",
                    "15-12-2021",
                    "Kiedy cały świat dowiaduje się, że pod maską Spider Mana skrywa się Peter Parker, superbohater decyduje się zwrócić o pomoc do Doktora Strange'a.",
                    130,
                    "Dubbing / Napisy",
                    "spider-man-bez-drogi-do-domu.jpg"
            );
            Movie movie4 = new Movie(
                    "Fantastyczne zwierzęta: tajemnice Dumbledore'a",
                    "Fantasy, Przygodowy",
                    "07-04-2022",
                    "Grindelwald wraz ze swoją armią dąży do przejęcia władzy na świecie. Dumbledore i Newt z pomocą przyjaciół chcą temu zapobiec.",
                    130,
                    "Napisy",
                    "fantastyczne-zwierz-tajemnice-dumbledorea.jpg"
            );
            Movie movie5 = new Movie(
                    "Harry Potter i Insygnia Śmierci 2",
                    "Fantasy, Przygodowy",
                    "07-07-2011",
                    "Młody czarodziej musi zniszczyć wszystkie horkruksy, aby ostatecznie pokonać Voldemorta.",
                    120,
                    "Dubbing",
                    "harry-potter-ins-smierci-2.jpg"
            );
            Movie movie6 = new Movie(
                    "Top Gun: Maverick",
                    "Akcja, Przygodowy",
                    "07-07-2022",
                    "Po ponad 20 latach służby w lotnictwie marynarki wojennej, Pete 'Maverick Mitchell zostaje wezwany do legendarnej szkoły Top Gun. Ma wyszkolić nowe pokolenie pilotów do niezwykle trudnej misji.",
                    131,
                    "Dubbing, napisy",
                    "top-gun-maverick.jpg"
            );
            Movie movie7 = new Movie(
                    "Jujutsu Kaisen: 0",
                    "Fantasy, Akcja, Animacja",
                    "24-12-2021",
                    "Jako dziecko Rika Orimoto ginie w wypadku drogowym na oczach bliskiego przyjaciela Yuty Okkotsu. „To obietnica. Gdy dorośniemy, pobierzemy się”. Rika staje się zjawą, a Okkotsu, cierpiąc z powodu jej klątwy, pragnie własnej śmierci.",
                    105,
                    "Napisy",
                    "jujutsu-kaisen-0.jpg"
            );
            Movie movie8 = new Movie(
                    "Trzy Piętra",
                    "Dramat, Komedia",
                    "06-05-2022",
                    "Nanni Moretti przeplata trzy historie - jedną o zagubieniu i tęsknocie matki wychowującej samotnie córkę; drugą o obsesji podejrzeń i wybaczeniu, której bohaterem",
                    119,
                    "Napisy",
                    "trzy-pietra.jpg"
            );
            Movie movie9 = new Movie(
                    "Doktor Strange: Multiversum oblędu",
                    "Fantasy, Przygodowy",
                    "06-05-2022",
                    "o wydarzeniach z 'Avengers: Koniec gry' dr Stephen Strange kontynuuje walkę ze złem. Tym razem stawi czoło swojemu byłemu przyjacielowi Mordo.",
                    126,
                    "Dubbing",
                    "doktor-strange-multiversum-obledu.jpg"
            );
            Movie movie10 = new Movie(
                    "Buzz Astral: lightyear",
                    "Animacja, Przygodowy",
                    "17-06-2022",
                    "Młody pilot testowy zostaje bohaterem w kosmosie i dzięki temu dostaje swoją własną zabawkę - Buzza.",
                    105,
                    "Dubbing",
                    "buzz-astral-lightyear.jpg"
            );
            Movie movie12 = new Movie(
                    "Mała-Mama",
                    "Dramat",
                    "20-05-2022",
                    "Czy potrafilibyśmy zaprzyjaźnić się ze swoim rodzicem, gdyby nasze wspólne drogi przecięły się w czasie, kiedy oboje byliśmy dziećmi?",
                    114,
                    "Napisy, dubbing",
                    "mala-mama.jpg"
            );
            Movie movie13 = new Movie(
                    "Chiara",
                    "Dramat",
                    "27-05-2022",
                    "Chwile szczęścia i beztroskiej zabawy nie trwają długo: ojciec znika w tajemniczych okolicznościach. Silnie związana z nim Chiara nie zamierza spocząć, dopóki nie dowie się, co za tym stoi.",
                    121,
                    "Napisy",
                    "chiara.jpg"
            );
            Movie movie14 = new Movie(
                    "Pan Wilk i spółka. Bad Guys",
                    "Animacja, Komedia",
                    "27-05-2022",
                    "Panowie Wilk, Wąż, Pirania, Rekin oraz Tarantula postanawiają zakończyć swoją kryminalną aktywność i przewartościować swoje życie. ",
                    100,
                    "Dubbing",
                    "pan-wilk-i-spolka.jpg"
            );
            Movie movie15 = new Movie(
                    "Wszystko Wszędzie Naraz",
                    "Sci-Fi",
                    "15-04-2022",
                    "Borykająca się z trudami codzienności kobieta w średnim wieku zostaje wciągnięta w szaloną przygodę, w której sama może uratować świat, eksplorując inne wszechświaty",
                    140,
                    "Napisy, dubbing",
                    "wszystko-wszedzie-naraz.jpg"
            );
            Movie movie16 = new Movie(
                    "Infinite Storm",
                    "Dramat, Thriller",
                    "27-05-2022",
                    "Kobieta wybiera się na samotną wspinaczkę na Górę Waszyngtona. Gdy gwałtownie załamuje się pogoda odnajduje ślady sportowych butów na śniegu, zaczyna więc poszukiwania nieprzygotowanego turysty.",
                    98,
                    "Napisy",
                    "Infinite-Storm.jpg"
            );
            Movie movie17 = new Movie(
                    "Foki kontra Rekiny",
                    "Animacja",
                    "03-06-2022",
                    "Gdy jej najlepszy przyjaciel ginie w ataku rekinów, foka Quinn zbiera 'Team Seal', aby walczyć z gangiem rekinów, który opanował okolicę. Drużyna nie będąc przygotowana do takiej misji prosi wojownika Claggarta, aby ich przeszkolił.",
                    100,
                    "Dubbing",
                    "foki-kontra-rekiny.jpg"
            );
            Movie movie18 = new Movie(
                    "Duch Sniegów",
                    "Dokumentalny",
                    "13-07-2021",
                    "Kojąca wędrówka po magicznym królestwie, którego największych tajemnic strzeże prawdziwa bogini – majestatyczna i nieuchwytna pantera śnieżna.",
                    92,
                    "Napisy",
                    "duch-sniegow.jpg"
            );
            movieRepository.saveAll(
                    List.of(
                            movie1,
                            movie2,
                            movie3,
                            movie4,
                            movie5,
                            movie6,
                            movie7,
                            movie8,
                            movie9,
                            movie10,
                            movie12,
                            movie13,
                            movie14,
                            movie15,
                            movie16,
                            movie17,
                            movie18
                    ));

            MovieHall movieHall1 = new MovieHall(
                    10,
                    15
            );

            MovieHall movieHall2 = new MovieHall(
                    10,
                    10
            );
            movieHallRepository.saveAll(
                    List.of(movieHall1, movieHall2)
            );


            Screening screening1 = new Screening(
                    movieRepository.getById(1),
                    movieHallRepository.getById(1),
                    "13.06.2022, 10:00"
            );
            Screening screening2 = new Screening(
                    movieRepository.getById(1),
                    movieHallRepository.getById(1),
                    "15.06.2022, 10:00"
            );
            Screening screening3 = new Screening(
                    movieRepository.getById(1),
                    movieHallRepository.getById(2),
                    "15.06.2022, 15:30"
            );
            Screening screening4 = new Screening(
                    movieRepository.getById(1),
                    movieHallRepository.getById(1),
                    "17.06.2022, 10:00"
            );
            Screening screening5 = new Screening(
                    movieRepository.getById(1),
                    movieHallRepository.getById(1),
                    "18.06.2022, 14:00"
            );

            //Morbius Screening
            Screening screening6 = new Screening(
                    movieRepository.getById(2),
                    movieHallRepository.getById(1),
                    "13.06.2022, 12:30"
            );
            Screening screening7 = new Screening(
                    movieRepository.getById(2),
                    movieHallRepository.getById(1),
                    "14.06.2022, 15:00"
            );
            Screening screening8 = new Screening(
                    movieRepository.getById(2),
                    movieHallRepository.getById(2),
                    "17.06.2022, 11:00"
            );

            //Spider man Screening
            Screening screening9 = new Screening(
                    movieRepository.getById(3),
                    movieHallRepository.getById(2),
                    "13.06.2022, 13:00"
            );
            Screening screening10 = new Screening(
                    movieRepository.getById(3),
                    movieHallRepository.getById(2),
                    "14.06.2022, 15:00"
            );
            Screening screening11 = new Screening(
                    movieRepository.getById(3),
                    movieHallRepository.getById(1),
                    "17.06.2022, 16:30"
            );

            //Fantastyczne zwierzeta
            Screening screening12 = new Screening(
                    movieRepository.getById(4),
                    movieHallRepository.getById(2),
                    "13.06.2022, 18:00"
            );
            Screening screening13 = new Screening(
                    movieRepository.getById(4),
                    movieHallRepository.getById(2),
                    "17.06.2022, 18:00"
            );
            Screening screening14 = new Screening(
                    movieRepository.getById(4),
                    movieHallRepository.getById(1),
                    "19.06.2022, 14:00"
            );

            //Harry Potter
            Screening screening15 = new Screening(
                    movieRepository.getById(5),
                    movieHallRepository.getById(1),
                    "19.06.2022, 17:00"
            );

            //Top gun maverick
            Screening screening16 = new Screening(
                    movieRepository.getById(6),
                    movieHallRepository.getById(1),
                    "13.06.2022, 20:00"
            );
            Screening screening17 = new Screening(
                    movieRepository.getById(6),
                    movieHallRepository.getById(1),
                    "17.06.2022, 19:00"
            );

            //Jujutsu Kaisen
            Screening screening18 = new Screening(
                    movieRepository.getById(7),
                    movieHallRepository.getById(1),
                    "20.06.2022, 20:00"
            );
            Screening screening19 = new Screening(
                    movieRepository.getById(7),
                    movieHallRepository.getById(1),
                    "24.06.2022, 19:00"
            );
            Screening screening20 = new Screening(
                    movieRepository.getById(7),
                    movieHallRepository.getById(1),
                    "26.06.2022, 17:00"
            );

            //Trzy pietra
            Screening screening21 = new Screening(
                    movieRepository.getById(8),
                    movieHallRepository.getById(1),
                    "20.06.2022, 10:00"
            );
            Screening screening22 = new Screening(
                    movieRepository.getById(8),
                    movieHallRepository.getById(2),
                    "22.06.2022, 15:30"
            );

            //Doktor strange
            Screening screening23 = new Screening(
                    movieRepository.getById(9),
                    movieHallRepository.getById(1),
                    "14.06.2022, 17:30"
            );
            Screening screening24 = new Screening(
                    movieRepository.getById(9),
                    movieHallRepository.getById(1),
                    "18.06.2022, 18:00"
            );

            screeningRepository.saveAll(
                    List.of(screening1,
                            screening2,
                            screening3,
                            screening4,
                            screening5,
                            screening6,
                            screening7,
                            screening8,
                            screening9,
                            screening10,
                            screening11,
                            screening12,
                            screening13,
                            screening14,
                            screening15,
                            screening16,
                            screening17,
                            screening18,
                            screening19,
                            screening20,
                            screening21,
                            screening22,
                            screening23,
                            screening24
                    ));
        };
    }
}
