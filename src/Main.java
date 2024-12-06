public class Main {
    public static void main(String[] args) {

        // task 1
        byte byteVar = 127;
        System.out.println("Значение переменной \"byteVar\" с типом byte = " + byteVar);
        short shortVar = 128;
        System.out.println("Значение переменной \"shortVar\" с типом short = " + shortVar);
        int intVar = -2147483648; // last possible value
        System.out.println("Значение переменной \"intVar\" с типом int = " + intVar);
        long intVarToLong = (long) intVar - 1;
        intVar = intVar - 1;
        System.out.println("Значение выражения \"intVar-1\" с типом int = " + intVar);
        System.out.println("Значение выражения \"intVar-1\" с типом long = " + intVarToLong);
        long longVar = 9_223_372_036_854_775_807L;
        System.out.println("Значение переменной \"longVar\" с типом long = " + longVar);
        float longToFloat = (float) longVar + 1f;
        longVar += 1L;
        System.out.println("Значение выражения \"longVar+1\" с типом long = " + longVar);
        System.out.println("Значение выражения \"longVar+1\" с типом float = " + longToFloat);

        // task 2
        float var1 = 27.12f;
        System.out.println("var1 = " + var1);
        long var2 = 987678965549L;
        System.out.println("var2 = " + var2);
        float var3 = 2.786f;
        System.out.println("var3 = " + var3);
        short var4 = 569;
        System.out.println("var4 = " + var4);
        short var5 = -159;
        System.out.println("var5 = " + var5);
        short var6 = 27897;
        System.out.println("var6 = " + var6);
        byte var7 = 67;
        System.out.println("var7 = " + var7);

        // task 3
        byte st1 = 23;
        byte st2 = 27;
        byte st3 = 30;
        short paper = 480;
        short sheetPerStudent = (short) (paper / (st1 + st2 + st3));
        System.out.println("На каждого ученика рассчитано " + sheetPerStudent + " листов бумаги");

        // task 4
        byte bottles = 16;
        byte minutes = 2;
        byte bottlesPerMinute = (byte) (bottles / minutes);
        System.out.println("Производительность машины " + bottlesPerMinute + " бутылок в минуту");
        short bottlesPerTwentyMinutes = (short) (bottlesPerMinute * 20);
        System.out.println("За 20 минут машина произвела " + bottlesPerTwentyMinutes + " бутылок");
        short bottlesPerDay = (short) (bottlesPerMinute * 60 * 24);
        System.out.println("За сутки машина произвела " + bottlesPerDay + " бутылок");
        int bottlesPerThreeDays = bottlesPerDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDays + "бутылок");
        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("За месяц (30 дней) машина произвела " + bottlesPerMonth + " бутылок");

        // task 5
        byte cans = 120;
        byte whitePerRoom = 2;
        byte brownPerRoom = 4;
        byte roomsCount = (byte) (cans / (whitePerRoom + brownPerRoom));
        byte whiteCans = (byte) (whitePerRoom * roomsCount);
        byte brownCans = (byte) (brownPerRoom * roomsCount);

        // второй вариант решения, делала сначала так, прочитав вопрос "Сколько банок каждой краски было куплено?"
        // но дальше по заданию просят вывести в консоль также и количество классов, и нашелся вариант решения проще
        //byte cansPerRoom = (byte) (whitePerRoom + brownPerRoom);
        //System.out.println("cansPerRoom = " + cansPerRoom);
        //float kWhite = ((float) whitePerRoom / (float) cansPerRoom);
        //System.out.println("whitePerRoom / cansPerRoom = " + kWhite);
        //byte whiteCans = (byte) (cans * kWhite);
        //byte brownCans = (byte) (cans * ((float) brownPerRoom / (float) cansPerRoom));
        // or
        //byte brownCans = (byte) (cans - whiteCans);
        System.out.println("В школе, где " + roomsCount + " классов, нужно " +
                whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");

        // task 6
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte icecreamWeight = 100;
        byte eggWeight = 70;

        byte bananasCount = 5;
        byte milkCount = 2;
        byte icecreamCount = 2;
        byte eggCount = 4;

        short mealWeightInGramms = (short) (bananasCount * bananaWeight + milkCount * milkWeight +
                icecreamCount * icecreamWeight + eggCount * eggWeight);
        float mealWeighIntKilos = mealWeightInGramms / 1000f;

        System.out.println("Вес завтрака спортсмена в граммах -  " + mealWeightInGramms + ", в кг - " +
                mealWeighIntKilos);

        // task 7
        byte weightToLoseInKilos = 7;
        short weightToLoseInGramms = (short) (weightToLoseInKilos * 1000);
        short daysToAchieveRightWeight250 = (short) (weightToLoseInGramms / 250);
        short daysToAchieveRightWeight500 = (short) (weightToLoseInGramms / 500);
        System.out.println("Чтобы добиться результата похудения, теряя 250 граммов в день, потребуется " +
                daysToAchieveRightWeight250 + " дней");
        System.out.println("Чтобы добиться результата похудения, теряя 500 граммов в день, потребуется " +
                daysToAchieveRightWeight500 + " дней");

        // task 8
        // примем, что зарплата устанавливается в рублях
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        int mashaNewSalary = (int) (mashaSalary * 1.1);
        int denisNewSalary = (int) (denisSalary * 1.1);
        int kristinaNewSalary = (int) (kristinaSalary * 1.1);

        int mashaSalaryPerYear = mashaSalary * 12;
        int denisSalaryPerYear = denisSalary * 12;
        int kristinaSalaryPerYear = kristinaSalary * 12;

        int mashaSalaryNewPerYear = mashaNewSalary * 12;
        int denisSalaryNewPerYear = denisNewSalary * 12;
        int kristinaSalaryNewPerYear = kristinaNewSalary * 12;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей, годовой доход" +
                " вырос на " + (mashaSalaryNewPerYear - mashaSalaryPerYear) + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей, годовой доход" +
                " вырос на " + (denisSalaryNewPerYear - denisSalaryPerYear) + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей, годовой доход" +
                " вырос на " + (kristinaSalaryNewPerYear - kristinaSalaryPerYear) + " рублей");

    }
}