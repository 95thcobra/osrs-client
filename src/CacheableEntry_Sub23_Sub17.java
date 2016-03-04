import netscape.javascript.JSObject;

import java.awt.*;

public class CacheableEntry_Sub23_Sub17 extends CacheableEntry {

	String[] aStringArray2412;
	public static final int anInt2413 = 80;
	int[] anIntArray2414;
	int anInt2416;
	int anInt2417;
	static InterfaceDef aInterfaceDef_2418;
	int anInt2419;
	static final int anInt2420 = 32768;
	static final int anInt2421 = 128;
	static final int anInt2422 = 88;
	static final int anInt2423 = 9;
	public static final int anInt2424 = 173;
	int[] anIntArray2425;
	int anInt2426;
	static Class128 aClass128_2415 = new Class128(128);

	static void method2794(int var0) {
		int var1 = Class5.anInt98 * 2104430923;
		int var2 = Class60.anInt769 * -1064642111;
		if (Class2.anInt17 * 1822130227 < var1) {
			var1 = Class2.anInt17 * 1822130227;
		}

		if (CacheableEntry_Sub23_Sub16_Sub1.anInt2503 * -733282123 < var2) {
			var2 = CacheableEntry_Sub23_Sub16_Sub1.anInt2503 * -733282123;
		}

		if (Class15.aClass35_195 != null) {
			try {
				GameClient var3 = GameClient.aGameClient2857;
				Object[] var4 = new Object[]{Integer.valueOf(LinkedEntry_Sub5_Sub4.method2933(2126812738))};
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
				;
			}
		}

	}

