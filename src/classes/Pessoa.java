package classes;

public class Pessoa {
    //construtor

//    public Pessoa(String nomeDaPessoa, int idadeDaPessoa) {
//        nome = nomeDaPessoa;
//        idade = idadeDaPessoa;
//    }

    public String nome;
    public int idade;
    public double peso;
    public double altura;

    public void seApresentar() {
        System.out.println("Meu nome é" + nome + " e tenho a idade " + idade);
    }
}
