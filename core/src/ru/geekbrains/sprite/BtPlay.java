package ru.geekbrains.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

import ru.geekbrains.base.Sprite;
import ru.geekbrains.math.Rect;
import ru.geekbrains.math.Rnd;

public class BtPlay extends Sprite {

    private Rect worldBounds;


    public BtPlay(TextureAtlas atlas) {
        super(atlas.findRegion("btPlay"));
        setHeightProportion(0.2f);
    }

    @Override
    public void resize(Rect worldBounds) {
        this.worldBounds = worldBounds;
        float posX = -0.1f;
        float posY = 0.01f;
        pos.set(posX, posY);
    }
}
