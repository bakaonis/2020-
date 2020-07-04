import java.util.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
public enum Keys {
	LEFT(KeyEvent.VK_A),
	RIGHT(KeyEvent.VK_D),
	UP(KeyEvent.VK_W),
	HIT(KeyEvent.VK_SPACE);
	private final static Set<Integer> keySet=new HashSet<>();
	 Keys(int keyValue) {
	        this.keyValue = keyValue;
	    }

	    private int keyValue;//��ֵ

	    /**
	     * �Ƿ�ʹ����ĳ��
	     *
	     * @return
	     */
	    public boolean use() {
	        return keySet.contains(keyValue);
	    }

	    /**
	     * ��Ӱ���
	     *
	     * @param keyCode
	     */
	    public static void add(int keyCode) {
	        keySet.add(keyCode);
	    }

	    /**
	     * �Ƴ�����
	     *
	     * @param keyCode
	     */
	    public static void remove(int keyCode) {
	        keySet.remove(keyCode);
	    }
}
