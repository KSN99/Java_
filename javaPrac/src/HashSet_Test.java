package collection_Framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSet_Test {

	public static void main(String[] args) {
		Object[] objArr = {"1",1,"2","2","3","3","4","4","4"};
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
			System.out.println(objArr[i]+"="+set.add(objArr[i]));
		}
		//hashSet 저장된 요소 출력
		System.out.println(set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
