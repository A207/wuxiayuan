package demo;

public class Demo06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new A();
        new A();
	}

}
class A{
	static{
		System.out.println(1);
	}
	{
		System.out.println(2);
	}
	A(){
		System.out.println(3);
	}
}