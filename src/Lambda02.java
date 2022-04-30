import java.util.List;

public class Lambda02 {

    //Task : functional Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void printCiftElFunctional(List<Integer> sayi){

        sayi.stream().filter(t->t%2==0).forEach(Lambda01::yazdir);

    }
    public static boolean ciftBul(int a){//seed(tohum) method kendisine verile int degerin cift olmasını kontrol eder

        return a%2==0;
    }
    public static void printCiftElFunctional1(List<Integer> sayi){

        sayi.stream().filter(Lambda01::ciftBul).forEach(Lambda01::yazdir);

    }}