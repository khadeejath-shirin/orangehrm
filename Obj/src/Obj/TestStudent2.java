package Obj;

public class TestStudent2 {

	public static void main(String[] args) {
		TestStudent1 s1=new TestStudent1();
		TestStudent1 s2=new TestStudent1();
		
		s1.id=12;
		s1.name="Shafeeq";
		
		s2.id=13;
		s2.name="Shiri";
		
		System.out.println(s1.id+" "+s1.name);
		System.out.println(s2.id+" "+s2.name);

	}

}
