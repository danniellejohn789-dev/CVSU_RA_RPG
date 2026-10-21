import java.util.Random;
import java.util.Scanner;

class Enemy{
	Random rand = new Random();

	String name;
	int hp, damage;
	int random1, random2;

	Enemy(String name, int hp, int damage){
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}


	int max(){
		return 1;
	}									

	int answer(){
		return 1;
	}

	String symbol(){
		return "";
	}


	void enemyTurn(Player player, Scanner sml){

		System.out.printf("--- %s's turn ---\n",name);
		random1 = rand.nextInt(0,max());
		random2 = rand.nextInt(0,max());
			
		int answer = answer();
		System.out.printf("%s asks: %d %s %d\n",name, random1, symbol(), random2);
		System.out.print(": ");
		int ano = sml.nextInt();
		sml.nextLine();

		if (ano == answer){
			System.out.println("\n" + ano + " is Correct!");
		}else{
			player.hp -= damage;
			System.out.println("Wrong answer!!");
		}
	}
}
