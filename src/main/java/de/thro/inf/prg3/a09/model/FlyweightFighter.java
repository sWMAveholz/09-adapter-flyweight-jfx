package de.thro.inf.prg3.a09.model;

import javafx.scene.image.Image;

public class FlyweightFighter {

	private final Image fighterImage;

	public FlyweightFighter(Image fighterImage) {
		this.fighterImage = fighterImage;
	}

	public Image getFighterImage() {
		return fighterImage;
	}




}
