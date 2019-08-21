package TheFirstDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

import org.junit.Test;

public class HelloWorld {
	
	public static void change(String str) {
		str = "qwe";
	}
	
	public static void main(String[] args) {
		String a = "asd";
		String b = "asd";
		
		a = "qwer";
		System.out.println(a);
		change(a);
		System.out.println(a);
		
		double c = 0.123456;
	}
	
	public void testLambda() {
		LinkedList list = new LinkedList(); 
	}
	
	@Test
	public void shenditest() {
		int a = 25;
		int b = 10;
		int c = 0;
		double result_a = 1.0;
		double result_b = 1.0;
		try {
			result_a = a/b;
			System.out.println("result_a: "+ result_a);
			result_b = b/c;
			System.out.println("result_b: "+result_b);
			result_b = 2.0;
		}
		catch(Exception e) {
			System.out.println("catch exception");
		}
		finally{
			System.out.println("finally");
		}
		System.out.println("result_a: "+result_a);
		System.out.println("result_b: "+result_b);
	}
	
	@Test
	public void shenditest2() {
		HashMap<String,String> k_v = new HashMap<String,String>();
		k_v.put("1", "oooo1");
		k_v.put("10","oooo10");
		k_v.put("2", "oooo2");
		k_v.put("5", "oooo5");
		k_v.put("3", "oooo3");
		
		
		TreeMap<Integer, String> map = new TreeMap<Integer,String>();
		k_v.forEach(
				(String key,String value)->{
					map.put(Integer.valueOf(key), value);
				}
		);
		
		ArrayList<Object> keyList = new ArrayList<>();
		keyList.addAll(map.keySet());
		System.out.println(keyList);
	}
	
	@Test
	public void shenditest3() {
		
	}

}
