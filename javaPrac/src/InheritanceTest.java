package chap_06;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

class Tv {
	boolean power;
	int channel;
	
	void power() { power=!power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv{
	boolean caption;
	void displayCation(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

class InheritanceTest {
	public static void main(String args[]) {
		CaptionTv c = new CaptionTv();
		c.channel = 10 ;
		c.channelUp();
		System.out.println(c.channel);
		c.displayCation("Hello World");
		c.caption=true;
		c.displayCation("Hello World");
	}
}
