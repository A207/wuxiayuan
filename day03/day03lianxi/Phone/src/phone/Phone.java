package phone;

public class Phone {
    //属性（特征）
	/**
	 * @param args
	 */
	 String name;
     String brand;
     int price;
     //void 方法d返回类型
     //call 方法名
    void call(){
 	   System.out.println("打电话...");
 	   
    }
   void sengMsg(){
 	  System.out.println("发短信...");
   }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Phone p=new Phone();
       p.name ="note";
       p.brand ="爆米花";
       p.price=99;
       System.out.println(p.name);
       System.out.println(p.brand);
       p.sengMsg();
	}

}
