import java.awt.*;

public class Class30 {

	static final int anInt373 = 2;
	static final int anInt376 = 100;
	protected static int anInt377;
	static byte[][] aByteArrayArray378;
	static final int anInt379 = 40;
	static final int anInt380 = 1005;
	static int[][] anIntArrayArray381;
	static int[] anIntArray382;
	static final int anInt383 = 0;
	static final int anInt384 = 26;
	public static final int anInt385 = 103;
	int anInt375;
	CacheableEntry_Sub23_Sub12[] aClass109_Sub23_Sub12Array374 = new CacheableEntry_Sub23_Sub12[100];

	CacheableEntry_Sub23_Sub12 method397(int var1, String var2, String var3, String var4, int var5) {
		CacheableEntry_Sub23_Sub12 var6 = aClass109_Sub23_Sub12Array374[99];

		for (int var7 = anInt375 * 20030413; var7 > 0; --var7) {
			if (var7 != 100) {
				aClass109_Sub23_Sub12Array374[var7] = aClass109_Sub23_Sub12Array374[var7 - 1];
			}
		}

		if (var6 == null) {
			var6 = new CacheableEntry_Sub23_Sub12(var1, var2, var4, var3);
		} else {
			var6.unlink();
			var6.method2209();
			var6.method2512(var1, var2, var4, var3, -967770898);
		}

		aClass109_Sub23_Sub12Array374[0] = var6;
		if (anInt375 * 20030413 < 100) {
			anInt375 += 1307836677;
		}

		return var6;
	}

	CacheableEntry_Sub23_Sub12 method398(int var1, byte var2) {
		return var1 >= 0 && var1 < anInt375 * 20030413 ? aClass109_Sub23_Sub12Array374[var1] : null;
	}

	int method399(int var1) {
		return anInt375 * 20030413;
	}

