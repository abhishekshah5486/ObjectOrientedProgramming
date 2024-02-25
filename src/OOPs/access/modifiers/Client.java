package OOPs.access.modifiers;

public class Client {
    public static void main(String[] args){
        Student s1  = new Student();
        s1.name = "Abhishek";
        s1.email = "abhishek.23bcs10065@ms.sst.scaler.com";
        s1.rollNo = 10065;
//        s1.password = "abi@mac";
        s1.PSP = 98;

        System.out.println(s1.email);

        Student s2 = s1;
        System.out.println(s1);
        System.out.println(s2);

//        s1.password = "34203"; // Cannot be accessed since private;
        System.out.println(s1.getPassword());
        s1.setPassword("imA@rble#13");
        System.out.println(s1.getPassword());
    }
}
