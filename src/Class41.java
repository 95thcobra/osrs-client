public class Class41 {

	static int anInt585;
	String aString586;
	static final int anInt587 = 11;
	static Class48 aClass48_588;
	static final int anInt589 = 1;
	public static final int anInt590 = 66;
	public static final int anInt591 = 13;
	static final int anInt592 = 50;
	public static final int anInt593 = 11;
	public static char aChar594;
	public static final int anInt595 = 2;
	static InterfaceDef aInterfaceDef_596;
	String aString597;

	public static final RenderedItemImage method670(int var0, int var1, int var2, int var3, int var4, boolean var5, byte var6) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var12 = ((long) var2 << 38) + (long) var0 + ((long) var1 << 16) + ((long) var4 << 40) + ((long) var3 << 42);
		RenderedItemImage var14;
		if (!var5) {
			var14 = (RenderedItemImage) ItemDef.aClass128_2117.get(var12);
			if (var14 != null) {
				return var14;
			}
		}

		ItemDef var7 = PacketDecoder.getItemDef(var0);
		if (var1 > 1 && var7.countobj != null) {
			int var9 = -1;

			for (int var8 = 0; var8 < 10; var8++) {
				if (var1 >= var7.countco[var8] && var7.countco[var8] != 0) {
					var9 = var7.countobj[var8];
				}
			}

			if (var9 != -1) {
				var7 = PacketDecoder.getItemDef(var9);
			}
		}

		CacheableEntry_Sub23_Sub16_Sub5 var21 = var7.method2263(1, -1483066466);
		if (var21 == null) {
			return null;
		} else {
			RenderedItemImage var20 = null;
			if (var7.anInt2151 * -993125921 != -1) {
				var20 = method670(var7.anInt2120 * -1776131735, 10, 1, 0, 0, true, (byte) 68);
				if (var20 == null) {
					return null;
				}
			} else if (var7.anInt2150 * -1715175993 != -1) {
				var20 = method670(var7.anInt2159 * -210825537, var1, var2, var3, 0, false, (byte) 117);
				if (var20 == null) {
					return null;
				}
			}

			int[] var15 = CacheableEntry_Sub23_Sub14.anIntArray2396;
			int var16 = CacheableEntry_Sub23_Sub14.anInt2399;
			int var17 = CacheableEntry_Sub23_Sub14.anInt2398;
			int[] var18 = new int[4];
			CacheableEntry_Sub23_Sub14.method2715(var18);
			var14 = new RenderedItemImage(36, 32);
			CacheableEntry_Sub23_Sub14.method2710(var14.pixels, 36, 32);
			CacheableEntry_Sub23_Sub14.method2716();
			CacheableEntry_Sub23_Sub14_Sub3.method3148();
			CacheableEntry_Sub23_Sub14_Sub3.method3152(16, 16);
			CacheableEntry_Sub23_Sub14_Sub3.aBool2699 = false;
			int var19 = var7.zoom2d * 2131785043;
			if (var5) {
				var19 = (int) (1.5D * (double) var19);
			} else if (var2 == 2) {
				var19 = (int) (1.04D * (double) var19);
			}

			int var10 = var19 * CacheableEntry_Sub23_Sub14_Sub3.anIntArray2719[var7.xan2d * -1802976207] >> 16;
			int var11 = var19 * CacheableEntry_Sub23_Sub14_Sub3.anIntArray2720[var7.xan2d * -1802976207] >> 16;
			var21.method3082();
			var21.method3094(0, var7.yan2d * 877439171, var7.anInt2114 * -774449821, var7.xan2d * -1802976207, var7.xof2d * 889627073, var7.yof2d * -722274453 + var10 + var21.anInt2410 * -695779227 / 2, var11 + var7.yof2d * -722274453);
			if (var7.anInt2150 * -1715175993 != -1) {
				var20.method2997(0, 0);
			}

			if (var2 >= 1) {
				var14.method3061(1);
			}

			if (var2 >= 2) {
				var14.method3061(16777215);
			}

			if (var3 != 0) {
				var14.method2994(var3);
			}

			CacheableEntry_Sub23_Sub14.method2710(var14.pixels, 36, 32);
			if (var7.anInt2151 * -993125921 != -1) {
				var20.method2997(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var7.stackable * 833352093 == 1) {
				LinkedEntry_Sub20.aClass109_Sub23_Sub14_Sub4_Sub1_2075.method3316(Class35.method477(var1, -993987395), 0, 9, 16776960, 1);
			}

			if (!var5) {
				ItemDef.aClass128_2117.put(var14, var12);
			}

			CacheableEntry_Sub23_Sub14.method2710(var15, var16, var17);
			CacheableEntry_Sub23_Sub14.method2709(var18);
			CacheableEntry_Sub23_Sub14_Sub3.method3148();
			CacheableEntry_Sub23_Sub14_Sub3.aBool2699 = true;
			return var14;
		}
	}

	static LinkedEntry_Sub16 method671(IndexDescriptor var0, int var1, int var2) {
		byte[] var3 = var0.method1184(var1, -1197108614);
		return var3 == null ? null : new LinkedEntry_Sub16(var3);
	}

	static final void method672(CacheableEntry_Sub23_Sub16_Sub2 var0, int var1, int var2) {
		if (var0.anInt2540 * 1613108255 > GameClient.cycle * 1026470457) {
			Class49.method707(var0, -435303136);
		} else if (var0.anInt2539 * 468464431 >= GameClient.cycle * 1026470457) {
			Class123.method1533(var0, (short) -27504);
		} else {
			var0.anInt2556 = var0.anInt2509 * 705547907;
			if (var0.anInt2558 * -1429276161 == 0) {
				var0.anInt2562 = 0;
			} else {
				label263:
				{
					if (var0.anInt2536 * 1287875615 != -1 && var0.anInt2517 * -82959261 == 0) {
						AnimationSequence var5 = CacheableEntry_Sub23_Sub11.getAnimation(var0.anInt2536 * 1287875615);
						if (var0.anInt2563 * -2051913933 > 0 && var5.anInt2180 * -1239714469 == 0) {
							var0.anInt2562 -= 1597115245;
							break label263;
						}

						if (var0.anInt2563 * -2051913933 <= 0 && var5.anInt2173 * 1962873195 == 0) {
							var0.anInt2562 -= 1597115245;
							break label263;
						}
					}

					int var11 = var0.anInt2521 * -1051150961;
					int var3 = var0.anInt2505 * -844883935;
					int var7 = var0.stepQueueX[var0.anInt2558 * -1429276161 - 1] * 128 + var0.anInt2508 * -1408204480;
					int var4 = var0.stepQueueY[var0.anInt2558 * -1429276161 - 1] * 128 + var0.anInt2508 * -1408204480;
					if (var7 - var11 <= 256 && var7 - var11 >= -256 && var4 - var3 <= 256 && var4 - var3 >= -256) {
						if (var11 < var7) {
							if (var3 < var4) {
								var0.spawnDirection = -1467472128;
							} else if (var3 > var4) {
								var0.spawnDirection = -1195467520;
							} else {
								var0.spawnDirection = 816013824;
							}
						} else if (var11 > var7) {
							if (var3 < var4) {
								var0.spawnDirection = -1739476736;
							} else if (var3 > var4) {
								var0.spawnDirection = -2011481344;
							} else {
								var0.spawnDirection = 272004608;
							}
						} else if (var3 < var4) {
							var0.spawnDirection = 544009216;
						} else if (var3 > var4) {
							var0.spawnDirection = 0;
						}

						int var10 = var0.spawnDirection * -1099823629 - var0.direction * 1933495885 & 2047;
						if (var10 > 1024) {
							var10 -= 2048;
						}

						int var9 = var0.anInt2520 * -1106791307;
						if (var10 >= -256 && var10 <= 256) {
							var9 = var0.anInt2524 * -1173314451;
						} else if (var10 >= 256 && var10 < 768) {
							var9 = var0.anInt2564 * 132389503;
						} else if (var10 >= -768 && var10 <= -256) {
							var9 = var0.anInt2514 * 991276803;
						}

						if (var9 == -1) {
							var9 = var0.anInt2524 * -1173314451;
						}

						var0.anInt2556 = var9 * -304340693;
						int var8 = 4;
						boolean var6 = true;
						if (var0 instanceof Npc) {
							var6 = ((Npc) var0).definition.aBool2227;
						}

						if (var6) {
							if (var0.spawnDirection * -1099823629 != var0.direction * 1933495885 && var0.facedEntity * 1253370921 == -1 && var0.anInt2557 * -1936020065 != 0) {
								var8 = 2;
							}

							if (var0.anInt2558 * -1429276161 > 2) {
								var8 = 6;
							}

							if (var0.anInt2558 * -1429276161 > 3) {
								var8 = 8;
							}

							if (var0.anInt2562 * -1785378405 > 0 && var0.anInt2558 * -1429276161 > 1) {
								var8 = 8;
								var0.anInt2562 += 1597115245;
							}
						} else {
							if (var0.anInt2558 * -1429276161 > 1) {
								var8 = 6;
							}

							if (var0.anInt2558 * -1429276161 > 2) {
								var8 = 8;
							}

							if (var0.anInt2562 * -1785378405 > 0 && var0.anInt2558 * -1429276161 > 1) {
								var8 = 8;
								var0.anInt2562 += 1597115245;
							}
						}

						if (var0.queueRunFlag[var0.anInt2558 * -1429276161 - 1]) {
							var8 <<= 1;
						}

						if (var8 >= 8 && var0.anInt2556 * -1834510973 == var0.anInt2524 * -1173314451 && var0.anInt2516 * 16372225 != -1) {
							var0.anInt2556 = var0.anInt2516 * -1008441557;
						}

						if (var11 < var7) {
							var0.anInt2521 += var8 * 373606767;
							if (var0.anInt2521 * -1051150961 > var7) {
								var0.anInt2521 = var7 * 373606767;
							}
						} else if (var11 > var7) {
							var0.anInt2521 -= var8 * 373606767;
							if (var0.anInt2521 * -1051150961 < var7) {
								var0.anInt2521 = var7 * 373606767;
							}
						}

						if (var3 < var4) {
							var0.anInt2505 += var8 * -1030657055;
							if (var0.anInt2505 * -844883935 > var4) {
								var0.anInt2505 = var4 * -1030657055;
							}
						} else if (var3 > var4) {
							var0.anInt2505 -= var8 * -1030657055;
							if (var0.anInt2505 * -844883935 < var4) {
								var0.anInt2505 = var4 * -1030657055;
							}
						}

						if (var0.anInt2521 * -1051150961 == var7 && var0.anInt2505 * -844883935 == var4) {
							var0.anInt2558 += 519240193;
							if (var0.anInt2563 * -2051913933 > 0) {
								var0.anInt2563 -= 1984367611;
							}
						}
					} else {
						var0.anInt2521 = var7 * 373606767;
						var0.anInt2505 = var4 * -1030657055;
					}
				}
			}
		}

		if (var0.anInt2521 * -1051150961 < 128 || var0.anInt2505 * -844883935 < 128 || var0.anInt2521 * -1051150961 >= 13184 || var0.anInt2505 * -844883935 >= 13184) {
			var0.anInt2536 = -1940983775;
			var0.anInt2541 = -1325550547;
			var0.anInt2540 = 0;
			var0.anInt2539 = 0;
			var0.anInt2521 = var0.stepQueueX[0] * 577025920 + var0.anInt2508 * 1705200320;
			var0.anInt2505 = var0.anInt2508 * -708355776 + var0.stepQueueY[0] * 1219883136;
			var0.method2963(1445112704);
		}

		if (var0 == Player.me && (var0.anInt2521 * -1051150961 < 1536 || var0.anInt2505 * -844883935 < 1536 || var0.anInt2521 * -1051150961 >= 11776 || var0.anInt2505 * -844883935 >= 11776)) {
			var0.anInt2536 = -1940983775;
			var0.anInt2541 = -1325550547;
			var0.anInt2540 = 0;
			var0.anInt2539 = 0;
			var0.anInt2521 = var0.stepQueueX[0] * 577025920 + var0.anInt2508 * 1705200320;
			var0.anInt2505 = var0.stepQueueY[0] * 1219883136 + var0.anInt2508 * -708355776;
			var0.method2963(1280360252);
		}

		Class2.method99(var0);
		Class101.method1266(var0, -1414516204);
	}

}
