package de.thro.inf.prg3.a09.model;

import de.thro.inf.prg3.a09.model.empire.TieBomber;
import de.thro.inf.prg3.a09.model.empire.TieFighter;
import de.thro.inf.prg3.a09.model.empire.TieInterceptor;
import de.thro.inf.prg3.a09.model.rebellion.AWing;
import de.thro.inf.prg3.a09.model.rebellion.XWing;
import de.thro.inf.prg3.a09.model.rebellion.YWing;
import de.thro.inf.prg3.a09.resource.ResourceLoader;
import de.thro.inf.prg3.a09.util.NameGenerator;
import javafx.scene.image.Image;

import java.util.Random;

/**
 * Factory to create new fighters
 * Creates random fighters
 *
 * @author Peter Kurfer
 */
public final class FighterFactory {

	private static final int NumberOfKnownFighterTypes = 6;
	private final Random random;
	private final NameGenerator nameGenerator;
	private final ResourceLoader<Image> imageResourceLoader;
	private FlyweightFighterFactory fff = new FlyweightFighterFactory();

	public FighterFactory() {
		nameGenerator = new NameGenerator();
		random = new Random();
		imageResourceLoader = new ResourceLoader<>(Image::new);
	}

	/**
	 * Create a random Fighter
	 *
	 * @implNote the method has an implementation flaw because it always loads the fighters image
	 * @return a new Fighter instance
	 */
	public Fighter createFighter() {
		switch (random.nextInt(NumberOfKnownFighterTypes)) {
			case 0:
				return new AWing(nameGenerator.generateName(), fff.getFlyweightFighter(0));
			case 1:
				return new XWing(nameGenerator.generateName(), fff.getFlyweightFighter(1));
			case 2:
				return new YWing(nameGenerator.generateName(), fff.getFlyweightFighter(2));
			case 3:
				return new TieBomber(nameGenerator.generateName(), fff.getFlyweightFighter(3));
			case 4:
				return new TieFighter(nameGenerator.generateName(), fff.getFlyweightFighter(4));
			default:
				return new TieInterceptor(nameGenerator.generateName(), fff.getFlyweightFighter(5));
		}
	}
}
