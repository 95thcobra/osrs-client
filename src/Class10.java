public class Class10 {

	static final int anInt126 = 6;
	static final int anInt127 = 14;
	static final int anInt129 = 7;
	static String aString130;
	static final int anInt131 = 104;
	static final int anInt132 = 1003;
	int anInt125;
	int anInt128;
	int[][] anIntArrayArray124;

	byte[] method203(byte[] var1, int var2) {
		if (anIntArrayArray124 != null) {
			int var4 = 14 + (int) ((long) (anInt128 * -1116962311) * (long) var1.length / (long) (anInt125 * -654581349));
			int[] var5 = new int[var4];
			int var10 = 0;
			int var7 = 0;

			int var3;
			for (var3 = 0; var3 < var1.length; var3++) {
				byte var6 = var1[var3];
				int[] var9 = anIntArrayArray124[var7];

				int var8;
				for (var8 = 0; var8 < 14; var8++) {
					var5[var10 + var8] += var9[var8] * var6;
				}

				var7 += anInt128 * -1116962311;
				var8 = var7 / (anInt125 * -654581349);
				var10 += var8;
				var7 -= var8 * anInt125 * -654581349;
			}

			var1 = new byte[var4];

			for (var3 = 0; var3 < var4; var3++) {
				int var11 = var5[var3] + 32768 >> 16;
				if (var11 < -128) {
					var1[var3] = -128;
				} else if (var11 > 127) {
					var1[var3] = 127;
				} else {
					var1[var3] = (byte) var11;
				}
			}
		}

		return var1;
	}

	static void method204(int var0) {
		for (LinkedEntry_Sub7 var1 = (LinkedEntry_Sub7) LinkedEntry_Sub7.aJagexLinkedList_1739.method1405(); var1 != null; var1 = (LinkedEntry_Sub7) LinkedEntry_Sub7.aJagexLinkedList_1739.method1402()) {
			if (var1.aClass109_Sub5_Sub2_1743 != null) {
				Class48.aClass109_Sub5_Sub1_672.method2545(var1.aClass109_Sub5_Sub2_1743);
				var1.aClass109_Sub5_Sub2_1743 = null;
			}

			if (var1.aClass109_Sub5_Sub2_1748 != null) {
				Class48.aClass109_Sub5_Sub1_672.method2545(var1.aClass109_Sub5_Sub2_1748);
				var1.aClass109_Sub5_Sub2_1748 = null;
			}
		}

		LinkedEntry_Sub7.aJagexLinkedList_1739.method1394();
	}

	int method205(int var1, int var2) {
		if (anIntArrayArray124 != null) {
			var1 = (int) ((long) (anInt128 * -1116962311) * (long) var1 / (long) (anInt125 * -654581349));
		}

		return var1;
	}

	int method206(int var1, int var2) {
		if (anIntArrayArray124 != null) {
			var1 = 6 + (int) ((long) (anInt128 * -1116962311) * (long) var1 / (long) (anInt125 * -654581349));
		}

		return var1;
	}

	public Class10(int var1, int var2) {
		if (var2 != var1) {
			int var4 = Class88.method1094(var1, var2, -456463687);
			var1 /= var4;
			var2 /= var4;
			anInt125 = var1 * -1587962733;
			anInt128 = var2 * 1229090889;
			anIntArrayArray124 = new int[var1][14];

			for (int var3 = 0; var3 < var1; var3++) {
				int[] var11 = anIntArrayArray124[var3];
				double var7 = (double) var3 / (double) var1 + 6.0D;
				int var5 = (int) Math.floor(var7 - 7.0D + 1.0D);
				if (var5 < 0) {
					var5 = 0;
				}

				int var6 = (int) Math.ceil(var7 + 7.0D);
				if (var6 > 14) {
					var6 = 14;
				}

				for (double var12 = (double) var2 / (double) var1; var5 < var6; var5++) {
					double var14 = 3.141592653589793D * ((double) var5 - var7);
					double var9 = var12;
					if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
						var9 = var12 * (Math.sin(var14) / var14);
					}

					var9 *= 0.54D + 0.46D * Math.cos(((double) var5 - var7) * 0.2243994752564138D);
					var11[var5] = (int) Math.floor(0.5D + var9 * 65536.0D);
				}
			}

		}
	}

	public static CacheableEntry_Sub23_Sub15 method215(IndexDescriptor var0, IndexDescriptor var1, int var2, boolean var3, int var4) {
		boolean var5 = true;
		int[] var6 = var0.method1159(var2, 1575010658);

		for (int var7 = 0; var7 < var6.length; var7++) {
			byte[] var8 = var0.method1178(var2, var6[var7], 1868689266);
			if (var8 == null) {
				var5 = false;
			} else {
				int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
				byte[] var10;
				if (var3) {
					var10 = var1.method1178(0, var9, 1935056439);
				} else {
					var10 = var1.method1178(var9, 0, 1073465738);
				}

				if (var10 == null) {
					var5 = false;
				}
			}
		}

		if (!var5) {
			return null;
		} else {
			try {
				return new CacheableEntry_Sub23_Sub15(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}

	public static synchronized long method216(short var0) {
		long var1 = System.currentTimeMillis();
		if (var1 < Class53.aLong723 * -938124017927801503L) {
			Class53.aLong718 += (-938124017927801503L * Class53.aLong723 - var1) * -5929094679775521999L;
		}

		Class53.aLong723 = var1 * -3133561478630560095L;
		return 2252224825361966545L * Class53.aLong718 + var1;
	}

	static int method218(int var0, int var1) {
		Class30 var2 = (Class30) PacketDecoder.aMap335.get(Integer.valueOf(var0));
		return var2 == null ? 0 : var2.method399(411281100);
	}

}
