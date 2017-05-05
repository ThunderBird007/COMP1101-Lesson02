
public class Project {

	public static void main(String[] args) {
		Hero hero = new Hero("Big Man");
		hero.fight();
		hero.run();
		hero.showAbilities();

		Villain villain = new Villain("Sly Man");
		villain.run();
		villain.steals();
		villain.showAbilities();
	}

}
