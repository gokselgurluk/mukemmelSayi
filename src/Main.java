
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        int number , total=0 ;

        Scanner input = new Scanner(System.in);

        System.out.println("Bir Sayi Giriniz: ");

        number=input.nextInt();


        for (int i = 1 ; i < number ;i++){

            if(number % i ==0 ){

                total+=i;
                System.out.println("Tam Bölen Sayilar: "+i);
               }
        }
        if(total==number) {
            System.out.println("\nSayiniz Mükemmel Sayidir");

        }
        else{
            System.out.println("\nSayiniz Mükemmel Sayi Degildir");
        }


    }
}
