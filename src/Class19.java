public final class Class19 {

	int anInt223;
	int anInt224;
	int anInt225;
	CacheableEntry_Sub23_Sub16 aClass109_Sub23_Sub16_226;
	CacheableEntry_Sub23_Sub16 aClass109_Sub23_Sub16_227;
	CacheableEntry_Sub23_Sub16 aClass109_Sub23_Sub16_228;
	int anInt229;
	static final int anInt230 = 10;
	static int anInt231;
	int anInt232;
	static final int anInt233 = 48;
	static Class133 aClass133_234;
	static final int anInt235 = 4;

	public static CacheableEntry_Sub23_Sub14_Sub1 method342(IndexDescriptor var0, String var1, String var2, byte var3) {
		int var4 = var0.method1170(var1);
		int var6 = var0.method1165(var4, var2, (byte) 72);
		CacheableEntry_Sub23_Sub14_Sub1 var5;
		if (!CacheableEntry_Sub23_Sub16_Sub2.method2962(var0, var4, var6, 1901998081)) {
			var5 = null;
		} else {
			var5 = Class30.method412(1318850648);
		}

		return var5;
	}

	public static boolean method343(CharSequence var0, int var1, boolean var2, int var3) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var7 = false;
			boolean var10 = false;
			int var4 = 0;
			int var9 = var0.length();

			for (int var8 = 0; var8 < var9; var8++) {
				char var5 = var0.charAt(var8);
				if (var8 == 0) {
					if (var5 == 45) {
						var7 = true;
						continue;
					}

					if (var5 == 43 && var2) {
						continue;
					}
				}

				int var11;
				if (var5 >= 48 && var5 <= 57) {
					var11 = var5 - 48;
				} else if (var5 >= 65 && var5 <= 90) {
					var11 = var5 - 55;
				} else {
					if (var5 < 97 || var5 > 122) {
						return false;
					}

					var11 = var5 - 87;
				}

				if (var11 >= var1) {
					return false;
				}

				if (var7) {
					var11 = -var11;
				}

				int var6 = var4 * var1 + var11;
				if (var6 / var1 != var4) {
					return false;
				}

				var4 = var6;
				var10 = true;
			}

			return var10;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	static boolean method344(String var0, int var1) {
		if (var0 != null) {
			String var2 = Class38.method497(var0, GameClient.aClass119_2919, -1743170604);

			for (int var3 = 0; var3 < GameClient.anInt3138 * 601840989; var3++) {
				Class41 var4 = GameClient.aClass41Array2895[var3];
				if (var2.equalsIgnoreCase(Class38.method497(var4.aString597, GameClient.aClass119_2919, -1684054978))) {
					return true;
				}

				if (var2.equalsIgnoreCase(Class38.method497(var4.aString586, GameClient.aClass119_2919, -1855057700))) {
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	static final void method345(int var0, int var1, int var2, int var3, RenderedItemImage var4, CacheableEntry_Sub23_Sub18 var5, int var6) {
		int var7 = var3 * var3 + var2 * var2;
		if (var7 > 4225 && var7 < 90000) {
			int var11 = GameClient.anInt2880 * 1847328669 + GameClient.anInt2948 * -1072839225 & 2047;
			int var8 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2719[var11];
			int var9 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2720[var11];
			var8 = var8 * 256 / (256 + GameClient.anInt2936 * 461573195);
			var9 = var9 * 256 / (256 + GameClient.anInt2936 * 461573195);
			int var10 = var3 * var8 + var2 * var9 >> 16;
			int var15 = var3 * var9 - var2 * var8 >> 16;
			double var12 = Math.atan2((double) var10, (double) var15);
			int var14 = (int) (Math.sin(var12) * 63.0D);
			int var16 = (int) (Math.cos(var12) * 57.0D);
			EnumDef.aClass109_Sub23_Sub14_Sub2_2198.method3009(4 + var14 + var0 + 94 - 10, var1 + 83 - var16 - 20, 20, 20, 15, 15, var12, 256);
		} else {
			Class40.method668(var0, var1, var2, var3, var4, var5, (byte) 126);
		}

	}

}
