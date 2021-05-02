public class TestaCondicionalDois {
    public static void main(String[] args) {

        int idade = 17;
        boolean acompanhado = true;

        System.out.println("--TESTANDO CONDIÇÃO--");

        if(idade >= 18 || acompanhado) {
            System.out.println("Acesso liberado.");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
