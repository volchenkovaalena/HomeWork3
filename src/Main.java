public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int a = 20000;
        byte b = 126;
        short c = 2000;
        long d = 32390990L;
        float f = 4.63f;
        double g = 6.994949429493989;

        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной g с типом double равно " + g);

       float q = 27.12f;
       long w = 987678965549L;
       float e = 2.786f;
       short r = 569;
       short t = -159;
       short y = 27897;
       byte u = 67;

       byte studentsL = 23;
       byte studentsA = 27;
       byte studentsE = 30;
       short paper = 480;
       int paperPrStudent = paper / (studentsL + studentsA + studentsE);
        System.out.println("На каждого ученика рассчитано " + paperPrStudent + " листов бумаги");

       byte output2Min = 16;
       int output20Min = output2Min * 10;
       int output24Hours = output2Min * 720;
       int output3Days = output24Hours * 3;
       int output1Month = output3Days * 10;
        System.out.println("За 2 минуты машина произвела " + output2Min + " штук бутылок");
        System.out.println("За 20 минут машина произвела " + output20Min + " штук бутылок");
        System.out.println("За 24 часа машина произвела " + output24Hours + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + output3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + output1Month + " штук бутылок");

        short paintSum = 120;
        byte whitePaintPrRoom = 2;
        byte brownPaintPrRoom = 4;
        int rooms = paintSum / (whitePaintPrRoom + brownPaintPrRoom );
        int whitePaintSum = whitePaintPrRoom * rooms;
        int brownPaintSum = brownPaintPrRoom * rooms;
        System.out.println("В школе, где  " + rooms + " классов, нужно " + whitePaintSum + " банок белой краски и " + brownPaintSum + " банок коричневой краски." );

        byte bananaQt = 5;
        byte bananaWg = 80;
        short milkMl = 200;
        byte milk100MlWg = 105;
        byte iceCreamQt = 2;
        byte iceCreamWg = 100;
        byte  eggsQt = 4;
        byte eggsWg = 70;
        int grSum = bananaQt * bananaWg + milkMl / 100 * milk100MlWg + iceCreamWg * iceCreamQt + eggsQt * eggsWg ;
        int grPerKg = 1000;
        float kgSum = grSum / grPerKg ;
        System.out.println("Вес спорт завтрака " + grSum + " гр");
        System.out.println("Вес спорт завтрака " + kgSum + " кг");

        byte looseKg = 7;
        int looseGr = looseKg * 1000;
        short fastGrPrDay= 500;
        short slowGrPrDay = 250;
        int  fastLose = looseGr / fastGrPrDay ;
        int  slowLose = looseGr / slowGrPrDay ;
        int middleLose = (fastLose + slowLose) / 2;
        System.out.println("При быстрой потере веса, спортсмен достигнет цели за  " + fastLose + " дней");
        System.out.println("При медленной потере веса, спортсмен достигнет цели за  " + slowLose + " дней");
        System.out.println("В среднем он достигнет цели за  " + middleLose + " день");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int newSalaryMasha = salaryMasha + (salaryMasha / 10);
        int salaryDiffMasha = (newSalaryMasha - salaryMasha) * 12;
        int newSalaryDenis = salaryDenis + (salaryDenis/ 10);
        int salaryDiffDenis = (newSalaryDenis - salaryDenis) * 12;
        int newSalaryKristina = salaryKristina + (salaryKristina / 10);
        int salaryDiffKristina = (newSalaryKristina - salaryKristina) * 12;


        System.out.println("Маша теперь получает  " + newSalaryMasha + " рублей. Годовой доход вырос на " + salaryDiffMasha + " рублей");
        System.out.println("Денис теперь получает  " + newSalaryDenis + " рублей. Годовой доход вырос на " + salaryDiffDenis + " рублей");
        System.out.println("Кристина теперь получает  " + newSalaryKristina + " рублей. Годовой доход вырос на " + salaryDiffKristina + " рублей");





    }
}