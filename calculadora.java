import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do professor");
        String nome = teclado.nextLine();

        System.out.println("Digite o regime de pagamento");
        System.out.println("1 para CLT");
        System.out.println("2 para Horista");
        System.out.println("3 para PJ");

        int regimePagamento = teclado.nextInt();
        double valorReceber = 0;

        if(regimePagamento == 1){
            System.out.println("Digite o salário mensal do professor ");
            double salarioMensal = teclado.nextDouble();
            professorCLT professorCLT = new professorCLT(nome, salarioMensal);
            valorReceber = professorCLT.calcularValor();
        }
        else if(regimePagamento == 2){
            System.out.println("Digite valor horas trabalhadas");
            double valorHoras = teclado.nextDouble();
            System.out.println("Digite horas trabalhadas");
            double horasTrabalhadas = teclado.nextDouble();
            professorHorista professorHorista =  new professorHorista(nome, horasTrabalhadas, valorHoras);
            valorReceber = professorHorista.calcularValor();
        }   
        else if(regimePagamento == 3){
            System.out.println("Digite do valor combinado no contrato");
            double valorContrato = teclado.nextDouble();
            professorPJ professorPJ = new professorPJ(nome, valorContrato);
            valorReceber = professorPJ.calcularValor();       
        }
        teclado.close();
            System.out.println("Nome do Professor "+ nome + " e o valor que recebe é R$" + valorReceber);
    }
}