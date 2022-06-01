package collectionPrograms.listPrograms.arrayList;

/*Input: List = [1,10,2,2,10,3,3,3,4,5,5]
Output: List = [1,10,2,3,4,5]*/

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,10,2,2,10,3,3,3,4,5,5));
        System.out.println("Arraylist with duplicates :"+list);
        removeDuplicates(list);

/*        //JDK 8 - stream
        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Arraylist without duplicates using streams :"+newList);*/
    }

    private static void removeDuplicates(ArrayList<Integer> list) {
        Set<Integer> set = new HashSet<Integer>(list);  //Duplicate values are not allowed in Set
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<Integer>(set);
        System.out.println("Arraylist without duplicates :"+listWithoutDuplicates);
    }
}