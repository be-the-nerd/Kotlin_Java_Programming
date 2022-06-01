package arrayPrograms;

public class MinAndMaxInArray {
    public static void main(String[] args) {
        int[] num = {5,7,2,4,9,6};
        findMinAndMax(num);
    }

    private static void findMinAndMax(int[] num) {
        int max = num[0];
        int min = num[0];

        for (int i=1; i<num.length; i++){
            if (num[i]>max){
                max = num[i];
            }
            if (num[i]<min){
                min = num[i];
            }
        }

        System.out.println("Minimum element : "+min);
        System.out.println("Maximum element : "+max);
    }
}
