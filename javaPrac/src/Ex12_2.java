package chap_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Student{
	String name = " ";
	int ban;
	int no;
	
	public Student(String name, int ban, int no) {
		this.name=name;
		this.ban=ban;
		this.no=no;
	}
}

public class Ex12_2 {

	public static void main(String[] args) {
		ArrayList<Student> list= new ArrayList<>();
		list.add(new Student("JAVAK", 1, 1));
		list.add(new Student("JJANG", 1, 2));
		list.add(new Student("Hong", 2, 1));
		
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.name);
		}
	}

}
