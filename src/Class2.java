import java.awt.*;
import java.io.File;
import java.nio.file.Files;

public class Class2 {

	static final int anInt16 = 3;
	protected static int anInt17;
	public static int anInt18;
	public static boolean aBool19;
	static final int anInt20 = 16384;
	int anInt31;
	public static int anInt34;
	static final int anInt35 = 2;
	static final int anInt36 = 34;
	LinkedEntry_Sub5 aClass109_Sub5_22;
	long aLong26 = 0L;
	boolean aBool33 = true;
	int anInt29 = 0;
	long aLong24 = Class10.method216((short) 255) * 9097749355702074551L;
	int anInt25;
	int anInt27;
	int anInt28 = 0;
	long aLong32 = 0L;
	int anInt30 = 0;
	int[] anIntArray21;
	static Class15 aClass15_39;
	int anInt23 = 279813920;
	int anInt40 = 0;
	LinkedEntry_Sub5[] aClass109_Sub5Array37 = new LinkedEntry_Sub5[8];
	LinkedEntry_Sub5[] aClass109_Sub5Array38 = new LinkedEntry_Sub5[8];

	public final synchronized void method48(LinkedEntry_Sub5 var1, byte var2) {
		aClass109_Sub5_22 = var1;
	}

	public final synchronized void method49(int var1) {
		if (anIntArray21 != null) {
			long var2 = Class10.method216((short) 255);

			try {
				if (aLong26 * 3377015987257929069L != 0L) {
					if (var2 < aLong26 * 3377015987257929069L) {
						return;
					}

					method95(anInt25 * -1450371813);
					aLong26 = 0L;
					aBool33 = true;
				}

				int var4 = method66();
				if (anInt28 * -2020738743 - var4 > anInt29 * -686867523) {
					anInt29 = (anInt28 * -2020738743 - var4) * 2096715669;
				}

				int var5 = anInt31 * 1177621975 + anInt27 * -504629513;
				if (256 + var5 > 16384) {
					var5 = 16128;
				}

				if (var5 + 256 > anInt25 * -1450371813) {
					anInt25 += 16010240;
					if (anInt25 * -1450371813 > 16384) {
						anInt25 = 256163840;
					}

					method59();
					method95(anInt25 * -1450371813);
					var4 = 0;
					aBool33 = true;
					if (256 + var5 > anInt25 * -1450371813) {
						var5 = anInt25 * -1450371813 - 256;
						anInt27 = (var5 - anInt31 * 1177621975) * 423996103;
					}
				}

				while (var4 < var5) {
					method61(anIntArray21, 256);
					method98();
					var4 += 256;
				}

				if (var2 > 5791573765782046013L * aLong32) {
					if (!aBool33) {
						if (anInt29 * -686867523 == 0 && anInt30 * -310890005 == 0) {
							method59();
							aLong26 = (var2 + 2000L) * 5919533943435633765L;
							return;
						}

						anInt27 = Math.min(anInt30 * -310890005, anInt29 * -686867523) * 423996103;
						anInt30 = anInt29 * 1833875191;
					} else {
						aBool33 = false;
					}

					anInt29 = 0;
					aLong32 = -4157439246045939179L * (2000L + var2);
				}

				anInt28 = var4 * -1637070599;
			} catch (Exception var7) {
				method59();
				aLong26 = 5919533943435633765L * (var2 + 2000L);
			}

			try {
				if (var2 > aLong24 * 7275558122260947207L + 500000L) {
					var2 = 7275558122260947207L * aLong24;
				}

				while (var2 > 5000L + 7275558122260947207L * aLong24) {
					method73(256, 1705035456);
					aLong24 += (long) (256000 / (anInt34 * -46901051)) * 9097749355702074551L;
				}
			} catch (Exception var6) {
				aLong24 = 9097749355702074551L * var2;
			}

		}
	}

	public final synchronized void method52(int var1) {
		if (aClass15_39 != null) {
			boolean var3 = true;

			for (int var2 = 0; var2 < 2; var2++) {
				if (this == aClass15_39.aClass2Array187[var2]) {
					aClass15_39.aClass2Array187[var2] = null;
				}

				if (aClass15_39.aClass2Array187[var2] != null) {
					var3 = false;
				}
			}

			if (var3) {
				aClass15_39.aBool188 = true;

				while (aClass15_39.aBool193) {
					Class24.method357(50L);
				}

				aClass15_39 = null;
			}
		}

		method59();
		anIntArray21 = null;
	}

	void method55(Component var1) throws Exception {
	}

	void method59() {
	}

	void method60() throws Exception {
	}

