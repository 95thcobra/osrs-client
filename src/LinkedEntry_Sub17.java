public class LinkedEntry_Sub17 extends LinkedEntry {

	JagexMap aJagexMap_1892;
	byte[] aByteArray1893;

	void method2113() {
		aJagexMap_1892 = null;
	}

	LinkedEntry_Sub17(DataBuffer var1) {
		var1.pos = (var1.data.length - 3) * 1303963473;
		int var14 = var1.readUByte();
		int var5 = var1.readUShort();
		int var18 = 14 + var14 * 10;
		var1.pos = 0;
		int var20 = 0;
		int var8 = 0;
		int var21 = 0;
		int var9 = 0;
		int var6 = 0;
		int var10 = 0;
		int var26 = 0;
		int var12 = 0;

		int var13;
		int var15;
		int var17;
		for (var13 = 0; var13 < var14; var13++) {
			var15 = -1;

			while (true) {
				var17 = var1.readUByte();
				if (var17 != var15) {
					++var18;
				}

				var15 = var17 & 15;
				if (var17 == 7) {
					break;
				}

				if (var17 == 23) {
					++var20;
				} else if (var15 == 0) {
					++var21;
				} else if (var15 == 1) {
					++var9;
				} else if (var15 == 2) {
					++var8;
				} else if (var15 == 3) {
					++var6;
				} else if (var15 == 4) {
					++var10;
				} else if (var15 == 5) {
					++var26;
				} else {
					if (var15 != 6) {
						throw new RuntimeException();
					}

					++var12;
				}
			}
		}

		var18 += var20 * 5;
		var18 += (var21 + var9 + var8 + var6 + var26) * 2;
		var18 += var10 + var12;
		var13 = var1.pos * 1736753585;
		var15 = var14 + var20 + var8 + var21 + var9 + var6 + var10 + var26 + var12;

		for (var17 = 0; var17 < var15; var17++) {
			var1.method2075(-2040339769);
		}

		var18 += var1.pos * 1736753585 - var13;
		var17 = var1.pos * 1736753585;
		int var40 = 0;
		int var29 = 0;
		int var22 = 0;
		int var30 = 0;
		int var31 = 0;
		int var42 = 0;
		int var28 = 0;
		int var43 = 0;
		int var36 = 0;
		int var23 = 0;
		int var35 = 0;
		int var45 = 0;
		int var4 = 0;

		int var37;
		for (var37 = 0; var37 < var8; var37++) {
			var4 = var4 + var1.readUByte() & 127;
			if (var4 != 0 && var4 != 32) {
				if (var4 == 1) {
					++var40;
				} else if (var4 == 33) {
					++var29;
				} else if (var4 == 7) {
					++var22;
				} else if (var4 == 39) {
					++var30;
				} else if (var4 == 10) {
					++var31;
				} else if (var4 == 42) {
					++var42;
				} else if (var4 == 99) {
					++var28;
				} else if (var4 == 98) {
					++var43;
				} else if (var4 == 101) {
					++var36;
				} else if (var4 == 100) {
					++var23;
				} else if (var4 != 64 && var4 != 65 && var4 != 120 && var4 != 121 && var4 != 123) {
					++var45;
				} else {
					++var35;
				}
			} else {
				++var12;
			}
		}

		var37 = 0;
		int var33 = var1.pos * 1736753585;
		var1.pos += var35 * 1303963473;
		int var47 = var1.pos * 1736753585;
		var1.pos += var26 * 1303963473;
		int var11 = var1.pos * 1736753585;
		var1.pos += var10 * 1303963473;
		int var48 = var1.pos * 1736753585;
		var1.pos += var6 * 1303963473;
		int var49 = var1.pos * 1736753585;
		var1.pos += var40 * 1303963473;
		int var50 = var1.pos * 1736753585;
		var1.pos += var22 * 1303963473;
		int var66 = var1.pos * 1736753585;
		var1.pos += var31 * 1303963473;
		int var38 = var1.pos * 1736753585;
		var1.pos += (var21 + var9 + var26) * 1303963473;
		int var53 = var1.pos * 1736753585;
		var1.pos += var21 * 1303963473;
		int var54 = var1.pos * 1736753585;
		var1.pos += var45 * 1303963473;
		int var41 = var1.pos * 1736753585;
		var1.pos += var9 * 1303963473;
		int var52 = var1.pos * 1736753585;
		var1.pos += var29 * 1303963473;
		int var55 = var1.pos * 1736753585;
		var1.pos += var30 * 1303963473;
		int var56 = var1.pos * 1736753585;
		var1.pos += var42 * 1303963473;
		int var44 = var1.pos * 1736753585;
		var1.pos += var12 * 1303963473;
		int var57 = var1.pos * 1736753585;
		var1.pos += var6 * 1303963473;
		int var7 = var1.pos * 1736753585;
		var1.pos += var28 * 1303963473;
		int var39 = var1.pos * 1736753585;
		var1.pos += var43 * 1303963473;
		int var58 = var1.pos * 1736753585;
		var1.pos += var36 * 1303963473;
		int var32 = var1.pos * 1736753585;
		var1.pos += var23 * 1303963473;
		int var60 = var1.pos * 1736753585;
		var1.pos += var20 * -383076877;
		aByteArray1893 = new byte[var18];
		DataBuffer var2 = new DataBuffer(aByteArray1893);
		var2.writeInt(1297377380);
		var2.writeInt(6);
		var2.writeShort(var14 > 1 ? 1 : 0);
		var2.writeShort(var14);
		var2.writeShort(var5);
		var1.pos = var13 * 1303963473;
		int var46 = 0;
		int var27 = 0;
		int var51 = 0;
		int var59 = 0;
		int var61 = 0;
		int var16 = 0;
		int var63 = 0;
		int[] var64 = new int[128];
		var4 = 0;

		label362:
		for (int var65 = 0; var65 < var14; var65++) {
			var2.writeInt(1297379947);
			var2.pos += 920886596;
			int var3 = var2.pos * 1736753585;
			int var19 = -1;

			while (true) {
				while (true) {
					int var62 = var1.method2075(-2040339769);
					var2.method2019(var62);
					int var25 = var1.data[var37++] & 255;
					boolean var24 = var25 != var19;
					var19 = var25 & 15;
					if (var25 == 7) {
						if (var24) {
							var2.writeByte(255);
						}

						var2.writeByte(47);
						var2.writeByte(0);
						var2.endVarInt(var2.pos * 1736753585 - var3);
						continue label362;
					}

					if (var25 == 23) {
						if (var24) {
							var2.writeByte(255);
						}

						var2.writeByte(81);
						var2.writeByte(3);
						var2.writeByte(var1.data[var60++]);
						var2.writeByte(var1.data[var60++]);
						var2.writeByte(var1.data[var60++]);
					} else {
						var46 ^= var25 >> 4;
						if (var19 == 0) {
							if (var24) {
								var2.writeByte(144 + var46);
							}

							var27 += var1.data[var38++];
							var51 += var1.data[var53++];
							var2.writeByte(var27 & 127);
							var2.writeByte(var51 & 127);
						} else if (var19 == 1) {
							if (var24) {
								var2.writeByte(128 + var46);
							}

							var27 += var1.data[var38++];
							var59 += var1.data[var41++];
							var2.writeByte(var27 & 127);
							var2.writeByte(var59 & 127);
						} else if (var19 == 2) {
							if (var24) {
								var2.writeByte(176 + var46);
							}

							var4 = var4 + var1.data[var17++] & 127;
							var2.writeByte(var4);
							byte var34;
							if (var4 != 0 && var4 != 32) {
								if (var4 == 1) {
									var34 = var1.data[var49++];
								} else if (var4 == 33) {
									var34 = var1.data[var52++];
								} else if (var4 == 7) {
									var34 = var1.data[var50++];
								} else if (var4 == 39) {
									var34 = var1.data[var55++];
								} else if (var4 == 10) {
									var34 = var1.data[var66++];
								} else if (var4 == 42) {
									var34 = var1.data[var56++];
								} else if (var4 == 99) {
									var34 = var1.data[var7++];
								} else if (var4 == 98) {
									var34 = var1.data[var39++];
								} else if (var4 == 101) {
									var34 = var1.data[var58++];
								} else if (var4 == 100) {
									var34 = var1.data[var32++];
								} else if (var4 != 64 && var4 != 65 && var4 != 120 && var4 != 121 && var4 != 123) {
									var34 = var1.data[var54++];
								} else {
									var34 = var1.data[var33++];
								}
							} else {
								var34 = var1.data[var44++];
							}

							int var67 = var34 + var64[var4];
							var64[var4] = var67;
							var2.writeByte(var67 & 127);
						} else if (var19 == 3) {
							if (var24) {
								var2.writeByte(224 + var46);
							}

							var61 += var1.data[var57++];
							var61 += var1.data[var48++] << 7;
							var2.writeByte(var61 & 127);
							var2.writeByte(var61 >> 7 & 127);
						} else if (var19 == 4) {
							if (var24) {
								var2.writeByte(208 + var46);
							}

							var16 += var1.data[var11++];
							var2.writeByte(var16 & 127);
						} else if (var19 == 5) {
							if (var24) {
								var2.writeByte(160 + var46);
							}

							var27 += var1.data[var38++];
							var63 += var1.data[var47++];
							var2.writeByte(var27 & 127);
							var2.writeByte(var63 & 127);
						} else {
							if (var19 != 6) {
								throw new RuntimeException();
							}

							if (var24) {
								var2.writeByte(192 + var46);
							}

							var2.writeByte(var1.data[var44++]);
						}
					}
				}
			}
		}

	}

	void method2114() {
		if (aJagexMap_1892 == null) {
			aJagexMap_1892 = new JagexMap(16);
			int[] var3 = new int[16];
			int[] var7 = new int[16];
			var7[9] = 128;
			var3[9] = 128;
			Class105 var8 = new Class105(aByteArray1893);
			int var14 = var8.method1336();

			int var9;
			for (var9 = 0; var9 < var14; var9++) {
				var8.method1290(var9);
				var8.method1315(var9);
				var8.method1287(var9);
			}

			label81:
			do {
				while (true) {
					var9 = var8.method1294();
					int var12 = var8.anIntArray1474[var9];

					while (var8.anIntArray1474[var9] == var12) {
						var8.method1290(var9);
						int var1 = var8.method1289(var9);
						if (var1 == 1) {
							var8.method1288();
							var8.method1287(var9);
							continue label81;
						}

						int var13 = var1 & 240;
						int var2;
						int var10;
						int var11;
						if (var13 == 176) {
							var10 = var1 & 15;
							var2 = var1 >> 8 & 127;
							var11 = var1 >> 16 & 127;
							if (var2 == 0) {
								var3[var10] = (var3[var10] & -2080769) + (var11 << 14);
							}

							if (var2 == 32) {
								var3[var10] = (var3[var10] & -16257) + (var11 << 7);
							}
						}

						if (var13 == 192) {
							var10 = var1 & 15;
							var2 = var1 >> 8 & 127;
							var7[var10] = var3[var10] + var2;
						}

						if (var13 == 144) {
							var10 = var1 & 15;
							var2 = var1 >> 8 & 127;
							var11 = var1 >> 16 & 127;
							if (var11 > 0) {
								int var5 = var7[var10];
								LinkedEntry_Sub22 var4 = (LinkedEntry_Sub22) aJagexMap_1892.get((long) var5);
								if (var4 == null) {
									var4 = new LinkedEntry_Sub22(new byte[128]);
									aJagexMap_1892.put(var4, (long) var5);
								}

								var4.aByteArray2084[var2] = 1;
							}
						}

						var8.method1315(var9);
						var8.method1287(var9);
					}
				}
			} while (!var8.method1283());

		}
	}

	public static LinkedEntry_Sub17 method2115(IndexDescriptor var0, int var1, int var2) {
		byte[] var3 = var0.getFileData(var1, var2);
		return var3 != null ? new LinkedEntry_Sub17(new DataBuffer(var3)) : null;
	}

}
