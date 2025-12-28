// Define o pacote onde a classe está localizada
package Contador;

// Importa a classe Scanner para leitura de dados do teclado
import java.util.Scanner;

// Declara a classe principal do programa
public class contador {

    // Método principal: ponto de entrada do programa
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler dados digitados pelo usuário
        Scanner terminal = new Scanner(System.in);

        // Exibe uma mensagem pedindo o primeiro número
        System.out.println("Digite o primeiro parâmetro");

        // Lê o primeiro número inteiro digitado e armazena na variável parametroUm
        int parametroUm = terminal.nextInt();

        // Exibe uma mensagem pedindo o segundo número
        System.out.println("Digite o segundo parâmetro");

        // Lê o segundo número inteiro digitado e armazena na variável parametroDois
        int parametroDois = terminal.nextInt();

        // Inicia o bloco try para capturar possíveis exceções
        try {

            // Chama o método contar, passando os dois parâmetros digitados
            contar(parametroUm, parametroDois);

        // Captura a exceção personalizada caso ela seja lançada
        } catch (ParametrosInvalidosException exception) {

            // Imprime apenas a mensagem da exceção no console
            System.out.println(exception.getMessage());
        }

        // Fecha o Scanner para liberar recursos do sistema
        terminal.close();
    }

    // Método responsável pela lógica da contagem
    // throws indica que este método pode lançar a exceção ParametrosInvalidosException
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        // Verifica se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {

            // Lança a exceção personalizada com a mensagem definida no desafio
            throw new ParametrosInvalidosException(
                "O segundo parâmetro deve ser maior que o primeiro"
            );
        }

        // Calcula a quantidade de vezes que o laço for irá executar
        int contagem = parametroDois - parametroUm;

        // Laço de repetição que imprime os números de 1 até o valor de contagem
        for (int i = 1; i <= contagem; i++) {

            // Imprime no console o número atual da contagem
            System.out.println("Imprimindo o número " + i);
        }
    }
}
