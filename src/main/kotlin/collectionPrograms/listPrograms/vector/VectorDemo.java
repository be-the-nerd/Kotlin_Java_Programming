package collectionPrograms.listPrograms.vector;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//constructors :
//Vector<> v = new Vector<>() ->to create default vector of initial capacity 10
//Vector<> v = new Vector<>(int size) ->to create vector with initial capacity as size
//Vector<> v = new Vector<>(int size, int incr) ->to create vector with initial capacity as size and increment by incr
//Vector<> v = new Vector<>(Collection c) ->to create vector that contains the elements of collection c
public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> mammals = new Vector<>();
        //Adding elements ----------------------
        mammals.add("Dog");
        mammals.add("Horse");
        mammals.add(2,"Cat");  //add(index, element) -> returns void
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");
        animals.addAll(mammals);
        System.out.println("New Vector : "+animals);
        // -----------------------------------------


        //Updating elements ----------------------------
        mammals.set(0,"Dolphin");
        System.out.println("Updated Vector : "+ mammals);
        // ----------------------------------------------


        //Removing elements ---------------------------------
        animals.remove(0);
        System.out.println("After index removal : "+animals);
        animals.remove("Cat");
        System.out.println("After object removal : "+animals);
        // ---------------------------------------------------


        //Iterating elements ---------------------------------
        //for loop
        System.out.println("For loop : ");
        for (int i=0; i<animals.size(); i++){
            System.out.print(animals.get(i)+" ");
        }

        //for-each loop
        System.out.println();
        System.out.println("For each : ");
        for (String str: animals){
            System.out.print(str+" ");
        }

        //Enumeration
        System.out.println();
        System.out.println("Enumeration :");
        Enumeration<String> em = animals.elements();
        while (em.hasMoreElements()){
            System.out.print(em.nextElement()+" ");
        }

        //Iterator
        System.out.println();
        System.out.println("Iterator :");
        Iterator<String> value = animals.iterator();
        while (value.hasNext()){
            System.out.print(value.next()+" ");
        }
        // ---------------------------------------------------
    }
}
