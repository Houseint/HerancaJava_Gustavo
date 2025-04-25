package HerançaJava;

public class Funcionarios implements Pessoa  {
    private String nome;
    private String departamento;
    private double salario;
    private String cpf;
    private String dataNascimento;

    public Funcionarios(String nome, String departamento, double salario, String cpf, String dataNascimento) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.cpf= cpf;
        this.dataNascimento= dataNascimento;
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
    @Override
    public String getCpf() {
        return cpf;
    }
    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public String getdataNascimento() {
        return dataNascimento;
    }
    @Override
    public void setdataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
        public Funcionarios(String nome, String departamento, double salario) {
            this.nome = nome;
            this.departamento = departamento;
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