	static void method2796(int var0) {
		int var1;
		if (GameClient.anInt2889 * 1523524053 == 0) {
			LinkedEntry_Sub6.aClass39_1732 = new Class39(4, 104, 104, Class32.mapSquareHeights);

			for (var1 = 0; var1 < 4; var1++) {
				GameClient.aClass141Array2923[var1] = new Class141(104, 104);
			}

			Class3.aClass109_Sub23_Sub14_Sub2_73 = new RenderedItemImage(512, 512);
			Class3.aString56 = Class90.aString1098;
			Class3.anInt66 = 1669447431;
			GameClient.anInt2889 = 356857284;
		} else {
			int var2;
			int var3;
			int var4;
			int var5;
			if (GameClient.anInt2889 * 1523524053 == 20) {
				int[] var23 = new int[9];

				for (var3 = 0; var3 < 9; var3++) {
					var4 = 128 + var3 * 32 + 15;
					var2 = var4 * 3 + 600;
					var5 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2719[var4];
					var23[var3] = var5 * var2 >> 16;
				}

				Class39.method535(var23, 500, 800, 512, 334);
				Class3.aString56 = Class90.aString1069;
				Class3.anInt66 = -956072434;
				GameClient.anInt2889 = -1612197722;
			} else if (GameClient.anInt2889 * 1523524053 == 30) {
				Class54.aClass94_Sub1_724 = GameClient.method3552(0, false, true, true, 719007803);
				Class88.aClass94_Sub1_1046 = GameClient.method3552(1, false, true, true, 719007803);
				Class35.index2 = GameClient.method3552(2, true, false, true, 719007803);
				Class35.aClass94_Sub1_477 = GameClient.method3552(3, false, true, true, 719007803);
				GameClient.aClass94_Sub1_3134 = GameClient.method3552(4, false, true, true, 719007803);
				Class126_Sub1.aClass94_Sub1_1643 = GameClient.method3552(5, true, true, true, 719007803);
				Class46.aClass94_Sub1_652 = GameClient.method3552(6, true, true, false, 719007803);
				Class22.aClass94_Sub1_288 = GameClient.method3552(7, false, true, true, 719007803);
				Class18.aClass94_Sub1_217 = GameClient.method3552(8, false, true, true, 719007803);
				ScriptInvocation.aClass94_Sub1_1783 = GameClient.method3552(9, false, true, true, 719007803);
				IndexDescriptor.aClass94_Sub1_1369 = GameClient.method3552(10, false, true, true, 719007803);
				Class44.aClass94_Sub1_634 = GameClient.method3552(11, false, true, true, 719007803);
				Connection.aClass94_Sub1_972 = GameClient.method3552(12, false, true, true, 719007803);
				Class121.aClass94_Sub1_1553 = GameClient.method3552(13, true, false, true, 719007803);
				CacheableEntry_Sub23_Sub16_Sub1.aClass94_Sub1_2502 = GameClient.method3552(14, false, true, false, 719007803);
				GameClient.aClass94_Sub1_2928 = GameClient.method3552(15, false, true, true, 719007803);
				Class3.aString56 = Class90.aString1070;
				Class3.anInt66 = -1912144868;
				GameClient.anInt2889 = 713714568;
			} else if (GameClient.anInt2889 * 1523524053 == 40) {
				byte var22 = 0;
				var1 = var22 + Class54.aClass94_Sub1_724.method2128(403675217) * 4 / 100;
				var1 += Class88.aClass94_Sub1_1046.method2128(403675217) * 4 / 100;
				var1 += Class35.index2.method2128(403675217) * 2 / 100;
				var1 += Class35.aClass94_Sub1_477.method2128(403675217) * 2 / 100;
				var1 += GameClient.aClass94_Sub1_3134.method2128(403675217) * 6 / 100;
				var1 += Class126_Sub1.aClass94_Sub1_1643.method2128(403675217) * 4 / 100;
				var1 += Class46.aClass94_Sub1_652.method2128(403675217) * 2 / 100;
				var1 += Class22.aClass94_Sub1_288.method2128(403675217) * 60 / 100;
				var1 += Class18.aClass94_Sub1_217.method2128(403675217) * 2 / 100;
				var1 += ScriptInvocation.aClass94_Sub1_1783.method2128(403675217) * 2 / 100;
				var1 += IndexDescriptor.aClass94_Sub1_1369.method2128(403675217) * 2 / 100;
				var1 += Class44.aClass94_Sub1_634.method2128(403675217) * 2 / 100;
				var1 += Connection.aClass94_Sub1_972.method2128(403675217) * 2 / 100;
				var1 += Class121.aClass94_Sub1_1553.method2128(403675217) * 2 / 100;
				var1 += CacheableEntry_Sub23_Sub16_Sub1.aClass94_Sub1_2502.method2128(403675217) * 2 / 100;
				var1 += GameClient.aClass94_Sub1_2928.method2128(403675217) * 2 / 100;
				if (var1 != 100) {
					if (var1 != 0) {
						Class3.aString56 = Class90.aString1185 + var1 + "%";
					}

					Class3.anInt66 = 1426749994;
				} else {
					Class3.aString56 = Class90.aString1072;
					Class3.anInt66 = 1426749994;
					GameClient.anInt2889 = -270812935;
				}
			} else {
				IndexDescriptor_Sub1 var13;
				IndexDescriptor_Sub1 var14;
				if (GameClient.anInt2889 * 1523524053 == 45) {
					boolean var21 = !GameClient.aBool2864;
					Class2.anInt34 = -1170216006;
					Class2.aBool19 = var21;
					Class2.anInt18 = -955798922;
					LinkedEntry_Sub5_Sub4 var12 = new LinkedEntry_Sub5_Sub4();
					var12.method2850(9, 128, (byte) 47);
					CacheableEntry_Sub23_Sub6.aClass2_2200 = GameClient.method3639(Class50.aClass73_693, Class60.aCanvas771, 0, 22050, (byte) 0);
					CacheableEntry_Sub23_Sub6.aClass2_2200.method48(var12, (byte) 0);
					var13 = GameClient.aClass94_Sub1_2928;
					IndexDescriptor_Sub1 var17 = CacheableEntry_Sub23_Sub16_Sub1.aClass94_Sub1_2502;
					var14 = GameClient.aClass94_Sub1_3134;
					Class104.aIndexDescriptor_1456 = var13;
					Class104.aIndexDescriptor_1451 = var17;
					Class104.aIndexDescriptor_1452 = var14;
					Class104.aClass109_Sub5_Sub4_1453 = var12;
					IndexDescriptor.aClass2_1353 = GameClient.method3639(Class50.aClass73_693, Class60.aCanvas771, 1, 2048, (byte) 0);
					Class48.aClass109_Sub5_Sub1_672 = new LinkedEntry_Sub5_Sub1();
					IndexDescriptor.aClass2_1353.method48(Class48.aClass109_Sub5_Sub1_672, (byte) 0);
					Class76.aClass10_925 = new Class10(22050, Class2.anInt34 * -46901051);
					Class3.aString56 = Class90.aString1073;
					Class3.anInt66 = -1198769871;
					GameClient.anInt2889 = -1255340438;
				} else if (GameClient.anInt2889 * 1523524053 == 50) {
					var1 = 0;
					if (Class23.aClass109_Sub23_Sub14_Sub4_Sub1_309 == null) {
						Class23.aClass109_Sub23_Sub14_Sub4_Sub1_309 = Class46.method696(Class18.aClass94_Sub1_217, Class121.aClass94_Sub1_1553, "p11_full", "", 12295440);
					} else {
						++var1;
					}

					if (Class44.aClass109_Sub23_Sub14_Sub4_Sub1_621 == null) {
						Class44.aClass109_Sub23_Sub14_Sub4_Sub1_621 = Class46.method696(Class18.aClass94_Sub1_217, Class121.aClass94_Sub1_1553, "p12_full", "", -1090536767);
					} else {
						++var1;
					}

					if (Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343 == null) {
						Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343 = Class46.method696(Class18.aClass94_Sub1_217, Class121.aClass94_Sub1_1553, "b12_full", "", -407545207);
					} else {
						++var1;
					}

					if (var1 < 3) {
						Class3.aString56 = Class90.aString1147 + var1 * 100 / 3 + "%";
						Class3.anInt66 = 470677560;
					} else {
						Class44.myMachine = new MachineInfo(true);
						Class3.aString56 = Class90.aString1075;
						Class3.anInt66 = 470677560;
						GameClient.anInt2889 = 1070571852;
					}
				} else {
					IndexDescriptor_Sub1 var11;
					if (GameClient.anInt2889 * 1523524053 == 60) {
						var11 = IndexDescriptor.aClass94_Sub1_1369;
						var13 = Class18.aClass94_Sub1_217;
						var2 = 0;
						if (var11.method1167("title.jpg", "", (byte) 14)) {
							++var2;
						}

						if (var13.method1167("logo", "", (byte) 115)) {
							++var2;
						}

						if (var13.method1167("titlebox", "", (byte) 30)) {
							++var2;
						}

						if (var13.method1167("titlebutton", "", (byte) 36)) {
							++var2;
						}

						if (var13.method1167("runes", "", (byte) 65)) {
							++var2;
						}

						if (var13.method1167("title_mute", "", (byte) 83)) {
							++var2;
						}

						if (var13.method1168("options_radio_buttons,0", (byte) -112)) {
							++var2;
						}

						if (var13.method1168("options_radio_buttons,2", (byte) -1)) {
							++var2;
						}

						var13.method1167("sl_back", "", (byte) 25);
						var13.method1167("sl_flags", "", (byte) 31);
						var13.method1167("sl_arrows", "", (byte) 99);
						var13.method1167("sl_stars", "", (byte) 81);
						var13.method1167("sl_button", "", (byte) 97);
						byte var15 = 8;
						if (var2 < var15) {
							Class3.aString56 = Class90.aString1076 + var2 * 100 / var15 + "%";
							Class3.anInt66 = -485394874;
						} else {
							Class3.aString56 = Class90.aString1055;
							Class3.anInt66 = -485394874;
							Class93.method1146(5, 2141747307);
							GameClient.anInt2889 = -898483154;
						}
					} else if (GameClient.anInt2889 * 1523524053 == 70) {
						if (!Class35.index2.method1155((byte) -119)) {
							Class3.aString56 = Class90.aString1059 + Class35.index2.method2133((byte) 117) + "%";
							Class3.anInt66 = -1441467308;
						} else {
							IndexDescriptor_Sub1 var20 = Class35.index2;
							CacheableEntry_Sub23_Sub11.aIndexDescriptor_2331 = var20;
							Class5.method135(Class35.index2, (byte) -22);
							CacheableEntry_Sub23_Sub15.method2783(Class35.index2, Class22.aClass94_Sub1_288, 1933269507);
							var11 = Class35.index2;
							var13 = Class22.aClass94_Sub1_288;
							boolean var10 = GameClient.aBool2864;
							Class93.aIndexDescriptor_1344 = var11;
							Class56.aIndexDescriptor_734 = var13;
							ObjectDef.aBool2267 = var10;
							var14 = Class35.index2;
							IndexDescriptor_Sub1 var16 = Class22.aClass94_Sub1_288;
							NpcDef.aIndexDescriptor_2253 = var14;
							NpcDef.aIndexDescriptor_2217 = var16;
							DataBuffer.method2087(Class35.index2, Class22.aClass94_Sub1_288, GameClient.aBool2863, Class23.aClass109_Sub23_Sub14_Sub4_Sub1_309, (byte) 15);
							Class4.method134(Class35.index2, Class54.aClass94_Sub1_724, Class88.aClass94_Sub1_1046, 779588927);
							Class40.method667(Class35.index2, Class22.aClass94_Sub1_288, -2142837775);
							IndexDescriptor_Sub1 var8 = Class35.index2;
							CacheableEntry_Sub23_Sub10.aIndexDescriptor_2311 = var8;
							IndexDescriptor_Sub1 var9 = Class35.index2;
							CacheableEntry_Sub23_Sub7.aIndexDescriptor_2213 = var9;
							CacheableEntry_Sub23_Sub7.anInt2212 = CacheableEntry_Sub23_Sub7.aIndexDescriptor_2213.numFilesInContainer(16) * 1572075539;
							PacketDecoder.method388(Class35.aClass94_Sub1_477, Class22.aClass94_Sub1_288, Class18.aClass94_Sub1_217, Class121.aClass94_Sub1_1553, 471759137);
							IndexDescriptor_Sub1 var6 = Class35.index2;
							CacheableEntry_Sub23_Sub1.aIndexDescriptor_2092 = var6;
							Class63_Sub1.method2090(Class35.index2, -397400647);
							Class3.aString56 = Class90.aString1079;
							Class3.anInt66 = -1441467308;
							GameClient.anInt2889 = 1427429136;
						}
					} else if (GameClient.anInt2889 * 1523524053 != 80) {
						if (GameClient.anInt2889 * 1523524053 == 90) {
							if (!ScriptInvocation.aClass94_Sub1_1783.method1155((byte) -41)) {
								Class3.aString56 = Class90.aString1188 + ScriptInvocation.aClass94_Sub1_1783.method2133((byte) 105) + "%";
								Class3.anInt66 = -14717314;
							} else {
								Class45 var19 = new Class45(ScriptInvocation.aClass94_Sub1_1783, Class18.aClass94_Sub1_217, 20, 0.8D, GameClient.aBool2864 ? 64 : 128);
								CacheableEntry_Sub23_Sub14_Sub3.method3153(var19);
								CacheableEntry_Sub23_Sub14_Sub3.method3154(0.8D);
								Class3.aString56 = Class90.aString1083;
								Class3.anInt66 = -14717314;
								GameClient.anInt2889 = -184768586;
							}
						} else if (GameClient.anInt2889 * 1523524053 == 110) {
							Class41.aClass48_588 = new Class48();
							Class50.aClass73_693.submitRunnable(Class41.aClass48_588, 10, (byte) 7);
							Class3.aString56 = Class90.aString1222;
							Class3.anInt66 = -2115133206;
							GameClient.anInt2889 = 2141143704;
						} else if (GameClient.anInt2889 * 1523524053 == 120) {
							if (!IndexDescriptor.aClass94_Sub1_1369.method1167("huffman", "", (byte) 8)) {
								Class3.aString56 = Class90.aString1228 + 0 + "%";
								Class3.anInt66 = 1129626144;
							} else {
								Class60 var18 = new Class60(IndexDescriptor.aClass94_Sub1_1369.method1166("huffman", "", (byte) 0));
								Class137.aClass60_1610 = var18;
								Class3.aString56 = Class90.aString1233;
								Class3.anInt66 = 1129626144;
								GameClient.anInt2889 = 172088698;
							}
						} else if (GameClient.anInt2889 * 1523524053 == 130) {
							if (!Class35.aClass94_Sub1_477.method1155((byte) -120)) {
								Class3.aString56 = Class90.aString1131 + Class35.aClass94_Sub1_477.method2133((byte) 88) * 4 / 5 + "%";
								Class3.anInt66 = -970789748;
							} else if (!Connection.aClass94_Sub1_972.method1155((byte) -57)) {
								Class3.aString56 = Class90.aString1131 + (80 + Connection.aClass94_Sub1_972.method2133((byte) 79) / 6) + "%";
								Class3.anInt66 = -970789748;
							} else if (!Class121.aClass94_Sub1_1553.method1155((byte) -90)) {
								Class3.aString56 = Class90.aString1131 + (96 + Class121.aClass94_Sub1_1553.method2133((byte) 34) / 20) + "%";
								Class3.anInt66 = -970789748;
							} else {
								Class3.aString56 = Class90.aString1088;
								Class3.anInt66 = -970789748;
								GameClient.anInt2889 = -1796966308;
							}
						} else if (GameClient.anInt2889 * 1523524053 == 140) {
							Class93.method1146(10, 2064596002);
						}
					} else {
						var1 = 0;
						if (Class15.aClass109_Sub23_Sub14_Sub2_189 == null) {
							Class15.aClass109_Sub23_Sub14_Sub2_189 = CacheableEntry_Sub23_Sub16_Sub2.method2948(Class18.aClass94_Sub1_217, "compass", "", (byte) 20);
						} else {
							++var1;
						}

						if (EnumDef.aClass109_Sub23_Sub14_Sub2_2198 == null) {
							EnumDef.aClass109_Sub23_Sub14_Sub2_2198 = CacheableEntry_Sub23_Sub16_Sub2.method2948(Class18.aClass94_Sub1_217, "mapedge", "", (byte) 53);
						} else {
							++var1;
						}

						if (Class133.aClass109_Sub23_Sub14_Sub1Array1597 == null) {
							Class133.aClass109_Sub23_Sub14_Sub1Array1597 = Class24.method359(Class18.aClass94_Sub1_217, "mapscene", "", -771714776);
						} else {
							++var1;
						}

						if (Class47.aClass109_Sub23_Sub14_Sub2Array662 == null) {
							Class47.aClass109_Sub23_Sub14_Sub2Array662 = ScriptInvocation.method1838(Class18.aClass94_Sub1_217, "mapfunction", "");
						} else {
							++var1;
						}

						if (CacheableEntry_Sub23_Sub11.aClass109_Sub23_Sub14_Sub2Array2338 == null) {
							CacheableEntry_Sub23_Sub11.aClass109_Sub23_Sub14_Sub2Array2338 = ScriptInvocation.method1838(Class18.aClass94_Sub1_217, "hitmarks", "");
						} else {
							++var1;
						}

						if (Player.aClass109_Sub23_Sub14_Sub2Array2836 == null) {
							Player.aClass109_Sub23_Sub14_Sub2Array2836 = ScriptInvocation.method1838(Class18.aClass94_Sub1_217, "headicons_pk", "");
						} else {
							++var1;
						}

						if (Class29.aClass109_Sub23_Sub14_Sub2Array359 == null) {
							Class29.aClass109_Sub23_Sub14_Sub2Array359 = ScriptInvocation.method1838(Class18.aClass94_Sub1_217, "headicons_prayer", "");
						} else {
							++var1;
						}

						if (Class40.aClass109_Sub23_Sub14_Sub2Array580 == null) {
							Class40.aClass109_Sub23_Sub14_Sub2Array580 = ScriptInvocation.method1838(Class18.aClass94_Sub1_217, "headicons_hint", "");
						} else {
							++var1;
						}

						if (Class6.aClass109_Sub23_Sub14_Sub2Array99 == null) {
							Class6.aClass109_Sub23_Sub14_Sub2Array99 = ScriptInvocation.method1838(Class18.aClass94_Sub1_217, "mapmarker", "");
						} else {
							++var1;
						}

						if (GameClient.aClass109_Sub23_Sub14_Sub2Array2905 == null) {
							GameClient.aClass109_Sub23_Sub14_Sub2Array2905 = ScriptInvocation.method1838(Class18.aClass94_Sub1_217, "cross", "");
						} else {
							++var1;
						}

						if (Class46.aClass109_Sub23_Sub14_Sub2Array653 == null) {
							Class46.aClass109_Sub23_Sub14_Sub2Array653 = ScriptInvocation.method1838(Class18.aClass94_Sub1_217, "mapdots", "");
						} else {
							++var1;
						}

						if (Class58.aClass109_Sub23_Sub14_Sub1Array753 == null) {
							Class58.aClass109_Sub23_Sub14_Sub1Array753 = Class24.method359(Class18.aClass94_Sub1_217, "scrollbar", "", -1221833667);
						} else {
							++var1;
						}

						if (Class89.aClass109_Sub23_Sub14_Sub1Array1052 == null) {
							Class89.aClass109_Sub23_Sub14_Sub1Array1052 = Class24.method359(Class18.aClass94_Sub1_217, "mod_icons", "", -1885082922);
						} else {
							++var1;
						}

						if (var1 < 13) {
							Class3.aString56 = Class90.aString1159 + var1 * 100 / 13 + "%";
							Class3.anInt66 = 1897427554;
						} else {
							CacheableEntry_Sub23_Sub14_Sub4.aClass109_Sub23_Sub14_Sub1Array2799 = Class89.aClass109_Sub23_Sub14_Sub1Array1052;
							EnumDef.aClass109_Sub23_Sub14_Sub2_2198.method2989();
							var3 = (int) (Math.random() * 21.0D) - 10;
							var4 = (int) (Math.random() * 21.0D) - 10;
							var2 = (int) (Math.random() * 21.0D) - 10;
							var5 = (int) (Math.random() * 41.0D) - 20;

							for (int var7 = 0; var7 < Class47.aClass109_Sub23_Sub14_Sub2Array662.length; var7++) {
								Class47.aClass109_Sub23_Sub14_Sub2Array662[var7].method3026(var5 + var3, var4 + var5, var5 + var2);
							}

							Class133.aClass109_Sub23_Sub14_Sub1Array1597[0].method2976(var5 + var3, var5 + var4, var2 + var5);
							Class3.aString56 = Class90.aString1307;
							Class3.anInt66 = 1897427554;
							GameClient.anInt2889 = -541625870;
						}
					}
				}
			}
		}
	}

