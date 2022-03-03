package com.company;

public class Main {

    public static void main(String[] args) {
        byte pen = 4;
        System.out.println(pen);
        short pencil = 10;
        System.out.println(pencil);
        int notebook = 12;
        System.out.println(notebook);
        long book = 15L;
        System.out.println(book);

        float penWeight = 1.545f;
        System.out.println(penWeight);
        double pencilWeight  = 1.54545454545;
        System.out.println(pencilWeight);




        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float boxersWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров " + boxersWeight + "кг" );
        float boxersWeightDifference = secondBoxer - firstBoxer;
        System.out.println("Первый боксер весит меньше второго на " + boxersWeightDifference + "кг" );



        byte bananas = 5;
        byte bananaWeight = 80;
        int totalBananasWeight = bananas * bananaWeight;
        System.out.println("Общий вес бананов " + totalBananasWeight + "гр");
        short milk = 200;
        byte milkWeight = 105;
        int totalMilkWeight = milkWeight * 2;
        System.out.println("Общий объем молока " + totalMilkWeight + "гр");
        byte icecream = 2;
        byte icecreamWeight = 100;
        int totalIcecreamWeight = icecream * icecreamWeight;
        System.out.println("Общий вес мороженного " + totalIcecreamWeight + "гр");
        byte egg = 4;
        byte eggWeight = 70;
        int totalEggWeight = egg * eggWeight;
        System.out.println("Общий вес яиц " + totalEggWeight + "гр");
        int breakfastWeight = totalBananasWeight + totalIcecreamWeight + totalEggWeight + totalMilkWeight;
        System.out.println("Общий вес всего завтрака " + breakfastWeight + "гр ");
        float kgBreakfastWeight = breakfastWeight / 1000f;
        System.out.println("Вес завтрака в кг " + kgBreakfastWeight);

        byte lossWeight = 7;
        short oneMinLoss = 250;
        short kgWeightGr = 1000;
        int lossWeightGr = lossWeight * kgWeightGr;
        System.out.println("Вес для потери " + lossWeightGr + " гр ");
        int daysMinWeight = lossWeightGr / oneMinLoss;
        System.out.println("При минимальной потере понадобится " + daysMinWeight + " дней ");
        short oneMaxLoss = 500;
        int daysMaxWeight = lossWeightGr / oneMaxLoss;
        System.out.println("При максимальной потере веса понадобится " + daysMaxWeight + " дней ");
        int averageDays = (daysMinWeight + daysMaxWeight) / 2;
        System.out.println("В среднем может понадобиться " + averageDays + " день ");




        int salaryMashas = 67760;
        int salaryDenis = 83690;
        int salaryKristinas = 76230;
        float salaryIncreaseMashas = salaryMashas / 100f * 10 + 67760;
        System.out.println("Повышенная зарплата Маши в месяц " + salaryIncreaseMashas + " рублей ");
        int differenceSalaryYearMashas = (int) ((salaryIncreaseMashas * 12) - (salaryMashas * 12));
        System.out.println("Годовая разница повышения зарплаты Маши составила  " + differenceSalaryYearMashas + " рублей ");
        float salaryIncreaseDenis = salaryDenis / 100f * 10 + 83690;
        System.out.println("Повышенная зарплата Дениса в месяц " + salaryIncreaseDenis + " рублей ");
        int differenceSalaryYearDenis = (int) ((salaryIncreaseDenis * 12) - (salaryDenis * 12));
        System.out.println("Годовая разница повышения зарплаты Дениса составила " + differenceSalaryYearDenis + " рублей ");
        float salaryIncreaseKristinas = salaryKristinas / 100f * 10 + 76230;
        System.out.println("Повышенная зарплата Кристины в месяц " + salaryIncreaseKristinas + " рублей ");
        int differenceSalaryYearKristinas = (int) ((salaryIncreaseKristinas * 12) - (salaryKristinas * 12));
        System.out.println("Годовая разница повышения зарплаты Кристины составила " + differenceSalaryYearKristinas + " рублей ");









    }
}
