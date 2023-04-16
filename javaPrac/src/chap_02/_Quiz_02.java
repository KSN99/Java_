package chap_02;

public class _Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//어린이 키에 따른 놀이기구 탑승 가능여부를 확인하는 프로그램
		//키가 120cm 이상인 경우만 ㅌ ㅏㅂ승 가능  , 삼항연산자 사용
		int height = 175;
		String result = (height >=120) ? "탑승 가능합니다": "탑승 불가능합니다.";
		System.out.println("키가" + height + "cm" + result);
		
	}
	}


