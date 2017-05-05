
public class Speedster extends Hero {

	public Speedster(String name) {
		super(name);
		this.boostSpeed();
	}

	private void boostSpeed() {
		this._speed += 50;
		if (this._speed > 100) {
			this._speed = 100;
		}
	}

}
