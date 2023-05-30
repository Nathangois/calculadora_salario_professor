public class professorHorista extends professor {
    private double horasTrabalhadas;
    private double valorHoras;
    
public professorHorista(String nome, double horasTrabalhadas, double valorHoras) {
    }
public double getHorasTrabalhadas() {
    return horasTrabalhadas;
}
public void setHorasTrabalhadas(double horasTrabalhadas) {
    this.horasTrabalhadas = horasTrabalhadas;
}
public double getValorHoras() {
    return valorHoras;
}
public void setValorHoras(double valorHoras) {
    this.valorHoras = valorHoras;
}
public double calcularValor(){
    return horasTrabalhadas * valorHoras;
}
}