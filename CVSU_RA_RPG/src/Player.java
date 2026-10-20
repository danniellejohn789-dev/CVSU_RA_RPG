import java.util.ArrayList;
import java.util.Scanner;

class Player{
	
	String name;
	int hp;
	Staff sta;
	Sword swo;

	ArrayList<Enemy> visibleEnemies = new ArrayList<>();

	Player(String name){
		this.name = name;
		this.hp = 3;
		this.sta = new Staff();
		this.swo = new Sword();
	}


	void showWeapons(){
		System.out.println("\n-- Steve's Weapons --");
		System.out.printf("%s: %d Damage\n",swo.name, swo.damage);
		System.out.printf("%s: %d Damage\n",sta.name, sta.damage);
	}

	void seeEnemy(Enemy ch){
		visibleEnemies.add(ch);
		System.out.printf("\n%s sees a %s\n",name, ch.name);
		System.out.printf("\t%s: %s HP %d Damage\n",ch.name, ch.hp, ch.damage);
	}

	void playerTurn(Scanner sml){

		for(Enemy enemy : visibleEnemies){
			System.out.printf("\n--- %s turn (%d HP) ---\n",name, hp);
			System.out.println("What do you do?");
			System.out.printf("\t[0] Attack %s: %d HP, %d Damage\n",enemy.name, enemy.hp, enemy.damage);

			System.out.print(": ");
			String ano = sml.nextLine();

			if(ano.equalsIgnoreCase("0")){
				System.out.printf("""
					\nWith which weapon?
					\t[1] %s
					\t[2] %s\n""",swo.name, sta.name);
				System.out.print(": ");
				int ano1 = sml.nextInt();
				
				if (enemy.hp == 0){
					System.out.printf("\n%s DEFEATED!",enemy.name);
					visibleEnemies.remove(enemy);
				}

				else if (ano1 == 1){
					if (enemy instanceof Knight){
						System.out.println("\nNasaktan ang " + enemy.name);
						enemy.hp -= 1;
					}else{
						System.out.println("\nNot Knight");
					}

				}
				else if (ano1 == 2){
					if(enemy instanceof Wizard){
						System.out.println("\nNasaktan ang " + enemy.name);
						enemy.hp -= 1;
					}else{
						System.out.println("\nNot Wizard");
					}
				}

				else{
					System.out.println("\nWhat in the hellyyyyyyy");
				}
			}

			else{
				System.out.println("\nWhat in the helly");
			}
		}
	}


}	
