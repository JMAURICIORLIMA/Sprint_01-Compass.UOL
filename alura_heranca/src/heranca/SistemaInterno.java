package heranca;

import heranca.Autenticavel;

public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autenticavel funcionarioAutenticavel){
        boolean autenticou = funcionarioAutenticavel.autentica(this.senha);
        if (autenticou) {
            System.out.println("Logado");
        } else {
            System.out.println("Senha Inválida");
        }
    }
}
