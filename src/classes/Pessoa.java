package classes;

public class Pessoa {
    private String nome = "Isa Moraes";
    private int idade;
    private double altura;

    // <modificador-acesso> <retorno> nomeDoMetado()
    public String pegarNome() {
        return nome;
    }
    
    /**
     * @param string
     */
    public void alterarNome(String string) {
        this.nome = nome;
        


    }

    public void alterarNome(double d) {
    }

    public void alterarIdade(int i) {
    }

    public void alterarAltura(double d) {
    }

    public char[] pegarIdade() {
        return null;
    }

    public char[] pegarAltura() {
        return null;
    }
}
