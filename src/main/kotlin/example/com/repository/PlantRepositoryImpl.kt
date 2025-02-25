import example.com.models.ApiResponse
import example.com.models.Plant
import example.com.repository.PlantRepository

class PlantRepositoryImpl: PlantRepository {




    override val page1: List<Plant> = listOf(
        Plant(
            id = 1,
            type = "Monstera",
            image = "/images/monstera.png",
            description = "Monstera to tropikalna roślina o dużych, dekoracyjnych liściach z charakterystycznymi dziurami, które dodają jej egzotycznego uroku. Występuje naturalnie w lasach Ameryki Środkowej, gdzie rośnie w wilgotnych, cienistych warunkach. Szybko rośnie, dobrze znosi cień i jest łatwa w pielęgnacji, co czyni ją popularnym wyborem do wnętrz.",
            maintenance = "Łatwa",
            sunlight = "Umiarkowane",
            humidity = "Wysoka",
            wateringDays = "Co 7 dni",
            temperatureRange = Pair(18, 27),
            repot = "Co 2 lata",
            fertilizer = "Raz w miesiącu",
            height = 2.5,
            width = 1.5,
            inHouse = "Dom",
            isSeasonal = false
        ),
        Plant(
            id = 2,
            type = "Fikus",
            image = "/images/fikus.png",
            description = "Fikus to elegancka roślina o ciemnozielonych, błyszczących liściach, które dodają wnętrzom klasy i świeżości. Pochodzi z tropikalnych rejonów Azji Południowo-Wschodniej, gdzie jest symbolem długowieczności i dobrobytu. Wymaga umiarkowanego podlewania i preferuje jasne, ale nie bezpośrednie światło.",
            maintenance = "Średnia",
            sunlight = "Umiarkowane",
            humidity = "Średnia",
            wateringDays = "Co 10 dni",
            temperatureRange = Pair(15, 25),
            repot = "Co 3 lata",
            fertilizer = "Dwa razy rocznie",
            height = 3.0,
            width = 1.2,
            inHouse = "Dom",
            isSeasonal = false
        ),
        Plant(
            id = 3,
            type = "Sansewieria",
            image = "/images/Sansewieria.png",
            description = "Sansewieria, znana jako \"język teściowej\", to niezwykle wytrzymała roślina, odporna na trudne warunki, w tym suche powietrze i słabe światło. Naturalnie występuje w Afryce Zachodniej, gdzie radzi sobie w surowym klimacie. Jest ceniona za zdolność oczyszczania powietrza z toksyn i prostotę w uprawie.",
            maintenance = "Łatwa",
            sunlight = "Częściowe",
            humidity = "Niska",
            wateringDays = "Co 14 dni",
            temperatureRange = Pair(15, 29),
            repot = "Co 5 lat",
            fertilizer = "Raz rocznie",
            height = 0.9,
            width = 0.3,
            inHouse = "Dom",
            isSeasonal = false
        )
    )
    override val page2: List<Plant> = listOf(
        Plant(
            id = 4,
            type = "Aloes",
            image = "/images/aloes.png",
            description = "Aloes to sukulent o mięsistych, soczystych liściach, które magazynują wodę, co czyni go idealnym do suchych warunków. Rośnie dziko na Półwyspie Arabskim i jest znany z właściwości leczniczych, zwłaszcza w pielęgnacji skóry. Łatwy w uprawie, doskonale sprawdza się w domach i ogrodach.",
            maintenance = "Łatwa",
            sunlight = "Pełne",
            humidity = "Niska",
            wateringDays = "Co 21 dni",
            temperatureRange = Pair(13, 26),
            repot = "Co 2 lata",
            fertilizer = "Raz w sezonie",
            height = 0.5,
            width = 0.5,
            inHouse = "Dom i ogród",
            isSeasonal = false
        ),
        Plant(
            id = 5,
            type = "Pilea",
            image = "/images/pilea.png",
            description = "Pilea, znana jako \"pieniążek\", wyróżnia się okrągłymi, soczysto-zielonymi liśćmi, które przypominają monety. Pochodzi z Chin, gdzie symbolizuje dobrobyt. Jest łatwa w uprawie i rozmnażaniu, co czyni ją doskonałym wyborem dla początkujących miłośników roślin. Świetnie pasuje do małych wnętrz.",
            maintenance = "Łatwa",
            sunlight = "Średnie",
            humidity = "Średnia",
            wateringDays = "Co 7 dni",
            temperatureRange = Pair(18, 25),
            repot = "Co rok",
            fertilizer = "Dwa razy rocznie",
            height = 0.3,
            width = 0.3,
            inHouse = "Dom",
            isSeasonal = false
        ),
        Plant(
            id = 6,
            type = "Kaktus",
            image = "/images/kaktus.png",
            description = "Kaktus to wyjątkowy sukulent, którego kolczasta struktura pomaga przetrwać w ekstremalnych warunkach pustynnych. Występuje w Ameryce, gdzie magazynuje wodę w mięsistych liściach. Jest idealny dla osób, które szukają rośliny niewymagającej częstego podlewania i cenią minimalistyczną estetykę.",
            maintenance = "Bardzo łatwa",
            sunlight = "Pełne",
            humidity = "Niska",
            wateringDays = "Co 30 dni",
            temperatureRange = Pair(10, 35),
            repot = "Co 3 lata",
            fertilizer = "Raz w sezonie",
            height = 0.4,
            width = 0.2,
            inHouse = "Dom i ogród",
            isSeasonal = false
        )
    )
    override val page3: List<Plant> = listOf(
        Plant(
            id = 7,
            type = "Skrzydłokwiat",
            image = "/images/skrzydłokwiat.png",
            description = "Skrzydłokwiat to subtelna roślina o eleganckich, białych kwiatach i ciemnozielonych liściach, które tworzą harmonijną kompozycję. Naturalnie rośnie w tropikalnych lasach Ameryki Południowej. Jest ceniony za zdolność oczyszczania powietrza z toksyn, co czyni go idealnym wyborem do domów i biur.",
            maintenance = "Średnia",
            sunlight = "Umiarkowane",
            humidity = "Wysoka",
            wateringDays = "Co 5 dni",
            temperatureRange = Pair(16, 24),
            repot = "Co 2 lata",
            fertilizer = "Raz w miesiącu",
            height = 0.7,
            width = 0.5,
            inHouse = "Dom",
            isSeasonal = false
        ),
        Plant(
            id = 8,
            type = "Paprotka",
            image = "/images/paprotka.png",
            description = "Paprotka to klasyczna roślina domowa o drobnych, pierzastych liściach, które dodają wnętrzom lekkości i świeżości. Naturalnie występuje w wilgotnych lasach tropikalnych, gdzie preferuje wysoką wilgotność powietrza. Jest idealna do łazienek i miejsc z rozproszonym światłem.",
            maintenance = "Trudna",
            sunlight = "Częściowe",
            humidity = "Wysoka",
            wateringDays = "Co 3 dni",
            temperatureRange = Pair(15, 23),
            repot = "Co 2 lata",
            fertilizer = "Dwa razy w roku",
            height = 0.6,
            width = 0.6,
            inHouse = "Dom",
            isSeasonal = false
        ),
        Plant(
            id = 9,
            type = "Kroton",
            image = "/images/kroton.png",
            description = "Kroton to roślina o niezwykle intensywnie kolorowych liściach, które mogą przybierać odcienie żółci, czerwieni i zieleni. Pochodzi z Malezji i Indonezji, gdzie rośnie w wilgotnym, ciepłym klimacie. Wymaga dużej wilgotności i jasnego światła, co podkreśla jej piękne barwy.",
            maintenance = "Średnia",
            sunlight = "Jasne",
            humidity = "Wysoka",
            wateringDays = "Co 7 dni",
            temperatureRange = Pair(18, 27),
            repot = "Co rok",
            fertilizer = "Raz w miesiącu",
            height = 1.0,
            width = 0.8,
            inHouse = "Dom",
            isSeasonal = false
        )
    )
    override val page4: List<Plant> = listOf(
        Plant(
            id = 10,
            type = "Aglaonema",
            image = "/images/aglaonema.png",
            description = "Aglaonema to dekoracyjna roślina o kolorowych liściach, które mogą mieć srebrzyste, różowe lub czerwone akcenty. Naturalnie występuje w tropikalnych rejonach Azji. Dobrze rośnie w cieniu, wymaga umiarkowanego podlewania i jest odporna na błędy w pielęgnacji, co czyni ją idealną dla początkujących.",
            maintenance = "Łatwa",
            sunlight = "Słabe",
            humidity = "Średnia",
            wateringDays = "Co 10 dni",
            temperatureRange = Pair(15, 26),
            repot = "Co 2 lata",
            fertilizer = "Co 2 miesiące",
            height = 1.2,
            width = 0.6,
            inHouse = "Dom",
            isSeasonal = false
        ),
        Plant(
            id = 11,
            type = "Begonia",
            image = "/images/begonia.png",
            description = "Begonia to ozdobna roślina, która zachwyca zarówno efektownymi liśćmi, jak i kolorowymi kwiatami. Pochodzi z tropikalnych regionów Ameryki i kwitnie przez długi okres, dodając wnętrzom uroku. Wymaga umiarkowanego podlewania i jasnego, rozproszonego światła.",
            maintenance = "Średnia",
            sunlight = "Umiarkowane",
            humidity = "Średnia",
            wateringDays = "Co 5 dni",
            temperatureRange = Pair(15, 24),
            repot = "Co 2 lata",
            fertilizer = "Co 2 tygodnie",
            height = 0.4,
            width = 0.2,
            inHouse = "Dom",
            isSeasonal = true
        ),
        Plant(
            id = 12,
            type = "Orchidea",
            image = "/images/orchidea.png",
            description = "Orchidee to jedne z najbardziej eleganckich i luksusowych kwiatów, symbolizujące piękno i wdzięk. Naturalnie występują w tropikalnych lasach Azji, gdzie rosną na drzewach. Wymagają specyficznej opieki, w tym odpowiedniego podlewania i wilgotności, ale odwdzięczają się wyjątkowym wyglądem.",
            maintenance = "Trudna",
            sunlight = "Umiarkowane",
            humidity = "Wysoka",
            wateringDays = "Co 10 dni",
            temperatureRange = Pair(18, 27),
            repot = "Co 2 lata",
            fertilizer = "Raz w miesiącu",
            height = 0.7,
            width = 0.3,
            inHouse = "Dom",
            isSeasonal = true
        )

    )
    override val page5: List<Plant> = listOf(
        Plant(
            id = 13,
            type = "Zamiokulkas",
            image = "/images/zamiokulkas.png",
            description = "Zamiokulkas to niezwykle wytrzymała roślina o błyszczących, mięsistych liściach, które doskonale komponują się w nowoczesnych wnętrzach. Pochodzi z Afryki i świetnie radzi sobie w cieniu oraz w warunkach niskiej wilgotności. Jest odporna na zaniedbania, dzięki czemu idealnie nadaje się dla zapominalskich właścicieli.",
            maintenance = "Łatwa",
            sunlight = "Średnie",
            humidity = "Niska",
            wateringDays = "Co 14 dni",
            temperatureRange = Pair(16, 24),
            repot = "Co 2 lata",
            fertilizer = "Raz w sezonie",
            height = 1.0,
            width = 0.6,
            inHouse = "Dom",
            isSeasonal = false
        ),
        Plant(
            id = 14,
            type = "Filodendron",
            image = "/images/filodendron.png",
            description = "Filodendron to bujna roślina tropikalna, która zachwyca dużymi, intensywnie zielonymi liśćmi o sercowatym kształcie. Naturalnie występuje w Ameryce Południowej, gdzie rośnie w wilgotnych lasach deszczowych. Jest łatwa w pielęgnacji, dobrze znosi cień i idealnie sprawdza się w roli ozdoby w domowych wnętrzach.",
            maintenance = "Średnia",
            sunlight = "Częściowe",
            humidity = "Wysoka",
            wateringDays = "Co 7 dni",
            temperatureRange = Pair(18, 26),
            repot = "Co 3 lata",
            fertilizer = "Raz w miesiącu",
            height = 0.5,
            width = 0.3,
            inHouse = "Dom",
            isSeasonal = false
        ),
        Plant(
            id = 15,
            type = "Kalatea",
            image = "/images/kalatea.png",
            description = "Kalatea to roślina o wyjątkowych, wzorzystych liściach, które zachwycają różnorodnością kolorów i wzorów, przyciągając wzrok każdego miłośnika roślin. Pochodzi z tropikalnych lasów Ameryki Południowej, gdzie panują wilgotne i ciepłe warunki. Jej liście mają zdolność reagowania na światło, podnosząc się i opadając w rytmie dnia.",
            maintenance = "Trudna",
            sunlight = "Umiarkowane",
            humidity = "Wysoka",
            wateringDays = "Co 3 dni",
            temperatureRange = Pair(18, 26),
            repot = "Co 2 lata",
            fertilizer = "Raz w miesiącu",
            height = 0.8,
            width = 0.5,
            inHouse = "Dom",
            isSeasonal = false
        )

    )
    override val page6: List<Plant> = listOf(
        Plant(
            id = 16,
            type = "Szeflera",
            image = "/images/szeflera.png",
            description = "Szeflera to efektowna roślina o błyszczących liściach, które układają się w charakterystyczny kształt parasola. Pochodzi z tropikalnych rejonów Australii, gdzie szybko się rozrasta w sprzyjających warunkach. Jest łatwa w pielęgnacji, toleruje różne warunki świetlne i nadaje wnętrzom tropikalnego charakteru.",
            maintenance = "Łatwa",
            sunlight = "Jasne",
            humidity = "Średnia",
            wateringDays = "Co 7 dni",
            temperatureRange = Pair(18, 27),
            repot = "Co 2 lata",
            fertilizer = "Co 2 miesiące",
            height = 2.0,
            width = 1.0,
            inHouse = "Dom",
            isSeasonal = false
        ),
        Plant(
            id = 17,
            type = "Dracena",
            image = "/images/dracena.png",
            description = "Dracena to elegancka roślina o długich, smukłych liściach, które mogą być jednolicie zielone lub ozdobione barwnymi pasami. Naturalnie pochodzi z Afryki, gdzie rośnie w suchym klimacie. Jest ceniona za zdolność oczyszczania powietrza i łatwą pielęgnację, co czyni ją doskonałym wyborem dla każdego wnętrza.",
            maintenance = "Łatwa",
            sunlight = "Umiarkowane",
            humidity = "Średnia",
            wateringDays = "Co 10 dni",
            temperatureRange = Pair(15, 24),
            repot = "Co 3 lata",
            fertilizer = "Raz na kwartał",
            height = 1.5,
            width = 0.6,
            inHouse = "Dom",
            isSeasonal = false
        ),
        Plant(
            id = 18,
            type = "Juka",
            image = "/images/juka.png",
            description = "Juka to wyjątkowo dekoracyjna roślina o sztywnych, ostrych liściach, które tworzą efektowną, architektoniczną formę. Pochodzi z pustynnych terenów Ameryki Północnej, dzięki czemu doskonale znosi suche powietrze i wysokie nasłonecznienie. Jest odporna na zaniedbania i stanowi ciekawy akcent w jasnych wnętrzach.",
            maintenance = "Łatwa",
            sunlight = "Pełne",
            humidity = "Niska",
            wateringDays = "Co 14 dni",
            temperatureRange = Pair(10, 30),
            repot = "Co 4 lata",
            fertilizer = "Raz w sezonie",
            height = 2.0,
            width = 1.0,
            inHouse = "Dom i ogród",
            isSeasonal = false
        )
    )
    override val page7: List<Plant> = listOf(
        Plant(
            id = 19,
            type = "Aspidistra",
            image = "/images/aspidistra.png",
            description = "Aspidistra, znana jako \"żelazna roślina\", to niezwykle odporna roślina o ciemnozielonych, szerokich liściach. Pochodzi z lasów Azji, gdzie przystosowała się do życia w cieniu i niskiej wilgotności. To doskonały wybór dla osób szukających rośliny niewymagającej częstej pielęgnacji, a jednocześnie efektownej.",
            maintenance = "Bardzo łatwa",
            sunlight = "Słabe",
            humidity = "Niska",
            wateringDays = "Co 14 dni",
            temperatureRange = Pair(10, 24),
            repot = "Co 3 lata",
            fertilizer = "Raz w sezonie",
            height = 0.7,
            width = 0.6,
            inHouse = "Dom",
            isSeasonal = false
        ),
        Plant(
            id = 20,
            type = "Kalla",
            image = "/images/kalla.png",
            description = "Kalla to elegancka roślina o smukłych łodygach zakończonych trąbkowatymi, białymi lub kolorowymi kwiatami. Pochodzi z Afryki, gdzie rośnie w wilgotnym środowisku. Preferuje jasne światło i stale wilgotne podłoże. Jej subtelny wygląd sprawia, że jest chętnie wybierana do dekoracji wnętrz i bukietów.",
            maintenance = "Średnia",
            sunlight = "Umiarkowane",
            humidity = "Średnia",
            wateringDays = "Co 5 dni",
            temperatureRange = Pair(18, 24),
            repot = "Co rok",
            fertilizer = "Raz w miesiącu",
            height = 0.6,
            width = 0.5,
            inHouse = "Dom",
            isSeasonal = true
        ),
        Plant(
            id = 21,
            type = "Chamedora",
            image = "/images/chamedora.png",
            description = "Chamedora, zwana także \"palemką pokojową\", to niewielka palma, która świetnie nadaje się do wnętrz. Pochodzi z Ameryki Środkowej, gdzie rośnie w cieniu tropikalnych lasów. Jest odporna na słabe oświetlenie i suchsze powietrze, co czyni ją doskonałym wyborem dla domowych warunków i biur.",
            maintenance = "Średnia",
            sunlight = "Średnie",
            humidity = "Średnia",
            wateringDays = "Co 7 dni",
            temperatureRange = Pair(15, 25),
            repot = "Co 2 lata",
            fertilizer = "Raz w miesiącu",
            height = 1.2,
            width = 1.0,
            inHouse = "Dom",
            isSeasonal = false
        )
    )
    override val page8: List<Plant> = listOf(
        Plant(
            id = 22,
            type = "Fiołek afrykański",
            image = "/images/fiołek_afrykański.png",
            description = "Fiołek afrykański to delikatna roślina o drobnych kwiatach w odcieniach fioletu, różu i bieli. Pochodzi z tropikalnych regionów Afryki, gdzie panuje wysoka wilgotność. W domowych warunkach wymaga regularnego podlewania i ciepłego miejsca. Przy odpowiedniej pielęgnacji kwitnie niemal przez cały rok, wnosząc subtelną elegancję do wnętrz.",
            maintenance = "Średnia",
            sunlight = "Umiarkowane",
            humidity = "Wysoka",
            wateringDays = "Co 5 dni",
            temperatureRange = Pair(18, 24),
            repot = "Co rok",
            fertilizer = "Co 2 tygodnie",
            height = 0.2,
            width = 0.2,
            inHouse = "Dom",
            isSeasonal = true
        ),
        Plant(
            id = 23,
            type = "Sukulent",
            image = "/images/sukulent.png",
            description = "Sukulenty to grupa niezwykle różnorodnych roślin przystosowanych do życia w suchych warunkach. Ich mięsiste liście lub łodygi magazynują wodę, co czyni je odpornymi na dłuższe okresy suszy. Pochodzą z suchych regionów Afryki i Ameryki. Dzięki swojej wytrzymałości i niewielkim wymaganiom są doskonałe do wnętrz oraz dla osób początkujących.",
            maintenance = "Łatwa",
            sunlight = "Pełne",
            humidity = "Niska",
            wateringDays = "Co 14 dni",
            temperatureRange = Pair(15, 30),
            repot = "Rzadko",
            fertilizer = "Raz w sezonie",
            height = 0.3,
            width = 0.2,
            inHouse = "Dom",
            isSeasonal = false
        ),
        Plant(
            id = 24,
            type = "Pelargonia",
            image = "/images/pelargonie.png",
            description = "Pelargonia to jedna z najpopularniejszych roślin kwitnących, wyróżniająca się jaskrawymi kwiatami w kolorach czerwieni, różu i bieli. Pochodzi z Afryki Południowej, gdzie rośnie w ciepłym klimacie. Jest łatwa w uprawie i doskonale nadaje się do ozdabiania balkonów, tarasów oraz wnętrz. Regularne podlewanie i przycinanie zapewnią jej obfite kwitnienie przez całe lato.",
            maintenance = "Średnia",
            sunlight = "Pełne",
            humidity = "Średnia",
            wateringDays = "Co 5 dni",
            temperatureRange = Pair(15, 25),
            repot = "Co rok",
            fertilizer = "Raz na kwartał",
            height = 0.6,
            width = 0.4,
            inHouse = "Balkon",
            isSeasonal = true
        )

    )
    override val page9: List<Plant> = listOf(
        Plant(
            id = 25,
            type = "Bluszcz",
            image = "/images/bluszcz.png",
            description = "Bluszcz to wiecznie zielona roślina pnąca, która szybko się rozrasta dzięki swoim zdolnościom do ukorzeniania. Ma drobne, ciemnozielone liście o eleganckim kształcie. Występuje naturalnie w Europie i Azji, gdzie rośnie w cienistych miejscach. W domu sprawdza się jako dekoracja ścian lub wisząca roślina, nadając wnętrzom naturalny urok.",
            maintenance = "Łatwa",
            sunlight = "Mało",
            humidity = "Średnia",
            wateringDays = "Co 7 dni",
            temperatureRange = Pair(10, 20),
            repot = "Co 3 lata",
            fertilizer = "Raz na sezon",
            height = 1.5,
            width = 1.0,
            inHouse = "Ogród",
            isSeasonal = false
        ),
        Plant(
            id = 26,
            type = "Grubosz",
            image = "/images/grubosz.png",
            description = "Grubosz, znany również jako drzewko szczęścia, to roślina o grubych, mięsistych liściach, które magazynują wodę. Naturalnie występuje w Afryce Południowej, gdzie panuje suchy klimat. Symbolizuje dobrobyt i powodzenie, dlatego jest chętnie wybierany do domów. Jest łatwy w pielęgnacji i dobrze znosi suszę, idealny dla początkujących miłośników roślin.",
            maintenance = "Łatwa",
            sunlight = "Pełne",
            humidity = "Niska",
            wateringDays = "Co 14 dni",
            temperatureRange = Pair(15, 28),
            repot = "Co 3 lata",
            fertilizer = "Raz na sezon",
            height = 0.8,
            width = 0.6,
            inHouse = "Dom",
            isSeasonal = false
        ),
        Plant(
            id = 27,
            type = "Strelicja",
            image = "/images/strelicja.png",
            description = "Strelicja to egzotyczna roślina o dużych liściach i kwiatostanach przypominających kolorowe ptaki w locie. Pochodzi z Afryki, gdzie rośnie w ciepłych, tropikalnych rejonach. Jest symbolem elegancji i luksusu, często wykorzystywana w dekoracjach wnętrz. Wymaga jasnego stanowiska oraz regularnego podlewania, aby w pełni ukazać swoje piękno.",
            maintenance = "Trudna",
            sunlight = "Jasne",
            humidity = "Wysoka",
            wateringDays = "Co 5 dni",
            temperatureRange = Pair(18, 26),
            repot = "Co rok",
            fertilizer = "Co 2 tygodnie",
            height = 1.5,
            width = 1.0,
            inHouse = "Dom",
            isSeasonal = false
        )

    )
    override val page10: List<Plant> = listOf(
        Plant(
            id = 28,
            type = "Cyklamen",
            image = "/images/cyklamen.png",
            description = "Cyklamen to efektowna roślina doniczkowa, znana z pięknych kwiatów w odcieniach różu, fioletu i bieli, które kwitną zimą. Naturalnie występuje w rejonach śródziemnomorskich, gdzie rośnie w chłodniejszych miesiącach. Wymaga umiarkowanego podlewania oraz jasnego, ale chłodnego stanowiska. Jest doskonałym wyborem, by dodać koloru i świeżości zimowym wnętrzom.",
            maintenance = "Średnia",
            sunlight = "Średnie",
            humidity = "Wysoka",
            wateringDays = "Co 3 dni",
            temperatureRange = Pair(10, 18),
            repot = "Co rok",
            fertilizer = "Raz w miesiącu",
            height = 0.3,
            width = 0.3,
            inHouse = "Dom",
            isSeasonal = true
        ),
        Plant(
            id = 29,
            type = "Kaladium",
            image = "/images/caladium.png",
            description = "Kaladium to roślina ozdobna o dużych, sercowatych liściach, które występują w intensywnych kolorach, takich jak róż, czerwień i zieleń. Pochodzi z tropikalnych rejonów Ameryki Południowej. Roślina sezonowa – w okresie zimowym przechodzi w stan spoczynku. Idealnie nadaje się do wnętrz, nadając im tropikalnego charakteru. Wymaga wilgotnego podłoża i ciepłego miejsca.",
            maintenance = "Średnia",
            sunlight = "Średnie",
            humidity = "Wysoka",
            wateringDays = "Co 3 dni",
            temperatureRange = Pair(18, 26),
            repot = "Co rok",
            fertilizer = "Raz na sezon",
            height = 0.5,
            width = 0.5,
            inHouse = "Dom",
            isSeasonal = true
        ),
        Plant(
            id = 30,
            type = "Lawenda",
            image = "/images/lawenda.png",
            description = "Lawenda to aromatyczny krzew o wąskich liściach i drobnych, fioletowych kwiatach, które wydzielają relaksujący zapach. Naturalnie rośnie w regionach Morza Śródziemnego, gdzie panuje ciepły, suchy klimat. Świetnie nadaje się do ogrodów, balkonów i donic, gdzie tworzy romantyczną atmosferę. Jej zapach odstrasza owady, a suszone kwiaty stosuje się w aromaterapii.",
            maintenance = "Łatwa",
            sunlight = "Pełne",
            humidity = "Niska",
            wateringDays = "Co 8 dni",
            temperatureRange = Pair(15, 30),
            repot = "Co kilka lat",
            fertilizer = "Raz na sezon",
            height = 0.5,
            width = 0.5,
            inHouse = "Ogród",
            false
        )

    )
    override val page11: List<Plant> = listOf(
        Plant(
            id = 31,
            type = "Róża",
            image = "/images/roze.png",
            description = "Róże to jedne z najbardziej eleganckich i klasycznych roślin ogrodowych, cenione za różnorodność kolorów i zapachów. Aby pięknie kwitły, wymagają odpowiedniej pielęgnacji, w tym przycinania, nawożenia i odpowiedniego stanowiska. Są symbolem miłości i piękna, dodając uroku ogrodom, tarasom i wnętrzom. Mogą kwitnąć przez wiele sezonów.",
            maintenance = "Trudna",
            sunlight = "Pełne",
            humidity = "Średnia",
            wateringDays = "Co 3 dni",
            temperatureRange = Pair(15, 25),
            repot = "Co kilka lat",
            fertilizer = "Raz w miesiącuc",
            height = 1.5,
            width = 1.0,
            inHouse = "Ogród",
            isSeasonal = false
        ),
        Plant(
            id = 32,
            type = "Rozmaryn",
            image = "/images/rozmaryn.png",
            description = "Rozmaryn to wiecznie zielona roślina o intensywnie aromatycznych liściach, która jest nie tylko przyprawą, ale również ozdobą. Pochodzi z regionów Morza Śródziemnego i preferuje słoneczne, ciepłe stanowiska. Może być uprawiany w donicach lub ogrodach. Jego charakterystyczny zapach i odporność na suszę czynią go idealnym wyborem do kuchni i dekoracji.",
            maintenance = "Łatwa",
            sunlight = "Pełne",
            humidity = "Niska",
            wateringDays = "Co 7 dni",
            temperatureRange = Pair(15, 30),
            repot = "Co 2 lata",
            fertilizer = "Raz w miesiącu",
            height = 0.5,
            width = 0.3,
            inHouse = "Dom i ogród",
            isSeasonal = false
        ),
        Plant(
            id = 33,
            type = "Bazylia",
            image = "/images/bazylia.png",
            description = "Bazylia to aromatyczna roślina zielna o intensywnie zielonych liściach, często wykorzystywana w kuchni, zwłaszcza w daniach śródziemnomorskich. Pochodzi z tropikalnych regionów Azji i wymaga ciepłego, słonecznego stanowiska oraz regularnego podlewania. Rośnie szybko, a jej świeży zapach i smak sprawiają, że jest niezastąpiona w domowej uprawie ziół.",
            maintenance = "Średnia",
            sunlight = "Pełne",
            humidity = "Średnia",
            wateringDays = "Co 3 dni",
            temperatureRange = Pair(18, 25),
            repot = "Co rok",
            fertilizer = "Co 2 tygodnie",
            height = 0.4,
            width = 0.3,
            inHouse = "Dom i ogród",
            isSeasonal = true
        )

    )


