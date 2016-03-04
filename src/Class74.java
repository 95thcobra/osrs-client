import java.awt.event.*;

public class Class74 implements MouseListener, MouseMotionListener, FocusListener {

	static int anInt907;
	static volatile int anInt892 = 0;
	public static volatile int anInt902 = 0;
	public static volatile int anInt894 = -1348394783;
	public static volatile int anInt895 = 768095319;
	public static volatile int anInt900 = 0;
	public static volatile int anInt893 = 0;
	public static volatile long aLong904 = 0L;
	public static volatile int anInt899 = 0;
	public static Class74 aClass74_901 = new Class74();
	public static int anInt896 = 0;
	public static int anInt897 = 0;
	public static int anInt898 = 0;
	public static int anInt903 = 0;
	public static int anInt891 = 0;
	public static int anInt905 = 0;
	public static long aLong906 = 0L;

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (aClass74_901 != null) {
			anInt892 = 0;
			anInt902 = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		if (aClass74_901 != null) {
			anInt892 = 0;
			anInt894 = var1.getX() * 1348394783;
			anInt895 = var1.getY() * -768095319;
		}

	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (aClass74_901 != null) {
			anInt892 = 0;
			anInt894 = -1348394783;
			anInt895 = 768095319;
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		if (aClass74_901 != null) {
			anInt892 = 0;
			anInt894 = var1.getX() * 1348394783;
			anInt895 = var1.getY() * -768095319;
		}

	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (aClass74_901 != null) {
			anInt892 = 0;
			anInt894 = var1.getX() * 1348394783;
			anInt895 = var1.getY() * -768095319;
		}

	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (aClass74_901 != null) {
			anInt892 = 0;
			anInt900 = var1.getX() * -2119037007;
			anInt893 = var1.getY() * -1430101257;
			aLong904 = Class10.method216((short) 255) * 5634011682046891849L;
			if (var1.isAltDown()) {
				anInt899 = -1723320540;
				anInt902 = -918589516;
			} else if (var1.isMetaDown()) {
				anInt899 = 1285823378;
				anInt902 = -459294758;
			} else {
				anInt899 = 642911689;
				anInt902 = 1917836269;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (aClass74_901 != null) {
			anInt902 = 0;
		}

	}

	public final void focusGained(FocusEvent var1) {
	}

	static void method1024(int var0) {
		Class135 var1 = null;

		try {
			var1 = Class21.method347("", Class7_Sub1.aClass82_1705.aString980, true, 963366455);
			DataBuffer var2 = Class15.aClass35_195.method472(841102390);
			var1.method1650(var2.data, 0, var2.pos * 1736753585, -1483506203);
		} catch (Exception var4) {
			;
		}

		try {
			if (var1 != null) {
				var1.method1641(431302819);
			}
		} catch (Exception var3) {
			;
		}

	}

	static String method1025(String var0, InterfaceDef var1, byte var2) {
		if (var0.indexOf("%") != -1) {
			int var3;
			for (var3 = 1; var3 <= 5; var3++) {
				while (true) {
					int var4 = var0.indexOf("%" + var3);
					if (var4 == -1) {
						break;
					}

					var0 = var0.substring(0, var4) + Class35.method471(Class34.method469(var1, var3 - 1, (byte) 17), -1998432103) + var0.substring(var4 + 2);
				}
			}

			while (true) {
				var3 = var0.indexOf("%dns");
				if (var3 == -1) {
					break;
				}

				String var7 = "";
				if (Class141.aAsyncJob_1640 != null) {
					int var5 = Class141.aAsyncJob_1640.intparam;
					String var6 = (var5 >> 24 & 255) + "." + (var5 >> 16 & 255) + "." + (var5 >> 8 & 255) + "." + (var5 & 255);
					var7 = var6;
					if (Class141.aAsyncJob_1640.result != null) {
						var7 = (String) Class141.aAsyncJob_1640.result;
					}
				}

				var0 = var0.substring(0, var3) + var7 + var0.substring(var3 + 4);
			}
		}

		return var0;
	}

}
