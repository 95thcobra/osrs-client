import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.Iterator;

public class CacheableEntry_Sub23_Sub16_Sub7 extends CacheableEntry_Sub23_Sub16 {

	static Connection aConnection_2770;
	static int anInt2774;
	static int anInt2779;
	static final int anInt2780 = 24;
	public static LinkedEntry_Sub17 aClass109_Sub17_2781;
	public static final int anInt2782 = 111;
	int anInt2776;
	int anInt2773;
	AnimationSequence aClass109_Sub23_Sub4_2778;
	int anInt2777;
	int anInt2769;
	int anInt2775;
	int anInt2771;
	int anInt2772;
	int anInt2768;

	static void method3296(int var0, boolean var1, int var2, boolean var3, int var4) {
		if (Class4.aClass51Array80 != null) {
			Class91.method1126(0, Class4.aClass51Array80.length - 1, var0, var1, var2, var3, (byte) 0);
		}

	}

	protected final CacheableEntry_Sub23_Sub16_Sub5 method2791(int var1) {
		if (aClass109_Sub23_Sub4_2778 != null) {
			int var2 = GameClient.cycle * 1026470457 - anInt2776 * 232977877;
			if (var2 > 100 && aClass109_Sub23_Sub4_2778.anInt2182 * -730053273 > 0) {
				var2 = 100;
			}

			label64:
			{
				do {
					do {
						if (var2 <= aClass109_Sub23_Sub4_2778.anIntArray2183[anInt2773 * 1177933807]) {
							break label64;
						}

						var2 -= aClass109_Sub23_Sub4_2778.anIntArray2183[anInt2773 * 1177933807];
						anInt2773 -= 1312016625;
					} while (anInt2773 * 1177933807 < aClass109_Sub23_Sub4_2778.anIntArray2169.length);

					anInt2773 -= aClass109_Sub23_Sub4_2778.anInt2182 * -1421528567;
				}
				while (anInt2773 * 1177933807 >= 0 && anInt2773 * 1177933807 < aClass109_Sub23_Sub4_2778.anIntArray2169.length);

				aClass109_Sub23_Sub4_2778 = null;
			}

			anInt2776 = (GameClient.cycle * 1026470457 - var2) * 1425972093;
		}

		ObjectDef var13 = Class56.getObjectDef(anInt2777 * -997778447);
		if (var13.anIntArray2299 != null) {
			var13 = var13.method2433(-415230102);
		}

		if (var13 == null) {
			return null;
		} else {
			int var3;
			int var7;
			if (anInt2775 * -1419052347 != 1 && anInt2775 * -1419052347 != 3) {
				var7 = var13.anInt2277 * 1832905927;
				var3 = var13.anInt2274 * 1221908201;
			} else {
				var7 = var13.anInt2274 * 1221908201;
				var3 = var13.anInt2277 * 1832905927;
			}

			int var10 = (var7 >> 1) + anInt2772 * -526863773;
			int var11 = anInt2772 * -526863773 + (1 + var7 >> 1);
			int var5 = anInt2768 * -1950454251 + (var3 >> 1);
			int var12 = (var3 + 1 >> 1) + anInt2768 * -1950454251;
			int[][] var6 = Class32.mapSquareHeights[anInt2771 * -1063916643];
			int var9 = var6[var11][var12] + var6[var10][var12] + var6[var11][var5] + var6[var10][var5] >> 2;
			int var8 = (anInt2772 * -526863773 << 7) + (var7 << 6);
			int var4 = (var3 << 6) + (anInt2768 * -1950454251 << 7);
			return var13.method2431(anInt2769 * -2011819951, anInt2775 * -1419052347, var6, var8, var9, var4, aClass109_Sub23_Sub4_2778, anInt2773 * 1177933807, (byte) 46);
		}
	}

