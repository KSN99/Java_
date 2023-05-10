import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream(); // list를 스트림 변환
		intStream.forEach(System.out::print);
		System.out.println();
		
		// stream은 1회용 
		intStream = list.stream();
		intStream.forEach(System.out::print);
		System.out.println();
		
		Stream<String> strStream = Stream.of("a","b","c");
		strStream.forEach(System.out::println);
		
		IntStream intStream2 = new Random().ints(5,10); // 무한스트림 
		intStream2.limit(5).forEach(System.out::println); // 5개만 자르기 
		
		Stream<Integer> intStream3=Stream.iterate(0, n->n+2);
		intStream3.limit(5).forEach(System.out::println);
		
		Stream<Integer> oneStream = Stream.generate(()->1);
		oneStream.limit(5).forEach(System.out::println);
	}

}
