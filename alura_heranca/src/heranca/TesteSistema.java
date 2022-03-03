package heranca;

public class TesteSistema {

    public static void main(String[] args) {

//        heranca.Autenticavel referencia = new heranca.Gerente();
//
//        heranca.Gerente gerente = new heranca.Gerente();
//        gerente.setSenha(222);
//
//        heranca.Administrador adm = new heranca.Administrador();
//        adm.setSenha(2222);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);

        SistemaInterno sisInt = new SistemaInterno();
//        sisInt.autentica(gerente);
//        sisInt.autentica(adm);
        sisInt.autentica(cliente);
    }
}
