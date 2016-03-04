public class GfxDef extends CacheableEntry {

	int anInt2357;
	static IndexDescriptor aIndexDescriptor_2362;
	static IndexDescriptor aIndexDescriptor_2363;
	static final int anInt2369 = 17;
	protected static int anInt2370;
	public static final int anInt2371 = 188;
	static Class128 cache = new Class128(64);
	static Class128 aClass128_2356 = new Class128(30);
	public int animId = 1140458533;
	int anInt2360 = 711925632;
	int anInt2354 = 446051968;
	int anInt2366 = 0;
	int anInt2367 = 0;
	int anInt2368 = 0;
	int anInt2358;
	short[] aShortArray2359;
	short[] aShortArray2361;
	short[] aShortArray2364;
	short[] aShortArray2365;

	void method2520(DataBuffer var1, int var2) {
		while (true) {
			int var3 = var1.readUByte();
			if (var3 == 0) {
				return;
			}

			method2528(var1, var3, 1608709452);
		}
	}

	public static int method2521(int var0, int var1) {
		CacheableEntry_Sub23_Sub10 var2 = Class117.method1480(var0, (byte) -100);
		int var3 = var2.anInt2314 * -2125842197;
		int var4 = var2.anInt2320 * -96319771;
		int var6 = var2.anInt2315 * 1068024283;
		int var5 = Class106.anIntArray1478[var6 - var4];
		return Class106.varps[var3] >> var4 & var5;
	}

	public final CacheableEntry_Sub23_Sub16_Sub5 method2522(int var1, int var2) {
		CacheableEntry_Sub23_Sub16_Sub5 var3 = (CacheableEntry_Sub23_Sub16_Sub5) aClass128_2356.get((long) (anInt2357 * 668756005));
		if (var3 == null) {
			CacheableEntry_Sub23_Sub16_Sub6 var5 = CacheableEntry_Sub23_Sub16_Sub6.method3283(aIndexDescriptor_2363, anInt2358 * 1166865539, 0);
			if (var5 == null) {
				return null;
			}

			int var4;
			if (aShortArray2359 != null) {
				for (var4 = 0; var4 < aShortArray2359.length; var4++) {
					var5.method3218(aShortArray2359[var4], aShortArray2361[var4]);
				}
			}

			if (aShortArray2364 != null) {
				for (var4 = 0; var4 < aShortArray2364.length; var4++) {
					var5.method3219(aShortArray2364[var4], aShortArray2365[var4]);
				}
			}

			var3 = var5.method3266(anInt2367 * -157824907 + 64, 850 + anInt2368 * 1459197473, -30, -50, -30);
			aClass128_2356.put(var3, (long) (anInt2357 * 668756005));
		}

		CacheableEntry_Sub23_Sub16_Sub5 var6;
		if (animId * 28936275 != -1 && var1 != -1) {
			var6 = CacheableEntry_Sub23_Sub11.getAnimation(animId * 28936275).method2331(var3, var1, 415198856);
		} else {
			var6 = var3.method3131(true);
		}

		if (anInt2360 * 1561596351 != 128 || anInt2354 * -159531675 != 128) {
			var6.method3093(anInt2360 * 1561596351, anInt2354 * -159531675, anInt2360 * 1561596351);
		}

		if (anInt2366 * -2101797565 != 0) {
			if (anInt2366 * -2101797565 == 90) {
				var6.method3088();
			}

			if (anInt2366 * -2101797565 == 180) {
				var6.method3088();
				var6.method3088();
			}

			if (anInt2366 * -2101797565 == 270) {
				var6.method3088();
				var6.method3088();
				var6.method3088();
			}
		}

		return var6;
	}

	void method2528(DataBuffer var1, int var2, int var3) {
		if (var2 == 1) {
			anInt2358 = var1.readUShort() * 1666841131;
		} else if (var2 == 2) {
			animId = var1.readUShort() * -1140458533;
		} else if (var2 == 4) {
			anInt2360 = var1.readUShort() * -1571496385;
		} else if (var2 == 5) {
			anInt2354 = var1.readUShort() * -1305138067;
		} else if (var2 == 6) {
			anInt2366 = var1.readUShort() * -752527509;
		} else if (var2 == 7) {
			anInt2367 = var1.readUByte() * 1022478301;
		} else if (var2 == 8) {
			anInt2368 = var1.readUByte() * -1260950047;
		} else {
			int var4;
			int var5;
			if (var2 == 40) {
				var5 = var1.readUByte();
				aShortArray2359 = new short[var5];
				aShortArray2361 = new short[var5];

				for (var4 = 0; var4 < var5; var4++) {
					aShortArray2359[var4] = (short) var1.readUShort();
					aShortArray2361[var4] = (short) var1.readUShort();
				}
			} else if (var2 == 41) {
				var5 = var1.readUByte();
				aShortArray2364 = new short[var5];
				aShortArray2365 = new short[var5];

				for (var4 = 0; var4 < var5; var4++) {
					aShortArray2364[var4] = (short) var1.readUShort();
					aShortArray2365[var4] = (short) var1.readUShort();
				}
			}
		}

	}

	static final void method2542(byte[] var0, int var1, int var2, int var3, int var4, Class141[] var5, byte var6) {
		int var8;
		int var9;
		for (int var7 = 0; var7 < 4; var7++) {
			for (var8 = 0; var8 < 64; var8++) {
				for (var9 = 0; var9 < 64; var9++) {
					if (var1 + var8 > 0 && var1 + var8 < 103 && var9 + var2 > 0 && var9 + var2 < 103) {
						var5[var7].anIntArrayArray1628[var1 + var8][var9 + var2] &= -16777217;
					}
				}
			}
		}

		DataBuffer var11 = new DataBuffer(var0);

		for (var8 = 0; var8 < 4; var8++) {
			for (var9 = 0; var9 < 64; var9++) {
				for (int var10 = 0; var10 < 64; var10++) {
					Class53.method781(var11, var8, var9 + var1, var2 + var10, var3, var4, 0, -805248053);
				}
			}
		}

	}

}
