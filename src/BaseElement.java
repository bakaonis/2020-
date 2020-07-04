import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
public class BaseElement {
	protected int x, y;//����
	protected int width, height;//��С
	protected Image image;//����ͼ��
	protected float xSpeed, ySpeed;//x����y����ƶ��ٶ�
	protected Direction direction;//���� �����ж�����
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
         //��ʱΪ��
     }
     public void setySpeed(float ySpeed) {
         this.ySpeed = ySpeed;
     }
}
