import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Class65 implements KeyListener, FocusListener {

	static final int anInt813 = 6;
	static final int anInt814 = 8;
	static final int anInt815 = 9;
	public static final int anInt816 = 0;
	static final int anInt817 = 36;
	static final int anInt818 = 65;
	static final int anInt821 = 32;
	static final int anInt830 = 103;
	static final int anInt834 = 58;
	public static final int anInt835 = 6;
	public static volatile int anInt831 = 0;
	public static int anInt823 = 0;
	public static int anInt833 = 0;
	public static Class65 aClass65_819 = new Class65();
	public static boolean[] aBoolArray820 = new boolean[112];
	public static int[] anIntArray824 = new int[128];
	public static int anInt822 = 0;
	static char[] aCharArray812 = new char[128];
	static int[] anIntArray825 = new int[128];
	public static int[] anIntArray826 = new int[128];
	public static int anInt827 = 0;
	public static int anInt828 = 0;
	public static int anInt829 = 0;
	public static int[] anIntArray832 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

	public final synchronized void keyPressed(KeyEvent var1) {
		if (aClass65_819 != null) {
			anInt831 = 0;
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < anIntArray832.length) {
				var2 = anIntArray832[var2];
				if ((var2 & 128) != 0) {
					var2 = -1;
				}
			} else {
				var2 = -1;
			}

			if (anInt823 * -1022982525 >= 0 && var2 >= 0) {
				anIntArray824[anInt823 * -1022982525] = var2;
				anInt823 = (anInt823 * -1022982525 + 1 & 127) * 245266475;
				if (anInt823 * -1022982525 == anInt822 * 20527529) {
					anInt823 = -245266475;
				}
			}

			int var3;
			if (var2 >= 0) {
				var3 = 1 + anInt833 * -735344103 & 127;
				if (anInt828 * 418546577 != var3) {
					anIntArray825[anInt833 * -735344103] = var2;
					aCharArray812[anInt833 * -735344103] = 0;
					anInt833 = var3 * -499240407;
				}
			}

			var3 = var1.getModifiers();
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) {
				var1.consume();
			}
		}

	}

	public final synchronized void keyReleased(KeyEvent var1) {
		if (aClass65_819 != null) {
			anInt831 = 0;
			int var2 = var1.getKeyCode();
			if (var2 >= 0 && var2 < anIntArray832.length) {
				var2 = anIntArray832[var2] & -129;
			} else {
				var2 = -1;
			}

			if (anInt823 * -1022982525 >= 0 && var2 >= 0) {
				anIntArray824[anInt823 * -1022982525] = ~var2;
				anInt823 = (anInt823 * -1022982525 + 1 & 127) * 245266475;
				if (anInt823 * -1022982525 == anInt822 * 20527529) {
					anInt823 = -245266475;
				}
			}
		}

		var1.consume();
	}

	public final void keyTyped(KeyEvent var1) {
		if (aClass65_819 != null) {
			char var2 = var1.getKeyChar();
			if (var2 != 0 && var2 != 65535 && Class31.method415(var2, 246013518)) {
				int var3 = 1 + anInt833 * -735344103 & 127;
				if (anInt828 * 418546577 != var3) {
					anIntArray825[anInt833 * -735344103] = -1;
					aCharArray812[anInt833 * -735344103] = var2;
					anInt833 = var3 * -499240407;
				}
			}
		}

		var1.consume();
	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (aClass65_819 != null) {
			anInt823 = -245266475;
		}

	}

	static char method883(char var0, byte var1) {
		switch (var0) {
			case ' ':
			case '-':
			case '_':
			case '\u00a0':
				return '_';
			case '#':
			case '[':
			case ']':
				return var0;
			case '\u00c0':
			case '\u00c1':
			case '\u00c2':
			case '\u00c3':
			case '\u00c4':
			case '\u00e0':
			case '\u00e1':
			case '\u00e2':
			case '\u00e3':
			case '\u00e4':
				return 'a';
			case '\u00c7':
			case '\u00e7':
				return 'c';
			case '\u00c8':
			case '\u00c9':
			case '\u00ca':
			case '\u00cb':
			case '\u00e8':
			case '\u00e9':
			case '\u00ea':
			case '\u00eb':
				return 'e';
			case '\u00cd':
			case '\u00ce':
			case '\u00cf':
			case '\u00ed':
			case '\u00ee':
			case '\u00ef':
				return 'i';
			case '\u00d1':
			case '\u00f1':
				return 'n';
			case '\u00d2':
			case '\u00d3':
			case '\u00d4':
			case '\u00d5':
			case '\u00d6':
			case '\u00f2':
			case '\u00f3':
			case '\u00f4':
			case '\u00f5':
			case '\u00f6':
				return 'o';
			case '\u00d9':
			case '\u00da':
			case '\u00db':
			case '\u00dc':
			case '\u00f9':
			case '\u00fa':
			case '\u00fb':
			case '\u00fc':
				return 'u';
			case '\u00df':
				return 'b';
			case '\u00ff':
			case 376:
				return 'y';
			default:
				return Character.toLowerCase(var0);
		}
	}

	public static void method888(int var0, int var1) {
		Class74.anInt892 = var0 * -1792776501;
	}

	static void method889(IndexDescriptor_Sub1 var0, int var1, int var2, int var3, byte var4, boolean var5, int var6) {
		long var7 = (long) ((var1 << 16) + var2);
		CacheableEntry_Sub23_Sub19 var9 = (CacheableEntry_Sub23_Sub19) Class97.aJagexMap_1379.get(var7);
		if (var9 == null) {
			var9 = (CacheableEntry_Sub23_Sub19) Class97.aJagexMap_1381.get(var7);
			if (var9 == null) {
				var9 = (CacheableEntry_Sub23_Sub19) Class97.aJagexMap_1384.get(var7);
				if (var9 != null) {
					if (var5) {
						var9.method2209();
						Class97.aJagexMap_1379.put(var9, var7);
						Class97.anInt1385 -= 61937553;
						Class97.anInt1378 += 913411167;
					}

				} else {
					if (!var5) {
						var9 = (CacheableEntry_Sub23_Sub19) Class97.aJagexMap_1386.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new CacheableEntry_Sub23_Sub19();
					var9.aClass94_Sub1_2450 = var0;
					var9.anInt2446 = var3 * -1975545549;
					var9.aByte2447 = var4;
					if (var5) {
						Class97.aJagexMap_1379.put(var9, var7);
						Class97.anInt1378 += 913411167;
					} else {
						Class97.aClass116_1395.method1460(var9);
						Class97.aJagexMap_1384.put(var9, var7);
						Class97.anInt1385 += 61937553;
					}

				}
			}
		}
	}

}
