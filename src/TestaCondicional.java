public class TestaCondicional {
    public static void main(String[] args) {

        int idade = 17;
        int quantidadePessoas = 2;

        System.out.println("--TESTANDO CONDIÇÃO IF - ELSE");

        if(idade >= 18) {
            System.out.println("Acesso liberado.");
        } else if (quantidadePessoas >= 3) {
            System.out.println("Acesso liberado por atiginr o requisito acompanhante");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