	static void method409(CacheableEntry_Sub23_Sub14_Sub4_Sub1 var0, CacheableEntry_Sub23_Sub14_Sub4_Sub1 var1, byte var2) {
		if (Class108.aClass109_Sub23_Sub14_Sub2Array1511 == null) {
			Class108.aClass109_Sub23_Sub14_Sub2Array1511 = ScriptInvocation.method1838(Class18.aClass94_Sub1_217, "sl_back", "");
		}

		if (Class3.aClass109_Sub23_Sub14_Sub1Array64 == null) {
			Class3.aClass109_Sub23_Sub14_Sub1Array64 = Class24.method359(Class18.aClass94_Sub1_217, "sl_flags", "", -1075208800);
		}

		if (Class26.aClass109_Sub23_Sub14_Sub1Array329 == null) {
			Class26.aClass109_Sub23_Sub14_Sub1Array329 = Class24.method359(Class18.aClass94_Sub1_217, "sl_arrows", "", -1653204550);
		}

		if (Class38.aClass109_Sub23_Sub14_Sub1Array511 == null) {
			Class38.aClass109_Sub23_Sub14_Sub1Array511 = Class24.method359(Class18.aClass94_Sub1_217, "sl_stars", "", -1784743029);
		}

		CacheableEntry_Sub23_Sub14.method2718(Class3.anInt42 * -468945023, 23, 765, 480, 0);
		CacheableEntry_Sub23_Sub14.method2719(Class3.anInt42 * -468945023, 0, 125, 23, 12425273, 9135624);
		CacheableEntry_Sub23_Sub14.method2719(Class3.anInt42 * -468945023 + 125, 0, 640, 23, 5197647, 2697513);
		var0.method3381(Class90.aString1319, Class3.anInt42 * -468945023 + 62, 15, 0, -1);
		if (Class38.aClass109_Sub23_Sub14_Sub1Array511 != null) {
			Class38.aClass109_Sub23_Sub14_Sub1Array511[1].method2972(140 + Class3.anInt42 * -468945023, 1);
			var1.method3316(Class90.aString1320, 152 + Class3.anInt42 * -468945023, 10, 16777215, -1);
			Class38.aClass109_Sub23_Sub14_Sub1Array511[0].method2972(Class3.anInt42 * -468945023 + 140, 12);
			var1.method3316(Class90.aString1321, Class3.anInt42 * -468945023 + 152, 21, 16777215, -1);
		}

		int var3;
		int var4;
		int var5;
		int var6;
		if (Class26.aClass109_Sub23_Sub14_Sub1Array329 != null) {
			var3 = Class3.anInt42 * -468945023 + 280;
			if (Class51.anIntArray702[0] == 0 && Class51.anIntArray705[0] == 0) {
				Class26.aClass109_Sub23_Sub14_Sub1Array329[2].method2972(var3, 4);
			} else {
				Class26.aClass109_Sub23_Sub14_Sub1Array329[0].method2972(var3, 4);
			}

			if (Class51.anIntArray702[0] == 0 && Class51.anIntArray705[0] == 1) {
				Class26.aClass109_Sub23_Sub14_Sub1Array329[3].method2972(var3 + 15, 4);
			} else {
				Class26.aClass109_Sub23_Sub14_Sub1Array329[1].method2972(var3 + 15, 4);
			}

			var0.method3316(Class90.aString1322, 32 + var3, 17, 16777215, -1);
			var4 = 390 + Class3.anInt42 * -468945023;
			if (Class51.anIntArray702[0] == 1 && Class51.anIntArray705[0] == 0) {
				Class26.aClass109_Sub23_Sub14_Sub1Array329[2].method2972(var4, 4);
			} else {
				Class26.aClass109_Sub23_Sub14_Sub1Array329[0].method2972(var4, 4);
			}

			if (Class51.anIntArray702[0] == 1 && Class51.anIntArray705[0] == 1) {
				Class26.aClass109_Sub23_Sub14_Sub1Array329[3].method2972(var4 + 15, 4);
			} else {
				Class26.aClass109_Sub23_Sub14_Sub1Array329[1].method2972(15 + var4, 4);
			}

			var0.method3316(Class90.aString1323, 32 + var4, 17, 16777215, -1);
			var5 = 500 + Class3.anInt42 * -468945023;
			if (Class51.anIntArray702[0] == 2 && Class51.anIntArray705[0] == 0) {
				Class26.aClass109_Sub23_Sub14_Sub1Array329[2].method2972(var5, 4);
			} else {
				Class26.aClass109_Sub23_Sub14_Sub1Array329[0].method2972(var5, 4);
			}

			if (Class51.anIntArray702[0] == 2 && Class51.anIntArray705[0] == 1) {
				Class26.aClass109_Sub23_Sub14_Sub1Array329[3].method2972(var5 + 15, 4);
			} else {
				Class26.aClass109_Sub23_Sub14_Sub1Array329[1].method2972(15 + var5, 4);
			}

			var0.method3316(Class90.aString1324, var5 + 32, 17, 16777215, -1);
			var6 = Class3.anInt42 * -468945023 + 610;
			if (Class51.anIntArray702[0] == 3 && Class51.anIntArray705[0] == 0) {
				Class26.aClass109_Sub23_Sub14_Sub1Array329[2].method2972(var6, 4);
			} else {
				Class26.aClass109_Sub23_Sub14_Sub1Array329[0].method2972(var6, 4);
			}

			if (Class51.anIntArray702[0] == 3 && Class51.anIntArray705[0] == 1) {
				Class26.aClass109_Sub23_Sub14_Sub1Array329[3].method2972(15 + var6, 4);
			} else {
				Class26.aClass109_Sub23_Sub14_Sub1Array329[1].method2972(var6 + 15, 4);
			}

			var0.method3316(Class90.aString1125, 32 + var6, 17, 16777215, -1);
		}

		CacheableEntry_Sub23_Sub14.method2718(Class3.anInt42 * -468945023 + 708, 4, 50, 16, 0);
		var1.method3381(Class90.aString1245, Class3.anInt42 * -468945023 + 708 + 25, 16, 16777215, -1);
		var3 = 0;
		var4 = 33554432;
		var5 = GameClient.anInt2860 * -456057453 & var4;

		for (var6 = 0; var6 < Class51.anInt711 * 1121294703; var6++) {
			Class51 var7 = Class4.aClass51Array80[var6];
			if (var5 == (var7.anInt704 * 438674181 & var4) || (var7.anInt704 * 438674181 & var4) == 0) {
				++var3;
			}
		}

		Class3.anInt70 = -806313189;
		if (Class108.aClass109_Sub23_Sub14_Sub2Array1511 != null) {
			byte var24 = 88;
			byte var25 = 19;
			int var8 = 765 / (var24 + 1);
			int var9 = 480 / (var25 + 1);

			int var10;
			int var11;
			do {
				var10 = var9;
				var11 = var8;
				if ((var8 - 1) * var9 >= var3) {
					--var8;
				}

				if ((var9 - 1) * var8 >= var3) {
					--var9;
				}

				if (var8 * (var9 - 1) >= var3) {
					--var9;
				}
			} while (var10 != var9 || var11 != var8);

			var10 = (765 - var8 * var24) / (1 + var8);
			if (var10 > 5) {
				var10 = 5;
			}

			var11 = (480 - var25 * var9) / (1 + var9);
			if (var11 > 5) {
				var11 = 5;
			}

			int var12 = (765 - var8 * var24 - var10 * (var8 - 1)) / 2;
			int var13 = (480 - var25 * var9 - (var9 - 1) * var11) / 2;
			int var14 = 23 + var13;
			int var15 = var12 + Class3.anInt42 * -468945023;
			int var16 = 0;
			boolean var17 = false;

			int var18;
			for (var18 = 0; var18 < Class51.anInt711 * 1121294703; var18++) {
				Class51 var19 = Class4.aClass51Array80[var18];
				if (var5 == (var19.anInt704 * 438674181 & var4) || (var19.anInt704 * 438674181 & var4) == 0) {
					boolean var20 = true;
					String var21 = Integer.toString(var19.anInt701 * 1599434219);
					if (var19.anInt701 * 1599434219 == -1) {
						var21 = Class90.aString1184;
						var20 = false;
					} else if (var19.anInt701 * 1599434219 > 1980) {
						var21 = Class90.aString1152;
						var20 = false;
					}

					byte var22;
					if (var19.method717(-1407370811)) {
						if (var19.method715((byte) 16)) {
							var22 = 3;
						} else {
							var22 = 2;
						}
					} else if (var19.method715((byte) 16)) {
						var22 = 1;
					} else {
						var22 = 0;
					}

					if (Class74.anInt897 * -1031552075 >= var15 && Class74.anInt898 * 1941423145 >= var14 && Class74.anInt897 * -1031552075 < var24 + var15 && Class74.anInt898 * 1941423145 < var14 + var25 && var20) {
						Class3.anInt70 = var18 * 806313189;
						Class108.aClass109_Sub23_Sub14_Sub2Array1511[var22].method3001(var15, var14, 128, 16777215);
						var17 = true;
					} else {
						Class108.aClass109_Sub23_Sub14_Sub2Array1511[var22].method2995(var15, var14);
					}

					if (Class3.aClass109_Sub23_Sub14_Sub1Array64 != null) {
						Class3.aClass109_Sub23_Sub14_Sub1Array64[(var19.method715((byte) 16) ? 8 : 0) + var19.anInt710 * -1139554955].method2972(29 + var15, var14);
					}

					var0.method3381(Integer.toString(var19.anInt703 * 1685233739), 15 + var15, 5 + var14 + var25 / 2, 0, -1);
					var1.method3381(var21, 60 + var15, var25 / 2 + var14 + 5, 268435455, -1);
					var14 += var25 + var11;
					++var16;
					if (var16 >= var9) {
						var14 = var13 + 23;
						var15 += var24 + var10;
						var16 = 0;
					}
				}
			}

			if (var17) {
				var18 = var1.method3311(Class4.aClass51Array80[Class3.anInt70 * 624623853].aString707) + 6;
				int var27 = var1.anInt2807 + 8;
				CacheableEntry_Sub23_Sub14.method2718(Class74.anInt897 * -1031552075 - var18 / 2, 5 + Class74.anInt898 * 1941423145 + 20, var18, var27, 16777120);
				CacheableEntry_Sub23_Sub14.method2720(Class74.anInt897 * -1031552075 - var18 / 2, 20 + Class74.anInt898 * 1941423145 + 5, var18, var27, 0);
				var1.method3381(Class4.aClass51Array80[Class3.anInt70 * 624623853].aString707, Class74.anInt897 * -1031552075, 4 + var1.anInt2807 + Class74.anInt898 * 1941423145 + 20 + 5, 0, -1);
			}
		}

		try {
			Graphics var26 = Class60.aCanvas771.getGraphics();
			Class72.aClass7_871.method160(var26, 0, 0, 1810226472);
		} catch (Exception var23) {
			Class60.aCanvas771.repaint();
		}

	}

