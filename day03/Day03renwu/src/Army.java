
public class Army {

	
		 private Weapon[] w = null;

		 private int size = 0;

		
		 public Army(int i) {
		  w = new Weapon[i];
		 }

		 public void addWeapon(Weapon wa) {
		  if (size >= w.length) {
		   System.out.println("����װ������!");
		   return;
		  } else {
		   w[size] = wa;
		   size++;
		  }
		 }

		 public void attackAll() {
		  for (Weapon wea : w) {
		   if (wea != null) {
		    wea.attack();
		   }
		  }
		 }

		 public void moveAll() {
		  for (Weapon wea : w) {
		   if (wea != null) {
		    wea.move();
		   }
		  }
		 }

		}