package phone;

public class Phone {
    //���ԣ�������
	/**
	 * @param args
	 */
	 String name;
     String brand;
     int price;
     //void ����d��������
     //call ������
    void call(){
 	   System.out.println("��绰...");
 	   
    }
   void sengMsg(){
 	  System.out.println("������...");
   }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Phone p=new Phone();
       p.name ="note";
       p.brand ="���׻�";
       p.price=99;
       System.out.println(p.name);
       System.out.println(p.brand);
       p.sengMsg();
	}

}
