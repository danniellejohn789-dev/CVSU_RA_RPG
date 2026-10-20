import java.util.Scanner;

class Wizard extends Enemy{
	
	Wizard(){
		super("Wizard", 2, 1);
	}

	@Override
	void enemyTurn(Player player, Scanner sml){
		System.out.printf("--- %s's turn ---",name);
		int random1 = rand.nextInt(0,10);
		int random2 = rand.nextInt(0,10);
		
		int answer = random1 * random2;
		System.out.printf("%s asks: %d * %d",name, random1, random2);
		System.out.print(": ");
		int ano = sml.nextInt();
		sml.nextLine();

		if (ano == answer){
			System.out.println("\n" + ano + " is Correct!");
		}else{
			player.hp -= 1;
			System.out.println("Wrong answer!!");
		}
		


	}
}
