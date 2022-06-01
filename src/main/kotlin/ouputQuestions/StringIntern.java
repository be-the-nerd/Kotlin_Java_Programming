package ouputQuestions;

public class StringIntern {
    public static void main(String[] args) {
        String s1 = "Javatpoint";
        String s2 = s1.intern();
        String s3 = new String("Javatpoint");
        String s4 = s3.intern();
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s2==s3);
        System.out.println(s2==s4);
        System.out.println(s3==s4);

        // S1 refers to Object in the Heap Area
        String s5 = new String("GFG"); // Line-1

        // S2 now refers to Object in SCP Area
        String s6 = s5.concat("GFG"); // Line-2

        // S3 refers to Object in SCP Area
        String s7 = s6.intern(); // Line-3

        System.out.println(s6 == s7);

        // S4 refers to Object in the SCP Area
        String s8 = "GFGGFG"; // Line-4

        System.out.println(s7 == s8);
    }
}

//When the intern() method is executed then it checks whether the String equals to this String Object is in the pool or not.

//If it is available, then the string from the pool is returned. Otherwise, this String object is added to the pool and
// a reference to this String object is returned.

//It follows that for any two strings s and t, s.intern() == t.intern() is true if and only if s.equals(t) is true.