import java.util.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
public enum keys1 {
	LEFT(KeyEvent.VK_LEFT),
	RIGHT(KeyEvent.VK_RIGHT),
	UP(KeyEvent.VK_UP),	
	HIT(KeyEvent.VK_NUMPAD0);
	private final static Set<Integer> keySet1=new HashSet<>();
	 keys1(int keyValue) {
	        this.keyValue = keyValue;
	    }

	    private int keyValue;//��ֵ

	    /**
	     * �Ƿ�ʹ����ĳ��
	     *
	     * @return
	     */
	    public boolean use() {
	        return keySet1.contains(keyValue);
	    }

	    /**
	     * ��Ӱ���
	     *
	     * @param keyCode
	     */
	    public static void add(int keyCode) {
	        keySet1.add(keyCode);
	    }

	    /**
	     * �Ƴ�����
	     *
	     * @param keyCode
	     */
	    public static void remove(int keyCode) {
	        keySet1.remove(keyCode);
	    }
}
