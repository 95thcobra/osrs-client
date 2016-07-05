import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

public class Class40 {

	public static final int anInt578 = 252;
	static RenderedItemImage[] aClass109_Sub23_Sub14_Sub2Array580;
	static final int anInt581 = 89;
	public static final int anInt582 = 64;
	static final int anInt584 = 6;
	int anInt579;
	int anInt577;
	int anInt576;
	int anInt583;

	public static void method667(IndexDescriptor var0, IndexDescriptor var1, int var2) {
		GfxDef.aIndexDescriptor_2362 = var0;
		GfxDef.aIndexDescriptor_2363 = var1;
	}

	Class40(Class40 var1) {
		anInt579 = var1.anInt579 * 1;
		anInt577 = var1.anInt577 * 1;
		anInt576 = var1.anInt576 * 1;
		anInt583 = var1.anInt583 * 1;
	}

	Class40() {
	}

	static final void method668(int var0, int var1, int var2, int var3, RenderedItemImage var4, CacheableEntry_Sub23_Sub18 var5, byte var6) {
		if (var4 != null) {
			int var10 = GameClient.anInt2880 * 1847328669 + GameClient.anInt2948 * -1072839225 & 2047;
			int var12 = var3 * var3 + var2 * var2;
			if (var12 <= 6400) {
				int var8 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2719[var10];
				int var7 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2720[var10];
				var8 = var8 * 256 / (256 + GameClient.anInt2936 * 461573195);
				var7 = var7 * 256 / (256 + GameClient.anInt2936 * 461573195);
				int var9 = var7 * var2 + var3 * var8 >> 16;
				int var11 = var7 * var3 - var2 * var8 >> 16;
				if (var12 > 2500) {
					var4.method3007(var9 + var5.anInt2439 * -2016633209 / 2 - var4.anInt2595 / 2, var5.anInt2438 * -633411239 / 2 - var11 - var4.anInt2593 / 2, var0, var1, var5.anInt2439 * -2016633209, var5.anInt2438 * -633411239, var5.anIntArray2440, var5.anIntArray2441);
				} else {
					var4.method2997(var9 + var0 + var5.anInt2439 * -2016633209 / 2 - var4.anInt2595 / 2, var1 + var5.anInt2438 * -633411239 / 2 - var11 - var4.anInt2593 / 2);
				}

			}
		}
	}

