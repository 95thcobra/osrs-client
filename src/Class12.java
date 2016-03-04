import java.util.Random;

public class Class12 {

	static final double aDouble164 = 1.0057929410678534D;
	static int[] anIntArray155 = new int[32768];
	static int[] anIntArray163;
	static int[] anIntArray161;
	static int[] anIntArray165;
	static int[] anIntArray166;
	static int[] anIntArray154;
	static int[] anIntArray168;
	static int[] anIntArray162;
	Class11 aClass11_167;
	Class11 aClass11_145;
	Class11 aClass11_146;
	Class11 aClass11_158;
	Class11 aClass11_147;
	Class11 aClass11_149;
	Class11 aClass11_150;
	Class11 aClass11_151;
	int anInt160 = 0;
	int anInt148 = 100;
	int anInt159 = 500;
	int anInt144 = 0;
	Class13 aClass13_157;
	Class11 aClass11_169;
	int[] anIntArray156 = new int[]{0, 0, 0, 0, 0};
	int[] anIntArray153 = new int[]{0, 0, 0, 0, 0};
	int[] anIntArray152 = new int[]{0, 0, 0, 0, 0};

	final int[] method233(int var1, int var2) {
		Class52.method752(anIntArray161, 0, var1);
		if (var2 < 10) {
			return anIntArray161;
		} else {
			double var5 = (double) var1 / ((double) var2 + 0.0D);
			aClass11_167.method222();
			aClass11_145.method222();
			int var9 = 0;
			int var7 = 0;
			int var8 = 0;
			if (aClass11_146 != null) {
				aClass11_146.method222();
				aClass11_158.method222();
				var9 = (int) ((double) (aClass11_146.anInt137 - aClass11_146.anInt141) * 32.768D / var5);
				var7 = (int) ((double) aClass11_146.anInt141 * 32.768D / var5);
			}

			int var10 = 0;
			int var11 = 0;
			int var12 = 0;
			if (aClass11_147 != null) {
				aClass11_147.method222();
				aClass11_149.method222();
				var10 = (int) ((double) (aClass11_147.anInt137 - aClass11_147.anInt141) * 32.768D / var5);
				var11 = (int) ((double) aClass11_147.anInt141 * 32.768D / var5);
			}

			int var13;
			for (var13 = 0; var13 < 5; var13++) {
				if (anIntArray156[var13] != 0) {
					anIntArray165[var13] = 0;
					anIntArray166[var13] = (int) ((double) anIntArray152[var13] * var5);
					anIntArray154[var13] = (anIntArray156[var13] << 14) / 100;
					anIntArray168[var13] = (int) ((double) (aClass11_167.anInt137 - aClass11_167.anInt141) * 32.768D * Math.pow(1.0057929410678534D, (double) anIntArray153[var13]) / var5);
					anIntArray162[var13] = (int) ((double) aClass11_167.anInt141 * 32.768D / var5);
				}
			}

			int var3;
			int var4;
			int var14;
			int var17;
			for (var13 = 0; var13 < var1; var13++) {
				var14 = aClass11_167.method232(var1);
				var17 = aClass11_145.method232(var1);
				if (aClass11_146 != null) {
					var3 = aClass11_146.method232(var1);
					var4 = aClass11_158.method232(var1);
					var14 += method234(var8, var4, aClass11_146.anInt136) >> 1;
					var8 += (var3 * var9 >> 16) + var7;
				}

				if (aClass11_147 != null) {
					var3 = aClass11_147.method232(var1);
					var4 = aClass11_149.method232(var1);
					var17 = var17 * ((method234(var12, var4, aClass11_147.anInt136) >> 1) + 32768) >> 15;
					var12 += (var3 * var10 >> 16) + var11;
				}

				for (var3 = 0; var3 < 5; var3++) {
					if (anIntArray156[var3] != 0) {
						var4 = var13 + anIntArray166[var3];
						if (var4 < var1) {
							anIntArray161[var4] += method234(anIntArray165[var3], var17 * anIntArray154[var3] >> 15, aClass11_167.anInt136);
							anIntArray165[var3] += (var14 * anIntArray168[var3] >> 16) + anIntArray162[var3];
						}
					}
				}
			}

			int var18;
			if (aClass11_150 != null) {
				aClass11_150.method222();
				aClass11_151.method222();
				var13 = 0;
				boolean var19 = false;
				boolean var20 = true;

				for (var3 = 0; var3 < var1; var3++) {
					var4 = aClass11_150.method232(var1);
					var18 = aClass11_151.method232(var1);
					if (var20) {
						var14 = aClass11_150.anInt141 + ((aClass11_150.anInt137 - aClass11_150.anInt141) * var4 >> 8);
					} else {
						var14 = aClass11_150.anInt141 + ((aClass11_150.anInt137 - aClass11_150.anInt141) * var18 >> 8);
					}

					var13 += 256;
					if (var13 >= var14) {
						var13 = 0;
						var20 = !var20;
					}

					if (var20) {
						anIntArray161[var3] = 0;
					}
				}
			}

			if (anInt160 > 0 && anInt148 > 0) {
				var13 = (int) ((double) anInt160 * var5);

				for (var14 = var13; var14 < var1; var14++) {
					anIntArray161[var14] += anIntArray161[var14 - var13] * anInt148 / 100;
				}
			}

			if (aClass13_157.anIntArray175[0] > 0 || aClass13_157.anIntArray175[1] > 0) {
				aClass11_169.method222();
				var13 = aClass11_169.method232(var1 + 1);
				var14 = aClass13_157.method248(0, (float) var13 / 65536.0F);
				var17 = aClass13_157.method248(1, (float) var13 / 65536.0F);
				if (var1 >= var14 + var17) {
					var3 = 0;
					var4 = var17;
					if (var17 > var1 - var14) {
						var4 = var1 - var14;
					}

					int var15;
					while (var3 < var4) {
						var18 = (int) ((long) anIntArray161[var3 + var14] * (long) Class13.anInt178 >> 16);

						for (var15 = 0; var15 < var14; var15++) {
							var18 += (int) ((long) anIntArray161[var3 + var14 - 1 - var15] * (long) Class13.anIntArrayArray176[0][var15] >> 16);
						}

						for (var15 = 0; var15 < var3; var15++) {
							var18 -= (int) ((long) anIntArray161[var3 - 1 - var15] * (long) Class13.anIntArrayArray176[1][var15] >> 16);
						}

						anIntArray161[var3] = var18;
						var13 = aClass11_169.method232(var1 + 1);
						++var3;
					}

					var4 = 128;

					while (true) {
						if (var4 > var1 - var14) {
							var4 = var1 - var14;
						}

						int var16;
						while (var3 < var4) {
							var15 = (int) ((long) anIntArray161[var3 + var14] * (long) Class13.anInt178 >> 16);

							for (var16 = 0; var16 < var14; var16++) {
								var15 += (int) ((long) anIntArray161[var3 + var14 - 1 - var16] * (long) Class13.anIntArrayArray176[0][var16] >> 16);
							}

							for (var16 = 0; var16 < var17; var16++) {
								var15 -= (int) ((long) anIntArray161[var3 - 1 - var16] * (long) Class13.anIntArrayArray176[1][var16] >> 16);
							}

							anIntArray161[var3] = var15;
							var13 = aClass11_169.method232(var1 + 1);
							++var3;
						}

						if (var3 >= var1 - var14) {
							while (var3 < var1) {
								var15 = 0;

								for (var16 = var3 + var14 - var1; var16 < var14; var16++) {
									var15 += (int) ((long) anIntArray161[var3 + var14 - 1 - var16] * (long) Class13.anIntArrayArray176[0][var16] >> 16);
								}

								for (var16 = 0; var16 < var17; var16++) {
									var15 -= (int) ((long) anIntArray161[var3 - 1 - var16] * (long) Class13.anIntArrayArray176[1][var16] >> 16);
								}

								anIntArray161[var3] = var15;
								aClass11_169.method232(var1 + 1);
								++var3;
							}
							break;
						}

						var14 = aClass13_157.method248(0, (float) var13 / 65536.0F);
						var17 = aClass13_157.method248(1, (float) var13 / 65536.0F);
						var4 += 128;
					}
				}
			}

			for (var13 = 0; var13 < var1; var13++) {
				if (anIntArray161[var13] < -32768) {
					anIntArray161[var13] = -32768;
				}

				if (anIntArray161[var13] > 32767) {
					anIntArray161[var13] = 32767;
				}
			}

			return anIntArray161;
		}
	}

