public class Class100 implements Runnable {

	public static final int anInt1408 = 32;
	public static final int anInt1409 = 218;
	static final int anInt1412 = 7;
	static final int anInt1413 = 10;
	static int anInt1415;
	public static final int anInt1417 = 54;
	public static final int anInt1418 = 176;
	static final int anInt1419 = 64;
	public static int anInt1410 = 0;
	public static JagexLinkedList aJagexLinkedList_1416 = new JagexLinkedList();
	public static JagexLinkedList aJagexLinkedList_1414 = new JagexLinkedList();
	public static Object anObject1411 = new Object();

	public static void method1259(byte var0) {
		Class104.aClass109_Sub5_Sub4_1453.method2843((byte) -15);
		Class104.anInt1454 = -438370161;
		Class104.aIndexDescriptor_1457 = null;
	}

	public void run() {
		try {
			while (true) {
				JagexLinkedList var1 = aJagexLinkedList_1416;
				LinkedEntry_Sub20 var2;
				synchronized (var1) {
					var2 = (LinkedEntry_Sub20) aJagexLinkedList_1416.method1405();
				}

				Object var14;
				if (var2 != null) {
					if (var2.anInt2071 * 1295328921 == 0) {
						var2.aClass68_2073.method920((int) var2.key, var2.aByteArray2072, var2.aByteArray2072.length, 1542703952);
						var1 = aJagexLinkedList_1416;
						synchronized (var1) {
							var2.unlink();
						}
					} else if (var2.anInt2071 * 1295328921 == 1) {
						var2.aByteArray2072 = var2.aClass68_2073.method914((int) var2.key, (short) -876);
						var1 = aJagexLinkedList_1416;
						synchronized (var1) {
							aJagexLinkedList_1414.add(var2);
						}
					}

					var14 = anObject1411;
					synchronized (var14) {
						if (anInt1410 * 1739579873 <= 1) {
							anInt1410 = 0;
							anObject1411.notifyAll();
							return;
						}

						anInt1410 = 825228632;
					}
				} else {
					Class24.method357(100L);
					var14 = anObject1411;
					synchronized (var14) {
						if (anInt1410 * 1739579873 <= 1) {
							anInt1410 = 0;
							anObject1411.notifyAll();
							return;
						}

						anInt1410 -= 953426465;
					}
				}
			}
		} catch (Exception var13) {
			Class72.method964((String) null, var13, (byte) 1);
		}
	}

}
