package heranca;

import heranca.Autenticacao;
import heranca.Autenticavel;
import heranca.Funcionarios;

public class Gerente extends Funcionarios implements Autenticavel {

    private Autenticacao autenticador;

    public Gerente (){
        this.autenticador = new Autenticacao();
    }

    @Override
    public double getBonificacao() {
        System.out.println("Acesso heranca.Gerente.");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }
}
