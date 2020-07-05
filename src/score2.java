import java.awt.Image;

import javax.swing.ImageIcon;

public class score2 extends BaseElement {
	private Image image;
	private String str;
	int width,height,po;
	public score2() {
		this.image=new ImageIcon("src/image/0.jpg").getImage();
		this.width=50;
		this.height=50;
	}
	public void gets(int p) {
		this.po=p;
		this.str="src/image/"+p+".jpg";
		this.image=new ImageIcon(str).getImage();
	}
	public int getp() {
		return this.po;
	}
	public Image getImage() {
		// TODO Auto-generated method stub
		return this.image;
	}
}
