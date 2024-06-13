public class Employee extends Person {
    private String sector;
    private String position;
    private String function;

    //Constructor
    public Employee() {
    }
    public Employee(String name, int age, String telephone, String sector, String position, String function) {
        super(name, age, telephone);
        this.sector = sector;
        this.position = position;
        this.function = function;
    }

    //Getters
    public String getSector() {
        return sector;
    }
    public String getPosition() {
        return position;
    }
    public String getFunction() {
        return function;
    }

    //Setters
    public void setSector(String sector) {
        this.sector = verifyString(sector);
    }
    public void setPosition(String position) {
        this.position = verifyString(position);
    }
    public void setFunction(String function) {
        this.function = verifyString(function);
    }

    //Additional methods
    public void show() {
        super.show();
        System.out.println("Sector: " + getSector());
        System.out.println("Position: " + getPosition());
        System.out.println("Function: " + getFunction());
    }
}