	static final void method3297(int var0) {
		if (GameClient.anInt2877 * 1777370383 > 1) {
			GameClient.anInt2877 += 833238545;
		}

		if (GameClient.anInt2915 * 790809277 > 0) {
			GameClient.anInt2915 -= 1069547669;
		}

		if (GameClient.aBool3142) {
			GameClient.aBool3142 = false;
			Class58.method802(-1124316003);
		} else {
			if (!GameClient.aBool3006) {
				GameClient.menuOptions[0] = Class90.aString1245;
				GameClient.menuOptionTexts[0] = "";
				GameClient.menuCommands[0] = 1006;
				GameClient.menuActionPtr = -439682997;
			}

			int var1;
			for (var1 = 0; var1 < 100 && PacketDecoder.method389(99986753); var1++) {
				;
			}

			if (GameClient.anInt2868 * -684224463 == 30) {
				while (true) {
					LinkedEntry_Sub21 var2 = (LinkedEntry_Sub21) Class118.aClass120_1535.method1498();
					boolean var24;
					if (var2 == null) {
						var24 = false;
					} else {
						var24 = true;
					}

					int var25;
					if (!var24) {
						Object var26 = Class41.aClass48_588.anObject669;
						int var3;
						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						synchronized (var26) {
							if (!GameClient.aBool2935) {
								Class41.aClass48_588.anInt670 = 0;
							} else if (Class74.anInt903 * 332680755 != 0 || Class41.aClass48_588.anInt670 * 1467290427 >= 40) {
								GameClient.secureBuffer.writeOpcode(46);
								GameClient.secureBuffer.writeByte(0);
								var25 = GameClient.secureBuffer.pos * 1736753585;
								var3 = 0;

								for (var4 = 0; var4 < Class41.aClass48_588.anInt670 * 1467290427 && GameClient.secureBuffer.pos * 1736753585 - var25 < 240; var4++) {
									++var3;
									var5 = Class41.aClass48_588.anIntArray676[var4];
									if (var5 < 0) {
										var5 = 0;
									} else if (var5 > 502) {
										var5 = 502;
									}

									var6 = Class41.aClass48_588.anIntArray679[var4];
									if (var6 < 0) {
										var6 = 0;
									} else if (var6 > 764) {
										var6 = 764;
									}

									var7 = var5 * 765 + var6;
									if (Class41.aClass48_588.anIntArray676[var4] == -1 && Class41.aClass48_588.anIntArray679[var4] == -1) {
										var6 = -1;
										var5 = -1;
										var7 = 524287;
									}

									if (var6 == GameClient.anInt2949 * 2119156689 && var5 == GameClient.anInt3021 * -121615191) {
										if (GameClient.anInt3041 * -272517943 < 2047) {
											GameClient.anInt3041 += 1183622521;
										}
									} else {
										var8 = var6 - GameClient.anInt2949 * 2119156689;
										GameClient.anInt2949 = var6 * -357731023;
										var9 = var5 - GameClient.anInt3021 * -121615191;
										GameClient.anInt3021 = var5 * -1290332263;
										if (GameClient.anInt3041 * -272517943 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
											var8 += 32;
											var9 += 32;
											GameClient.secureBuffer.writeShort((GameClient.anInt3041 * -272517943 << 12) + (var8 << 6) + var9);
											GameClient.anInt3041 = 0;
										} else if (GameClient.anInt3041 * -272517943 < 8) {
											GameClient.secureBuffer.writeTriByte((GameClient.anInt3041 * -272517943 << 19) + 8388608 + var7);
											GameClient.anInt3041 = 0;
										} else {
											GameClient.secureBuffer.writeInt(var7 + ((GameClient.anInt3041 * -272517943 << 19) - 1073741824));
											GameClient.anInt3041 = 0;
										}
									}
								}

								GameClient.secureBuffer.method1866(GameClient.secureBuffer.pos * 1736753585 - var25);
								if (var3 >= Class41.aClass48_588.anInt670 * 1467290427) {
									Class41.aClass48_588.anInt670 = 0;
								} else {
									Class41.aClass48_588.anInt670 -= var3 * -1310568973;

									for (var4 = 0; var4 < Class41.aClass48_588.anInt670 * 1467290427; var4++) {
										Class41.aClass48_588.anIntArray679[var4] = Class41.aClass48_588.anIntArray679[var4 + var3];
										Class41.aClass48_588.anIntArray676[var4] = Class41.aClass48_588.anIntArray676[var3 + var4];
									}
								}
							}
						}

						if (Class74.anInt903 * 332680755 == 1 || !Class46.aBool651 && Class74.anInt903 * 332680755 == 4 || Class74.anInt903 * 332680755 == 2) {
							long var11 = (Class74.aLong906 * 2897677675691321901L - GameClient.aLong2882 * 4100527249519372519L) / 50L;
							if (var11 > 4095L) {
								var11 = 4095L;
							}

							GameClient.aLong2882 = 5371195094577630667L * Class74.aLong906;
							var3 = Class74.anInt905 * -1013575437;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > Class60.anInt769 * -1064642111) {
								var3 = Class60.anInt769 * -1064642111;
							}

							var4 = Class74.anInt891 * 1837550337;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > Class5.anInt98 * 2104430923) {
								var4 = Class5.anInt98 * 2104430923;
							}

							var5 = (int) var11;
							GameClient.secureBuffer.writeOpcode(112);
							GameClient.secureBuffer.writeShort((Class74.anInt903 * 332680755 == 2 ? 1 : 0) + (var5 << 1));
							GameClient.secureBuffer.writeShort(var4);
							GameClient.secureBuffer.writeShort(var3);
						}

						if (Class65.anInt827 * 81863853 > 0) {
							GameClient.secureBuffer.writeOpcode(148);
							GameClient.secureBuffer.writeShort(0);
							var1 = GameClient.secureBuffer.pos * 1736753585;
							long var13 = Class10.method216((short) 255);

							for (var4 = 0; var4 < Class65.anInt827 * 81863853; var4++) {
								long var15 = var13 - 4213148856860628735L * GameClient.aLong3093;
								if (var15 > 16777215L) {
									var15 = 16777215L;
								}

								GameClient.aLong3093 = -1468476784576452353L * var13;
								GameClient.secureBuffer.method1956((int) var15);
								GameClient.secureBuffer.writeByteN(Class65.anIntArray826[var4]);
							}

							GameClient.secureBuffer.writeShortSize(GameClient.secureBuffer.pos * 1736753585 - var1);
						}

						if (GameClient.anInt3013 * -1031864773 > 0) {
							GameClient.anInt3013 += 62051597;
						}

						if (Class65.aBoolArray820[96] || Class65.aBoolArray820[97] || Class65.aBoolArray820[98] || Class65.aBoolArray820[99]) {
							GameClient.aBool3007 = true;
						}

						if (GameClient.aBool3007 && GameClient.anInt3013 * -1031864773 <= 0) {
							GameClient.anInt3013 = -1241031940;
							GameClient.aBool3007 = false;
							GameClient.secureBuffer.writeOpcode(101);
							GameClient.secureBuffer.writeShortA(GameClient.anInt2947 * 1608861963);
							GameClient.secureBuffer.writeShort(GameClient.anInt2948 * -1072839225);
						}

						if (NpcDef.aBool2258 && !GameClient.aBool3061) {
							GameClient.aBool3061 = true;
							GameClient.secureBuffer.writeOpcode(153);
							GameClient.secureBuffer.writeByte(1);
						}

						if (!NpcDef.aBool2258 && GameClient.aBool3061) {
							GameClient.aBool3061 = false;
							GameClient.secureBuffer.writeOpcode(153);
							GameClient.secureBuffer.writeByte(0);
						}

						Class93.method1147(-2088216951);
						if (GameClient.anInt2868 * -684224463 != 30) {
							return;
						}

						for (LinkedEntry_Sub6 var28 = (LinkedEntry_Sub6) GameClient.aJagexLinkedList_2999.method1405(); var28 != null; var28 = (LinkedEntry_Sub6) GameClient.aJagexLinkedList_2999.method1402()) {
							if (var28.anInt1728 * -786095411 > 0) {
								var28.anInt1728 -= 917740037;
							}

							boolean var27;
							ObjectDef var33;
							if (var28.anInt1728 * -786095411 == 0) {
								if (var28.anInt1721 * -739777929 >= 0) {
									var3 = var28.anInt1721 * -739777929;
									var4 = var28.anInt1730 * 143862221;
									var33 = Class56.getObjectDef(var3);
									if (var4 == 11) {
										var4 = 10;
									}

									if (var4 >= 5 && var4 <= 8) {
										var4 = 4;
									}

									var27 = var33.method2464(var4, (byte) 72);
									if (!var27) {
										continue;
									}
								}

								CacheableEntry_Sub23_Sub12.method2518(var28.anInt1717 * -1806974757, var28.anInt1718 * -794083855, var28.anInt1723 * 754007907, var28.anInt1729 * 1618190275, var28.anInt1721 * -739777929, var28.anInt1722 * 707452421, var28.anInt1730 * 143862221, (byte) 104);
								var28.unlink();
							} else {
								if (var28.anInt1727 * -1170527733 > 0) {
									var28.anInt1727 -= 1930203555;
								}

								if (var28.anInt1727 * -1170527733 == 0 && var28.anInt1723 * 754007907 >= 1 && var28.anInt1729 * 1618190275 >= 1 && var28.anInt1723 * 754007907 <= 102 && var28.anInt1729 * 1618190275 <= 102) {
									if (var28.anInt1720 * -603699911 >= 0) {
										var3 = var28.anInt1720 * -603699911;
										var4 = var28.anInt1724 * -1017767681;
										var33 = Class56.getObjectDef(var3);
										if (var4 == 11) {
											var4 = 10;
										}

										if (var4 >= 5 && var4 <= 8) {
											var4 = 4;
										}

										var27 = var33.method2464(var4, (byte) -44);
										if (!var27) {
											continue;
										}
									}

									CacheableEntry_Sub23_Sub12.method2518(var28.anInt1717 * -1806974757, var28.anInt1718 * -794083855, var28.anInt1723 * 754007907, var28.anInt1729 * 1618190275, var28.anInt1720 * -603699911, var28.anInt1725 * -1276256461, var28.anInt1724 * -1017767681, (byte) 29);
									var28.anInt1727 = -1930203555;
									if (var28.anInt1721 * -739777929 == var28.anInt1720 * -603699911 && var28.anInt1721 * -739777929 == -1) {
										var28.unlink();
									} else if (var28.anInt1720 * -603699911 == var28.anInt1721 * -739777929 && var28.anInt1725 * -1276256461 == var28.anInt1722 * 707452421 && var28.anInt1724 * -1017767681 == var28.anInt1730 * 143862221) {
										var28.unlink();
									}
								}
							}
						}

						Class48.method706((byte) 4);
						GameClient.anInt2910 += 634560661;
						if (GameClient.anInt2910 * -1278530883 > 750) {
							Class58.method802(-1124316003);
							return;
						}

						Player var29;
						for (var1 = -1; var1 < GameClient.anInt3091 * -796710281; var1++) {
							if (var1 == -1) {
								var25 = 2047;
							} else {
								var25 = GameClient.anIntArray3107[var1];
							}

							var29 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var25];
							if (var29 != null) {
								Class41.method672(var29, 1, 2015254313);
							}
						}

						CacheableEntry_Sub23_Sub7.method2393((byte) 26);

						for (var1 = -1; var1 < GameClient.anInt3091 * -796710281; var1++) {
							if (var1 == -1) {
								var25 = 2047;
							} else {
								var25 = GameClient.anIntArray3107[var1];
							}

							var29 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var25];
							if (var29 != null && var29.anInt2511 * -1182929285 > 0) {
								var29.anInt2511 += 43859789;
								if (var29.anInt2511 * -1182929285 == 0) {
									var29.aString2523 = null;
								}
							}
						}

						for (var1 = 0; var1 < GameClient.numLocalNpcs * 1974577941; var1++) {
							var25 = GameClient.npcIndices[var1];
							Npc var32 = GameClient.sceneNpcs[var25];
							if (var32 != null && var32.anInt2511 * -1182929285 > 0) {
								var32.anInt2511 += 43859789;
								if (var32.anInt2511 * -1182929285 == 0) {
									var32.aString2523 = null;
								}
							}
						}

						GameClient.anInt2939 += 1025500629;
						if (GameClient.anInt2973 * 27331731 != 0) {
							GameClient.anInt2972 += 1858266516;
							if (GameClient.anInt2972 * 822284833 >= 400) {
								GameClient.anInt2973 = 0;
							}
						}

						if (Class71.aInterfaceDef_862 != null) {
							GameClient.anInt2974 -= 1024681153;
							if (GameClient.anInt2974 * 756602047 >= 15) {
								Class35.method484(Class71.aInterfaceDef_862, -1036434927);
								Class71.aInterfaceDef_862 = null;
							}
						}

						InterfaceDef var30 = Class6.aInterfaceDef_103;
						InterfaceDef var31 = Class21.aInterfaceDef_260;
						Class6.aInterfaceDef_103 = null;
						Class21.aInterfaceDef_260 = null;
						GameClient.aInterfaceDef_3042 = null;
						GameClient.aBool3046 = false;
						GameClient.aBool3043 = false;
						GameClient.anInt2858 = 0;

						while (Class6.method153((byte) 0) && GameClient.anInt2858 * 858685769 < 128) {
							if (GameClient.playerRights * -624018989 >= 2 && Class65.aBoolArray820[82] && Class47.anInt661 * 875997027 == 66) {
								String var41 = "";

								CacheableEntry_Sub23_Sub12 var34;
								for (Iterator var35 = PacketDecoder.aClass122_336.iterator(); var35.hasNext(); var41 = var41 + var34.aString2343 + ':' + var34.aString2345 + '\n') {
									var34 = (CacheableEntry_Sub23_Sub12) var35.next();
								}

								PacketDecoder.aClipboard339.setContents(new StringSelection(var41), (ClipboardOwner) null);
							} else {
								GameClient.anIntArray3092[GameClient.anInt2858 * 858685769] = Class47.anInt661 * 875997027;
								GameClient.anIntArray2976[GameClient.anInt2858 * 858685769] = Class41.aChar594;
								GameClient.anInt2858 -= 840810247;
							}
						}

						var3 = GameClient.activeRoot * 1787246131;
						var4 = Class5.anInt98 * 2104430923;
						var5 = Class60.anInt769 * -1064642111;
						if (ItemContainer.method1840(var3)) {
							Class24.method354(InterfaceDef.aInterfaceDefArrayArray1975[var3], -1, 0, 0, var4, var5, 0, 0, (byte) -1);
						}

						GameClient.anInt3050 -= 718730433;

						while (true) {
							ScriptInvocation var36;
							InterfaceDef var37;
							InterfaceDef var38;
							do {
								var36 = (ScriptInvocation) GameClient.aJagexLinkedList_3067.method1399();
								if (var36 == null) {
									while (true) {
										do {
											var36 = (ScriptInvocation) GameClient.aJagexLinkedList_3068.method1399();
											if (var36 == null) {
												while (true) {
													do {
														var36 = (ScriptInvocation) GameClient.scriptInvocationQueue.method1399();
														if (var36 == null) {
															LinkedEntry_Sub8.method1832((byte) 62);
															if (GameClient.aInterfaceDef_3038 != null) {
																GameClient.method3793(-865322127);
															}

															if (CacheableEntry_Sub23_Sub17.aInterfaceDef_2418 != null) {
																Class35.method484(CacheableEntry_Sub23_Sub17.aInterfaceDef_2418, -78817702);
																GameClient.anInt2981 -= 1668586499;
																if (Class74.anInt896 * 445478637 == 0) {
																	if (GameClient.aBool3109) {
																		if (CacheableEntry_Sub23_Sub17.aInterfaceDef_2418 == Class41.aInterfaceDef_596 && GameClient.anInt2979 * 1169293109 != GameClient.anInt3049 * -1636511263) {
																			InterfaceDef inter = CacheableEntry_Sub23_Sub17.aInterfaceDef_2418;
																			byte var40 = 0;
																			if (GameClient.anInt3104 * -297298743 == 1 && inter.anInt1943 * -202095703 == 206) {
																				var40 = 1;
																			}

																			if (inter.itemIds[GameClient.anInt2979 * 1169293109] <= 0) {
																				var40 = 0;
																			}

																			if (Class4.hasDraggableSetting(LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(inter))) {
																				var8 = GameClient.anInt3049 * -1636511263;
																				var9 = GameClient.anInt2979 * 1169293109;
																				inter.itemIds[var9] = inter.itemIds[var8];
																				inter.itemAmounts[var9] = inter.itemAmounts[var8];
																				inter.itemIds[var8] = -1;
																				inter.itemAmounts[var8] = 0;
																			} else if (var40 == 1) {
																				var8 = GameClient.anInt3049 * -1636511263;
																				var9 = GameClient.anInt2979 * 1169293109;

																				while (var9 != var8) {
																					if (var8 > var9) {
																						inter.shiftItems(var8 - 1, var8);
																						--var8;
																					} else if (var8 < var9) {
																						inter.shiftItems(var8 + 1, var8);
																						++var8;
																					}
																				}
																			} else {
																				inter.shiftItems(GameClient.anInt2979 * 1169293109, GameClient.anInt3049 * -1636511263);
																			}

																			GameClient.secureBuffer.writeOpcode(190);
																			GameClient.secureBuffer.writeShort(GameClient.anInt3049 * -1636511263);//from
																			GameClient.secureBuffer.writeByte(var40);
																			GameClient.secureBuffer.writeShortLE(GameClient.anInt2979 * 1169293109);//to
																			GameClient.secureBuffer.writeIntv2(CacheableEntry_Sub23_Sub17.aInterfaceDef_2418.hash * 1582464481);
																		}
																	} else if ((GameClient.anInt3005 * -696348949 == 1 || GameClient.method3792(GameClient.menuActionPtr * 1324290403 - 1, (byte) 1)) && GameClient.menuActionPtr * 1324290403 > 2) {
																		CacheableEntry_Sub23_Sub16_Sub4.method3067(GameClient.anInt2977 * 302755351, GameClient.anInt2978 * 757042921, -1704451650);
																	} else if (GameClient.menuActionPtr * 1324290403 > 0) {
																		Class29.method395(GameClient.anInt2977 * 302755351, GameClient.anInt2978 * 757042921, 2025742685);
																	}

																	GameClient.anInt2974 = -1656876938;
																	Class74.anInt903 = 0;
																	CacheableEntry_Sub23_Sub17.aInterfaceDef_2418 = null;
																} else if (GameClient.anInt2981 * 1856246101 >= 5 && (Class74.anInt897 * -1031552075 > GameClient.anInt2977 * 302755351 + 5 || Class74.anInt897 * -1031552075 < GameClient.anInt2977 * 302755351 - 5 || Class74.anInt898 * 1941423145 > GameClient.anInt2978 * 757042921 + 5 || Class74.anInt898 * 1941423145 < GameClient.anInt2978 * 757042921 - 5)) {
																	GameClient.aBool3109 = true;
																}
															}

															if (Class39.anInt545 != -1) {
																var6 = Class39.anInt545;
																var7 = Class39.anInt520;
																GameClient.secureBuffer.writeOpcode(202);
																GameClient.secureBuffer.writeByte(5);
																GameClient.secureBuffer.writeByteN(Class65.aBoolArray820[82] ? (Class65.aBoolArray820[81] ? 2 : 1) : 0);
																GameClient.secureBuffer.writeShortA(var7 + LinkedEntry_Sub13.anInt1825 * 803568843);
																GameClient.secureBuffer.writeLEShortA(Class35.anInt478 * -1719983039 + var6);
																Class39.anInt545 = -1;
																GameClient.anInt2970 = Class74.anInt891 * 826736851;
																GameClient.anInt2971 = Class74.anInt905 * 1481500837;
																GameClient.anInt2973 = 1579020699;
																GameClient.anInt2972 = 0;
																GameClient.mapMarkerX = var6 * -2075522063;
																GameClient.mapMarkerZ = var7 * -700155223;
															}

															if (var30 != Class6.aInterfaceDef_103) {
																if (var30 != null) {
																	Class35.method484(var30, -2133661054);
																}

																if (Class6.aInterfaceDef_103 != null) {
																	Class35.method484(Class6.aInterfaceDef_103, -404682894);
																}
															}

															if (Class21.aInterfaceDef_260 != var31 && GameClient.anInt2859 * -486881813 == GameClient.anInt3017 * -886888511) {
																if (var31 != null) {
																	Class35.method484(var31, -1074086983);
																}

																if (Class21.aInterfaceDef_260 != null) {
																	Class35.method484(Class21.aInterfaceDef_260, 159990056);
																}
															}

															if (Class21.aInterfaceDef_260 != null) {
																if (GameClient.anInt2859 * -486881813 < GameClient.anInt3017 * -886888511) {
																	GameClient.anInt2859 -= 1586742589;
																	if (GameClient.anInt2859 * -486881813 == GameClient.anInt3017 * -886888511) {
																		Class35.method484(Class21.aInterfaceDef_260, -1859945191);
																	}
																}
															} else if (GameClient.anInt2859 * -486881813 > 0) {
																GameClient.anInt2859 += 1586742589;
															}

															var6 = Player.me.anInt2521 * -1051150961 + GameClient.anInt2927 * 895187159;
															var7 = Player.me.anInt2505 * -844883935 + GameClient.anInt3132 * 1521718985;
															if (RuntimeException_Sub1.anInt2783 * 1220633301 - var6 < -500 || RuntimeException_Sub1.anInt2783 * 1220633301 - var6 > 500 || LinkedEntry_Sub5_Sub3.anInt2454 * -307703921 - var7 < -500 || LinkedEntry_Sub5_Sub3.anInt2454 * -307703921 - var7 > 500) {
																RuntimeException_Sub1.anInt2783 = var6 * 664454781;
																LinkedEntry_Sub5_Sub3.anInt2454 = var7 * -910069905;
															}

															if (RuntimeException_Sub1.anInt2783 * 1220633301 != var6) {
																RuntimeException_Sub1.anInt2783 += (var6 - RuntimeException_Sub1.anInt2783 * 1220633301) / 16 * 664454781;
															}

															if (var7 != LinkedEntry_Sub5_Sub3.anInt2454 * -307703921) {
																LinkedEntry_Sub5_Sub3.anInt2454 += (var7 - LinkedEntry_Sub5_Sub3.anInt2454 * -307703921) / 16 * -910069905;
															}

															if (Class74.anInt896 * 445478637 == 4 && Class46.aBool651) {
																var8 = Class74.anInt898 * 1941423145 - GameClient.anInt2952 * 1339067343;
																GameClient.anInt2950 = var8 * 1567445826;
																GameClient.anInt2952 = 1592826671 * (var8 != -1 && var8 != 1 ? (Class74.anInt898 * 1941423145 + GameClient.anInt2952 * 1339067343) / 2 : Class74.anInt898 * 1941423145);
																var9 = GameClient.anInt3059 * 1206638939 - Class74.anInt897 * -1031552075;
																GameClient.anInt2940 = var9 * -1378477786;
																GameClient.anInt3059 = (var9 != -1 && var9 != 1 ? (GameClient.anInt3059 * 1206638939 + Class74.anInt897 * -1031552075) / 2 : Class74.anInt897 * -1031552075) * 1453371091;
															} else {
																if (Class65.aBoolArray820[96]) {
																	GameClient.anInt2940 += (-24 - GameClient.anInt2940 * 1415836059) / 2 * 1458244755;
																} else if (Class65.aBoolArray820[97]) {
																	GameClient.anInt2940 += (24 - GameClient.anInt2940 * 1415836059) / 2 * 1458244755;
																} else {
																	GameClient.anInt2940 = GameClient.anInt2940 * 1415836059 / 2 * 1458244755;
																}

																if (Class65.aBoolArray820[98]) {
																	GameClient.anInt2950 += (12 - GameClient.anInt2950 * 152271457) / 2 * 783722913;
																} else if (Class65.aBoolArray820[99]) {
																	GameClient.anInt2950 += (-12 - GameClient.anInt2950 * 152271457) / 2 * 783722913;
																} else {
																	GameClient.anInt2950 = GameClient.anInt2950 * 152271457 / 2 * 783722913;
																}

																GameClient.anInt2952 = Class74.anInt898 * 1995560583;
																GameClient.anInt3059 = Class74.anInt897 * 12538927;
															}

															GameClient.anInt2948 = (GameClient.anInt2940 * 1415836059 / 2 + GameClient.anInt2948 * -1072839225 & 2047) * -1768657929;
															GameClient.anInt2947 += GameClient.anInt2950 * 152271457 / 2 * -1054721373;
															if (GameClient.anInt2947 * 1608861963 < 128) {
																GameClient.anInt2947 = -1860349568;
															}

															if (GameClient.anInt2947 * 1608861963 > 383) {
																GameClient.anInt2947 = -231360035;
															}

															var8 = RuntimeException_Sub1.anInt2783 * 1220633301 >> 7;
															var9 = LinkedEntry_Sub5_Sub3.anInt2454 * -307703921 >> 7;
															int var10 = NpcDef.method2423(RuntimeException_Sub1.anInt2783 * 1220633301, LinkedEntry_Sub5_Sub3.anInt2454 * -307703921, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, -1847964236);
															int var17 = 0;
															int var18;
															if (var8 > 3 && var9 > 3 && var8 < 100 && var9 < 100) {
																for (var18 = var8 - 4; var18 <= 4 + var8; var18++) {
																	for (int var19 = var9 - 4; var19 <= 4 + var9; var19++) {
																		int var20 = CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619;
																		if (var20 < 3 && (Class32.mapSettings[1][var18][var19] & 2) == 2) {
																			++var20;
																		}

																		int var21 = var10 - Class32.mapSquareHeights[var20][var18][var19];
																		if (var21 > var17) {
																			var17 = var21;
																		}
																	}
																}
															}

															var18 = var17 * 192;
															if (var18 > 98048) {
																var18 = 98048;
															}

															if (var18 < 32768) {
																var18 = 32768;
															}

															if (var18 > GameClient.anInt2955 * 1355677181) {
																GameClient.anInt2955 += (var18 - GameClient.anInt2955 * 1355677181) / 24 * 575129429;
															} else if (var18 < GameClient.anInt2955 * 1355677181) {
																GameClient.anInt2955 += (var18 - GameClient.anInt2955 * 1355677181) / 80 * 575129429;
															}

															if (GameClient.aBool3083) {
																Npc.method3395(1922739140);
															}

															for (var6 = 0; var6 < 5; var6++) {
																++GameClient.anIntArray3120[var6];
															}

															var6 = Class63_Sub1.method2091(1047312202);
															var7 = Class65.anInt831 * -1749813373;
															if (var6 > 15000 && var7 > 15000) {
																GameClient.anInt2915 = 1098944898;
																Class65.method888(14500, -1907240865);
																GameClient.secureBuffer.writeOpcode(58);
															}

															GameClient.anInt2933 -= 313931489;
															if (GameClient.anInt2933 * 1201042143 > 500) {
																GameClient.anInt2933 = 0;
																var9 = (int) (Math.random() * 8.0D);
																if ((var9 & 1) == 1) {
																	GameClient.anInt2927 += GameClient.anInt3100 * 2125379875;
																}

																if ((var9 & 2) == 2) {
																	GameClient.anInt3132 += GameClient.anInt3028 * 175688279;
																}

																if ((var9 & 4) == 4) {
																	GameClient.anInt2931 += GameClient.anInt3051 * -1834363803;
																}
															}

															if (GameClient.anInt2927 * 895187159 < -50) {
																GameClient.anInt3100 = 993942234;
															}

															if (GameClient.anInt2927 * 895187159 > 50) {
																GameClient.anInt3100 = -993942234;
															}

															if (GameClient.anInt3132 * 1521718985 < -55) {
																GameClient.anInt3028 = -849707682;
															}

															if (GameClient.anInt3132 * 1521718985 > 55) {
																GameClient.anInt3028 = 849707682;
															}

															if (GameClient.anInt2931 * 823763991 < -40) {
																GameClient.anInt3051 = 1630497051;
															}

															if (GameClient.anInt2931 * 823763991 > 40) {
																GameClient.anInt3051 = -1630497051;
															}

															GameClient.anInt2938 -= 141465501;
															if (GameClient.anInt2938 * -1657513653 > 500) {
																GameClient.anInt2938 = 0;
																var9 = (int) (Math.random() * 8.0D);
																if ((var9 & 1) == 1) {
																	GameClient.anInt2880 += GameClient.anInt3064 * 581496885;
																}

																if ((var9 & 2) == 2) {
																	GameClient.anInt2936 += GameClient.anInt2937 * -642661791;
																}
															}

															if (GameClient.anInt2880 * 1847328669 < -60) {
																GameClient.anInt3064 = 87705858;
															}

															if (GameClient.anInt2880 * 1847328669 > 60) {
																GameClient.anInt3064 = -87705858;
															}

															if (GameClient.anInt2936 * 461573195 < -20) {
																GameClient.anInt2937 = 1679310403;
															}

															if (GameClient.anInt2936 * 461573195 > 10) {
																GameClient.anInt2937 = -1679310403;
															}

															for (Class126_Sub1 var42 = (Class126_Sub1) GameClient.aClass115_2892.method1452(); var42 != null; var42 = (Class126_Sub1) GameClient.aClass115_2892.method1456()) {
																if ((long) (var42.anInt1651 * 1588448769) < Class10.method216((short) 255) / 1000L - 5L) {
																	if (var42.aShort1645 > 0) {
																		Class93.method1145(5, "", var42.aString1644 + Class90.aString1203);
																	}

																	if (var42.aShort1645 == 0) {
																		Class93.method1145(5, "", var42.aString1644 + Class90.aString1204);
																	}

																	var42.method1564();
																}
															}

															GameClient.anInt2911 -= 1630754957;
															if (GameClient.anInt2911 * 1616238011 > 50) {
																GameClient.secureBuffer.writeOpcode(25);
															}

															try {
																if (Class98.loginConnection != null && GameClient.secureBuffer.pos * 1736753585 > 0) {
																	Class98.loginConnection.write(GameClient.secureBuffer.data, 0, GameClient.secureBuffer.pos * 1736753585);
																	GameClient.secureBuffer.pos = 0;
																	GameClient.anInt2911 = 0;
																}
															} catch (IOException var22) {
																Class58.method802(-1124316003);
															}

															return;
														}

														var37 = var36.inter;
														if (var37.slot * -1395083971 < 0) {
															break;
														}

														var38 = Class50.method713(var37.anInt1958 * -1588791493, (byte) -56);
													}
													while (var38 == null || var38.aInterfaceDefArray2061 == null || var37.slot * -1395083971 >= var38.aInterfaceDefArray2061.length || var37 != var38.aInterfaceDefArray2061[var37.slot * -1395083971]);

													InterfaceDef.method2182(var36, 1197115913);
												}
											}

											var37 = var36.inter;
											if (var37.slot * -1395083971 < 0) {
												break;
											}

											var38 = Class50.method713(var37.anInt1958 * -1588791493, (byte) -3);
										}
										while (var38 == null || var38.aInterfaceDefArray2061 == null || var37.slot * -1395083971 >= var38.aInterfaceDefArray2061.length || var37 != var38.aInterfaceDefArray2061[var37.slot * -1395083971]);

										InterfaceDef.method2182(var36, 630674360);
									}
								}

								var37 = var36.inter;
								if (var37.slot * -1395083971 < 0) {
									break;
								}

								var38 = Class50.method713(var37.anInt1958 * -1588791493, (byte) -127);
							}
							while (var38 == null || var38.aInterfaceDefArray2061 == null || var37.slot * -1395083971 >= var38.aInterfaceDefArray2061.length || var37 != var38.aInterfaceDefArray2061[var37.slot * -1395083971]);

							InterfaceDef.method2182(var36, 1720145627);
						}
					}

