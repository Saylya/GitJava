package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		int [] data= {10,34,123,70,45,100,-178,33,12,34};
		ArrayList<Integer> list= new ArrayList<>();
		for (int i:data)
			list.add(i);
		System.out.println(list);//will give ordered output ie. as it is, will not show sorted 
		Collections.sort(list);
		/*java c will check AL IS-A list or not ? yes it is
		generic data type of AL is Integer, 
		now java c will check if Integer(generic type) IS_A comparable or not 
		ie. does it implement comparable? yes it does
		so no error */
		System.out.println(list);
	}

}