	public static int method410(int var0, int var1) {
		return var0 <= 0 ? (var0 < 0 ? -1 : 0) : 1;
	}

	static final void method411(int var0) {
		while (true) {
			if (GameClient.gameBuffer.bitsReadable(GameClient.messageSize * 1964753529) >= 11) {
				int var2 = GameClient.gameBuffer.readbits(11);
				if (var2 != 2047) {
					boolean var3 = false;
					if (GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var2] == null) {
						GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var2] = new Player();
						if (GameClient.aDataBufferArray2988[var2] != null) {
							GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var2].method3396(GameClient.aDataBufferArray2988[var2], 1120224953);
						}

						var3 = true;
					}

					GameClient.anIntArray3107[(GameClient.anInt3091 -= 549466297) * -796710281 - 1] = var2;
					Player var1 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var2];
					var1.lastSync = GameClient.cycle * 489897939;
					int var5 = GameClient.gameBuffer.readbits(5);
					if (var5 > 15) {
						var5 -= 32;
					}

					int var4 = GameClient.gameBuffer.readbits(5);
					if (var4 > 15) {
						var4 -= 32;
					}

					int var6 = GameClient.anIntArray2996[GameClient.gameBuffer.readbits(3)];
					if (var3) {
						var1.spawnDirection = (var1.direction = var6 * 1352080005) * -601642305;
					}

