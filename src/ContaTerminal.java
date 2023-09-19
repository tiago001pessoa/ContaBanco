import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //to-do: Conhecer e importar a classe Scanner
        // Exibir as mensagens para o usuario
        // obter pela scanner os valores digitados no terminal
        //exibir a mensagem criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu numero de usuario");
        int numero = scanner.nextInt();

        System.out.println("Digite sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nomeCLiente = scanner.next();

        System.out.println("Digite seu saldo");
        float saldo = scanner.nextFloat();

        System.out.println("Olá "+nomeCLiente +
        ", obrigado por criar uma conta em nosso banco, sua agência é " +
        agencia +",conta " + numero + " e seu saldo " + saldo +
        " já está disponível para saque.");


        
    }
}
