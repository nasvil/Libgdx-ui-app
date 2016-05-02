package com.nauv.gdx.ui.testapp;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import com.nauv.gdx.ui.BaseScreen;
import com.nauv.gdx.ui.UiApp;

/**
 * an example game using the gdx-ui-app stuff.
 * 
 * @author trey miller
 * 
 */
public class TestApp extends UiApp {
	@Override
	protected String atlasPath() {
		return "data/tex.atlas";
	}

	@Override
	protected String skinPath() {
		return null;
	}
	@Override
	protected void styleSkin(Skin skin, TextureAtlas atlas) {
		new Styles().styleSkin(skin, atlas);
	}

	@Override
	protected BaseScreen getFirstScreen() {
		return new MainScreen(this);
	}

}
