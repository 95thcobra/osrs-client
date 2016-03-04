public class Class39 {

	static final int anInt524 = 128;
	static final int anInt525 = 64;
	static final int anInt536 = 25;
	static final int anInt544 = 128;
	static final int anInt551 = 32;
	static final int anInt565 = 50;
	int anInt550 = 0;
	int anInt526 = 0;
	public static boolean aBool535 = true;
	static int anInt528 = 0;
	static int anInt529 = 0;
	static Class33[] aClass33Array527 = new Class33[100];
	static boolean aBool553 = false;
	static int anInt546 = 0;
	static int anInt547 = 0;
	static int anInt548 = 0;
	public static int anInt545 = -1;
	public static int anInt520 = -1;
	static int anInt514 = 4;
	static int[] anIntArray554;
	static Class22[][] aClass22ArrayArray539;
	static int anInt573;
	static Class22[] aClass22Array557;
	static JagexLinkedList aJagexLinkedList_558;
	static int[] anIntArray559;
	static int[] anIntArray560;
	static int[] anIntArray516;
	static int[] anIntArray562;
	static int[] anIntArray563;
	static int[] anIntArray564;
	static int[] anIntArray537;
	static boolean[][][][] aBoolArrayArrayArrayArray518;
	static int anInt572;
	static int anInt521;
	static int anInt574;
	static int anInt575;
	static int anInt570;
	static int anInt571;
	static int anInt540;
	static int anInt541;
	static int anInt542;
	static int anInt543;
	static int anInt530;
	static boolean[][] aBoolArrayArray569;
	static int anInt552;
	static int anInt538;
	static int anInt556;
	static int anInt517;
	static int anInt519;
	static int anInt531;
	static int anInt533;
	static int anInt532;
	static int anInt534;
	Class33[] aClass33Array522 = new Class33[5000];
	int[][] anIntArrayArray566 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
	int[][] anIntArrayArray567 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
	int anInt515;
	int anInt568;
	int anInt561;
	LinkedEntry_Sub12[][][] aClass109_Sub12ArrayArrayArray555;
	int[][][] anIntArrayArrayArray523;
	int[][][] anIntArrayArrayArray549;

	public void method501() {
		int var1;
		int var2;
		for (var1 = 0; var1 < anInt515; var1++) {
			for (var2 = 0; var2 < anInt568; var2++) {
				for (int var3 = 0; var3 < anInt561; var3++) {
					aClass109_Sub12ArrayArrayArray555[var1][var2][var3] = null;
				}
			}
		}

		for (var1 = 0; var1 < anInt514; var1++) {
			for (var2 = 0; var2 < anIntArray554[var1]; var2++) {
				aClass22ArrayArray539[var1][var2] = null;
			}

			anIntArray554[var1] = 0;
		}

		for (var1 = 0; var1 < anInt550; var1++) {
			aClass33Array522[var1] = null;
		}

		anInt550 = 0;

		for (var1 = 0; var1 < aClass33Array527.length; var1++) {
			aClass33Array527[var1] = null;
		}

	}

	public void method502(int var1) {
		anInt526 = var1;

		for (int var2 = 0; var2 < anInt568; var2++) {
			for (int var3 = 0; var3 < anInt561; var3++) {
				if (aClass109_Sub12ArrayArrayArray555[var1][var2][var3] == null) {
					aClass109_Sub12ArrayArrayArray555[var1][var2][var3] = new LinkedEntry_Sub12(var1, var2, var3);
				}
			}
		}

	}

	public void method503(int var1, int var2) {
		LinkedEntry_Sub12 var3 = aClass109_Sub12ArrayArrayArray555[0][var1][var2];

		for (int var4 = 0; var4 < 3; var4++) {
			LinkedEntry_Sub12 var5 = aClass109_Sub12ArrayArrayArray555[var4][var1][var2] = aClass109_Sub12ArrayArrayArray555[var4 + 1][var1][var2];
			if (var5 != null) {
				var5.anInt1808 += 2030123745;

				for (int var6 = 0; var6 < var5.anInt1813 * -1988543331; var6++) {
					Class33 var7 = var5.aClass33Array1805[var6];
					if ((var7.anInt426 * 2064355509 >> 29 & 3) == 2 && var7.anInt419 * 974211349 == var1 && var7.anInt421 * 26398035 == var2) {
						var7.anInt429 -= 1554205931;
					}
				}
			}
		}

		if (aClass109_Sub12ArrayArrayArray555[0][var1][var2] == null) {
			aClass109_Sub12ArrayArrayArray555[0][var1][var2] = new LinkedEntry_Sub12(0, var1, var2);
		}

		aClass109_Sub12ArrayArrayArray555[0][var1][var2].aClass109_Sub12_1804 = var3;
		aClass109_Sub12ArrayArrayArray555[3][var1][var2] = null;
	}

	public void method508(int var1, int var2, int var3, int var4, CacheableEntry_Sub23_Sub16 var5, int var6, CacheableEntry_Sub23_Sub16 var7, CacheableEntry_Sub23_Sub16 var8) {
		Class19 var9 = new Class19();
		var9.aClass109_Sub23_Sub16_226 = var5;
		var9.anInt224 = var2 * 807165824 + 403582912;
		var9.anInt225 = var3 * -88815488 - 44407744;
		var9.anInt223 = var4 * 1265647705;
		var9.anInt232 = var6 * 1608567821;
		var9.aClass109_Sub23_Sub16_227 = var7;
		var9.aClass109_Sub23_Sub16_228 = var8;
		int var10 = 0;
		LinkedEntry_Sub12 var11 = aClass109_Sub12ArrayArrayArray555[var1][var2][var3];
		if (var11 != null) {
			for (int var12 = 0; var12 < var11.anInt1813 * -1988543331; var12++) {
				if ((var11.aClass33Array1805[var12].anInt413 * -924305457 & 256) == 256 && var11.aClass33Array1805[var12].aClass109_Sub23_Sub16_417 instanceof CacheableEntry_Sub23_Sub16_Sub5) {
					CacheableEntry_Sub23_Sub16_Sub5 var13 = (CacheableEntry_Sub23_Sub16_Sub5) var11.aClass33Array1805[var12].aClass109_Sub23_Sub16_417;
					var13.method3082();
					if (var13.anInt2410 * -695779227 > var10) {
						var10 = var13.anInt2410 * -695779227;
					}
				}
			}
		}

		var9.anInt229 = var10 * 1620480151;
		if (aClass109_Sub12ArrayArrayArray555[var1][var2][var3] == null) {
			aClass109_Sub12ArrayArrayArray555[var1][var2][var3] = new LinkedEntry_Sub12(var1, var2, var3);
		}

		aClass109_Sub12ArrayArrayArray555[var1][var2][var3].aClass19_1803 = var9;
	}

	public void method509(int var1, int var2, int var3, int var4, CacheableEntry_Sub23_Sub16 var5, CacheableEntry_Sub23_Sub16 var6, int var7, int var8, int var9, int var10) {
		if (var5 != null || var6 != null) {
			Class26 var12 = new Class26();
			var12.anInt331 = var9 * -289909937;
			var12.anInt332 = var10 * -1592113075;
			var12.anInt325 = var2 * 688727936 - 1803119680;
			var12.anInt326 = var3 * -1029665920 + 1632650688;
			var12.anInt327 = var4 * -82761751;
			var12.aClass109_Sub23_Sub16_333 = var5;
			var12.aClass109_Sub23_Sub16_330 = var6;
			var12.anInt324 = var7 * -1473627473;
			var12.anInt328 = var8 * 361916571;

			for (int var11 = var1; var11 >= 0; --var11) {
				if (aClass109_Sub12ArrayArrayArray555[var11][var2][var3] == null) {
					aClass109_Sub12ArrayArrayArray555[var11][var2][var3] = new LinkedEntry_Sub12(var11, var2, var3);
				}
			}

			aClass109_Sub12ArrayArrayArray555[var1][var2][var3].aClass26_1800 = var12;
		}
	}

	public void method510(int var1, int var2, int var3, int var4, CacheableEntry_Sub23_Sub16 var5, CacheableEntry_Sub23_Sub16 var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		if (var5 != null) {
			Class21 var13 = new Class21();
			var13.anInt262 = var11 * -1713765193;
			var13.anInt268 = var12 * -1482230449;
			var13.anInt258 = var2 * -1871511424 + 1211727936;
			var13.anInt270 = var3 * 1299199360 + 649599680;
			var13.anInt259 = var4 * -1871858097;
			var13.aClass109_Sub23_Sub16_265 = var5;
			var13.aClass109_Sub23_Sub16_266 = var6;
			var13.anInt261 = var7 * -1532218829;
			var13.anInt267 = var8 * 1093461913;
			var13.anInt263 = var9 * -371331331;
			var13.anInt264 = var10 * -653275453;

			for (int var14 = var1; var14 >= 0; --var14) {
				if (aClass109_Sub12ArrayArrayArray555[var14][var2][var3] == null) {
					aClass109_Sub12ArrayArrayArray555[var14][var2][var3] = new LinkedEntry_Sub12(var14, var2, var3);
				}
			}

			aClass109_Sub12ArrayArrayArray555[var1][var2][var3].aClass21_1810 = var13;
		}
	}

	public boolean method512(int var1, int var2, int var3, int var4, int var5, CacheableEntry_Sub23_Sub16 var6, int var7, int var8, boolean var9) {
		if (var6 == null) {
			return true;
		} else {
			int var10 = var2 - var5;
			int var13 = var3 - var5;
			int var11 = var2 + var5;
			int var12 = var3 + var5;
			if (var9) {
				if (var7 > 640 && var7 < 1408) {
					var12 += 128;
				}

				if (var7 > 1152 && var7 < 1920) {
					var11 += 128;
				}

				if (var7 > 1664 || var7 < 384) {
					var13 -= 128;
				}

				if (var7 > 128 && var7 < 896) {
					var10 -= 128;
				}
			}

			var10 /= 128;
			var13 /= 128;
			var11 /= 128;
			var12 /= 128;
			return method514(var1, var10, var13, var11 - var10 + 1, var12 - var13 + 1, var2, var3, var4, var6, var7, true, var8, 0);
		}
	}

	public boolean method513(int var1, int var2, int var3, int var4, int var5, CacheableEntry_Sub23_Sub16 var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		return var6 == null ? true : method514(var1, var9, var10, var11 - var9 + 1, var12 - var10 + 1, var2, var3, var4, var6, var7, true, var8, 0);
	}

	boolean method514(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, CacheableEntry_Sub23_Sub16 var9, int var10, boolean var11, int var12, int var13) {
		int var16;
		for (int var14 = var2; var14 < var2 + var4; var14++) {
			for (var16 = var3; var16 < var3 + var5; var16++) {
				if (var14 < 0 || var16 < 0 || var14 >= anInt568 || var16 >= anInt561) {
					return false;
				}

				LinkedEntry_Sub12 var18 = aClass109_Sub12ArrayArrayArray555[var1][var14][var16];
				if (var18 != null && var18.anInt1813 * -1988543331 >= 5) {
					return false;
				}
			}
		}

		Class33 var20 = new Class33();
		var20.anInt426 = var12 * -1618158179;
		var20.anInt413 = var13 * -1343918289;
		var20.anInt429 = var1 * 1554205931;
		var20.anInt415 = var6 * 1281627321;
		var20.anInt416 = var7 * -1909554719;
		var20.anInt425 = var8 * 1153148755;
		var20.aClass109_Sub23_Sub16_417 = var9;
		var20.anInt418 = var10 * -722655397;
		var20.anInt419 = var2 * 538230333;
		var20.anInt421 = var3 * 1497824987;
		var20.anInt420 = (var2 + var4 - 1) * -997233943;
		var20.anInt422 = (var3 + var5 - 1) * 212312201;

		for (var16 = var2; var16 < var2 + var4; var16++) {
			for (int var22 = var3; var22 < var3 + var5; var22++) {
				int var15 = 0;
				if (var16 > var2) {
					++var15;
				}

				if (var16 < var2 + var4 - 1) {
					var15 += 4;
				}

				if (var22 > var3) {
					var15 += 8;
				}

				if (var22 < var3 + var5 - 1) {
					var15 += 2;
				}

				for (int var17 = var1; var17 >= 0; --var17) {
					if (aClass109_Sub12ArrayArrayArray555[var17][var16][var22] == null) {
						aClass109_Sub12ArrayArrayArray555[var17][var16][var22] = new LinkedEntry_Sub12(var17, var16, var22);
					}
				}

				LinkedEntry_Sub12 var21 = aClass109_Sub12ArrayArrayArray555[var1][var16][var22];
				var21.aClass33Array1805[var21.anInt1813 * -1988543331] = var20;
				var21.anIntArray1795[var21.anInt1813 * -1988543331] = var15;
				var21.anInt1807 = (var21.anInt1807 * 577334149 | var15) * 1544672589;
				var21.anInt1813 += 1022306741;
			}
		}

		if (var11) {
			aClass33Array522[anInt550++] = var20;
		}

		return true;
	}

	public void method517(int var1, int var2, int var3, int var4) {
		LinkedEntry_Sub12 var5 = aClass109_Sub12ArrayArrayArray555[var1][var2][var3];
		if (var5 != null) {
			Class21 var6 = var5.aClass21_1810;
			if (var6 != null) {
				var6.anInt263 = var6.anInt263 * 551951957 * var4 / 16 * -371331331;
				var6.anInt264 = var6.anInt264 * -1013919253 * var4 / 16 * -653275453;
			}
		}
	}

	public void method518(int var1, int var2, int var3) {
		LinkedEntry_Sub12 var4 = aClass109_Sub12ArrayArrayArray555[var1][var2][var3];
		if (var4 != null) {
			var4.aClass26_1800 = null;
		}
	}

	public void method520(int var1, int var2, int var3) {
		LinkedEntry_Sub12 var4 = aClass109_Sub12ArrayArrayArray555[var1][var2][var3];
		if (var4 != null) {
			var4.aClass21_1810 = null;
		}
	}

	public void method521(int var1, int var2, int var3) {
		LinkedEntry_Sub12 var4 = aClass109_Sub12ArrayArrayArray555[var1][var2][var3];
		if (var4 != null) {
			var4.aClass38_1802 = null;
		}
	}

	public void method522(int var1, int var2, int var3) {
		LinkedEntry_Sub12 var4 = aClass109_Sub12ArrayArrayArray555[var1][var2][var3];
		if (var4 != null) {
			var4.aClass19_1803 = null;
		}
	}

	public void method523(int var1, int var2, int var3, int var4, CacheableEntry_Sub23_Sub16 var5, int var6, int var7) {
		if (var5 != null) {
			Class38 var8 = new Class38();
			var8.aClass109_Sub23_Sub16_509 = var5;
			var8.anInt504 = var2 * -682359680 + 1806303808;
			var8.anInt505 = var3 * 428621952 + 214310976;
			var8.anInt506 = var4 * 1947560011;
			var8.anInt507 = var6 * 1874525795;
			var8.anInt510 = var7 * -1138532503;
			if (aClass109_Sub12ArrayArrayArray555[var1][var2][var3] == null) {
				aClass109_Sub12ArrayArrayArray555[var1][var2][var3] = new LinkedEntry_Sub12(var1, var2, var3);
			}

			aClass109_Sub12ArrayArrayArray555[var1][var2][var3].aClass38_1802 = var8;
		}
	}

	public Class21 method524(int var1, int var2, int var3) {
		LinkedEntry_Sub12 var4 = aClass109_Sub12ArrayArrayArray555[var1][var2][var3];
		return var4 == null ? null : var4.aClass21_1810;
	}

	public Class38 method526(int var1, int var2, int var3) {
		LinkedEntry_Sub12 var4 = aClass109_Sub12ArrayArrayArray555[var1][var2][var3];
		return var4 != null && var4.aClass38_1802 != null ? var4.aClass38_1802 : null;
	}

	void method527(Class33 var1) {
		for (int var2 = var1.anInt419 * 974211349; var2 <= var1.anInt420 * 910560601; var2++) {
			for (int var5 = var1.anInt421 * 26398035; var5 <= var1.anInt422 * 1865668025; var5++) {
				LinkedEntry_Sub12 var4 = aClass109_Sub12ArrayArrayArray555[var1.anInt429 * 1696005059][var2][var5];
				if (var4 != null) {
					int var3;
					for (var3 = 0; var3 < var4.anInt1813 * -1988543331; var3++) {
						if (var4.aClass33Array1805[var3] == var1) {
							var4.anInt1813 -= 1022306741;

							for (int var6 = var3; var6 < var4.anInt1813 * -1988543331; var6++) {
								var4.aClass33Array1805[var6] = var4.aClass33Array1805[var6 + 1];
								var4.anIntArray1795[var6] = var4.anIntArray1795[var6 + 1];
							}

							var4.aClass33Array1805[var4.anInt1813 * -1988543331] = null;
							break;
						}
					}

					var4.anInt1807 = 0;

					for (var3 = 0; var3 < var4.anInt1813 * -1988543331; var3++) {
						var4.anInt1807 = (var4.anInt1807 * 577334149 | var4.anIntArray1795[var3]) * 1544672589;
					}
				}
			}
		}

	}

	public int method528(int var1, int var2, int var3) {
		LinkedEntry_Sub12 var4 = aClass109_Sub12ArrayArrayArray555[var1][var2][var3];
		return var4 != null && var4.aClass21_1810 != null ? var4.aClass21_1810.anInt262 * -133424889 : 0;
	}

	public int method529(int var1, int var2, int var3) {
		LinkedEntry_Sub12 var4 = aClass109_Sub12ArrayArrayArray555[var1][var2][var3];
		if (var4 == null) {
			return 0;
		} else {
			for (int var6 = 0; var6 < var4.anInt1813 * -1988543331; var6++) {
				Class33 var5 = var4.aClass33Array1805[var6];
				if ((var5.anInt426 * 2064355509 >> 29 & 3) == 2 && var5.anInt419 * 974211349 == var2 && var5.anInt421 * 26398035 == var3) {
					return var5.anInt426 * 2064355509;
				}
			}

			return 0;
		}
	}

	public int method530(int var1, int var2, int var3) {
		LinkedEntry_Sub12 var4 = aClass109_Sub12ArrayArrayArray555[var1][var2][var3];
		return var4 != null && var4.aClass38_1802 != null ? var4.aClass38_1802.anInt507 * 714830667 : 0;
	}

	public int method531(int var1, int var2, int var3, int var4) {
		LinkedEntry_Sub12 var5 = aClass109_Sub12ArrayArrayArray555[var1][var2][var3];
		if (var5 == null) {
			return -1;
		} else if (var5.aClass26_1800 != null && var5.aClass26_1800.anInt331 * -1209998417 == var4) {
			return var5.aClass26_1800.anInt332 * -1544408955 & 255;
		} else if (var5.aClass21_1810 != null && var5.aClass21_1810.anInt262 * -133424889 == var4) {
			return var5.aClass21_1810.anInt268 * -1152974417 & 255;
		} else if (var5.aClass38_1802 != null && var5.aClass38_1802.anInt507 * 714830667 == var4) {
			return var5.aClass38_1802.anInt510 * -42000167 & 255;
		} else {
			for (int var6 = 0; var6 < var5.anInt1813 * -1988543331; var6++) {
				if (var5.aClass33Array1805[var6].anInt426 * 2064355509 == var4) {
					return var5.aClass33Array1805[var6].anInt413 * -924305457 & 255;
				}
			}

			return -1;
		}
	}

	public void method532(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt515; var4++) {
			for (int var9 = 0; var9 < anInt568; var9++) {
				for (int var7 = 0; var7 < anInt561; var7++) {
					LinkedEntry_Sub12 var10 = aClass109_Sub12ArrayArrayArray555[var4][var9][var7];
					if (var10 != null) {
						Class26 var8 = var10.aClass26_1800;
						CacheableEntry_Sub23_Sub16_Sub6 var6;
						if (var8 != null && var8.aClass109_Sub23_Sub16_333 instanceof CacheableEntry_Sub23_Sub16_Sub6) {
							CacheableEntry_Sub23_Sub16_Sub6 var5 = (CacheableEntry_Sub23_Sub16_Sub6) var8.aClass109_Sub23_Sub16_333;
							method533(var5, var4, var9, var7, 1, 1);
							if (var8.aClass109_Sub23_Sub16_330 instanceof CacheableEntry_Sub23_Sub16_Sub6) {
								var6 = (CacheableEntry_Sub23_Sub16_Sub6) var8.aClass109_Sub23_Sub16_330;
								method533(var6, var4, var9, var7, 1, 1);
								CacheableEntry_Sub23_Sub16_Sub6.method3225(var5, var6, 0, 0, 0, false);
								var8.aClass109_Sub23_Sub16_330 = var6.method3266(var6.aShort2755, var6.aShort2730, var1, var2, var3);
							}

							var8.aClass109_Sub23_Sub16_333 = var5.method3266(var5.aShort2755, var5.aShort2730, var1, var2, var3);
						}

						for (int var12 = 0; var12 < var10.anInt1813 * -1988543331; var12++) {
							Class33 var14 = var10.aClass33Array1805[var12];
							if (var14 != null && var14.aClass109_Sub23_Sub16_417 instanceof CacheableEntry_Sub23_Sub16_Sub6) {
								CacheableEntry_Sub23_Sub16_Sub6 var11 = (CacheableEntry_Sub23_Sub16_Sub6) var14.aClass109_Sub23_Sub16_417;
								method533(var11, var4, var9, var7, var14.anInt420 * 910560601 - var14.anInt419 * 974211349 + 1, var14.anInt422 * 1865668025 - var14.anInt421 * 26398035 + 1);
								var14.aClass109_Sub23_Sub16_417 = var11.method3266(var11.aShort2755, var11.aShort2730, var1, var2, var3);
							}
						}

						Class38 var13 = var10.aClass38_1802;
						if (var13 != null && var13.aClass109_Sub23_Sub16_509 instanceof CacheableEntry_Sub23_Sub16_Sub6) {
							var6 = (CacheableEntry_Sub23_Sub16_Sub6) var13.aClass109_Sub23_Sub16_509;
							method594(var6, var4, var9, var7);
							var13.aClass109_Sub23_Sub16_509 = var6.method3266(var6.aShort2755, var6.aShort2730, var1, var2, var3);
						}
					}
				}
			}
		}

	}

	static {
		anIntArray554 = new int[anInt514];
		aClass22ArrayArray539 = new Class22[anInt514][500];
		anInt573 = 0;
		aClass22Array557 = new Class22[500];
		aJagexLinkedList_558 = new JagexLinkedList();
		anIntArray559 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
		anIntArray560 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
		anIntArray516 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
		anIntArray562 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
		anIntArray563 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
		anIntArray564 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
		anIntArray537 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
		aBoolArrayArrayArrayArray518 = new boolean[8][32][51][51];
	}

	void method533(CacheableEntry_Sub23_Sub16_Sub6 var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var21 = var3;
		int var16 = var3 + var5;
		int var11 = var4 - 1;
		int var12 = var4 + var6;

		for (int var13 = var2; var13 <= var2 + 1; var13++) {
			if (var13 != anInt515) {
				for (int var8 = var21; var8 <= var16; var8++) {
					if (var8 >= 0 && var8 < anInt568) {
						for (int var18 = var11; var18 <= var12; var18++) {
							if (var18 >= 0 && var18 < anInt561 && (!var7 || var8 >= var16 || var18 >= var12 || var18 < var4 && var8 != var3)) {
								LinkedEntry_Sub12 var9 = aClass109_Sub12ArrayArrayArray555[var13][var8][var18];
								if (var9 != null) {
									int var17 = (anIntArrayArrayArray549[var13][var8][var18] + anIntArrayArrayArray549[var13][var8 + 1][var18] + anIntArrayArrayArray549[var13][var8][var18 + 1] + anIntArrayArrayArray549[var13][var8 + 1][var18 + 1]) / 4 - (anIntArrayArrayArray549[var2][var3][var4] + anIntArrayArrayArray549[var2][var3 + 1][var4] + anIntArrayArrayArray549[var2][var3][var4 + 1] + anIntArrayArrayArray549[var2][var3 + 1][var4 + 1]) / 4;
									Class26 var10 = var9.aClass26_1800;
									if (var10 != null) {
										CacheableEntry_Sub23_Sub16_Sub6 var14;
										if (var10.aClass109_Sub23_Sub16_333 instanceof CacheableEntry_Sub23_Sub16_Sub6) {
											var14 = (CacheableEntry_Sub23_Sub16_Sub6) var10.aClass109_Sub23_Sub16_333;
											CacheableEntry_Sub23_Sub16_Sub6.method3225(var1, var14, (var8 - var3) * 128 + (1 - var5) * 64, var17, (var18 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var10.aClass109_Sub23_Sub16_330 instanceof CacheableEntry_Sub23_Sub16_Sub6) {
											var14 = (CacheableEntry_Sub23_Sub16_Sub6) var10.aClass109_Sub23_Sub16_330;
											CacheableEntry_Sub23_Sub16_Sub6.method3225(var1, var14, (var8 - var3) * 128 + (1 - var5) * 64, var17, (var18 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var23 = 0; var23 < var9.anInt1813 * -1988543331; var23++) {
										Class33 var15 = var9.aClass33Array1805[var23];
										if (var15 != null && var15.aClass109_Sub23_Sub16_417 instanceof CacheableEntry_Sub23_Sub16_Sub6) {
											CacheableEntry_Sub23_Sub16_Sub6 var20 = (CacheableEntry_Sub23_Sub16_Sub6) var15.aClass109_Sub23_Sub16_417;
											int var19 = var15.anInt420 * 910560601 - var15.anInt419 * 974211349 + 1;
											int var22 = var15.anInt422 * 1865668025 - var15.anInt421 * 26398035 + 1;
											CacheableEntry_Sub23_Sub16_Sub6.method3225(var1, var20, (var15.anInt419 * 974211349 - var3) * 128 + (var19 - var5) * 64, var17, (var15.anInt421 * 26398035 - var4) * 128 + (var22 - var6) * 64, var7);
										}
									}
								}
							}
						}
					}
				}

				--var21;
				var7 = false;
			}
		}

	}

	public void method534(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		LinkedEntry_Sub12 var7 = aClass109_Sub12ArrayArrayArray555[var4][var5][var6];
		if (var7 != null) {
			Class29 var10 = var7.aClass29_1814;
			int var8;
			if (var10 != null) {
				int var18 = var10.anInt364 * -2048700131;
				if (var18 != 0) {
					for (var8 = 0; var8 < 4; var8++) {
						var1[var2] = var18;
						var1[var2 + 1] = var18;
						var1[var2 + 2] = var18;
						var1[var2 + 3] = var18;
						var2 += var3;
					}

				}
			} else {
				Class20 var9 = var7.aClass20_1799;
				if (var9 != null) {
					var8 = var9.anInt247;
					int var14 = var9.anInt236;
					int var15 = var9.anInt249;
					int var16 = var9.anInt250;
					int[] var11 = anIntArrayArray566[var8];
					int[] var12 = anIntArrayArray567[var14];
					int var13 = 0;
					int var17;
					if (var15 != 0) {
						for (var17 = 0; var17 < 4; var17++) {
							var1[var2] = var11[var12[var13++]] == 0 ? var15 : var16;
							var1[var2 + 1] = var11[var12[var13++]] == 0 ? var15 : var16;
							var1[var2 + 2] = var11[var12[var13++]] == 0 ? var15 : var16;
							var1[var2 + 3] = var11[var12[var13++]] == 0 ? var15 : var16;
							var2 += var3;
						}
					} else {
						for (var17 = 0; var17 < 4; var17++) {
							if (var11[var12[var13++]] != 0) {
								var1[var2] = var16;
							}

							if (var11[var12[var13++]] != 0) {
								var1[var2 + 1] = var16;
							}

							if (var11[var12[var13++]] != 0) {
								var1[var2 + 2] = var16;
							}

							if (var11[var12[var13++]] != 0) {
								var1[var2 + 3] = var16;
							}

							var2 += var3;
						}
					}

				}
			}
		}
	}

	public static void method535(int[] var0, int var1, int var2, int var3, int var4) {
		anInt572 = 0;
		anInt521 = 0;
		anInt574 = var3;
		anInt575 = var4;
		anInt570 = var3 / 2;
		anInt571 = var4 / 2;
		boolean[][][][] var5 = new boolean[9][32][53][53];

		int var6;
		int var7;
		int var9;
		int var11;
		int var12;
		int var13;
		for (var11 = 128; var11 <= 384; var11 += 32) {
			for (var12 = 0; var12 < 2048; var12 += 64) {
				anInt540 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2719[var11];
				anInt541 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2720[var11];
				anInt542 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2719[var12];
				anInt543 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2720[var12];
				var6 = (var11 - 128) / 32;
				var7 = var12 / 64;

				for (int var8 = -26; var8 <= 26; var8++) {
					for (var9 = -26; var9 <= 26; var9++) {
						var13 = var8 * 128;
						int var15 = var9 * 128;
						boolean var10 = false;

						for (int var14 = -var1; var14 <= var2; var14 += 128) {
							if (method536(var13, var0[var6] + var14, var15)) {
								var10 = true;
								break;
							}
						}

						var5[var6][var7][var8 + 25 + 1][var9 + 25 + 1] = var10;
					}
				}
			}
		}

		for (var11 = 0; var11 < 8; var11++) {
			for (var12 = 0; var12 < 32; var12++) {
				for (var6 = -25; var6 < 25; var6++) {
					for (var7 = -25; var7 < 25; var7++) {
						boolean var16 = false;

						label96:
						for (var9 = -1; var9 <= 1; var9++) {
							for (var13 = -1; var13 <= 1; var13++) {
								if (var5[var11][var12][var6 + var9 + 25 + 1][var7 + var13 + 25 + 1]) {
									var16 = true;
									break label96;
								}

								if (var5[var11][(var12 + 1) % 31][var6 + var9 + 25 + 1][var7 + var13 + 25 + 1]) {
									var16 = true;
									break label96;
								}

								if (var5[var11 + 1][var12][var6 + var9 + 25 + 1][var7 + var13 + 25 + 1]) {
									var16 = true;
									break label96;
								}

								if (var5[var11 + 1][(var12 + 1) % 31][var6 + var9 + 25 + 1][var7 + var13 + 25 + 1]) {
									var16 = true;
									break label96;
								}
							}
						}

						aBoolArrayArrayArrayArray518[var11][var12][var6 + 25][var7 + 25] = var16;
					}
				}
			}
		}

	}

	static boolean method536(int var0, int var1, int var2) {
		int var3 = var2 * anInt542 + var0 * anInt543 >> 16;
		int var4 = var2 * anInt543 - var0 * anInt542 >> 16;
		int var5 = var1 * anInt540 + var4 * anInt541 >> 16;
		int var6 = var1 * anInt541 - var4 * anInt540 >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var8 = anInt570 + var3 * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / var5;
			int var7 = anInt571 + var6 * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / var5;
			return var8 >= anInt572 && var8 <= anInt574 && var7 >= anInt521 && var7 <= anInt575;
		} else {
			return false;
		}
	}

	public Class26 method537(int var1, int var2, int var3) {
		LinkedEntry_Sub12 var4 = aClass109_Sub12ArrayArrayArray555[var1][var2][var3];
		return var4 == null ? null : var4.aClass26_1800;
	}

	public void method538(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= anInt568 * 128) {
			var1 = anInt568 * 128 - 1;
		}

		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= anInt561 * 128) {
			var3 = anInt561 * 128 - 1;
		}

		++anInt530;
		anInt540 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2719[var4];
		anInt541 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2720[var4];
		anInt542 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2719[var5];
		anInt543 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2720[var5];
		aBoolArrayArray569 = aBoolArrayArrayArrayArray518[(var4 - 128) / 32][var5 / 64];
		anInt552 = var1;
		anInt538 = var2;
		anInt556 = var3;
		anInt517 = var1 / 128;
		anInt519 = var3 / 128;
		anInt529 = var6;
		anInt531 = anInt517 - 25;
		if (anInt531 < 0) {
			anInt531 = 0;
		}

		anInt533 = anInt519 - 25;
		if (anInt533 < 0) {
			anInt533 = 0;
		}

		anInt532 = anInt517 + 25;
		if (anInt532 > anInt568) {
			anInt532 = anInt568;
		}

		anInt534 = anInt519 + 25;
		if (anInt534 > anInt561) {
			anInt534 = anInt561;
		}

		method544();
		anInt528 = 0;

		int var8;
		int var11;
		LinkedEntry_Sub12[][] var12;
		int var15;
		for (var15 = anInt526; var15 < anInt515; var15++) {
			var12 = aClass109_Sub12ArrayArrayArray555[var15];

			for (var8 = anInt531; var8 < anInt532; var8++) {
				for (var11 = anInt533; var11 < anInt534; var11++) {
					LinkedEntry_Sub12 var7 = var12[var8][var11];
					if (var7 != null) {
						if (var7.anInt1806 * 1385763605 > var6 || !aBoolArrayArray569[var8 - anInt517 + 25][var11 - anInt519 + 25] && anIntArrayArrayArray549[var15][var8][var11] - var2 < 2000) {
							var7.aBool1809 = false;
							var7.aBool1816 = false;
							var7.anInt1812 = 0;
						} else {
							var7.aBool1809 = true;
							var7.aBool1816 = true;
							if (var7.anInt1813 * -1988543331 > 0) {
								var7.aBool1811 = true;
							} else {
								var7.aBool1811 = false;
							}

							++anInt528;
						}
					}
				}
			}
		}

		int var9;
		int var10;
		LinkedEntry_Sub12 var13;
		int var14;
		int var16;
		for (var15 = anInt526; var15 < anInt515; var15++) {
			var12 = aClass109_Sub12ArrayArrayArray555[var15];

			for (var8 = -25; var8 <= 0; var8++) {
				var11 = anInt517 + var8;
				var16 = anInt517 - var8;
				if (var11 >= anInt531 || var16 < anInt532) {
					for (var9 = -25; var9 <= 0; var9++) {
						var14 = anInt519 + var9;
						var10 = anInt519 - var9;
						if (var11 >= anInt531) {
							if (var14 >= anInt533) {
								var13 = var12[var11][var14];
								if (var13 != null && var13.aBool1809) {
									method539(var13, true);
								}
							}

							if (var10 < anInt534) {
								var13 = var12[var11][var10];
								if (var13 != null && var13.aBool1809) {
									method539(var13, true);
								}
							}
						}

						if (var16 < anInt532) {
							if (var14 >= anInt533) {
								var13 = var12[var16][var14];
								if (var13 != null && var13.aBool1809) {
									method539(var13, true);
								}
							}

							if (var10 < anInt534) {
								var13 = var12[var16][var10];
								if (var13 != null && var13.aBool1809) {
									method539(var13, true);
								}
							}
						}

						if (anInt528 == 0) {
							aBool553 = false;
							return;
						}
					}
				}
			}
		}

		for (var15 = anInt526; var15 < anInt515; var15++) {
			var12 = aClass109_Sub12ArrayArrayArray555[var15];

			for (var8 = -25; var8 <= 0; var8++) {
				var11 = anInt517 + var8;
				var16 = anInt517 - var8;
				if (var11 >= anInt531 || var16 < anInt532) {
					for (var9 = -25; var9 <= 0; var9++) {
						var14 = anInt519 + var9;
						var10 = anInt519 - var9;
						if (var11 >= anInt531) {
							if (var14 >= anInt533) {
								var13 = var12[var11][var14];
								if (var13 != null && var13.aBool1809) {
									method539(var13, false);
								}
							}

							if (var10 < anInt534) {
								var13 = var12[var11][var10];
								if (var13 != null && var13.aBool1809) {
									method539(var13, false);
								}
							}
						}

						if (var16 < anInt532) {
							if (var14 >= anInt533) {
								var13 = var12[var16][var14];
								if (var13 != null && var13.aBool1809) {
									method539(var13, false);
								}
							}

							if (var10 < anInt534) {
								var13 = var12[var16][var10];
								if (var13 != null && var13.aBool1809) {
									method539(var13, false);
								}
							}
						}

						if (anInt528 == 0) {
							aBool553 = false;
							return;
						}
					}
				}
			}
		}

		aBool553 = false;
	}

	void method539(LinkedEntry_Sub12 var1, boolean var2) {
		aJagexLinkedList_558.add(var1);

		while (true) {
			LinkedEntry_Sub12 var3;
			int var4;
			int var5;
			int var6;
			int var7;
			LinkedEntry_Sub12[][] var8;
			LinkedEntry_Sub12 var9;
			int var11;
			int var14;
			int var15;
			int var16;
			int var24;
			int var26;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										Class26 var10;
										Class33 var12;
										int var17;
										int var18;
										int var21;
										boolean var22;
										LinkedEntry_Sub12 var33;
										while (true) {
											do {
												var3 = (LinkedEntry_Sub12) aJagexLinkedList_558.method1399();
												if (var3 == null) {
													return;
												}
											} while (!var3.aBool1816);

											var4 = var3.anInt1798 * 1554380415;
											var5 = var3.anInt1796 * 159715287;
											var6 = var3.anInt1808 * -99977505;
											var7 = var3.anInt1797 * 1627601863;
											var8 = aClass109_Sub12ArrayArrayArray555[var6];
											if (!var3.aBool1809) {
												break;
											}

											if (var2) {
												if (var6 > 0) {
													var9 = aClass109_Sub12ArrayArrayArray555[var6 - 1][var4][var5];
													if (var9 != null && var9.aBool1816) {
														continue;
													}
												}

												if (var4 <= anInt517 && var4 > anInt531) {
													var9 = var8[var4 - 1][var5];
													if (var9 != null && var9.aBool1816 && (var9.aBool1809 || (var3.anInt1807 * 577334149 & 1) == 0)) {
														continue;
													}
												}

												if (var4 >= anInt517 && var4 < anInt532 - 1) {
													var9 = var8[var4 + 1][var5];
													if (var9 != null && var9.aBool1816 && (var9.aBool1809 || (var3.anInt1807 * 577334149 & 4) == 0)) {
														continue;
													}
												}

												if (var5 <= anInt519 && var5 > anInt533) {
													var9 = var8[var4][var5 - 1];
													if (var9 != null && var9.aBool1816 && (var9.aBool1809 || (var3.anInt1807 * 577334149 & 8) == 0)) {
														continue;
													}
												}

												if (var5 >= anInt519 && var5 < anInt534 - 1) {
													var9 = var8[var4][var5 + 1];
													if (var9 != null && var9.aBool1816 && (var9.aBool1809 || (var3.anInt1807 * 577334149 & 2) == 0)) {
														continue;
													}
												}
											} else {
												var2 = true;
											}

											var3.aBool1809 = false;
											if (var3.aClass109_Sub12_1804 != null) {
												var9 = var3.aClass109_Sub12_1804;
												if (var9.aClass29_1814 != null) {
													if (!method545(0, var4, var5)) {
														method666(var9.aClass29_1814, 0, anInt540, anInt541, anInt542, anInt543, var4, var5);
													}
												} else if (var9.aClass20_1799 != null && !method545(0, var4, var5)) {
													method541(var9.aClass20_1799, anInt540, anInt541, anInt542, anInt543, var4, var5);
												}

												var10 = var9.aClass26_1800;
												if (var10 != null) {
													var10.aClass109_Sub23_Sub16_333.method2786(0, anInt540, anInt541, anInt542, anInt543, var10.anInt325 * -955073361 - anInt552, var10.anInt327 * 1177296985 - anInt538, var10.anInt326 * -1387002201 - anInt556, var10.anInt331 * -1209998417);
												}

												for (var11 = 0; var11 < var9.anInt1813 * -1988543331; var11++) {
													var12 = var9.aClass33Array1805[var11];
													if (var12 != null) {
														var12.aClass109_Sub23_Sub16_417.method2786(var12.anInt418 * -1282494253, anInt540, anInt541, anInt542, anInt543, var12.anInt415 * 1753592201 - anInt552, var12.anInt425 * 1547252955 - anInt538, var12.anInt416 * 1772978721 - anInt556, var12.anInt426 * 2064355509);
													}
												}
											}

											var22 = false;
											if (var3.aClass29_1814 != null) {
												if (!method545(var7, var4, var5)) {
													var22 = true;
													if (var3.aClass29_1814.anInt360 * 1410994793 != 12345678 || aBool553 && var6 <= anInt546) {
														method666(var3.aClass29_1814, var7, anInt540, anInt541, anInt542, anInt543, var4, var5);
													}
												}
											} else if (var3.aClass20_1799 != null && !method545(var7, var4, var5)) {
												var22 = true;
												method541(var3.aClass20_1799, anInt540, anInt541, anInt542, anInt543, var4, var5);
											}

											var21 = 0;
											var11 = 0;
											Class26 var23 = var3.aClass26_1800;
											Class21 var13 = var3.aClass21_1810;
											if (var23 != null || var13 != null) {
												if (anInt517 == var4) {
													++var21;
												} else if (anInt517 < var4) {
													var21 += 2;
												}

												if (anInt519 == var5) {
													var21 += 3;
												} else if (anInt519 > var5) {
													var21 += 6;
												}

												var11 = anIntArray559[var21];
												var3.anInt1815 = anIntArray516[var21] * -1400606107;
											}

											if (var23 != null) {
												if ((var23.anInt324 * 1148148815 & anIntArray560[var21]) != 0) {
													if (var23.anInt324 * 1148148815 == 16) {
														var3.anInt1812 = 1719792565;
														var3.anInt1794 = anIntArray562[var21] * 93020713;
														var3.anInt1801 = -1232829595 - var3.anInt1794 * -148912225;
													} else if (var23.anInt324 * 1148148815 == 32) {
														var3.anInt1812 = -855382166;
														var3.anInt1794 = anIntArray563[var21] * 93020713;
														var3.anInt1801 = 1829308106 - var3.anInt1794 * -148912225;
													} else if (var23.anInt324 * 1148148815 == 64) {
														var3.anInt1812 = -1710764332;
														var3.anInt1794 = anIntArray564[var21] * 93020713;
														var3.anInt1801 = -636351084 - var3.anInt1794 * -148912225;
													} else {
														var3.anInt1812 = 864410399;
														var3.anInt1794 = anIntArray537[var21] * 93020713;
														var3.anInt1801 = 596478511 - var3.anInt1794 * -148912225;
													}
												} else {
													var3.anInt1812 = 0;
												}

												if ((var23.anInt324 * 1148148815 & var11) != 0 && !method546(var7, var4, var5, var23.anInt324 * 1148148815)) {
													var23.aClass109_Sub23_Sub16_333.method2786(0, anInt540, anInt541, anInt542, anInt543, var23.anInt325 * -955073361 - anInt552, var23.anInt327 * 1177296985 - anInt538, var23.anInt326 * -1387002201 - anInt556, var23.anInt331 * -1209998417);
												}

												if ((var23.anInt328 * 194198931 & var11) != 0 && !method546(var7, var4, var5, var23.anInt328 * 194198931)) {
													var23.aClass109_Sub23_Sub16_330.method2786(0, anInt540, anInt541, anInt542, anInt543, var23.anInt325 * -955073361 - anInt552, var23.anInt327 * 1177296985 - anInt538, var23.anInt326 * -1387002201 - anInt556, var23.anInt331 * -1209998417);
												}
											}

											if (var13 != null && !method547(var7, var4, var5, var13.aClass109_Sub23_Sub16_265.anInt2410 * -695779227)) {
												if ((var13.anInt261 * -2051925765 & var11) != 0) {
													var13.aClass109_Sub23_Sub16_265.method2786(0, anInt540, anInt541, anInt542, anInt543, var13.anInt258 * -444392959 - anInt552 + var13.anInt263 * 551951957, var13.anInt259 * -952000337 - anInt538, var13.anInt270 * -1033450429 - anInt556 + var13.anInt264 * -1013919253, var13.anInt262 * -133424889);
												} else if (var13.anInt261 * -2051925765 == 256) {
													var14 = var13.anInt258 * -444392959 - anInt552;
													var15 = var13.anInt259 * -952000337 - anInt538;
													var16 = var13.anInt270 * -1033450429 - anInt556;
													var17 = var13.anInt267 * -1967817559;
													if (var17 != 1 && var17 != 2) {
														var18 = var14;
													} else {
														var18 = -var14;
													}

													int var19;
													if (var17 != 2 && var17 != 3) {
														var19 = var16;
													} else {
														var19 = -var16;
													}

													if (var19 < var18) {
														var13.aClass109_Sub23_Sub16_265.method2786(0, anInt540, anInt541, anInt542, anInt543, var14 + var13.anInt263 * 551951957, var15, var16 + var13.anInt264 * -1013919253, var13.anInt262 * -133424889);
													} else if (var13.aClass109_Sub23_Sub16_266 != null) {
														var13.aClass109_Sub23_Sub16_266.method2786(0, anInt540, anInt541, anInt542, anInt543, var14, var15, var16, var13.anInt262 * -133424889);
													}
												}
											}

											if (var22) {
												Class38 var27 = var3.aClass38_1802;
												if (var27 != null) {
													var27.aClass109_Sub23_Sub16_509.method2786(0, anInt540, anInt541, anInt542, anInt543, var27.anInt504 * 740386361 - anInt552, var27.anInt506 * -1384832669 - anInt538, var27.anInt505 * -16439423 - anInt556, var27.anInt507 * 714830667);
												}

												Class19 var31 = var3.aClass19_1803;
												if (var31 != null && var31.anInt229 * -941232345 == 0) {
													if (var31.aClass109_Sub23_Sub16_227 != null) {
														var31.aClass109_Sub23_Sub16_227.method2786(0, anInt540, anInt541, anInt542, anInt543, var31.anInt224 * 1595881279 - anInt552, var31.anInt223 * 1665861609 - anInt538, var31.anInt225 * 435844977 - anInt556, var31.anInt232 * 1241408197);
													}

													if (var31.aClass109_Sub23_Sub16_228 != null) {
														var31.aClass109_Sub23_Sub16_228.method2786(0, anInt540, anInt541, anInt542, anInt543, var31.anInt224 * 1595881279 - anInt552, var31.anInt223 * 1665861609 - anInt538, var31.anInt225 * 435844977 - anInt556, var31.anInt232 * 1241408197);
													}

													if (var31.aClass109_Sub23_Sub16_226 != null) {
														var31.aClass109_Sub23_Sub16_226.method2786(0, anInt540, anInt541, anInt542, anInt543, var31.anInt224 * 1595881279 - anInt552, var31.anInt223 * 1665861609 - anInt538, var31.anInt225 * 435844977 - anInt556, var31.anInt232 * 1241408197);
													}
												}
											}

											var14 = var3.anInt1807 * 577334149;
											if (var14 != 0) {
												if (var4 < anInt517 && (var14 & 4) != 0) {
													var33 = var8[var4 + 1][var5];
													if (var33 != null && var33.aBool1816) {
														aJagexLinkedList_558.add(var33);
													}
												}

												if (var5 < anInt519 && (var14 & 2) != 0) {
													var33 = var8[var4][var5 + 1];
													if (var33 != null && var33.aBool1816) {
														aJagexLinkedList_558.add(var33);
													}
												}

												if (var4 > anInt517 && (var14 & 1) != 0) {
													var33 = var8[var4 - 1][var5];
													if (var33 != null && var33.aBool1816) {
														aJagexLinkedList_558.add(var33);
													}
												}

												if (var5 > anInt519 && (var14 & 8) != 0) {
													var33 = var8[var4][var5 - 1];
													if (var33 != null && var33.aBool1816) {
														aJagexLinkedList_558.add(var33);
													}
												}
											}
											break;
										}

										if (var3.anInt1812 * 782559191 != 0) {
											var22 = true;

											for (var21 = 0; var21 < var3.anInt1813 * -1988543331; var21++) {
												if (var3.aClass33Array1805[var21].anInt424 * -89979809 != anInt530 && (var3.anIntArray1795[var21] & var3.anInt1812 * 782559191) == var3.anInt1794 * -2080810471) {
													var22 = false;
													break;
												}
											}

											if (var22) {
												var10 = var3.aClass26_1800;
												if (!method546(var7, var4, var5, var10.anInt324 * 1148148815)) {
													var10.aClass109_Sub23_Sub16_333.method2786(0, anInt540, anInt541, anInt542, anInt543, var10.anInt325 * -955073361 - anInt552, var10.anInt327 * 1177296985 - anInt538, var10.anInt326 * -1387002201 - anInt556, var10.anInt331 * -1209998417);
												}

												var3.anInt1812 = 0;
											}
										}

										if (!var3.aBool1811) {
											break;
										}

										try {
											int var25 = var3.anInt1813 * -1988543331;
											var3.aBool1811 = false;
											var21 = 0;

											label561:
											for (var11 = 0; var11 < var25; var11++) {
												var12 = var3.aClass33Array1805[var11];
												if (var12.anInt424 * -89979809 != anInt530) {
													for (var26 = var12.anInt419 * 974211349; var26 <= var12.anInt420 * 910560601; var26++) {
														for (var14 = var12.anInt421 * 26398035; var14 <= var12.anInt422 * 1865668025; var14++) {
															var33 = var8[var26][var14];
															if (var33.aBool1809) {
																var3.aBool1811 = true;
																continue label561;
															}

															if (var33.anInt1812 * 782559191 != 0) {
																var16 = 0;
																if (var26 > var12.anInt419 * 974211349) {
																	++var16;
																}

																if (var26 < var12.anInt420 * 910560601) {
																	var16 += 4;
																}

																if (var14 > var12.anInt421 * 26398035) {
																	var16 += 8;
																}

																if (var14 < var12.anInt422 * 1865668025) {
																	var16 += 2;
																}

																if ((var16 & var33.anInt1812 * 782559191) == var3.anInt1801 * 1316610887) {
																	var3.aBool1811 = true;
																	continue label561;
																}
															}
														}
													}

													aClass33Array527[var21++] = var12;
													var26 = anInt517 - var12.anInt419 * 974211349;
													var14 = var12.anInt420 * 910560601 - anInt517;
													if (var14 > var26) {
														var26 = var14;
													}

													var15 = anInt519 - var12.anInt421 * 26398035;
													var16 = var12.anInt422 * 1865668025 - anInt519;
													if (var16 > var15) {
														var12.anInt423 = (var26 + var16) * 1013031121;
													} else {
														var12.anInt423 = (var26 + var15) * 1013031121;
													}
												}
											}

											while (var21 > 0) {
												var11 = -50;
												var24 = -1;

												for (var26 = 0; var26 < var21; var26++) {
													Class33 var34 = aClass33Array527[var26];
													if (var34.anInt424 * -89979809 != anInt530) {
														if (var34.anInt423 * 144357425 > var11) {
															var11 = var34.anInt423 * 144357425;
															var24 = var26;
														} else if (var34.anInt423 * 144357425 == var11) {
															var15 = var34.anInt415 * 1753592201 - anInt552;
															var16 = var34.anInt416 * 1772978721 - anInt556;
															var17 = aClass33Array527[var24].anInt415 * 1753592201 - anInt552;
															var18 = aClass33Array527[var24].anInt416 * 1772978721 - anInt556;
															if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
																var24 = var26;
															}
														}
													}
												}

												if (var24 == -1) {
													break;
												}

												Class33 var35 = aClass33Array527[var24];
												var35.anInt424 = anInt530 * 406607775;
												if (!method548(var7, var35.anInt419 * 974211349, var35.anInt420 * 910560601, var35.anInt421 * 26398035, var35.anInt422 * 1865668025, var35.aClass109_Sub23_Sub16_417.anInt2410 * -695779227)) {
													var35.aClass109_Sub23_Sub16_417.method2786(var35.anInt418 * -1282494253, anInt540, anInt541, anInt542, anInt543, var35.anInt415 * 1753592201 - anInt552, var35.anInt425 * 1547252955 - anInt538, var35.anInt416 * 1772978721 - anInt556, var35.anInt426 * 2064355509);
												}

												for (var14 = var35.anInt419 * 974211349; var14 <= var35.anInt420 * 910560601; var14++) {
													for (var15 = var35.anInt421 * 26398035; var15 <= var35.anInt422 * 1865668025; var15++) {
														LinkedEntry_Sub12 var36 = var8[var14][var15];
														if (var36.anInt1812 * 782559191 != 0) {
															aJagexLinkedList_558.add(var36);
														} else if ((var14 != var4 || var15 != var5) && var36.aBool1816) {
															aJagexLinkedList_558.add(var36);
														}
													}
												}
											}

											if (!var3.aBool1811) {
												break;
											}
										} catch (Exception var20) {
											var3.aBool1811 = false;
											break;
										}
									}
								} while (!var3.aBool1816);
							} while (var3.anInt1812 * 782559191 != 0);

							if (var4 > anInt517 || var4 <= anInt531) {
								break;
							}

							var9 = var8[var4 - 1][var5];
						} while (var9 != null && var9.aBool1816);

						if (var4 < anInt517 || var4 >= anInt532 - 1) {
							break;
						}

						var9 = var8[var4 + 1][var5];
					} while (var9 != null && var9.aBool1816);

					if (var5 > anInt519 || var5 <= anInt533) {
						break;
					}

					var9 = var8[var4][var5 - 1];
				} while (var9 != null && var9.aBool1816);

				if (var5 < anInt519 || var5 >= anInt534 - 1) {
					break;
				}

				var9 = var8[var4][var5 + 1];
			} while (var9 != null && var9.aBool1816);

			var3.aBool1816 = false;
			--anInt528;
			Class19 var29 = var3.aClass19_1803;
			if (var29 != null && var29.anInt229 * -941232345 != 0) {
				if (var29.aClass109_Sub23_Sub16_227 != null) {
					var29.aClass109_Sub23_Sub16_227.method2786(0, anInt540, anInt541, anInt542, anInt543, var29.anInt224 * 1595881279 - anInt552, var29.anInt223 * 1665861609 - anInt538 - var29.anInt229 * -941232345, var29.anInt225 * 435844977 - anInt556, var29.anInt232 * 1241408197);
				}

				if (var29.aClass109_Sub23_Sub16_228 != null) {
					var29.aClass109_Sub23_Sub16_228.method2786(0, anInt540, anInt541, anInt542, anInt543, var29.anInt224 * 1595881279 - anInt552, var29.anInt223 * 1665861609 - anInt538 - var29.anInt229 * -941232345, var29.anInt225 * 435844977 - anInt556, var29.anInt232 * 1241408197);
				}

				if (var29.aClass109_Sub23_Sub16_226 != null) {
					var29.aClass109_Sub23_Sub16_226.method2786(0, anInt540, anInt541, anInt542, anInt543, var29.anInt224 * 1595881279 - anInt552, var29.anInt223 * 1665861609 - anInt538 - var29.anInt229 * -941232345, var29.anInt225 * 435844977 - anInt556, var29.anInt232 * 1241408197);
				}
			}

			if (var3.anInt1815 * -1390153875 != 0) {
				Class21 var30 = var3.aClass21_1810;
				if (var30 != null && !method547(var7, var4, var5, var30.aClass109_Sub23_Sub16_265.anInt2410 * -695779227)) {
					if ((var30.anInt261 * -2051925765 & var3.anInt1815 * -1390153875) != 0) {
						var30.aClass109_Sub23_Sub16_265.method2786(0, anInt540, anInt541, anInt542, anInt543, var30.anInt258 * -444392959 - anInt552 + var30.anInt263 * 551951957, var30.anInt259 * -952000337 - anInt538, var30.anInt270 * -1033450429 - anInt556 + var30.anInt264 * -1013919253, var30.anInt262 * -133424889);
					} else if (var30.anInt261 * -2051925765 == 256) {
						var11 = var30.anInt258 * -444392959 - anInt552;
						var24 = var30.anInt259 * -952000337 - anInt538;
						var26 = var30.anInt270 * -1033450429 - anInt556;
						var14 = var30.anInt267 * -1967817559;
						if (var14 != 1 && var14 != 2) {
							var15 = var11;
						} else {
							var15 = -var11;
						}

						if (var14 != 2 && var14 != 3) {
							var16 = var26;
						} else {
							var16 = -var26;
						}

						if (var16 >= var15) {
							var30.aClass109_Sub23_Sub16_265.method2786(0, anInt540, anInt541, anInt542, anInt543, var11 + var30.anInt263 * 551951957, var24, var26 + var30.anInt264 * -1013919253, var30.anInt262 * -133424889);
						} else if (var30.aClass109_Sub23_Sub16_266 != null) {
							var30.aClass109_Sub23_Sub16_266.method2786(0, anInt540, anInt541, anInt542, anInt543, var11, var24, var26, var30.anInt262 * -133424889);
						}
					}
				}

				Class26 var28 = var3.aClass26_1800;
				if (var28 != null) {
					if ((var28.anInt328 * 194198931 & var3.anInt1815 * -1390153875) != 0 && !method546(var7, var4, var5, var28.anInt328 * 194198931)) {
						var28.aClass109_Sub23_Sub16_330.method2786(0, anInt540, anInt541, anInt542, anInt543, var28.anInt325 * -955073361 - anInt552, var28.anInt327 * 1177296985 - anInt538, var28.anInt326 * -1387002201 - anInt556, var28.anInt331 * -1209998417);
					}

					if ((var28.anInt324 * 1148148815 & var3.anInt1815 * -1390153875) != 0 && !method546(var7, var4, var5, var28.anInt324 * 1148148815)) {
						var28.aClass109_Sub23_Sub16_333.method2786(0, anInt540, anInt541, anInt542, anInt543, var28.anInt325 * -955073361 - anInt552, var28.anInt327 * 1177296985 - anInt538, var28.anInt326 * -1387002201 - anInt556, var28.anInt331 * -1209998417);
					}
				}
			}

			LinkedEntry_Sub12 var32;
			if (var6 < anInt515 - 1) {
				var32 = aClass109_Sub12ArrayArrayArray555[var6 + 1][var4][var5];
				if (var32 != null && var32.aBool1816) {
					aJagexLinkedList_558.add(var32);
				}
			}

			if (var4 < anInt517) {
				var32 = var8[var4 + 1][var5];
				if (var32 != null && var32.aBool1816) {
					aJagexLinkedList_558.add(var32);
				}
			}

			if (var5 < anInt519) {
				var32 = var8[var4][var5 + 1];
				if (var32 != null && var32.aBool1816) {
					aJagexLinkedList_558.add(var32);
				}
			}

			if (var4 > anInt517) {
				var32 = var8[var4 - 1][var5];
				if (var32 != null && var32.aBool1816) {
					aJagexLinkedList_558.add(var32);
				}
			}

			if (var5 > anInt519) {
				var32 = var8[var4][var5 - 1];
				if (var32 != null && var32.aBool1816) {
					aJagexLinkedList_558.add(var32);
				}
			}
		}
	}

	void method541(Class20 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.anIntArray256.length;

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var9 = 0; var9 < var8; var9++) {
			var11 = var1.anIntArray256[var9] - anInt552;
			var12 = var1.anIntArray237[var9] - anInt538;
			var10 = var1.anIntArray238[var9] - anInt556;
			var13 = var10 * var4 + var11 * var5 >> 16;
			var10 = var10 * var5 - var11 * var4 >> 16;
			var11 = var13;
			var13 = var12 * var3 - var10 * var2 >> 16;
			var10 = var12 * var2 + var10 * var3 >> 16;
			if (var10 < 50) {
				return;
			}

			if (var1.anIntArray245 != null) {
				Class20.anIntArray257[var9] = var11;
				Class20.anIntArray254[var9] = var13;
				Class20.anIntArray240[var9] = var10;
			}

			Class20.anIntArray251[var9] = CacheableEntry_Sub23_Sub14_Sub3.anInt2706 + var11 * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / var10;
			Class20.anIntArray252[var9] = CacheableEntry_Sub23_Sub14_Sub3.anInt2707 + var13 * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / var10;
		}

		CacheableEntry_Sub23_Sub14_Sub3.anInt2700 = 0;
		var8 = var1.anIntArray242.length;

		for (var9 = 0; var9 < var8; var9++) {
			var11 = var1.anIntArray242[var9];
			var12 = var1.anIntArray253[var9];
			var10 = var1.anIntArray248[var9];
			var13 = Class20.anIntArray251[var11];
			int var14 = Class20.anIntArray251[var12];
			int var18 = Class20.anIntArray251[var10];
			int var15 = Class20.anIntArray252[var11];
			int var16 = Class20.anIntArray252[var12];
			int var17 = Class20.anIntArray252[var10];
			if ((var13 - var14) * (var17 - var16) - (var15 - var16) * (var18 - var14) > 0) {
				CacheableEntry_Sub23_Sub14_Sub3.aBool2701 = false;
				if (var13 < 0 || var14 < 0 || var18 < 0 || var13 > CacheableEntry_Sub23_Sub14_Sub3.anInt2717 || var14 > CacheableEntry_Sub23_Sub14_Sub3.anInt2717 || var18 > CacheableEntry_Sub23_Sub14_Sub3.anInt2717) {
					CacheableEntry_Sub23_Sub14_Sub3.aBool2701 = true;
				}

				if (aBool553 && method543(anInt547, anInt548, var15, var16, var17, var13, var14, var18)) {
					anInt545 = var6;
					anInt520 = var7;
				}

				if (var1.anIntArray245 != null && var1.anIntArray245[var9] != -1) {
					if (!aBool535) {
						if (var1.aBool246) {
							CacheableEntry_Sub23_Sub14_Sub3.method3164(var15, var16, var17, var13, var14, var18, var1.anIntArray239[var9], var1.anIntArray244[var9], var1.anIntArray255[var9], Class20.anIntArray257[0], Class20.anIntArray257[1], Class20.anIntArray257[3], Class20.anIntArray254[0], Class20.anIntArray254[1], Class20.anIntArray254[3], Class20.anIntArray240[0], Class20.anIntArray240[1], Class20.anIntArray240[3], var1.anIntArray245[var9]);
						} else {
							CacheableEntry_Sub23_Sub14_Sub3.method3164(var15, var16, var17, var13, var14, var18, var1.anIntArray239[var9], var1.anIntArray244[var9], var1.anIntArray255[var9], Class20.anIntArray257[var11], Class20.anIntArray257[var12], Class20.anIntArray257[var10], Class20.anIntArray254[var11], Class20.anIntArray254[var12], Class20.anIntArray254[var10], Class20.anIntArray240[var11], Class20.anIntArray240[var12], Class20.anIntArray240[var10], var1.anIntArray245[var9]);
						}
					} else {
						int var19 = CacheableEntry_Sub23_Sub14_Sub3.anInterface2_2715.method29(var1.anIntArray245[var9], 1814652323);
						CacheableEntry_Sub23_Sub14_Sub3.method3158(var15, var16, var17, var13, var14, var18, method542(var19, var1.anIntArray239[var9]), method542(var19, var1.anIntArray244[var9]), method542(var19, var1.anIntArray255[var9]));
					}
				} else if (var1.anIntArray239[var9] != 12345678) {
					CacheableEntry_Sub23_Sub14_Sub3.method3158(var15, var16, var17, var13, var14, var18, var1.anIntArray239[var9], var1.anIntArray244[var9], var1.anIntArray255[var9]);
				}
			}
		}

	}

	static final int method542(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 >= 2) {
			if (var1 > 126) {
				var1 = 126;
			}
		} else {
			var1 = 2;
		}

		return (var0 & 65408) + var1;
	}

	boolean method543(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var2 < var3 && var2 < var4 && var2 < var5) {
			return false;
		} else if (var2 > var3 && var2 > var4 && var2 > var5) {
			return false;
		} else if (var1 < var6 && var1 < var7 && var1 < var8) {
			return false;
		} else if (var1 > var6 && var1 > var7 && var1 > var8) {
			return false;
		} else {
			int var10 = (var2 - var3) * (var7 - var6) - (var1 - var6) * (var4 - var3);
			int var9 = (var2 - var5) * (var6 - var8) - (var1 - var8) * (var3 - var5);
			int var11 = (var2 - var4) * (var8 - var7) - (var1 - var7) * (var5 - var4);
			return var10 * var11 > 0 && var11 * var9 > 0;
		}
	}

	void method544() {
		int var1 = anIntArray554[anInt529];
		Class22[] var9 = aClass22ArrayArray539[anInt529];
		anInt573 = 0;

		for (int var4 = 0; var4 < var1; var4++) {
			Class22 var5 = var9[var4];
			int var6;
			int var7;
			int var8;
			int var10;
			boolean var13;
			if (var5.anInt291 * 2100503345 == 1) {
				var6 = var5.anInt283 * 1526951523 - anInt517 + 25;
				if (var6 >= 0 && var6 <= 50) {
					var7 = var5.anInt274 * -161539115 - anInt519 + 25;
					if (var7 < 0) {
						var7 = 0;
					}

					var8 = var5.anInt278 * -397567009 - anInt519 + 25;
					if (var8 > 50) {
						var8 = 50;
					}

					var13 = false;

					while (var7 <= var8) {
						if (aBoolArrayArray569[var6][var7++]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var10 = anInt552 - var5.anInt290 * -87664291;
						if (var10 > 32) {
							var5.anInt277 = 669940033;
						} else {
							if (var10 >= -32) {
								continue;
							}

							var5.anInt277 = 1339880066;
							var10 = -var10;
						}

						var5.anInt286 = (var5.anInt279 * -840190769 - anInt556 << 8) / var10 * 1898861439;
						var5.anInt289 = (var5.anInt276 * 1433494849 - anInt556 << 8) / var10 * -1848987725;
						var5.anInt272 = (var5.anInt281 * 1085621233 - anInt538 << 8) / var10 * -2073296299;
						var5.anInt292 = (var5.anInt282 * -1794318859 - anInt538 << 8) / var10 * -134855345;
						aClass22Array557[anInt573++] = var5;
					}
				}
			} else if (var5.anInt291 * 2100503345 == 2) {
				var6 = var5.anInt274 * -161539115 - anInt519 + 25;
				if (var6 >= 0 && var6 <= 50) {
					var7 = var5.anInt283 * 1526951523 - anInt517 + 25;
					if (var7 < 0) {
						var7 = 0;
					}

					var8 = var5.anInt273 * 1136304423 - anInt517 + 25;
					if (var8 > 50) {
						var8 = 50;
					}

					var13 = false;

					while (var7 <= var8) {
						if (aBoolArrayArray569[var7++][var6]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var10 = anInt556 - var5.anInt279 * -840190769;
						if (var10 > 32) {
							var5.anInt277 = 2009820099;
						} else {
							if (var10 >= -32) {
								continue;
							}

							var5.anInt277 = -1615207164;
							var10 = -var10;
						}

						var5.anInt284 = (var5.anInt290 * -87664291 - anInt552 << 8) / var10 * -310537311;
						var5.anInt285 = (var5.anInt280 * -1977435303 - anInt552 << 8) / var10 * 538391901;
						var5.anInt272 = (var5.anInt281 * 1085621233 - anInt538 << 8) / var10 * -2073296299;
						var5.anInt292 = (var5.anInt282 * -1794318859 - anInt538 << 8) / var10 * -134855345;
						aClass22Array557[anInt573++] = var5;
					}
				}
			} else if (var5.anInt291 * 2100503345 == 4) {
				var6 = var5.anInt281 * 1085621233 - anInt538;
				if (var6 > 128) {
					var7 = var5.anInt274 * -161539115 - anInt519 + 25;
					if (var7 < 0) {
						var7 = 0;
					}

					var8 = var5.anInt278 * -397567009 - anInt519 + 25;
					if (var8 > 50) {
						var8 = 50;
					}

					if (var7 <= var8) {
						int var2 = var5.anInt283 * 1526951523 - anInt517 + 25;
						if (var2 < 0) {
							var2 = 0;
						}

						var10 = var5.anInt273 * 1136304423 - anInt517 + 25;
						if (var10 > 50) {
							var10 = 50;
						}

						boolean var3 = false;

						label176:
						for (int var11 = var2; var11 <= var10; var11++) {
							for (int var12 = var7; var12 <= var8; var12++) {
								if (aBoolArrayArray569[var11][var12]) {
									var3 = true;
									break label176;
								}
							}
						}

						if (var3) {
							var5.anInt277 = -945267131;
							var5.anInt284 = (var5.anInt290 * -87664291 - anInt552 << 8) / var6 * -310537311;
							var5.anInt285 = (var5.anInt280 * -1977435303 - anInt552 << 8) / var6 * 538391901;
							var5.anInt286 = (var5.anInt279 * -840190769 - anInt556 << 8) / var6 * 1898861439;
							var5.anInt289 = (var5.anInt276 * 1433494849 - anInt556 << 8) / var6 * -1848987725;
							aClass22Array557[anInt573++] = var5;
						}
					}
				}
			}
		}

	}

	boolean method545(int var1, int var2, int var3) {
		int var4 = anIntArrayArrayArray523[var1][var2][var3];
		if (var4 == -anInt530) {
			return false;
		} else if (var4 == anInt530) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (method605(var5 + 1, anIntArrayArrayArray549[var1][var2][var3], var6 + 1) && method605(var5 + 128 - 1, anIntArrayArrayArray549[var1][var2 + 1][var3], var6 + 1) && method605(var5 + 128 - 1, anIntArrayArrayArray549[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && method605(var5 + 1, anIntArrayArrayArray549[var1][var2][var3 + 1], var6 + 128 - 1)) {
				anIntArrayArrayArray523[var1][var2][var3] = anInt530;
				return true;
			} else {
				anIntArrayArrayArray523[var1][var2][var3] = -anInt530;
				return false;
			}
		}
	}

	boolean method546(int var1, int var2, int var3, int var4) {
		if (!method545(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = anIntArrayArrayArray549[var1][var2][var3] - 1;
			int var9 = var7 - 120;
			int var8 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > anInt552) {
						if (!method605(var5, var7, var6)) {
							return false;
						}

						if (!method605(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!method605(var5, var9, var6)) {
							return false;
						}

						if (!method605(var5, var9, var6 + 128)) {
							return false;
						}
					}

					if (!method605(var5, var8, var6)) {
						return false;
					}

					if (!method605(var5, var8, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < anInt556) {
						if (!method605(var5, var7, var6 + 128)) {
							return false;
						}

						if (!method605(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!method605(var5, var9, var6 + 128)) {
							return false;
						}

						if (!method605(var5 + 128, var9, var6 + 128)) {
							return false;
						}
					}

					if (!method605(var5, var8, var6 + 128)) {
						return false;
					}

					if (!method605(var5 + 128, var8, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < anInt552) {
						if (!method605(var5 + 128, var7, var6)) {
							return false;
						}

						if (!method605(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!method605(var5 + 128, var9, var6)) {
							return false;
						}

						if (!method605(var5 + 128, var9, var6 + 128)) {
							return false;
						}
					}

					if (!method605(var5 + 128, var8, var6)) {
						return false;
					}

					if (!method605(var5 + 128, var8, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > anInt556) {
						if (!method605(var5, var7, var6)) {
							return false;
						}

						if (!method605(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!method605(var5, var9, var6)) {
							return false;
						}

						if (!method605(var5 + 128, var9, var6)) {
							return false;
						}
					}

					if (!method605(var5, var8, var6)) {
						return false;
					}

					if (!method605(var5 + 128, var8, var6)) {
						return false;
					}

					return true;
				}
			}

			return !method605(var5 + 64, var10, var6 + 64) ? false : (var4 == 16 ? method605(var5, var8, var6 + 128) : (var4 == 32 ? method605(var5 + 128, var8, var6 + 128) : (var4 == 64 ? method605(var5 + 128, var8, var6) : (var4 == 128 ? method605(var5, var8, var6) : true))));
		}
	}

	boolean method547(int var1, int var2, int var3, int var4) {
		if (method545(var1, var2, var3)) {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return method605(var5 + 1, anIntArrayArrayArray549[var1][var2][var3] - var4, var6 + 1) && method605(var5 + 128 - 1, anIntArrayArrayArray549[var1][var2 + 1][var3] - var4, var6 + 1) && method605(var5 + 128 - 1, anIntArrayArrayArray549[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && method605(var5 + 1, anIntArrayArrayArray549[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		} else {
			return false;
		}
	}

	boolean method548(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var2 == var3 && var4 == var5) {
			if (!method545(var1, var2, var4)) {
				return false;
			} else {
				var8 = var2 << 7;
				var7 = var4 << 7;
				return method605(var8 + 1, anIntArrayArrayArray549[var1][var2][var4] - var6, var7 + 1) && method605(var8 + 128 - 1, anIntArrayArrayArray549[var1][var2 + 1][var4] - var6, var7 + 1) && method605(var8 + 128 - 1, anIntArrayArrayArray549[var1][var2 + 1][var4 + 1] - var6, var7 + 128 - 1) && method605(var8 + 1, anIntArrayArrayArray549[var1][var2][var4 + 1] - var6, var7 + 128 - 1);
			}
		} else {
			for (var8 = var2; var8 <= var3; var8++) {
				for (var7 = var4; var7 <= var5; var7++) {
					if (anIntArrayArrayArray523[var1][var8][var7] == -anInt530) {
						return false;
					}
				}
			}

			var8 = (var2 << 7) + 1;
			var7 = (var4 << 7) + 2;
			int var10 = anIntArrayArrayArray549[var1][var2][var4] - var6;
			if (!method605(var8, var10, var7)) {
				return false;
			} else {
				int var11 = (var3 << 7) - 1;
				if (!method605(var11, var10, var7)) {
					return false;
				} else {
					int var9 = (var5 << 7) - 1;
					if (!method605(var8, var10, var9)) {
						return false;
					} else if (!method605(var11, var10, var9)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	public void method584(int var1, int var2, int var3) {
		aBool553 = true;
		anInt546 = var1;
		anInt547 = var2;
		anInt548 = var3;
		anInt545 = -1;
		anInt520 = -1;
	}

	void method594(CacheableEntry_Sub23_Sub16_Sub6 var1, int var2, int var3, int var4) {
		LinkedEntry_Sub12 var5;
		CacheableEntry_Sub23_Sub16_Sub6 var6;
		if (var3 < anInt568) {
			var5 = aClass109_Sub12ArrayArrayArray555[var2][var3 + 1][var4];
			if (var5 != null && var5.aClass38_1802 != null && var5.aClass38_1802.aClass109_Sub23_Sub16_509 instanceof CacheableEntry_Sub23_Sub16_Sub6) {
				var6 = (CacheableEntry_Sub23_Sub16_Sub6) var5.aClass38_1802.aClass109_Sub23_Sub16_509;
				CacheableEntry_Sub23_Sub16_Sub6.method3225(var1, var6, 128, 0, 0, true);
			}
		}

		if (var4 < anInt568) {
			var5 = aClass109_Sub12ArrayArrayArray555[var2][var3][var4 + 1];
			if (var5 != null && var5.aClass38_1802 != null && var5.aClass38_1802.aClass109_Sub23_Sub16_509 instanceof CacheableEntry_Sub23_Sub16_Sub6) {
				var6 = (CacheableEntry_Sub23_Sub16_Sub6) var5.aClass38_1802.aClass109_Sub23_Sub16_509;
				CacheableEntry_Sub23_Sub16_Sub6.method3225(var1, var6, 0, 0, 128, true);
			}
		}

		if (var3 < anInt568 && var4 < anInt561) {
			var5 = aClass109_Sub12ArrayArrayArray555[var2][var3 + 1][var4 + 1];
			if (var5 != null && var5.aClass38_1802 != null && var5.aClass38_1802.aClass109_Sub23_Sub16_509 instanceof CacheableEntry_Sub23_Sub16_Sub6) {
				var6 = (CacheableEntry_Sub23_Sub16_Sub6) var5.aClass38_1802.aClass109_Sub23_Sub16_509;
				CacheableEntry_Sub23_Sub16_Sub6.method3225(var1, var6, 128, 0, 128, true);
			}
		}

		if (var3 < anInt568 && var4 > 0) {
			var5 = aClass109_Sub12ArrayArrayArray555[var2][var3 + 1][var4 - 1];
			if (var5 != null && var5.aClass38_1802 != null && var5.aClass38_1802.aClass109_Sub23_Sub16_509 instanceof CacheableEntry_Sub23_Sub16_Sub6) {
				var6 = (CacheableEntry_Sub23_Sub16_Sub6) var5.aClass38_1802.aClass109_Sub23_Sub16_509;
				CacheableEntry_Sub23_Sub16_Sub6.method3225(var1, var6, 128, 0, -128, true);
			}
		}

	}

	public boolean method597(int var1, int var2, int var3, int var4, int var5, int var6, CacheableEntry_Sub23_Sub16 var7, int var8, int var9, int var10) {
		if (var7 == null) {
			return true;
		} else {
			int var11 = var2 * 128 + var5 * 64;
			int var12 = var3 * 128 + var6 * 64;
			return method514(var1, var2, var3, var5, var6, var11, var12, var4, var7, var8, false, var9, var10);
		}
	}

	public void method598(int var1, int var2, int var3) {
		LinkedEntry_Sub12 var4 = aClass109_Sub12ArrayArrayArray555[var1][var2][var3];
		if (var4 != null) {
			for (int var6 = 0; var6 < var4.anInt1813 * -1988543331; var6++) {
				Class33 var5 = var4.aClass33Array1805[var6];
				if ((var5.anInt426 * 2064355509 >> 29 & 3) == 2 && var5.anInt419 * 974211349 == var2 && var5.anInt421 * 26398035 == var3) {
					method527(var5);
					return;
				}
			}

		}
	}

	boolean method605(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < anInt573; var4++) {
			Class22 var5 = aClass22Array557[var4];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.anInt277 * -250931519 == 1) {
				var6 = var5.anInt290 * -87664291 - var1;
				if (var6 > 0) {
					var7 = var5.anInt279 * -840190769 + (var5.anInt286 * -1162515329 * var6 >> 8);
					var10 = var5.anInt276 * 1433494849 + (var5.anInt289 * 211392379 * var6 >> 8);
					var8 = var5.anInt281 * 1085621233 + (var5.anInt272 * 715188989 * var6 >> 8);
					var9 = var5.anInt282 * -1794318859 + (var5.anInt292 * 315994543 * var6 >> 8);
					if (var3 >= var7 && var3 <= var10 && var2 >= var8 && var2 <= var9) {
						return true;
					}
				}
			} else if (var5.anInt277 * -250931519 == 2) {
				var6 = var1 - var5.anInt290 * -87664291;
				if (var6 > 0) {
					var7 = var5.anInt279 * -840190769 + (var5.anInt286 * -1162515329 * var6 >> 8);
					var10 = var5.anInt276 * 1433494849 + (var5.anInt289 * 211392379 * var6 >> 8);
					var8 = var5.anInt281 * 1085621233 + (var5.anInt272 * 715188989 * var6 >> 8);
					var9 = var5.anInt282 * -1794318859 + (var5.anInt292 * 315994543 * var6 >> 8);
					if (var3 >= var7 && var3 <= var10 && var2 >= var8 && var2 <= var9) {
						return true;
					}
				}
			} else if (var5.anInt277 * -250931519 == 3) {
				var6 = var5.anInt279 * -840190769 - var3;
				if (var6 > 0) {
					var7 = var5.anInt290 * -87664291 + (var5.anInt284 * 210833505 * var6 >> 8);
					var10 = var5.anInt280 * -1977435303 + (var5.anInt285 * -464206091 * var6 >> 8);
					var8 = var5.anInt281 * 1085621233 + (var5.anInt272 * 715188989 * var6 >> 8);
					var9 = var5.anInt282 * -1794318859 + (var5.anInt292 * 315994543 * var6 >> 8);
					if (var1 >= var7 && var1 <= var10 && var2 >= var8 && var2 <= var9) {
						return true;
					}
				}
			} else if (var5.anInt277 * -250931519 == 4) {
				var6 = var3 - var5.anInt279 * -840190769;
				if (var6 > 0) {
					var7 = var5.anInt290 * -87664291 + (var5.anInt284 * 210833505 * var6 >> 8);
					var10 = var5.anInt280 * -1977435303 + (var5.anInt285 * -464206091 * var6 >> 8);
					var8 = var5.anInt281 * 1085621233 + (var5.anInt272 * 715188989 * var6 >> 8);
					var9 = var5.anInt282 * -1794318859 + (var5.anInt292 * 315994543 * var6 >> 8);
					if (var1 >= var7 && var1 <= var10 && var2 >= var8 && var2 <= var9) {
						return true;
					}
				}
			} else if (var5.anInt277 * -250931519 == 5) {
				var6 = var2 - var5.anInt281 * 1085621233;
				if (var6 > 0) {
					var7 = var5.anInt290 * -87664291 + (var5.anInt284 * 210833505 * var6 >> 8);
					var10 = var5.anInt280 * -1977435303 + (var5.anInt285 * -464206091 * var6 >> 8);
					var8 = var5.anInt279 * -840190769 + (var5.anInt286 * -1162515329 * var6 >> 8);
					var9 = var5.anInt276 * 1433494849 + (var5.anInt289 * 211392379 * var6 >> 8);
					if (var1 >= var7 && var1 <= var10 && var3 >= var8 && var3 <= var9) {
						return true;
					}
				}
			}
		}

		return false;
	}

	public Class33 method608(int var1, int var2, int var3) {
		LinkedEntry_Sub12 var4 = aClass109_Sub12ArrayArrayArray555[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.anInt1813 * -1988543331; var5++) {
				Class33 var6 = var4.aClass33Array1805[var5];
				if ((var6.anInt426 * 2064355509 >> 29 & 3) == 2 && var6.anInt419 * 974211349 == var2 && var6.anInt421 * 26398035 == var3) {
					return var6;
				}
			}

			return null;
		}
	}

	public Class39(int var1, int var2, int var3, int[][][] var4) {
		anInt515 = var1;
		anInt568 = var2;
		anInt561 = var3;
		aClass109_Sub12ArrayArrayArray555 = new LinkedEntry_Sub12[var1][var2][var3];
		anIntArrayArrayArray523 = new int[var1][var2 + 1][var3 + 1];
		anIntArrayArrayArray549 = var4;
		method501();
	}

	public static void method631(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		Class22 var8 = new Class22();
		var8.anInt283 = var2 / 128 * 135693131;
		var8.anInt273 = var3 / 128 * 1580252823;
		var8.anInt274 = var4 / 128 * 1599292797;
		var8.anInt278 = var5 / 128 * -257302497;
		var8.anInt291 = var1 * -916367919;
		var8.anInt290 = var2 * -955989259;
		var8.anInt280 = var3 * -1558455063;
		var8.anInt279 = var4 * -602353105;
		var8.anInt276 = var5 * -479843647;
		var8.anInt281 = var6 * -1309192943;
		var8.anInt282 = var7 * 373106269;
		aClass22ArrayArray539[var0][anIntArray554[var0]++] = var8;
	}

	public void method643(int var1, int var2, int var3, int var4) {
		LinkedEntry_Sub12 var5 = aClass109_Sub12ArrayArrayArray555[var1][var2][var3];
		if (var5 != null) {
			aClass109_Sub12ArrayArrayArray555[var1][var2][var3].anInt1806 = var4 * -480664515;
		}
	}

	public void method644() {
		for (int var1 = 0; var1 < anInt550; var1++) {
			Class33 var2 = aClass33Array522[var1];
			method527(var2);
			aClass33Array522[var1] = null;
		}

		anInt550 = 0;
	}

	public int method646(int var1, int var2, int var3) {
		LinkedEntry_Sub12 var4 = aClass109_Sub12ArrayArrayArray555[var1][var2][var3];
		return var4 != null && var4.aClass26_1800 != null ? var4.aClass26_1800.anInt331 * -1209998417 : 0;
	}

	public void method655(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		int var21;
		Class29 var22;
		if (var4 != 0) {
			if (var4 != 1) {
				Class20 var23 = new Class20(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

				for (var21 = var1; var21 >= 0; --var21) {
					if (aClass109_Sub12ArrayArrayArray555[var21][var2][var3] == null) {
						aClass109_Sub12ArrayArrayArray555[var21][var2][var3] = new LinkedEntry_Sub12(var21, var2, var3);
					}
				}

				aClass109_Sub12ArrayArrayArray555[var1][var2][var3].aClass20_1799 = var23;
			} else {
				var22 = new Class29(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

				for (var21 = var1; var21 >= 0; --var21) {
					if (aClass109_Sub12ArrayArrayArray555[var21][var2][var3] == null) {
						aClass109_Sub12ArrayArrayArray555[var21][var2][var3] = new LinkedEntry_Sub12(var21, var2, var3);
					}
				}

				aClass109_Sub12ArrayArrayArray555[var1][var2][var3].aClass29_1814 = var22;
			}
		} else {
			var22 = new Class29(var11, var12, var13, var14, -1, var19, false);

			for (var21 = var1; var21 >= 0; --var21) {
				if (aClass109_Sub12ArrayArrayArray555[var21][var2][var3] == null) {
					aClass109_Sub12ArrayArrayArray555[var21][var2][var3] = new LinkedEntry_Sub12(var21, var2, var3);
				}
			}

			aClass109_Sub12ArrayArrayArray555[var1][var2][var3].aClass29_1814 = var22;
		}
	}

	void method666(Class29 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - anInt552;
		int var26;
		int var13 = var26 = (var8 << 7) - anInt556;
		int var27;
		int var12 = var27 = var10 + 128;
		int var14;
		int var15 = var14 = var13 + 128;
		int var16 = anIntArrayArrayArray549[var2][var7][var8] - anInt538;
		int var24 = anIntArrayArrayArray549[var2][var7 + 1][var8] - anInt538;
		int var28 = anIntArrayArrayArray549[var2][var7 + 1][var8 + 1] - anInt538;
		int var25 = anIntArrayArrayArray549[var2][var7][var8 + 1] - anInt538;
		int var11 = var13 * var5 + var10 * var6 >> 16;
		var13 = var13 * var6 - var10 * var5 >> 16;
		var10 = var11;
		var11 = var16 * var4 - var13 * var3 >> 16;
		var13 = var16 * var3 + var13 * var4 >> 16;
		var16 = var11;
		if (var13 >= 50) {
			var11 = var26 * var5 + var12 * var6 >> 16;
			var26 = var26 * var6 - var12 * var5 >> 16;
			var12 = var11;
			var11 = var24 * var4 - var26 * var3 >> 16;
			var26 = var24 * var3 + var26 * var4 >> 16;
			var24 = var11;
			if (var26 >= 50) {
				var11 = var15 * var5 + var27 * var6 >> 16;
				var15 = var15 * var6 - var27 * var5 >> 16;
				var27 = var11;
				var11 = var28 * var4 - var15 * var3 >> 16;
				var15 = var28 * var3 + var15 * var4 >> 16;
				var28 = var11;
				if (var15 >= 50) {
					var11 = var14 * var5 + var9 * var6 >> 16;
					var14 = var14 * var6 - var9 * var5 >> 16;
					var9 = var11;
					var11 = var25 * var4 - var14 * var3 >> 16;
					var14 = var25 * var3 + var14 * var4 >> 16;
					if (var14 >= 50) {
						int var18 = CacheableEntry_Sub23_Sub14_Sub3.anInt2706 + var10 * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / var13;
						int var29 = CacheableEntry_Sub23_Sub14_Sub3.anInt2707 + var16 * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / var13;
						int var23 = CacheableEntry_Sub23_Sub14_Sub3.anInt2706 + var12 * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / var26;
						int var21 = CacheableEntry_Sub23_Sub14_Sub3.anInt2707 + var24 * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / var26;
						int var17 = CacheableEntry_Sub23_Sub14_Sub3.anInt2706 + var27 * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / var15;
						int var19 = CacheableEntry_Sub23_Sub14_Sub3.anInt2707 + var28 * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / var15;
						int var22 = CacheableEntry_Sub23_Sub14_Sub3.anInt2706 + var9 * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / var14;
						int var20 = CacheableEntry_Sub23_Sub14_Sub3.anInt2707 + var11 * CacheableEntry_Sub23_Sub14_Sub3.anInt2705 / var14;
						CacheableEntry_Sub23_Sub14_Sub3.anInt2700 = 0;
						int var30;
						if ((var17 - var22) * (var21 - var20) - (var19 - var20) * (var23 - var22) > 0) {
							CacheableEntry_Sub23_Sub14_Sub3.aBool2701 = false;
							if (var17 < 0 || var22 < 0 || var23 < 0 || var17 > CacheableEntry_Sub23_Sub14_Sub3.anInt2717 || var22 > CacheableEntry_Sub23_Sub14_Sub3.anInt2717 || var23 > CacheableEntry_Sub23_Sub14_Sub3.anInt2717) {
								CacheableEntry_Sub23_Sub14_Sub3.aBool2701 = true;
							}

							if (aBool553 && method543(anInt547, anInt548, var19, var20, var21, var17, var22, var23)) {
								anInt545 = var7;
								anInt520 = var8;
							}

							if (var1.anInt372 * -916753167 == -1) {
								if (var1.anInt360 * 1410994793 != 12345678) {
									CacheableEntry_Sub23_Sub14_Sub3.method3158(var19, var20, var21, var17, var22, var23, var1.anInt360 * 1410994793, var1.anInt361 * -1067140039, var1.anInt369 * -1889290015);
								}
							} else if (!aBool535) {
								if (var1.aBool363) {
									CacheableEntry_Sub23_Sub14_Sub3.method3164(var19, var20, var21, var17, var22, var23, var1.anInt360 * 1410994793, var1.anInt361 * -1067140039, var1.anInt369 * -1889290015, var10, var12, var9, var16, var24, var11, var13, var26, var14, var1.anInt372 * -916753167);
								} else {
									CacheableEntry_Sub23_Sub14_Sub3.method3164(var19, var20, var21, var17, var22, var23, var1.anInt360 * 1410994793, var1.anInt361 * -1067140039, var1.anInt369 * -1889290015, var27, var9, var12, var28, var11, var24, var15, var14, var26, var1.anInt372 * -916753167);
								}
							} else {
								var30 = CacheableEntry_Sub23_Sub14_Sub3.anInterface2_2715.method29(var1.anInt372 * -916753167, 684776233);
								CacheableEntry_Sub23_Sub14_Sub3.method3158(var19, var20, var21, var17, var22, var23, method542(var30, var1.anInt360 * 1410994793), method542(var30, var1.anInt361 * -1067140039), method542(var30, var1.anInt369 * -1889290015));
							}
						}

						if ((var18 - var23) * (var20 - var21) - (var29 - var21) * (var22 - var23) > 0) {
							CacheableEntry_Sub23_Sub14_Sub3.aBool2701 = false;
							if (var18 < 0 || var23 < 0 || var22 < 0 || var18 > CacheableEntry_Sub23_Sub14_Sub3.anInt2717 || var23 > CacheableEntry_Sub23_Sub14_Sub3.anInt2717 || var22 > CacheableEntry_Sub23_Sub14_Sub3.anInt2717) {
								CacheableEntry_Sub23_Sub14_Sub3.aBool2701 = true;
							}

							if (aBool553 && method543(anInt547, anInt548, var29, var21, var20, var18, var23, var22)) {
								anInt545 = var7;
								anInt520 = var8;
							}

							if (var1.anInt372 * -916753167 == -1) {
								if (var1.anInt370 * 1604693801 != 12345678) {
									CacheableEntry_Sub23_Sub14_Sub3.method3158(var29, var21, var20, var18, var23, var22, var1.anInt370 * 1604693801, var1.anInt369 * -1889290015, var1.anInt361 * -1067140039);
								}
							} else if (aBool535) {
								var30 = CacheableEntry_Sub23_Sub14_Sub3.anInterface2_2715.method29(var1.anInt372 * -916753167, -2129085716);
								CacheableEntry_Sub23_Sub14_Sub3.method3158(var29, var21, var20, var18, var23, var22, method542(var30, var1.anInt370 * 1604693801), method542(var30, var1.anInt369 * -1889290015), method542(var30, var1.anInt361 * -1067140039));
							} else {
								CacheableEntry_Sub23_Sub14_Sub3.method3164(var29, var21, var20, var18, var23, var22, var1.anInt370 * 1604693801, var1.anInt369 * -1889290015, var1.anInt361 * -1067140039, var10, var12, var9, var16, var24, var11, var13, var26, var14, var1.anInt372 * -916753167);
							}
						}

					}
				}
			}
		}
	}

}
