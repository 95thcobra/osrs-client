public class CacheableEntry_Sub23_Sub12 extends CacheableEntry {

	static final int anInt2340 = 200;
	public static final int anInt2342 = 100;
	public static final int anInt2346 = 112;
	public static final int anInt2347 = 28;
	static final int anInt2348 = 1024;
	public static final int anInt2349 = 47;
	public static final int anInt2351 = 160;
	int anInt2350;
	int anInt2341;
	int anInt2344;
	String aString2343;
	String aString2352;
	String aString2345;

	void method2512(int var1, String var2, String var3, String var4, int var5) {
		int var6 = (PacketDecoder.anInt344 += 945207589) * 2036382381 - 1;
		anInt2350 = var6 * -696217951;
		anInt2341 = GameClient.cycle * -298467899;
		anInt2344 = var1 * -520272377;
		aString2343 = var2;
		aString2352 = var3;
		aString2345 = var4;
	}

	static final int method2514(int var0, int var1, int var2, int var3) {
		int var4 = 256 - var2;
		return ((var0 & 16711935) * var4 + (var1 & 16711935) * var2 & -16711936) + (var4 * (var0 & 65280) + var2 * (var1 & 65280) & 16711680) >> 8;
	}

	CacheableEntry_Sub23_Sub12(int var1, String var2, String var3, String var4) {
		int var5 = (PacketDecoder.anInt344 += 945207589) * 2036382381 - 1;
		anInt2350 = var5 * -696217951;
		anInt2341 = GameClient.cycle * -298467899;
		anInt2344 = var1 * -520272377;
		aString2343 = var2;
		aString2352 = var3;
		aString2345 = var4;
	}

	static void method2517(int var0) {
		PacketDecoder.aMap335.clear();
		PacketDecoder.aClass122_336.method1520();
		PacketDecoder.aClass125_337.method1553();
		PacketDecoder.anInt344 = 0;
	}

	static final void method2518(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (GameClient.aBool2864 && var0 != CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619) {
				return;
			}

			int var10 = 0;
			boolean var11 = true;
			boolean var8 = false;
			boolean var12 = false;
			if (var1 == 0) {
				var10 = LinkedEntry_Sub6.aClass39_1732.method646(var0, var2, var3);
			}

			if (var1 == 1) {
				var10 = LinkedEntry_Sub6.aClass39_1732.method528(var0, var2, var3);
			}

			if (var1 == 2) {
				var10 = LinkedEntry_Sub6.aClass39_1732.method529(var0, var2, var3);
			}

			if (var1 == 3) {
				var10 = LinkedEntry_Sub6.aClass39_1732.method530(var0, var2, var3);
			}

			int var9;
			if (var10 != 0) {
				var9 = LinkedEntry_Sub6.aClass39_1732.method531(var0, var2, var3, var10);
				int var15 = var10 >> 14 & 32767;
				int var14 = var9 & 31;
				int var16 = var9 >> 6 & 3;
				ObjectDef var13;
				if (var1 == 0) {
					LinkedEntry_Sub6.aClass39_1732.method518(var0, var2, var3);
					var13 = Class56.getObjectDef(var15);
					if (var13.anInt2275 * 445231797 != 0) {
						GameClient.aClass141Array2923[var0].method1705(var2, var3, var14, var16, var13.aBool2276, (byte) 76);
					}
				}

				if (var1 == 1) {
					LinkedEntry_Sub6.aClass39_1732.method520(var0, var2, var3);
				}

				if (var1 == 2) {
					LinkedEntry_Sub6.aClass39_1732.method598(var0, var2, var3);
					var13 = Class56.getObjectDef(var15);
					if (var13.anInt2277 * 1832905927 + var2 > 103 || var13.anInt2277 * 1832905927 + var3 > 103 || var13.anInt2274 * 1221908201 + var2 > 103 || var13.anInt2274 * 1221908201 + var3 > 103) {
						return;
					}

					if (var13.anInt2275 * 445231797 != 0) {
						GameClient.aClass141Array2923[var0].method1695(var2, var3, var13.anInt2277 * 1832905927, var13.anInt2274 * 1221908201, var16, var13.aBool2276, (short) -20620);
					}
				}

				if (var1 == 3) {
					LinkedEntry_Sub6.aClass39_1732.method521(var0, var2, var3);
					var13 = Class56.getObjectDef(var15);
					if (var13.anInt2275 * 445231797 == 1) {
						GameClient.aClass141Array2923[var0].method1704(var2, var3, -1367809230);
					}
				}
			}

			if (var4 >= 0) {
				var9 = var0;
				if (var0 < 3 && (Class32.mapSettings[1][var2][var3] & 2) == 2) {
					var9 = var0 + 1;
				}

				Applet_Sub1.method3405(var0, var9, var2, var3, var4, var5, var6, LinkedEntry_Sub6.aClass39_1732, GameClient.aClass141Array2923[var0], (byte) -55);
			}
		}

	}

}
