class Wizard extends Enemy{
	
	Wizard(){
		super("Wizard", 2, 1);
	}
	
	@Override
	int max(){
		return 10;
	}

	@Override
	int answer(){
		return random1 * random2; 
	}

	@Override 
	String symbol(){
		return "*";
	}
}
