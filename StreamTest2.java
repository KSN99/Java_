import java.util.Comparator;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		Stream<Student> student = Stream.of(
				new Student("Lee",3,300),
				new Student("KIM", 1, 200),
				new Student("Ahn", 2, 100)
				);
		
		student.sorted(Comparator.comparing(Student::getBan).reversed()
				.thenComparing(Comparator.naturalOrder()))
				.forEach(System.out::println);
	}

}

class Student implements Comparable<Student>{
	String name;
	int ban;
	int totalScore;
	Student(String name, int ban, int totalScore) {
		this.name=name;
		this.ban=ban;
		this.totalScore=totalScore;
	}
	
	public String toString() {
		return String.format("[%s,%d,%d]",name, ban,totalScore);}
	
	String getName() {return name;}
	int getBan() {return ban;}
	int getTotalScore() {return totalScore;}
	
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}
}