    override val plants: Map<Int, List<Plant>> by lazy {mapOf(1 to page1, 2 to page2, 3 to page3, 4 to page4, 5 to page5, 6 to page6, 7 to page7, 8 to page8, 9 to page9, 10 to page10, 11 to page11)}

    override suspend fun getAllPlants(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page)["prevPage"],
            nextPage = calculatePage(page)["nextPage"],
            plants = plants[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage:Int? = page
        var nextPage:Int? = page

        if(page in 1..10) {
            if (nextPage != null) {
                nextPage += 1
            }
        }
        if(page in 2..11) {
            if(prevPage != null) {
                prevPage -= 1
            }
        }
        if(page == 1) {
            prevPage = null
        }
        if(page == 11) {
            nextPage = null
        }

        return mapOf("prevPage" to prevPage, "nextPage" to nextPage)

    }

    override suspend fun searchPlants(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            plants = findPlants(name = name)
        )
    }

    private fun findPlants(name:String?): List<Plant> {
        val list = mutableListOf<Plant>()

        if(name.isNullOrEmpty()) {
            return emptyList()
        }

        for(plantsList in plants.values) {
            for(plant in plantsList) {
                if(plant.type.lowercase().contains(name.lowercase())) {
                    list.add(plant)
                }
            }
        }
        return list
    }
}