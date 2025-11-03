package gerarpessoas;
public class Pessoa {
    private String nome;
    private int idade;
    private String genero;
    
    public Pessoa(String nome, int idade, String genero){
        this.nome = nome;
        this.genero = genero;
        setIdade(idade);
    }
    public String getNome(String nome){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getGenero(String genero){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        if(idade > 18 && idade <= 80){
            this.idade = idade;
        } else{
            this.idade = 0;
        }
    }
    @Override
    public String toString(){
        return "Pessoa" + "\nNome: " + nome + "\nIdade: " + idade + "\nGênero: " + genero;
    }
}
