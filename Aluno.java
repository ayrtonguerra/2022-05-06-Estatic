public class Aluno {
    //Variáveis de instância
    //instância = objeto
    String nome;
    int idade;

    //variável de classe
    static String instituicao = "USJT";

    //Esse é um método de instância
    public static void exibirNome(){
        System.out.println("Meu nome é: " + this.nome); //Em ambientes estáticos o this deixa de existir
    }
}