
import java.util.Scanner;
public class TemperaturaDia{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double temperatura, soma = 0;
        int contador = 0;

        System.out.println("=== Monitoramento de Temperatura da Água ===");
        System.out.println("Informe 12 temperaturas (entre 4ºC e 10ºC):");

        // Laço que repete até ler 12 temperaturas válidas
        while (contador < 12) {
            System.out.print("Digite a temperatura " + (contador + 1) + ": ");
            temperatura = entrada.nextDouble();

            // Validação da temperatura
            if (temperatura >= 4 && temperatura <= 10) {
                soma += temperatura;
                contador++;
            } else {
                System.out.println("Temperatura inválida! Digite um valor entre 4ºC e 10ºC.");
            }
        }

        // Cálculo da média
        double media = soma / 12;

        System.out.printf("A media das temperaturas ", media);

        entrada.close();
    }
}