	static {
		Random var1 = new Random(0L);

		int var0;
		for (var0 = 0; var0 < 32768; var0++) {
			anIntArray155[var0] = (var1.nextInt() & 2) - 1;
		}

		anIntArray163 = new int[32768];

		for (var0 = 0; var0 < 32768; var0++) {
			anIntArray163[var0] = (int) (Math.sin((double) var0 / 5215.1903D) * 16384.0D);
		}

		anIntArray161 = new int[220500];
		anIntArray165 = new int[5];
		anIntArray166 = new int[5];
		anIntArray154 = new int[5];
		anIntArray168 = new int[5];
		anIntArray162 = new int[5];
	}

	final int method234(int var1, int var2, int var3) {
		return var3 == 1 ? ((var1 & 32767) < 16384 ? var2 : -var2) : (var3 == 2 ? anIntArray163[var1 & 32767] * var2 >> 14 : (var3 == 3 ? ((var1 & 32767) * var2 >> 14) - var2 : (var3 == 4 ? anIntArray155[var1 / 2607 & 32767] * var2 : 0)));
	}

	final void method235(DataBuffer var1) {
		aClass11_167 = new Class11();
		aClass11_167.method219(var1);
		aClass11_145 = new Class11();
		aClass11_145.method219(var1);
		int var2 = var1.readUByte();
		if (var2 != 0) {
			var1.pos -= 1303963473;
			aClass11_146 = new Class11();
			aClass11_146.method219(var1);
			aClass11_158 = new Class11();
			aClass11_158.method219(var1);
		}

		var2 = var1.readUByte();
		if (var2 != 0) {
			var1.pos -= 1303963473;
			aClass11_147 = new Class11();
			aClass11_147.method219(var1);
			aClass11_149 = new Class11();
			aClass11_149.method219(var1);
		}

		var2 = var1.readUByte();
		if (var2 != 0) {
			var1.pos -= 1303963473;
			aClass11_150 = new Class11();
			aClass11_150.method219(var1);
			aClass11_151 = new Class11();
			aClass11_151.method219(var1);
		}

		for (int var3 = 0; var3 < 10; var3++) {
			int var4 = var1.readCompact();
			if (var4 == 0) {
				break;
			}

			anIntArray156[var3] = var4;
			anIntArray153[var3] = var1.method1881();
			anIntArray152[var3] = var1.readCompact();
		}

		anInt160 = var1.readCompact();
		anInt148 = var1.readCompact();
		anInt159 = var1.readUShort();
		anInt144 = var1.readUShort();
		aClass13_157 = new Class13();
		aClass11_169 = new Class11();
		aClass13_157.method249(var1, aClass11_169);
	}

}
