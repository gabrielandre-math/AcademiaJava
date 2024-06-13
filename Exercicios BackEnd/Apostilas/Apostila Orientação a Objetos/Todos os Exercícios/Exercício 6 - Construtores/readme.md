# Construtores
## Exercício 6
**Descrição**: Criar uma classe chamada **Aluno** com 3 construtores, sendo que o primeiro recebe o nome e a matrícula
do aluno, o segundo recebe apenas a data de nascimento do aluno e o terceiro construtor recebe o nome do aluno, a data de nascimento
e o ano em que o aluno ingressou na faculdade. 

Crie uma classe **Principal**, com 3 objetos, cada um instanciando a classe com um construtor diferente.

## Solução
Classe **Main**
~~~java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        studentService.initialScreen();
        int controller = sc.nextInt();
        studentService.inputData(controller);
        studentService.listData();
    }
}
~~~
Classe **Student**
~~~java
import java.util.Calendar;

public class Student {
    private String name;
    private String matricula;
    private String dateYearOfBirth;
    private String dateYearAdmission;

    // Constructores
    public Student(String name, String matricula) {
        this.name = name;
        this.matricula = matricula;
    }

    public Student(String dateYearOfBirth) {
        this.dateYearOfBirth = dateYearOfBirth;
    }

    public Student(String name, String matricula, String dateYearOfBirth, String dateYearAdmission) {
        this.name = name;
        this.matricula = matricula;
        this.dateYearOfBirth = dateYearOfBirth;
        this.dateYearAdmission = dateYearAdmission;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDateYearOfBirth() {
        return dateYearOfBirth;
    }

    public String getDateYearAdmission() {
        return dateYearAdmission;
    }

    // Setters
    public void setName(String name) {
        if (name == null || name.trim().isEmpty() || !name.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+")) {
            throw new IllegalArgumentException("O nome deve conter apenas letras de A-Z e não pode ser nulo ou vazio!");
        }
        this.name = name;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || !matricula.matches("\\d{9}")) { // Ajuste para validar quatro dígitos conforme especificado
            throw new IllegalArgumentException("A matrícula deve ser um número válido de nove dígitos!");
        }
        this.matricula = matricula;
    }

    public void setDateYearOfBirth(String dateYearOfBirth) {
        this.dateYearOfBirth = verifyDate(dateYearOfBirth);
    }

    public void setDateYearAdmission(String dateYearAdmission) {
        this.dateYearAdmission = verifyDate(dateYearAdmission);
    }

    private String verifyDate(String dateYearToVerify) {
        if (dateYearToVerify == null || !dateYearToVerify.matches("\\d{4}")) {
            throw new IllegalArgumentException("O ano deve ser um ano válido de quatro dígitos!");
        }
        int year = Integer.parseInt(dateYearToVerify);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (year > currentYear) {
            throw new IllegalArgumentException("O ano não pode ser no futuro!");
        }
        return Integer.toString(year);
    }
}

~~~
Classe **StudentService**
~~~java
import java.util.Scanner;
import java.util.Calendar;
public class StudentService {
    Scanner sc = new Scanner(System.in);
    private String name, matricula, dateYearOfBirth, dateYearAdmission;

    private Student studentcase1 = new Student(this.name, this.matricula);
    private Student studentcase2 = new Student(this.dateYearOfBirth);
    private Student studentcase3 = new Student(this.name, this.matricula, this.dateYearOfBirth, this.dateYearAdmission);


    public StudentService() {}

    // Métodos
    public String verifyDate(String dateYearToVerify) {
        if (dateYearToVerify == null || !dateYearToVerify.matches("\\d{4}")) {
            throw new IllegalArgumentException("O ano deve ser um ano válido de quatro dígitos!");
        }
        int year = Integer.parseInt(dateYearToVerify);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (year > currentYear) {
            throw new IllegalArgumentException("O ano não pode ser no futuro!");
        }
        return Integer.toString(year);
    }

    public Student inputDataCase(int i) {
        switch (i) {
            case 1:
                System.out.println("Nome: ");
                studentcase1.setName(sc.nextLine());
                System.out.println("Matrícula: ");
                studentcase1.setMatricula(sc.nextLine());
                return studentcase1;
            case 2:
                System.out.println("Data de nascimento (ANO): ");
                studentcase2.setDateYearOfBirth(sc.nextLine());
                return studentcase2;
            case 3:
                System.out.println("Nome: ");
                studentcase3.setName(sc.nextLine());
                System.out.println("Matrícula: ");
                studentcase3.setMatricula(sc.nextLine());
                System.out.println("Data de nascimento (ANO): ");
                studentcase3.setDateYearOfBirth(sc.nextLine());
                System.out.println("Data de ingresso (ANO): ");
                studentcase3.setDateYearAdmission(sc.nextLine());
                return studentcase3;
            default:
                return null;
        }
    }

    public void inputData(int i) {
        inputDataCase(i);
    }

    public void listData() {
        if (studentcase1.getName() != null && studentcase1.getMatricula() != null) {
            System.out.println("Nome: " + studentcase1.getName() + " Matrícula: " + studentcase1.getMatricula());
        }
        if (studentcase2.getDateYearOfBirth() != null) {
            System.out.println("Data de nascimento: " + studentcase2.getDateYearOfBirth());
        }
        if (studentcase3.getName() != null && studentcase3.getMatricula() != null && studentcase3.getDateYearAdmission() != null && studentcase3.getDateYearAdmission() != null) {
            System.out.println("Nome: " + studentcase3.getName() + " Matrícula: " + studentcase3.getMatricula() + " Data de nascimento: " + studentcase3.getDateYearOfBirth() + " Data de ingresso: " + studentcase3.getDateYearAdmission());
        }
    }

    public void initialScreen() {
        System.out.println("Qual construtor você quer usar: ");
        System.out.println("[ 1 ] - Estudante(String name, String matricula)");
        System.out.println("[ 2 ] - Estudante(String dateYearOfBirth)");
        System.out.println("[ 3 ] - Estudante(String name, String matricula, String dateYearOfBirth, String dateYearAdmission)");
        System.out.println("Digite uma opção: ");
    }
}
~~~


Criado por _Gabriel André._
