import java.util.Scanner;

class Main {
	public static void main(String[] args){		
		System.out.println("""
				Turn Based RPG
				--------------
				[1] Play
				[2] Quit""");

		Scanner sml = new Scanner(System.in);
		System.out.print(": ");
		String input = sml.nextLine();

		switch(input){
			case "1":
				playGame(sml);
				break;
			case "2":
				return;

			default:
				System.out.println("\nWhat the helly");
				return;
		}

		
		sml.close();

	}

	static void playGame(Scanner sml){
		Player player = new Player("Steve");
		player.showWeapons();

		//Wave 1: A single Knight
		player.seeEnemy(new Knight());
		battle(player, sml);
		
		//Wave 2: Second wave, 1 Knight 2 Wizards
		player.seeEnemy(new Knight());
		player.seeEnemy(new Wizard());
		player.seeEnemy(new Wizard());
		battle(player, sml);
	}


	static void battle(Player player, Scanner sml){
		while(!player.visibleEnemies.isEmpty() && player.hp > 0){
			player.playerTurn(sml);

			for (Enemy enemy : player.visibleEnemies){
				enemy.enemyTurn(player, sml);
			}
		}
	}
}
