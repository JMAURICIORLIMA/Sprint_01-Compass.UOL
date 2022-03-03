package heranca;

public class ControleBonificacao {

    private double soma;

    public void registro(Funcionarios func){
        double bonificacao = func.getBonificacao();
        this.soma += bonificacao;
    }

    public double getSoma() {
        return soma;
    }

}
