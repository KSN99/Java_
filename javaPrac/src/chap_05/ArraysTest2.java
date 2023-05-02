package chap_05;

import java.util.Arrays;

public class ArraysTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] score= {4,4,2,3,6,7,8,9,9,1};
		int [] counter= new int[10];
		
		for(int i=0;i<score.length;i++) {
			counter[score[i]]++;
		}
		System.out.println(Arrays.toString(counter));
	}

}
