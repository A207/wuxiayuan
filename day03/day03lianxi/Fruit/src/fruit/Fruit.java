package fruit;

public class Fruit {
	 String name;
     int price;
     String addr;
     
     Fruit(){}//Ĭ�Ϲ��췽��
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
       Fruit f =new Fruit("ƻ��",5,"ɽ��");
       System.out.println(f.name);
	}

}
