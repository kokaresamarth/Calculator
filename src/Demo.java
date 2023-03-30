import java.util.*;

public class Demo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		System.out.println("------------------------------");
		ArrayList al1=new ArrayList();
		al1.add(100);
		al1.add(200);
		al1.add(300);
		al1.add(400);
		al1.add(500);
		System.out.println(al1);
		System.out.println("------------------------------------");
		al.add(3,444);
		System.out.println(al);
		System.out.println("-----------------------------------------");
		al.addAll(al1);
		System.out.println(al);
		System.out.println("-------------------------------------");
		System.out.println(al1.get(3));
		System.out.println("------------------------------------");
		System.out.println(al.indexOf(40));
		System.out.println("---------------------------------");
		System.out.println(al1.isEmpty());
		System.out.println("-------------------------------------");
		ArrayList al2=new ArrayList();
		System.out.println(al2.isEmpty());
	}

}
