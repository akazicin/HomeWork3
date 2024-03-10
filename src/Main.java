public class Main {
    public static void main(String[] args) {
    byte a = -11;
    short b = 136;
    int c = 33000;
    long d = 4566346231L;
    float pi = 3.14249f;
    double x = 0.3333333333333;
    System.out.println ( " byte =" + a);
    System.out.println( " short = " + b);
    System.out.println( " int = " + c);
    System.out.println( " long = " + d);
    System.out.println( " float = " + pi);
    System.out.println( " double = " + x);

//task 2

    float e = 27.12f;
    System.out.println( " task 2-1 = " + e);
    long f = 987678965549L;
    System.out.println( " task 2-2 = " + f);
    double g = 2.768;
    System.out.println( " task 2-3 = " + g);
    short h = 569;
    System.out.println( " task 2-4 = " + h);
    short j = -159;
    System.out.println( " task 2-5 = " + j);
    short k = 27897;
    System.out.println( " task 2-6 " + k);
    byte l =67;
    System.out.println( " task 2-7 = " + l);

    //task 3

    byte classLpavlovna = 23;
    byte classAsergeevna = 27;
    byte classEandreevna = 30;
    int totalStudents = classEandreevna+classAsergeevna+classEandreevna;
    short totalPapers = 480;
    int everyStudentpapers = totalPapers / totalStudents;
    System.out.println( " На каждого ученика рассчитано " + everyStudentpapers + " листов бумаги");

    //task 4
    byte perfomansBottle = 16;
    byte timePerfBottle =2;
    int perfBottleOneTime = perfomansBottle/ timePerfBottle;
    byte oneMinutes = 1;
    int time = oneMinutes * 20;

    int perfBottleTwentyMin = perfBottleOneTime * time;
    System.out.println( " За " + time + " минут машина произвела " + perfBottleTwentyMin + " штук бутылок");

    int hour = oneMinutes * 60;
    int day = hour * 24;
    int perfBottleDay = perfBottleOneTime * day;
    System.out.println( " За " + day +" минут машина произвела " + perfBottleDay);

    int treeDay = day * 3;
    int perfThreeDays = treeDay * perfBottleOneTime;
    int threeday = day/60/24 * 3;
    System.out.println( " За " + threeday + " дня машина произвела " + perfThreeDays);

    byte month = 31;
    int perfBottleMonth = month * day * perfBottleOneTime;
    int oneMonth = day / hour / 24 * month;
    System.out.println( " За " + oneMonth + " дней машина произвела " + perfBottleMonth);

//task 5
    byte whitePaint = 2;
    byte brownPaint = 4;
    byte totalPaint  = 120;
    int paintPerClassroom = whitePaint + brownPaint;
    int totalClassroom = totalPaint / paintPerClassroom;
    int totalWhitePaint = totalClassroom * whitePaint;
    int totalBrownPaint = totalClassroom * brownPaint;
    System.out.println( " В школе, где " + totalClassroom + " классов нужно " + totalWhitePaint + " банок белой краски и "
            + totalBrownPaint + " банок коричневой краски");

//task 6
    byte pcsBanana = 5;
    byte wightBanana = 80;
    int totalWightBanana = pcsBanana * wightBanana;
    short pcsMilk = 200;
    int oneMilk = pcsMilk / 100;
    byte wightMil = 105;
    int totalWightMilk = oneMilk * wightMil;
    byte pcsIcecream = 2;
    byte wightIcecream = 100;
    int totalWightIcecream = pcsIcecream * wightIcecream;
    byte pcsEgg = 4;
    byte wightEgg = 70;
    int totalWightEgg = pcsEgg * wightEgg;
    int totalWightBreackfast = totalWightBanana + totalWightMilk + totalWightIcecream + totalWightEgg;
    System.out.println( " Вес завтрака составит " + totalWightBreackfast + " грамм ");
    short kg = 1000;
    float wightBreakfastKg = totalWightBreackfast / (float)kg;
    System.out.println( " Вес завтрака соствит " + wightBreakfastKg + " кг ");

//task 7
        byte targetKg = 7;
        int targetGrams = targetKg*1000;
        System.out.println(targetGrams / 250);
        System.out.println(targetGrams / 500);

        //task 8

        double masha =67_760;
        double denis = 83_690;
        double kristina = 76_230;

        double mashaIncreased = masha * 1.1;
        double denisIncreased = denis * 1.1;
        double kristinaIncreased = kristina * 1.1;

        double mashaTotalForYear = masha * 12;
        double denisTotalForYear = denis * 12;
        double kristinaTotalForYear = kristina * 12;

        double mashaTotalForYearIncreased = mashaIncreased * 12;
        double denisTotalForYearIncreased = denisIncreased * 12;
        double kristinaTotalForYearIncreased = kristinaIncreased * 12;

        double mashaDiff = mashaTotalForYearIncreased - mashaTotalForYear;
        double denisDiff = denisTotalForYearIncreased - denisTotalForYear;
        double kristinaDiff = kristinaTotalForYearIncreased - kristinaTotalForYear;

        System.out.println(" Маша теперь получает " + mashaIncreased + "рублей. Годовой доход вырос на "
                + mashaDiff + " рублей");
        System.out.println( " Денис теперь получает " + denisIncreased + "рублей. Годовой доход вырос на "
                + denisDiff + " рублей");
        System.out.println(" Кристина теперь получает " + kristinaIncreased + "рублей. Годовой доход вырос на "
                + kristinaDiff + " рублей");






    }
}