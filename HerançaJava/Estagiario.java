package HerançaJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Estagiario extends Funcionarios {
    LocalDateTime horaAtual= LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String data= horaAtual.format(formatter);
    public Estagiario(String nome, String departamento, double salario, String cpf, String dataNascimento){
        super(nome, departamento, salario, cpf, dataNascimento);
    }
    public Estagiario(){}
    public void fazerTarefa(){
        System.out.println("O estagiário "+getNome()+" concluiu sua tarefa com sucesso em : "+ data);
    }
    @Override
    public void mostrarDados() {
        System.out.println("Nome do estagiário: " + getNome());
        System.out.println("Departamento do estagiário: " + getDepartamento());
        System.out.println("Salário do estagiário: " + getSalario());
        System.out.println("CPF do estagiário: " + getCpf());
        System.out.println("Data de nascimento do estagiário: " + getdataNascimento());
}
    public void baterPonto(){
        System.out.println("O estagiário "+getNome()+" do departamento "+getDepartamento()+" bateu seu ponto as "+data);
    }
    
}
