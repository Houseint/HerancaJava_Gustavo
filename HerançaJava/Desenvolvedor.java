package HerançaJava;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Desenvolvedor extends Funcionarios {
    LocalDateTime horaAtual= LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String data= horaAtual.format(formatter);
    public Desenvolvedor(String nome, String departamento, double salario, String cpf, String dataNascimento){
        super(nome, departamento, salario, cpf, dataNascimento);
    }
    
    public Desenvolvedor(){}

    public void programar(){
        System.out.println("O desenvolvedor "+ getNome()+" programa em Java!");
    }
    @Override
    public void mostrarDados(){
        System.out.println("Nome do desenvolvedor: " + getNome());
        System.out.println("Departamento do desenvolvedor: " + getDepartamento());
        System.out.println("Salário do desenvolvedor: " + getSalario());
        System.out.println("CPF do desenvolvedor: " + getCpf());
        System.out.println("Data de nascimento do desenvolvedor: " + getdataNascimento());
    }
    public void baterPonto(){
        System.out.println("O desenvolvedor "+getNome()+" do departamento "+getDepartamento()+" bateu seu ponto as "+data);
    }
} 
    

