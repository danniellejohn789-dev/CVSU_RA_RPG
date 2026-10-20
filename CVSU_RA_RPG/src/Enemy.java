import java.util.Random;
import java.util.Scanner;

class Enemy{
	Random rand = new Random();

	String name;
	int hp, damage;

	Enemy(String name, int hp, int damage){
		this.name = name;
		this.hp = hp;
		this.damage = damage;
		
	}

	void enemyTurn(Player player, Scanner sc){
		System.out.println("boompanis");
	}
}
