import java.util.Scanner;
public class AtvAula_ex_valor_enum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do mes para saber o valor gasto:");
        String mes = sc.nextLine().trim().toUpperCase();
        System.out.printf("Valor dos gasto do mes %s = R$%.2f.", Meses.valueOf(mes).getMes(), Meses.valueOf(mes).getValor());
    }
}