import java.util.Scanner;
public class AtvAula_ex_valor_enum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do mes para saber o valor gasto:");
        String mes = sc.nextLine().trim().toLowerCase();

        imprimirGastoMes(mes);
    }
    private static void imprimirGastoMes(String mes) {
        if (mes.equals(Meses.JANEIRO.getMes())) {
            System.out.printf("Valor dos gasto do mes %s = R$%.2f.", Meses.JANEIRO.getMes(), Meses.JANEIRO.getValor());
        } else if (mes.equals(Meses.FEVEREIRO.getMes())) {
            System.out.printf("Valor dos gasto do mes %s = R$%.2f.", Meses.FEVEREIRO.getMes(), Meses.FEVEREIRO.getValor());
        } else if (mes.equals(Meses.MARCO.getMes()) || mes.toLowerCase().equals("marco")) {
            System.out.printf("Valor dos gasto do mes %s = R$%.2f.", Meses.MARCO.getMes(), Meses.MARCO.getValor());
        }else if (mes.equals(Meses.ABRIL.getMes())) {
            System.out.printf("Valor dos gasto do mes %s = R$%.2f.", Meses.ABRIL.getMes(), Meses.ABRIL.getValor());
        }else if (mes.equals(Meses.JUNHO.getMes())) {
            System.out.printf("Valor dos gasto do mes %s = R$%.2f.", Meses.JUNHO.getMes(), Meses.JUNHO.getValor());
        }else if (mes.equals(Meses.JULHO.getMes())) {
            System.out.printf("Valor dos gasto do mes %s = R$%.2f.", Meses.JULHO.getMes(), Meses.JULHO.getValor());
        }else if (mes.equals(Meses.AGOSTO.getMes())) {
            System.out.printf("Valor dos gasto do mes %s = R$%.2f.", Meses.AGOSTO.getMes(), Meses.AGOSTO.getValor());
        }else if (mes.equals(Meses.SETEMBRO.getMes())) {
            System.out.printf("Valor dos gasto do mes %s = R$%.2f.", Meses.SETEMBRO.getMes(), Meses.SETEMBRO.getValor());
        }else if (mes.equals(Meses.OUTUBRO.getMes())) {
            System.out.printf("Valor dos gasto do mes %s = R$%.2f.", Meses.OUTUBRO.getMes(), Meses.OUTUBRO.getValor());
        }else if (mes.equals(Meses.NOVEMBRO.getMes())) {
            System.out.printf("Valor dos gasto do mes %s = R$%.2f.", Meses.NOVEMBRO.getMes(), Meses.NOVEMBRO.getValor());
        }else if (mes.equals(Meses.DEZEMBRO.getMes())) {
            System.out.printf("Valor dos gasto do mes %s = R$%.2f.", Meses.DEZEMBRO.getMes(), Meses.DEZEMBRO.getValor());
        } else {
            System.out.println("Erro ao digitar o mes. Reinicie o programa.");
        }
    }
}