package de.thro.inf.prg3.a09.resource;

import javafx.scene.image.Image;

public class FxImageLoaderAdapter {
	private ResourceLoader<Image> resourceloader = new ResourceLoader<>(Image::new);

	public Image loadImage(String resourcePath){
		return resourceloader.loadResource(ClassLoader.getSystemClassLoader(),resourcePath);
	}

	public Image loadImage(ClassLoader resourceContext, String resourcePath){
		return resourceloader.loadResource(resourceContext,resourcePath);
	}
}
