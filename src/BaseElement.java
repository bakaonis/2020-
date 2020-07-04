import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
public class BaseElement {
	protected int x, y;//坐标
	protected int width, height;//大小
	protected Image image;//绘制图像
	protected float xSpeed, ySpeed;//x轴与y轴的移动速度
	protected Direction direction;//方向 用于判断左右
	protected int hitheight=height/2;
	public void drawImage(Graphics g) {
        g.drawImage(this.image, this.x, this.y, this.width, this.height, null);
     }
     public Rectangle getRectangle() {
        return new Rectangle(this.x, this.y, this.width, this.hitheight);
     }
     public <E extends BaseElement> boolean intersects(E element) {
         return this.getRectangle().intersects(element.getRectangle());
     }
     public void action() {
         this.xMove();
         this.yMove();
     }
     protected void xMove() {
         this.x += direction.right() ? xSpeed : -xSpeed;
     }
     protected void yMove() {
         //暂时为空
     }
     public void setySpeed(float ySpeed) {
         this.ySpeed = ySpeed;
     }
}
