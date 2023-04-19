import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;

        System.out.print("Sayı giriniz: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (int i = 2; i<=n;i++){
            boolean primeNumber=true;
            for (int j =2; j<i;j++){
                if (i%j==0){
                    primeNumber =false;
                    break;
                }
            }
            if (primeNumber){
                System.out.print(i+" ");
            }

        }

    }
}