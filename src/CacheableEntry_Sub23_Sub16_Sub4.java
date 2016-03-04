public final class CacheableEntry_Sub23_Sub16_Sub4 extends CacheableEntry_Sub23_Sub16 {

	static final int anInt2599 = 44;
	static int[] anIntArray2617;
	static final int anInt2624 = 50;
	static final int anInt2626 = 8;
	public static final int anInt2628 = 50;
	public static final int anInt2629 = 32;
	double aDouble2611;
	double aDouble2612;
	double aDouble2613;
	double aDouble2614;
	double aDouble2615;
	double aDouble2607;
	double aDouble2620;
	double aDouble2627;
	boolean aBool2610 = false;
	int anInt2622 = 0;
	int anInt2618 = 0;
	int anInt2608;
	int anInt2623;
	int anInt2601;
	int anInt2602;
	int anInt2603;
	int anInt2605;
	int anInt2606;
	int anInt2616;
	int anInt2600;
	int anInt2609;
	int anInt2604;
	AnimationSequence aClass109_Sub23_Sub4_2621;
	int anInt2619;
	int anInt2625;

	final void method3065(int var1, int var2, int var3, int var4, int var5) {
		double var6;
		if (!aBool2610) {
			var6 = (double) (var1 - anInt2601 * 903659333);
			double var8 = (double) (var2 - anInt2602 * -1408090797);
			double var10 = Math.sqrt(var8 * var8 + var6 * var6);
			aDouble2611 = (double) (anInt2600 * 1402005453) * var6 / var10 + (double) (anInt2601 * 903659333);
			aDouble2612 = (double) (anInt2602 * -1408090797) + (double) (anInt2600 * 1402005453) * var8 / var10;
			aDouble2613 = (double) (anInt2603 * -810867519);
		}

		var6 = (double) (1 + anInt2606 * -588609769 - var4);
		aDouble2614 = ((double) var1 - aDouble2611) / var6;
		aDouble2615 = ((double) var2 - aDouble2612) / var6;
		aDouble2607 = Math.sqrt(aDouble2615 * aDouble2615 + aDouble2614 * aDouble2614);
		if (!aBool2610) {
			aDouble2620 = -aDouble2607 * Math.tan(0.02454369D * (double) (anInt2616 * -1011861797));
		}

		aDouble2627 = ((double) var3 - aDouble2613 - aDouble2620 * var6) * 2.0D / (var6 * var6);
	}

	static final void method3067(int var0, int var1, int var2) {
		int var3 = Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343.method3311(Class90.CHOOSE_OPTION);

		int var4;
		for (var4 = 0; var4 < GameClient.menuActionPtr * 1324290403; var4++) {
			CacheableEntry_Sub23_Sub14_Sub4_Sub1 var6 = Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343;
			String var5;
			if (GameClient.menuOptionTexts[var4].length() > 0) {
				var5 = GameClient.menuOptions[var4] + Class90.aString1216 + GameClient.menuOptionTexts[var4];
			} else {
				var5 = GameClient.menuOptions[var4];
			}

			int var7 = var6.method3311(var5);
			if (var7 > var3) {
				var3 = var7;
			}
		}

		var3 += 8;
		var4 = 22 + GameClient.menuActionPtr * -1610480435;
		int var9 = var0 - var3 / 2;
		if (var9 + var3 > Class5.anInt98 * 2104430923) {
			var9 = Class5.anInt98 * 2104430923 - var3;
		}

		if (var9 < 0) {
			var9 = 0;
		}

		int var8 = var1;
		if (var1 + var4 > Class60.anInt769 * -1064642111) {
			var8 = Class60.anInt769 * -1064642111 - var4;
		}

		if (var8 < 0) {
			var8 = 0;
		}

		GameClient.aBool3006 = true;
		LinkedEntry_Sub6.anInt1731 = var9 * -930781789;
		CacheableEntry_Sub23_Sub16_Sub7.anInt2779 = var8 * 950856023;
		Class3.anInt74 = var3 * -2100781647;
		CacheableEntry_Sub23_Sub16_Sub2.anInt2568 = GameClient.menuActionPtr * 809851591 + 1528091010;
	}

	protected final CacheableEntry_Sub23_Sub16_Sub5 method2791(int var1) {
		GfxDef var2 = Class42.getGfxDef(anInt2608 * -638019125);
		CacheableEntry_Sub23_Sub16_Sub5 var3 = var2.method2522(anInt2622 * 1167047727, 1298418401);
		if (var3 == null) {
			return null;
		} else {
			var3.method3091(anInt2625 * 1974953189);
			return var3;
		}
	}

	CacheableEntry_Sub23_Sub16_Sub4(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		anInt2608 = var1 * -855718941;
		anInt2623 = var2 * -1900194561;
		anInt2601 = var3 * 863697805;
		anInt2602 = var4 * 40439515;
		anInt2603 = var5 * -1376818367;
		anInt2605 = var6 * -2081324489;
		anInt2606 = var7 * 842604711;
		anInt2616 = var8 * 617534803;
		anInt2600 = var9 * -3252987;
		anInt2609 = var10 * 555147765;
		anInt2604 = var11 * -852608179;
		aBool2610 = false;
		int var12 = Class42.getGfxDef(anInt2608 * -638019125).animId * 28936275;
		if (var12 != -1) {
			aClass109_Sub23_Sub4_2621 = CacheableEntry_Sub23_Sub11.getAnimation(var12);
		} else {
			aClass109_Sub23_Sub4_2621 = null;
		}

	}

	final void method3072(int var1, int var2) {
		aBool2610 = true;
		aDouble2611 += (double) var1 * aDouble2614;
		aDouble2612 += aDouble2615 * (double) var1;
		aDouble2613 += (double) var1 * 0.5D * aDouble2627 * (double) var1 + (double) var1 * aDouble2620;
		aDouble2620 += aDouble2627 * (double) var1;
		anInt2619 = ((int) (Math.atan2(aDouble2614, aDouble2615) * 325.949D) + 1024 & 2047) * 602370227;
		anInt2625 = ((int) (Math.atan2(aDouble2620, aDouble2607) * 325.949D) & 2047) * 1907865837;
		if (aClass109_Sub23_Sub4_2621 != null) {
			anInt2618 += var1 * 353097167;

			while (true) {
				do {
					do {
						if (anInt2618 * 630133039 <= aClass109_Sub23_Sub4_2621.anIntArray2183[anInt2622 * 1167047727]) {
							return;
						}

						anInt2618 -= aClass109_Sub23_Sub4_2621.anIntArray2183[anInt2622 * 1167047727] * 353097167;
						anInt2622 -= 417133873;
					} while (anInt2622 * 1167047727 < aClass109_Sub23_Sub4_2621.anIntArray2169.length);

					anInt2622 -= aClass109_Sub23_Sub4_2621.anInt2182 * 424092745;
				}
				while (anInt2622 * 1167047727 >= 0 && anInt2622 * 1167047727 < aClass109_Sub23_Sub4_2621.anIntArray2169.length);

				anInt2622 = 0;
			}
		}
	}

	public static Class59 method3073(int var0, short var1) {
		Class59[] var2 = new Class59[]{Class59.aClass59_768, Class59.aClass59_762, Class59.aClass59_763};
		Class59[] var3 = var2;

		for (int var4 = 0; var4 < var3.length; var4++) {
			Class59 var5 = var3[var4];
			if (var0 == var5.anInt764 * 1330568289) {
				return var5;
			}
		}

		return null;
	}

	static InterfaceDef method3074(InterfaceDef var0, int var1) {
		int var2 = InterfaceDef.method2208(LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(var0), 814910598);
		if (var2 == 0) {
			return null;
		} else {
			for (int var3 = 0; var3 < var2; var3++) {
				var0 = Class50.method713(var0.anInt1958 * -1588791493, (byte) 72);
				if (var0 == null) {
					return null;
				}
			}

			return var0;
		}
	}

	static final void method3075(int var0, int var1, int var2, int var3, int var4) {
		for (int var5 = 0; var5 < GameClient.anInt2894 * -2099955589; var5++) {
			if (GameClient.anIntArray2876[var5] + GameClient.anIntArray3077[var5] > var0 && GameClient.anIntArray2876[var5] < var0 + var2 && GameClient.anIntArray3078[var5] + GameClient.anIntArray3076[var5] > var1 && GameClient.anIntArray3076[var5] < var3 + var1) {
				GameClient.aBoolArray3072[var5] = true;
			}
		}

	}

	static final int perlinMapNoise(int x, int z) {
		int var3 = CacheableEntry_Sub23_Sub11.method2510(x + 45365, z + 91923, 4) - 128 + (CacheableEntry_Sub23_Sub11.method2510(10294 + x, 37821 + z, 2) - 128 >> 1) + (CacheableEntry_Sub23_Sub11.method2510(x, z, 1) - 128 >> 2);
		var3 = (int) ((double) var3 * 0.3D) + 35;
		if (var3 < 10) {
			var3 = 10;
		} else if (var3 > 60) {
			var3 = 60;
		}

		return var3;
	}

}
