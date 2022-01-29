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
        char g = 1549;
        //Задача №2
        double firstBoxerWeight = 78.2;
        double secondBoxerWeight = 82.7;
        double sumBoxerWeight = firstBoxerWeight + secondBoxerWeight;
        double differenceBoxerWeight = secondBoxerWeight - firstBoxerWeight ;
        System.out.println("Общий вес двух бойцов " + sumBoxerWeight );
        System.out.println("Разница между весами бойцов " + differenceBoxerWeight );
        //Задача №3
        int bananas = 5;
        int oneBananasWeight = 80;
        int milk = 200;
        int oneMilkWeight = 105;
        int ice = 2;
        int oneIceWeight = 100;
        int eggs = 4;
        int oneEggsWeight = 70;
        int weightGramm = bananas*oneBananasWeight + milk*oneMilkWeight + ice*oneIceWeight + eggs*oneEggsWeight;
        double weight = weightGramm/1000.0;
        System.out.println("Вес спорт-завтрака "+ weightGramm + "гр");
        System.out.println("Вес спорт-завтрака "+ weight + "кг");
        //Задача №4
        int weightSportsman = 7;
        int weightGram = 7*1000;
        System.out.println(weightGram/250 + " дней уйдет на похудение, если терять каждый день по 250грамм.");
        System.out.println(weightGram/500 + " дней уйдет на похудение, если терять каждый день по 500грамм.");
        //Задача №5
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int masha10 = masha+(masha*10)/100;
        int denis10 = denis+(denis*10)/100;
        int kristina10 = kristina+(kristina*10)/100;
        int annualIncomeMasha = masha * 12;
        int annualIncomeDenis = denis * 12;
        int annualIncomeKristina = kristina * 12;
        int annualIncomeMasha10 = masha10 * 12;
        int annualIncomeDenis10 = denis10 * 12;
        int annualIncomeKristina10 = kristina10 * 12;
        int differenceAnnualIncomeMasha = annualIncomeMasha10 - annualIncomeMasha;
        int differenceAnnualIncomeDenis = annualIncomeDenis10 - annualIncomeDenis;
        int differenceAnnualIncomeKristina = annualIncomeKristina10 - annualIncomeKristina;
        System.out.println("Маша теперь получает "+ masha10 + ". Годовой доход вырос на "+ differenceAnnualIncomeMasha + "рублей.");
        System.out.println("Денис теперь получает "+ denis10 + ". Годовой доход вырос на "+ differenceAnnualIncomeDenis + "рублей.");
        System.out.println("Кристина теперь получает "+ kristina10 + ". Годовой доход вырос на "+ differenceAnnualIncomeKristina + "рублей.");
    }
}
