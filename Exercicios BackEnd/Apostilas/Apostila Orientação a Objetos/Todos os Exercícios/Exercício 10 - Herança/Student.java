import java.util.Scanner;

public class Student extends Person {
    private String id;

    //Constructors
    public Student() {}
    public Student(String name, int rg, String id){
        super(name, rg);
        this.id = id;
    }

    //Getters
    public String getId() {
        return id;
    }
    //Setter
    public void setId(String id) {
        if (id == null || id.trim().isEmpty() || !id.matches("[0-9]{9}")){
            throw new IllegalArgumentException("A matrícula precisa ter 9 digitos e ser um número!");
        }
        this.id = id;
    }

    //Additional method
    public Student Student(String name, String rg, int id) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        setName(sc.nextLine());
        System.out.println("Digite a matricula: ");
        setId(sc.nextLine());
        System.out.println("Digite o rg: ");
        setRg(sc.nextInt());
        return new Student(getName(), getRg(), getId());
    }
    public void show() {
        super.show();
        System.out.println("Matrícula: " + getId());
    }
}
