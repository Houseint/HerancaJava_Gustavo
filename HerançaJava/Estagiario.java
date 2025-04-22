package HerançaJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Estagiario extends Funcionarios {
    public void fazerTarefa(){
        LocalDateTime horaAtual= LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String data= horaAtual.format(formatter);
        System.out.println("O estagiário"+getNome()+" concluiu sua tarefa com sucesso em : "+ data);
    }
    @Override
    public void mostrarDados() {
        System.out.println("Nome do estagiário: " + getNome());
        System.out.println("Departamento do estagiário: " + getDepartamento());
        System.out.println("Salário do estagiário: " + getSalario());
}
}
