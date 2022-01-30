package skyro.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Задача №1
        byte a = 1;
        short b = 32767;
        int c = 50;
        long d = 1;
        float i = 0.1f;
        double f = 5.1;
        char g = 'a';
        boolean h = true;
        //Задача №2
        double firstBoxerWeight = 78.2;
        double secondBoxerWeight = 82.7;
        double sumBoxerWeight = firstBoxerWeight + secondBoxerWeight;
        double differenceBoxerWeight = secondBoxerWeight - firstBoxerWeight ;
        System.out.println("Общий вес двух бойцов " + sumBoxerWeight );
        System.out.println("Разница между весами бойцов " + differenceBoxerWeight );
        //Задача №3
        int bananas = 5;
        int oneBananasWeightGr = 80;
        int milk = 200;
        int oneMilkWeightGr = 105;
        int ice = 2;
        int oneIceWeightGr = 100;
        int eggs = 4;
        int oneEggsWeightGr = 70;
        int weightSportsman = 7;
        int weightSportsmanGr = 7*1000;
        int day250Gr = weightSportsmanGr/250;
        int day500Gr = weightSportsmanGr/500;
        System.out.println(day250Gr + " дней уйдет на похудение, если терять каждый день по 250грамм.");
        System.out.println(day500Gr + " дней уйдет на похудение, если терять каждый день по 500грамм.");
        //Задача №5
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int percent = 10;
        int mashaNewSalary = mashaSalary+(mashaSalary*percent)/100;
        int denisNewSalary = denisSalary+(denisSalary*percent)/100;
        int kristinaNewSalary = kristinaSalary+(kristinaSalary*percent)/100;
        int annualIncomeMasha = mashaSalary * 12;
        int annualIncomeDenis = denisSalary * 12;
        int annualIncomeKristina = kristinaSalary * 12;
        int annualIncomeMashaNewSalary = mashaNewSalary * 12;
        int annualIncomeDenisNewSalary = denisNewSalary * 12;
        int annualIncomeKristinaNewSalary = kristinaNewSalary * 12;
        int differenceAnnualIncomeMasha = annualIncomeMashaNewSalary - annualIncomeMasha;
        int differenceAnnualIncomeDenis = annualIncomeDenisNewSalary - annualIncomeDenis;
        int differenceAnnualIncomeKristina = annualIncomeKristinaNewSalary - annualIncomeKristina;
        System.out.println("Маша теперь получает "+ mashaNewSalary + ". Годовой доход вырос на "+ differenceAnnualIncomeMasha + "рублей.");
        System.out.println("Денис теперь получает "+ denisNewSalary + ". Годовой доход вырос на "+ differenceAnnualIncomeDenis + "рублей.");
        System.out.println("Кристина теперь получает "+ kristinaNewSalary + ". Годовой доход вырос на "+ differenceAnnualIncomeKristina + "рублей.");
    }
}