					int var7 = GameClient.gameBuffer.readbits(1);
					int var8 = GameClient.gameBuffer.readbits(1);
					if (var8 == 1) {
						GameClient.npcIndicesNeedingUpdating[(GameClient.npcUpdatePointer -= 302765877) * -435618589 - 1] = var2;
					}

					var1.method2942(var4 + Player.me.stepQueueX[0], var5 + Player.me.stepQueueY[0], var7 == 1, (byte) 14);
					continue;
				}
			}

			GameClient.gameBuffer.endBitMode();
			return;
		}
	}

	public static CacheableEntry_Sub23_Sub14_Sub1 method412(int var0) {
		CacheableEntry_Sub23_Sub14_Sub1 var1 = new CacheableEntry_Sub23_Sub14_Sub1();
		var1.anInt2579 = Class18.anInt220 * 1155403717;
		var1.anInt2580 = Class18.anInt215 * 1186444245;
		var1.anInt2583 = Class18.anIntArray218[0];
		var1.anInt2584 = Class18.anIntArray219[0];
		var1.anInt2585 = Class58.anIntArray756[0];
		var1.anInt2582 = PacketDecoder.anIntArray341[0];
		var1.anIntArray2581 = CacheableEntry_Sub23_Sub10.anIntArray2316;
		var1.aByteArray2586 = Class42.aByteArrayArray603[0];
		CacheableEntry_Sub23_Sub10.method2474(-79860487);
		return var1;
	}

}
