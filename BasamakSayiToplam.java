import java.util.Scanner;

public class BasamakSayiToplam {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.println("Sayı giriniz");
        int number=girdi.nextInt();

        int sum = 0;
        int tempNumber = number;

        while(tempNumber !=0 ){
            int bas = tempNumber % 10;
            sum += bas;
            tempNumber /= 10;
        }

        System.out.println("basamak sayı toplam: " + sum);

        /* 1'den 999'a kadar tüm Armstrong sayıları bulan program:

        for (int i=999; i>=100; i--){

            int sum = 0;
            int temp = i;
            while (temp!=0){
                int digit = temp%10;
                sum += (digit*digit*digit);
                temp /=10;
            }
            if(sum==i)
                System.out.println(i + "armstrong sayıdır");
            }


        for (int i=99; i>=10; i--){

            int sum = 0;
            int temp = i;
            while (temp!=0){
                int digit = temp%10;
                sum += (digit*digit);
                temp /=10;
            }
            if(sum==i)
                System.out.println(i + "armstrong sayıdır");
            }

        for (int i=9; i>=0; i--){

            int sum = 0;
            int temp = i;
            while (temp!=0){
                int digit = temp%10;
                sum += digit;
                temp /=10;
            }
            if(sum==i)
                System.out.println(i + "armstrong sayıdır");
        }*/

        }
    }

