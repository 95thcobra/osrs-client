import java.io.File;

public class Class91 {

	public static final int anInt1330 = 112;
	public static File aFile1331;
	public static final int anInt1333 = 46;
	public static final int anInt1334 = 71;
	static char[] aCharArray1332 = new char[]{8364, '\u0000', 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, '\u0000', 381, '\u0000', '\u0000', 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, '\u0000', 382, 376};

	static void method1126(int var0, int var1, int var2, boolean var3, int var4, boolean var5, byte var6) {
		if (var0 < var1) {
			int var9 = (var1 + var0) / 2;
			int var11 = var0;
			Class51 var10 = Class4.aClass51Array80[var9];
			Class4.aClass51Array80[var9] = Class4.aClass51Array80[var1];
			Class4.aClass51Array80[var1] = var10;

			for (int var7 = var0; var7 < var1; var7++) {
				Class51 var8 = Class4.aClass51Array80[var7];
				int var12 = Class2.method100(var8, var10, var2, var3, 1726054500);
				int var14;
				if (var12 != 0) {
					if (var3) {
						var14 = -var12;
					} else {
						var14 = var12;
					}
				} else if (var4 == -1) {
					var14 = 0;
				} else {
					int var13 = Class2.method100(var8, var10, var4, var5, 1320270287);
					if (var5) {
						var14 = -var13;
					} else {
						var14 = var13;
					}
				}

				if (var14 <= 0) {
					Class51 var15 = Class4.aClass51Array80[var7];
					Class4.aClass51Array80[var7] = Class4.aClass51Array80[var11];
					Class4.aClass51Array80[var11++] = var15;
				}
			}

			Class4.aClass51Array80[var1] = Class4.aClass51Array80[var11];
			Class4.aClass51Array80[var11] = var10;
			method1126(var0, var11 - 1, var2, var3, var4, var5, (byte) 0);
			method1126(var11 + 1, var1, var2, var3, var4, var5, (byte) 0);
		}

	}

	Class91() throws Throwable {
		throw new Error();
	}

}
