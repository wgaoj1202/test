package StreamTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class TestStream {
	
	int i = 10;
	int j;
	char z = 1;
	boolean b;

	public static void main(String[] args) {
		TestStream a= new TestStream();
		a.amethod();
	}
	
	public void amethod() {
		System.out.println(j);
		System.out.println(b);
	}
	
	//栈溢出，方法栈，递归调用某方法
	//堆溢出，对象堆，list无限加byte[1024*1024]；

	@Test
	public void testOne() {
		String str1 = "hello";
		String str2 = "he" + new String("llo");
		System.out.println(str1 == str2);
		System.out.println("succss!");
	}
	
}	
