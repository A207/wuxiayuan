package person;

public class Person {
  String name;
  int age;
  String address;
  
  //�޲�Ĭ�Ϲ��췽��
  //Person (){
  //      System.out.println("Person ��Ĭ�Ϲ��췽�������á�����")
  //}
  //�вι��췽��
  Person(String n,int a,String add){
	  name=n;
	  age=a;
	  address=add;
  }
  //���ҽ���
  void introduce(){
	  System.out.println("��Һã��ҽ�"+name+",����"+age+"���ˣ�����"+address);
  }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
      Person person = new Person();
      person.name="����";
      person.age=20;
      person.address="USA";
      */
		Person person =new Person("jin",30,"beijing");
      person.introduce(); 
	}

}
