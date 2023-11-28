package QuestionSolve;

class Employee{
    String name; double salary;
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    } 
    public void tostring(){
        System.out.println("name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee{
    String depertment;
    public Manager(String name, double salary, String depertment){
        super(name, salary);
        this.depertment = depertment;
    }
    public void tostring(){
        super.tostring();
        System.out.println("Depertment: " + depertment);
    }
}

class Executive extends Manager{
    public Executive(String name, double salary, String depertment){
        super(name, salary, depertment);
    }
    public void tostring(){
        super.tostring();
    }
}

public class Problem1{
    public static void main(String[] args) {
        Employee Emon = new Executive("Emon", 100, "CSE");
        Emon.tostring();
    }
}