public class Main {
    public static void main(String[] args) {
        System.out.println("tusk №1");
    byte   A = 1;
    short  B = 1;
    int    C = 1;
    long   D = 1;
    float  I = 1.1f;
    double F = 1.46;

        System.out.println("Значение переменной A с типом byte равно = "+A);
        System.out.println("Значение переменной B с типом short = "+B);
        System.out.println("Значение переменной C с типом int = "+C);
        System.out.println("Значение переменной D с типом long = "+D);
        System.out.println("Значение переменной I с типом float = "+I);
        System.out.println("Значение переменной F с типом double = "+F);
        System.out.println("tusk №2");

        float  I2 = 27.12f;
        long  B2 = 987678965549L;
        short I3 = 786;
        byte A2 = 2;
        boolean fAlse = false;
        short I4 = 569;
        short I5 = -159;
        short I6 = 27897;
        byte A3 = 67;
        System.out.println("I2 = "+I2);
        System.out.println("B2 = "+B2);
        System.out.println("I3= "+I3);
        System.out.println("A2 = "+A2);
        System.out.println("fAlse = "+fAlse);
        System.out.println("I4 = "+I4);
        System.out.println("I5 = "+I5);
        System.out.println("I6 = "+I6);
        System.out.println("A3 = "+A3);

        System.out.println("tusk №3");
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short sheet = 480;
        int sheetPerStudent=sheet/( LP + AS + EA );
        System.out.println("На каждого ученика рассчитано "+sheetPerStudent+" листов бумаги");

        System.out.println("tusk №4");
        byte botlForTwo = 16;
        int botlForTwentin = botlForTwo * 10;
        int botlForDay = botlForTwo * 720;
        int threeDay = botlForDay * 3;
        int month = botlForDay * 30;
        System.out.println("За 2 минуты машина произвела бутылок "+botlForTwo+" штук");
        System.out.println("За 20 минут машина произвела бутылок "+botlForTwentin+" штук");
        System.out.println("За день машина произвела бутылок "+botlForDay+" штук");
        System.out.println("За 3 дня машина произвела бутылок "+threeDay+" штук");
        System.out.println("За месяц машина произвела бутылок "+month+" штук");

        System.out.println("tusk №5");
        byte allBank = 120;
        byte whiteBank = 2;
        byte brownBank = 4;
        int allClass = allBank / (whiteBank + brownBank );
        int whiteAll = allClass * whiteBank;
        int brownAll = allClass * brownBank;
        System.out.println("В школе, где "+allClass+" классов, нужно "+whiteAll+" банок белой краски и "+brownAll+" банок коричневой краски");

        System.out.println("tusk №6");
        byte banana = 5;
        byte weightBanana = 80;
        short hundredMilk = 2;
        short milkWeight = 105;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        byte egg = 4;
        byte eggWeight = 70;
        float allWeightGramm = (banana * weightBanana) + (hundredMilk * milkWeight) + (iceCream * iceCreamWeight) + (egg * eggWeight);
        float allWeightKilogramm = allWeightGramm / 1000;
        System.out.println("Вес питания "+ allWeightKilogramm+" кг");

        System.out.println("tusk №7");
        short lossOne = 250;
        short lossTwo = 500;
        short objective = 7000;
        int oneScript = objective/lossOne;
        int twoScript = objective/lossTwo;
        int midlScript = (oneScript + twoScript)/2;
        System.out.println("Для похудения понадобиться в среднем "+ midlScript+" дней");

        System.out.println("tusk №8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        float mashaSalaryUp = (float) (mashaSalary * 1.10);
        float denisSalaryUp = (float) (denisSalary * 1.10);
        float kristinaSalaryUp = (float) (kristinaSalary * 1.10);
        float annualSalaryIncreaseMasha = (mashaSalaryUp - mashaSalary) * 12;
        float annualSalaryIncreaseDenis = (denisSalaryUp - denisSalary) * 12;
        float annualSalaryIncreaseKristina = (kristinaSalaryUp - kristinaSalary) * 12;
        System.out.println("Зарплата Маши с "+mashaSalary+" рублей, выросла до "+mashaSalaryUp+" рублей,рост годового дохода составит "+annualSalaryIncreaseMasha);
        System.out.println("Зарплата Дениса с "+denisSalary+" рублей, выросла до "+denisSalaryUp+" рублей,рост годового дохода составит "+annualSalaryIncreaseDenis);
        System.out.println("Зарплата Маши с "+kristinaSalary+" рублей, выросла до "+kristinaSalaryUp+" рублей,рост годового дохода составит "+annualSalaryIncreaseKristina);

    }

}