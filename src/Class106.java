public class Class106 {

	static CacheableEntry_Sub23_Sub14_Sub1 aClass109_Sub23_Sub14_Sub1_1475;
	public static final int anInt1479 = 20;
	public static final int anInt1480 = 200;
	public static final int anInt1481 = 13;
	public static final int anInt1482 = 31;
	public static int[] anIntArray1478 = new int[32];
	public static int[] anIntArray1476;
	public static int[] varps;

	static {
		int var1 = 2;

		for (int var0 = 0; var0 < 32; var0++) {
			anIntArray1478[var0] = var1 - 1;
			var1 += var1;
		}

		anIntArray1476 = new int[2000];
		varps = new int[2000];
	}

	public static int zoom = 50;

	static final void method1340(InterfaceDef[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		CacheableEntry_Sub23_Sub14.method2771(var2, var3, var4, var5);
		CacheableEntry_Sub23_Sub14_Sub3.method3148();

		for (int var15 = 0; var15 < var0.length; var15++) {
			InterfaceDef var16 = var0[var15];
			if (var16 != null && (var1 == var16.anInt1958 * -1588791493 || var1 == -1412584499 && var16 == GameClient.aInterfaceDef_3038)) {
				int var20;
				if (var8 == -1) {
					GameClient.anIntArray2876[GameClient.anInt2894 * -2099955589] = var6 + var16.anInt1952 * -18591297;
					GameClient.anIntArray3076[GameClient.anInt2894 * -2099955589] = var16.anInt1945 * -591061715 + var7;
					GameClient.anIntArray3077[GameClient.anInt2894 * -2099955589] = var16.anInt1954 * 2096072399;
					GameClient.anIntArray3078[GameClient.anInt2894 * -2099955589] = var16.invsize * 539675235;
					var20 = (GameClient.anInt2894 += 1544677043) * -2099955589 - 1;
				} else {
					var20 = var8;
				}

				var16.anInt2060 = var20 * -1906039751;
				var16.anInt2069 = GameClient.cycle * 1240692497;
				if (!var16.cs2Inter || !Connection.method1061(var16, (byte) -84)) {
					int var21;
					if (var16.anInt1943 * -202095703 > 0) {
						var21 = var16.anInt1943 * -202095703;
						if (var21 == 324) {
							if (GameClient.anInt3141 * -1127175711 == -1) {
								GameClient.anInt3141 = var16.anInt1971 * -732631169;
								GameClient.anInt3088 = var16.anInt1973 * 256982125;
							}

							if (GameClient.aClass108_3140.aBool1502) {
								var16.anInt1971 = GameClient.anInt3141 * -608513921;
							} else {
								var16.anInt1971 = GameClient.anInt3088 * 1328542583;
							}
						} else if (var21 == 325) {
							if (GameClient.anInt3141 * -1127175711 == -1) {
								GameClient.anInt3141 = var16.anInt1971 * -732631169;
								GameClient.anInt3088 = var16.anInt1973 * 256982125;
							}

							if (GameClient.aClass108_3140.aBool1502) {
								var16.anInt1971 = GameClient.anInt3088 * 1328542583;
							} else {
								var16.anInt1971 = GameClient.anInt3141 * -608513921;
							}
						} else if (var21 == 327) {
							var16.anInt1988 = -993583822;
							var16.anInt1989 = ((int) (Math.sin((double) (GameClient.cycle * 1026470457) / 40.0D) * 256.0D) & 2047) * 1932084251;
							var16.anInt1980 = 1497266741;
							var16.anInt1981 = 0;
						} else if (var21 == 328) {
							var16.anInt1988 = -993583822;
							var16.anInt1989 = ((int) (Math.sin((double) (GameClient.cycle * 1026470457) / 40.0D) * 256.0D) & 2047) * 1932084251;
							var16.anInt1980 = 1497266741;
							var16.anInt1981 = 999821601;
						}
					}

					var21 = var16.anInt1952 * -18591297 + var6;
					int var30 = var16.anInt1945 * -591061715 + var7;
					int var26 = var16.anInt1969 * -745264641;
					int var32;
					int var33;
					if (GameClient.aInterfaceDef_3038 == var16) {
						if (var1 != -1412584499 && !var16.aBool1983) {
							Class38.aInterfaceDefArray503 = var0;
							LinkedEntry_Sub6.anInt1726 = var6 * 1172528277;
							Class23.anInt313 = var7 * -1428012323;
							continue;
						}

						if (GameClient.aBool3124 && GameClient.aBool3043) {
							var32 = Class74.anInt897 * -1031552075;
							var33 = Class74.anInt898 * 1941423145;
							var32 -= GameClient.anInt3040 * 493969285;
							var33 -= GameClient.anInt3085 * -1974758323;
							if (var32 < GameClient.anInt2934 * 456811279) {
								var32 = GameClient.anInt2934 * 456811279;
							}

							if (var16.anInt1954 * 2096072399 + var32 > GameClient.anInt2934 * 456811279 + GameClient.aInterfaceDef_3036.anInt1954 * 2096072399) {
								var32 = GameClient.anInt2934 * 456811279 + GameClient.aInterfaceDef_3036.anInt1954 * 2096072399 - var16.anInt1954 * 2096072399;
							}

							if (var33 < GameClient.anInt3045 * -1802796197) {
								var33 = GameClient.anInt3045 * -1802796197;
							}

							if (var16.invsize * 539675235 + var33 > GameClient.anInt3045 * -1802796197 + GameClient.aInterfaceDef_3036.invsize * 539675235) {
								var33 = GameClient.aInterfaceDef_3036.invsize * 539675235 + GameClient.anInt3045 * -1802796197 - var16.invsize * 539675235;
							}

							var21 = var32;
							var30 = var33;
						}

						if (!var16.aBool1983) {
							var26 = 128;
						}
					}

					int var13;
					int var18;
					int var19;
					int var23;
					int var34;
					int var37;
					if (var16.contenttype * -1878336627 == 2) {
						var32 = var2;
						var33 = var3;
						var34 = var4;
						var37 = var5;
					} else if (var16.contenttype * -1878336627 == 9) {
						var18 = var21;
						var19 = var30;
						var13 = var21 + var16.anInt1954 * 2096072399;
						var23 = var16.invsize * 539675235 + var30;
						if (var13 < var21) {
							var18 = var13;
							var13 = var21;
						}

						if (var23 < var30) {
							var19 = var23;
							var23 = var30;
						}

						++var13;
						++var23;
						var32 = var18 > var2 ? var18 : var2;
						var33 = var19 > var3 ? var19 : var3;
						var34 = var13 < var4 ? var13 : var4;
						var37 = var23 < var5 ? var23 : var5;
					} else {
						var18 = var21 + var16.anInt1954 * 2096072399;
						var19 = var16.invsize * 539675235 + var30;
						var32 = var21 > var2 ? var21 : var2;
						var33 = var30 > var3 ? var30 : var3;
						var34 = var18 < var4 ? var18 : var4;
						var37 = var19 < var5 ? var19 : var5;
					}

					if (!var16.cs2Inter || var32 < var34 && var33 < var37) {
						int var10;
						int var11;
						int var12;
						int var14;
						int var17;
						int var22;
						int var24;
						int var25;
						int var31;
						int var35;
						int var36;
						int var40;
						int var41;
						if (var16.anInt1943 * -202095703 != 0) {
							if (var16.anInt1943 * -202095703 == 1336) {
								if (GameClient.aBool2991 || true) {
									var30 += 15;
									Class44.aClass109_Sub23_Sub14_Sub4_Sub1_621.method3317("Fps:" + GameClient.anInt2837 * -1026684785, var16.anInt1954 * 2096072399 + var21, var30, 16776960, -1);
									var30 += 15;
									Runtime var73 = Runtime.getRuntime();
									var19 = (int) ((var73.totalMemory() - var73.freeMemory()) / 1024L);
									var13 = 16776960;
									if (var19 > 32768 && GameClient.aBool2864) {
										var13 = 16711680;
									}

									if (var19 > 65536 && !GameClient.aBool2864) {
										var13 = 16711680;
									}

									Class44.aClass109_Sub23_Sub14_Sub4_Sub1_621.method3317("Mem:" + var19 + "k", var16.anInt1954 * 2096072399 + var21, var30, var13, -1);
									var30 += 15;

									Class44.aClass109_Sub23_Sub14_Sub4_Sub1_621.method3317("Tick:" + PacketDecoder.tick, var16.anInt1954 * 2096072399 + var21, var30, var13, -1);
									var30 += 15;
								}
								continue;
							}

							if (var16.anInt1943 * -202095703 == 1337) {
								GameClient.anInt3060 = var21 * -276627093;
								GameClient.anInt3074 = var30 * -1244965977;
								var13 = var16.anInt1954 * 2096072399;
								var23 = var16.invsize * 539675235;
								GameClient.anInt2924 += 126184707;
								Class18.method341(Class4.aClass4_85, 97326121);
								boolean var80 = false;
								if (GameClient.anInt2867 * -208567815 >= 0) {
									for (var17 = 0; var17 < GameClient.anInt3091 * -796710281; var17++) {
										if (GameClient.anInt2867 * -208567815 == GameClient.anIntArray3107[var17]) {
											var80 = true;
											break;
										}
									}
								}

								if (var80) {
									Class18.method341(Class4.aClass4_77, 97326121);
								}

								Class108.method1380(true, 1469686179);
								Class18.method341(var80 ? Class4.aClass4_79 : Class4.aClass4_78, 97326121);
								Class108.method1380(false, 1625207185);

								for (CacheableEntry_Sub23_Sub16_Sub4 var71 = (CacheableEntry_Sub23_Sub16_Sub4) GameClient.aJagexLinkedList_3000.method1405(); var71 != null; var71 = (CacheableEntry_Sub23_Sub16_Sub4) GameClient.aJagexLinkedList_3000.method1402()) {
									if (var71.anInt2623 * -435574017 == CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619 && GameClient.cycle * 1026470457 <= var71.anInt2606 * -588609769) {
										if (GameClient.cycle * 1026470457 >= var71.anInt2605 * -122170489) {
											if (var71.anInt2609 * 1237058141 > 0) {
												Npc var53 = GameClient.sceneNpcs[var71.anInt2609 * 1237058141 - 1];
												if (var53 != null && var53.anInt2521 * -1051150961 >= 0 && var53.anInt2521 * -1051150961 < 13312 && var53.anInt2505 * -844883935 >= 0 && var53.anInt2505 * -844883935 < 13312) {
													var71.method3065(var53.anInt2521 * -1051150961, var53.anInt2505 * -844883935, NpcDef.method2423(var53.anInt2521 * -1051150961, var53.anInt2505 * -844883935, var71.anInt2623 * -435574017, -1847964236) - var71.anInt2604 * 585463173, GameClient.cycle * 1026470457, -198864424);
												}
											}

											if (var71.anInt2609 * 1237058141 < 0) {
												var14 = -(var71.anInt2609 * 1237058141) - 1;
												System.out.println("kek " + var14);
												Player var55;
												if (var14 == GameClient.myIndex * -1731449945) {
													var55 = Player.me;
												} else {
													var55 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var14];
												}

												if (var55 != null && var55.anInt2521 * -1051150961 >= 0 && var55.anInt2521 * -1051150961 < 13312 && var55.anInt2505 * -844883935 >= 0 && var55.anInt2505 * -844883935 < 13312) {
													var71.method3065(var55.anInt2521 * -1051150961, var55.anInt2505 * -844883935, NpcDef.method2423(var55.anInt2521 * -1051150961, var55.anInt2505 * -844883935, var71.anInt2623 * -435574017, -1847964236) - var71.anInt2604 * 585463173, GameClient.cycle * 1026470457, 508838514);
												}
											}

											var71.method3072(GameClient.anInt2939 * -880137347, 1379744165);
											LinkedEntry_Sub6.aClass39_1732.method512(CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, (int) var71.aDouble2611, (int) var71.aDouble2612, (int) var71.aDouble2613, 60, var71, var71.anInt2619 * -516374917, -1, false);
										}
									} else {
										var71.unlink();
									}
								}

								for (CacheableEntry_Sub23_Sub16_Sub1 var74 = (CacheableEntry_Sub23_Sub16_Sub1) GameClient.aJagexLinkedList_3001.method1405(); var74 != null; var74 = (CacheableEntry_Sub23_Sub16_Sub1) GameClient.aJagexLinkedList_3001.method1402()) {
									if (var74.anInt2489 * 233138673 == CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619 && !var74.aBool2496) {
										if (GameClient.cycle * 1026470457 >= var74.anInt2487 * -1358136719) {
											var74.method2936(GameClient.anInt2939 * -880137347, (byte) -45);
											if (var74.aBool2496) {
												var74.unlink();
											} else {
												LinkedEntry_Sub6.aClass39_1732.method512(var74.anInt2489 * 233138673, var74.anInt2493 * 1696877937, var74.anInt2491 * -1385315685, var74.anInt2492 * -1261559767, 60, var74, 0, -1, false);
											}
										}
									} else {
										var74.unlink();
									}
								}

								Class35.method482(var21, var30, var13, var23, true, -82959261);
								var18 = GameClient.anInt2944 * -292311905;
								var19 = GameClient.anInt3099 * 123887831;
								var13 = GameClient.anInt3131 * -476732681;
								var23 = GameClient.anInt3033 * -186527881;
								CacheableEntry_Sub23_Sub14.method2771(var18, var19, var13 + var18, var19 + var23);
								CacheableEntry_Sub23_Sub14_Sub3.method3148();
								int var27;
								int var42;
								if (!GameClient.aBool3083) {
									var17 = GameClient.anInt2947 * 1608861963;
									if (GameClient.anInt2955 * 1355677181 / 256 > var17) {
										var17 = GameClient.anInt2955 * 1355677181 / 256;
									}

									if (GameClient.aBoolArray3116[4] && GameClient.anIntArray3118[4] + 128 > var17) {
										var17 = 128 + GameClient.anIntArray3118[4];
									}

									var12 = GameClient.anInt2931 * 823763991 + GameClient.anInt2948 * -1072839225 & 2047;
									var14 = RuntimeException_Sub1.anInt2783 * 1220633301;
									var40 = NpcDef.method2423(Player.me.anInt2521 * -1051150961, Player.me.anInt2505 * -844883935, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, -1847964236) - zoom;
									var22 = LinkedEntry_Sub5_Sub3.anInt2454 * -307703921;
									var24 = var17 * 3 + 600;
									var31 = 2048 - var17 & 2047;
									var36 = 2048 - var12 & 2047;
									var35 = 0;
									var41 = 0;
									var11 = var24;
									if (var31 != 0) {
										var10 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2719[var31];
										var27 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2720[var31];
										var42 = var41 * var27 - var10 * var24 >> 16;
										var11 = var41 * var10 + var27 * var24 >> 16;
										var41 = var42;
									}

									if (var36 != 0) {
										var10 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2719[var36];
										var27 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2720[var36];
										var42 = var35 * var27 + var11 * var10 >> 16;
										var11 = var11 * var27 - var35 * var10 >> 16;
										var35 = var42;
									}

									NpcDef.anInt2245 = (var14 - var35) * 1074536299;
									Class74.anInt907 = (var40 - var41) * 653219559;
									CacheableEntry_Sub23_Sub1.anInt2093 = (var22 - var11) * -1774627817;
									IndexDescriptor.anInt1366 = var17 * 34393649;
									Class19.anInt231 = var12 * -112245797;
								}

								if (!GameClient.aBool3083) {
									if (Class15.aClass35_195.aBool472) {
										var12 = CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619;
									} else {
										var14 = 3;
										if (IndexDescriptor.anInt1366 * -1557542191 < 310) {
											var40 = NpcDef.anInt2245 * -1967123133 >> 7;
											var22 = CacheableEntry_Sub23_Sub1.anInt2093 * 681386919 >> 7;
											var24 = Player.me.anInt2521 * -1051150961 >> 7;
											var31 = Player.me.anInt2505 * -844883935 >> 7;
											if ((Class32.mapSettings[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619][var40][var22] & 4) != 0) {
												var14 = CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619;
											}

											if (var24 > var40) {
												var36 = var24 - var40;
											} else {
												var36 = var40 - var24;
											}

											if (var31 > var22) {
												var35 = var31 - var22;
											} else {
												var35 = var22 - var31;
											}

											if (var36 > var35) {
												var41 = var35 * 65536 / var36;
												var11 = 32768;

												while (var24 != var40) {
													if (var40 < var24) {
														++var40;
													} else if (var40 > var24) {
														--var40;
													}

													if ((Class32.mapSettings[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619][var40][var22] & 4) != 0) {
														var14 = CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619;
													}

													var11 += var41;
													if (var11 >= 65536) {
														var11 -= 65536;
														if (var22 < var31) {
															++var22;
														} else if (var22 > var31) {
															--var22;
														}

														if ((Class32.mapSettings[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619][var40][var22] & 4) != 0) {
															var14 = CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619;
														}
													}
												}
											} else {
												var41 = var36 * 65536 / var35;
												var11 = 32768;

												while (var31 != var22) {
													if (var22 < var31) {
														++var22;
													} else if (var22 > var31) {
														--var22;
													}

													if ((Class32.mapSettings[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619][var40][var22] & 4) != 0) {
														var14 = CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619;
													}

													var11 += var41;
													if (var11 >= 65536) {
														var11 -= 65536;
														if (var40 < var24) {
															++var40;
														} else if (var40 > var24) {
															--var40;
														}

														if ((Class32.mapSettings[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619][var40][var22] & 4) != 0) {
															var14 = CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619;
														}
													}
												}
											}
										}

										if ((Class32.mapSettings[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619][Player.me.anInt2521 * -1051150961 >> 7][Player.me.anInt2505 * -844883935 >> 7] & 4) != 0) {
											var14 = CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619;
										}

										var12 = var14;
									}

									var17 = var12;
								} else {
									var17 = Class45.method689(2147122237);
								}

								var12 = NpcDef.anInt2245 * -1967123133;
								var14 = Class74.anInt907 * 113597655;
								var40 = CacheableEntry_Sub23_Sub1.anInt2093 * 681386919;
								var22 = IndexDescriptor.anInt1366 * -1557542191;
								var24 = Class19.anInt231 * 167182419;

								for (var31 = 0; var31 < 5; var31++) {
									if (GameClient.aBoolArray3116[var31]) {
										var36 = (int) (Math.random() * (double) (1 + GameClient.anIntArray3117[var31] * 2) - (double) GameClient.anIntArray3117[var31] + Math.sin((double) GameClient.anIntArray3120[var31] * ((double) GameClient.anIntArray3119[var31] / 100.0D)) * (double) GameClient.anIntArray3118[var31]);
										if (var31 == 0) {
											NpcDef.anInt2245 += var36 * 1074536299;
										}

										if (var31 == 1) {
											Class74.anInt907 += var36 * 653219559;
										}

										if (var31 == 2) {
											CacheableEntry_Sub23_Sub1.anInt2093 += var36 * -1774627817;
										}

										if (var31 == 3) {
											Class19.anInt231 = (Class19.anInt231 * 167182419 + var36 & 2047) * -112245797;
										}

										if (var31 == 4) {
											IndexDescriptor.anInt1366 += var36 * 34393649;
											if (IndexDescriptor.anInt1366 * -1557542191 < 128) {
												IndexDescriptor.anInt1366 = 107419776;
											}

											if (IndexDescriptor.anInt1366 * -1557542191 > 383) {
												IndexDescriptor.anInt1366 = 287865679;
											}
										}
									}
								}

								var31 = Class74.anInt897 * -1031552075;
								var36 = Class74.anInt898 * 1941423145;
								if (Class74.anInt903 * 332680755 != 0) {
									var31 = Class74.anInt891 * 1837550337;
									var36 = Class74.anInt905 * -1013575437;
								}

								if (var31 >= var18 && var31 < var13 + var18 && var36 >= var19 && var36 < var19 + var23) {
									CacheableEntry_Sub23_Sub16_Sub5.aBool2685 = true;
									CacheableEntry_Sub23_Sub16_Sub5.anInt2680 = 0;
									CacheableEntry_Sub23_Sub16_Sub5.anInt2686 = var31 - var18;
									CacheableEntry_Sub23_Sub16_Sub5.anInt2687 = var36 - var19;
								} else {
									CacheableEntry_Sub23_Sub16_Sub5.aBool2685 = false;
									CacheableEntry_Sub23_Sub16_Sub5.anInt2680 = 0;
								}

								CacheableEntry_Sub23_Sub7.method2389((byte) 81);
								CacheableEntry_Sub23_Sub14.method2718(var18, var19, var13, var23, 0);
								CacheableEntry_Sub23_Sub7.method2389((byte) 93);
								var35 = CacheableEntry_Sub23_Sub14_Sub3.anInt2705;
								CacheableEntry_Sub23_Sub14_Sub3.anInt2705 = GameClient.anInt3133 * -1951712977;
								LinkedEntry_Sub6.aClass39_1732.method538(NpcDef.anInt2245 * -1967123133, Class74.anInt907 * 113597655, CacheableEntry_Sub23_Sub1.anInt2093 * 681386919, IndexDescriptor.anInt1366 * -1557542191, Class19.anInt231 * 167182419, var17);
								CacheableEntry_Sub23_Sub14_Sub3.anInt2705 = var35;
								CacheableEntry_Sub23_Sub7.method2389((byte) 22);
								LinkedEntry_Sub6.aClass39_1732.method644();
								GameClient.anInt2956 = 0;
								boolean var83 = false;
								var11 = -1;

								for (var10 = -1; var10 < GameClient.anInt3091 * -796710281 + GameClient.numLocalNpcs * 1974577941; var10++) {
									Object var69;
									if (var10 == -1) {
										var69 = Player.me;
									} else if (var10 < GameClient.anInt3091 * -796710281) {
										var69 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[GameClient.anIntArray3107[var10]];
										if (GameClient.anInt2867 * -208567815 == GameClient.anIntArray3107[var10]) {
											var83 = true;
											var11 = var10;
											continue;
										}
									} else {
										var69 = GameClient.sceneNpcs[GameClient.npcIndices[var10 - GameClient.anInt3091 * -796710281]];
									}

									ObjectDef.method2468((CacheableEntry_Sub23_Sub16_Sub2) var69, var10, var18, var19, var13, var23, -2014477560);
								}

								if (var83) {
									ObjectDef.method2468(GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[GameClient.anInt2867 * -208567815], var11, var18, var19, var13, var23, -361892581);
								}

								for (var10 = 0; var10 < GameClient.anInt2956 * -738319905; var10++) {
									var27 = GameClient.anIntArray2958[var10];
									var42 = GameClient.anIntArray2891[var10];
									int var28 = GameClient.anIntArray2961[var10];
									int var43 = GameClient.anIntArray2959[var10];
									boolean var44 = true;

									while (var44) {
										var44 = false;

										for (int var29 = 0; var29 < var10; var29++) {
											if (var42 + 2 > GameClient.anIntArray2891[var29] - GameClient.anIntArray2959[var29] && var42 - var43 < GameClient.anIntArray2891[var29] + 2 && var27 - var28 < GameClient.anIntArray2958[var29] + GameClient.anIntArray2961[var29] && var27 + var28 > GameClient.anIntArray2958[var29] - GameClient.anIntArray2961[var29] && GameClient.anIntArray2891[var29] - GameClient.anIntArray2959[var29] < var42) {
												var42 = GameClient.anIntArray2891[var29] - GameClient.anIntArray2959[var29];
												var44 = true;
											}
										}
									}

									GameClient.anInt2968 = GameClient.anIntArray2958[var10] * -1738216931;
									GameClient.anInt2969 = (GameClient.anIntArray2891[var10] = var42) * -1048260499;
									String var75 = GameClient.aStringArray2965[var10];
									if (GameClient.anInt3027 * 1704469337 == 0) {
										int var38 = 16776960;
										if (GameClient.anIntArray2962[var10] < 6) {
											var38 = GameClient.anIntArray3084[GameClient.anIntArray2962[var10]];
										}

										if (GameClient.anIntArray2962[var10] == 6) {
											var38 = GameClient.anInt2924 * -246782549 % 20 < 10 ? 16711680 : 16776960;
										}

										if (GameClient.anIntArray2962[var10] == 7) {
											var38 = GameClient.anInt2924 * -246782549 % 20 < 10 ? 255 : 65535;
										}

										if (GameClient.anIntArray2962[var10] == 8) {
											var38 = GameClient.anInt2924 * -246782549 % 20 < 10 ? 45056 : 8454016;
										}

										int var39;
										if (GameClient.anIntArray2962[var10] == 9) {
											var39 = 150 - GameClient.anIntArray2932[var10];
											if (var39 < 50) {
												var38 = var39 * 1280 + 16711680;
											} else if (var39 < 100) {
												var38 = 16776960 - (var39 - 50) * 327680;
											} else if (var39 < 150) {
												var38 = (var39 - 100) * 5 + 65280;
											}
										}

										if (GameClient.anIntArray2962[var10] == 10) {
											var39 = 150 - GameClient.anIntArray2932[var10];
											if (var39 < 50) {
												var38 = var39 * 5 + 16711680;
											} else if (var39 < 100) {
												var38 = 16711935 - (var39 - 50) * 327680;
											} else if (var39 < 150) {
												var38 = 255 + (var39 - 100) * 327680 - (var39 - 100) * 5;
											}
										}

										if (GameClient.anIntArray2962[var10] == 11) {
											var39 = 150 - GameClient.anIntArray2932[var10];
											if (var39 < 50) {
												var38 = 16777215 - var39 * 327685;
											} else if (var39 < 100) {
												var38 = 65280 + (var39 - 50) * 327685;
											} else if (var39 < 150) {
												var38 = 16777215 - (var39 - 100) * 327680;
											}
										}

										if (GameClient.anIntArray2963[var10] == 0) {
											Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343.method3381(var75, GameClient.anInt2968 * 972236853 + var18, GameClient.anInt2969 * 1023916389 + var19, var38, 0);
										}

										if (GameClient.anIntArray2963[var10] == 1) {
											Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343.method3320(var75, GameClient.anInt2968 * 972236853 + var18, var19 + GameClient.anInt2969 * 1023916389, var38, 0, GameClient.anInt2924 * -246782549);
										}

										if (GameClient.anIntArray2963[var10] == 2) {
											Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343.method3321(var75, GameClient.anInt2968 * 972236853 + var18, var19 + GameClient.anInt2969 * 1023916389, var38, 0, GameClient.anInt2924 * -246782549);
										}

										if (GameClient.anIntArray2963[var10] == 3) {
											Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343.method3322(var75, GameClient.anInt2968 * 972236853 + var18, var19 + GameClient.anInt2969 * 1023916389, var38, 0, GameClient.anInt2924 * -246782549, 150 - GameClient.anIntArray2932[var10]);
										}

										if (GameClient.anIntArray2963[var10] == 4) {
											var39 = (150 - GameClient.anIntArray2932[var10]) * (Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343.method3311(var75) + 100) / 150;
											CacheableEntry_Sub23_Sub14.method2713(var18 + GameClient.anInt2968 * 972236853 - 50, var19, 50 + GameClient.anInt2968 * 972236853 + var18, var19 + var23);
											Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343.method3316(var75, var18 + GameClient.anInt2968 * 972236853 + 50 - var39, var19 + GameClient.anInt2969 * 1023916389, var38, 0);
											CacheableEntry_Sub23_Sub14.method2771(var18, var19, var13 + var18, var19 + var23);
										}

										if (GameClient.anIntArray2963[var10] == 5) {
											var39 = 150 - GameClient.anIntArray2932[var10];
											int var45 = 0;
											if (var39 < 25) {
												var45 = var39 - 25;
											} else if (var39 > 125) {
												var45 = var39 - 125;
											}

											CacheableEntry_Sub23_Sub14.method2713(var18, var19 + GameClient.anInt2969 * 1023916389 - Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343.anInt2807 - 1, var18 + var13, var19 + GameClient.anInt2969 * 1023916389 + 5);
											Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343.method3381(var75, GameClient.anInt2968 * 972236853 + var18, var19 + GameClient.anInt2969 * 1023916389 + var45, var38, 0);
											CacheableEntry_Sub23_Sub14.method2771(var18, var19, var13 + var18, var19 + var23);
										}
									} else {
										Class93.aClass109_Sub23_Sub14_Sub4_Sub1_1343.method3381(var75, GameClient.anInt2968 * 972236853 + var18, var19 + GameClient.anInt2969 * 1023916389, 16776960, 0);
									}
								}

								if (GameClient.anInt3113 * 1066731469 == 2) {
									ItemContainer.method1848(GameClient.anInt2884 * 309401549 + (GameClient.anInt2899 * -115292431 - Class35.anInt478 * -1719983039 << 7), (GameClient.anInt3139 * -1991814481 - LinkedEntry_Sub13.anInt1825 * 803568843 << 7) + GameClient.anInt2885 * 1751602627, GameClient.anInt2883 * 961926542);
									if (GameClient.anInt2968 * 972236853 > -1 && GameClient.cycle * 1026470457 % 20 < 10) {
										Class40.aClass109_Sub23_Sub14_Sub2Array580[0].method2997(var18 + GameClient.anInt2968 * 972236853 - 12, var19 + GameClient.anInt2969 * 1023916389 - 28);
									}
								}

								((Class45) CacheableEntry_Sub23_Sub14_Sub3.anInterface2_2715).method685(GameClient.anInt2939 * -880137347, 485536965);
								if (GameClient.anInt2973 * 27331731 == 1) {
									GameClient.aClass109_Sub23_Sub14_Sub2Array2905[GameClient.anInt2972 * 822284833 / 100].method2997(GameClient.anInt2970 * 1738571867 - 8, GameClient.anInt2971 * 1504921527 - 8);
								}

								if (GameClient.anInt2973 * 27331731 == 2) {
									GameClient.aClass109_Sub23_Sub14_Sub2Array2905[4 + GameClient.anInt2972 * 822284833 / 100].method2997(GameClient.anInt2970 * 1738571867 - 8, GameClient.anInt2971 * 1504921527 - 8);
								}

								GameClient.anInt2982 = 0;
								var41 = Class35.anInt478 * -1719983039 + (Player.me.anInt2521 * -1051150961 >> 7);
								var11 = LinkedEntry_Sub13.anInt1825 * 803568843 + (Player.me.anInt2505 * -844883935 >> 7);
								if (var41 >= 3053 && var41 <= 3156 && var11 >= 3056 && var11 <= 3136) {
									GameClient.anInt2982 = 635206863;
								}

								if (var41 >= 3072 && var41 <= 3118 && var11 >= 9492 && var11 <= 9535) {
									GameClient.anInt2982 = 635206863;
								}

								if (GameClient.anInt2982 * -246740433 == 1 && var41 >= 3139 && var41 <= 3199 && var11 >= 3008 && var11 <= 3062) {
									GameClient.anInt2982 = 0;
								}

								NpcDef.anInt2245 = var12 * 1074536299;
								Class74.anInt907 = var14 * 653219559;
								CacheableEntry_Sub23_Sub1.anInt2093 = var40 * -1774627817;
								IndexDescriptor.anInt1366 = var22 * 34393649;
								Class19.anInt231 = var24 * -112245797;
								if (GameClient.aBool2953) {
									byte var48 = 0;
									var11 = var48 + Class97.anInt1378 * 1403506591 + Class97.anInt1382 * -1432304815;
									if (var11 == 0) {
										GameClient.aBool2953 = false;
									}
								}

								if (GameClient.aBool2953) {
									CacheableEntry_Sub23_Sub14.method2718(var18, var19, var13, var23, 0);
									Class53.method780(Class90.aString1082, false, -1714673297);
								}

								GameClient.aBoolArray3072[var16.anInt2060 * -1567323639] = true;
								CacheableEntry_Sub23_Sub14.method2771(var2, var3, var4, var5);
								continue;
							}

							if (var16.anInt1943 * -202095703 == 1338) {
								CacheableEntry_Sub23_Sub7.method2389((byte) 8);
								CacheableEntry_Sub23_Sub18 var70 = var16.method2159((byte) 31);
								if (var70 != null) {
									CacheableEntry_Sub23_Sub14.method2771(var21, var30, var70.anInt2439 * -2016633209 + var21, var30 + var70.anInt2438 * -633411239);
									if (GameClient.anInt2901 * 382216283 != 2 && GameClient.anInt2901 * 382216283 != 5) {
										var19 = GameClient.anInt2948 * -1072839225 + GameClient.anInt2880 * 1847328669 & 2047;
										var13 = Player.me.anInt2521 * -1051150961 / 32 + 48;
										var23 = 464 - Player.me.anInt2505 * -844883935 / 32;
										Class3.aClass109_Sub23_Sub14_Sub2_73.method3008(var21, var30, var70.anInt2439 * -2016633209, var70.anInt2438 * -633411239, var13, var23, var19, 256 + GameClient.anInt2936 * 461573195, var70.anIntArray2440, var70.anIntArray2441);

										for (var25 = 0; var25 < GameClient.anInt3097 * -1281668133; var25++) {
											var17 = 2 + GameClient.anIntArray3098[var25] * 4 - Player.me.anInt2521 * -1051150961 / 32;
											var12 = GameClient.anIntArray3135[var25] * 4 + 2 - Player.me.anInt2505 * -844883935 / 32;
											Class40.method668(var21, var30, var17, var12, GameClient.aClass109_Sub23_Sub14_Sub2Array3128[var25], var70, (byte) 84);
										}

										var25 = 0;

										while (true) {
											if (var25 >= 104) {
												for (var25 = 0; var25 < GameClient.numLocalNpcs * 1974577941; var25++) {
													Npc var64 = GameClient.sceneNpcs[GameClient.npcIndices[var25]];
													if (var64 != null && var64.method2945(930976114)) {
														NpcDef var50 = var64.definition;
														if (var50 != null && var50.anIntArray2246 != null) {
															var50 = var50.method2400(-1907103865);
														}

														if (var50 != null && var50.showDot && var50.aBool2249) {
															var14 = var64.anInt2521 * -1051150961 / 32 - Player.me.anInt2521 * -1051150961 / 32;
															var40 = var64.anInt2505 * -844883935 / 32 - Player.me.anInt2505 * -844883935 / 32;
															Class40.method668(var21, var30, var14, var40, Class46.aClass109_Sub23_Sub14_Sub2Array653[1], var70, (byte) 71);
														}
													}
												}

												for (var25 = 0; var25 < GameClient.anInt3091 * -796710281; var25++) {
													Player var66 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[GameClient.anIntArray3107[var25]];
													if (var66 != null && var66.method2945(1533224275) && !var66.aBool2822) {
														var12 = var66.anInt2521 * -1051150961 / 32 - Player.me.anInt2521 * -1051150961 / 32;
														var14 = var66.anInt2505 * -844883935 / 32 - Player.me.anInt2505 * -844883935 / 32;
														boolean var82 = false;
														if (Class57.method794(var66.aString2835, true, 758283072)) {
															var82 = true;
														}

														boolean var61 = false;

														for (var24 = 0; var24 < Class41.anInt585 * -1787316275; var24++) {
															if (var66.aString2835.equals(Class54.aClass109_Sub8Array728[var24].aString1757)) {
																var61 = true;
																break;
															}
														}

														boolean var72 = false;
														if (Player.me.anInt2832 * -1891106653 != 0 && var66.anInt2832 * -1891106653 != 0 && Player.me.anInt2832 * -1891106653 == var66.anInt2832 * -1891106653) {
															var72 = true;
														}

														if (var82) {
															Class40.method668(var21, var30, var12, var14, Class46.aClass109_Sub23_Sub14_Sub2Array653[3], var70, (byte) 103);
														} else if (var72) {
															Class40.method668(var21, var30, var12, var14, Class46.aClass109_Sub23_Sub14_Sub2Array653[4], var70, (byte) 17);
														} else if (var61) {
															Class40.method668(var21, var30, var12, var14, Class46.aClass109_Sub23_Sub14_Sub2Array653[5], var70, (byte) 9);
														} else {
															Class40.method668(var21, var30, var12, var14, Class46.aClass109_Sub23_Sub14_Sub2Array653[2], var70, (byte) 112);
														}
													}
												}

												if (GameClient.anInt3113 * 1066731469 != 0 && GameClient.cycle * 1026470457 % 20 < 10) {
													if (GameClient.anInt3113 * 1066731469 == 1 && GameClient.anInt2879 * -1890256937 >= 0 && GameClient.anInt2879 * -1890256937 < GameClient.sceneNpcs.length) {
														Npc var78 = GameClient.sceneNpcs[GameClient.anInt2879 * -1890256937];
														if (var78 != null) {
															var17 = var78.anInt2521 * -1051150961 / 32 - Player.me.anInt2521 * -1051150961 / 32;
															var12 = var78.anInt2505 * -844883935 / 32 - Player.me.anInt2505 * -844883935 / 32;
															Class19.method345(var21, var30, var17, var12, Class6.aClass109_Sub23_Sub14_Sub2Array99[1], var70, -1725738410);
														}
													}

													if (GameClient.anInt3113 * 1066731469 == 2) {
														var25 = GameClient.anInt2899 * -461169724 - Class35.anInt478 * 1710002436 + 2 - Player.me.anInt2521 * -1051150961 / 32;
														var17 = GameClient.anInt3139 * 622676668 - LinkedEntry_Sub13.anInt1825 * -1080691924 + 2 - Player.me.anInt2505 * -844883935 / 32;
														Class19.method345(var21, var30, var25, var17, Class6.aClass109_Sub23_Sub14_Sub2Array99[1], var70, 2032336324);
													}

													if (GameClient.anInt3113 * 1066731469 == 10 && GameClient.anInt3026 * -1467260517 >= 0 && GameClient.anInt3026 * -1467260517 < GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983.length) {
														Player var79 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[GameClient.anInt3026 * -1467260517];
														if (var79 != null) {
															var17 = var79.anInt2521 * -1051150961 / 32 - Player.me.anInt2521 * -1051150961 / 32;
															var12 = var79.anInt2505 * -844883935 / 32 - Player.me.anInt2505 * -844883935 / 32;
															Class19.method345(var21, var30, var17, var12, Class6.aClass109_Sub23_Sub14_Sub2Array99[1], var70, 456699135);
														}
													}
												}

												if (GameClient.mapMarkerX * -1846442735 != 0) {
													var25 = 2 + GameClient.mapMarkerX * 1204163652 - Player.me.anInt2521 * -1051150961 / 32;
													var17 = 2 + GameClient.mapMarkerZ * -1802295708 - Player.me.anInt2505 * -844883935 / 32;
													Class40.method668(var21, var30, var25, var17, Class6.aClass109_Sub23_Sub14_Sub2Array99[0], var70, (byte) 12);
												}

												if (!Player.me.aBool2822) {
													CacheableEntry_Sub23_Sub14.method2718(var70.anInt2439 * -2016633209 / 2 + var21 - 1, var70.anInt2438 * -633411239 / 2 + var30 - 1, 3, 3, 16777215);
												}
												break;
											}

											for (var17 = 0; var17 < 104; var17++) {
												JagexLinkedList var49 = GameClient.aJagexLinkedListArrayArrayArray2998[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619][var25][var17];
												if (var49 != null) {
													var14 = 2 + var25 * 4 - Player.me.anInt2521 * -1051150961 / 32;
													var40 = var17 * 4 + 2 - Player.me.anInt2505 * -844883935 / 32;
													Class40.method668(var21, var30, var14, var40, Class46.aClass109_Sub23_Sub14_Sub2Array653[0], var70, (byte) 67);
												}
											}

											++var25;
										}
									} else {
										CacheableEntry_Sub23_Sub14.method2726(var21, var30, 0, var70.anIntArray2440, var70.anIntArray2441);
									}

									GameClient.aBoolArray2888[var20] = true;
								}

								CacheableEntry_Sub23_Sub14.method2771(var2, var3, var4, var5);
								continue;
							}

							if (var16.anInt1943 * -202095703 == 1339) {
								EnumDef.method2354(var16, var21, var30, var20, 95019465);
								CacheableEntry_Sub23_Sub14.method2771(var2, var3, var4, var5);
								continue;
							}
						}

						if (var16.contenttype * -1878336627 == 0) {
							if (!var16.cs2Inter && Connection.method1061(var16, (byte) -127) && var16 != Class6.aInterfaceDef_103) {
								continue;
							}

							if (!var16.cs2Inter) {
								if (var16.anInt2038 * -650026719 > var16.anInt1963 * -124837617 - var16.invsize * 539675235) {
									var16.anInt2038 = var16.anInt1963 * -282538961 - var16.invsize * 1999030019;
								}

								if (var16.anInt2038 * -650026719 < 0) {
									var16.anInt2038 = 0;
								}
							}

							method1340(var0, var16.hash * 1582464481, var32, var33, var34, var37, var21 - var16.anInt2070 * 706996303, var30 - var16.anInt2038 * -650026719, var20, 1528185521);
							if (var16.aInterfaceDefArray2061 != null) {
								method1340(var16.aInterfaceDefArray2061, var16.hash * 1582464481, var32, var33, var34, var37, var21 - var16.anInt2070 * 706996303, var30 - var16.anInt2038 * -650026719, var20, 1688729996);
							}

							LinkedEntry_Sub13 var54 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.get((long) (var16.hash * 1582464481));
							if (var54 != null) {
								Class28.method394(var54.anInt1819 * -1385416029, var32, var33, var34, var37, var21, var30, var20, 500874896);
							}

							CacheableEntry_Sub23_Sub14.method2771(var2, var3, var4, var5);
							CacheableEntry_Sub23_Sub14_Sub3.method3148();
						}

						if (GameClient.aBool3081 || GameClient.aBoolArray3129[var20] || GameClient.anInt3079 * 1189118443 > 1) {
							if (var16.contenttype * -1878336627 == 0 && !var16.cs2Inter && var16.anInt1963 * -124837617 > var16.invsize * 539675235) {
								var18 = var21 + var16.anInt1954 * 2096072399;
								var19 = var16.anInt2038 * -650026719;
								var13 = var16.invsize * 539675235;
								var23 = var16.anInt1963 * -124837617;
								Class58.aClass109_Sub23_Sub14_Sub1Array753[0].method2972(var18, var30);
								Class58.aClass109_Sub23_Sub14_Sub1Array753[1].method2972(var18, var13 + var30 - 16);
								CacheableEntry_Sub23_Sub14.method2718(var18, var30 + 16, 16, var13 - 32, GameClient.anInt2878 * 509008949);
								var25 = var13 * (var13 - 32) / var23;
								if (var25 < 8) {
									var25 = 8;
								}

								var17 = (var13 - 32 - var25) * var19 / (var23 - var13);
								CacheableEntry_Sub23_Sub14.method2718(var18, var17 + var30 + 16, 16, var25, GameClient.anInt2942 * 655345101);
								CacheableEntry_Sub23_Sub14.method2739(var18, var17 + 16 + var30, var25, GameClient.anInt3095 * 1244417581);
								CacheableEntry_Sub23_Sub14.method2739(var18 + 1, 16 + var30 + var17, var25, GameClient.anInt3095 * 1244417581);
								CacheableEntry_Sub23_Sub14.method2756(var18, var17 + 16 + var30, 16, GameClient.anInt3095 * 1244417581);
								CacheableEntry_Sub23_Sub14.method2756(var18, var17 + 17 + var30, 16, GameClient.anInt3095 * 1244417581);
								CacheableEntry_Sub23_Sub14.method2739(var18 + 15, 16 + var30 + var17, var25, GameClient.anInt2943 * 1946241419);
								CacheableEntry_Sub23_Sub14.method2739(14 + var18, var30 + 17 + var17, var25 - 1, GameClient.anInt2943 * 1946241419);
								CacheableEntry_Sub23_Sub14.method2756(var18, var25 + var17 + 15 + var30, 16, GameClient.anInt2943 * 1946241419);
								CacheableEntry_Sub23_Sub14.method2756(var18 + 1, var25 + 14 + var30 + var17, 15, GameClient.anInt2943 * 1946241419);
							}

							if (var16.contenttype * -1878336627 != 1) {
								if (var16.contenttype * -1878336627 == 2) {
									var18 = 0;

									for (var19 = 0; var19 < var16.anInt1953 * 791903853; var19++) {
										for (var13 = 0; var13 < var16.anInt1950 * -769280817; var13++) {
											var23 = (var16.anInt2003 * 1620079109 + 32) * var13 + var21;
											var25 = var30 + var19 * (32 + var16.anInt1934 * -1753308347);
											if (var18 < 20) {
												var23 += var16.anIntArray2005[var18];
												var25 += var16.anIntArray2067[var18];
											}

											if (var16.itemIds[var18] <= 0) {
												if (var16.anIntArray2007 != null && var18 < 20) {
													RenderedItemImage var63 = var16.method2179(var18, -2049138166);
													if (var63 != null) {
														var63.method2997(var23, var25);
													} else if (InterfaceDef.aBool1937) {
														Class35.method484(var16, -1272578894);
													}
												}
											} else {
												boolean var58 = false;
												boolean var46 = false;
												var14 = var16.itemIds[var18] - 1;
												if (var23 + 32 > var2 && var23 < var4 && var25 + 32 > var3 && var25 < var5 || var16 == CacheableEntry_Sub23_Sub17.aInterfaceDef_2418 && GameClient.anInt3049 * -1636511263 == var18) {
													RenderedItemImage var81;
													if (GameClient.anInt3018 * -1710049223 == 1 && Class37.anInt500 * 2106654977 == var18 && Class44.anInt630 * -1356904377 == var16.hash * 1582464481) {
														var81 = Class41.method670(var14, var16.itemAmounts[var18], 2, 0, 2, false, (byte) 24);
													} else {
														var81 = Class41.method670(var14, var16.itemAmounts[var18], 1, 3153952, 2, false, (byte) 84);
													}

													if (var81 != null) {
														if (CacheableEntry_Sub23_Sub17.aInterfaceDef_2418 == var16 && var18 == GameClient.anInt3049 * -1636511263) {
															var17 = Class74.anInt897 * -1031552075 - GameClient.anInt2977 * 302755351;
															var12 = Class74.anInt898 * 1941423145 - GameClient.anInt2978 * 757042921;
															if (var17 < 5 && var17 > -5) {
																var17 = 0;
															}

															if (var12 < 5 && var12 > -5) {
																var12 = 0;
															}

															if (GameClient.anInt2981 * 1856246101 < 5) {
																var17 = 0;
																var12 = 0;
															}

															var81.method3003(var23 + var17, var12 + var25, 128);
															if (var1 != -1) {
																InterfaceDef var59 = var0[var1 & 65535];
																if (var12 + var25 < CacheableEntry_Sub23_Sub14.anInt2397 && var59.anInt2038 * -650026719 > 0) {
																	var24 = GameClient.anInt2939 * -880137347 * (CacheableEntry_Sub23_Sub14.anInt2397 - var25 - var12) / 3;
																	if (var24 > GameClient.anInt2939 * -211438878) {
																		var24 = GameClient.anInt2939 * -211438878;
																	}

																	if (var24 > var59.anInt2038 * -650026719) {
																		var24 = var59.anInt2038 * -650026719;
																	}

																	var59.anInt2038 -= var24 * 1811636961;
																	GameClient.anInt2978 += var24 * -1031526055;
																	Class35.method484(var59, -709561350);
																}

																if (var12 + var25 + 32 > CacheableEntry_Sub23_Sub14.anInt2400 && var59.anInt2038 * -650026719 < var59.anInt1963 * -124837617 - var59.invsize * 539675235) {
																	var24 = (var12 + var25 + 32 - CacheableEntry_Sub23_Sub14.anInt2400) * GameClient.anInt2939 * -880137347 / 3;
																	if (var24 > GameClient.anInt2939 * -211438878) {
																		var24 = GameClient.anInt2939 * -211438878;
																	}

																	if (var24 > var59.anInt1963 * -124837617 - var59.invsize * 539675235 - var59.anInt2038 * -650026719) {
																		var24 = var59.anInt1963 * -124837617 - var59.invsize * 539675235 - var59.anInt2038 * -650026719;
																	}

																	var59.anInt2038 += var24 * 1811636961;
																	GameClient.anInt2978 -= var24 * -1031526055;
																	Class35.method484(var59, -167868629);
																}
															}
														} else if (var16 == Class71.aInterfaceDef_862 && GameClient.anInt2975 * -1116128187 == var18) {
															var81.method3003(var23, var25, 128);
														} else {
															var81.method2997(var23, var25);
														}
													} else {
														Class35.method484(var16, -567479781);
													}
												}
											}

											++var18;
										}
									}
								} else if (var16.contenttype * -1878336627 == 3) {
									if (Class46.method695(var16, -1004317500)) {
										var18 = var16.anInt1965 * 846810285;
										if (Class6.aInterfaceDef_103 == var16 && var16.anInt1967 * 913250325 != 0) {
											var18 = var16.anInt1967 * 913250325;
										}
									} else {
										var18 = var16.anInt2045 * 1480230763;
										if (var16 == Class6.aInterfaceDef_103 && var16.anInt1966 * -315882783 != 0) {
											var18 = var16.anInt1966 * -315882783;
										}
									}

									if (var26 == 0) {
										if (var16.aBool2068) {
											CacheableEntry_Sub23_Sub14.method2718(var21, var30, var16.anInt1954 * 2096072399, var16.invsize * 539675235, var18);
										} else {
											CacheableEntry_Sub23_Sub14.method2720(var21, var30, var16.anInt1954 * 2096072399, var16.invsize * 539675235, var18);
										}
									} else if (var16.aBool2068) {
										CacheableEntry_Sub23_Sub14.method2717(var21, var30, var16.anInt1954 * 2096072399, var16.invsize * 539675235, var18, 256 - (var26 & 255));
									} else {
										CacheableEntry_Sub23_Sub14.method2721(var21, var30, var16.anInt1954 * 2096072399, var16.invsize * 539675235, var18, 256 - (var26 & 255));
									}
								} else {
									CacheableEntry_Sub23_Sub14_Sub4_Sub1 var56;
									if (var16.contenttype * -1878336627 == 4) {
										var56 = var16.method2189((byte) 2);
										if (var56 == null) {
											if (InterfaceDef.aBool1937) {
												Class35.method484(var16, -495960188);
											}
										} else {
											String var57 = var16.aString1997;
											if (Class46.method695(var16, -1812488417)) {
												var19 = var16.anInt1965 * 846810285;
												if (var16 == Class6.aInterfaceDef_103 && var16.anInt1967 * 913250325 != 0) {
													var19 = var16.anInt1967 * 913250325;
												}

												if (var16.aString1998.length() > 0) {
													var57 = var16.aString1998;
												}
											} else {
												var19 = var16.anInt2045 * 1480230763;
												if (var16 == Class6.aInterfaceDef_103 && var16.anInt1966 * -315882783 != 0) {
													var19 = var16.anInt1966 * -315882783;
												}
											}

											if (var16.cs2Inter && var16.anInt2057 * -181409537 != -1) {
												ItemDef var77 = PacketDecoder.getItemDef(var16.anInt2057 * -181409537);
												var57 = var77.name;
												if (var57 == null) {
													var57 = "null";
												}

												if ((var77.stackable * 833352093 == 1 || var16.anInt2058 * 1867752365 != 1) && var16.anInt2058 * 1867752365 != -1) {
													var57 = Class22.hexColTag(16748608) + var57 + Class37.END_COL + " " + 'x' + CacheableEntry_Sub23_Sub16.method2793(var16.anInt2058 * 1867752365, (byte) -10);
												}
											}

											if (var16 == GameClient.aInterfaceDef_3029) {
												Class90 var10000 = (Class90) null;
												var57 = Class90.PLEASE_WAIT;
												var19 = var16.anInt2045 * 1480230763;
											}

											if (!var16.cs2Inter) {
												var57 = Class74.method1025(var57, var16, (byte) 34);
											}

											var56.method3346(var57, var21, var30, var16.anInt1954 * 2096072399, var16.invsize * 539675235, var19, var16.aBool2002 ? 0 : -1, var16.anInt2000 * -961446265, var16.anInt2001 * 558461029, var16.anInt2055 * 1836856239);
										}
									} else if (var16.contenttype * -1878336627 == 5) {
										RenderedItemImage var62;
										if (!var16.cs2Inter) {
											var62 = var16.method2155(Class46.method695(var16, -1259436780), -1683547213);
											if (var62 != null) {
												var62.method2997(var21, var30);
											} else if (InterfaceDef.aBool1937) {
												Class35.method484(var16, -130633699);
											}
										} else {
											if (var16.anInt2057 * -181409537 != -1) {
												var62 = Class41.method670(var16.anInt2057 * -181409537, var16.anInt2058 * 1867752365, var16.anInt1976 * -958976749, var16.anInt2044 * 1414771397, var16.anInt1995 * -1148842275, false, (byte) 81);
											} else {
												var62 = var16.method2155(false, -1683547213);
											}

											if (var62 == null) {
												if (InterfaceDef.aBool1937) {
													Class35.method484(var16, -2046278392);
												}
											} else {
												var19 = var62.anInt2595;
												var13 = var62.anInt2593;
												if (!var16.aBool2015) {
													var23 = var16.anInt1954 * -127078400 / var19;
													if (var16.anInt1974 * -180984737 != 0) {
														var62.method2987(var21 + var16.anInt1954 * 2096072399 / 2, var30 + var16.invsize * 539675235 / 2, var16.anInt1974 * -180984737, var23);
													} else if (var26 != 0) {
														var62.method3053(var21, var30, var16.anInt1954 * 2096072399, var16.invsize * 539675235, 256 - (var26 & 255));
													} else if (var16.anInt1954 * 2096072399 == var19 && var13 == var16.invsize * 539675235) {
														var62.method2997(var21, var30);
													} else {
														var62.method2986(var21, var30, var16.anInt1954 * 2096072399, var16.invsize * 539675235);
													}
												} else {
													CacheableEntry_Sub23_Sub14.method2713(var21, var30, var21 + var16.anInt1954 * 2096072399, var16.invsize * 539675235 + var30);
													var23 = (var16.anInt1954 * 2096072399 + (var19 - 1)) / var19;
													var25 = (var16.invsize * 539675235 + (var13 - 1)) / var13;

													for (var17 = 0; var17 < var23; var17++) {
														for (var12 = 0; var12 < var25; var12++) {
															if (var16.anInt1974 * -180984737 != 0) {
																var62.method2987(var19 / 2 + var19 * var17 + var21, var13 / 2 + var13 * var12 + var30, var16.anInt1974 * -180984737, 4096);
															} else if (var26 != 0) {
																var62.method3003(var17 * var19 + var21, var30 + var13 * var12, 256 - (var26 & 255));
															} else {
																var62.method2997(var21 + var19 * var17, var13 * var12 + var30);
															}
														}
													}

													CacheableEntry_Sub23_Sub14.method2771(var2, var3, var4, var5);
												}
											}
										}
									} else {
										ItemDef var67;
										if (var16.contenttype * -1878336627 == 6) {
											boolean var60 = Class46.method695(var16, -622202512);
											if (var60) {
												var19 = var16.anInt1985 * 658207607;
											} else {
												var19 = var16.anInt1959 * -335970573;
											}

											CacheableEntry_Sub23_Sub16_Sub5 var52 = null;
											var23 = 0;
											if (var16.anInt2057 * -181409537 != -1) {
												var67 = PacketDecoder.getItemDef(var16.anInt2057 * -181409537);
												if (var67 != null) {
													var67 = var67.method2254(var16.anInt2058 * 1867752365, -1831330823);
													var52 = var67.method2263(1, -1483066466);
													if (var52 != null) {
														var52.method3082();
														var23 = var52.anInt2410 * -695779227 / 2;
													} else {
														Class35.method484(var16, -186203647);
													}
												}
											} else if (var16.anInt1980 * 1661118609 == 5) {
												if (var16.anInt1981 * -982469919 == 0) {
													var52 = GameClient.aClass108_3140.method1355((AnimationSequence) null, -1, (AnimationSequence) null, -1, -599050511);
												} else {
													var52 = Player.me.method2791(1704725433);
												}
											} else if (var19 == -1) {
												var52 = var16.method2158((AnimationSequence) null, -1, var60, Player.me.aClass108_2815, -1443846749);
												if (var52 == null && InterfaceDef.aBool1937) {
													Class35.method484(var16, -818171904);
												}
											} else {
												AnimationSequence var76 = CacheableEntry_Sub23_Sub11.getAnimation(var19);
												var52 = var16.method2158(var76, var16.anInt2059 * 920672345, var60, Player.me.aClass108_2815, -2116185844);
												if (var52 == null && InterfaceDef.aBool1937) {
													Class35.method484(var16, -2074064254);
												}
											}

											CacheableEntry_Sub23_Sub14_Sub3.method3152(var21 + var16.anInt1954 * 2096072399 / 2, var16.invsize * 539675235 / 2 + var30);
											var25 = var16.anInt1991 * -1256377801 * CacheableEntry_Sub23_Sub14_Sub3.anIntArray2719[var16.anInt1988 * -1788131197] >> 16;
											var17 = var16.anInt1991 * -1256377801 * CacheableEntry_Sub23_Sub14_Sub3.anIntArray2720[var16.anInt1988 * -1788131197] >> 16;
											if (var52 != null) {
												if (!var16.cs2Inter) {
													var52.method3094(0, var16.anInt1989 * 1096480275, 0, var16.anInt1988 * -1788131197, 0, var25, var17);
												} else {
													var52.method3082();
													if (var16.aBool1994) {
														var52.method3109(0, var16.anInt1989 * 1096480275, var16.anInt1990 * -1964550911, var16.anInt1988 * -1788131197, var16.anInt1986 * 1021889171, var16.anInt1987 * -357548381 + var25 + var23, var17 + var16.anInt1987 * -357548381, var16.anInt1991 * -1256377801);
													} else {
														var52.method3094(0, var16.anInt1989 * 1096480275, var16.anInt1990 * -1964550911, var16.anInt1988 * -1788131197, var16.anInt1986 * 1021889171, var23 + var25 + var16.anInt1987 * -357548381, var17 + var16.anInt1987 * -357548381);
													}
												}
											}

											CacheableEntry_Sub23_Sub14_Sub3.method3167();
										} else {
											if (var16.contenttype * -1878336627 == 7) {
												var56 = var16.method2189((byte) 2);
												if (var56 == null) {
													if (InterfaceDef.aBool1937) {
														Class35.method484(var16, -1575205787);
													}
													continue;
												}

												var19 = 0;

												for (var13 = 0; var13 < var16.anInt1953 * 791903853; var13++) {
													for (var23 = 0; var23 < var16.anInt1950 * -769280817; var23++) {
														if (var16.itemIds[var19] > 0) {
															var67 = PacketDecoder.getItemDef(var16.itemIds[var19] - 1);
															String var51;
															if (var67.stackable * 833352093 != 1 && var16.itemAmounts[var19] == 1) {
																var51 = Class22.hexColTag(16748608) + var67.name + Class37.END_COL;
															} else {
																var51 = Class22.hexColTag(16748608) + var67.name + Class37.END_COL + " " + 'x' + CacheableEntry_Sub23_Sub16.method2793(var16.itemAmounts[var19], (byte) -87);
															}

															var12 = var21 + (var16.anInt2003 * 1620079109 + 115) * var23;
															var14 = var30 + var13 * (var16.anInt1934 * -1753308347 + 12);
															if (var16.anInt2000 * -961446265 == 0) {
																var56.method3316(var51, var12, var14, var16.anInt2045 * 1480230763, var16.aBool2002 ? 0 : -1);
															} else if (var16.anInt2000 * -961446265 == 1) {
																var56.method3381(var51, var12 + var16.anInt1954 * 2096072399 / 2, var14, var16.anInt2045 * 1480230763, var16.aBool2002 ? 0 : -1);
															} else {
																var56.method3317(var51, var12 + var16.anInt1954 * 2096072399 - 1, var14, var16.anInt2045 * 1480230763, var16.aBool2002 ? 0 : -1);
															}
														}

														++var19;
													}
												}
											}

											if (var16.contenttype * -1878336627 == 8 && var16 == Class21.aInterfaceDef_260 && GameClient.anInt2859 * -486881813 == GameClient.anInt3017 * -886888511) {
												var18 = 0;
												var19 = 0;
												CacheableEntry_Sub23_Sub14_Sub4_Sub1 var47 = Class44.aClass109_Sub23_Sub14_Sub4_Sub1_621;
												String var65 = var16.aString1997;

												String var68;
												for (var65 = Class74.method1025(var65, var16, (byte) 39); var65.length() > 0; var19 += var47.anInt2807 + 1) {
													var17 = var65.indexOf(Class37.BR);
													if (var17 != -1) {
														var68 = var65.substring(0, var17);
														var65 = var65.substring(var17 + 4);
													} else {
														var68 = var65;
														var65 = "";
													}

													var12 = var47.method3311(var68);
													if (var12 > var18) {
														var18 = var12;
													}
												}

												var18 += 6;
												var19 += 7;
												var17 = var16.anInt1954 * 2096072399 + var21 - 5 - var18;
												var12 = var16.invsize * 539675235 + var30 + 5;
												if (var17 < var21 + 5) {
													var17 = var21 + 5;
												}

												if (var18 + var17 > var4) {
													var17 = var4 - var18;
												}

												if (var12 + var19 > var5) {
													var12 = var5 - var19;
												}

												CacheableEntry_Sub23_Sub14.method2718(var17, var12, var18, var19, 16777120);
												CacheableEntry_Sub23_Sub14.method2720(var17, var12, var18, var19, 0);
												var65 = var16.aString1997;
												var14 = 2 + var12 + var47.anInt2807;

												for (var65 = Class74.method1025(var65, var16, (byte) 117); var65.length() > 0; var14 += var47.anInt2807 + 1) {
													var40 = var65.indexOf(Class37.BR);
													if (var40 != -1) {
														var68 = var65.substring(0, var40);
														var65 = var65.substring(var40 + 4);
													} else {
														var68 = var65;
														var65 = "";
													}

													var47.method3316(var68, var17 + 3, var14, 0, -1);
												}
											}

											if (var16.contenttype * -1878336627 == 9) {
												if (var16.anInt1970 * 1185979973 == 1) {
													if (var16.aBool1935) {
														var18 = var21;
														var19 = var16.invsize * 539675235 + var30;
														var13 = var16.anInt1954 * 2096072399 + var21;
														var23 = var30;
													} else {
														var18 = var21;
														var19 = var30;
														var13 = var16.anInt1954 * 2096072399 + var21;
														var23 = var16.invsize * 539675235 + var30;
													}

													CacheableEntry_Sub23_Sub14.method2725(var18, var19, var13, var23, var16.anInt2045 * 1480230763);
												} else {
													var18 = var16.anInt1954 * 2096072399 >= 0 ? var16.anInt1954 * 2096072399 : -(var16.anInt1954 * 2096072399);
													var19 = var16.invsize * 539675235 >= 0 ? var16.invsize * 539675235 : -(var16.invsize * 539675235);
													var13 = var18;
													if (var18 < var19) {
														var13 = var19;
													}

													if (var13 != 0) {
														var23 = (var16.anInt1954 * 2096072399 << 16) / var13;
														var25 = (var16.invsize * 539675235 << 16) / var13;
														if (var25 <= var23) {
															var23 = -var23;
														} else {
															var25 = -var25;
														}

														var17 = var25 * var16.anInt1970 * 1185979973 >> 17;
														var12 = var25 * var16.anInt1970 * 1185979973 + 1 >> 17;
														var14 = var16.anInt1970 * 1185979973 * var23 >> 17;
														var40 = var16.anInt1970 * 1185979973 * var23 + 1 >> 17;
														var22 = var17 + var21;
														var24 = var21 - var12;
														var31 = var21 + var16.anInt1954 * 2096072399 - var12;
														var36 = var21 + var16.anInt1954 * 2096072399 + var17;
														var35 = var30 + var14;
														var41 = var30 - var40;
														var11 = var16.invsize * 539675235 + var30 - var40;
														var10 = var14 + var16.invsize * 539675235 + var30;
														CacheableEntry_Sub23_Sub14_Sub3.method3157(var22, var24, var31);
														CacheableEntry_Sub23_Sub14_Sub3.method3160(var35, var41, var11, var22, var24, var31, var16.anInt2045 * 1480230763);
														CacheableEntry_Sub23_Sub14_Sub3.method3157(var22, var31, var36);
														CacheableEntry_Sub23_Sub14_Sub3.method3160(var35, var11, var10, var22, var31, var36, var16.anInt2045 * 1480230763);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

	Class106() throws Throwable {
		throw new Error();
	}

	static final int method1342(int var0, int var1, int var2) {
		int var3 = Player.method3397(var0 - 1, var1 - 1, (byte) -49) + Player.method3397(1 + var0, var1 - 1, (byte) -6) + Player.method3397(var0 - 1, 1 + var1, (byte) -36) + Player.method3397(1 + var0, 1 + var1, (byte) -104);
		int var5 = Player.method3397(var0 - 1, var1, (byte) -62) + Player.method3397(var0 + 1, var1, (byte) -24) + Player.method3397(var0, var1 - 1, (byte) -116) + Player.method3397(var0, 1 + var1, (byte) -25);
		int var4 = Player.method3397(var0, var1, (byte) -62);
		return var4 / 4 + var3 / 16 + var5 / 8;
	}

}
