public class Class108 {

	public static short[][] aShortArrayArray1506;
	public static final int anInt1509 = 139;
	public static final int anInt1510 = 161;
	static RenderedItemImage[] aClass109_Sub23_Sub14_Sub2Array1511;
	int[] anIntArray1501;
	int[] anIntArray1508;
	public boolean aBool1502;
	int anInt1505;
	long aLong1504;
	static int[] anIntArray1507 = new int[]{8, 11, 4, 6, 9, 7, 10};
	public static Class128 aClass128_1500 = new Class128(260);
	long aLong1503;

	public int method1344(int var1) {
		return anInt1505 * 942739005 == -1 ? (anIntArray1501[8] << 10) + (anIntArray1501[0] << 15) + (anIntArray1508[0] << 25) + (anIntArray1508[4] << 20) + (anIntArray1501[11] << 5) + anIntArray1501[1] : 305419896 + Class50.getNpcDef(anInt1505 * 942739005).id * 1380254665;
	}

	public void method1345(int[] var1, int[] var2, boolean var3, int var4, byte var5) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var7 = 0; var7 < 7; var7++) {
				for (int var6 = 0; var6 < CacheableEntry_Sub23_Sub2.anInt2107 * -1534763975; var6++) {
					CacheableEntry_Sub23_Sub2 var8 = Class15.method270(var6, -1899122064);
					if (var8 != null && !var8.aBool2109 && var8.anInt2098 * -1568050933 == var7 + (var3 ? 7 : 0)) {
						var1[anIntArray1507[var7]] = 256 + var6;
						break;
					}
				}
			}
		}

		anIntArray1501 = var1;
		anIntArray1508 = var2;
		aBool1502 = var3;
		anInt1505 = var4 * 271284501;
		method1350(1202769192);
	}

	public void method1346(int var1, boolean var2, int var3) {
		if (var1 != 1 || !aBool1502) {
			int var4 = anIntArray1501[anIntArray1507[var1]];
			if (var4 != 0) {
				var4 -= 256;

				CacheableEntry_Sub23_Sub2 var5;
				do {
					if (!var2) {
						--var4;
						if (var4 < 0) {
							var4 = CacheableEntry_Sub23_Sub2.anInt2107 * -1534763975 - 1;
						}
					} else {
						++var4;
						if (var4 >= CacheableEntry_Sub23_Sub2.anInt2107 * -1534763975) {
							var4 = 0;
						}
					}

					var5 = Class15.method270(var4, -1899122064);
				}
				while (var5 == null || var5.aBool2109 || var5.anInt2098 * -1568050933 != (aBool1502 ? 7 : 0) + var1);

				anIntArray1501[anIntArray1507[var1]] = var4 + 256;
				method1350(1399423339);
			}
		}
	}

	public void method1347(int var1, boolean var2, byte var3) {
		int var4 = anIntArray1508[var1];
		if (!var2) {
			do {
				--var4;
				if (var4 < 0) {
					var4 = aShortArrayArray1506[var1].length - 1;
				}
			} while (!Class80.method1035(var1, var4, 367839608));
		} else {
			do {
				++var4;
				if (var4 >= aShortArrayArray1506[var1].length) {
					var4 = 0;
				}
			} while (!Class80.method1035(var1, var4, 367839608));
		}

		anIntArray1508[var1] = var4;
		method1350(2138664289);
	}

	public void method1348(boolean var1, int var2) {
		if (aBool1502 != var1) {
			method1345((int[]) null, anIntArray1508, var1, -1, (byte) -85);
		}
	}

	public void method1349(DataBuffer var1, int var2) {
		var1.writeByte(aBool1502 ? 1 : 0);

		int var4;
		for (var4 = 0; var4 < 7; var4++) {
			int var3 = anIntArray1501[anIntArray1507[var4]];
			if (var3 == 0) {
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256);
			}
		}

		for (var4 = 0; var4 < 5; var4++) {
			var1.writeByte(anIntArray1508[var4]);
		}

	}

	void method1350(int var1) {
		long var2 = aLong1504 * -3008304834187156363L;
		int var5 = anIntArray1501[5];
		int var4 = anIntArray1501[9];
		anIntArray1501[5] = var4;
		anIntArray1501[9] = var5;
		aLong1504 = 0L;

		int var6;
		for (var6 = 0; var6 < 12; var6++) {
			aLong1504 = (aLong1504 * -3008304834187156363L << 4) * 5855792400499903453L;
			if (anIntArray1501[var6] >= 256) {
				aLong1504 += 5855792400499903453L * (long) (anIntArray1501[var6] - 256);
			}
		}

		if (anIntArray1501[0] >= 256) {
			aLong1504 += (long) (anIntArray1501[0] - 256 >> 4) * 5855792400499903453L;
		}

		if (anIntArray1501[1] >= 256) {
			aLong1504 += (long) (anIntArray1501[1] - 256 >> 8) * 5855792400499903453L;
		}

		for (var6 = 0; var6 < 5; var6++) {
			aLong1504 = (aLong1504 * -3008304834187156363L << 3) * 5855792400499903453L;
			aLong1504 += 5855792400499903453L * (long) anIntArray1508[var6];
		}

		aLong1504 = 5855792400499903453L * (-3008304834187156363L * aLong1504 << 1);
		aLong1504 += (long) (aBool1502 ? 1 : 0) * 5855792400499903453L;
		anIntArray1501[5] = var5;
		anIntArray1501[9] = var4;
		if (var2 != 0L && var2 != -3008304834187156363L * aLong1504) {
			aClass128_1500.method1582(var2);
		}

	}

	CacheableEntry_Sub23_Sub16_Sub6 method1352(byte var1) {
		if (anInt1505 * 942739005 != -1) {
			return Class50.getNpcDef(anInt1505 * 942739005).method2421((byte) -85);
		} else {
			boolean var7 = false;

			int var6;
			for (int var5 = 0; var5 < 12; var5++) {
				var6 = anIntArray1501[var5];
				if (var6 >= 256 && var6 < 512 && !Class15.method270(var6 - 256, -1899122064).method2227((byte) -100)) {
					var7 = true;
				}

				if (var6 >= 512 && !PacketDecoder.getItemDef(var6 - 512).method2255(aBool1502, (byte) 36)) {
					var7 = true;
				}
			}

			if (var7) {
				return null;
			} else {
				CacheableEntry_Sub23_Sub16_Sub6[] var9 = new CacheableEntry_Sub23_Sub16_Sub6[12];
				var6 = 0;

				int var2;
				for (int var4 = 0; var4 < 12; var4++) {
					var2 = anIntArray1501[var4];
					CacheableEntry_Sub23_Sub16_Sub6 var3;
					if (var2 >= 256 && var2 < 512) {
						var3 = Class15.method270(var2 - 256, -1899122064).method2228(-1458854412);
						if (var3 != null) {
							var9[var6++] = var3;
						}
					}

					if (var2 >= 512) {
						var3 = PacketDecoder.getItemDef(var2 - 512).method2258(aBool1502, -1407441345);
						if (var3 != null) {
							var9[var6++] = var3;
						}
					}
				}

				CacheableEntry_Sub23_Sub16_Sub6 var8 = new CacheableEntry_Sub23_Sub16_Sub6(var9, var6);

				for (var2 = 0; var2 < 5; var2++) {
					if (anIntArray1508[var2] < aShortArrayArray1506[var2].length) {
						var8.method3218(Class85.aShortArray1010[var2], aShortArrayArray1506[var2][anIntArray1508[var2]]);
					}

					if (anIntArray1508[var2] < MachineInfo.aShortArrayArray1879[var2].length) {
						var8.method3218(Class59.aShortArray766[var2], MachineInfo.aShortArrayArray1879[var2][anIntArray1508[var2]]);
					}
				}

				return var8;
			}
		}
	}

	public CacheableEntry_Sub23_Sub16_Sub5 method1355(AnimationSequence var1, int var2, AnimationSequence var3, int var4, int var5) {
		if (anInt1505 * 942739005 != -1) {
			return Class50.getNpcDef(anInt1505 * 942739005).method2404(var1, var2, var3, var4, 290126029);
		} else {
			long var6 = -3008304834187156363L * aLong1504;
			int[] var12 = anIntArray1501;
			if (var1 != null && (var1.leftHandItem * 1369697391 >= 0 || var1.rightHandItem * 241398875 >= 0)) {
				var12 = new int[12];

				for (int var8 = 0; var8 < 12; var8++) {
					var12[var8] = anIntArray1501[var8];
				}

				if (var1.leftHandItem * 1369697391 >= 0) {
					var6 += (long) (var1.leftHandItem * 1369697391 - anIntArray1501[5] << 40);
					var12[5] = var1.leftHandItem * 1369697391;
				}

				if (var1.rightHandItem * 241398875 >= 0) {
					var6 += (long) (var1.rightHandItem * 241398875 - anIntArray1501[3] << 48);
					var12[3] = var1.rightHandItem * 241398875;
				}
			}

			CacheableEntry_Sub23_Sub16_Sub5 var16 = (CacheableEntry_Sub23_Sub16_Sub5) aClass128_1500.get(var6);
			if (var16 == null) {
				boolean var14 = false;

				int var10;
				for (int var9 = 0; var9 < 12; var9++) {
					var10 = var12[var9];
					if (var10 >= 256 && var10 < 512 && !Class15.method270(var10 - 256, -1899122064).method2243(-1586899891)) {
						var14 = true;
					}

					if (var10 >= 512 && !PacketDecoder.getItemDef(var10 - 512).method2279(aBool1502, 80445956)) {
						var14 = true;
					}
				}

				if (var14) {
					if (3821891208152933781L * aLong1503 != -1L) {
						var16 = (CacheableEntry_Sub23_Sub16_Sub5) aClass128_1500.get(3821891208152933781L * aLong1503);
					}

					if (var16 == null) {
						return null;
					}
				}

				if (var16 == null) {
					CacheableEntry_Sub23_Sub16_Sub6[] var17 = new CacheableEntry_Sub23_Sub16_Sub6[12];
					var10 = 0;

					int var13;
					for (int var11 = 0; var11 < 12; var11++) {
						var13 = var12[var11];
						CacheableEntry_Sub23_Sub16_Sub6 var15;
						if (var13 >= 256 && var13 < 512) {
							var15 = Class15.method270(var13 - 256, -1899122064).method2226((byte) 0);
							if (var15 != null) {
								var17[var10++] = var15;
							}
						}

						if (var13 >= 512) {
							var15 = PacketDecoder.getItemDef(var13 - 512).method2256(aBool1502, (byte) -1);
							if (var15 != null) {
								var17[var10++] = var15;
							}
						}
					}

					CacheableEntry_Sub23_Sub16_Sub6 var18 = new CacheableEntry_Sub23_Sub16_Sub6(var17, var10);

					for (var13 = 0; var13 < 5; var13++) {
						if (anIntArray1508[var13] < aShortArrayArray1506[var13].length) {
							var18.method3218(Class85.aShortArray1010[var13], aShortArrayArray1506[var13][anIntArray1508[var13]]);
						}

						if (anIntArray1508[var13] < MachineInfo.aShortArrayArray1879[var13].length) {
							var18.method3218(Class59.aShortArray766[var13], MachineInfo.aShortArrayArray1879[var13][anIntArray1508[var13]]);
						}
					}

					var16 = var18.method3266(64, 850, -30, -50, -30);
					aClass128_1500.put(var16, var6);
					aLong1503 = var6 * 186498087929658813L;
				}
			}

			if (var1 == null && var3 == null) {
				return var16;
			} else {
				CacheableEntry_Sub23_Sub16_Sub5 var19;
				if (var1 != null && var3 != null) {
					var19 = var1.method2320(var16, var2, var3, var4, 226287739);
				} else if (var1 != null) {
					var19 = var1.method2326(var16, var2, 244288509);
				} else {
					var19 = var3.method2326(var16, var4, 1939180479);
				}

				return var19;
			}
		}
	}

	static final void method1380(boolean var0, int var1) {
		for (int var2 = 0; var2 < GameClient.numLocalNpcs * 1974577941; var2++) {
			Npc var4 = GameClient.sceneNpcs[GameClient.npcIndices[var2]];
			int var5 = (GameClient.npcIndices[var2] << 14) + 536870912;
			if (var4 != null && var4.method2945(670283898) && var0 == var4.definition.aBool2219 && var4.definition.method2407(-113726317)) {
				int var6 = var4.anInt2521 * -1051150961 >> 7;
				int var3 = var4.anInt2505 * -844883935 >> 7;
				if (var6 >= 0 && var6 < 104 && var3 >= 0 && var3 < 104) {
					if (var4.anInt2508 * -357547515 == 1 && (var4.anInt2521 * -1051150961 & 127) == 64 && (var4.anInt2505 * -844883935 & 127) == 64) {
						if (GameClient.anIntArrayArray2966[var6][var3] == GameClient.anInt2924 * -246782549) {
							continue;
						}

						GameClient.anIntArrayArray2966[var6][var3] = GameClient.anInt2924 * -246782549;
					}

					if (!var4.definition.aBool2249) {
						var5 += -2147483648;
					}

					LinkedEntry_Sub6.aClass39_1732.method512(CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var4.anInt2521 * -1051150961, var4.anInt2505 * -844883935, NpcDef.method2423(var4.anInt2521 * -1051150961 + (var4.anInt2508 * -1408204480 - 64), var4.anInt2505 * -844883935 + (var4.anInt2508 * -1408204480 - 64), CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, -1847964236), 60 + (var4.anInt2508 * -1408204480 - 64), var4, var4.direction * 1933495885, var5, var4.aBool2507);
				}
			}
		}

	}

}
