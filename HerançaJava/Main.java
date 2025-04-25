package HerançaJava;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Funcionarios funcionarios= new Funcionarios();
        Gerente gerente= new Gerente();
        Desenvolvedor desenvolvedor=new Desenvolvedor();
        Estagiario estagiario=new Estagiario();
        int op;

        do{
            System.out.println("Menu para cadrastar funcionários.\n");
            System.out.println("1- Cadastrar novo funcionário.(Gerente, desenvolvedor ou estagiário)");
            System.out.println("2- Exibir dados do funcionário desejado.");
            System.out.println("3- Sair do sistema.");
            System.out.println("Escolha uma opção: ");

            op= scanner.nextInt();
            scanner.nextLine();

            switch(op){
                case 1:
                    System.out.println("Cadastrar novo funcionário. Escolha (Gerente-Desenvolvedor-Estagiario): ");
                    String escolha= scanner.nextLine();
                    while (!escolha.equalsIgnoreCase("Gerente") && // Esse while é pra caso o usuário digite algo diferente das opções mostradas
                        !escolha.equalsIgnoreCase("Desenvolvedor") && // https://pt.stackoverflow.com/questions/298584/como-encerrar-o-input-quando-usar-o-hasnext-em-java achei aqui
                        !escolha.equalsIgnoreCase("Estagiário") && 
                        !escolha.equalsIgnoreCase("Estagiario")) {
                        System.out.println("Escolha inválida. Escolha (Gerente-Desenvolvedor-Estagiario): ");
                        escolha = scanner.nextLine().trim();
}
                    if (escolha.equalsIgnoreCase("Gerente")){
                        System.out.println("Digite o nome do gerente: ");
                        String nome= scanner.nextLine();
                        System.out.println("Digite o departamento que o gerente vai residir: ");
                        String departamento= scanner.nextLine();
                        System.out.println("Digite o salário do gerente: ");
                        double salario= scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Digite o CPF do gerente: ");
                        String cpf= scanner.nextLine();
                        System.out.println("Digite a data de nascimento do gerente: ");
                        String dataNascimento= scanner.nextLine();
                        gerente.setNome(nome);
                        gerente.setDepartamento(departamento);
                        gerente.setSalario(salario);
                        gerente.setCpf(cpf);
                        gerente.setdataNascimento(dataNascimento);
                        System.out.println("Gerente cadastrado com sucesso!");
                    }
                    if(escolha.equalsIgnoreCase("Desenvolvedor")){
                        System.out.println("Digite o nome do desenvolvedor: ");
                        String nome=scanner.nextLine();
                        System.out.println("Digite o departamento que o desenvolvedor vai residir: ");
                        String departamento= scanner.nextLine();
                        System.out.println("Digite o salário do desenvolvedor: ");
                        double salario= scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Digite o CPF do desenvolvedor: ");
                        String cpf= scanner.nextLine();
                        System.out.println("Digite a data de nascimento do desenvolvedor: ");
                        String dataNascimento= scanner.nextLine();
                        desenvolvedor.setNome(nome);
                        desenvolvedor.setDepartamento(departamento);
                        desenvolvedor.setSalario(salario);
                        desenvolvedor.setCpf(cpf);
                        desenvolvedor.setdataNascimento(dataNascimento);
                        System.out.println("Desenvolvedor cadastrado com sucesso!");
                    }
                    if(escolha.equalsIgnoreCase("Estagiário") || escolha.equalsIgnoreCase("Estagiario")){
                        System.out.println("Digite o nome do estagiário: ");
                        String nome=scanner.nextLine();
                        System.out.println("Digite o departamento que o estagiário vai residir: ");
                        String departamento=scanner.nextLine();
                        System.out.println("Digite o salário do estagiário: ");
                        double salario=scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Digite o CPF do estagiário: ");
                        String cpf= scanner.nextLine();
                        System.out.println("Digite a data de nascimento do estagiário: ");
                        String dataNascimento= scanner.nextLine();
                        estagiario.setNome(nome);
                        estagiario.setDepartamento(departamento);
                        estagiario.setSalario(salario);
                        estagiario.setCpf(cpf);
                        estagiario.setdataNascimento(dataNascimento);
                        System.out.println("Estagiário cadastrado com sucesso!");
                    }
                    break;
                case 2:
                    System.out.println("Escolha o funcionário que deseja exibir os dados: (Gerente-Desenvolvedor-Estagiario): ");
                    String escolha2= scanner.nextLine();
                    while(!escolha2.equalsIgnoreCase("Gerente") && !escolha2.equalsIgnoreCase("Desenvolvedor") && !escolha2.equalsIgnoreCase("Estagiário") && !escolha2.equalsIgnoreCase("Estagiario")){
                        System.out.println("Escolha inválida. Escolha (Gerente-Desenvolvedor-Estagiario): ");
                        escolha2= scanner.nextLine().trim();
                    }
                    if(escolha2.equalsIgnoreCase("Gerente")){
                        if(gerente.getNome()==null || gerente.getNome().isEmpty()){
                            System.out.println("Nenhum gerente foi cadastrado ainda.");
                        }else{
                            gerente.mostrarDados();
                        gerente.baterPonto();
                            gerente.realizarReuniao();
                        }
                    }
                    if(escolha2.equalsIgnoreCase("Desenvolvedor")){
                        if(desenvolvedor.getNome()==null || desenvolvedor.getNome().isEmpty()){
                            System.out.println("Nenhum desenvolvedor foi cadastrado ainda.");
                        }else{
                        desenvolvedor.mostrarDados();
                        desenvolvedor.baterPonto();
                        desenvolvedor.programar();
                    }
                }   
                    if(escolha2.equalsIgnoreCase("Estagiário") || escolha2.equalsIgnoreCase("Estagiario")){
                       if (estagiario.getNome()==null || estagiario.getNome().isEmpty()){
                            System.out.println("Nenhum estagiário foi cadastrado ainda.");
                        }else{
                        estagiario.mostrarDados();
                        estagiario.baterPonto();
                        estagiario.fazerTarefa();
                   } 
                }
                    break;
                case 3:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha entre 1,2 ou 3.");
                    break;
            }
        }while(op!=3);
        scanner.close();
    }
}