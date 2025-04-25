package HerançaJava;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Gerente extends Funcionarios{
    LocalDateTime horaAtual= LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String data= horaAtual.format(formatter);
    public Gerente(String nome, String departamento, double salario, String cpf, String dataNascimento){
        super(nome, departamento, salario, cpf, dataNascimento);
    }

    public Gerente(){}

    public void realizarReuniao(){
        System.out.println("O Gerente "+getNome()+" realizou uma reunião as "+data);
    }
    @Override
    public void mostrarDados() {
        System.out.println("Nome do gerente: " + getNome());
        System.out.println("Departamento do gerente: " + getDepartamento());
        System.out.println("Salário do gerente: " + getSalario());
        System.out.println("CPF do gerente: " + getCpf());
        System.out.println("Data de nascimento do gerente: " + getdataNascimento());    
    }
    public void baterPonto(){
        System.out.println("O gerente "+getNome()+" do departamento "+getDepartamento()+" bateu seu ponto as "+data);
    }
}