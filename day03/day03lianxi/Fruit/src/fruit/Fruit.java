package fruit;

public class Fruit {
	 String name;
     int price;
     String addr;
     
     Fruit(){}//默认构造方法
     Fruit(String n,int p,String a){
     	name = n;
     	price= p;
        addr = a;
     }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Fruit f =new Fruit("苹果",5,"山东");
       System.out.println(f.name);
	}

}
