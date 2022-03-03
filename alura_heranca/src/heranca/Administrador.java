package heranca;

public class Administrador implements Autenticavel {

    private Autenticacao autenticador;

    public Administrador() {
        this.autenticador = new Autenticacao();
    }

    public double getBonificacao(){
        return 50;
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
