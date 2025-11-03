class Professor{//criar classe
    public String nome;//tipo de dado e nome dos atributos
    public String email;
    public int cargaHoraria;
    public double salario;
    public String titulacao;
    
    public String exibirProfessor1(){//criar oq vai ser apresentado quando rodar
        return  "\nNome: " + nome + "\nEmail: " + email + "\nCarga Horaria: " + cargaHoraria 
        + "\nSalário: R$" + salario + "\nTitulação " + titulacao;
    }
    public String exibirProfessor2(){//criar oq vai ser apresentado quando rodar
        return  "\nNome: " + nome + "\nEmail: " + email + "\nCarga Horaria: " + cargaHoraria 
        + "\nSalário: R$" + salario + "\nTitulação " + titulacao;
    }
}

class Main{
    public static void main(String[] args){
        Professor professorUm = new Professor();
        professorUm.nome = "Marcelo";
        professorUm.email = "professormarcelo@acib.com";
        professorUm.cargaHoraria = 20 ;
        professorUm.salario = 10000;
        professorUm.titulacao = "mestre";
        System.out.println("\nDocente: "  + professorUm.exibirProfessor1());
        Professor professorDois = new Professor();
        professorDois.nome = "Iriani";
        professorDois.email = "professorairiani@acib.com";
        professorDois.cargaHoraria = 20 ;
        professorDois.salario = 10000;
        professorDois.titulacao = "mestre";
        System.out.println("\nDocente: "  + professorDois.exibirProfessor2());
    }
}