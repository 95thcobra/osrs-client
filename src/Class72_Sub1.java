import java.awt.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class72_Sub1 extends Class72 implements MouseWheelListener {

	int anInt1844 = 0;

	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		anInt1844 += var1.getWheelRotation() * -1321561231;
	}

	public void method954(Component var1, int var2) {
		var1.removeMouseWheelListener(this);
	}

	public synchronized int method961(byte var1) {
		int var2 = anInt1844 * 2136067473;
		anInt1844 = 0;
		return var2;
	}

	public void method953(Component var1, byte var2) {
		var1.addMouseWheelListener(this);
	}

}
