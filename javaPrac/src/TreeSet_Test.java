package collection_Framework;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Test {

	public static void main(String[] args) {
		Set set = new TreeSet<>(new TestComp());
		
//		for (int i=0; set.size()<6; i++) {
//			int num = (int)(Math.random()*45)+1;
			set.add(new Test());
			set.add(new Test());
			set.add(new Test());
			set.add(new Test());
		
			System.out.println(set);
	}
}


//class Test{} 비교기준이 없음 

class Test{}

class TestComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {

		return 1;
	}
}

