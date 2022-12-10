public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada","Granta", 2015, "Россия", "Желтый", 200,
                1.7, "МКПП", "Универсал", "р125ам566", 5, false);
        System.out.println(lada);
        Car audi = new Car ("Audi", "A8 50 L TDI quattro", 2020, "Германия", "Черный",
                220, 3.0, "АКПП", "Седан", "л125па456", 5, true);
        System.out.println(audi);
        Car bmw = new Car ("BMW", "Z8",2021, "Германия", "Черный",
                220, 3.0, "АКПП", "Седан", "л186ап496", 2, true);
        System.out.println(bmw);
        Car kia = new Car ("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "Красный",
                200, 3.0, "АКПП", "Универсал", "л156пр432", 5, false);
        System.out.println(kia);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "Оранжевый",
                200, 1.6, "МКПП", "Универсал", "л156пр432", 5, false);
        System.out.println(hyundai);

        System.out.println("");

        Train swallow = new Train("Ласточка", "B-901", 2011, "Россия",null, 301,
                3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        System.out.println(swallow);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",null, 270,
                1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        System.out.println(leningrad);

        System.out.println("");

        Bus liAZ = new Bus("ЛиАЗ", "Курсор", 2015, "Россия",
                "синий", 100, 1000);
        System.out.println(liAZ);
        Bus mAZ = new Bus("МАЗ", "Междугородец", 2014, "Россия",
                "желтый", 90, 500);
        System.out.println(mAZ);
        Bus mersedes = new Bus("Мерседес", "Sprinter II", 2006, "Германия",
                "серый", 150, 800);
        System.out.println(mersedes);

        System.out.println("");

        kia.refill();
        swallow.refill();
        mersedes.refill();




    }
}