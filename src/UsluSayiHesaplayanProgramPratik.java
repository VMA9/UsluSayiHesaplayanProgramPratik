import java.util.Scanner;

public class UsluSayiHesaplayanProgramPratik {
    public static void main(String[] args) {
        int n, k, i, total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = input.nextInt();

        for (i = 1; i <= k; i++) {
            total *= n;
            if(i < k){
                continue;
            }else{
                System.out.println("Cevap : " + total);
            }

        }


    }

}
