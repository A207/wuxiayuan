
public class Army {

	
		 private Weapon[] w = null;

		 private int size = 0;

		
		 public Army(int i) {
		  w = new Weapon[i];
		 }

		 public void addWeapon(Weapon wa) {
		  if (size >= w.length) {
		   System.out.println("军队装备已满!");
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