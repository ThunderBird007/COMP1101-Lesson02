
public class Project {

	public static void main(String[] args) {
		//Hero hero = new Hero("Big Man");
		StrongMan hero = new StrongMan("Big Man");
		hero.fight();
		hero.run();
		hero.showAbilities();

		Villain villain = new Villain("Sly Man");
		villain.run();
		villain.steals();
		villain.showAbilities();
		
		Vigilante vigilante = new Vigilante("Ms. Savage");
		vigilante.run();
		vigilante.steals();
		vigilante.dealsJustice();
		vigilante.showAbilities();
		
		
		
	}

}
