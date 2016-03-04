public class CacheableEntry_Sub23_Sub14 extends CacheableEntry {

	protected static int anInt2401 = 0;
	public static int anInt2397 = 0;
	protected static int anInt2402 = 0;
	public static int anInt2400 = 0;
	public static int[] anIntArray2396;
	public static int anInt2399;
	public static int anInt2398;

	public static void method2709(int[] var0) {
		anInt2401 = var0[0];
		anInt2397 = var0[1];
		anInt2402 = var0[2];
		anInt2400 = var0[3];
	}

	public static void method2710(int[] var0, int var1, int var2) {
		anIntArray2396 = var0;
		anInt2399 = var1;
		anInt2398 = var2;
		method2771(0, 0, var1, var2);
	}

	public static void method2711() {
		anInt2401 = 0;
		anInt2397 = 0;
		anInt2402 = anInt2399;
		anInt2400 = anInt2398;
	}

	public static void method2713(int var0, int var1, int var2, int var3) {
		if (anInt2401 < var0) {
			anInt2401 = var0;
		}

		if (anInt2397 < var1) {
			anInt2397 = var1;
		}

		if (anInt2402 > var2) {
			anInt2402 = var2;
		}

		if (anInt2400 > var3) {
			anInt2400 = var3;
		}

	}

	public static void method2715(int[] var0) {
		var0[0] = anInt2401;
		var0[1] = anInt2397;
		var0[2] = anInt2402;
		var0[3] = anInt2400;
	}

	public static void method2716() {
		int var0 = 0;

		int var1;
		for (var1 = anInt2399 * anInt2398 - 7; var0 < var1; anIntArray2396[var0++] = 0) {
			anIntArray2396[var0++] = 0;
			anIntArray2396[var0++] = 0;
			anIntArray2396[var0++] = 0;
			anIntArray2396[var0++] = 0;
			anIntArray2396[var0++] = 0;
			anIntArray2396[var0++] = 0;
			anIntArray2396[var0++] = 0;
		}

		for (var1 += 7; var0 < var1; anIntArray2396[var0++] = 0) {
			;
		}

	}

	public static void method2717(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 < anInt2401) {
			var2 -= anInt2401 - var0;
			var0 = anInt2401;
		}

		if (var1 < anInt2397) {
			var3 -= anInt2397 - var1;
			var1 = anInt2397;
		}

		if (var0 + var2 > anInt2402) {
			var2 = anInt2402 - var0;
		}

		if (var1 + var3 > anInt2400) {
			var3 = anInt2400 - var1;
		}

		var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & 65280) * var5 >> 8 & 65280);
		int var6 = 256 - var5;
		int var9 = anInt2399 - var2;
		int var7 = var0 + var1 * anInt2399;

		for (int var10 = 0; var10 < var3; var10++) {
			for (int var11 = -var2; var11 < 0; var11++) {
				int var8 = anIntArray2396[var7];
				var8 = ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
				anIntArray2396[var7++] = var4 + var8;
			}

			var7 += var9;
		}

	}

	public static void method2718(int var0, int var1, int var2, int var3, int var4) {
		if (var0 < anInt2401) {
			var2 -= anInt2401 - var0;
			var0 = anInt2401;
		}

		if (var1 < anInt2397) {
			var3 -= anInt2397 - var1;
			var1 = anInt2397;
		}

		if (var0 + var2 > anInt2402) {
			var2 = anInt2402 - var0;
		}

		if (var1 + var3 > anInt2400) {
			var3 = anInt2400 - var1;
		}

		int var7 = anInt2399 - var2;
		int var8 = var0 + var1 * anInt2399;

		for (int var6 = -var3; var6 < 0; var6++) {
			for (int var5 = -var2; var5 < 0; var5++) {
				anIntArray2396[var8++] = var4;
			}

			var8 += var7;
		}

	}

	public static void method2719(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = 0;
		int var7 = 65536 / var3;
		if (var0 < anInt2401) {
			var2 -= anInt2401 - var0;
			var0 = anInt2401;
		}

		if (var1 < anInt2397) {
			var6 += (anInt2397 - var1) * var7;
			var3 -= anInt2397 - var1;
			var1 = anInt2397;
		}

		if (var0 + var2 > anInt2402) {
			var2 = anInt2402 - var0;
		}

		if (var1 + var3 > anInt2400) {
			var3 = anInt2400 - var1;
		}

		int var14 = anInt2399 - var2;
		int var9 = var0 + var1 * anInt2399;

		for (int var11 = -var3; var11 < 0; var11++) {
			int var12 = 65536 - var6 >> 8;
			int var13 = var6 >> 8;
			int var10 = ((var4 & 16711935) * var12 + (var5 & 16711935) * var13 & -16711936) + ((var4 & 65280) * var12 + (var5 & 65280) * var13 & 16711680) >>> 8;

			for (int var8 = -var2; var8 < 0; var8++) {
				anIntArray2396[var9++] = var10;
			}

			var9 += var14;
			var6 += var7;
		}

	}

	public static void method2720(int var0, int var1, int var2, int var3, int var4) {
		method2756(var0, var1, var2, var4);
		method2756(var0, var1 + var3 - 1, var2, var4);
		method2739(var0, var1, var3, var4);
		method2739(var0 + var2 - 1, var1, var3, var4);
	}

	public static void method2721(int var0, int var1, int var2, int var3, int var4, int var5) {
		method2723(var0, var1, var2, var4, var5);
		method2723(var0, var1 + var3 - 1, var2, var4, var5);
		if (var3 >= 3) {
			method2724(var0, var1 + 1, var3 - 2, var4, var5);
			method2724(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
		}

	}

	static void method2723(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= anInt2397 && var1 < anInt2400) {
			if (var0 < anInt2401) {
				var2 -= anInt2401 - var0;
				var0 = anInt2401;
			}

			if (var0 + var2 > anInt2402) {
				var2 = anInt2402 - var0;
			}

			int var9 = 256 - var4;
			int var6 = (var3 >> 16 & 255) * var4;
			int var5 = (var3 >> 8 & 255) * var4;
			int var14 = (var3 & 255) * var4;
			int var7 = var0 + var1 * anInt2399;

			for (int var11 = 0; var11 < var2; var11++) {
				int var13 = (anIntArray2396[var7] >> 16 & 255) * var9;
				int var12 = (anIntArray2396[var7] >> 8 & 255) * var9;
				int var10 = (anIntArray2396[var7] & 255) * var9;
				int var8 = (var6 + var13 >> 8 << 16) + (var5 + var12 >> 8 << 8) + (var14 + var10 >> 8);
				anIntArray2396[var7++] = var8;
			}

		}
	}

	static void method2724(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= anInt2401 && var0 < anInt2402) {
			if (var1 < anInt2397) {
				var2 -= anInt2397 - var1;
				var1 = anInt2397;
			}

			if (var1 + var2 > anInt2400) {
				var2 = anInt2400 - var1;
			}

			int var12 = 256 - var4;
			int var5 = (var3 >> 16 & 255) * var4;
			int var6 = (var3 >> 8 & 255) * var4;
			int var9 = (var3 & 255) * var4;
			int var14 = var0 + var1 * anInt2399;

			for (int var13 = 0; var13 < var2; var13++) {
				int var7 = (anIntArray2396[var14] >> 16 & 255) * var12;
				int var8 = (anIntArray2396[var14] >> 8 & 255) * var12;
				int var10 = (anIntArray2396[var14] & 255) * var12;
				int var11 = (var5 + var7 >> 8 << 16) + (var6 + var8 >> 8 << 8) + (var9 + var10 >> 8);
				anIntArray2396[var14] = var11;
				var14 += anInt2399;
			}

		}
	}

	public static void method2725(int var0, int var1, int var2, int var3, int var4) {
		var2 -= var0;
		var3 -= var1;
		if (var3 == 0) {
			if (var2 >= 0) {
				method2756(var0, var1, var2 + 1, var4);
			} else {
				method2756(var0 + var2, var1, -var2 + 1, var4);
			}

		} else if (var2 == 0) {
			if (var3 >= 0) {
				method2739(var0, var1, var3 + 1, var4);
			} else {
				method2739(var0, var1 + var3, -var3 + 1, var4);
			}

		} else {
			if (var2 + var3 < 0) {
				var0 += var2;
				var2 = -var2;
				var1 += var3;
				var3 = -var3;
			}

			int var5;
			int var6;
			if (var2 > var3) {
				var1 <<= 16;
				var1 += 32768;
				var3 <<= 16;
				var5 = (int) Math.floor((double) var3 / (double) var2 + 0.5D);
				var2 += var0;
				if (var0 < anInt2401) {
					var1 += var5 * (anInt2401 - var0);
					var0 = anInt2401;
				}

				if (var2 >= anInt2402) {
					var2 = anInt2402 - 1;
				}

				while (var0 <= var2) {
					var6 = var1 >> 16;
					if (var6 >= anInt2397 && var6 < anInt2400) {
						anIntArray2396[var0 + var6 * anInt2399] = var4;
					}

					var1 += var5;
					++var0;
				}
			} else {
				var0 <<= 16;
				var0 += 32768;
				var2 <<= 16;
				var5 = (int) Math.floor((double) var2 / (double) var3 + 0.5D);
				var3 += var1;
				if (var1 < anInt2397) {
					var0 += var5 * (anInt2397 - var1);
					var1 = anInt2397;
				}

				if (var3 >= anInt2400) {
					var3 = anInt2400 - 1;
				}

				while (var1 <= var3) {
					var6 = var0 >> 16;
					if (var6 >= anInt2401 && var6 < anInt2402) {
						anIntArray2396[var6 + var1 * anInt2399] = var4;
					}

					var0 += var5;
					++var1;
				}
			}

		}
	}

	public static void method2726(int var0, int var1, int var2, int[] var3, int[] var4) {
		int var5 = var0 + var1 * anInt2399;

		for (var1 = 0; var1 < var3.length; var1++) {
			int var6 = var5 + var3[var1];

			for (var0 = -var4[var1]; var0 < 0; var0++) {
				anIntArray2396[var6++] = var2;
			}

			var5 += anInt2399;
		}

	}

	public static void method2739(int var0, int var1, int var2, int var3) {
		if (var0 >= anInt2401 && var0 < anInt2402) {
			if (var1 < anInt2397) {
				var2 -= anInt2397 - var1;
				var1 = anInt2397;
			}

			if (var1 + var2 > anInt2400) {
				var2 = anInt2400 - var1;
			}

			int var5 = var0 + var1 * anInt2399;

			for (int var4 = 0; var4 < var2; var4++) {
				anIntArray2396[var5 + var4 * anInt2399] = var3;
			}

		}
	}

	public static void method2756(int var0, int var1, int var2, int var3) {
		if (var1 >= anInt2397 && var1 < anInt2400) {
			if (var0 < anInt2401) {
				var2 -= anInt2401 - var0;
				var0 = anInt2401;
			}

			if (var0 + var2 > anInt2402) {
				var2 = anInt2402 - var0;
			}

			int var5 = var0 + var1 * anInt2399;

			for (int var4 = 0; var4 < var2; var4++) {
				anIntArray2396[var5 + var4] = var3;
			}

		}
	}

	public static void method2771(int var0, int var1, int var2, int var3) {
		if (var0 < 0) {
			var0 = 0;
		}

		if (var1 < 0) {
			var1 = 0;
		}

		if (var2 > anInt2399) {
			var2 = anInt2399;
		}

		if (var3 > anInt2398) {
			var3 = anInt2398;
		}

		anInt2401 = var0;
		anInt2397 = var1;
		anInt2402 = var2;
		anInt2400 = var3;
	}

}
