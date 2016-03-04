import java.io.IOException;

public class Class23 {

	static final int anInt295 = 57;
	static final int anInt296 = 2;
	static final int anInt297 = 29;
	static final int anInt298 = 5;
	static final int anInt299 = 1;
	static final int anInt300 = 6;
	static final int anInt301 = 9;
	static final int anInt302 = 18;
	static final int anInt303 = 3;
	static final int anInt304 = 45;
	static final int anInt305 = 30;
	static final int anInt306 = 26;
	static final int anInt307 = 47;
	static final int anInt308 = 1007;
	static CacheableEntry_Sub23_Sub14_Sub4_Sub1 aClass109_Sub23_Sub14_Sub4_Sub1_309;
	static final int anInt310 = 69;
	static final int anInt311 = 21;
	static final int anInt312 = 8;
	static int anInt313;

	Class23() throws Throwable {
		throw new Error();
	}

	static final void method350(int var0, int var1, int var2, int var3, int var4) {
		if (GameClient.anInt3018 * -1710049223 == 0 && !GameClient.isPickingOption) {
			Class1.addMenuOption(Class90.WALK_HERE, "", 23, 0, var0 - var2, var1 - var3);
		}

		int var6 = -1;
		int var7 = -1;

		int var8;
		int objinfo;
		for (var8 = 0; var8 < CacheableEntry_Sub23_Sub16_Sub5.anInt2680; var8++) {
			objinfo = CacheableEntry_Sub23_Sub16_Sub5.anIntArray2689[var8];
			int x = objinfo & 127;
			int y = objinfo >> 7 & 127;
			int var13 = objinfo >> 29 & 3;
			int objId = objinfo >> 14 & 32767;
			if (var7 != objinfo) {
				var7 = objinfo;
				if (var13 == 2 && LinkedEntry_Sub6.aClass39_1732.method531(CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, x, y, objinfo) >= 0) {
					ObjectDef objdef = Class56.getObjectDef(objId);
					if (objdef.anIntArray2299 != null) {
						objdef = objdef.method2433(-190961142);
					}

					if (objdef == null) {
						continue;
					}

					if (GameClient.anInt3018 * -1710049223 == 1) {
						Class1.addMenuOption(Class90.USE, GameClient.aString3019 + " " + Class37.ARROW_RIGHT + " " + Class22.hexColTag(65535) + objdef.name, 1, objinfo, x, y);
					} else if (GameClient.isPickingOption) {
						if ((Class48.currentInterfaceOptions * 253871613 & 4) == 4) {
							Class1.addMenuOption(GameClient.currentInterfaceAction, GameClient.aString2967 + " " + Class37.ARROW_RIGHT + " " + Class22.hexColTag(65535) + objdef.name, 2, objinfo, x, y);
						}
					} else {
						String[] options = objdef.options;
						if (GameClient.debugOptions) {
							options = Class38.prefixOptionArray(options);
						}

						if (options != null) {
							for (int opt = 4; opt >= 0; --opt) {
								if (options[opt] != null) {
									short actionId = 0;
									if (opt == 0) {
										actionId = 3;
									}

									if (opt == 1) {
										actionId = 4;
									}

									if (opt == 2) {
										actionId = 5;
									}

									if (opt == 3) {
										actionId = 6;
									}

									if (opt == 4) {
										actionId = 1001;
									}

									Class1.addMenuOption(options[opt], Class22.hexColTag(0xffff) + objdef.name, actionId, objinfo, x, y);
								}
							}
						}

						Class1.addMenuOption(Class90.EXAMINE, Class22.hexColTag(65535) + objdef.name, 1002, objdef.id * 1944152765 << 14, x, y);
					}
				}

				Npc var24;
				Player var25;
				int var26;
				if (var13 == 1) {
					Npc var20 = GameClient.sceneNpcs[objId];
					if (var20 == null) {
						continue;
					}

					if (var20.definition.anInt2222 * 951781961 == 1 && (var20.anInt2521 * -1051150961 & 127) == 64 && (var20.anInt2505 * -844883935 & 127) == 64) {
						for (var26 = 0; var26 < GameClient.numLocalNpcs * 1974577941; var26++) {
							var24 = GameClient.sceneNpcs[GameClient.npcIndices[var26]];
							if (var24 != null && var20 != var24 && var24.definition.anInt2222 * 951781961 == 1 && var24.anInt2521 * -1051150961 == var20.anInt2521 * -1051150961 && var24.anInt2505 * -844883935 == var20.anInt2505 * -844883935) {
								Class35.method485(var24.definition, GameClient.npcIndices[var26], x, y, 691442848);
							}
						}

						for (var26 = 0; var26 < GameClient.anInt3091 * -796710281; var26++) {
							var25 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[GameClient.anIntArray3107[var26]];
							if (var25 != null && var20.anInt2521 * -1051150961 == var25.anInt2521 * -1051150961 && var25.anInt2505 * -844883935 == var20.anInt2505 * -844883935) {
								DataBuffer.method2033(var25, GameClient.anIntArray3107[var26], x, y, -2069332470);
							}
						}
					}

					Class35.method485(var20.definition, objId, x, y, 350086051);
				}

				if (var13 == 0) {
					Player var21 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[objId];
					if (var21 == null) {
						continue;
					}

					if ((var21.anInt2521 * -1051150961 & 127) == 64 && (var21.anInt2505 * -844883935 & 127) == 64) {
						for (var26 = 0; var26 < GameClient.numLocalNpcs * 1974577941; var26++) {
							var24 = GameClient.sceneNpcs[GameClient.npcIndices[var26]];
							if (var24 != null && var24.definition.anInt2222 * 951781961 == 1 && var24.anInt2521 * -1051150961 == var21.anInt2521 * -1051150961 && var21.anInt2505 * -844883935 == var24.anInt2505 * -844883935) {
								Class35.method485(var24.definition, GameClient.npcIndices[var26], x, y, 1444042458);
							}
						}

						for (var26 = 0; var26 < GameClient.anInt3091 * -796710281; var26++) {
							var25 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[GameClient.anIntArray3107[var26]];
							if (var25 != null && var21 != var25 && var21.anInt2521 * -1051150961 == var25.anInt2521 * -1051150961 && var25.anInt2505 * -844883935 == var21.anInt2505 * -844883935) {
								DataBuffer.method2033(var25, GameClient.anIntArray3107[var26], x, y, -1666349144);
							}
						}
					}

					if (GameClient.anInt2867 * -208567815 != objId) {
						DataBuffer.method2033(var21, objId, x, y, -1762739084);
					} else {
						var6 = objinfo;
					}
				}

				if (var13 == 3) {
					JagexLinkedList var22 = GameClient.aJagexLinkedListArrayArrayArray2998[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619][x][y];
					if (var22 != null) {
						for (CacheableEntry_Sub23_Sub16_Sub3 var28 = (CacheableEntry_Sub23_Sub16_Sub3) var22.method1401(); var28 != null; var28 = (CacheableEntry_Sub23_Sub16_Sub3) var22.method1403()) {
							ItemDef var27 = PacketDecoder.getItemDef(var28.anInt2570 * 1500342151);
							if (GameClient.anInt3018 * -1710049223 == 1) {
								Class1.addMenuOption(Class90.USE, GameClient.aString3019 + " " + Class37.ARROW_RIGHT + " " + Class22.hexColTag(16748608) + var27.name, 16, var28.anInt2570 * 1500342151, x, y);
							} else if (GameClient.isPickingOption) {
								if ((Class48.currentInterfaceOptions * 253871613 & 1) == 1) {
									Class1.addMenuOption(GameClient.currentInterfaceAction, GameClient.aString2967 + " " + Class37.ARROW_RIGHT + " " + Class22.hexColTag(16748608) + var27.name, 17, var28.anInt2570 * 1500342151, x, y);
								}
							} else {
								String[] var19 = var27.options;
								if (GameClient.debugOptions) {
									var19 = Class38.prefixOptionArray(var19);
								}

								for (int var17 = 4; var17 >= 0; --var17) {
									if (var19 != null && var19[var17] != null) {
										byte var18 = 0;
										if (var17 == 0) {
											var18 = 18;
										}

										if (var17 == 1) {
											var18 = 19;
										}

										if (var17 == 2) {
											var18 = 20;
										}

										if (var17 == 3) {
											var18 = 21;
										}

										if (var17 == 4) {
											var18 = 22;
										}

										Class1.addMenuOption(var19[var17], Class22.hexColTag(16748608) + var27.name, var18, var28.anInt2570 * 1500342151, x, y);
									} else if (var17 == 2) {
										Class1.addMenuOption(Class90.TAKE, Class22.hexColTag(16748608) + var27.name, 20, var28.anInt2570 * 1500342151, x, y);
									}
								}

								Class1.addMenuOption(Class90.EXAMINE, Class22.hexColTag(16748608) + var27.name, 1004, var28.anInt2570 * 1500342151, x, y);
							}
						}
					}
				}
			}
		}

		if (var6 != -1) {
			var8 = var6 & 127;
			objinfo = var6 >> 7 & 127;
			Player var23 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[GameClient.anInt2867 * -208567815];
			DataBuffer.method2033(var23, GameClient.anInt2867 * -208567815, var8, objinfo, -1956531586);
		}

	}

