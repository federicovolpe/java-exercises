import java.util.Scanner;

public class saltapicchio {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("quantità di numeri da inserire");
        int quantità = sc.nextInt();
        int [] numeri = new int[quantità];
        for(int i = 0; i < quantità; i++){
            numeri[i] = sc.nextInt();
        }
        if(verifica(numeri)){
            System.out.println("saltapicchio");
        }
    }

    public static boolean verifica(int[] numeri){
        for(int i = 1; i < numeri.length; i++){
            if(Math.abs(numeri[i]- numeri[i-1]) > 1 ){
                return false;
            }
        }
        return true;
    }
}
