import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da conta: ");
            int numeroConta = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Agora digite o número da agencia: ");
            String agencia = scanner.nextLine();
            
            System.out.println("Digite o seu nome: ");
            String nome = scanner.nextLine();
            
            System.out.println("Agora digite o número o seu saldo: ");
            float saldo = scanner.nextFloat();
            
            
            System.out.println("Olá "+ nome+ ", obrigado por criar uma conta em nosso banco, sua agencia é "+ agencia + ", conta "+ numeroConta + " e seu saldo " + saldo + "já está disponível para saque");
        }
    }
}
