public class professorCLT extends professor {
public double salarioMensal;

public professorCLT(String nome, double salarioMensal) {
}
public double getSalarioMensal() {
    return salarioMensal;
}
public void setSalarioMensal(double salarioMensal) {
    this.salarioMensal = salarioMensal;
}
public double calcularValor(){
    return salarioMensal;
}
}