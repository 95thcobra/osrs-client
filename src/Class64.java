public final class Class64 {

	static final int anInt804 = 16;
	static final int anInt806 = 0;
	static final int anInt807 = 1;
	static final int anInt808 = 4096;
	static final int anInt809 = 6;
	static final int anInt810 = 50;
	static final int anInt811 = 23;
	static Class34 aClass34_805 = new Class34();

	public static int method841(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		Class34 var5 = aClass34_805;
		synchronized (var5) {
			aClass34_805.aByteArray468 = var2;
			aClass34_805.anInt453 = var4 * -1326152903;
			aClass34_805.aByteArray450 = var0;
			aClass34_805.anInt466 = 0;
			aClass34_805.anInt442 = var1 * 1860233573;
			aClass34_805.anInt447 = 0;
			aClass34_805.anInt446 = 0;
			aClass34_805.anInt460 = 0;
			aClass34_805.anInt443 = 0;
			method867(aClass34_805);
			var1 -= aClass34_805.anInt442 * -1345314707;
			aClass34_805.aByteArray468 = null;
			aClass34_805.aByteArray450 = null;
			return var1;
		}
	}

	static void method842(Class34 var0) {
		byte var1 = var0.aByte444;
		int var6 = var0.anInt445 * -2134742141;
		int var5 = var0.anInt439 * -1485093569;
		int var4 = var0.anInt451 * 1015964001;
		int[] var2 = CacheableEntry_Sub23_Sub15.anIntArray2404;
		int var3 = var0.anInt452 * -1489006633;
		byte[] var12 = var0.aByteArray450;
		int var8 = var0.anInt466 * 1074759737;
		int var9 = var0.anInt442 * -1345314707;
		int var11 = var0.anInt433 * -464409865 + 1;

		label116:
		while (true) {
			if (var6 > 0) {
				while (true) {
					if (var9 == 0) {
						break label116;
					}

					if (var6 == 1) {
						if (var9 == 0) {
							var6 = 1;
							break label116;
						}

						var12[var8] = var1;
						++var8;
						--var9;
						break;
					}

					var12[var8] = var1;
					--var6;
					++var8;
					--var9;
				}
			}

			boolean var13 = true;

			byte var7;
			while (var13) {
				var13 = false;
				if (var5 == var11) {
					var6 = 0;
					break label116;
				}

				var1 = (byte) var4;
				var3 = var2[var3];
				var7 = (byte) (var3 & 255);
				var3 >>= 8;
				++var5;
				if (var7 != var4) {
					var4 = var7;
					if (var9 == 0) {
						var6 = 1;
						break label116;
					}

					var12[var8] = var1;
					++var8;
					--var9;
					var13 = true;
				} else if (var5 == var11) {
					if (var9 == 0) {
						var6 = 1;
						break label116;
					}

					var12[var8] = var1;
					++var8;
					--var9;
					var13 = true;
				}
			}

			var6 = 2;
			var3 = var2[var3];
			var7 = (byte) (var3 & 255);
			var3 >>= 8;
			++var5;
			if (var5 != var11) {
				if (var7 != var4) {
					var4 = var7;
				} else {
					var6 = 3;
					var3 = var2[var3];
					var7 = (byte) (var3 & 255);
					var3 >>= 8;
					++var5;
					if (var5 != var11) {
						if (var7 != var4) {
							var4 = var7;
						} else {
							var3 = var2[var3];
							var7 = (byte) (var3 & 255);
							var3 >>= 8;
							++var5;
							var6 = (var7 & 255) + 4;
							var3 = var2[var3];
							var4 = (byte) (var3 & 255);
							var3 >>= 8;
							++var5;
						}
					}
				}
			}
		}

		int var14 = var0.anInt443 * 327807537;
		var0.anInt443 += (var9 - var9) * -540137775;
		if (var0.anInt443 * 327807537 < var14) {
			;
		}

		var0.aByte444 = var1;
		var0.anInt445 = var6 * -728728789;
		var0.anInt439 = var5 * 2090150591;
		var0.anInt451 = var4 * -1057881439;
		CacheableEntry_Sub23_Sub15.anIntArray2404 = var2;
		var0.anInt452 = var3 * -1480469529;
		var0.aByteArray450 = var12;
		var0.anInt466 = var8 * 1771693577;
		var0.anInt442 = var9 * 1860233573;
	}

	static int method846(int var0, Class34 var1) {
		while (var1.anInt447 * -1763983995 < var0) {
			var1.anInt446 = (var1.anInt446 * 2043638395 << 8 | var1.aByteArray468[var1.anInt453 * 1748204297] & 255) * 2140183731;
			var1.anInt447 -= 526017944;
			var1.anInt453 -= 1326152903;
			var1.anInt460 -= 1992926219;
			if (var1.anInt460 * 196556893 == 0) {
				;
			}
		}

		int var3 = var1.anInt446 * 2043638395 >> var1.anInt447 * -1763983995 - var0 & (1 << var0) - 1;
		var1.anInt447 -= var0 * 1007989581;
		return var3;
	}

	static void method847(Class34 var0) {
		var0.anInt455 = 0;

		for (int var1 = 0; var1 < 256; var1++) {
			if (var0.aBoolArray456[var1]) {
				var0.aByteArray440[var0.anInt455 * -1627653711] = (byte) var1;
				var0.anInt455 -= 881414319;
			}
		}

	}

	static void method848(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
		int var7 = 0;

		int var9;
		for (var9 = var4; var9 <= var5; var9++) {
			for (int var8 = 0; var8 < var6; var8++) {
				if (var3[var8] == var9) {
					var2[var7] = var8;
					++var7;
				}
			}
		}

		for (var9 = 0; var9 < 23; var9++) {
			var1[var9] = 0;
		}

		for (var9 = 0; var9 < var6; var9++) {
			++var1[var3[var9] + 1];
		}

		for (var9 = 1; var9 < 23; var9++) {
			var1[var9] += var1[var9 - 1];
		}

		for (var9 = 0; var9 < 23; var9++) {
			var0[var9] = 0;
		}

		int var10 = 0;

		for (var9 = var4; var9 <= var5; var9++) {
			var10 += var1[var9 + 1] - var1[var9];
			var0[var9] = var10 - 1;
			var10 <<= 1;
		}

		for (var9 = var4 + 1; var9 <= var5; var9++) {
			var1[var9] = (var0[var9 - 1] + 1 << 1) - var1[var9];
		}

	}

	static byte method852(Class34 var0) {
		return (byte) method846(8, var0);
	}

	static byte method853(Class34 var0) {
		return (byte) method846(1, var0);
	}

	Class64() throws Throwable {
		throw new Error();
	}

	static void method867(Class34 var0) {
		boolean var1 = false;
		boolean var27 = false;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var28 = false;
		boolean var11 = false;
		boolean var20 = false;
		boolean var12 = false;
		boolean var10 = false;
		boolean var16 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var9 = false;
		boolean var7 = false;
		boolean var26 = false;
		boolean var29 = false;
		int var18 = 0;
		int[] var19 = null;
		int[] var8 = null;
		int[] var6 = null;
		var0.anInt441 = 1300789993;
		if (CacheableEntry_Sub23_Sub15.anIntArray2404 == null) {
			CacheableEntry_Sub23_Sub15.anIntArray2404 = new int[var0.anInt441 * 1085533600];
		}

		boolean var21 = true;

		while (true) {
			while (var21) {
				byte var17 = method852(var0);
				if (var17 == 23) {
					return;
				}

				var17 = method852(var0);
				var17 = method852(var0);
				var17 = method852(var0);
				var17 = method852(var0);
				var17 = method852(var0);
				var17 = method852(var0);
				var17 = method852(var0);
				var17 = method852(var0);
				var17 = method852(var0);
				var17 = method853(var0);
				if (var17 != 0) {
					;
				}

				var0.anInt449 = 0;
				var17 = method852(var0);
				var0.anInt449 = (var0.anInt449 * -523466351 << 8 | var17 & 255) * -2147002511;
				var17 = method852(var0);
				var0.anInt449 = (var0.anInt449 * -523466351 << 8 | var17 & 255) * -2147002511;
				var17 = method852(var0);
				var0.anInt449 = (var0.anInt449 * -523466351 << 8 | var17 & 255) * -2147002511;

				int var35;
				for (var35 = 0; var35 < 16; var35++) {
					var17 = method853(var0);
					if (var17 == 1) {
						var0.aBoolArray438[var35] = true;
					} else {
						var0.aBoolArray438[var35] = false;
					}
				}

				for (var35 = 0; var35 < 256; var35++) {
					var0.aBoolArray456[var35] = false;
				}

				int var53;
				for (var35 = 0; var35 < 16; var35++) {
					if (var0.aBoolArray438[var35]) {
						for (var53 = 0; var53 < 16; var53++) {
							var17 = method853(var0);
							if (var17 == 1) {
								var0.aBoolArray456[var35 * 16 + var53] = true;
							}
						}
					}
				}

				method847(var0);
				int var38 = var0.anInt455 * -1627653711 + 2;
				int var39 = method846(3, var0);
				int var54 = method846(15, var0);

				for (var35 = 0; var35 < var54; var35++) {
					var53 = 0;

					while (true) {
						var17 = method853(var0);
						if (var17 == 0) {
							var0.aByteArray431[var35] = (byte) var53;
							break;
						}

						++var53;
					}
				}

				byte[] var22 = new byte[6];

				byte var2;
				for (var2 = 0; var2 < var39; var22[var2] = var2++) {
					;
				}

				for (var35 = 0; var35 < var54; var35++) {
					var2 = var0.aByteArray431[var35];

					byte var30;
					for (var30 = var22[var2]; var2 > 0; --var2) {
						var22[var2] = var22[var2 - 1];
					}

					var22[0] = var30;
					var0.aByteArray461[var35] = var30;
				}

				int var36;
				for (var36 = 0; var36 < var39; var36++) {
					int var48 = method846(5, var0);

					for (var35 = 0; var35 < var38; var35++) {
						while (true) {
							var17 = method853(var0);
							if (var17 == 0) {
								var0.aByteArrayArray463[var36][var35] = (byte) var48;
								break;
							}

							var17 = method853(var0);
							if (var17 == 0) {
								++var48;
							} else {
								--var48;
							}
						}
					}
				}

				for (var36 = 0; var36 < var39; var36++) {
					byte var23 = 32;
					byte var31 = 0;

					for (var35 = 0; var35 < var38; var35++) {
						if (var0.aByteArrayArray463[var36][var35] > var31) {
							var31 = var0.aByteArrayArray463[var36][var35];
						}

						if (var0.aByteArrayArray463[var36][var35] < var23) {
							var23 = var0.aByteArrayArray463[var36][var35];
						}
					}

					method848(var0.anIntArrayArray464[var36], var0.anIntArrayArray465[var36], var0.anIntArrayArray462[var36], var0.aByteArrayArray463[var36], var23, var31, var38);
					var0.anIntArray467[var36] = var23;
				}

				int var43 = var0.anInt455 * -1627653711 + 1;
				int var50 = -1;
				byte var44 = 0;

				for (var35 = 0; var35 <= 255; var35++) {
					var0.anIntArray457[var35] = 0;
				}

				int var37 = 4095;

				int var51;
				int var56;
				for (var51 = 15; var51 >= 0; --var51) {
					for (var56 = 15; var56 >= 0; --var56) {
						var0.aByteArray459[var37] = (byte) (var51 * 16 + var56);
						--var37;
					}

					var0.anIntArray437[var51] = var37 + 1;
				}

				int var49 = 0;
				byte var55;
				if (var44 == 0) {
					++var50;
					var44 = 50;
					var55 = var0.aByteArray461[var50];
					var18 = var0.anIntArray467[var55];
					var19 = var0.anIntArrayArray464[var55];
					var6 = var0.anIntArrayArray462[var55];
					var8 = var0.anIntArrayArray465[var55];
				}

				int var45 = var44 - 1;
				int var41 = var18;

				int var40;
				byte var52;
				for (var40 = method846(var18, var0); var40 > var19[var41]; var40 = var40 << 1 | var52) {
					++var41;
					var52 = method853(var0);
				}

				int var42 = var6[var40 - var8[var41]];

				while (true) {
					while (var42 != var43) {
						if (var42 == 0 || var42 == 1) {
							int var46 = -1;
							int var47 = 1;

							do {
								if (var42 == 0) {
									var46 += var47 * 1;
								} else if (var42 == 1) {
									var46 += var47 * 2;
								}

								var47 *= 2;
								if (var45 == 0) {
									++var50;
									var45 = 50;
									var55 = var0.aByteArray461[var50];
									var18 = var0.anIntArray467[var55];
									var19 = var0.anIntArrayArray464[var55];
									var6 = var0.anIntArrayArray462[var55];
									var8 = var0.anIntArrayArray465[var55];
								}

								--var45;
								var41 = var18;

								for (var40 = method846(var18, var0); var40 > var19[var41]; var40 = var40 << 1 | var52) {
									++var41;
									var52 = method853(var0);
								}

								var42 = var6[var40 - var8[var41]];
							} while (var42 == 0 || var42 == 1);

							++var46;
							var17 = var0.aByteArray440[var0.aByteArray459[var0.anIntArray437[0]] & 255];

							for (var0.anIntArray457[var17 & 255] += var46; var46 > 0; --var46) {
								CacheableEntry_Sub23_Sub15.anIntArray2404[var49] = var17 & 255;
								++var49;
							}
						} else {
							int var33 = var42 - 1;
							int var24;
							if (var33 < 16) {
								var24 = var0.anIntArray437[0];

								for (var17 = var0.aByteArray459[var24 + var33]; var33 > 3; var33 -= 4) {
									int var32 = var24 + var33;
									var0.aByteArray459[var32] = var0.aByteArray459[var32 - 1];
									var0.aByteArray459[var32 - 1] = var0.aByteArray459[var32 - 2];
									var0.aByteArray459[var32 - 2] = var0.aByteArray459[var32 - 3];
									var0.aByteArray459[var32 - 3] = var0.aByteArray459[var32 - 4];
								}

								while (var33 > 0) {
									var0.aByteArray459[var24 + var33] = var0.aByteArray459[var24 + var33 - 1];
									--var33;
								}

								var0.aByteArray459[var24] = var17;
							} else {
								int var25 = var33 / 16;
								int var34 = var33 % 16;
								var24 = var0.anIntArray437[var25] + var34;

								for (var17 = var0.aByteArray459[var24]; var24 > var0.anIntArray437[var25]; --var24) {
									var0.aByteArray459[var24] = var0.aByteArray459[var24 - 1];
								}

								++var0.anIntArray437[var25];

								while (var25 > 0) {
									--var0.anIntArray437[var25];
									var0.aByteArray459[var0.anIntArray437[var25]] = var0.aByteArray459[var0.anIntArray437[var25 - 1] + 16 - 1];
									--var25;
								}

								--var0.anIntArray437[0];
								var0.aByteArray459[var0.anIntArray437[0]] = var17;
								if (var0.anIntArray437[0] == 0) {
									var37 = 4095;

									for (var51 = 15; var51 >= 0; --var51) {
										for (var56 = 15; var56 >= 0; --var56) {
											var0.aByteArray459[var37] = var0.aByteArray459[var0.anIntArray437[var51] + var56];
											--var37;
										}

										var0.anIntArray437[var51] = var37 + 1;
									}
								}
							}

							++var0.anIntArray457[var0.aByteArray440[var17 & 255] & 255];
							CacheableEntry_Sub23_Sub15.anIntArray2404[var49] = var0.aByteArray440[var17 & 255] & 255;
							++var49;
							if (var45 == 0) {
								++var50;
								var45 = 50;
								var55 = var0.aByteArray461[var50];
								var18 = var0.anIntArray467[var55];
								var19 = var0.anIntArrayArray464[var55];
								var6 = var0.anIntArrayArray462[var55];
								var8 = var0.anIntArrayArray465[var55];
							}

							--var45;
							var41 = var18;

							for (var40 = method846(var18, var0); var40 > var19[var41]; var40 = var40 << 1 | var52) {
								++var41;
								var52 = method853(var0);
							}

							var42 = var6[var40 - var8[var41]];
						}
					}

					var0.anInt445 = 0;
					var0.aByte444 = 0;
					var0.anIntArray454[0] = 0;

					for (var35 = 1; var35 <= 256; var35++) {
						var0.anIntArray454[var35] = var0.anIntArray457[var35 - 1];
					}

					for (var35 = 1; var35 <= 256; var35++) {
						var0.anIntArray454[var35] += var0.anIntArray454[var35 - 1];
					}

					for (var35 = 0; var35 < var49; var35++) {
						var17 = (byte) (CacheableEntry_Sub23_Sub15.anIntArray2404[var35] & 255);
						CacheableEntry_Sub23_Sub15.anIntArray2404[var0.anIntArray454[var17 & 255]] |= var35 << 8;
						++var0.anIntArray454[var17 & 255];
					}

					var0.anInt452 = (CacheableEntry_Sub23_Sub15.anIntArray2404[var0.anInt449 * -523466351] >> 8) * -1480469529;
					var0.anInt439 = 0;
					var0.anInt452 = CacheableEntry_Sub23_Sub15.anIntArray2404[var0.anInt452 * -1489006633] * -1480469529;
					var0.anInt451 = (byte) (var0.anInt452 * -1489006633 & 255) * -1057881439;
					var0.anInt452 = (var0.anInt452 * -1489006633 >> 8) * -1480469529;
					var0.anInt439 += 2090150591;
					var0.anInt433 = var49 * 1479292615;
					method842(var0);
					if (var0.anInt439 * -1485093569 == var0.anInt433 * -464409865 + 1 && var0.anInt445 * -2134742141 == 0) {
						var21 = true;
						break;
					}

					var21 = false;
					break;
				}
			}

			return;
		}
	}

}
