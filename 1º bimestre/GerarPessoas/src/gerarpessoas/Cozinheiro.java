package gerarpessoas;
public class Cozinheiro extends Pessoa{
    private String especialidade;
    private int tempoarea;
    private String localtrabalho;
    
    public Cozinheiro(String especialidade, int tempoarea, String localtrabalho, String nome, int idade, String genero){
        super(nome, idade, genero);
        this.especialidade = especialidade;
        this.localtrabalho = localtrabalho;
        setTempoarea(tempoarea);
    }
    public String getEspecialidade(String especialidade){
        return especialidade;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public String getLocaltrabalho(String localtrabalho){
        return localtrabalho;
    }
    public void setLocaltrabalho(String localtrabalho){
        this.localtrabalho = localtrabalho;
    }
    public int getTempoarea(){
        return tempoarea;
    }
    public void setTempoarea(int tempoarea){
        this.tempoarea = tempoarea;
    }
    @Override
    public String toString(){
        return "\nCozinheiro" + "\nEspecialidade: " + especialidade + "\nAnos na área: " + tempoarea + "\nLocal de trabalho: " + localtrabalho;
    }
}
