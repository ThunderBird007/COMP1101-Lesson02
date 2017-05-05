
public class Villain extends Hero {

	public Villain(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void steals() {
		System.out.println(this.getName() + " is stealin");
	}
	
	public void kills() {
		System.out.println(this.getName() + " is goin' around killin'");
	}

}
