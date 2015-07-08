package exe03;

public class exe03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte b=5;
        short s=1;
        int i=1;
        //int i=0.5*2//可能损失精度
        long l=1;
       // float f=0.1;//可能损失精度
        float f=0;
        double d=0;
        //double d=0.5*10//可能损失精度
        byte k=(byte)(b+10);//强制类型转换
       // byte k=(byte)(b+200);//越界,运行结果为-56
        System.out.println(k);
        
	}

}
