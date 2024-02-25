package OOPs.access.modifiers;

public class Student {
    public String name;
    protected double PSP;
    private String password;
    // Private attributes cannot be accessed outside the class,but only within the class
    String email;
    int rollNo;
    String batch;

    void login(){
        System.out.println("Student logged in successfully !");
    }
    void solveAssignment(){
        System.out.println("Assignments Solved !");
    }
    // Getter Function
    public String getPassword(){
        return this.password;
    }
    // Setter Function
    public void setPassword(String password){
        this.password = password;
    }
}
