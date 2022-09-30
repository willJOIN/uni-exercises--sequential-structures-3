import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        float num1 = 0, num2 = 0, soma = 0;

        try {
            System.out.println("Digite o primeiro numero:\n");
            Scanner scanner1 = new Scanner(System.in);
            num1 = scanner1.nextFloat();

            System.out.println("Digite o segundo numero:\n");
            num2 = scanner1.nextFloat();
            scanner1.close();

            soma = num1 + num2;
        } catch (Exception ex) {
            System.out.println("Erro ao pegar num1 e/ou num2 no exercicio3():\n" + ex);
        }
        System.out.println("A soma de " + num1 + " e " + num2 + " eh:\n" + soma);
    }
}
