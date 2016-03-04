import java.io.File;

public class Class51 {

	static final int anInt697 = 3;
	static final int anInt698 = 2;
	String aString699;
	int anInt701;
	int anInt703;
	int anInt704;
	static int[] anIntArray706;
	String aString707;
	public static final int anInt708 = 172;
	int anInt709;
	int anInt710;
	static int anInt712;
	public static final int anInt713 = 12;
	public static final int anInt714 = 95;
	static int anInt711 = 0;
	static int anInt700 = 0;
	static int[] anIntArray705 = new int[]{1, 1, 1, 1};
	static int[] anIntArray702 = new int[]{0, 1, 2, 3};

	boolean method715(byte var1) {
		return (1 & anInt704 * 438674181) != 0;
	}

	boolean method716(int var1) {
		return (2 & anInt704 * 438674181) != 0;
	}

	boolean method717(int var1) {
		return (4 & anInt704 * 438674181) != 0;
	}

	static void method718(String[] var0, short[] var1, int var2, int var3, int var4) {
		if (var2 < var3) {
			int var8 = (var3 + var2) / 2;
			int var7 = var2;
			String var6 = var0[var8];
			var0[var8] = var0[var3];
			var0[var3] = var6;
			short var9 = var1[var8];
			var1[var8] = var1[var3];
			var1[var3] = var9;

			for (int var5 = var2; var5 < var3; var5++) {
				if (var6 == null || var0[var5] != null && var0[var5].compareTo(var6) < (var5 & 1)) {
					String var10 = var0[var5];
					var0[var5] = var0[var7];
					var0[var7] = var10;
					short var11 = var1[var5];
					var1[var5] = var1[var7];
					var1[var7++] = var11;
				}
			}

			var0[var3] = var0[var7];
			var0[var7] = var6;
			var1[var3] = var1[var7];
			var1[var7] = var9;
			method718(var0, var1, var2, var7 - 1, 167182419);
			method718(var0, var1, var7 + 1, var3, 167182419);
		}

	}

	public static void method719(File var0, int var1) {
		Class61.aFile780 = var0;
		if (!Class61.aFile780.exists()) {
			throw new RuntimeException("");
		} else {
			Class61.aBool785 = true;
		}
	}

	boolean method730(int var1) {
		return (8 & anInt704 * 438674181) != 0;
	}

	static final void method742(byte var0) {
		Class39.aBool535 = false;
		GameClient.aBool2864 = false;
	}

}
