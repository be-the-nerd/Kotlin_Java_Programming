package arrayPrograms;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverseIntArray(arr, 0, arr.length-1);
        printIntArray(arr, arr.length);
        System.out.println();
        char[] s = {'h','e','l','l','o'};
        reverseCharArray(s, 0, s.length-1);
        printCharArray(s, s.length);
    }

    private static void reverseCharArray(char[] s, int start, int end) {
        char temp;
        while (start<end){
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    private static void reverseIntArray(int[] arr, int start, int end) {
        int temp;
        while (start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printIntArray(int[] arr, int size){
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void printCharArray(char[] s, int size){
        for (int i=0; i<size; i++){
            System.out.print(s[i]+" ");
        }
    }
}
