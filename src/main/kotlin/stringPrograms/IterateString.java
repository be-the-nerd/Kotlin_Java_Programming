package stringPrograms;

public class IterateString {

    public static void main(String[] args) {
        String str = "abcd";

        //Naive approach
        for(int i =0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }

        //toCharArray()
        System.out.print("Using toCharArray() : ");
        for (char c: str.toCharArray()){
            System.out.print(c+",");
        }

        //split()
        System.out.print("\nUsing split() : ");
        for (String s: str.split("")){
            System.out.print(s+",");
        }


    }
}
