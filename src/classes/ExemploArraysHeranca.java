package classes;

public class ExemploArraysHeranca {
    public static void main(String[] args) {
        Galinha galinha = new Galinha();
        Urubu urubu = new Urubu();
        Coruja coruja = new Coruja();

        Ave[] aves = {galinha, coruja, urubu};

        for (int contador = 0; contador < aves.length; contador++) {
            Ave aveAtual = aves[contador];
            aveAtual.seApresentar();
        }
    }
}
