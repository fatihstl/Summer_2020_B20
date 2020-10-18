package Day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterator_Practice2 { // Arraylistte ahmetleri kaldirmak.
    public static void main(String[] args) {

        String [] arr = {"Ahmed", "Ahmed", "Abzal", "virginia"};

        ArrayList<String> names = new ArrayList<>(Arrays.asList(arr));
        Iterator<String> it = names.iterator();

       while( it.hasNext()){
           if(it.next().equals("Ahmed")){
               it.remove();
           }
       }

        System.out.println("=========================================================");

       // ahmetleri kaldirmanin diger yolu
        ArrayList<String> employee = new ArrayList<>(Arrays.asList(arr));
        for(Iterator<String>i= employee.iterator(); it.hasNext();) {
            if(i.next().equals("Ahmed")){
                i.remove();
            }
        }
        System.out.println(employee);

        System.out.println("=================================================");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        list.removeIf(p->p.equals("Ahmet"));
        System.out.println(list);
    }

    }


