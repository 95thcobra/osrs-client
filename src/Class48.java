public class Class48 implements Runnable {

	static final int anInt668 = 4;
	public static final int anInt671 = 155;
	static LinkedEntry_Sub5_Sub1 aClass109_Sub5_Sub1_672;
	static Class44 aClass44_673;
	static final int anInt674 = 20;
	static final int anInt675 = 42;
	static int currentInterfaceOptions;
	int anInt670 = 0;
	boolean aBool678 = true;
	Object anObject669 = new Object();
	int[] anIntArray679 = new int[500];
	int[] anIntArray676 = new int[500];

	public void run() {
		for (; aBool678; Class24.method357(50L)) {
			Object var1 = anObject669;
			synchronized (var1) {
				if (anInt670 * 1467290427 < 500) {
					anIntArray679[anInt670 * 1467290427] = Class74.anInt897 * -1031552075;
					anIntArray676[anInt670 * 1467290427] = Class74.anInt898 * 1941423145;
					anInt670 -= 1310568973;
				}
			}
		}

	}

	public static void method705(int var0) {
		CacheableEntry_Sub23_Sub10.aClass128_2312.method1579();
	}

	static final void method706(byte var0) {
		for (int var1 = 0; var1 < GameClient.anInt3075 * 1104054789; var1++) {
			--GameClient.anIntArray3112[var1];
			if (GameClient.anIntArray3112[var1] >= -10) {
				Class8 var12 = GameClient.aClass8Array3114[var1];
				if (var12 == null) {
					Class8 var10000 = (Class8) null;
					var12 = Class8.method184(GameClient.aClass94_Sub1_3134, GameClient.anIntArray3110[var1], 0);
					if (var12 == null) {
						continue;
					}

					GameClient.anIntArray3112[var1] += var12.method183();
					GameClient.aClass8Array3114[var1] = var12;
				}

				if (GameClient.anIntArray3112[var1] < 0) {
					int var8;
					if (GameClient.anIntArray3016[var1] != 0) {
						int var7 = (GameClient.anIntArray3016[var1] & 255) * 128;
						int var3 = GameClient.anIntArray3016[var1] >> 16 & 255;
						int var2 = var3 * 128 + 64 - Player.me.anInt2521 * -1051150961;
						if (var2 < 0) {
							var2 = -var2;
						}

						int var9 = GameClient.anIntArray3016[var1] >> 8 & 255;
						int var5 = var9 * 128 + 64 - Player.me.anInt2505 * -844883935;
						if (var5 < 0) {
							var5 = -var5;
						}

						int var6 = var5 + var2 - 128;
						if (var6 > var7) {
							GameClient.anIntArray3112[var1] = -100;
							continue;
						}

						if (var6 < 0) {
							var6 = 0;
						}

						var8 = GameClient.anInt3108 * -1977859941 * (var7 - var6) / var7;
					} else {
						var8 = GameClient.anInt2954 * 696556151;
					}

					if (var8 > 0) {
						LinkedEntry_Sub1_Sub1 var13 = var12.method182().method2705(Class76.aClass10_925);
						LinkedEntry_Sub5_Sub2 var11 = LinkedEntry_Sub5_Sub2.method2659(var13, 100, var8);
						var11.method2573(GameClient.anIntArray3111[var1] - 1);
						aClass109_Sub5_Sub1_672.method2544(var11);
					}

					GameClient.anIntArray3112[var1] = -100;
				}
			} else {
				GameClient.anInt3075 -= 1213510349;

				for (int var4 = var1; var4 < GameClient.anInt3075 * 1104054789; var4++) {
					GameClient.anIntArray3110[var4] = GameClient.anIntArray3110[1 + var4];
					GameClient.aClass8Array3114[var4] = GameClient.aClass8Array3114[var4 + 1];
					GameClient.anIntArray3111[var4] = GameClient.anIntArray3111[1 + var4];
					GameClient.anIntArray3112[var4] = GameClient.anIntArray3112[var4 + 1];
					GameClient.anIntArray3016[var4] = GameClient.anIntArray3016[var4 + 1];
				}

				--var1;
			}
		}

		if (GameClient.aBool2941) {
			boolean var10;
			if (Class104.anInt1454 * 216145519 != 0) {
				var10 = true;
			} else {
				var10 = Class104.aClass109_Sub5_Sub4_1453.method2844((byte) 24);
			}

			if (!var10) {
				if (GameClient.anInt2951 * -250760527 != 0 && GameClient.anInt3105 * -759346757 != -1) {
					Class97.method1247(Class46.aClass94_Sub1_652, GameClient.anInt3105 * -759346757, 0, GameClient.anInt2951 * -250760527, false, (byte) -16);
				}

				GameClient.aBool2941 = false;
			}
		}

	}

}
