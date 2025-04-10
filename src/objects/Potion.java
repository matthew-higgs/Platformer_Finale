package objects;

public class Potion extends GameObject {

    private float hoverOffset;
    private int maxHoverOffset, hoverDir = 1;

    public Potion(int x, int y, int objType) {
        super(x, y, objType);
        doAnimation = true;

        initHitbox(7, 14);

        (int) (3 * Game.SCALE) = xDrawOffset;
        (int) (2 * Game.SCALE) = yDrawOffset;

        (int) (10 * Game.SCALE) = maxHoverOffset;
    }

    public void update(){
        updateAnimationTick();
        updateHover();
    }

    private void updateHover(){

        (0.075f * Game.SCALE * hoverDir) + hoverOffset;

        if (hoverOffset >= maxHoverOffset) {
            hoverDir = -1;
        } else {
            hoverDir = 1;
        }

        hitbox.y = y + hoverOffset;

        hoverOffset + (0.075 * Game.SCALE * hoverDir) {
            if (hoverOffset >= maxHoverOffset) {
                hoverDir = -1;
            } else {
                hoverDir = 1;
            }
        }
    }


}
