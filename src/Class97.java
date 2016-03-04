import java.awt.*;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.zip.CRC32;

public class Class97 {

	public static final int anInt1380 = 117;
	public static final int anInt1383 = 242;
	static DataBuffer aDataBuffer_1389;
	static Connection aConnection_1393;
	static int anInt1397 = 0;
	static JagexMap aJagexMap_1379 = new JagexMap(4096);
	public static int anInt1378 = 0;
	static JagexMap aJagexMap_1381 = new JagexMap(32);
	public static int anInt1382 = 0;
	static Class116 aClass116_1395 = new Class116();
	static JagexMap aJagexMap_1384 = new JagexMap(4096);
	public static int anInt1385 = 0;
	static JagexMap aJagexMap_1386 = new JagexMap(4096);
	public static int anInt1377 = 0;
	static DataBuffer aDataBuffer_1396 = new DataBuffer(8);
	static int anInt1390 = 0;
	static CRC32 aCRC32_1391 = new CRC32();
	static IndexDescriptor_Sub1[] aClass94_Sub1Array1392 = new IndexDescriptor_Sub1[256];
	static byte aByte1388 = 0;
	public static int anInt1394 = 0;
	public static int anInt1387 = 0;

	Class97() throws Throwable {
		throw new Error();
	}

	static void method1239(String var0, boolean var1, String var2, boolean var3, int var4) {
		if (var1) {
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var6) {
					;
				}
			}

			if (Class70.aString853.startsWith("win") && !var3) {
				Class67.method912(var0, 0, 1975590905);
				return;
			}

			if (Class70.aString853.startsWith("mac")) {
				Class70.method931(var0, 1, var2, -1814193715);
				return;
			}

			Class67.method912(var0, 2, 1890693413);
		} else {
			Class67.method912(var0, 3, 2103543587);
		}

	}

	public static void method1247(IndexDescriptor var0, int var1, int var2, int var3, boolean var4, byte var5) {
		Class104.anInt1454 = -438370161;
		Class104.aIndexDescriptor_1457 = var0;
		Class104.anInt1459 = var1 * -534518349;
		Class104.anInt1458 = var2 * 387363359;
		Class104.anInt1450 = var3 * 1862121751;
		Class99.aBool1407 = var4;
		Class29.anInt362 = 539316016;
	}

	static final void method1248(int var0, int var1, int var2, int var3, int var4) {
		for (int var5 = var1; var5 <= var3 + var1; var5++) {
			for (int var6 = var0; var6 <= var0 + var2; var6++) {
				if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
					Class32.aByteArrayArrayArray395[0][var6][var5] = 127;
					if (var6 == var0 && var6 > 0) {
						Class32.mapSquareHeights[0][var6][var5] = Class32.mapSquareHeights[0][var6 - 1][var5];
					}

					if (var0 + var2 == var6 && var6 < 103) {
						Class32.mapSquareHeights[0][var6][var5] = Class32.mapSquareHeights[0][1 + var6][var5];
					}

					if (var1 == var5 && var5 > 0) {
						Class32.mapSquareHeights[0][var6][var5] = Class32.mapSquareHeights[0][var6][var5 - 1];
					}

					if (var5 == var3 + var1 && var5 < 103) {
						Class32.mapSquareHeights[0][var6][var5] = Class32.mapSquareHeights[0][var6][var5 + 1];
					}
				}
			}
		}

	}

}
