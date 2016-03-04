import java.awt.*;
import java.io.IOException;

public class LinkedEntry_Sub9 extends LinkedEntry {

	static byte[][][] aByteArrayArrayArray1762;
	static int[] anIntArray1766;
	static final int anInt1767 = 16;
	int anInt1761;
	int anInt1765;
	int[] anIntArray1763;
	int[][] anIntArrayArray1764;

	public static void method1833(Component var0, byte var1) {
		var0.removeKeyListener(Class65.aClass65_819);
		var0.removeFocusListener(Class65.aClass65_819);
		Class65.anInt823 = -245266475;
	}

	LinkedEntry_Sub9(int var1, byte[] var2) {
		anInt1761 = var1 * 1057589195;
		DataBuffer var4 = new DataBuffer(var2);
		anInt1765 = var4.readUByte() * -170105547;
		anIntArray1763 = new int[anInt1765 * 35947805];
		anIntArrayArray1764 = new int[anInt1765 * 35947805][];

		int var3;
		for (var3 = 0; var3 < anInt1765 * 35947805; var3++) {
			anIntArray1763[var3] = var4.readUByte();
		}

		for (var3 = 0; var3 < anInt1765 * 35947805; var3++) {
			anIntArrayArray1764[var3] = new int[var4.readUByte()];
		}

		for (var3 = 0; var3 < anInt1765 * 35947805; var3++) {
			for (int var5 = 0; var5 < anIntArrayArray1764[var3].length; var5++) {
				anIntArrayArray1764[var3][var5] = var4.readUByte();
			}
		}

	}

	public static void method1834(Connection var0, boolean var1, int var2) {
		if (Class97.aConnection_1393 != null) {
			try {
				Class97.aConnection_1393.terminate();
			} catch (Exception var7) {
				;
			}

			Class97.aConnection_1393 = null;
		}

		Class97.aConnection_1393 = var0;
		GameClient.method3561(var1, (byte) 88);
		Class97.aDataBuffer_1396.pos = 0;
		DataBuffer.aClass109_Sub23_Sub19_1831 = null;
		Class97.aDataBuffer_1389 = null;
		Class97.anInt1390 = 0;

		while (true) {
			CacheableEntry_Sub23_Sub19 var3 = (CacheableEntry_Sub23_Sub19) Class97.aJagexMap_1381.method1537();
			if (var3 == null) {
				while (true) {
					var3 = (CacheableEntry_Sub23_Sub19) Class97.aJagexMap_1386.method1537();
					if (var3 == null) {
						if (Class97.aByte1388 != 0) {
							try {
								DataBuffer var8 = new DataBuffer(4);
								var8.writeByte(4);
								var8.writeByte(Class97.aByte1388);
								var8.writeShort(0);
								Class97.aConnection_1393.write(var8.data, 0, 4);
							} catch (IOException var6) {
								try {
									Class97.aConnection_1393.terminate();
								} catch (Exception var5) {
									;
								}

								Class97.anInt1387 += 629140595;
								Class97.aConnection_1393 = null;
							}
						}

						Class97.anInt1397 = 0;
						Class31.aLong387 = Class10.method216((short) 255) * 4667296355062474809L;
						return;
					}

					Class97.aClass116_1395.method1461(var3);
					Class97.aJagexMap_1384.put(var3, var3.key);
					Class97.anInt1385 += 61937553;
					Class97.anInt1377 += 434769637;
				}
			}

			Class97.aJagexMap_1379.put(var3, var3.key);
			Class97.anInt1378 += 913411167;
			Class97.anInt1382 -= 111830449;
		}
	}

}
