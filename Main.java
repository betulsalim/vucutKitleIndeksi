import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        float kg,m,vki;

        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu giriniz(m): ");
        m = input.nextFloat();

        System.out.println("Kilonuzu giriniz: ");
        kg = input.nextFloat();

        vki = kg / (m*m);
        System.out.println("Vücut Kitle İndeksiniz: "+vki);

    }
}
