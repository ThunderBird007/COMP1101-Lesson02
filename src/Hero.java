
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
	
	private void generateAbilities() {
		
	}
	
	public void fight() {

	}

	public void run() {

	}
}
