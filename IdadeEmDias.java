import java.util.Scanner;

public class IdadeEmDias{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos Anos de nascido você Tem?");
        int anos = scanner.nextInt();

        System.out.println("Meses?");
        int meses = scanner.nextInt();

        System.out.println("Dias?");
        int dias = scanner.nextInt();

        //PROCESSAMENTO
        int resultado = (anos * 365) + (meses * 30) + dias;

        System.out.println("você tem "+resultado+" DIAS DE NASCIDO!");


    }

}
