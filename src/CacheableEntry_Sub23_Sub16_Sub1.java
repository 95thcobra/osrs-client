public final class CacheableEntry_Sub23_Sub16_Sub1 extends CacheableEntry_Sub23_Sub16 {

	public static final int anInt2488 = 107;
	static int[][][] anIntArrayArrayArray2497;
	static final int anInt2499 = 54;
	static final int anInt2500 = 1;
	static final int anInt2501 = 38;
	static IndexDescriptor_Sub1 aClass94_Sub1_2502;
	protected static int anInt2503;
	int anInt2495 = 0;
	int anInt2494 = 0;
	boolean aBool2496 = false;
	int anInt2490;
	int anInt2489;
	int anInt2493;
	int anInt2491;
	int anInt2492;
	int anInt2487;
	AnimationSequence aClass109_Sub23_Sub4_2498;

	static Integer method2935(DataBuffer var0, int var1) {
		int var2 = 0;
		boolean var3 = false;

		while (true) {
			int var4 = var0.readUByte();
			if (var4 == 255) {
				return var3 ? Integer.valueOf(var2) : null;
			}

			if (var4 != 0) {
				throw new IllegalStateException("");
			}

			while (true) {
				int var5 = var0.readUByte();
				if (var5 == 255) {
					break;
				}

				var0.pos -= 1303963473;
				if (var0.readUShort() != 0) {
					throw new IllegalStateException("");
				}

				if (var3) {
					throw new IllegalStateException("");
				}

				var2 = var0.readInt();
				var3 = true;
			}
		}
	}

	final void method2936(int var1, byte var2) {
		if (!aBool2496) {
			anInt2495 += var1 * -1637791935;

			while (anInt2495 * 1809795265 > aClass109_Sub23_Sub4_2498.anIntArray2183[anInt2494 * -540453505]) {
				anInt2495 -= aClass109_Sub23_Sub4_2498.anIntArray2183[anInt2494 * -540453505] * -1637791935;
				anInt2494 += 1850239615;
				if (anInt2494 * -540453505 >= aClass109_Sub23_Sub4_2498.anIntArray2169.length) {
					aBool2496 = true;
					break;
				}
			}

		}
	}

	protected final CacheableEntry_Sub23_Sub16_Sub5 method2791(int var1) {
		GfxDef var2 = Class42.getGfxDef(anInt2490 * 273203395);
		CacheableEntry_Sub23_Sub16_Sub5 var3;
		if (aBool2496) {
			var3 = var2.method2522(-1, 1720229742);
		} else {
			var3 = var2.method2522(anInt2494 * -540453505, 2136017111);
		}

		return var3 == null ? null : var3;
	}

	CacheableEntry_Sub23_Sub16_Sub1(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		anInt2490 = var1 * 900460523;
		anInt2489 = var2 * -1536923887;
		anInt2493 = var3 * 1448924049;
		anInt2491 = var4 * -1657580653;
		anInt2492 = var5 * -615285735;
		anInt2487 = (var6 + var7) * 1745880721;
		int var8 = Class42.getGfxDef(anInt2490 * 273203395).animId * 28936275;
		if (var8 != -1) {
			aBool2496 = false;
			aClass109_Sub23_Sub4_2498 = CacheableEntry_Sub23_Sub11.getAnimation(var8);
		} else {
			aBool2496 = true;
		}

	}

	static void method2938(int var0, int var1) {
		if (var0 == -1 && !GameClient.aBool2941) {
			Class100.method1259((byte) 1);
		} else if (var0 != -1 && GameClient.anInt3105 * -759346757 != var0 && GameClient.anInt2951 * -250760527 != 0 && !GameClient.aBool2941) {
			IndexDescriptor_Sub1 var3 = Class46.aClass94_Sub1_652;
			int var2 = GameClient.anInt2951 * -250760527;
			Class104.anInt1454 = -438370161;
			Class104.aIndexDescriptor_1457 = var3;
			Class104.anInt1459 = var0 * -534518349;
			Class104.anInt1458 = 0;
			Class104.anInt1450 = var2 * 1862121751;
			Class99.aBool1407 = false;
			Class29.anInt362 = 46493510;
		}

		GameClient.anInt3105 = var0 * -32697485;
	}

	static final void method2940(int var0, int var1, byte var2) {
		JagexLinkedList var3 = GameClient.aJagexLinkedListArrayArrayArray2998[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619][var0][var1];
		if (var3 == null) {
			LinkedEntry_Sub6.aClass39_1732.method522(CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var0, var1);
		} else {
			long var10 = -99999999L;
			CacheableEntry_Sub23_Sub16_Sub3 var6 = null;

			CacheableEntry_Sub23_Sub16_Sub3 var4;
			for (var4 = (CacheableEntry_Sub23_Sub16_Sub3) var3.method1405(); var4 != null; var4 = (CacheableEntry_Sub23_Sub16_Sub3) var3.method1402()) {
				ItemDef var5 = PacketDecoder.getItemDef(var4.anInt2570 * 1500342151);
				long var8 = (long) (var5.cost * -2063697793);
				if (var5.stackable * 833352093 == 1) {
					var8 *= (long) (1 + var4.anInt2569 * 640802101);
				}

				if (var8 > var10) {
					var10 = var8;
					var6 = var4;
				}
			}

			if (var6 == null) {
				LinkedEntry_Sub6.aClass39_1732.method522(CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var0, var1);
			} else {
				var3.method1396(var6);
				CacheableEntry_Sub23_Sub16_Sub3 var13 = null;
				CacheableEntry_Sub23_Sub16_Sub3 var7 = null;

				for (var4 = (CacheableEntry_Sub23_Sub16_Sub3) var3.method1405(); var4 != null; var4 = (CacheableEntry_Sub23_Sub16_Sub3) var3.method1402()) {
					if (var6.anInt2570 * 1500342151 != var4.anInt2570 * 1500342151) {
						if (var13 == null) {
							var13 = var4;
						}

						if (var4.anInt2570 * 1500342151 != var13.anInt2570 * 1500342151 && var7 == null) {
							var7 = var4;
						}
					}
				}

				int var12 = var0 + (var1 << 7) + 1610612736;
				LinkedEntry_Sub6.aClass39_1732.method508(CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var0, var1, NpcDef.method2423(64 + var0 * 128, var1 * 128 + 64, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, -1847964236), var6, var12, var13, var7);
			}
		}
	}

}
