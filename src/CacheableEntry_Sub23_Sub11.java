import java.util.Date;

public class CacheableEntry_Sub23_Sub11 extends CacheableEntry {

	public static IndexDescriptor aIndexDescriptor_2331;
	public static final int anInt2333 = 57;
	static final int anInt2334 = 86;
	static int anInt2336;
	static RenderedItemImage[] aClass109_Sub23_Sub14_Sub2Array2338;
	static final int anInt2339 = 18;
	public int anInt2330;
	public int anInt2323;
	public int anInt2335;
	public static Class128 aClass128_2324 = new Class128(64);
	public int anInt2325 = 0;
	public int anInt2326 = 564096023;
	public boolean aBool2327 = true;
	public int anInt2328 = -411774367;
	public int anInt2332;
	public int anInt2329;
	public int anInt2337;

	static void method2489(int var0, int var1, int var2, int id, int var4, int var5, Class39 var6, Class141 var7) {
		if (GameClient.aBool2864 && (Class32.mapSettings[0][var1][var2] & 2) == 0) {
			if ((Class32.mapSettings[var0][var1][var2] & 16) != 0) {
				return;
			}

			if (Class1.method46(var0, var1, var2, 2118134242) != GameClient.anInt2917 * 1286856103) {
				return;
			}
		}

		if (var0 < Class32.anInt392 * 2066106645) {
			Class32.anInt392 = var0 * -1445478851;
		}

		ObjectDef var9 = Class56.getObjectDef(id);
		int var17;
		int var18;
		if (var4 != 1 && var4 != 3) {
			var18 = var9.anInt2277 * 1832905927;
			var17 = var9.anInt2274 * 1221908201;
		} else {
			var18 = var9.anInt2274 * 1221908201;
			var17 = var9.anInt2277 * 1832905927;
		}

		int var19;
		int var22;
		if (var18 + var1 <= 104) {
			var19 = var1 + (var18 >> 1);
			var22 = (var18 + 1 >> 1) + var1;
		} else {
			var19 = var1;
			var22 = var1 + 1;
		}

		int var16;
		int var20;
		if (var2 + var17 <= 104) {
			var16 = (var17 >> 1) + var2;
			var20 = var2 + (1 + var17 >> 1);
		} else {
			var16 = var2;
			var20 = 1 + var2;
		}

		int[][] var21 = Class32.mapSquareHeights[var0];
		int var12 = var21[var22][var20] + var21[var22][var16] + var21[var19][var16] + var21[var19][var20] >> 2;
		int var23 = (var1 << 7) + (var18 << 6);
		int var24 = (var17 << 6) + (var2 << 7);
		int var14 = 1073741824 + (var2 << 7) + var1 + (id << 14);
		if (var9.anInt2292 * -1087968583 == 0) {
			var14 += -2147483648;
		}

		int var15 = var5 + (var4 << 6);
		if (var9.anInt2298 * 1493581111 == 1) {
			var15 += 256;
		}

		if (var9.method2429((byte) 3)) {
			PacketDecoder.method390(var0, var1, var2, var9, var4, -206976648);
		}

		Object var13;
		if (var5 == 22) {
			if (!GameClient.aBool2864 || var9.anInt2292 * -1087968583 != 0 || var9.anInt2275 * 445231797 == 1 || var9.aBool2264) {
				if (var9.anInt2281 * 181561261 == -1 && var9.anIntArray2299 == null) {
					var13 = var9.method2444(22, var4, var21, var23, var12, var24, 2053790860);
				} else {
					var13 = new CacheableEntry_Sub23_Sub16_Sub7(id, 22, var4, var0, var1, var2, var9.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
				}

				var6.method523(var0, var1, var2, var12, (CacheableEntry_Sub23_Sub16) var13, var14, var15);
				if (var9.anInt2275 * 445231797 == 1 && var7 != null) {
					var7.method1699(var1, var2, 268736529);
				}

			}
		} else {
			int var11;
			if (var5 != 10 && var5 != 11) {
				if (var5 >= 12) {
					if (var9.anInt2281 * 181561261 == -1 && var9.anIntArray2299 == null) {
						var13 = var9.method2444(var5, var4, var21, var23, var12, var24, 917059467);
					} else {
						var13 = new CacheableEntry_Sub23_Sub16_Sub7(id, var5, var4, var0, var1, var2, var9.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
					}

					var6.method597(var0, var1, var2, var12, 1, 1, (CacheableEntry_Sub23_Sub16) var13, 0, var14, var15);
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
						CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var0][var1][var2] |= 2340;
					}

					if (var9.anInt2275 * 445231797 != 0 && var7 != null) {
						var7.method1694(var1, var2, var18, var17, var9.aBool2276, -811648827);
					}

				} else if (var5 == 0) {
					if (var9.anInt2281 * 181561261 == -1 && var9.anIntArray2299 == null) {
						var13 = var9.method2444(0, var4, var21, var23, var12, var24, 1995636436);
					} else {
						var13 = new CacheableEntry_Sub23_Sub16_Sub7(id, 0, var4, var0, var1, var2, var9.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
					}

					var6.method509(var0, var1, var2, var12, (CacheableEntry_Sub23_Sub16) var13, (CacheableEntry_Sub23_Sub16) null, Class32.anIntArray401[var4], 0, var14, var15);
					if (var4 == 0) {
						if (var9.aBool2284) {
							Class32.aByteArrayArrayArray395[var0][var1][var2] = 50;
							Class32.aByteArrayArrayArray395[var0][var1][1 + var2] = 50;
						}

						if (var9.aBool2280) {
							CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var0][var1][var2] |= 585;
						}
					} else if (var4 == 1) {
						if (var9.aBool2284) {
							Class32.aByteArrayArrayArray395[var0][var1][var2 + 1] = 50;
							Class32.aByteArrayArrayArray395[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var9.aBool2280) {
							CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var0][var1][var2 + 1] |= 1170;
						}
					} else if (var4 == 2) {
						if (var9.aBool2284) {
							Class32.aByteArrayArrayArray395[var0][var1 + 1][var2] = 50;
							Class32.aByteArrayArrayArray395[var0][1 + var1][var2 + 1] = 50;
						}

						if (var9.aBool2280) {
							CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var0][var1 + 1][var2] |= 585;
						}
					} else if (var4 == 3) {
						if (var9.aBool2284) {
							Class32.aByteArrayArrayArray395[var0][var1][var2] = 50;
							Class32.aByteArrayArrayArray395[var0][1 + var1][var2] = 50;
						}

						if (var9.aBool2280) {
							CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var0][var1][var2] |= 1170;
						}
					}

					if (var9.anInt2275 * 445231797 != 0 && var7 != null) {
						var7.method1696(var1, var2, var5, var4, var9.aBool2276, -44953324);
					}

					if (var9.anInt2291 * 1661784949 != 16) {
						var6.method517(var0, var1, var2, var9.anInt2291 * 1661784949);
					}

				} else if (var5 == 1) {
					if (var9.anInt2281 * 181561261 == -1 && var9.anIntArray2299 == null) {
						var13 = var9.method2444(1, var4, var21, var23, var12, var24, 2144708541);
					} else {
						var13 = new CacheableEntry_Sub23_Sub16_Sub7(id, 1, var4, var0, var1, var2, var9.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
					}

					var6.method509(var0, var1, var2, var12, (CacheableEntry_Sub23_Sub16) var13, (CacheableEntry_Sub23_Sub16) null, Class32.anIntArray409[var4], 0, var14, var15);
					if (var9.aBool2284) {
						if (var4 == 0) {
							Class32.aByteArrayArrayArray395[var0][var1][1 + var2] = 50;
						} else if (var4 == 1) {
							Class32.aByteArrayArrayArray395[var0][1 + var1][1 + var2] = 50;
						} else if (var4 == 2) {
							Class32.aByteArrayArrayArray395[var0][1 + var1][var2] = 50;
						} else if (var4 == 3) {
							Class32.aByteArrayArrayArray395[var0][var1][var2] = 50;
						}
					}

					if (var9.anInt2275 * 445231797 != 0 && var7 != null) {
						var7.method1696(var1, var2, var5, var4, var9.aBool2276, -998297127);
					}

				} else {
					Object var27;
					int var29;
					if (var5 == 2) {
						var29 = 1 + var4 & 3;
						Object var28;
						if (var9.anInt2281 * 181561261 == -1 && var9.anIntArray2299 == null) {
							var28 = var9.method2444(2, 4 + var4, var21, var23, var12, var24, 1645110031);
							var27 = var9.method2444(2, var29, var21, var23, var12, var24, 1636195738);
						} else {
							var28 = new CacheableEntry_Sub23_Sub16_Sub7(id, 2, 4 + var4, var0, var1, var2, var9.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
							var27 = new CacheableEntry_Sub23_Sub16_Sub7(id, 2, var29, var0, var1, var2, var9.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
						}

						var6.method509(var0, var1, var2, var12, (CacheableEntry_Sub23_Sub16) var28, (CacheableEntry_Sub23_Sub16) var27, Class32.anIntArray401[var4], Class32.anIntArray401[var29], var14, var15);
						if (var9.aBool2280) {
							if (var4 == 0) {
								CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var0][var1][var2] |= 585;
								CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var0][var1][var2 + 1] |= 1170;
							} else if (var4 == 1) {
								CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var0][var1][1 + var2] |= 1170;
								CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var0][1 + var1][var2] |= 585;
							} else if (var4 == 2) {
								CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var0][1 + var1][var2] |= 585;
								CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var0][var1][var2] |= 1170;
							} else if (var4 == 3) {
								CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var0][var1][var2] |= 1170;
								CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var0][var1][var2] |= 585;
							}
						}

						if (var9.anInt2275 * 445231797 != 0 && var7 != null) {
							var7.method1696(var1, var2, var5, var4, var9.aBool2276, -1896507846);
						}

						if (var9.anInt2291 * 1661784949 != 16) {
							var6.method517(var0, var1, var2, var9.anInt2291 * 1661784949);
						}

					} else if (var5 == 3) {
						if (var9.anInt2281 * 181561261 == -1 && var9.anIntArray2299 == null) {
							var13 = var9.method2444(3, var4, var21, var23, var12, var24, 2036625276);
						} else {
							var13 = new CacheableEntry_Sub23_Sub16_Sub7(id, 3, var4, var0, var1, var2, var9.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
						}

						var6.method509(var0, var1, var2, var12, (CacheableEntry_Sub23_Sub16) var13, (CacheableEntry_Sub23_Sub16) null, Class32.anIntArray409[var4], 0, var14, var15);
						if (var9.aBool2284) {
							if (var4 == 0) {
								Class32.aByteArrayArrayArray395[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								Class32.aByteArrayArrayArray395[var0][1 + var1][1 + var2] = 50;
							} else if (var4 == 2) {
								Class32.aByteArrayArrayArray395[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								Class32.aByteArrayArrayArray395[var0][var1][var2] = 50;
							}
						}

						if (var9.anInt2275 * 445231797 != 0 && var7 != null) {
							var7.method1696(var1, var2, var5, var4, var9.aBool2276, -297680746);
						}

					} else if (var5 == 9) {
						if (var9.anInt2281 * 181561261 == -1 && var9.anIntArray2299 == null) {
							var13 = var9.method2444(var5, var4, var21, var23, var12, var24, 1347450502);
						} else {
							var13 = new CacheableEntry_Sub23_Sub16_Sub7(id, var5, var4, var0, var1, var2, var9.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
						}

						var6.method597(var0, var1, var2, var12, 1, 1, (CacheableEntry_Sub23_Sub16) var13, 0, var14, var15);
						if (var9.anInt2275 * 445231797 != 0 && var7 != null) {
							var7.method1694(var1, var2, var18, var17, var9.aBool2276, 1144191199);
						}

						if (var9.anInt2291 * 1661784949 != 16) {
							var6.method517(var0, var1, var2, var9.anInt2291 * 1661784949);
						}

					} else if (var5 == 4) {
						if (var9.anInt2281 * 181561261 == -1 && var9.anIntArray2299 == null) {
							var13 = var9.method2444(4, var4, var21, var23, var12, var24, 1572777473);
						} else {
							var13 = new CacheableEntry_Sub23_Sub16_Sub7(id, 4, var4, var0, var1, var2, var9.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
						}

						var6.method510(var0, var1, var2, var12, (CacheableEntry_Sub23_Sub16) var13, (CacheableEntry_Sub23_Sub16) null, Class32.anIntArray401[var4], 0, 0, 0, var14, var15);
					} else if (var5 == 5) {
						var29 = 16;
						var11 = var6.method646(var0, var1, var2);
						if (var11 != 0) {
							var29 = Class56.getObjectDef(var11 >> 14 & 32767).anInt2291 * 1661784949;
						}

						if (var9.anInt2281 * 181561261 == -1 && var9.anIntArray2299 == null) {
							var27 = var9.method2444(4, var4, var21, var23, var12, var24, 507368404);
						} else {
							var27 = new CacheableEntry_Sub23_Sub16_Sub7(id, 4, var4, var0, var1, var2, var9.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
						}

						var6.method510(var0, var1, var2, var12, (CacheableEntry_Sub23_Sub16) var27, (CacheableEntry_Sub23_Sub16) null, Class32.anIntArray401[var4], 0, var29 * Class32.anIntArray393[var4], var29 * Class32.anIntArray404[var4], var14, var15);
					} else if (var5 == 6) {
						var29 = 8;
						var11 = var6.method646(var0, var1, var2);
						if (var11 != 0) {
							var29 = Class56.getObjectDef(var11 >> 14 & 32767).anInt2291 * 1661784949 / 2;
						}

						if (var9.anInt2281 * 181561261 == -1 && var9.anIntArray2299 == null) {
							var27 = var9.method2444(4, 4 + var4, var21, var23, var12, var24, 1588364867);
						} else {
							var27 = new CacheableEntry_Sub23_Sub16_Sub7(id, 4, 4 + var4, var0, var1, var2, var9.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
						}

						var6.method510(var0, var1, var2, var12, (CacheableEntry_Sub23_Sub16) var27, (CacheableEntry_Sub23_Sub16) null, 256, var4, Class32.anIntArray405[var4] * var29, Class32.anIntArray406[var4] * var29, var14, var15);
					} else if (var5 == 7) {
						var11 = var4 + 2 & 3;
						if (var9.anInt2281 * 181561261 == -1 && var9.anIntArray2299 == null) {
							var13 = var9.method2444(4, var11 + 4, var21, var23, var12, var24, 2145027723);
						} else {
							var13 = new CacheableEntry_Sub23_Sub16_Sub7(id, 4, var11 + 4, var0, var1, var2, var9.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
						}

						var6.method510(var0, var1, var2, var12, (CacheableEntry_Sub23_Sub16) var13, (CacheableEntry_Sub23_Sub16) null, 256, var11, 0, 0, var14, var15);
					} else if (var5 == 8) {
						var29 = 8;
						var11 = var6.method646(var0, var1, var2);
						if (var11 != 0) {
							var29 = Class56.getObjectDef(var11 >> 14 & 32767).anInt2291 * 1661784949 / 2;
						}

						int var25 = var4 + 2 & 3;
						Object var30;
						if (var9.anInt2281 * 181561261 == -1 && var9.anIntArray2299 == null) {
							var27 = var9.method2444(4, var4 + 4, var21, var23, var12, var24, 1130444215);
							var30 = var9.method2444(4, var25 + 4, var21, var23, var12, var24, 1190994787);
						} else {
							var27 = new CacheableEntry_Sub23_Sub16_Sub7(id, 4, 4 + var4, var0, var1, var2, var9.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
							var30 = new CacheableEntry_Sub23_Sub16_Sub7(id, 4, var25 + 4, var0, var1, var2, var9.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
						}

						var6.method510(var0, var1, var2, var12, (CacheableEntry_Sub23_Sub16) var27, (CacheableEntry_Sub23_Sub16) var30, 256, var4, Class32.anIntArray405[var4] * var29, var29 * Class32.anIntArray406[var4], var14, var15);
					}
				}
			} else {
				if (var9.anInt2281 * 181561261 == -1 && var9.anIntArray2299 == null) {
					var13 = var9.method2444(10, var4, var21, var23, var12, var24, 1468923263);
				} else {
					var13 = new CacheableEntry_Sub23_Sub16_Sub7(id, 10, var4, var0, var1, var2, var9.anInt2281 * 181561261, true, (CacheableEntry_Sub23_Sub16) null);
				}

				if (var13 != null && var6.method597(var0, var1, var2, var12, var18, var17, (CacheableEntry_Sub23_Sub16) var13, var5 == 11 ? 256 : 0, var14, var15) && var9.aBool2284) {
					var11 = 15;
					if (var13 instanceof CacheableEntry_Sub23_Sub16_Sub5) {
						var11 = ((CacheableEntry_Sub23_Sub16_Sub5) var13).method3084() / 4;
						if (var11 > 30) {
							var11 = 30;
						}
					}

					for (int var10 = 0; var10 <= var18; var10++) {
						for (int var26 = 0; var26 <= var17; var26++) {
							if (var11 > Class32.aByteArrayArrayArray395[var0][var10 + var1][var2 + var26]) {
								Class32.aByteArrayArrayArray395[var0][var10 + var1][var2 + var26] = (byte) var11;
							}
						}
					}
				}

				if (var9.anInt2275 * 445231797 != 0 && var7 != null) {
					var7.method1694(var1, var2, var18, var17, var9.aBool2276, -1066605189);
				}

			}
		}
	}

	public void method2490(DataBuffer var1, int var2, int var3) {
		while (true) {
			int var4 = var1.readUByte();
			if (var4 == 0) {
				return;
			}

			method2508(var1, var4, var2, (short) -1841);
		}
	}

	void method2491(int var1, byte var2) {
		double var3 = (double) (var1 >> 16 & 255) / 256.0D;
		double var9 = (double) (var1 >> 8 & 255) / 256.0D;
		double var5 = (double) (var1 & 255) / 256.0D;
		double var7 = var3;
		if (var9 < var3) {
			var7 = var9;
		}

		if (var5 < var7) {
			var7 = var5;
		}

		double var11 = var3;
		if (var9 > var3) {
			var11 = var9;
		}

		if (var5 > var11) {
			var11 = var5;
		}

		double var17 = 0.0D;
		double var15 = 0.0D;
		double var13 = (var7 + var11) / 2.0D;
		if (var7 != var11) {
			if (var13 < 0.5D) {
				var15 = (var11 - var7) / (var11 + var7);
			}

			if (var13 >= 0.5D) {
				var15 = (var11 - var7) / (2.0D - var11 - var7);
			}

			if (var11 == var3) {
				var17 = (var9 - var5) / (var11 - var7);
			} else if (var11 == var9) {
				var17 = (var5 - var3) / (var11 - var7) + 2.0D;
			} else if (var11 == var5) {
				var17 = 4.0D + (var3 - var9) / (var11 - var7);
			}
		}

		var17 /= 6.0D;
		anInt2330 = (int) (256.0D * var17) * 1149821763;
		anInt2323 = (int) (var15 * 256.0D) * -1869113727;
		anInt2335 = (int) (var13 * 256.0D) * -1901275357;
		if (anInt2323 * 1145219457 < 0) {
			anInt2323 = 0;
		} else if (anInt2323 * 1145219457 > 255) {
			anInt2323 = 117369471;
		}

		if (anInt2335 * -1337519989 < 0) {
			anInt2335 = 0;
		} else if (anInt2335 * -1337519989 > 255) {
			anInt2335 = 506088413;
		}

	}

	public static String method2497(long var0) {
		Class24.aCalendar316.setTime(new Date(var0));
		int var2 = Class24.aCalendar316.get(7);
		int var3 = Class24.aCalendar316.get(5);
		int var4 = Class24.aCalendar316.get(2);
		int var5 = Class24.aCalendar316.get(1);
		int var6 = Class24.aCalendar316.get(11);
		int var7 = Class24.aCalendar316.get(12);
		int var8 = Class24.aCalendar316.get(13);
		return Class24.aStringArray315[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Class24.aStringArrayArray314[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
	}

	public void method2504(int var1) {
		if (anInt2328 * -978801057 != -1) {
			method2491(anInt2328 * -978801057, (byte) 100);
			anInt2332 = anInt2330 * 1008037405;
			anInt2329 = anInt2323 * 80170949;
			anInt2337 = anInt2335 * -951588533;
		}

		method2491(anInt2325 * -1819361419, (byte) 61);
	}

	void method2508(DataBuffer var1, int var2, int var3, short var4) {
		if (var2 == 1) {
			anInt2325 = var1.readTriByte() * 504551645;
		} else if (var2 == 2) {
			anInt2326 = var1.readUByte() * -564096023;
		} else if (var2 == 5) {
			aBool2327 = false;
		} else if (var2 == 7) {
			anInt2328 = var1.readTriByte() * 411774367;
		} else if (var2 == 8) {
			;
		}

	}

	public static AnimationSequence getAnimation(int id) {
		AnimationSequence seq = (AnimationSequence) AnimationSequence.aClass128_2167.get((long) id);
		if (seq == null) {
			byte[] var3 = AnimationSequence.aIndexDescriptor_2171.getFileData(12, id);
			seq = new AnimationSequence();
			if (var3 != null) {
				seq.method2307(new DataBuffer(var3), (byte) -20);
			}

			seq.method2309(-1874858378);
			AnimationSequence.aClass128_2167.put(seq, (long) id);
			return seq;
		} else {
			return seq;
		}
	}

	static final int method2510(int var0, int var1, int var2) {
		int var4 = var0 / var2;
		int var7 = var0 & var2 - 1;
		int var9 = var1 / var2;
		int var10 = var1 & var2 - 1;
		int var5 = Class106.method1342(var4, var9, -740409705);
		int var6 = Class106.method1342(var4 + 1, var9, 1284129754);
		int var12 = Class106.method1342(var4, var9 + 1, 929819880);
		int var11 = Class106.method1342(1 + var4, 1 + var9, -1804521273);
		int var8 = Class28.method393(var5, var6, var7, var2, -1085912552);
		int var13 = Class28.method393(var12, var11, var7, var2, 1526004661);
		return Class28.method393(var8, var13, var10, var2, -117542228);
	}

}
