import java.awt.*;
import javax.swing.*;
public class GamePlane extends JPanel{
	private ball ball;
	private man2 man2;
	private man1 man1;
	private man1 bullet2;
	private score1 sc1;
	private score2 sc2;
	public GamePlane(man1 man1,man2 man2,ball ball,score1 sc1,score2 sc2) {
		this.man1=man1;
		this.man2=man2;
		this.ball=ball;
		this.sc1=sc1;
		this.sc2=sc2;
	}
	public void paint (Graphics g) {
		super.paint(g);
		Image back=new ImageIcon("src/image/back.png").getImage(); 
		//Image sc1=new ImageIcon("src/image/1.jpg").getImage();
		//Image sc2=new ImageIcon("src/image/1.jpg").getImage();
		Image zuo=new ImageIcon("src/image/zuo.png").getImage(); 
		Image you=new ImageIcon("src/image/you.png").getImage(); 
		//g.drawImage(sc1, 300, 0, 50, 50,  this);
		//g.drawImage(sc2, 600, 0, 50, 50,  this);
		g.drawImage(you, 60, 0, 100, 100,  this);
		g.drawImage(zuo, 860, 0, 100, 100,  this);
		g.drawImage(back, 0, 350, 1000, 221,  this);
		g.drawImage(sc1.getImage(),300, 0, 50, 50,  this);
		g.drawImage(sc2.getImage(),600, 0, 50, 50,  this);
		g.drawImage(man1.getImage(),man1.getX(), man1.getY(),man1.getWidth(),man1.getHeight(), this);
		g.drawImage(man2.getImage(),man2.getX(), man2.getY(),man2.getWidth(),man2.getHeight(), this);
		g.drawImage(ball.getImage(),ball.getX(), ball.getY(),ball.getWidth(),ball.getHeight(), this);
	}
}

