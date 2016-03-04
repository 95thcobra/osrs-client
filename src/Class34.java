public final class Class34 {

	int anInt433;
	int anInt439;
	int anInt441;
	int anInt442;
	int anInt443;
	byte aByte444;
	int anInt445;
	int anInt446;
	int anInt447;
	int anInt449;
	byte[] aByteArray450;
	int anInt451;
	int anInt452;
	int anInt455;
	int anInt460;
	byte[] aByteArray468;
	public static final int anInt469 = 220;
	int anInt448 = 4096;
	int anInt432 = 16;
	int anInt434 = 258;
	int anInt458 = 6;
	int anInt435 = 50;
	int anInt436 = 18002;
	int anInt453 = 0;
	int anInt466 = 0;
	int[] anIntArray457 = new int[256];
	int[] anIntArray454 = new int[257];
	boolean[] aBoolArray456 = new boolean[256];
	boolean[] aBoolArray438 = new boolean[16];
	byte[] aByteArray440 = new byte[256];
	byte[] aByteArray459 = new byte[4096];
	int[] anIntArray437 = new int[16];
	byte[] aByteArray461 = new byte[18002];
	byte[] aByteArray431 = new byte[18002];
	byte[][] aByteArrayArray463 = new byte[6][258];
	int[][] anIntArrayArray464 = new int[6][258];
	int[][] anIntArrayArray465 = new int[6][258];
	int[][] anIntArrayArray462 = new int[6][258];
	int[] anIntArray467 = new int[6];

	static final int method468(Class119 var0, int var1) {
		if (var0 == null) {
			return 12;
		} else {
			switch (var0.anInt1545 * -1883003911) {
				case 7:
					return 20;
				default:
					return 12;
			}
		}
	}

	static final int method469(InterfaceDef var0, int var1, byte var2) {
		if (var0.anIntArrayArray2049 != null && var1 < var0.anIntArrayArray2049.length) {
			try {
				int[] var3 = var0.anIntArrayArray2049[var1];
				int var4 = 0;
				int var5 = 0;
				byte var6 = 0;

				while (true) {
					int var7 = var3[var5++];
					int var8 = 0;
					byte var9 = 0;
					if (var7 == 0) {
						return var4;
					}

					if (var7 == 1) {
						var8 = GameClient.anIntArray3002[var3[var5++]];
					}

					if (var7 == 2) {
						var8 = GameClient.anIntArray3003[var3[var5++]];
					}

					if (var7 == 3) {
						var8 = GameClient.anIntArray3004[var3[var5++]];
					}

					int var10;
					InterfaceDef var11;
					int var12;
					int var13;
					if (var7 == 4) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = Class50.method713(var10, (byte) -115);
						var12 = var3[var5++];
						if (var12 != -1 && (!PacketDecoder.getItemDef(var12).members || GameClient.aBool2863)) {
							for (var13 = 0; var13 < var11.itemIds.length; var13++) {
								if (var11.itemIds[var13] == 1 + var12) {
									var8 += var11.itemAmounts[var13];
								}
							}
						}
					}

					if (var7 == 5) {
						System.out.println("gimme varp " + var3[var5]);
						var8 = Class106.varps[var3[var5++]];
					}

					if (var7 == 6) {
						var8 = Class78.skillXps[GameClient.anIntArray3003[var3[var5++]] - 1];
					}

					if (var7 == 7) {
						var8 = Class106.varps[var3[var5++]] * 100 / 46875;
					}

					if (var7 == 8) {
						var8 = Player.me.anInt2818 * 2145271731;
					}

					if (var7 == 9) {
						for (var10 = 0; var10 < 25; var10++) {
							if (Class78.aBoolArray938[var10]) {
								var8 += GameClient.anIntArray3003[var10];
							}
						}
					}

					if (var7 == 10) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = Class50.method713(var10, (byte) 40);
						var12 = var3[var5++];
						if (var12 != -1 && (!PacketDecoder.getItemDef(var12).members || GameClient.aBool2863)) {
							for (var13 = 0; var13 < var11.itemIds.length; var13++) {
								if (var11.itemIds[var13] == var12 + 1) {
									var8 = 999999999;
									break;
								}
							}
						}
					}

					if (var7 == 11) {
						var8 = GameClient.anInt3030 * 1278004015;
					}

					if (var7 == 12) {
						var8 = GameClient.anInt3031 * -1386837203;
					}

					if (var7 == 13) {
						var10 = Class106.varps[var3[var5++]];
						int var15 = var3[var5++];
						var8 = (var10 & 1 << var15) != 0 ? 1 : 0;
					}

					if (var7 == 14) {
						var10 = var3[var5++];
						var8 = GfxDef.method2521(var10, 585094708);
					}

					if (var7 == 15) {
						var9 = 1;
					}

					if (var7 == 16) {
						var9 = 2;
					}

					if (var7 == 17) {
						var9 = 3;
					}

					if (var7 == 18) {
						var8 = (Player.me.anInt2521 * -1051150961 >> 7) + Class35.anInt478 * -1719983039;
					}

					if (var7 == 19) {
						var8 = (Player.me.anInt2505 * -844883935 >> 7) + LinkedEntry_Sub13.anInt1825 * 803568843;
					}

					if (var7 == 20) {
						var8 = var3[var5++];
					}

					if (var9 == 0) {
						if (var6 == 0) {
							var4 += var8;
						}

						if (var6 == 1) {
							var4 -= var8;
						}

						if (var6 == 2 && var8 != 0) {
							var4 /= var8;
						}

						if (var6 == 3) {
							var4 *= var8;
						}

						var6 = 0;
					} else {
						var6 = var9;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}

	public static void method470(String[] var0, short[] var1, int var2) {
		Class51.method718(var0, var1, 0, var0.length - 1, 167182419);
	}

}
