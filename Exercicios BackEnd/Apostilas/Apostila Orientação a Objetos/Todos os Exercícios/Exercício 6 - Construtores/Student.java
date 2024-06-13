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
