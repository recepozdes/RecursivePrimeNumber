import java.util.Scanner;

public class Main {

    static boolean isPrime(int n,int b) {
        if (n <= 1) return false;
        if(b>=2&&b<n){
            if(n%b==0) return false;
            b++;
            return isPrime(n,b);
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Asal olup olmadığı kontrol edilcek sayıyı giriniz : ");
        int sayi = scanner.nextInt();
        int counter = 2;
        isPrime(sayi,counter);
        if(isPrime(sayi,counter)) {
            System.out.println(sayi+" Asal sayıdır.");
        }else{
            System.out.println(sayi+" Asal sayı değildir.");
        }

    }
}
