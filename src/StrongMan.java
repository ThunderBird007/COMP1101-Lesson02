
public class StrongMan extends Hero {

	public StrongMan(String name) {
		super(name);
		this.boostStrength();
	}
	private void boostStrength() {
		this._strength += 50;
		if (this._strength > 100) {
			this._strength = 100;
		}
	}
}
