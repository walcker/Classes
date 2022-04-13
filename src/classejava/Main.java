package classejava;

public class Main {

    public static void main(String[] args) {
	    Usuario cynara = new Usuario("Cynara", "Grilo");//Contrutor com parâmetros

        Usuario walcker = new Usuario();//Construtor sem parâmetros
        walcker.nome = "Walcker";
        walcker.sobrenome = "Gomes";

        System.out.println(walcker.nome + " " + walcker.sobrenome);
        System.out.println(cynara.nome + " " + cynara.sobrenome);
    }
}
