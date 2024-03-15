public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Vinícius";
        pessoa.idade = 20;

        pessoa.fazAniversaio();
        pessoa.fazAniversaio();
        pessoa.fazAniversaio();
        pessoa.fazAniversaio();
        pessoa.fazAniversaio();

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);

    }
}