					GameClient.secureBuffer.writeOpcode(100);
					GameClient.secureBuffer.writeByte(0);
					var25 = GameClient.secureBuffer.pos * 1736753585;
					Class63_Sub1.method2093(GameClient.secureBuffer, -204347374);
					GameClient.secureBuffer.method1866(GameClient.secureBuffer.pos * 1736753585 - var25);
				}
			}
		}
	}

	static final void method3298(boolean var0, byte var1) {
		Class73.method966(GameClient.activeRoot * 1787246131, Class5.anInt98 * 2104430923, Class60.anInt769 * -1064642111, var0, -573394678);
	}

	CacheableEntry_Sub23_Sub16_Sub7(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, CacheableEntry_Sub23_Sub16 var9) {
		anInt2777 = var1 * -1855818479;
		anInt2769 = var2 * 2082289841;
		anInt2775 = var3 * 1764783117;
		anInt2771 = var4 * -562105675;
		anInt2772 = var5 * 1996185419;
		anInt2768 = var6 * 1401352509;
		if (var7 != -1) {
			aClass109_Sub23_Sub4_2778 = CacheableEntry_Sub23_Sub11.getAnimation(var7);
			anInt2773 = 0;
			anInt2776 = GameClient.cycle * -1371305771 - 1425972093;
			if (aClass109_Sub23_Sub4_2778.anInt2170 * -991178587 == 0 && var9 != null && var9 instanceof CacheableEntry_Sub23_Sub16_Sub7) {
				CacheableEntry_Sub23_Sub16_Sub7 var10 = (CacheableEntry_Sub23_Sub16_Sub7) var9;
				if (var10.aClass109_Sub23_Sub4_2778 == aClass109_Sub23_Sub4_2778) {
					anInt2773 = var10.anInt2773 * 1;
					anInt2776 = var10.anInt2776 * 1;
					return;
				}
			}

			if (var8 && aClass109_Sub23_Sub4_2778.anInt2182 * -730053273 != -1) {
				anInt2773 = (int) (Math.random() * (double) aClass109_Sub23_Sub4_2778.anIntArray2169.length) * -1312016625;
				anInt2776 -= (int) (Math.random() * (double) aClass109_Sub23_Sub4_2778.anIntArray2183[anInt2773 * 1177933807]) * 1425972093;
			}
		}

	}

}
