package HerançaJava;

public class Desenvolvedor extends Funcionarios {
    public Desenvolvedor(String nome, String departamento, double salario){
        super(nome, departamento, salario);
    }
    
    public Desenvolvedor(){}

    public void programar(){
        System.out.println("O desenvolvedor"+ getNome()+" programa em Java!");
    }
    @Override
    public void mostrarDados(){
        System.out.println("Nome do desenvolvedor: " + getNome());
        System.out.println("Departamento do desenvolvedor: " + getDepartamento());
        System.out.println("Salário do desenvolvedor: " + getSalario());
    }
} 
    

