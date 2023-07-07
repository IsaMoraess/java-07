import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.alterarNome("Bob Esponja");
        pessoa.alterarAltura(1.9);
        pessoa.alterarIdade(20);

        System.out.println(pessoa.pegarNome());
        System.out.println(pessoa.pegarIdade());
        System.out.println(pessoa.pegarAltura());



    }
}
