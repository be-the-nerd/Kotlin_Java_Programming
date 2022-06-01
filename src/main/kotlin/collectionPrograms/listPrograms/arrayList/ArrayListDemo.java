package collectionPrograms.listPrograms.arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//constructors :
//ArrayList<> arr = new ArrayList<>(); ->to build an empty array list
//ArrayList<> arr = new ArrayList<>(c); ->to build an arraylist initialized with elements from collection c
//ArrayList<> arr = new ArrayList<>(N); ->to build an arraylist with initial capacity N
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<String>();
        //Adding elements -------------------------
        languages.add("Java");  //add(element) -> returns boolean
        languages.add("Kotlin");
        languages.add("HTML");
        languages.add("SQL");
        languages.add("Java");
        System.out.println("Languages : "+languages);

        languages.add(1,"Python");    //add(index, element) -> returns void
        System.out.println("Languages after addition : "+languages);
        //-------------------------------------------


        //Updating elements -------------------------
        languages.set(3,"C");
        System.out.println("Updated list after change : "+languages);
        //--------------------------------------------

        int i = languages.indexOf("Java");
        int j = languages.lastIndexOf("Java");
        System.out.println("First index : "+i+" Last Index : "+j);

        //Removing elements ----------------------------
        System.out.println();
        String str1 = languages.remove(2);  //removes element from specific position
        System.out.println("Removed element : "+str1);

        boolean result = languages.remove("Java");  //removes first "Java" : returns boolean
        System.out.println("New Arraylist : "+languages);
        //----------------------------------------------


        //Iterating elements -------------------------
        //for loop
        System.out.println("For Loop :");
        for (int counter = 0; counter < languages.size(); counter++) {
            System.out.print(languages.get(counter)+" ");
        }
        //for-each loop
        System.out.println();
        System.out.println("Advanced For Loop :");
        for (String str : languages) {
            System.out.print(str+" ");
        }
        //while loop
        System.out.println();
        System.out.println("While Loop :");
        int count = 0;
        while (languages.size() > count) {
            System.out.print(languages.get(count)+" ");
            count++;
        }
        //Iterator
        System.out.println();
        System.out.println("Iterator :");
        Iterator<String> iterate = languages.iterator();
        while (iterate.hasNext()){
            System.out.print(iterate.next()+" ");
        }
        //listIterator -> listIterator() , listIterator(index)
        ListIterator l = languages.listIterator();
        System.out.println();
        System.out.println("ListIterator : ");
        while (l.hasNext()){
            System.out.print(l.next()+" ");
        }
        //----------------------------------------------


        ArrayList<String> programmingLanguages = new ArrayList<String>();
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("Go");
        programmingLanguages.add("Dart");
        programmingLanguages.addAll(languages);  //add all elements -> default at the end of the list
        programmingLanguages.addAll(1,languages);  //add all elements at specified index of the list
        System.out.println();
        System.out.println("Programming languages : "+programmingLanguages);

        programmingLanguages.clear();  //clear() is faster than removeAll()
        programmingLanguages.removeAll(programmingLanguages);
        System.out.println(programmingLanguages);
    }
}