	public static void method2797(int var0) {
		GfxDef.cache.method1579();
		GfxDef.aClass128_2356.method1579();
	}

	static void method2798(short var0) {
		if (GameClient.isPickingOption) {
			InterfaceDef var2 = Class50.method712(Class63.anInt799 * -464823961, GameClient.anInt2881 * -1911127929, (short) -18366);
			if (var2 != null && var2.anObjectArray2029 != null) {
				ScriptInvocation var1 = new ScriptInvocation();
				var1.inter = var2;
				var1.parameters = var2.anObjectArray2029;
				InterfaceDef.method2182(var1, -337683086);
			}

			GameClient.isPickingOption = false;
			Class35.method484(var2, -1784656969);
		}
	}

	static final void method2799(int var0, int var1, int var2, int var3) {
		int var4;
		for (var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				Class32.mapSquareHeights[var0][var4 + var1][var5 + var2] = 0;
			}
		}

		if (var1 > 0) {
			for (var4 = 1; var4 < 8; var4++) {
				Class32.mapSquareHeights[var0][var1][var4 + var2] = Class32.mapSquareHeights[var0][var1 - 1][var2 + var4];
			}
		}

		if (var2 > 0) {
			for (var4 = 1; var4 < 8; var4++) {
				Class32.mapSquareHeights[var0][var1 + var4][var2] = Class32.mapSquareHeights[var0][var4 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Class32.mapSquareHeights[var0][var1 - 1][var2] != 0) {
			Class32.mapSquareHeights[var0][var1][var2] = Class32.mapSquareHeights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Class32.mapSquareHeights[var0][var1][var2 - 1] != 0) {
			Class32.mapSquareHeights[var0][var1][var2] = Class32.mapSquareHeights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Class32.mapSquareHeights[var0][var1 - 1][var2 - 1] != 0) {
			Class32.mapSquareHeights[var0][var1][var2] = Class32.mapSquareHeights[var0][var1 - 1][var2 - 1];
		}

	}

	public static Class7 method2800(int var0, int var1, Component var2, byte var3) {
		try {
			Class7_Sub2 var4 = new Class7_Sub2();
			var4.method177(var0, var1, var2, (byte) 13);
			return var4;
		} catch (Throwable var6) {
			Class7_Sub1 var5 = new Class7_Sub1();
			var5.method177(var0, var1, var2, (byte) 3);
			return var5;
		}
	}

}
