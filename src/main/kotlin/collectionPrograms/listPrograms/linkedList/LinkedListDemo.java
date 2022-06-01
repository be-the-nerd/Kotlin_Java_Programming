package collectionPrograms.listPrograms.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//constructors :
//LinkedList<> l = new LinkedList<>() ->to create an empty linked list
//LinkedList<> l = new LinkedList<>(c) ->to create ordered list that contains all elements of Collection c
public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();
        //Adding elements--------------------------------
        ll.add("A");  //add(element) -> returns boolean
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add(2,"E");  //add(index, element) -> returns void
        System.out.println("LinkedList after addition : "+ll);
        //-------------------------------------------------


        //Updating elements--------------------------------
        ll.set(1,"For");
        System.out.println("Updated LinkedList : "+ll);
        //-------------------------------------------------


        //Removing elements -------------------------------
        ll.remove(2);
        System.out.println("After index removal : "+ll);
        ll.remove("For");
        System.out.println("After object removal : "+ll);
        //-------------------------------------------------


        //Iterating elements -------------------------------
        //for loop
        System.out.println("For loop : ");
        for (int i=0; i<ll.size(); i++){
            System.out.print(ll.get(i)+" ");
        }
        //for-each loop
        System.out.println();
        System.out.println("For each : ");
        for (String str: ll){
            System.out.print(str+" ");
        }
        //Iterator
        System.out.println();
        System.out.println("Iterator -> forward transversal");
        Iterator<String> s = ll.iterator();  //Iterator
        while (s.hasNext()){
            System.out.print(s.next()+" ");
        }
        //listIterator
        ListIterator itr = ll.listIterator(1);  //ListIterator
        System.out.println();
        System.out.println("ListIterator -> forward transversal");
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        System.out.println("ListIterator -> backward transversal");
        while (itr.hasPrevious()){
            System.out.print(itr.previous()+" ");
        }
        System.out.println();
        System.out.println("Next Index : "+itr.nextIndex());
        System.out.println("Previous Index : "+itr.previousIndex());  //as list is at the beginning. Hence -1
        //--------------------------------------------------

    }
}
