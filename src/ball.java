
import java.awt.*;
import javax.swing.*;
public class ball extends BaseGravityElement {
	private int x,y,width,height,dir,sc1,sc2,sc;
	private Image image;
	public ball() {
		super(0,0);
		this.image=new ImageIcon("src/image/qiu.png").getImage();
		this.width=25;
		this.height=25;
		this.direction=Direction.LEFT;
		this.xSpeed=0;
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
    public void sci() {
    	this.sc1=0;
    	this.sc2=0;
    }
    public int getsc1() {
		if(this.onTheGroud()) {
				if(this.x>500) {
					sc1++;
			}
		} 
		return this.sc1;
    }
    public int getsc2() {
		if(this.onTheGroud()) {
				if(this.x<500) {
					sc2++;
			}
		} 
		return this.sc2;
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
//    	if(this.xSpeed>0)
//    		this.xSpeed--;
    	if(this.x<0) {
			this.x=0;
		}
    	if(this.x>1000) {
			this.x=910;
		}
    	
    	if(this.dir==1) {
    	this.x+=this.xSpeed;
    	if(this.onTheGround&&this.xSpeed!=0) {
    		this.xSpeed--;
    	}
    }
    	else if(this.dir==-1) {
    		
        	this.x-=this.xSpeed;
        	if(this.onTheGround&&this.xSpeed!=0) {
        		this.xSpeed--;
        	}
        }
    }
    protected void yMove() {
    	if(this.y<0) {
			this.y=0;
		}
    	if(this.ySpeed>0)
    		this.ySpeed--;
    	this.y-=this.ySpeed;
    	
    }
	@Override
	public boolean onTheGroud() {
		// TODO Auto-generated method stub
		return this.onTheGround;
	}
	public void groundJudge() {
		if(this.getY()>=500) {
			this.onTheGround=true;
		    if(this.getX()<480) {
		    	this.setX(100);
		    	this.setY(0);
		    	this.xSpeed=0;
		    }else if (this.getX()>=480){
		    	this.setX(800);
		    	this.setY(0);
		    	this.xSpeed=0;
		    }
		    
		}
		else this.onTheGround=false;
	}
	public Rectangle getRectangle() {
        return new Rectangle(this.x, this.y, this.width, this.height);
     }
	public void action() {
		xMove();
		yMove();
	}
	public void judgehit1(int z,man1 man1) {
		if(z==1) {
			this.dir=1;
			if(this.getY()<=400&&this.getX()<=man1.getX()+man1.getWidth()/2) {
			this.ySpeed=28;
			this.xSpeed=13;
			}
			else if(this.getY()<=400&&this.getX()>man1.getX()+man1.getWidth()/2) {
				this.ySpeed=20;
				this.xSpeed=19;
				}
			else if(this.getY()>400&&this.getX()<=man1.getX()+man1.getWidth()/2) {
				this.ySpeed=28;
				this.xSpeed=18;
				
			}
			else if(this.getY()>400&&this.getX()>man1.getX()+man1.getWidth()/2) {
				this.ySpeed=30;
				this.xSpeed=18;
				
			}
		}
	}
	public void judgehit2(int z,man2 man2) {
		if(z==-1) {
			this.dir=-1;
			if(this.getY()<=400&&this.getX()<=man2.getX()+man2.getWidth()/2) {
				this.ySpeed=20;
				this.xSpeed=19;
				
			}
			else if(this.getY()<=400&&this.getX()>man2.getX()+man2.getWidth()/2) {
				this.ySpeed=28;
				this.xSpeed=13;
				}
			else if(this.getY()>400&&this.getX()<=man2.getX()+man2.getWidth()/2) {
				
				this.ySpeed=30;
				this.xSpeed=16;
			}
			else if(this.getY()>400&&this.getX()>man2.getX()+man2.getWidth()/2) {				
				this.ySpeed=28;
				this.xSpeed=15;
			}
		}
	}
	public void judgenet(Rectangle net) {
		if(this.getRectangle().intersects(net)) {
			this.xSpeed=1;
			if(this.dir==1)
				this.dir=0;
			else this.dir=1;
		}
	}
}
