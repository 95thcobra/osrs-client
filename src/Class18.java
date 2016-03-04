public class Class18 {

	static int anInt215;
	static int anInt216;
	static IndexDescriptor_Sub1 aClass94_Sub1_217;
	static int[] anIntArray218;
	static int[] anIntArray219;
	static int anInt220;
	static final int anInt221 = 101;
	public static final int anInt222 = 95;

	static final void method320(Class39 var0, Class141[] var1, int var2) {
		int var3;
		int var5;
		int var8;
		int var13;
		for (var3 = 0; var3 < 4; var3++) {
			for (var5 = 0; var5 < 104; var5++) {
				for (var8 = 0; var8 < 104; var8++) {
					if ((Class32.mapSettings[var3][var5][var8] & 1) == 1) {
						var13 = var3;
						if ((Class32.mapSettings[1][var5][var8] & 2) == 2) {
							var13 = var3 - 1;
						}

						if (var13 >= 0) {
							var1[var13].method1698(var5, var8, -565099536);
						}
					}
				}
			}
		}

		Class32.anInt397 += ((int) (Math.random() * 5.0D) - 2) * 1624995311;
		if (Class32.anInt397 * -283354865 < -8) {
			Class32.anInt397 = -115060600;
		}

		if (Class32.anInt397 * -283354865 > 8) {
			Class32.anInt397 = 115060600;
		}

		Class32.anInt408 += ((int) (Math.random() * 5.0D) - 2) * -1659611771;
		if (Class32.anInt408 * -2025039027 < -16) {
			Class32.anInt408 = 783984560;
		}

		if (Class32.anInt408 * -2025039027 > 16) {
			Class32.anInt408 = -783984560;
		}

		int var4;
		int var11;
		int var12;
		int var14;
		int var16;
		int var17;
		int var18;
		int var19;
		int var20;
		int var35;
		for (var3 = 0; var3 < 4; var3++) {
			byte[][] var45 = Class32.aByteArrayArrayArray395[var3];
			var14 = (int) Math.sqrt(5100.0D);
			var11 = var14 * 768 >> 8;

			int var37;
			int var39;
			for (var12 = 1; var12 < 103; var12++) {
				for (var18 = 1; var18 < 103; var18++) {
					var35 = Class32.mapSquareHeights[var3][var18 + 1][var12] - Class32.mapSquareHeights[var3][var18 - 1][var12];
					var19 = Class32.mapSquareHeights[var3][var18][var12 + 1] - Class32.mapSquareHeights[var3][var18][var12 - 1];
					var16 = (int) Math.sqrt((double) (var35 * var35 + 65536 + var19 * var19));
					var17 = (var35 << 8) / var16;
					var20 = 65536 / var16;
					var4 = (var19 << 8) / var16;
					var39 = (var4 * -50 + var20 * -10 + var17 * -50) / var11 + 96;
					var37 = (var45[var18][var12 - 1] >> 2) + (var45[var18 - 1][var12] >> 2) + (var45[var18 + 1][var12] >> 3) + (var45[var18][var12 + 1] >> 3) + (var45[var18][var12] >> 1);
					Class32.anIntArrayArray396[var18][var12] = var39 - var37;
				}
			}

			for (var12 = 0; var12 < 104; var12++) {
				CacheableEntry_Sub23_Sub7.anIntArray2211[var12] = 0;
				Class32.anIntArray399[var12] = 0;
				Class32.anIntArray398[var12] = 0;
				Class77.anIntArray935[var12] = 0;
				EnumDef.anIntArray2195[var12] = 0;
			}

			for (var12 = -5; var12 < 109; var12++) {
				for (var18 = 0; var18 < 104; var18++) {
					var35 = var12 + 5;
					if (var35 >= 0 && var35 < 104) {
						var19 = Class32.aByteArrayArrayArray407[var3][var35][var18] & 255;
						if (var19 > 0) {
							CacheableEntry_Sub23_Sub6 var47 = CacheableEntry_Sub23_Sub2.method2245(var19 - 1, 1648570394);
							CacheableEntry_Sub23_Sub7.anIntArray2211[var18] += var47.anInt2203 * 244099387;
							Class32.anIntArray399[var18] += var47.anInt2204 * 625515891;
							Class32.anIntArray398[var18] += var47.anInt2205 * 983176725;
							Class77.anIntArray935[var18] += var47.anInt2202 * 496779365;
							++EnumDef.anIntArray2195[var18];
						}
					}

					var19 = var12 - 5;
					if (var19 >= 0 && var19 < 104) {
						var16 = Class32.aByteArrayArrayArray407[var3][var19][var18] & 255;
						if (var16 > 0) {
							CacheableEntry_Sub23_Sub6 var48 = CacheableEntry_Sub23_Sub2.method2245(var16 - 1, 1648570394);
							CacheableEntry_Sub23_Sub7.anIntArray2211[var18] -= var48.anInt2203 * 244099387;
							Class32.anIntArray399[var18] -= var48.anInt2204 * 625515891;
							Class32.anIntArray398[var18] -= var48.anInt2205 * 983176725;
							Class77.anIntArray935[var18] -= var48.anInt2202 * 496779365;
							--EnumDef.anIntArray2195[var18];
						}
					}
				}

				if (var12 >= 1 && var12 < 103) {
					var18 = 0;
					var35 = 0;
					var19 = 0;
					var16 = 0;
					var17 = 0;

					for (var20 = -5; var20 < 109; var20++) {
						var4 = 5 + var20;
						if (var4 >= 0 && var4 < 104) {
							var18 += CacheableEntry_Sub23_Sub7.anIntArray2211[var4];
							var35 += Class32.anIntArray399[var4];
							var19 += Class32.anIntArray398[var4];
							var16 += Class77.anIntArray935[var4];
							var17 += EnumDef.anIntArray2195[var4];
						}

						var39 = var20 - 5;
						if (var39 >= 0 && var39 < 104) {
							var18 -= CacheableEntry_Sub23_Sub7.anIntArray2211[var39];
							var35 -= Class32.anIntArray399[var39];
							var19 -= Class32.anIntArray398[var39];
							var16 -= Class77.anIntArray935[var39];
							var17 -= EnumDef.anIntArray2195[var39];
						}

						if (var20 >= 1 && var20 < 103 && (!GameClient.aBool2864 || (Class32.mapSettings[0][var12][var20] & 2) != 0 || (Class32.mapSettings[var3][var12][var20] & 16) == 0 && Class1.method46(var3, var12, var20, 2113509727) == GameClient.anInt2917 * 1286856103)) {
							if (var3 < Class32.anInt392 * 2066106645) {
								Class32.anInt392 = var3 * -1445478851;
							}

							var37 = Class32.aByteArrayArrayArray407[var3][var12][var20] & 255;
							int var41 = Class32.aByteArrayArrayArray394[var3][var12][var20] & 255;
							if (var37 > 0 || var41 > 0) {
								int var23 = Class32.mapSquareHeights[var3][var12][var20];
								int var24 = Class32.mapSquareHeights[var3][var12 + 1][var20];
								int var25 = Class32.mapSquareHeights[var3][1 + var12][1 + var20];
								int var26 = Class32.mapSquareHeights[var3][var12][var20 + 1];
								int var28 = Class32.anIntArrayArray396[var12][var20];
								int var29 = Class32.anIntArrayArray396[1 + var12][var20];
								int var30 = Class32.anIntArrayArray396[var12 + 1][var20 + 1];
								int var31 = Class32.anIntArrayArray396[var12][1 + var20];
								int var27 = -1;
								int var42 = -1;
								int var21;
								int var22;
								int var33;
								if (var37 > 0) {
									var33 = var18 * 256 / var16;
									var21 = var35 / var17;
									var22 = var19 / var17;
									var27 = GameClient.method3775(var33, var21, var22, 2113124323);
									var33 = Class32.anInt397 * -283354865 + var33 & 255;
									var22 += Class32.anInt408 * -2025039027;
									if (var22 < 0) {
										var22 = 0;
									} else if (var22 > 255) {
										var22 = 255;
									}

									var42 = GameClient.method3775(var33, var21, var22, 1874514574);
								}

								CacheableEntry_Sub23_Sub11 var44;
								if (var3 > 0) {
									boolean var52 = true;
									if (var37 == 0 && Class36.aByteArrayArrayArray485[var3][var12][var20] != 0) {
										var52 = false;
									}

									if (var41 > 0) {
										var22 = var41 - 1;
										var44 = (CacheableEntry_Sub23_Sub11) CacheableEntry_Sub23_Sub11.aClass128_2324.get((long) var22);
										CacheableEntry_Sub23_Sub11 var49;
										if (var44 != null) {
											var49 = var44;
										} else {
											byte[] var38 = CacheableEntry_Sub23_Sub11.aIndexDescriptor_2331.getFileData(4, var22);
											var44 = new CacheableEntry_Sub23_Sub11();
											if (var38 != null) {
												var44.method2490(new DataBuffer(var38), var22, 172561201);
											}

											var44.method2504(2026077536);
											CacheableEntry_Sub23_Sub11.aClass128_2324.put(var44, (long) var22);
											var49 = var44;
										}

										if (!var49.aBool2327) {
											var52 = false;
										}
									}

									if (var52 && var23 == var24 && var23 == var25 && var26 == var23) {
										CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var3][var12][var20] |= 2340;
									}
								}

								var33 = 0;
								if (var42 != -1) {
									var33 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2713[CacheableEntry_Sub23_Sub7.method2399(var42, 96, (byte) -42)];
								}

								if (var41 == 0) {
									var0.method655(var3, var12, var20, 0, 0, -1, var23, var24, var25, var26, CacheableEntry_Sub23_Sub7.method2399(var27, var28, (byte) -70), CacheableEntry_Sub23_Sub7.method2399(var27, var29, (byte) -64), CacheableEntry_Sub23_Sub7.method2399(var27, var30, (byte) -126), CacheableEntry_Sub23_Sub7.method2399(var27, var31, (byte) -49), 0, 0, 0, 0, var33, 0);
								} else {
									var21 = 1 + Class36.aByteArrayArrayArray485[var3][var12][var20];
									byte var51 = LinkedEntry_Sub9.aByteArrayArrayArray1762[var3][var12][var20];
									int var53 = var41 - 1;
									CacheableEntry_Sub23_Sub11 var6 = (CacheableEntry_Sub23_Sub11) CacheableEntry_Sub23_Sub11.aClass128_2324.get((long) var53);
									if (var6 != null) {
										var44 = var6;
									} else {
										byte[] var7 = CacheableEntry_Sub23_Sub11.aIndexDescriptor_2331.getFileData(4, var53);
										var6 = new CacheableEntry_Sub23_Sub11();
										if (var7 != null) {
											var6.method2490(new DataBuffer(var7), var53, -588862085);
										}

										var6.method2504(1358365794);
										CacheableEntry_Sub23_Sub11.aClass128_2324.put(var6, (long) var53);
										var44 = var6;
									}

									int var46 = var44.anInt2326 * 886010969;
									int var32;
									int var34;
									int var36;
									int var40;
									if (var46 >= 0) {
										var40 = CacheableEntry_Sub23_Sub14_Sub3.anInterface2_2715.method29(var46, -1469500798);
										var32 = -1;
									} else if (var44.anInt2325 * -1819361419 == 16711935) {
										var32 = -2;
										var46 = -1;
										var40 = -2;
									} else {
										var32 = GameClient.method3775(var44.anInt2330 * 1355235691, var44.anInt2323 * 1145219457, var44.anInt2335 * -1337519989, 2029747383);
										var34 = Class32.anInt397 * -283354865 + var44.anInt2330 * 1355235691 & 255;
										var36 = var44.anInt2335 * -1337519989 + Class32.anInt408 * -2025039027;
										if (var36 < 0) {
											var36 = 0;
										} else if (var36 > 255) {
											var36 = 255;
										}

										var40 = GameClient.method3775(var34, var44.anInt2323 * 1145219457, var36, 2039529248);
									}

									var34 = 0;
									if (var40 != -2) {
										var34 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2713[Class47.method700(var40, 96, (byte) 69)];
									}

									if (var44.anInt2328 * -978801057 != -1) {
										var36 = var44.anInt2332 * -261851353 + Class32.anInt397 * -283354865 & 255;
										int var43 = Class32.anInt408 * -2025039027 + var44.anInt2337 * -496357951;
										if (var43 < 0) {
											var43 = 0;
										} else if (var43 > 255) {
											var43 = 255;
										}

										var40 = GameClient.method3775(var36, var44.anInt2329 * 108950157, var43, 1893954894);
										var34 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2713[Class47.method700(var40, 96, (byte) -16)];
									}

									var0.method655(var3, var12, var20, var21, var51, var46, var23, var24, var25, var26, CacheableEntry_Sub23_Sub7.method2399(var27, var28, (byte) -16), CacheableEntry_Sub23_Sub7.method2399(var27, var29, (byte) -87), CacheableEntry_Sub23_Sub7.method2399(var27, var30, (byte) -91), CacheableEntry_Sub23_Sub7.method2399(var27, var31, (byte) -117), Class47.method700(var32, var28, (byte) -24), Class47.method700(var32, var29, (byte) -107), Class47.method700(var32, var30, (byte) 73), Class47.method700(var32, var31, (byte) 10), var33, var34);
								}
							}
						}
					}
				}
			}

			for (var12 = 1; var12 < 103; var12++) {
				for (var18 = 1; var18 < 103; var18++) {
					var0.method643(var3, var18, var12, Class1.method46(var3, var18, var12, 2051444971));
				}
			}

			Class32.aByteArrayArrayArray407[var3] = (byte[][]) null;
			Class32.aByteArrayArrayArray394[var3] = (byte[][]) null;
			Class36.aByteArrayArrayArray485[var3] = (byte[][]) null;
			LinkedEntry_Sub9.aByteArrayArrayArray1762[var3] = (byte[][]) null;
			Class32.aByteArrayArrayArray395[var3] = (byte[][]) null;
		}

		var0.method532(-50, -10, -50);

		for (var3 = 0; var3 < 104; var3++) {
			for (var5 = 0; var5 < 104; var5++) {
				if ((Class32.mapSettings[1][var3][var5] & 2) == 2) {
					var0.method503(var3, var5);
				}
			}
		}

		var3 = 1;
		var5 = 2;
		var8 = 4;

		for (var13 = 0; var13 < 4; var13++) {
			if (var13 > 0) {
				var3 <<= 3;
				var5 <<= 3;
				var8 <<= 3;
			}

			for (int var9 = 0; var9 <= var13; var9++) {
				for (int var15 = 0; var15 <= 104; var15++) {
					for (int var10 = 0; var10 <= 104; var10++) {
						short var50;
						if ((CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var9][var10][var15] & var3) != 0) {
							var14 = var15;
							var11 = var15;
							var12 = var9;

							for (var18 = var9; var14 > 0 && (CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var9][var10][var14 - 1] & var3) != 0; --var14) {
								;
							}

							while (var11 < 104 && (CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var9][var10][var11 + 1] & var3) != 0) {
								++var11;
							}

							label506:
							while (var12 > 0) {
								for (var35 = var14; var35 <= var11; var35++) {
									if ((CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var12 - 1][var10][var35] & var3) == 0) {
										break label506;
									}
								}

								--var12;
							}

							label495:
							while (var18 < var13) {
								for (var35 = var14; var35 <= var11; var35++) {
									if ((CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var18 + 1][var10][var35] & var3) == 0) {
										break label495;
									}
								}

								++var18;
							}

							var35 = (1 + (var11 - var14)) * (1 + var18 - var12);
							if (var35 >= 8) {
								var50 = 240;
								var16 = Class32.mapSquareHeights[var18][var10][var14] - var50;
								var17 = Class32.mapSquareHeights[var12][var10][var14];
								Class39.method631(var13, 1, var10 * 128, var10 * 128, var14 * 128, 128 + var11 * 128, var16, var17);

								for (var20 = var12; var20 <= var18; var20++) {
									for (var4 = var14; var4 <= var11; var4++) {
										CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var20][var10][var4] &= ~var3;
									}
								}
							}
						}

						if ((CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var9][var10][var15] & var5) != 0) {
							var14 = var10;
							var11 = var10;
							var12 = var9;

							for (var18 = var9; var14 > 0 && (CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var9][var14 - 1][var15] & var5) != 0; --var14) {
								;
							}

							while (var11 < 104 && (CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var9][var11 + 1][var15] & var5) != 0) {
								++var11;
							}

							label559:
							while (var12 > 0) {
								for (var35 = var14; var35 <= var11; var35++) {
									if ((CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var12 - 1][var35][var15] & var5) == 0) {
										break label559;
									}
								}

								--var12;
							}

							label548:
							while (var18 < var13) {
								for (var35 = var14; var35 <= var11; var35++) {
									if ((CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[1 + var18][var35][var15] & var5) == 0) {
										break label548;
									}
								}

								++var18;
							}

							var35 = (1 + (var11 - var14)) * (1 + var18 - var12);
							if (var35 >= 8) {
								var50 = 240;
								var16 = Class32.mapSquareHeights[var18][var14][var15] - var50;
								var17 = Class32.mapSquareHeights[var12][var14][var15];
								Class39.method631(var13, 2, var14 * 128, var11 * 128 + 128, var15 * 128, var15 * 128, var16, var17);

								for (var20 = var12; var20 <= var18; var20++) {
									for (var4 = var14; var4 <= var11; var4++) {
										CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var20][var4][var15] &= ~var5;
									}
								}
							}
						}

						if ((CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var9][var10][var15] & var8) != 0) {
							var14 = var10;
							var11 = var10;
							var12 = var15;

							for (var18 = var15; var12 > 0 && (CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var9][var10][var12 - 1] & var8) != 0; --var12) {
								;
							}

							while (var18 < 104 && (CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var9][var10][var18 + 1] & var8) != 0) {
								++var18;
							}

							label612:
							while (var14 > 0) {
								for (var35 = var12; var35 <= var18; var35++) {
									if ((CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var9][var14 - 1][var35] & var8) == 0) {
										break label612;
									}
								}

								--var14;
							}

							label601:
							while (var11 < 104) {
								for (var35 = var12; var35 <= var18; var35++) {
									if ((CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var9][var11 + 1][var35] & var8) == 0) {
										break label601;
									}
								}

								++var11;
							}

							if ((var18 - var12 + 1) * (var11 - var14 + 1) >= 4) {
								var35 = Class32.mapSquareHeights[var9][var14][var12];
								Class39.method631(var13, 4, var14 * 128, var11 * 128 + 128, var12 * 128, var18 * 128 + 128, var35, var35);

								for (var19 = var14; var19 <= var11; var19++) {
									for (var16 = var12; var16 <= var18; var16++) {
										CacheableEntry_Sub23_Sub16_Sub1.anIntArrayArrayArray2497[var9][var19][var16] &= ~var8;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	Class18() throws Throwable {
		throw new Error();
	}

	static final void method341(Class4 var0, int var1) {
		if (Player.me.anInt2521 * -1051150961 >> 7 == GameClient.mapMarkerX * -1846442735 && Player.me.anInt2505 * -844883935 >> 7 == GameClient.mapMarkerZ * -1524315751) {
			GameClient.mapMarkerX = 0;
		}

		int var3 = GameClient.anInt3091 * -796710281;
		if (var0 == Class4.aClass4_85 || Class4.aClass4_77 == var0) {
			var3 = 1;
		}

		for (int var4 = 0; var4 < var3; var4++) {
			Player var2;
			int var5;
			if (Class4.aClass4_85 == var0) {
				var2 = Player.me;
				var5 = 33538048;
			} else if (var0 == Class4.aClass4_77) {
				var2 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[GameClient.anInt2867 * -208567815];
				var5 = GameClient.anInt2867 * -208567815 << 14;
			} else {
				var2 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[GameClient.anIntArray3107[var4]];
				var5 = GameClient.anIntArray3107[var4] << 14;
				if (var0 == Class4.aClass4_79 && GameClient.anIntArray3107[var4] == GameClient.anInt2867 * -208567815) {
					continue;
				}
			}

			if (var2 != null && var2.method2945(-1231433691) && !var2.aBool2822) {
				var2.aBool2831 = false;
				if ((GameClient.aBool2864 && GameClient.anInt3091 * -796710281 > 50 || GameClient.anInt3091 * -796710281 > 200) && Class4.aClass4_85 != var0 && var2.anInt2556 * -1834510973 == var2.anInt2509 * -71832567) {
					var2.aBool2831 = true;
				}

				int var6 = var2.anInt2521 * -1051150961 >> 7;
				int var7 = var2.anInt2505 * -844883935 >> 7;
				if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
					if (var2.aClass109_Sub23_Sub16_Sub5_2826 != null && GameClient.cycle * 1026470457 >= var2.anInt2821 * -106872329 && GameClient.cycle * 1026470457 < var2.anInt2828 * -1632611687) {
						var2.aBool2831 = false;
						var2.anInt2820 = NpcDef.method2423(var2.anInt2521 * -1051150961, var2.anInt2505 * -844883935, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, -1847964236) * 1927276675;
						LinkedEntry_Sub6.aClass39_1732.method513(CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var2.anInt2521 * -1051150961, var2.anInt2505 * -844883935, var2.anInt2820 * 901097003, 60, var2, var2.direction * 1933495885, var5, var2.anInt2819 * 1919165871, var2.anInt2830 * 993969261, var2.anInt2829 * -962033859, var2.anInt2825 * 1521604999);
					} else {
						if ((var2.anInt2521 * -1051150961 & 127) == 64 && (var2.anInt2505 * -844883935 & 127) == 64) {
							if (GameClient.anIntArrayArray2966[var6][var7] == GameClient.anInt2924 * -246782549) {
								continue;
							}

							GameClient.anIntArrayArray2966[var6][var7] = GameClient.anInt2924 * -246782549;
						}

						var2.anInt2820 = NpcDef.method2423(var2.anInt2521 * -1051150961, var2.anInt2505 * -844883935, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, -1847964236) * 1927276675;
						LinkedEntry_Sub6.aClass39_1732.method512(CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var2.anInt2521 * -1051150961, var2.anInt2505 * -844883935, var2.anInt2820 * 901097003, 60, var2, var2.direction * 1933495885, var5, var2.aBool2507);
					}
				}
			}
		}

	}

}
