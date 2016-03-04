import java.awt.*;
import java.io.File;
import java.io.RandomAccessFile;

public final class Class32 {

	static final int anInt390 = 104;
	static byte[][][] aByteArrayArrayArray394;
	static byte[][][] aByteArrayArrayArray395;
	static int[][] anIntArrayArray396;
	static int[] anIntArray398;
	static int[] anIntArray399;
	static final int anInt400 = 2340;
	static final int anInt403 = 1170;
	static byte[][][] aByteArrayArrayArray407;
	static int anInt410;
	public static final int anInt411 = 197;
	public static final int anInt412 = 59;
	static int[][][] mapSquareHeights = new int[4][105][105];
	static byte[][][] mapSettings = new byte[4][104][104];
	static int anInt392 = -1368485481;
	static int[] anIntArray401 = new int[]{1, 2, 4, 8};
	static int[] anIntArray409 = new int[]{16, 32, 64, 128};
	static int[] anIntArray393 = new int[]{1, 0, -1, 0};
	static int[] anIntArray404 = new int[]{0, -1, 0, 1};
	static int[] anIntArray405 = new int[]{1, -1, -1, 1};
	static int[] anIntArray406 = new int[]{-1, -1, 1, 1};
	static int anInt397 = ((int) (Math.random() * 17.0D) - 8) * 1624995311;
	static int anInt408 = ((int) (Math.random() * 33.0D) - 16) * -1659611771;

	Class32() throws Throwable {
		throw new Error();
	}

	public static int method455(int var0, int var1, int var2, byte var3) {
		var2 &= 3;
		return var2 == 0 ? var0 : (var2 == 1 ? var1 : (var2 == 2 ? 7 - var0 : 7 - var1));
	}

	static void method464(int var0) {
		int var1 = GameClient.anInt2848 * -467838879;
		int var2 = GameClient.anInt2847 * -1456024027;
		int var3 = Class2.anInt17 * 1822130227 - Class5.anInt98 * 2104430923 - var1;
		int var4 = CacheableEntry_Sub23_Sub16_Sub1.anInt2503 * -733282123 - Class60.anInt769 * -1064642111 - var2;
		if (var1 > 0 || var3 > 0 || var2 > 0 || var4 > 0) {
			try {
				Container var5 = GameClient.aGameClient2857.method3457(-288911122);
				int var6 = 0;
				int var7 = 0;
				if (Class57.aFrame740 == var5) {
					Insets var8 = Class57.aFrame740.getInsets();
					var6 = var8.left;
					var7 = var8.top;
				}

				Graphics var10 = var5.getGraphics();
				var10.setColor(Color.black);
				if (var1 > 0) {
					var10.fillRect(var6, var7, var1, CacheableEntry_Sub23_Sub16_Sub1.anInt2503 * -733282123);
				}

				if (var2 > 0) {
					var10.fillRect(var6, var7, Class2.anInt17 * 1822130227, var2);
				}

				if (var3 > 0) {
					var10.fillRect(var6 + Class2.anInt17 * 1822130227 - var3, var7, var3, CacheableEntry_Sub23_Sub16_Sub1.anInt2503 * -733282123);
				}

				if (var4 > 0) {
					var10.fillRect(var6, CacheableEntry_Sub23_Sub16_Sub1.anInt2503 * -733282123 + var7 - var4, Class2.anInt17 * 1822130227, var4);
				}
			} catch (Exception var9) {
				;
			}
		}

	}

	public static File method465(String var0, byte var1) {
		if (!Class61.aBool785) {
			throw new RuntimeException("");
		} else {
			File var2 = (File) Class61.aHashtable781.get(var0);
			if (var2 != null) {
				return var2;
			} else {
				File var3 = new File(Class61.aFile780, var0);
				RandomAccessFile var4 = null;

				try {
					File var5 = new File(var3.getParent());
					if (!var5.exists()) {
						throw new RuntimeException("");
					} else {
						var4 = new RandomAccessFile(var3, "rw");
						int var6 = var4.read();
						var4.seek(0L);
						var4.write(var6);
						var4.seek(0L);
						var4.close();
						Class61.aHashtable781.put(var0, var3);
						return var3;
					}
				} catch (Exception var8) {
					try {
						if (var4 != null) {
							var4.close();
							var4 = null;
						}
					} catch (Exception var7) {
						;
					}

					throw new RuntimeException();
				}
			}
		}
	}

}
