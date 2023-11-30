package Conta.Controller2;

//Sua classe Menu
import java.util.Scanner;

public class Menu {

 public static void main(String[] args) {
     ContaController contaController = new ContaController();
     Scanner scanner = new Scanner(System.in);

     // Adicione o código necessário para obter os dados do usuário
     System.out.print("Número da conta: ");
     int numeroConta = scanner.nextInt();

     System.out.print("Valor: ");
     float valor = scanner.nextFloat();

     // Chame os métodos do ContaController conforme necessário
     contaController.sacar(numeroConta, valor);
     contaController.depositar(numeroConta, valor);

     System.out.print("Número da conta de origem: ");
     int numeroOrigem = scanner.nextInt();

     System.out.print("Número da conta de destino: ");
     int numeroDestino = scanner.nextInt();

     contaController.transferir(numeroOrigem, numeroDestino, valor);

     // Feche o scanner
     scanner.close();
 }
}
