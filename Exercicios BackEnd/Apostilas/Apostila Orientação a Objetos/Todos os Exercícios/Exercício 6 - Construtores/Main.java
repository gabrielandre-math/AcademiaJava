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
