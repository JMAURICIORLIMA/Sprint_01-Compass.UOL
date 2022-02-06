package rodriguesdelima.mauricio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static String[] email = new String[100];
    static String[] senha = new String[100];

    public static void main(String[] args) throws ParseException {

        System.out.println("Digite 1 - Para cadastrar-se \nDigite 2 - Para efetuar o login");
        int opc = scanner.nextInt();
        while (opc != 0) {
            switch (opc) {
                case 1:
                    cadastro();
                    break;

                case 2:
                    login();
                    break;
                default:
                    System.out.println("Opção inválida! ");
            }
            System.out.println("Digite 1 - Para cadastrar-se \nDigite 2 - Para efetuar o login \nDigite 0 - Para sair! ");
            opc = scanner.nextInt();
        }
    }

    public static void login() throws ParseException {
        String horaEntrada = "00:00"; //new SimpleDateFormat("HH:mm").format(new Date().getTime());
        String verificaEmail;
        String verificaSenaha;
        System.out.print("Digite seu email cadastrado: ");
        verificaEmail = scanner.next();
        System.out.print("Digite sua senha: ");
        verificaSenaha = scanner.next();
        boolean cond = true;

        for (int i = 0; i < email.length; i++) {
            if (email[i].equals(verificaEmail) && senha[i].equals(verificaSenaha)) {
                cond = false;
                if (new SimpleDateFormat("HH:mm").parse("06:00").before(new SimpleDateFormat("HH:mm").parse(horaEntrada))
                        && new SimpleDateFormat("HH:mm").parse("11:59").after(new SimpleDateFormat("HH:mm").parse(horaEntrada))) {
                    System.out.println("Bom dia, você se logou ao nosso sistema.");
                } else if (new SimpleDateFormat("HH:mm").parse("12:00").before(new SimpleDateFormat("HH:mm").parse(horaEntrada))
                        && new SimpleDateFormat("HH:mm").parse("17:59").after(new SimpleDateFormat("HH:mm").parse(horaEntrada))) {
                    System.out.println("Bom tarde, você se logou ao nosso sistema.");
                } else if (new SimpleDateFormat("HH:mm").parse("18:00").before(new SimpleDateFormat("HH:mm").parse(horaEntrada))
                        && new SimpleDateFormat("HH:mm").parse("23:59").after(new SimpleDateFormat("HH:mm").parse(horaEntrada))) {
                    System.out.println("Bom noite, você se logou ao nosso sistema.");
                } else {
                    System.out.println("Boa madrugada, você se logou ao nosso sistema.");
                }
                break;
            }
        }
        if (cond) {
            System.out.println("Usuário e/ou senha incorretos. ");
        }
    }

    public static void cadastro() {
        int cont = 0;
        for (int i = 0; i < email.length; i++) {
            if (email[i] == null) {
                cont = i;
                break;
            }
        }
        System.out.println("Digite seu email para cadastro: ");
        email[cont] = scanner.next();
        System.out.println("Digite seu senha: ");
        senha[cont] = scanner.next();
    }
}
