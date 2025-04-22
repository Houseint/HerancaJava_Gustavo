package HerançaJava;

public class Funcionarios {
    private String nome;
    private String departamento;
    private double salario;

    public Funcionarios(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Funcionarios(){}
    
        public void mostrarDados() {
            System.out.println("Nome do funcionário: " + nome);
            System.out.println("Departamento do funcionário: " + departamento);
            System.out.println("Salário do funcionário: " + salario);
        }
    
    
        public void baterPonto(){
            System.out.println("O funcionário "+nome+" do departamento "+departamento+" bateu seu ponto.");
        }
    
}
