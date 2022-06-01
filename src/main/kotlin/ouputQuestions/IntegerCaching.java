package ouputQuestions;

public class IntegerCaching {
    public static void main(String[] arr){

        Integer a1=new Integer(10);
        Integer a2=new Integer(10);
        if (a1==a2) {
            System.out.println("a1==a2");
        }else {
            System.out.println("a1!=a2");
        }

        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 500;
        Integer num4 = 500;

        if(num1==num2){
            System.out.println("num1 == num2");
        }
        else{
            System.out.println("num1 != num2");
        }
        if(num3 == num4){
            System.out.println("num3 == num4");
        }
        else{
            System.out.println("num3 != num4");
        }
    }
}

/*Output
num1 == num2
num3 != num4
*/

//Integer caching works only on autoboxing. Integer objects will not be cached when they are built using the constructor.
//