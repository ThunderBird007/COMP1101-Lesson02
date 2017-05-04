
public class Hero {
	private int _strength;
	private int _speed;
	private int _health;
	private String _name;

	
	public int getStrength() {
		return this._strength;
	}
	
	public int getSpeed() {
		return this._speed;
	}
	
	public int getHealth() {
		return this._health;
	}

	public Hero(String name) {
		this._name = name;
		generateAbilities();
	}
	
	public void showAbilities() {
		System.out.print("+++++++++++++++++++++++++++++++++");
		System.out.print("Strength: " + this._strength);
		System.out.print("Speed: " + this._speed);
		System.out.print("Health: " + this._health);
		System.out.print("+++++++++++++++++++++++++++++++++");
	}
	
	private void generateAbilities() {
		this._strength = (int)(Math.random()*100 + 1);
		this._speed = (int)(Math.random()*100 + 1);
		this._health = (int)(Math.random()*100 + 1);
	}
	
	public void fight() {
		System.out.print(this._name + " is Fighting!");
	}

	public void run() {
		System.out.print(this._name + " is Running!");
	}
}
