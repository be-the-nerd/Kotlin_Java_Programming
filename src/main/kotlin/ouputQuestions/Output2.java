package ouputQuestions;

public class Output2 {

    public static void main(String[] args) {
        Demo<Integer> iObj = new Demo<Integer>(15);
        System.out.println(iObj.returnObject());
        Demo<String> sObj = new Demo<String>("HelloWorld");
        System.out.println(sObj.returnObject());
    }
}
class Demo<T>{
    T obj;
    Demo(T obj){
        this.obj=obj;
    }
    public T returnObject(){
        return this.obj;
    }
}
