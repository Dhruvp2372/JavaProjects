package tenprojects;

import java.util.ArrayList;
import java.util.HashSet;

// HASHSET //

public class PartFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        HashSet<ArrayList> set = new HashSet<>();
 
       
        ArrayList<Integer> list1 = new ArrayList<>();
 

        ArrayList<Integer> list2 = new ArrayList<>();
 

        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);
        set.add(list1);
        set.add(list2);
 
        System.out.println(set.size());
	}

}