	final void method61(int[] var1, int var2) {
		int var3 = var2;
		if (aBool19) {
			var3 = var2 << 1;
		}

		Class52.method752(var1, 0, var3);
		anInt40 -= var2 * 689867139;
		if (aClass109_Sub5_22 != null && anInt40 * 241945899 <= 0) {
			anInt40 += (anInt34 * -46901051 >> 4) * 689867139;
			MachineInfo.method2096(aClass109_Sub5_22, -2112682385);
			method79(aClass109_Sub5_22, aClass109_Sub5_22.method1795(), (byte) -22);
			int var11 = 0;
			int var9 = 255;

			int var4;
			LinkedEntry_Sub5 var8;
			label132:
			for (var4 = 7; var9 != 0; --var4) {
				int var5;
				int var6;
				if (var4 < 0) {
					var5 = var4 & 3;
					var6 = -(var4 >> 2);
				} else {
					var5 = var4;
					var6 = 0;
				}

				for (int var7 = var9 >>> var5 & 286331153; var7 != 0; var7 >>>= 4) {
					if ((var7 & 1) != 0) {
						var9 &= ~(1 << var5);
						var8 = null;
						LinkedEntry_Sub5 var14 = aClass109_Sub5Array37[var5];

						label126:
						while (true) {
							while (true) {
								if (var14 == null) {
									break label126;
								}

								LinkedEntry_Sub1 var13 = var14.aClass109_Sub1_1713;
								if (var13 != null && var13.anInt1652 > var6) {
									var9 |= 1 << var5;
									var8 = var14;
									var14 = var14.aClass109_Sub5_1714;
								} else {
									var14.aBool1715 = true;
									int var15 = var14.method1794();
									var11 += var15;
									if (var13 != null) {
										var13.anInt1652 += var15;
									}

									if (var11 >= anInt23 * -494955191) {
										break label132;
									}

									LinkedEntry_Sub5 var12 = var14.method1796();
									if (var12 != null) {
										for (int var10 = var14.anInt1712; var12 != null; var12 = var14.method1797()) {
											method79(var12, var10 * var12.method1795() >> 8, (byte) 10);
										}
									}

									LinkedEntry_Sub5 var18 = var14.aClass109_Sub5_1714;
									var14.aClass109_Sub5_1714 = null;
									if (var8 == null) {
										aClass109_Sub5Array37[var5] = var18;
									} else {
										var8.aClass109_Sub5_1714 = var18;
									}

									if (var18 == null) {
										aClass109_Sub5Array38[var5] = var8;
									}

									var14 = var18;
								}
							}
						}
					}

					var5 += 4;
					++var6;
				}
			}

			for (var4 = 0; var4 < 8; var4++) {
				LinkedEntry_Sub5 var16 = aClass109_Sub5Array37[var4];
				LinkedEntry_Sub5[] var17 = aClass109_Sub5Array37;
				aClass109_Sub5Array38[var4] = null;

				for (var17[var4] = null; var16 != null; var16 = var8) {
					var8 = var16.aClass109_Sub5_1714;
					var16.aClass109_Sub5_1714 = null;
				}
			}
		}

		if (anInt40 * 241945899 < 0) {
			anInt40 = 0;
		}

		if (aClass109_Sub5_22 != null) {
			aClass109_Sub5_22.method1803(var1, 0, var2);
		}

		aLong24 = Class10.method216((short) 255) * 9097749355702074551L;
	}

	public final synchronized void method62(int var1) {
		aBool33 = true;

		try {
			method60();
		} catch (Exception var3) {
			method59();
			aLong26 = (Class10.method216((short) 255) + 2000L) * 5919533943435633765L;
		}

	}

	int method66() throws Exception {
		return anInt25 * -1450371813;
	}

	final void method73(int var1, int var2) {
		anInt40 -= var1 * 689867139;
		if (anInt40 * 241945899 < 0) {
			anInt40 = 0;
		}

		if (aClass109_Sub5_22 != null) {
			aClass109_Sub5_22.method1801(var1);
		}

	}

	final void method79(LinkedEntry_Sub5 var1, int var2, byte var3) {
		int var4 = var2 >> 5;
		LinkedEntry_Sub5 var5 = aClass109_Sub5Array38[var4];
		if (var5 == null) {
			aClass109_Sub5Array37[var4] = var1;
		} else {
			var5.aClass109_Sub5_1714 = var1;
		}

		aClass109_Sub5Array38[var4] = var1;
		var1.anInt1712 = var2;
	}

	void method95(int var1) throws Exception {
	}

