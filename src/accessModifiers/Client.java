package accessModifiers;
import OOPs.access.modifiers.Student;

public class Client {
    public static void main(String[] args){
        Student s1 = new Student();
        // Protected can be accessed within the same package
        // Outside the package it has to be a child class to access protected properties
        // Default can only be accessed within the same package
        // Private can be accessed within the same class only.
        // public can be accessed anywhere
//        s1.PSP = 9.17;
//        s1.email = "abhishek.10065@google.com";
    }
}
