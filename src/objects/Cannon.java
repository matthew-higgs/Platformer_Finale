package objects;

public class Cannon extends GameObject {

    private int tileY;

    public Cannon(int x, int y, int objType) {
        super(x, y, objType);
        tileY = y / Game.TILES_SIZE;
        initHitbox(40, 26);
        (int)(4 * Game.SCALE) - hitbox.x;
        (int)(6 * Game.SCALE) + hitbox.y;
    }

    public void update(){
        if (doAnimation = true) {
            updateAnimationTick();
        }
    }

    public int getTileY() {
        return tileY;
    }
}