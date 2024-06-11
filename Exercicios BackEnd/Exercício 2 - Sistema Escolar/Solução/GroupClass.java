import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class GroupClass {
    private String name;
    private String code;
    List<Student> students = new ArrayList<Student>();
    List<GroupClass> allClasses = new ArrayList<GroupClass>();
    //Constructors
    public GroupClass() {}
    public GroupClass(String name, String code) {
        this.name = name;
        this.code = code;
    }
    public GroupClass(String code) {
        this.code = code;
    }
    //Getter
    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
    //Setters
    public void setCode(String code) {
        if (code != null && code.matches("\\d+")) {
            this.code = code;
        } else {
            throw new IllegalArgumentException("O código deve ser um número!");
        }
    }

    public void setName(String name) {
        if (name != null && name.matches("[A-Za-z ]+")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("O nome deve conter apenas letras e espaços!");
        }
    }

    //Additional method
    public void listCollectionClassStudent() {
        System.out.println("Alunos encontrados na turma: ");
        for (GroupClass allClasses : allClasses) {

            System.out.println("___________________________________");
            System.out.println("Nome: " + allClasses.getName());
            System.out.println("Código: " + allClasses.getCode());
            System.out.println("___________________________________");
        }
    }
    public void addStudentintoClasse(Student student) {
        students.add(student);
    }
    public void addGroupClassStudent(GroupClass groupClass) {
        allClasses.add(groupClass);
    }
    public void listClassStudent() {
        int i = 0;
        if (students.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado na turma ");
        } else {
            for (Student student : students) {
                i++;
                System.out.println("Aluno número: " + i);
                System.out.println("___________________________________");
                System.out.println("Nome: " + student.getName());
                System.out.println("Idade: " + student.getAge());
                System.out.println("Id: " + student.getId());
            }
        }
    }
    public void initialScreen() {
        System.out.println("Digite a opção: ");
        System.out.println("[ 1 ] - Cadastrar aluno");
        System.out.println("[ 2 ] - Listar turmas");
        System.out.println("[ 3 ] - Listar alunos");
        System.out.println("[ 4 ] - Sair");
    }
    //Exist any class?
    public boolean findStudentClassIntoGroup() {
        for (GroupClass group : allClasses) {
            if (group.allClasses.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
