public class Class84 {

	static final int anInt997 = 12;
	static final int anInt998 = 2;
	public static final int anInt1000 = 174;
	public static final int anInt1001 = 202;
	static final int anInt1002 = 36;
	public static final int anInt1003 = 67;
	static char[] aCharArray996 = new char[]{' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', 376, '\u00f1', '\u00d1', '\u00df'};
	static char[] aCharArray999 = new char[]{'[', ']', '#'};

	Class84() throws Throwable {
		throw new Error();
	}

	static void method1090(int var0, byte[] var1, PacketEncoder var2, int var3) {
		LinkedEntry_Sub20 var4 = new LinkedEntry_Sub20();
		var4.anInt2071 = 0;
		var4.key = (long) var0;
		var4.aByteArray2072 = var1;
		var4.aClass68_2073 = var2;
		JagexLinkedList var5 = Class100.aJagexLinkedList_1416;
		synchronized (var5) {
			Class100.aJagexLinkedList_1416.add(var4);
		}

		Object var10 = Class100.anObject1411;
		synchronized (var10) {
			if (Class100.anInt1410 * 1739579873 == 0) {
				Class50.aClass73_693.submitRunnable(new Class100(), 5, (byte) 7);
			}

			Class100.anInt1410 = 825228632;
		}
	}

	static void setupContainerMap() {
		ItemContainer.activeContainers = new JagexMap(32);
	}

}
