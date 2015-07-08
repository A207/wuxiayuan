package person;

public class Person {
  String name;
  int age;
  String address;
  
  //无参默认构造方法
  //Person (){
  //      System.out.println("Person 的默认构造方法被调用。。。")
  //}
  //有参构造方法
  Person(String n,int a,String add){
	  name=n;
	  age=a;
	  address=add;
  }
  //自我介绍
  void introduce(){
	  System.out.println("大家好，我叫"+name+",今年"+age+"岁了，我在"+address);
  }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
      Person person = new Person();
      person.name="张三";
      person.age=20;
      person.address="USA";
      */
		Person person =new Person("jin",30,"beijing");
      person.introduce(); 
	}

}
