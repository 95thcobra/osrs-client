public final class Player extends CacheableEntry_Sub23_Sub16_Sub2 {

	int anInt2819;
	int anInt2820;
	static Player me;
	int anInt2824;
	int anInt2825;
	static int anInt2827;
	int anInt2829;
	int anInt2830;
	int anInt2833;
	int anInt2834;
	static RenderedItemImage[] aClass109_Sub23_Sub14_Sub2Array2836;
	CacheableEntry_Sub23_Sub16_Sub5 aClass109_Sub23_Sub16_Sub5_2826;
	int anInt2816 = -534242947;
	int anInt2814 = -1625392379;
	int anInt2832 = 0;
	String aString2835;
	int anInt2818 = 0;
	int anInt2817 = 0;
	boolean aBool2822 = false;
	Class108 aClass108_2815;
	int anInt2821 = 0;
	int anInt2828 = 0;
	boolean aBool2831 = false;

	protected final CacheableEntry_Sub23_Sub16_Sub5 method2791(int var1) {
		if (aClass108_2815 == null) {
			return null;
		} else {
			AnimationSequence var5 = anInt2536 * 1287875615 != -1 && anInt2517 * -82959261 == 0 ? CacheableEntry_Sub23_Sub11.getAnimation(anInt2536 * 1287875615) : null;
			AnimationSequence var6 = anInt2556 * -1834510973 == -1 || aBool2831 || anInt2509 * -71832567 == anInt2556 * -1834510973 && var5 != null ? null : CacheableEntry_Sub23_Sub11.getAnimation(anInt2556 * -1834510973);
			CacheableEntry_Sub23_Sub16_Sub5 var3 = aClass108_2815.method1355(var5, anInt2537 * -1478048169, var6, anInt2534 * 1209298591, 1040516914);
			if (var3 == null) {
				return null;
			} else {
				var3.method3082();
				anInt2554 = var3.anInt2410 * -1471884917;
				CacheableEntry_Sub23_Sub16_Sub5[] var2;
				CacheableEntry_Sub23_Sub16_Sub5 var4;
				if (!aBool2831 && anInt2541 * -1444330405 != -1 && anInt2542 * -2034852903 != -1) {
					var4 = Class42.getGfxDef(anInt2541 * -1444330405).method2522(anInt2542 * -2034852903, 1366545085);
					if (var4 != null) {
						var4.method3100(0, -(anInt2545 * -678743773), 0);
						var2 = new CacheableEntry_Sub23_Sub16_Sub5[]{var3, var4};
						var3 = new CacheableEntry_Sub23_Sub16_Sub5(var2, 2);
					}
				}

				if (!aBool2831 && aClass109_Sub23_Sub16_Sub5_2826 != null) {
					if (GameClient.cycle * 1026470457 >= anInt2828 * -1632611687) {
						aClass109_Sub23_Sub16_Sub5_2826 = null;
					}

					if (GameClient.cycle * 1026470457 >= anInt2821 * -106872329 && GameClient.cycle * 1026470457 < anInt2828 * -1632611687) {
						var4 = aClass109_Sub23_Sub16_Sub5_2826;
						var4.method3100(anInt2833 * 125215445 - anInt2521 * -1051150961, anInt2824 * 1665622937 - anInt2820 * 901097003, anInt2834 * -1196626949 - anInt2505 * -844883935);
						if (spawnDirection * -1099823629 == 512) {
							var4.method3088();
							var4.method3088();
							var4.method3088();
						} else if (spawnDirection * -1099823629 == 1024) {
							var4.method3088();
							var4.method3088();
						} else if (spawnDirection * -1099823629 == 1536) {
							var4.method3088();
						}

						var2 = new CacheableEntry_Sub23_Sub16_Sub5[]{var3, var4};
						var3 = new CacheableEntry_Sub23_Sub16_Sub5(var2, 2);
						if (spawnDirection * -1099823629 == 512) {
							var4.method3088();
						} else if (spawnDirection * -1099823629 == 1024) {
							var4.method3088();
							var4.method3088();
						} else if (spawnDirection * -1099823629 == 1536) {
							var4.method3088();
							var4.method3088();
							var4.method3088();
						}

						var4.method3100(anInt2521 * -1051150961 - anInt2833 * 125215445, anInt2820 * 901097003 - anInt2824 * 1665622937, anInt2505 * -844883935 - anInt2834 * -1196626949);
					}
				}

				var3.aBool2648 = true;
				return var3;
			}
		}
	}

	final void method3396(DataBuffer buffer, int var2) {
		buffer.pos = 0;
		int var8 = buffer.readUByte();
		anInt2816 = buffer.readByte() * 534242947;
		anInt2814 = buffer.readByte() * 1625392379;
		int transmog = -1;
		anInt2832 = 0;
		int[] var7 = new int[12];

		int var4;
		int var6;
		for (int var5 = 0; var5 < 12; var5++) {
			var4 = buffer.readUByte();
			if (var4 == 0) {
				var7[var5] = 0;
			} else {
				var6 = buffer.readUByte();
				var7[var5] = (var4 << 8) + var6;
				if (var5 == 0 && var7[0] == 65535) {
					transmog = buffer.readUShort();
					break;
				}

				if (var7[var5] >= 512) {
					int var3 = PacketDecoder.getItemDef(var7[var5] - 512).anInt2157 * -986104365;
					if (var3 != 0) {
						anInt2832 = var3 * -65883381;
					}
				}
			}
		}

		int[] var10 = new int[5];

		for (var4 = 0; var4 < 5; var4++) {
			var6 = buffer.readUByte();
			if (var6 < 0 || var6 >= Class108.aShortArrayArray1506[var4].length) {
				var6 = 0;
			}

			var10[var4] = var6;
		}

		anInt2509 = buffer.readUShort() * -597073351;
		if (anInt2509 * -71832567 == 65535) {
			anInt2509 = 597073351;
		}

		anInt2510 = buffer.readUShort() * 204914649;
		if (anInt2510 * 522440809 == 65535) {
			anInt2510 = -204914649;
		}

		anInt2551 = anInt2510 * -1544866519;
		anInt2524 = buffer.readUShort() * 125633893;
		if (anInt2524 * -1173314451 == 65535) {
			anInt2524 = -125633893;
		}

		anInt2520 = buffer.readUShort() * 946961373;
		if (anInt2520 * -1106791307 == 65535) {
			anInt2520 = -946961373;
		}

		anInt2514 = buffer.readUShort() * 1823978411;
		if (anInt2514 * 991276803 == 65535) {
			anInt2514 = -1823978411;
		}

		anInt2564 = buffer.readUShort() * -4348545;
		if (anInt2564 * 132389503 == 65535) {
			anInt2564 = 4348545;
		}

		anInt2516 = buffer.readUShort() * 1732914689;
		if (anInt2516 * 16372225 == 65535) {
			anInt2516 = -1732914689;
		}

		aString2835 = buffer.readString();
		if (this == me) {
			RuntimeException_Sub1.aString2784 = aString2835;
		}

		anInt2818 = buffer.readUByte() * -522156165;
		anInt2817 = buffer.readUShort() * -161541663;
		aBool2822 = buffer.readUByte() == 1;
		if (GameClient.anInt2861 * -134799277 == 0 && GameClient.playerRights * -624018989 >= 2) {
			aBool2822 = false;
		}

		if (aClass108_2815 == null) {
			aClass108_2815 = new Class108();
		}

		aClass108_2815.method1345(var7, var10, var8 == 1, transmog, (byte) -29);
	}

	static final int method3397(int var0, int var1, byte var2) {
		int var3 = var1 * 57 + var0;
		var3 ^= var3 << 13;
		int var4 = (789221 + var3 * var3 * 15731) * var3 + 1376312589 & 2147483647;
		return var4 >> 19 & 255;
	}

	public static RenderedItemImage takeItemSnapshot(IndexDescriptor index, int pos, int var2, int var3) {
		return CacheableEntry_Sub23_Sub16_Sub2.method2962(index, pos, var2, 1934847557) ? ItemDef.renderItemSnapshot() : null;
	}

	public static int method3399(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var1 > 0; --var1) {
			var3 = var3 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var3;
	}

	final boolean method2945(int var1) {
		return aClass108_2815 != null;
	}

}