	static final void method669(byte var0) {
		try {
			if (GameClient.loginStage * 638704689 == 0) {
				if (Class98.loginConnection != null) {
					Class98.loginConnection.terminate();
					Class98.loginConnection = null;
				}

				Class63_Sub1.connectionJob = null;
				GameClient.aBool3142 = false;
				GameClient.anInt2989 = 0;
				GameClient.loginStage = 362544337;
			}

			if (GameClient.loginStage * 638704689 == 1) {
				if (Class63_Sub1.connectionJob == null) {
					Class63_Sub1.connectionJob = Class50.aClass73_693.submitSocketJob(Class10.aString130, Class51.anInt712 * 751829209);
				}

				if (Class63_Sub1.connectionJob.stage == 2) {
					throw new IOException();
				}

				if (Class63_Sub1.connectionJob.stage == 1) {
					Class98.loginConnection = new Connection((Socket) Class63_Sub1.connectionJob.result, Class50.aClass73_693);
					Class63_Sub1.connectionJob = null;
					GameClient.loginStage = 725088674;
				}
			}

			if (GameClient.loginStage * 638704689 == 2) {
				GameClient.secureBuffer.pos = 0;
				GameClient.secureBuffer.writeByte(14);
				Class98.loginConnection.write(GameClient.secureBuffer.data, 0, 1);
				GameClient.gameBuffer.pos = 0;
				GameClient.loginStage = 1087633011;
			}

			int var1;
			if (GameClient.loginStage * 638704689 == 3) {
				if (CacheableEntry_Sub23_Sub6.aClass2_2200 != null) {
					CacheableEntry_Sub23_Sub6.aClass2_2200.method97();
				}

				if (IndexDescriptor.aClass2_1353 != null) {
					IndexDescriptor.aClass2_1353.method97();
				}

				int resp = Class98.loginConnection.read();
				if (CacheableEntry_Sub23_Sub6.aClass2_2200 != null) {
					CacheableEntry_Sub23_Sub6.aClass2_2200.method97();
				}

				if (IndexDescriptor.aClass2_1353 != null) {
					IndexDescriptor.aClass2_1353.method97();
				}

				if (resp != 0) {
					Class58.failWithResponse(resp);
					return;
				}

				GameClient.gameBuffer.pos = 0;
				GameClient.loginStage = 1812721685;
			}

			int var2;
			int var3;
			if (GameClient.loginStage * 638704689 == 5) {
				int[] seed = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
				GameClient.secureBuffer.pos = 0;
				GameClient.secureBuffer.writeByte(1);
				GameClient.secureBuffer.writeByte(NpcFlags.aClass85_68.method34(-914243711));
				GameClient.secureBuffer.writeInt(seed[0]);
				GameClient.secureBuffer.writeInt(seed[1]);
				GameClient.secureBuffer.writeInt(seed[2]);
				GameClient.secureBuffer.writeInt(seed[3]);

				switch (NpcFlags.aClass85_68.anInt1008 * 1595593885) {
				case 0:
					GameClient.secureBuffer.writeInt((Integer) Class15.aClass35_195.aLinkedHashMap475.get(Integer.valueOf(CacheableEntry_Sub23_Sub19.method2828(NpcFlags.aString55))));
					GameClient.secureBuffer.pos += 920886596; // 4
					break;
				case 1:
					GameClient.secureBuffer.pos += 1841773192; // 8
					break;
				case 2:
				case 3:
					GameClient.secureBuffer.writeTriByte(Class107.anInt1499 * 1582697257);
					GameClient.secureBuffer.pos -= 2070117227; // 5
				}

				int a = 1841773192 * 1736753585;
				if (Loader.DEBUG)
					System.out.println(" IT IS " + a);

				GameClient.secureBuffer.writeStr(NpcFlags.password);
				GameClient.secureBuffer.doRsa(Class36.RSA_EXP, Class36.RSA_MOD);

				GameClient.loginBuffer.pos = 0;
				if (GameClient.anInt2868 * -684224463 == 40) {
					GameClient.loginBuffer.writeByte(18);
				} else {
					GameClient.loginBuffer.writeByte(16);
				}

				GameClient.loginBuffer.writeShort(0);
				var2 = GameClient.loginBuffer.pos * 1736753585;

				GameClient.loginBuffer.writeInt(86);
				GameClient.loginBuffer.writeBytes(GameClient.secureBuffer.data, 0, GameClient.secureBuffer.pos * 1736753585);
				var3 = GameClient.loginBuffer.pos * 1736753585;
				GameClient.loginBuffer.writeStr(NpcFlags.aString55);
				GameClient.loginBuffer.writeByte((GameClient.aBool3081 ? 1 : 0) << 1 | (GameClient.aBool2864 ? 1 : 0));
				GameClient.loginBuffer.writeShort(Class5.anInt98 * 2104430923);
				GameClient.loginBuffer.writeShort(Class60.anInt769 * -1064642111);
				Class59.writeRandomDat(GameClient.loginBuffer, -287563413);
				GameClient.loginBuffer.writeStr(GameClient.aString2866);
				GameClient.loginBuffer.writeInt(GameClient.anInt3048 * 742258379);

				DataBuffer machineInfo = new DataBuffer(Class44.myMachine.method2097(-1738009259));
				Class44.myMachine.writeToBuffer(machineInfo, 1991591458);
				GameClient.loginBuffer.writeBytes(machineInfo.data, 0, machineInfo.data.length);

				GameClient.loginBuffer.writeByte(PacketDecoder.param6 * 1424975117);

				GameClient.loginBuffer.writeInt(Class54.aClass94_Sub1_724.crc * -212693501);
				GameClient.loginBuffer.writeInt(Class88.aClass94_Sub1_1046.crc * -212693501);
				GameClient.loginBuffer.writeInt(Class35.index2.crc * -212693501);
				GameClient.loginBuffer.writeInt(Class35.aClass94_Sub1_477.crc * -212693501);
				GameClient.loginBuffer.writeInt(GameClient.aClass94_Sub1_3134.crc * -212693501);
				GameClient.loginBuffer.writeInt(Class126_Sub1.aClass94_Sub1_1643.crc * -212693501);
				GameClient.loginBuffer.writeInt(Class46.aClass94_Sub1_652.crc * -212693501);
				GameClient.loginBuffer.writeInt(Class22.aClass94_Sub1_288.crc * -212693501);
				GameClient.loginBuffer.writeInt(Class18.aClass94_Sub1_217.crc * -212693501);
				GameClient.loginBuffer.writeInt(ScriptInvocation.aClass94_Sub1_1783.crc * -212693501);
				GameClient.loginBuffer.writeInt(IndexDescriptor.aClass94_Sub1_1369.crc * -212693501);
				GameClient.loginBuffer.writeInt(Class44.aClass94_Sub1_634.crc * -212693501);
				GameClient.loginBuffer.writeInt(Connection.aClass94_Sub1_972.crc * -212693501);
				GameClient.loginBuffer.writeInt(Class121.aClass94_Sub1_1553.crc * -212693501);
				GameClient.loginBuffer.writeInt(CacheableEntry_Sub23_Sub16_Sub1.aClass94_Sub1_2502.crc * -212693501);
				GameClient.loginBuffer.writeInt(GameClient.aClass94_Sub1_2928.crc * -212693501);
				if (!Loader.DO_RSA_OR_SMTH)
					GameClient.loginBuffer.method1887(seed, var3, GameClient.loginBuffer.pos * 1736753585);
				GameClient.loginBuffer.writeShortSize(GameClient.loginBuffer.pos * 1736753585 - var2);
				Class98.loginConnection.write(GameClient.loginBuffer.data, 0, GameClient.loginBuffer.pos * 1736753585);
				GameClient.secureBuffer.setIsaacSeed(seed);

				for (int var5 = 0; var5 < 4; var5++) {
					seed[var5] += 50;
				}

				GameClient.gameBuffer.setIsaacSeed(seed);
				GameClient.loginStage = -2119701274;
			}
			if (Loader.DEBUG)
				System.out.println("stage " + GameClient.loginStage * 638704689);

			if (GameClient.loginStage * 638704689 == 6 && Class98.loginConnection.available() > 0) {
				int respo = Class98.loginConnection.read();
				if (respo == 21 && GameClient.anInt2868 * -684224463 == 20) {
					GameClient.loginStage = -1757156937;
				} else if (respo == 2) {
					GameClient.loginStage = -1032068263;
				} else {
					if (respo == 15 && GameClient.anInt2868 * -684224463 == 40) {
						Class66.method890((short) 21061);
						return;
					}

					if (respo == 23 && GameClient.anInt3023 * -857753919 < 1) {
						GameClient.anInt3023 -= 1937123007;
						GameClient.loginStage = 0;
					} else {
						if (respo != 29) {
							Class58.failWithResponse(respo);
							return;
						}

						GameClient.loginStage = -306979589;
					}
				}
			}
			if (Loader.DEBUG)
				System.out.println("stage " + GameClient.loginStage * 638704689);

			if (GameClient.loginStage * 638704689 == 7 && Class98.loginConnection.available() > 0) {
				GameClient.anInt2900 = (Class98.loginConnection.read() + 3) * -1274447284;
				GameClient.loginStage = -1394612600;
			}

			if (GameClient.loginStage * 638704689 == 8) {
				GameClient.anInt2989 = 0;
				CacheableEntry_Sub23_Sub6.setLoginMessages(Class90.aString1092, Class90.aString1100, GameClient.anInt2900 * -104756715 / 60 + Class90.aString1094);
				if ((GameClient.anInt2900 -= 265090365) * -104756715 <= 0) {
					GameClient.loginStage = 0;
				}

			} else {
				if (GameClient.loginStage * 638704689 == 9 && Class98.loginConnection.available() >= 13) {
					boolean var10 = Class98.loginConnection.read() == 1;
					Class98.loginConnection.read(GameClient.gameBuffer.data, 0, 4);
					GameClient.gameBuffer.pos = 0;
					boolean var11 = false;
					if (var10) {
						var2 = GameClient.gameBuffer.readOpcode() << 24;
						var2 |= GameClient.gameBuffer.readOpcode() << 16;
						var2 |= GameClient.gameBuffer.readOpcode() << 8;
						var2 |= GameClient.gameBuffer.readOpcode();
						var3 = CacheableEntry_Sub23_Sub19.method2828(NpcFlags.aString55);
						if (Class15.aClass35_195.aLinkedHashMap475.size() >= 10 && !Class15.aClass35_195.aLinkedHashMap475.containsKey(Integer.valueOf(var3))) {
							Iterator var12 = Class15.aClass35_195.aLinkedHashMap475.entrySet().iterator();
							var12.next();
							var12.remove();
						}

						Class15.aClass35_195.aLinkedHashMap475.put(Integer.valueOf(var3), Integer.valueOf(var2));
						Class74.method1024(-1973222429);
					}

					GameClient.playerRights = Class98.loginConnection.read() * 381650523;
					GameClient.playerRights = 2 * 381650523;
					GameClient.unknown = Class98.loginConnection.read() == 1;
					GameClient.myIndex = Class98.loginConnection.read() * -435565545;
					GameClient.myIndex = (GameClient.myIndex * -1731449945 << 8) * -435565545;
					GameClient.myIndex += Class98.loginConnection.read() * -435565545;
					GameClient.member = Class98.loginConnection.read() * -2078755183;
					Class98.loginConnection.read(GameClient.gameBuffer.data, 0, 1);
					GameClient.gameBuffer.pos = 0;
					GameClient.incomingMessage = GameClient.gameBuffer.readOpcode() * 426797213;
					Class98.loginConnection.read(GameClient.gameBuffer.data, 0, 2);
					GameClient.gameBuffer.pos = 0;
					GameClient.messageSize = GameClient.gameBuffer.readUShort() * 20645833;
					if (GameClient.member * -1090925967 == 1) {
						try {
							Class69.method928(GameClient.aGameClient2857, "zap", 405529889);
						} catch (Throwable var7) {
							;
						}
					} else {
						try {
							Class69.method928(GameClient.aGameClient2857, "unzap", -1944461525);
						} catch (Throwable var6) {
							;
						}
					}

					GameClient.loginStage = -669523926;
				}

				if (GameClient.loginStage * 638704689 != 10) {
					if (GameClient.loginStage * 638704689 == 11 && Class98.loginConnection.available() >= 2) {
						GameClient.gameBuffer.pos = 0;
						Class98.loginConnection.read(GameClient.gameBuffer.data, 0, 2);
						GameClient.gameBuffer.pos = 0;
						Class47.anInt665 = GameClient.gameBuffer.readUShort() * -184802271;
						GameClient.loginStage = 55564748;
					}

					if (GameClient.loginStage * 638704689 == 12 && Class98.loginConnection.available() >= Class47.anInt665 * -42180639) {
						GameClient.gameBuffer.pos = 0;
						Class98.loginConnection.read(GameClient.gameBuffer.data, 0, Class47.anInt665 * -42180639);
						GameClient.gameBuffer.pos = 0;
						String var17 = GameClient.gameBuffer.readString();
						String var15 = GameClient.gameBuffer.readString();
						String var13 = GameClient.gameBuffer.readString();
						CacheableEntry_Sub23_Sub6.setLoginMessages(var17, var15, var13);
						Class93.method1146(10, 1962644446);
					}

					GameClient.anInt2989 += 355091295;
					if (GameClient.anInt2989 * -1088890721 > 2000) {
						if (GameClient.anInt3023 * -857753919 < 1) {
							if (Class51.anInt712 * 751829209 == NpcDef.anInt2239 * -1805689375) {
								Class51.anInt712 = CacheableEntry_Sub23_Sub2.anInt2106 * 191036863;
							} else {
								Class51.anInt712 = NpcDef.anInt2239 * 471081033;
							}

							GameClient.anInt3023 -= 1937123007;
							GameClient.loginStage = 0;
						} else {
							Class58.failWithResponse(-3);
						}
					}
				} else {
					if (Class98.loginConnection.available() >= GameClient.messageSize * 1964753529) {
						GameClient.gameBuffer.pos = 0;
						Class98.loginConnection.read(GameClient.gameBuffer.data, 0, GameClient.messageSize * 1964753529);
						GameClient.aLong2882 = -2561770266170829527L;
						GameClient.anInt3041 = -1183622521;
						Class41.aClass48_588.anInt670 = 0;
						NpcDef.aBool2258 = true;
						GameClient.aBool3061 = true;
						GameClient.aLong3093 = 1468476784576452353L;
						Class118.aClass120_1535 = new Class120();
						GameClient.secureBuffer.pos = 0;
						GameClient.gameBuffer.pos = 0;
						GameClient.incomingMessage = -426797213;
						GameClient.anInt2912 = 1437130987;
						GameClient.anInt2913 = 1540362023;
						GameClient.anInt2916 = 1844699783;
						GameClient.anInt2910 = 0;
						GameClient.anInt2877 = 0;
						GameClient.anInt2915 = 0;
						GameClient.anInt3113 = 0;
						GameClient.menuActionPtr = 0;
						GameClient.aBool3006 = false;
						Class65.method888(0, 1190760194);
						CacheableEntry_Sub23_Sub12.method2517(-455257838);
						GameClient.anInt3018 = 0;
						GameClient.isPickingOption = false;
						GameClient.anInt3075 = 0;
						GameClient.anInt2927 = ((int) (Math.random() * 100.0D) - 50) * -1699939609;
						GameClient.anInt3132 = ((int) (Math.random() * 110.0D) - 55) * -799120519;
						GameClient.anInt2931 = ((int) (Math.random() * 80.0D) - 40) * 1670501287;
						GameClient.anInt2880 = ((int) (Math.random() * 120.0D) - 60) * 1936293557;
						GameClient.anInt2936 = ((int) (Math.random() * 30.0D) - 20) * 598826339;
						GameClient.anInt2948 = ((int) (Math.random() * 20.0D) - 10 & 2047) * -1768657929;
						GameClient.anInt2901 = 0;
						GameClient.anInt3058 = -1611844029;
						GameClient.mapMarkerX = 0;
						GameClient.mapMarkerZ = 0;
						GameClient.aClass42_2887 = Class42.aClass42_604;
						GameClient.anInt3091 = 0;
						GameClient.numLocalNpcs = 0;

						for (var1 = 0; var1 < 2048; var1++) {
							GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var1] = null;
							GameClient.aDataBufferArray2988[var1] = null;
						}

						for (var1 = 0; var1 < 32768; var1++) {
							GameClient.sceneNpcs[var1] = null;
						}

						Player.me = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[2047] = new Player();
						GameClient.anInt2867 = 787648439;
						GameClient.aJagexLinkedList_3000.method1394();
						GameClient.aJagexLinkedList_3001.method1394();

						for (var1 = 0; var1 < 4; var1++) {
							for (var2 = 0; var2 < 104; var2++) {
								for (var3 = 0; var3 < 104; var3++) {
									GameClient.aJagexLinkedListArrayArrayArray2998[var1][var2][var3] = null;
								}
							}
						}

						GameClient.aJagexLinkedList_2999 = new JagexLinkedList();
						GameClient.anInt2898 = 0;
						GameClient.anInt2984 = 0;
						GameClient.anInt3138 = 0;

						for (var1 = 0; var1 < CacheableEntry_Sub23_Sub7.anInt2212 * -1601269221; var1++) {
							CacheableEntry_Sub23_Sub7 var14 = CacheableEntry_Sub23_Sub16_Sub3.method2967(var1, (byte) -117);
							if (var14 != null) {
								Class106.anIntArray1476[var1] = 0;
								Class106.varps[var1] = 0;
							}
						}

						for (var1 = 0; var1 < GameClient.anIntArray3063.length; var1++) {
							GameClient.anIntArray3063[var1] = -1;
						}

						GameClient.anInt2922 = -1834997571;
						if (GameClient.activeRoot * 1787246131 != -1) {
							Class99.method1256(GameClient.activeRoot * 1787246131, -1054071198);
						}

						for (LinkedEntry_Sub13 var16 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.method1537(); var16 != null; var16 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.method1543()) {
							CacheableEntry_Sub23_Sub6.method2374(var16, true, 1345746199);
						}

						GameClient.activeRoot = 1855539973;
						GameClient.aJagexMap_3073 = new JagexMap(8);
						GameClient.aInterfaceDef_3029 = null;
						GameClient.aBool3006 = false;
						GameClient.menuActionPtr = 0;
						GameClient.aClass108_3140.method1345((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1, (byte) -40);

						for (var1 = 0; var1 < 8; var1++) {
							GameClient.aStringArray2994[var1] = null;
							GameClient.aBoolArray3008[var1] = false;
						}

						Class84.setupContainerMap();
						GameClient.aBool2953 = true;

						for (var1 = 0; var1 < 100; var1++) {
							GameClient.aBoolArray3072[var1] = true;
						}

						GameClient.secureBuffer.writeOpcode(141);
						GameClient.secureBuffer.writeByte(LinkedEntry_Sub5_Sub4.method2933(889111020));
						GameClient.secureBuffer.writeShort(Class5.anInt98 * 2104430923);
						GameClient.secureBuffer.writeShort(Class60.anInt769 * -1064642111);
						GameClient.aString3090 = null;
						Class41.anInt585 = 0;
						Class54.aClass109_Sub8Array728 = null;

						for (var1 = 0; var1 < 8; var1++) {
							GameClient.grandExchangeOffers[var1] = new GrandExchangeOffer();
						}

						Class19.aClass133_234 = null;
						CacheableEntry_Sub23_Sub11.anInt2336 = 1338229385;
						Class2.method101(false);
						GameClient.incomingMessage = -426797213;
					}

				}
			}
		} catch (IOException var8) {
			if (GameClient.anInt3023 * -857753919 < 1) {
				if (NpcDef.anInt2239 * -1805689375 == Class51.anInt712 * 751829209) {
					Class51.anInt712 = CacheableEntry_Sub23_Sub2.anInt2106 * 191036863;
				} else {
					Class51.anInt712 = NpcDef.anInt2239 * 471081033;
				}

				GameClient.anInt3023 -= 1937123007;
				GameClient.loginStage = 0;
			} else {
				Class58.failWithResponse(-2);
			}
		}
	}

}
