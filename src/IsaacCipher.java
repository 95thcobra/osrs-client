public final class IsaacCipher {

	static final int anInt786 = 8;
	static final int anInt787 = 256;
	static final int anInt788 = 1020;
	protected static int anInt795;
	static final int anInt796 = 7;
	public static final int anInt797 = 142;
	public static final int anInt798 = 213;
	int anInt789;
	int[] anIntArray792 = new int[256];
	int[] anIntArray790 = new int[256];
	int anInt793;
	int anInt791;
	int anInt794;

	final int method821(byte var1) {
		return 0;//
		//if ((anInt789 += 2132255327) * -11876767 + 1 == 0) {
		//	method827(-249661455);
		//	anInt789 = 1735738207;
		//}
//
		//return anIntArray790[anInt789 * -11876767];
	}

	IsaacCipher(int[] var1) {
		for (int var2 = 0; var2 < var1.length; var2++) {
			anIntArray790[var2] = var1[var2];
		}

		method824((short) 3924);
	}

	static void method822(int var0, String var1, String var2, String var3, int var4) {
		Class30 var5 = (Class30) PacketDecoder.aMap335.get(Integer.valueOf(var0));
		if (var5 == null) {
			var5 = new Class30();
			PacketDecoder.aMap335.put(Integer.valueOf(var0), var5);
		}

		CacheableEntry_Sub23_Sub12 var6 = var5.method397(var0, var1, var2, var3, -527788794);
		PacketDecoder.aClass122_336.method1515(var6, (long) (var6.anInt2350 * 870241633));
		PacketDecoder.aClass125_337.method1552(var6);
		GameClient.anInt2874 = GameClient.anInt3050 * 442638639;
	}

	final void method824(short var1) {
		int var2 = -1640531527;
		int var10 = -1640531527;
		int var9 = -1640531527;
		int var8 = -1640531527;
		int var5 = -1640531527;
		int var4 = -1640531527;
		int var6 = -1640531527;
		int var7 = -1640531527;

		int var3;
		for (var3 = 0; var3 < 4; var3++) {
			var7 ^= var6 << 11;
			var5 += var7;
			var6 += var4;
			var6 ^= var4 >>> 2;
			var8 += var6;
			var4 += var5;
			var4 ^= var5 << 8;
			var9 += var4;
			var5 += var8;
			var5 ^= var8 >>> 16;
			var10 += var5;
			var8 += var9;
			var8 ^= var9 << 10;
			var2 += var8;
			var9 += var10;
			var9 ^= var10 >>> 4;
			var7 += var9;
			var10 += var2;
			var10 ^= var2 << 8;
			var6 += var10;
			var2 += var7;
			var2 ^= var7 >>> 9;
			var4 += var2;
			var7 += var6;
		}

		for (var3 = 0; var3 < 256; var3 += 8) {
			var7 += anIntArray790[var3];
			var6 += anIntArray790[var3 + 1];
			var4 += anIntArray790[2 + var3];
			var5 += anIntArray790[3 + var3];
			var8 += anIntArray790[var3 + 4];
			var9 += anIntArray790[5 + var3];
			var10 += anIntArray790[var3 + 6];
			var2 += anIntArray790[var3 + 7];
			var7 ^= var6 << 11;
			var5 += var7;
			var6 += var4;
			var6 ^= var4 >>> 2;
			var8 += var6;
			var4 += var5;
			var4 ^= var5 << 8;
			var9 += var4;
			var5 += var8;
			var5 ^= var8 >>> 16;
			var10 += var5;
			var8 += var9;
			var8 ^= var9 << 10;
			var2 += var8;
			var9 += var10;
			var9 ^= var10 >>> 4;
			var7 += var9;
			var10 += var2;
			var10 ^= var2 << 8;
			var6 += var10;
			var2 += var7;
			var2 ^= var7 >>> 9;
			var4 += var2;
			var7 += var6;
			anIntArray792[var3] = var7;
			anIntArray792[var3 + 1] = var6;
			anIntArray792[2 + var3] = var4;
			anIntArray792[var3 + 3] = var5;
			anIntArray792[4 + var3] = var8;
			anIntArray792[5 + var3] = var9;
			anIntArray792[6 + var3] = var10;
			anIntArray792[var3 + 7] = var2;
		}

		for (var3 = 0; var3 < 256; var3 += 8) {
			var7 += anIntArray792[var3];
			var6 += anIntArray792[1 + var3];
			var4 += anIntArray792[2 + var3];
			var5 += anIntArray792[3 + var3];
			var8 += anIntArray792[4 + var3];
			var9 += anIntArray792[var3 + 5];
			var10 += anIntArray792[var3 + 6];
			var2 += anIntArray792[var3 + 7];
			var7 ^= var6 << 11;
			var5 += var7;
			var6 += var4;
			var6 ^= var4 >>> 2;
			var8 += var6;
			var4 += var5;
			var4 ^= var5 << 8;
			var9 += var4;
			var5 += var8;
			var5 ^= var8 >>> 16;
			var10 += var5;
			var8 += var9;
			var8 ^= var9 << 10;
			var2 += var8;
			var9 += var10;
			var9 ^= var10 >>> 4;
			var7 += var9;
			var10 += var2;
			var10 ^= var2 << 8;
			var6 += var10;
			var2 += var7;
			var2 ^= var7 >>> 9;
			var4 += var2;
			var7 += var6;
			anIntArray792[var3] = var7;
			anIntArray792[var3 + 1] = var6;
			anIntArray792[var3 + 2] = var4;
			anIntArray792[3 + var3] = var5;
			anIntArray792[var3 + 4] = var8;
			anIntArray792[5 + var3] = var9;
			anIntArray792[var3 + 6] = var10;
			anIntArray792[var3 + 7] = var2;
		}

		method827(-579109857);
		anInt789 = -396517120;
	}

	public static String method826(int var0, boolean var1, byte var2) {
		if (var1 && var0 >= 0) {
			int var4 = var0;
			String var5;
			if (var1 && var0 >= 0) {
				int var6 = 2;

				for (int var3 = var0 / 10; var3 != 0; var6++) {
					var3 /= 10;
				}

				char[] var7 = new char[var6];
				var7[0] = 43;

				for (int var8 = var6 - 1; var8 > 0; --var8) {
					int var9 = var4;
					var4 /= 10;
					int var10 = var9 - var4 * 10;
					if (var10 >= 10) {
						var7[var8] = (char) (87 + var10);
					} else {
						var7[var8] = (char) (48 + var10);
					}
				}

				var5 = new String(var7);
			} else {
				var5 = Integer.toString(var0, 10);
			}

			return var5;
		} else {
			return Integer.toString(var0);
		}
	}

	final void method827(int var1) {
		anInt791 += (anInt793 -= 524507493) * -1437406195;

		for (int var2 = 0; var2 < 256; var2++) {
			int var3 = anIntArray792[var2];
			if ((var2 & 2) == 0) {
				if ((var2 & 1) == 0) {
					anInt794 = (anInt794 * -1696567 ^ anInt794 * -1696567 << 13) * 1797045625;
				} else {
					anInt794 = (anInt794 * -1696567 ^ anInt794 * -1696567 >>> 6) * 1797045625;
				}
			} else if ((var2 & 1) == 0) {
				anInt794 = (anInt794 * -1696567 ^ anInt794 * -1696567 << 2) * 1797045625;
			} else {
				anInt794 = (anInt794 * -1696567 ^ anInt794 * -1696567 >>> 16) * 1797045625;
			}

			anInt794 += anIntArray792[var2 + 128 & 255] * 1797045625;
			int var4;
			anIntArray792[var2] = var4 = anInt791 * -585522657 + anIntArray792[(var3 & 1020) >> 2] + anInt794 * -1696567;
			anIntArray790[var2] = (anInt791 = (anIntArray792[(var4 >> 8 & 1020) >> 2] + var3) * -1630447137) * -585522657;
		}

	}

}
