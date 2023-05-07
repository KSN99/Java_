
class Time {
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isValidHour(hour)) return;
		
		this.hour =hour;
	}

	//매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
	private boolean isValidHour(int hour) { // 내부에서만 쓰기때문에 private으로 설정. 테스트할 범위가 줄어듦
		return hour<0 || hour>23;
	}
	
	public int getHour() {return hour;}
}

public class EncapsulationTest {
	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(9);
		System.out.println(t.getHour());
	}

}
