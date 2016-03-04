public class Class17 {

	int anInt213 = LinkedEntry_Sub2.method1725(16);
	int anInt209 = LinkedEntry_Sub2.method1725(24);
	int anInt210 = LinkedEntry_Sub2.method1725(24);
	int anInt211 = LinkedEntry_Sub2.method1725(24) + 1;
	int anInt208 = LinkedEntry_Sub2.method1725(6) + 1;
	int anInt212 = LinkedEntry_Sub2.method1725(8);
	int[] anIntArray214;

	Class17() {
		int[] var2 = new int[anInt208];

		int var3;
		for (var3 = 0; var3 < anInt208; var3++) {
			int var4 = 0;
			int var5 = LinkedEntry_Sub2.method1725(3);
			boolean var1 = LinkedEntry_Sub2.method1724() != 0;
			if (var1) {
				var4 = LinkedEntry_Sub2.method1725(5);
			}

			var2[var3] = var4 << 3 | var5;
		}

		anIntArray214 = new int[anInt208 * 8];

		for (var3 = 0; var3 < anInt208 * 8; var3++) {
			anIntArray214[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? LinkedEntry_Sub2.method1725(8) : -1;
		}

	}

	void method304(float[] var1, int var2, boolean var3) {
		int var4;
		for (var4 = 0; var4 < var2; var4++) {
			var1[var4] = 0.0F;
		}

		if (!var3) {
			var4 = LinkedEntry_Sub2.aClass9Array1664[anInt212].anInt123;
			int var15 = anInt210 - anInt209;
			int var16 = var15 / anInt211;
			int[] var8 = new int[var16];

			for (int var14 = 0; var14 < 8; var14++) {
				int var9 = 0;

				while (var9 < var16) {
					int var10;
					int var12;
					if (var14 == 0) {
						var12 = LinkedEntry_Sub2.aClass9Array1664[anInt212].method193();

						for (var10 = var4 - 1; var10 >= 0; --var10) {
							if (var9 + var10 < var16) {
								var8[var9 + var10] = var12 % anInt208;
							}

							var12 /= anInt208;
						}
					}

					for (var12 = 0; var12 < var4; var12++) {
						var10 = var8[var9];
						int var17 = anIntArray214[var10 * 8 + var14];
						if (var17 >= 0) {
							int var13 = anInt209 + var9 * anInt211;
							Class9 var5 = LinkedEntry_Sub2.aClass9Array1664[var17];
							int var11;
							if (anInt213 == 0) {
								var11 = anInt211 / var5.anInt123;

								for (int var20 = 0; var20 < var11; var20++) {
									float[] var19 = var5.method192();

									for (int var18 = 0; var18 < var5.anInt123; var18++) {
										var1[var13 + var20 + var18 * var11] += var19[var18];
									}
								}
							} else {
								var11 = 0;

								while (var11 < anInt211) {
									float[] var7 = var5.method192();

									for (int var6 = 0; var6 < var5.anInt123; var6++) {
										var1[var13 + var11] += var7[var6];
										++var11;
									}
								}
							}
						}

						++var9;
						if (var9 >= var16) {
							break;
						}
					}
				}
			}

		}
	}

}
