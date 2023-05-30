public class professorPJ extends professor {
    private double valorContrato;
    
    public professorPJ(String nome, double valorContrato) {
        this.nome = nome;
        this.valorContrato = valorContrato;
    }
    public double getValorContrato() {
        return valorContrato;
    }
    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }
    
    public double calcularValor(){
        return valorContrato;
    }
}