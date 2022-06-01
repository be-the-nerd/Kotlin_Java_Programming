package ouputQuestions;

public class ClassTypeCasting {

    public static void main(String[] args) {

        Base mem = new Derived();
        // Upcasting access only general property of
        // superclass
        mem.name = "Sneha";
        mem.phone = 9876543210l;
        // Calling function
        mem.chat();

        Derived ad = (Derived) mem;
        // Downcast to access specific property of subclass
        ad.addUser();
    }
}
class Base{
    String name;
    long phone;

    void chat() {
        System.out.println(name + " : chatting in whatsapp group");
    }
}
class Derived extends Base{
    void addUser() {
        System.out.println(name+" : adding a new user in whatsapp group");
    }
}
