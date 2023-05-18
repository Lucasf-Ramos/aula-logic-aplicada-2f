public class Main {
    public static void main(String[] args) {

        Pessoa adao = new Pessoa();
        Pessoa eva = new Pessoa();

        // definição do formato
        adao.nome = "Adão";
        adao.sobrenome = "silva";

        eva.nome = "Eva";
        eva.sobrenome = "silva";

        adao.Falar("ola eva");
        eva.Falar("ola querido");
    }
}