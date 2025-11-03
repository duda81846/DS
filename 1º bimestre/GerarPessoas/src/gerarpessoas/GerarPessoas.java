package gerarpessoas;
public class GerarPessoas {
    public static void main(String[] args) {
        Pessoa pessoaUm = new Pessoa("Maria", 15, "feminino");
        System.out.println(pessoaUm);
        
        Cozinheiro cozinheiroUm = new Cozinheiro("confeiteiro", 2, "Sodie", "Paulo", 24, "masculino");
        System.out.println(cozinheiroUm);
    }
    
}
