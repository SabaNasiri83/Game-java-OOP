
public class Main {

	public static void main(String[] args) {
		Player1 saba = new Player1("Saba Nasiri", "AK47", 570); 
		System.out.println(saba.getName());
		System.out.println(saba.getWeapon());
		System.out.println(saba.getHealth());
		saba.damageByGun1();
		saba.damageByGun2();
		saba.damageByGun2();
		
		Player2 proSaba = new Player2("Saba Nasiri", "ShotGun", 80, true);
		proSaba.damageByGun1();
		

	}

}