	public static void method351(int var0) {
		if (Class97.aConnection_1393 != null) {
			Class97.aConnection_1393.terminate();
		}

	}

	public static boolean method352(int var0) {
		long var1 = Class10.method216((short) 255);
		int var3 = (int) (var1 - Class31.aLong387 * -2138204234370644471L);
		Class31.aLong387 = var1 * 4667296355062474809L;
		if (var3 > 200) {
			var3 = 200;
		}

		Class97.anInt1397 += var3 * 508368235;
		if (Class97.anInt1377 * 1479147795 == 0 && Class97.anInt1382 * -1432304815 == 0 && Class97.anInt1385 * -1715959439 == 0 && Class97.anInt1378 * 1403506591 == 0) {
			return true;
		} else if (Class97.aConnection_1393 == null) {
			return false;
		} else {
			try {
				if (Class97.anInt1397 * 689860419 > 30000) {
					throw new IOException();
				} else {
					CacheableEntry_Sub23_Sub19 var4;
					DataBuffer var5;
					while (Class97.anInt1382 * -1432304815 < 20 && Class97.anInt1378 * 1403506591 > 0) {
						var4 = (CacheableEntry_Sub23_Sub19) Class97.aJagexMap_1379.method1537();
						var5 = new DataBuffer(4);
						var5.writeByte(1);
						var5.writeTriByte((int) var4.key);
						Class97.aConnection_1393.write(var5.data, 0, 4);
						Class97.aJagexMap_1381.put(var4, var4.key);
						Class97.anInt1378 -= 913411167;
						Class97.anInt1382 += 111830449;
					}

					while (Class97.anInt1377 * 1479147795 < 20 && Class97.anInt1385 * -1715959439 > 0) {
						var4 = (CacheableEntry_Sub23_Sub19) Class97.aClass116_1395.method1463();
						var5 = new DataBuffer(4);
						var5.writeByte(0);
						var5.writeTriByte((int) var4.key);
						Class97.aConnection_1393.write(var5.data, 0, 4);
						var4.method2209();
						Class97.aJagexMap_1386.put(var4, var4.key);
						Class97.anInt1385 -= 61937553;
						Class97.anInt1377 -= 434769637;
					}

					for (int var20 = 0; var20 < 100; var20++) {
						int var21 = Class97.aConnection_1393.available();
						if (var21 < 0) {
							throw new IOException();
						}

						if (var21 == 0) {
							break;
						}

						Class97.anInt1397 = 0;
						byte var6 = 0;
						if (DataBuffer.aClass109_Sub23_Sub19_1831 == null) {
							var6 = 8;
						} else if (Class97.anInt1390 * -1706250695 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						int var11;
						if (var6 > 0) {
							var7 = var6 - Class97.aDataBuffer_1396.pos * 1736753585;
							if (var7 > var21) {
								var7 = var21;
							}

							Class97.aConnection_1393.read(Class97.aDataBuffer_1396.data, Class97.aDataBuffer_1396.pos * 1736753585, var7);
							if (Class97.aByte1388 != 0) {
								for (var8 = 0; var8 < var7; var8++) {
									Class97.aDataBuffer_1396.data[var8 + Class97.aDataBuffer_1396.pos * 1736753585] ^= Class97.aByte1388;
								}
							}

							Class97.aDataBuffer_1396.pos += var7 * 1303963473;
							if (Class97.aDataBuffer_1396.pos * 1736753585 < var6) {
								break;
							}

							if (DataBuffer.aClass109_Sub23_Sub19_1831 == null) {
								Class97.aDataBuffer_1396.pos = 0;
								var8 = Class97.aDataBuffer_1396.readUByte();
								var9 = Class97.aDataBuffer_1396.readUShort();
								int var10 = Class97.aDataBuffer_1396.readUByte();
								var11 = Class97.aDataBuffer_1396.readInt();
								long var12 = (long) (var9 + (var8 << 16));
								CacheableEntry_Sub23_Sub19 var14 = (CacheableEntry_Sub23_Sub19) Class97.aJagexMap_1381.get(var12);
								Class79.aBool947 = true;
								if (var14 == null) {
									var14 = (CacheableEntry_Sub23_Sub19) Class97.aJagexMap_1386.get(var12);
									Class79.aBool947 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								DataBuffer.aClass109_Sub23_Sub19_1831 = var14;
								Class97.aDataBuffer_1389 = new DataBuffer(DataBuffer.aClass109_Sub23_Sub19_1831.aByte2447 + var15 + var11);
								Class97.aDataBuffer_1389.writeByte(var10);
								Class97.aDataBuffer_1389.writeInt(var11);
								Class97.anInt1390 = -1914240952;
								Class97.aDataBuffer_1396.pos = 0;
							} else if (Class97.anInt1390 * -1706250695 == 0) {
								if (Class97.aDataBuffer_1396.data[0] == -1) {
									Class97.anInt1390 = -776151031;
									Class97.aDataBuffer_1396.pos = 0;
								} else {
									DataBuffer.aClass109_Sub23_Sub19_1831 = null;
								}
							}
						} else {
							var7 = Class97.aDataBuffer_1389.data.length - DataBuffer.aClass109_Sub23_Sub19_1831.aByte2447;
							var8 = 512 - Class97.anInt1390 * -1706250695;
							if (var8 > var7 - Class97.aDataBuffer_1389.pos * 1736753585) {
								var8 = var7 - Class97.aDataBuffer_1389.pos * 1736753585;
							}

							if (var8 > var21) {
								var8 = var21;
							}

							Class97.aConnection_1393.read(Class97.aDataBuffer_1389.data, Class97.aDataBuffer_1389.pos * 1736753585, var8);
							if (Class97.aByte1388 != 0) {
								for (var9 = 0; var9 < var8; var9++) {
									Class97.aDataBuffer_1389.data[var9 + Class97.aDataBuffer_1389.pos * 1736753585] ^= Class97.aByte1388;
								}
							}

							Class97.aDataBuffer_1389.pos += var8 * 1303963473;
							Class97.anInt1390 += var8 * -776151031;
							if (var7 == Class97.aDataBuffer_1389.pos * 1736753585) {
								if (DataBuffer.aClass109_Sub23_Sub19_1831.key == 16711935L) {
									Class72.aDataBuffer_874 = Class97.aDataBuffer_1389;

									for (var9 = 0; var9 < 256; var9++) {
										IndexDescriptor_Sub1 var22 = Class97.aClass94_Sub1Array1392[var9];
										if (var22 != null) {
											Class72.aDataBuffer_874.pos = var9 * 1841773192 - 2070117227;
											var11 = Class72.aDataBuffer_874.readInt();
											int var16 = Class72.aDataBuffer_874.readInt();
											var22.method2129(var11, var16, (byte) -75);
										}
									}
								} else {
									Class97.aCRC32_1391.reset();
									Class97.aCRC32_1391.update(Class97.aDataBuffer_1389.data, 0, var7);
									var9 = (int) Class97.aCRC32_1391.getValue();
									if (var9 != DataBuffer.aClass109_Sub23_Sub19_1831.anInt2446 * 492229115) {
										try {
											Class97.aConnection_1393.terminate();
										} catch (Exception var18) {
											;
										}

										Class97.anInt1394 -= 671763761;
										Class97.aConnection_1393 = null;
										Class97.aByte1388 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
										return false;
									}

									Class97.anInt1394 = 0;
									Class97.anInt1387 = 0;
									DataBuffer.aClass109_Sub23_Sub19_1831.aClass94_Sub1_2450.method2130((int) (DataBuffer.aClass109_Sub23_Sub19_1831.key & 65535L), Class97.aDataBuffer_1389.data, (DataBuffer.aClass109_Sub23_Sub19_1831.key & 16711680L) == 16711680L, Class79.aBool947, (byte) 91);
								}

								DataBuffer.aClass109_Sub23_Sub19_1831.unlink();
								if (Class79.aBool947) {
									Class97.anInt1382 -= 111830449;
								} else {
									Class97.anInt1377 += 434769637;
								}

								Class97.anInt1390 = 0;
								DataBuffer.aClass109_Sub23_Sub19_1831 = null;
								Class97.aDataBuffer_1389 = null;
							} else {
								if (Class97.anInt1390 * -1706250695 != 512) {
									break;
								}

								Class97.anInt1390 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var19) {
				try {
					Class97.aConnection_1393.terminate();
				} catch (Exception var17) {
					;
				}

				Class97.anInt1387 += 629140595;
				Class97.aConnection_1393 = null;
				return false;
			}
		}
	}

	public static Object method353(byte[] var0, boolean var1, int var2) {
		if (var0 == null) {
			return null;
		} else {
			if (var0.length > 136 && !Class67.aBool842) {
				try {
					Class67_Sub1 var3 = new Class67_Sub1();
					var3.method907(var0, (byte) 6);
					return var3;
				} catch (Throwable var4) {
					Class67.aBool842 = true;
				}
			}

			return var1 ? Class25.method368(var0, 1909259689) : var0;
		}
	}

}
