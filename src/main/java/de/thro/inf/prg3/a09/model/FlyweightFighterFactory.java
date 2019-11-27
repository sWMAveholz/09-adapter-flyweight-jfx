package de.thro.inf.prg3.a09.model;

import de.thro.inf.prg3.a09.model.empire.TieBomber;
import de.thro.inf.prg3.a09.model.empire.TieFighter;
import de.thro.inf.prg3.a09.model.empire.TieInterceptor;
import de.thro.inf.prg3.a09.model.rebellion.AWing;
import de.thro.inf.prg3.a09.model.rebellion.XWing;
import de.thro.inf.prg3.a09.model.rebellion.YWing;
import de.thro.inf.prg3.a09.resource.FxImageLoaderAdapter;
import de.thro.inf.prg3.a09.resource.ResourceLoader;
import javafx.scene.image.Image;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class FlyweightFighterFactory {
	private Map<Integer, FlyweightFighter> flyweights = new HashMap<>();
	private final FxImageLoaderAdapter imLoader = new FxImageLoaderAdapter();

	public FlyweightFighterFactory() {

	}


	FlyweightFighter getFlyweightFighter(int id){
		if (flyweights.containsKey(id))
			return flyweights.get(id);

		FlyweightFighter fw;

		switch (id) {
			case 0:
				fw = new FlyweightFighter(imLoader.loadImage("fighter/awing.jpg"));
				break;
			case 1:
				fw = new FlyweightFighter(imLoader.loadImage("fighter/xwing.jpg"));
				break;
			case 2:
				fw = new FlyweightFighter(imLoader.loadImage("fighter/ywing.jpg"));
				break;
			case 3:
				fw = new FlyweightFighter(imLoader.loadImage("fighter/tiebomber.jpg"));
				break;
			case 4:
				fw = new FlyweightFighter(imLoader.loadImage( "fighter/tiefighter.jpg"));
				break;
			default:
				fw = new FlyweightFighter(imLoader.loadImage( "fighter/tieinterceptor.jpg"));
		}

		flyweights.put(id,fw);

		return fw;
	}
}
