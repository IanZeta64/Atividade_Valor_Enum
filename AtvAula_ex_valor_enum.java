import java.util.Scanner;
public class AtvAula_ex_valor_enum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do mes para saber o valor gasto:");
        String mes = sc.next();

        if(mes.toLowerCase().equals(Trimestre.JANEIRO.getMes())){
            System.out.printf("Valor dos gasto do mes %s = R$%.2f.",Trimestre.JANEIRO.getMes(), Trimestre.JANEIRO.getValor());
        } else if(mes.toLowerCase().equals(Trimestre.FEVEREIRO.getMes())) {
            System.out.printf("Valor dos gasto do mes %s = R$%.2f.", Trimestre.FEVEREIRO.getMes(), Trimestre.FEVEREIRO.getValor());
        } else if(mes.toLowerCase().equals(Trimestre.MARCO.getMes()) || mes.toLowerCase().equals("marco")){
            System.out.printf("Valor dos gasto do mes %s = R$%.2f.", Trimestre.MARCO.getMes(), Trimestre.MARCO.getValor());
        }else {
            System.out.println("Erro ao digitar o mes. Reinicie o programa.");
        }
    }
}
