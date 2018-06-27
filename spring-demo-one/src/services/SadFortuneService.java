package services;

import java.util.Random;

public class SadFortuneService implements FortuneService {

	private String[] fortunes = {"This is such a bad day.", "I am depressed.", "This day couldn't be worse."};
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		return fortunes[random.nextInt(fortunes.length)];
	}

}
