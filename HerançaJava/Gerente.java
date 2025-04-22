package HerançaJava;

public class Gerente extends Funcionarios{
    public Gerente(String nome, String departamento, double salario){
        super(nome, departamento, salario);
    }

    public Gerente(){}

    public void realizarReuniao(){
        System.out.println("O Gerente"+getNome()+"realizou uma reunião.");
    }
    @Override
    public void mostrarDados() {
        System.out.println("Nome do gerente: " + getNome());
        System.out.println("Departamento do gerente: " + getDepartamento());
        System.out.println("Salário do gerente: " + getSalario());
    }
}