	public final void method97() {
		aBool33 = true;
	}

	void method98() throws Exception {
	}

	static final void method99(CacheableEntry_Sub23_Sub16_Sub2 ent) {
		if (ent.anInt2557 * -1936020065 != 0) {
			int var3;
			int var4;
			if (ent.facedEntity * 1253370921 != -1 && ent.facedEntity * 1253370921 < 32768) {
				Npc var2 = GameClient.sceneNpcs[ent.facedEntity * 1253370921];
				if (var2 != null) {
					var3 = ent.anInt2521 * -1051150961 - var2.anInt2521 * -1051150961;
					var4 = ent.anInt2505 * -844883935 - var2.anInt2505 * -844883935;
					if (var3 != 0 || var4 != 0) {
						ent.spawnDirection = ((int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 2047) * 1686641467;
					}
				}
			}

			int var6;
			if (ent.facedEntity * 1253370921 >= 32768) {
				var6 = ent.facedEntity * 1253370921 - 32768;
				if (GameClient.myIndex * -1731449945 == var6) {
					var6 = 2047;
				}

				Player var7 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var6];
				if (var7 != null) {
					var4 = ent.anInt2521 * -1051150961 - var7.anInt2521 * -1051150961;
					int var5 = ent.anInt2505 * -844883935 - var7.anInt2505 * -844883935;
					if (var4 != 0 || var5 != 0) {
						ent.spawnDirection = ((int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047) * 1686641467;
					}
				}
			}

			if ((ent.anInt2531 * -171614763 != 0 || ent.anInt2532 * 384997749 != 0) && (ent.anInt2558 * -1429276161 == 0 || ent.anInt2562 * -1785378405 > 0)) {
				var6 = ent.anInt2521 * -1051150961 - (ent.anInt2531 * 1901557056 - Class35.anInt478 * 1590235200 - Class35.anInt478 * 1590235200);
				var3 = ent.anInt2505 * -844883935 - (ent.anInt2532 * -1129947840 - LinkedEntry_Sub13.anInt1825 * -111201600 - LinkedEntry_Sub13.anInt1825 * -111201600);
				if (var6 != 0 || var3 != 0) {
					ent.spawnDirection = ((int) (Math.atan2((double) var6, (double) var3) * 325.949D) & 2047) * 1686641467;
				}

				ent.anInt2531 = 0;
				ent.anInt2532 = 0;
			}

			var6 = ent.spawnDirection * -1099823629 - ent.direction * 1933495885 & 2047;
			if (var6 != 0) {
				ent.anInt2504 -= 1291408463;
				boolean var8;
				if (var6 > 1024) {
					ent.direction -= ent.anInt2557 * -624469605;
					var8 = true;
					if (var6 < ent.anInt2557 * -1936020065 || var6 > 2048 - ent.anInt2557 * -1936020065) {
						ent.direction = ent.spawnDirection * -131283649;
						var8 = false;
					}

					if (ent.anInt2556 * -1834510973 == ent.anInt2509 * -71832567 && (ent.anInt2504 * -222118575 > 25 || var8)) {
						if (ent.anInt2510 * 522440809 != -1) {
							ent.anInt2556 = ent.anInt2510 * 673024675;
						} else {
							ent.anInt2556 = ent.anInt2524 * -1666602161;
						}
					}
				} else {
					ent.direction += ent.anInt2557 * -624469605;
					var8 = true;
					if (var6 < ent.anInt2557 * -1936020065 || var6 > 2048 - ent.anInt2557 * -1936020065) {
						ent.direction = ent.spawnDirection * -131283649;
						var8 = false;
					}

					if (ent.anInt2556 * -1834510973 == ent.anInt2509 * -71832567 && (ent.anInt2504 * -222118575 > 25 || var8)) {
						if (ent.anInt2551 * -1797134015 != -1) {
							ent.anInt2556 = ent.anInt2551 * -1042313493;
						} else {
							ent.anInt2556 = ent.anInt2524 * -1666602161;
						}
					}
				}

				ent.direction = (ent.direction * 1933495885 & 2047) * 1352080005;
			} else {
				ent.anInt2504 = 0;
			}

		}
	}

	static int method100(Class51 var0, Class51 var1, int var2, boolean var3, int var4) {
		if (var2 == 1) {
			int var6 = var0.anInt701 * 1599434219;
			int var5 = var1.anInt701 * 1599434219;
			if (!var3) {
				if (var6 == -1) {
					var6 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var6 - var5;
		} else {
			return var2 == 2 ? var0.anInt710 * -1139554955 - var1.anInt710 * -1139554955 : (var2 == 3 ? (var0.aString707.equals("-") ? (var1.aString707.equals("-") ? 0 : (var3 ? -1 : 1)) : (var1.aString707.equals("-") ? (var3 ? 1 : -1) : var0.aString707.compareTo(var1.aString707))) : (var2 == 4 ? (var0.method730(-782303106) ? (var1.method730(-782303106) ? 0 : 1) : (var1.method730(-782303106) ? -1 : 0)) : (var2 == 5 ? (var0.method716(-2030677369) ? (var1.method716(-1744502434) ? 0 : 1) : (var1.method716(-730641731) ? -1 : 0)) : (var2 == 6 ? (var0.method717(-1037368077) ? (var1.method717(-592634570) ? 0 : 1) : (var1.method717(503193406) ? -1 : 0)) : (var2 == 7 ? (var0.method715((byte) 16) ? (var1.method715((byte) 16) ? 0 : 1) : (var1.method715((byte) 16) ? -1 : 0)) : var0.anInt703 * 1685233739 - var1.anInt703 * 1685233739)))));
		}
	}

	static final void method101(boolean instance) {
		GameClient.aBool2960 = instance;
		int var2;
		int var3;
		int var4;
		int var6;
		int var7;
		int var8;
		int var11;
		int var12;
		int var13;
		if (!GameClient.aBool2960) {
			var4 = (GameClient.messageSize * 1964753529 - GameClient.gameBuffer.pos * 1736753585) / 16;
			Class30.anIntArrayArray381 = new int[var4][4];

			for (var11 = 0; var11 < var4; var11++) {
				for (var7 = 0; var7 < 4; var7++) {
					Class30.anIntArrayArray381[var11][var7] = GameClient.gameBuffer.readIntV1();
				}
			}

			int mapz = GameClient.gameBuffer.readUShort();
			int mapx = GameClient.gameBuffer.readUShortA();
			int lz = GameClient.gameBuffer.readULEShort();
			int heightlevel = GameClient.gameBuffer.readUByteS();
			int lx = GameClient.gameBuffer.readUShortLEA();

			System.out.printf("Map c[%d, %d] l[%d, %d] h %d%n", mapx, mapz, lx, lz, heightlevel);

			LinkedEntry_Sub9.anIntArray1766 = new int[var4];
			CacheableEntry_Sub23_Sub16_Sub2.mapFileIds = new int[var4];
			Class77.landscapeFileId = new int[var4];
			Class61.mapFileData = new byte[var4][];
			Class30.aByteArrayArray378 = new byte[var4][];
			boolean var5 = false;
			if ((mapx / 8 == 48 || mapx / 8 == 49) && mapz / 8 == 48) {
				var5 = true;
			}

			if (mapx / 8 == 48 && mapz / 8 == 148) {
				var5 = true;
			}

			var4 = 0;

			for (var13 = (mapx - 6) / 8; var13 <= (mapx + 6) / 8; var13++) {
				for (var2 = (mapz - 6) / 8; var2 <= (mapz + 6) / 8; var2++) {
					var8 = var2 + (var13 << 8);
					if (!var5 || var2 != 49 && var2 != 149 && var2 != 147 && var13 != 50 && (var13 != 49 || var2 != 47)) {
						LinkedEntry_Sub9.anIntArray1766[var4] = var8;
						CacheableEntry_Sub23_Sub16_Sub2.mapFileIds[var4] = Class126_Sub1.aClass94_Sub1_1643.method1170("m" + var13 + "_" + var2);
						Class77.landscapeFileId[var4] = Class126_Sub1.aClass94_Sub1_1643.method1170("l" + var13 + "_" + var2);

						int keys[] = Class30.anIntArrayArray381[var4];
						System.out.println("keys honey");
						try {
							Files.write(new File("keys/" + var8 + ".txt").toPath(), String.format("%d\n%d\n%d\n%d",
									keys[0], keys[1], keys[2], keys[3]).getBytes());
						} catch (Exception e) {
							e.printStackTrace();;
						}

						++var4;
					}
				}
			}

			Class21.method346(mapx, mapz, heightlevel, lx, lz, 1434585208);
		} else {
			var4 = GameClient.gameBuffer.readUShortA();
			var11 = GameClient.gameBuffer.readUShort();
			var7 = GameClient.gameBuffer.readUShortLEA();
			var12 = GameClient.gameBuffer.readUByteN();
			GameClient.gameBuffer.startBitMode();

			int var17;
			for (var6 = 0; var6 < 4; var6++) {
				for (var3 = 0; var3 < 13; var3++) {
					for (var17 = 0; var17 < 13; var17++) {
						var13 = GameClient.gameBuffer.readbits(1);
						if (var13 == 1) {
							GameClient.anIntArrayArrayArray2925[var6][var3][var17] = GameClient.gameBuffer.readbits(26);
						} else {
							GameClient.anIntArrayArrayArray2925[var6][var3][var17] = -1;
						}
					}
				}
			}

			GameClient.gameBuffer.endBitMode();
			var6 = (GameClient.messageSize * 1964753529 - GameClient.gameBuffer.pos * 1736753585) / 16;
			Class30.anIntArrayArray381 = new int[var6][4];

			for (var3 = 0; var3 < var6; var3++) {
				for (var17 = 0; var17 < 4; var17++) {
					Class30.anIntArrayArray381[var3][var17] = GameClient.gameBuffer.readIntV2();
				}
			}

			var3 = GameClient.gameBuffer.readULEShort();
			LinkedEntry_Sub9.anIntArray1766 = new int[var6];
			CacheableEntry_Sub23_Sub16_Sub2.mapFileIds = new int[var6];
			Class77.landscapeFileId = new int[var6];
			Class61.mapFileData = new byte[var6][];
			Class30.aByteArrayArray378 = new byte[var6][];
			var6 = 0;

			for (var17 = 0; var17 < 4; var17++) {
				for (var13 = 0; var13 < 13; var13++) {
					for (var2 = 0; var2 < 13; var2++) {
						var8 = GameClient.anIntArrayArrayArray2925[var17][var13][var2];
						if (var8 != -1) {
							int var16 = var8 >> 14 & 1023;
							int var15 = var8 >> 3 & 2047;
							int var9 = var15 / 8 + (var16 / 8 << 8);

							int var10;
							for (var10 = 0; var10 < var6; var10++) {
								if (LinkedEntry_Sub9.anIntArray1766[var10] == var9) {
									var9 = -1;
									break;
								}
							}

							if (var9 != -1) {
								LinkedEntry_Sub9.anIntArray1766[var6] = var9;
								var10 = var9 >> 8 & 255;
								int var14 = var9 & 255;
								CacheableEntry_Sub23_Sub16_Sub2.mapFileIds[var6] = Class126_Sub1.aClass94_Sub1_1643.method1170("m" + var10 + "_" + var14);
								Class77.landscapeFileId[var6] = Class126_Sub1.aClass94_Sub1_1643.method1170("l" + var10 + "_" + var14);
								++var6;
							}
						}
					}
				}
			}

			Class21.method346(var7, var11, var12, var3, var4, 1348291685);
		}

	}

	public static byte[] method102(Object var0, boolean var1, int var2) {
		if (var0 == null) {
			return null;
		} else if (!(var0 instanceof byte[])) {
			if (var0 instanceof Class67) {
				Class67 var4 = (Class67) var0;
				return var4.method896(-2117824380);
			} else {
				throw new IllegalArgumentException();
			}
		} else {
			byte[] var3 = (byte[]) ((byte[]) var0);
			return var1 ? Class25.method368(var3, 1485776901) : var3;
		}
	}

	static void method103(int var0, String var1, byte var2) {
		boolean var3 = false;

		for (int var5 = 0; var5 < GameClient.anInt3091 * -796710281; var5++) {
			Player var4 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[GameClient.anIntArray3107[var5]];
			if (var4 != null && var4.aString2835 != null && var4.aString2835.equalsIgnoreCase(var1)) {
				if (var0 == 1) {
					GameClient.secureBuffer.writeOpcode(199);
					GameClient.secureBuffer.writeByteN(0);
					GameClient.secureBuffer.writeShortLE(GameClient.anIntArray3107[var5]);
				} else if (var0 == 4) {
					GameClient.secureBuffer.writeOpcode(56);
					GameClient.secureBuffer.writeByte(0);
					GameClient.secureBuffer.writeShort(GameClient.anIntArray3107[var5]);
				} else if (var0 == 6) {
					GameClient.secureBuffer.writeOpcode(218);
					GameClient.secureBuffer.writeLEShortA(GameClient.anIntArray3107[var5]);
					GameClient.secureBuffer.method2069(0);
				} else if (var0 == 7) {
					GameClient.secureBuffer.writeOpcode(95);
					GameClient.secureBuffer.writeByte(0);
					GameClient.secureBuffer.writeShort(GameClient.anIntArray3107[var5]);
				}

				var3 = true;
				break;
			}
		}

		if (!var3) {
			Class93.method1145(4, "", Class90.UNABLE_TO_FIND + var1);
		}

	}

}
