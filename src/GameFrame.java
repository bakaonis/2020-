import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.util.*;
import java.util.Timer;
import javax.swing.JOptionPane;
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
		score1 sc1=new score1();
		score2 sc2=new score2();
		man2.setX(915);
		man2.setY(360);
		ball ball=new ball();
		ball.setX(100);
		ball.setY(0);
		Rectangle net=new Rectangle(460, 360, 1, 200);
//		ball bullet2= new ball();
//		bullet1.setX(700);
//		bullet2.setY(100);
		GamePlane plane =new GamePlane(man1,man2,ball,sc1,sc2);
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
            	ball.sci();
            	CommonUtils.task(18, () -> {
            		if(sc1.getp()>7||sc2.getp()>7) {
            			if(sc1.getp()>7) {
        				JOptionPane.showMessageDialog(null, "Play1 win");
            			}else if(sc2.getp()>7) {
            				JOptionPane.showMessageDialog(null, "Play2 win");
            			}
        				Constant.TIMER_STOP_ON_OFF=true;
        			}
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
    			sc1.gets(ball.getsc1());
    			sc2.gets(ball.getsc2());
    			
    			plane.repaint();
            	});   			          
	}
	
	public static void main(String[] args) throws InterruptedException {
			new GameFrame();	
	}

}
