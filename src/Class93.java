public class Class93 {

	public static final int anInt1341 = 233;
	static final int anInt1342 = 14;
	static CacheableEntry_Sub23_Sub14_Sub4_Sub1 aClass109_Sub23_Sub14_Sub4_Sub1_1343;
	public static IndexDescriptor aIndexDescriptor_1344;
	public static final int anInt1345 = 8;

	Class93() throws Throwable {
		throw new Error();
	}

	static void method1145(int var0, String var1, String var2) {
		IsaacCipher.method822(var0, var1, var2, (String) null, 670743811);
	}

	static void method1146(int var0, int var1) {
		if (GameClient.anInt2868 * -684224463 != var0) {
			if (GameClient.anInt2868 * -684224463 == 0) {
				Class15.anImage191 = null;
				Class61.aFont779 = null;
				Class46.aFontMetrics659 = null;
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) {
				GameClient.loginStage = 0;
				GameClient.anInt2989 = 0;
				GameClient.anInt3023 = 0;
			}

			if (var0 != 20 && var0 != 40 && CacheableEntry_Sub23_Sub16_Sub7.aConnection_2770 != null) {
				CacheableEntry_Sub23_Sub16_Sub7.aConnection_2770.terminate();
				CacheableEntry_Sub23_Sub16_Sub7.aConnection_2770 = null;
			}

			if (GameClient.anInt2868 * -684224463 == 25) {
				GameClient.anInt2862 = 0;
				GameClient.anInt2918 = 0;
				GameClient.anInt3115 = 1619520155;
				GameClient.anInt2920 = 0;
				GameClient.anInt3127 = -1369685237;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					CacheableEntry_Sub23_Sub16_Sub2.method2965(Class60.aCanvas771, IndexDescriptor.aClass94_Sub1_1369, Class18.aClass94_Sub1_217, true, GameClient.anInt2868 * -684224463 == 11 ? 4 : 0, -171479774);
				} else if (var0 == 11) {
					CacheableEntry_Sub23_Sub16_Sub2.method2965(Class60.aCanvas771, IndexDescriptor.aClass94_Sub1_1369, Class18.aClass94_Sub1_217, false, 4, 160189152);
				} else if (Class3.aBool63) {
					Class3.aClass109_Sub23_Sub14_Sub1_43 = null;
					Class3.aClass109_Sub23_Sub14_Sub1_44 = null;
					ItemDef.aClass109_Sub23_Sub14_Sub1Array2140 = null;
					Class134.aClass109_Sub23_Sub14_Sub2_1599 = null;
					Class3.aClass109_Sub23_Sub14_Sub2_45 = null;
					Class106.aClass109_Sub23_Sub14_Sub1_1475 = null;
					Class118.aClass109_Sub23_Sub14_Sub1Array1537 = null;
					Class3.aClass109_Sub23_Sub14_Sub1_41 = null;
					Class42.aClass109_Sub23_Sub14_Sub1_605 = null;
					Class108.aClass109_Sub23_Sub14_Sub2Array1511 = null;
					Class3.aClass109_Sub23_Sub14_Sub1Array64 = null;
					Class26.aClass109_Sub23_Sub14_Sub1Array329 = null;
					Class38.aClass109_Sub23_Sub14_Sub1Array511 = null;
					Class73.aClass109_Sub23_Sub14_Sub1_886 = null;
					Class33.anIntArray430 = null;
					Class51.anIntArray706 = null;
					Class42.anIntArray598 = null;
					Class60.anIntArray775 = null;
					Class66.anIntArray840 = null;
					Class136.anIntArray1606 = null;
					Class30.anIntArray382 = null;
					CacheableEntry_Sub23_Sub16_Sub4.anIntArray2617 = null;
					IndexDescriptor_Sub1.method2148(2, 1127013233);
					GameClient.method3561(true, (byte) 36);
					Class3.aBool63 = false;
				}
			} else {
				CacheableEntry_Sub23_Sub16_Sub2.method2965(Class60.aCanvas771, IndexDescriptor.aClass94_Sub1_1369, Class18.aClass94_Sub1_217, true, 0, 846283920);
			}

			GameClient.anInt2868 = var0 * -124925743;
		}
	}

	static final void method1147(int var0) {
		if (GameClient.aBool2864 && GameClient.anInt2917 * 1286856103 != CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619) {
			Class21.method346(CacheableEntry_Sub23_Sub11.anInt2336 * 1572449351, Class24.anInt317 * -932948791, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, Player.me.stepQueueX[0], Player.me.stepQueueY[0], 220808185);
		} else {
			if (GameClient.anInt3058 * -1923892843 != CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619) {
				GameClient.anInt3058 = CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -863727871;
				int var10 = CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619;
				int[] var5 = Class3.aClass109_Sub23_Sub14_Sub2_73.pixels;
				int var6 = var5.length;

				int var8;
				for (var8 = 0; var8 < var6; var8++) {
					var5[var8] = 0;
				}

				int var9;
				int var11;
				for (var8 = 1; var8 < 103; var8++) {
					var11 = 24628 + (103 - var8) * 2048;

					for (var9 = 1; var9 < 103; var9++) {
						if ((Class32.mapSettings[var10][var9][var8] & 24) == 0) {
							LinkedEntry_Sub6.aClass39_1732.method534(var5, var11, 512, var10, var9, var8);
						}

						if (var10 < 3 && (Class32.mapSettings[var10 + 1][var9][var8] & 8) != 0) {
							LinkedEntry_Sub6.aClass39_1732.method534(var5, var11, 512, 1 + var10, var9, var8);
						}

						var11 += 4;
					}
				}

				var8 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
				var11 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
				Class3.aClass109_Sub23_Sub14_Sub2_73.method3045();

				int var12;
				for (var9 = 1; var9 < 103; var9++) {
					for (var12 = 1; var12 < 103; var12++) {
						if ((Class32.mapSettings[var10][var12][var9] & 24) == 0) {
							Class63_Sub1.method2089(var10, var12, var9, var8, var11, -1750156853);
						}

						if (var10 < 3 && (Class32.mapSettings[var10 + 1][var12][var9] & 8) != 0) {
							Class63_Sub1.method2089(1 + var10, var12, var9, var8, var11, -1995676366);
						}
					}
				}

				GameClient.anInt3097 = 0;

				for (var9 = 0; var9 < 104; var9++) {
					for (var12 = 0; var12 < 104; var12++) {
						int var13 = LinkedEntry_Sub6.aClass39_1732.method530(CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var9, var12);
						if (var13 != 0) {
							var13 = var13 >> 14 & 32767;
							int var7 = Class56.getObjectDef(var13).anInt2286 * -845701083;
							if (var7 >= 0) {
								int var3 = var9;
								int var4 = var12;
								if (var7 != 22 && var7 != 29 && var7 != 34 && var7 != 36 && var7 != 46 && var7 != 47 && var7 != 48) {
									int[][] var2 = GameClient.aClass141Array2923[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619].anIntArrayArray1628;

									for (int var1 = 0; var1 < 10; var1++) {
										int var14 = (int) (Math.random() * 4.0D);
										if (var14 == 0 && var3 > 0 && var3 > var9 - 3 && (var2[var3 - 1][var4] & 19136776) == 0) {
											--var3;
										}

										if (var14 == 1 && var3 < 103 && var3 < 3 + var9 && (var2[var3 + 1][var4] & 19136896) == 0) {
											++var3;
										}

										if (var14 == 2 && var4 > 0 && var4 > var12 - 3 && (var2[var3][var4 - 1] & 19136770) == 0) {
											--var4;
										}

										if (var14 == 3 && var4 < 103 && var4 < var12 + 3 && (var2[var3][1 + var4] & 19136800) == 0) {
											++var4;
										}
									}
								}

								GameClient.aClass109_Sub23_Sub14_Sub2Array3128[GameClient.anInt3097 * -1281668133] = Class47.aClass109_Sub23_Sub14_Sub2Array662[var7];
								GameClient.anIntArray3098[GameClient.anInt3097 * -1281668133] = var3;
								GameClient.anIntArray3135[GameClient.anInt3097 * -1281668133] = var4;
								GameClient.anInt3097 += 347322451;
							}
						}
					}
				}

				Class72.aClass7_871.method158(-1730459256);
			}

		}
	}

}
