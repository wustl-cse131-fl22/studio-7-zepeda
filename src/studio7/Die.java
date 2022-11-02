package studio7;

public class Die {
	private int n;

	public Die(int initn) {
		n = initn;
		int random = (int)((Math.random() * (n - 1)) + 1);
		System.out.println(random);
	}
	
	public static void main(String[] args) {
		Die d1 = new Die(10);
		//d1.Die();
	}

}
