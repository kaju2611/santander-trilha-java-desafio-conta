import java.util.Scanner;

public class contaTerminal {


    public static void main(String[] args){
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;


        Scanner scan = new Scanner(System.in);

        
        //numero
        System.out.println("Digite o numero da agencia");
        numero=scan.nextInt();
        
        //agencia
        System.out.println("Digite a agencia");
        agencia=scan.nextLine();
        
        
        //nomeCliente
        System.out.println("Digite seu nome");
        nomeCliente=scan.nextLine();
        
        //saldo
        System.out.println("Digite seu saldo");
        saldo=scan.nextInt();
        
        
        System.out.println("\"Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque\".");
    }
}
