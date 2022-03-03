package heranca;

public abstract class Funcionarios {

    private String nome;
    private String cpf;
    private double salario;
//    private int tipoFuncionario; //0 - Estagiário, 1 - Junior, 2 - Senior.

    public Funcionarios() {

    }

    public void imprime() {
        System.out.println(this.getNome());
        System.out.println(this.getCpf());
        System.out.println(this.getBonificacao());

    }

    //Método sem corpo - não há implementação dentro da classe.
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        System.out.println("Funcionário");
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
