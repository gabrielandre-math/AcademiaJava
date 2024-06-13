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
