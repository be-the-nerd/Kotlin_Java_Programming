package ouputQuestions;

public class Output1 {

    public static void main(String[] args) {
        Output1 p = new Output1();
        p.start();
    }

    void start(){
        boolean b1 = false;
        boolean b2 = fix(b1);
        System.out.println(b1+" "+b2);
    }

    boolean fix(boolean b1){
        b1 = true;
        return b1;
    }
}
