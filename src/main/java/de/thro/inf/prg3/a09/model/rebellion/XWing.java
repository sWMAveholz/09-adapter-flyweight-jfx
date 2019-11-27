package de.thro.inf.prg3.a09.model.rebellion;

import de.thro.inf.prg3.a09.model.Fighter;
import de.thro.inf.prg3.a09.model.FlyweightFighter;
import de.thro.inf.prg3.a09.model.Force;
import javafx.scene.image.Image;

public class XWing extends Fighter {

	public XWing(String pilot, FlyweightFighter fighterImage) {
		super(pilot, fighterImage);
	}

	@Override
	public Force getSideOfForce() {
		return Force.LightSide;
	}

	@Override
	public String getFighterType() {
		return "X-Wing";
	}
}
