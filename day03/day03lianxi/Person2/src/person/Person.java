package person;

public class Person {
      String name;
      int age;
      String address;
       
      public Person(){}
      public Person(String name,int age){
    	  this.name=name;
    	  this.age=age;
      }
      public Person(String name,int age,String address){
    	  this(name,age);//调用当前类的两个参数的构造方法
    	  this.address=address;
      }
      void hello(){
    	  System.out.println("hello...");
      }
      void introduce(){
    	  System.out.println("name:"+this.name+"\tage:"+this.age+"\taddress:"+this.address);
          this.hello();//thiss可以省略
        
      }
       
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person person =new Person("jim",20,"USA");
        person.introduce();
	}

}
