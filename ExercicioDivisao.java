import java.util.Scanner;

public class ExercicioDivisao{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro Numero");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo Numero");
        int numero2 = scanner.nextInt();

        if(numero2 > 0){
            int resultado = numero1 / numero2;
            System.out.println(resultado);
        }else{
            System.out.println("" +
                    "Impossível FAZER a DIVISAO com 0, UTILIZE um valor MAIOR que 0");
        }


    }

}
