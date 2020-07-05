import java.awt.*;
import javax.swing.*;
public class man2 extends BaseGravityElement{
	private int x,y,width,height,score=0;
	private Image image;
	public man2() {
		super(0,0);
		this.image=new ImageIcon("src/image/man2.png").getImage();
		this.width=100;
		this.height=170;
		this.direction=Direction.LEFT;
		this.xSpeed=8;
	}
	public Image getImage() {
		return this.image;	
	}
	public int getX(){
		return this.x;
	}
    public int getY(){
		return this.y;
	}
    public int getWidth() {
		return this.width;
    }
    public int getHeight() {
		return this.height;
    }
    public void setX(int x) {
    	this.x=x;
    }
    public void setY(int y) {
    	this.y=y;
    }
    public void setWidth(int width) {
    	this.width=width;
    }
    public void setHeight(int Height) {
    	this.height=Height;
    }
    protected void xMove() {
    	if (keys1.LEFT.use()) {
            if (this.x > 525) {
                this.x -= this.xSpeed;
            }
            this.direction = Direction.LEFT;//更改玩家方向
        } else if (keys1.RIGHT.use()) {
        	if (this.x <915) {
        	this.x += this.xSpeed;
        	}
        	this.direction = Direction.RIGHT;
        }
    }
    protected void yMove() {
    	if(this.getY()>360) {
    		this.setY(360);
    	}
    	if (keys1.UP.use()) {
            //在地面时,允许跳跃，设置初始向上加速度
            if (onTheGround()) {
                this.ySpeed = 30;
            }
            //向上的加速度递减直到为零
            if (this.ySpeed > 0) {
                ySpeed -= 1;
            }
            //y轴移动当前垂直速度
            this.y -= ySpeed;
        } else {
            ySpeed = 0;
        }
    	
    }
    public void groundJudge() {
		if(this.getY()>=360) this.onTheGround=true;
		else this.onTheGround=false;
	}
	@Override
	public boolean onTheGroud() {
		// TODO Auto-generated method stub
		return this.onTheGround;
	}
	public void hit(man1 man1) {
		if(keys1.HIT.use()) {
		if(this.intersects(man1)) {
			this.setY(0);
		}
	}
	}
	public Rectangle getRectangle() {
        return new Rectangle(this.x, this.y, this.width, 100);
     }
	public void action(man1 man1) {
		xMove();
		yMove();
		
	}
	public int hit(ball ball) {
		if(keys1.HIT.use()) { 
			this.image=new ImageIcon("src/image/man2.0.png").getImage();
		if(this.intersects(ball)) {
			return -1;
		}
	}else {
		this.image=new ImageIcon("src/image/man2.png").getImage();
	}
		return 0;
	}
}
