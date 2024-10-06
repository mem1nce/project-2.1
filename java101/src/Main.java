import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        int n1,n2,select;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci sayiyi giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        if(select == 1){
            System.out.print("Toplam = "+ (n1+n2) );
        } else if(select == 2){
            System.out.print("Çıkarma = "+ (n1-n2) );
        } else if(select == 3){
            System.out.print("Çarpım = "+ (n1*n2) );
        } else if(select == 4){
            if(n2 != 0){
            System.out.print("Bölüm = "+ (n1/n2) );
            } else {
                System.out.print("Bir sayi sifira bölünemez!!!");
            }

        } else {
            System.out.print("Yanlış seçim yaptınız lütfen tekrar deneyiniz... ");
        }

    }
}

