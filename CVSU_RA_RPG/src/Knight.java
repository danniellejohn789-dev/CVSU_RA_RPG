class Knight extends Enemy{
	
	Knight(){
		super("Knight", 4, 1);
	}
	
	@Override
	int max(){
		return 100;
	}

	@Override
	int answer(){
		return random1 - random2; 
	}

	@Override 
	String symbol(){
		return "-";
	}
}
