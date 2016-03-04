public class Class9 {

	int anInt123;
	int anInt119;
	int[] anIntArray120;
	int[] anIntArray122;
	float[][] aFloatArrayArray118;
	int[] anIntArray121;

	Class9() {
		LinkedEntry_Sub2.method1725(24);
		anInt123 = LinkedEntry_Sub2.method1725(16);
		anInt119 = LinkedEntry_Sub2.method1725(24);
		anIntArray120 = new int[anInt119];
		boolean var4 = LinkedEntry_Sub2.method1724() != 0;
		int var1;
		int var2;
		int var6;
		if (var4) {
			var2 = 0;

			for (var1 = LinkedEntry_Sub2.method1725(5) + 1; var2 < anInt119; var1++) {
				int var7 = LinkedEntry_Sub2.method1725(ObjectDef.method2467(anInt119 - var2, 1480296231));

				for (var6 = 0; var6 < var7; var6++) {
					anIntArray120[var2++] = var1;
				}
			}
		} else {
			boolean var15 = LinkedEntry_Sub2.method1724() != 0;

			for (var1 = 0; var1 < anInt119; var1++) {
				if (var15 && LinkedEntry_Sub2.method1724() == 0) {
					anIntArray120[var1] = 0;
				} else {
					anIntArray120[var1] = LinkedEntry_Sub2.method1725(5) + 1;
				}
			}
		}

		method199();
		var2 = LinkedEntry_Sub2.method1725(4);
		if (var2 > 0) {
			float var14 = LinkedEntry_Sub2.method1749(LinkedEntry_Sub2.method1725(32));
			float var16 = LinkedEntry_Sub2.method1749(LinkedEntry_Sub2.method1725(32));
			var6 = LinkedEntry_Sub2.method1725(4) + 1;
			boolean var5 = LinkedEntry_Sub2.method1724() != 0;
			int var9;
			if (var2 == 1) {
				var9 = method198(anInt119, anInt123);
			} else {
				var9 = anInt119 * anInt123;
			}

			anIntArray122 = new int[var9];

			int var3;
			for (var3 = 0; var3 < var9; var3++) {
				anIntArray122[var3] = LinkedEntry_Sub2.method1725(var6);
			}

			aFloatArrayArray118 = new float[anInt119][anInt123];
			int var8;
			float var11;
			int var12;
			if (var2 == 1) {
				for (var3 = 0; var3 < anInt119; var3++) {
					var11 = 0.0F;
					var8 = 1;

					for (var12 = 0; var12 < anInt123; var12++) {
						int var10 = var3 / var8 % var9;
						float var13 = (float) anIntArray122[var10] * var16 + var14 + var11;
						aFloatArrayArray118[var3][var12] = var13;
						if (var5) {
							var11 = var13;
						}

						var8 *= var9;
					}
				}
			} else {
				for (var3 = 0; var3 < anInt119; var3++) {
					var11 = 0.0F;
					var8 = var3 * anInt123;

					for (var12 = 0; var12 < anInt123; var12++) {
						float var17 = (float) anIntArray122[var8] * var16 + var14 + var11;
						aFloatArrayArray118[var3][var12] = var17;
						if (var5) {
							var11 = var17;
						}

						++var8;
					}
				}
			}
		}

	}

	float[] method192() {
		return aFloatArrayArray118[method193()];
	}

	int method193() {
		int var1;
		for (var1 = 0; anIntArray121[var1] >= 0; var1 = LinkedEntry_Sub2.method1724() != 0 ? anIntArray121[var1] : var1 + 1) {
			;
		}

		return ~anIntArray121[var1];
	}

	static int method198(int var0, int var1) {
		int var2 = (int) Math.pow((double) var0, 1.0D / (double) var1) + 1;

		while (true) {
			int var4 = var2;
			int var6 = var1;

			int var3;
			for (var3 = 1; var6 > 1; var6 >>= 1) {
				if ((var6 & 1) != 0) {
					var3 *= var4;
				}

				var4 *= var4;
			}

			int var5;
			if (var6 == 1) {
				var5 = var3 * var4;
			} else {
				var5 = var3;
			}

			if (var5 <= var0) {
				return var2;
			}

			--var2;
		}
	}

	void method199() {
		int[] var1 = new int[anInt119];
		int[] var3 = new int[33];

		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var10;
		for (var4 = 0; var4 < anInt119; var4++) {
			var5 = anIntArray120[var4];
			if (var5 != 0) {
				var6 = 1 << 32 - var5;
				var2 = var3[var5];
				var1[var4] = var2;
				int var9;
				if ((var2 & var6) != 0) {
					var7 = var3[var5 - 1];
				} else {
					var7 = var2 | var6;

					for (var8 = var5 - 1; var8 >= 1; --var8) {
						var9 = var3[var8];
						if (var9 != var2) {
							break;
						}

						var10 = 1 << 32 - var8;
						if ((var9 & var10) != 0) {
							var3[var8] = var3[var8 - 1];
							break;
						}

						var3[var8] = var9 | var10;
					}
				}

				var3[var5] = var7;

				for (var8 = var5 + 1; var8 <= 32; var8++) {
					var9 = var3[var8];
					if (var9 == var2) {
						var3[var8] = var7;
					}
				}
			}
		}

		anIntArray121 = new int[8];
		int var11 = 0;

		for (var4 = 0; var4 < anInt119; var4++) {
			var5 = anIntArray120[var4];
			if (var5 != 0) {
				var6 = var1[var4];
				var2 = 0;

				for (var7 = 0; var7 < var5; var7++) {
					var8 = -2147483648 >>> var7;
					if ((var6 & var8) != 0) {
						if (anIntArray121[var2] == 0) {
							anIntArray121[var2] = var11;
						}

						var2 = anIntArray121[var2];
					} else {
						++var2;
					}

					if (var2 >= anIntArray121.length) {
						int[] var12 = new int[anIntArray121.length * 2];

						for (var10 = 0; var10 < anIntArray121.length; var10++) {
							var12[var10] = anIntArray121[var10];
						}

						anIntArray121 = var12;
					}

					var8 >>>= 1;
				}

				anIntArray121[var2] = ~var4;
				if (var2 >= var11) {
					var11 = var2 + 1;
				}
			}
		}

	}

}
