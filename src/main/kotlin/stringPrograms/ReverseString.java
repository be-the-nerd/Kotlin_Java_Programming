package stringPrograms;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Divyansh"));
        System.out.println(reverseString("My name is Divyansh"));
    }

    static String reverseString(String str){

/*        //Using StringBuilder
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();*/

        //Using reverse iteration
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i=ch.length-1; i>=0; i--){
            rev += ch[i];
        }
        return rev;
    }
}
