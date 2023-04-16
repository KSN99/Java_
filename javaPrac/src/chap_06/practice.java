package chap_06;

public class practice {

	public static void main(String[] args) {
		
		String[]words = {"television","mouse"};
		for(int i=0; i<words.length;i++) {
			char[] question = words[i].toCharArray();
			
			for(int j=0; j<question.length;j++) {
				int idx = (int) (Math.random()*question.length);
				
				char tmp = question[i];
				question[i]=question[idx];
				question[idx]=tmp;
				System.out.println(question);
			}
			if(words[i].equals("television")) {
				System.out.println("Correct");
			} else System.out.println("no");
		}
		
	}
}
