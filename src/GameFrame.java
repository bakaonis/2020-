import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.util.*;
import java.util.Timer;
public class GameFrame extends JFrame{
	public GameFrame() throws InterruptedException {
		this.setTitle("»ð²ñÈË´òÓðÃ«Çò");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(1000,600);
		man1 man1= new man1();
		man1.setX(0);
		man1.setY(360);
		man2 man2= new man2();
		man2.setX(915);
		man2.setY(360);
		ball ball=new ball();
		ball.setX(100);
		ball.setY(0);
		Rectangle net=new Rectangle(460, 360, 1, 200);
//		ball bullet2= new ball();
//		bullet1.setX(700);
//		bullet2.setY(100);
		GamePlane plane =new GamePlane(man1,man2,ball);
		this.add(plane);
		this.setVisible(true);
		this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Keys.add(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                Keys.remove(e.getKeyCode());
            }
        });
		this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                keys1.add(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                keys1.remove(e.getKeyCode());
            }
        });
		
            	ElementBean.getGravity().add(man1);
            	ElementBean.getGravity().add(man2);
            	ElementBean.getGravity().add(ball);
            	CommonUtils.task(18, () -> {      
            	ball.judgehit1(man1.hit(ball),man1);
            	ball.judgehit2(man2.hit(ball),man2);
            	ball.judgenet(net);
            	man1.action();
            	man2.action();
            	ball.action();
            	man1.groundJudge();
            	man2.groundJudge();
            	ball.groundJudge();
    			ElementBean.getGravity().universalGravitation();
    			plane.repaint();
            	});   			          
	}
	
	public static void main(String[] args) throws InterruptedException {
			new GameFrame();	
	}

}
