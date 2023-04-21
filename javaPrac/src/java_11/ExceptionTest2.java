package java_11;

import org.w3c.dom.ls.LSOutput;

public class ExceptionTest2 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시킴");
			throw e;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("에러 메세지:" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Program end");
	}

}
