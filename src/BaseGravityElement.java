import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
public abstract class BaseGravityElement extends BaseElement implements IGravity {
	protected boolean onTheGround;
	public BaseGravityElement(int x, int y) {
        super();
    }
	public boolean onTheGround() {
		return this.onTheGround;
	}
	public void setOnTheGround(boolean onTheGround) {
		this.onTheGround=onTheGround;
	}
	public float getQuality() {
		return 100;
	}
}
