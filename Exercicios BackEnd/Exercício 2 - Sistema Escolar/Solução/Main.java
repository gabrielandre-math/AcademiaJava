import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class EntradaInvalidaException extends Exception {
    public EntradaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
public class Main {
    public static void main(String[] args) {
        GroupClass group = new GroupClass();
        GroupClass turma1 = new GroupClass("Turma 1", "1A");
        GroupClass turma2 = new GroupClass("Turma 2", "2A");
        group.allClasses.add(turma1);
        group.allClasses.add(turma2);
        Student student = new Student();
        int controller = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                group.initialScreen();
                controller = sc.nextInt();
                if (controller < 1 || controller > 4) {
                    throw new EntradaInvalidaException("Entrada inválida! Digite apenas [ 1 ], [ 2 ], [ 3 ] ou [ 4 ].");
                }
                switch (controller) {
                    case 1:
                        System.out.println("Você deseja cadastrar esse aluno em qual turma:");
                        System.out.println("[ 1 ] - Turma A");
                        System.out.println("[ 2 ] - Turma B");
                        int controller2 = sc.nextInt();
                        if (controller2 != 1 && controller2 != 2) {
                            throw new EntradaInvalidaException("Digite apenas [ 1 ] ou [ 2 ].");
                        }
                        switch (controller2) {
                            case 1:
                                for (int i = 0; i < 3; i++) {
                                    System.out.println("Cadastrando o aluno: " + (i + 1));
                                    turma1.addStudentintoClasse(student.addStudent());
                                }
                                break;
                            case 2:
                                for (int i = 0; i < 3; i++) {
                                    System.out.println("Cadastrando o aluno: " + (i + 1));
                                    turma2.addStudentintoClasse(student.addStudent());
                                }
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                        break;
                    case 2:
                        if (!group.findStudentClassIntoGroup()) {
                            group.listCollectionClassStudent();
                        } else {
                            System.out.println("Não existe turma cadastrada!");
                        }
                        break;
                    case 3:
                        System.out.println(turma1.getName());
                        turma1.listClassStudent();
                        System.out.println(turma2.getName());
                        turma2.listClassStudent();
                        break;
                    default:
                        System.out.println("Você saiu!");
                        break;
                }
            } catch (EntradaInvalidaException e) {
                System.out.println(e.getMessage());
                sc.nextLine(); // Limpa o buffer do Scanner
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                sc.nextLine(); // Limpa o buffer do Scanner
            }
        } while(controller != 3);
    }
}
