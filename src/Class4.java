public class Class4 {

	public static final int anInt76 = 246;
	static Class51[] aClass51Array80;
	static final int anInt81 = 23;
	static final int anInt82 = 12;
	static final int anInt83 = 35;
	public static final int anInt84 = 128;
	static Class4 aClass4_85 = new Class4();
	static Class4 aClass4_77 = new Class4();
	static Class4 aClass4_78 = new Class4();
	static Class4 aClass4_79 = new Class4();

	public static boolean hasDraggableSetting(int setting) {
		return (setting >> 29 & 1) != 0;
	}

	static final void method132(int var0) {
		int var2;
		int var3;
		int var4;
		int var5;
		CacheableEntry_Sub23_Sub16_Sub3 var34;
		if (GameClient.incomingMessage * -2146869835 == 244) {
			var2 = GameClient.gameBuffer.readUByteN();
			var3 = Class79.mapPacketBaseX * -1886971203 + (var2 >> 4 & 7);
			var4 = (var2 & 7) + ObjectDef.mapPacketBaseZ * 616951789;
			var5 = GameClient.gameBuffer.readUShortA();
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
				JagexLinkedList var33 = GameClient.aJagexLinkedListArrayArrayArray2998[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619][var3][var4];
				if (var33 != null) {
					for (var34 = (CacheableEntry_Sub23_Sub16_Sub3) var33.method1405(); var34 != null; var34 = (CacheableEntry_Sub23_Sub16_Sub3) var33.method1402()) {
						if (var34.anInt2570 * 1500342151 == (var5 & 32767)) {
							var34.unlink();
							break;
						}
					}

					if (var33.method1405() == null) {
						GameClient.aJagexLinkedListArrayArrayArray2998[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619][var3][var4] = null;
					}

					CacheableEntry_Sub23_Sub16_Sub1.method2940(var3, var4, (byte) 96);
				}
			}

		} else {
			int var7;
			int var10;
			if (GameClient.incomingMessage * -2146869835 == 113) {
				var2 = GameClient.gameBuffer.readUByte();
				var3 = Class79.mapPacketBaseX * -1886971203 + (var2 >> 4 & 7);
				var4 = (var2 & 7) + ObjectDef.mapPacketBaseZ * 616951789;
				var5 = GameClient.gameBuffer.readUShort();
				var7 = GameClient.gameBuffer.readUShort();
				var10 = GameClient.gameBuffer.readUShort();
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
					JagexLinkedList var31 = GameClient.aJagexLinkedListArrayArrayArray2998[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619][var3][var4];
					if (var31 != null) {
						for (CacheableEntry_Sub23_Sub16_Sub3 var32 = (CacheableEntry_Sub23_Sub16_Sub3) var31.method1405(); var32 != null; var32 = (CacheableEntry_Sub23_Sub16_Sub3) var31.method1402()) {
							if ((var5 & 32767) == var32.anInt2570 * 1500342151 && var7 == var32.anInt2569 * 640802101) {
								var32.anInt2569 = var10 * 1890405661;
								break;
							}
						}

						CacheableEntry_Sub23_Sub16_Sub1.method2940(var3, var4, (byte) 38);
					}
				}

			} else {
				int var1;
				if (GameClient.incomingMessage * -2146869835 == 186) { // remov obj?
					int pos = GameClient.gameBuffer.readUByte();
					int x = (pos >> 4 & 7) + Class79.mapPacketBaseX * -1886971203;
					int z = (pos & 7) + ObjectDef.mapPacketBaseZ * 616951789;
					int info = GameClient.gameBuffer.readUByte();
					int type = info >> 2;
					int rot = info & 3;
					int idxtype = GameClient.objIdxTypes[type];
					if (x >= 0 && z >= 0 && x < 104 && z < 104) {
						Class101.method1267(CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, x, z, idxtype, -1, type, rot, 0, -1, 1972397265);
					}
				} else {
					int var6;
					if (GameClient.incomingMessage * -2146869835 == 63) { //add obj
						int settings = GameClient.gameBuffer.readUByteA();
						int type = settings >> 2;
						int rot = settings & 3;
						int typeidx = GameClient.objIdxTypes[type];
						int pos = GameClient.gameBuffer.readUByteS();
						int x = (pos >> 4 & 7) + Class79.mapPacketBaseX * -1886971203;
						int z = ObjectDef.mapPacketBaseZ * 616951789 + (pos & 7);
						int id = GameClient.gameBuffer.readUShortA();
						if (x >= 0 && z >= 0 && x < 104 && z < 104) {
							Class101.method1267(CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, x, z, typeidx, id, type, rot, 0, -1, 189435331);
						}

					} else {
						int var14;
						int var15;
						int var20;
						if (GameClient.incomingMessage * -2146869835 == 101) {
							int lochash = GameClient.gameBuffer.readUByte();
							System.out.printf("Map bases at %d and %d%n", Class79.mapPacketBaseX * -1886971203, ObjectDef.mapPacketBaseZ * 616951789);
							int dx = (lochash >> 4 & 7) + Class79.mapPacketBaseX * -1886971203;
							int dz = (lochash & 7) + ObjectDef.mapPacketBaseZ * 616951789;
							int tx = dx + GameClient.gameBuffer.readByte();
							int tz = dz + GameClient.gameBuffer.readByte();
							int targetEntity = GameClient.gameBuffer.readShort();
							int gfx = GameClient.gameBuffer.readUShort();
							int startHeight = GameClient.gameBuffer.readUByte() * 4;
							int endHeight = GameClient.gameBuffer.readUByte() * 4;
							int delay = GameClient.gameBuffer.readUShort();
							int lifetime = GameClient.gameBuffer.readUShort();
							int angle = GameClient.gameBuffer.readUByte();
							int steepness = GameClient.gameBuffer.readUByte();
							System.out.printf("dx=%d, dz=%d, tx=%d, tz=%d, target=%d, gfx=%d, startHeight=%d, endHeight=%d, delay=%d, lifetime=%d, angle=%d, steepness=%d%n",
									dx, dz, tx, tz, targetEntity, gfx, startHeight, endHeight, delay, lifetime, angle, steepness);
							if (dx >= 0 && dz >= 0 && dx < 104 && dz < 104 && tx >= 0 && tz >= 0 && tx < 104 && tz < 104 && gfx != 65535) {
								dx = dx * 128 + 64;
								dz = 64 + dz * 128;
								tx = tx * 128 + 64;
								tz = 64 + tz * 128;
								CacheableEntry_Sub23_Sub16_Sub4 var35 = new CacheableEntry_Sub23_Sub16_Sub4(gfx, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, dx, dz, NpcDef.method2423(dx, dz, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, -1847964236) - startHeight, delay + GameClient.cycle * 1026470457, lifetime + GameClient.cycle * 1026470457, angle, steepness, targetEntity, endHeight);
								var35.method3065(tx, tz, NpcDef.method2423(tx, tz, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, -1847964236) - endHeight, GameClient.cycle * 1026470457 + delay, 289504084);
								GameClient.aJagexLinkedList_3000.add(var35);
							}

						} else {
							if (GameClient.incomingMessage * -2146869835 == 245) {
								var2 = GameClient.gameBuffer.readULEShort();
								var3 = GameClient.gameBuffer.readUByte();
								var4 = var3 >> 2;
								var5 = var3 & 3;
								var7 = GameClient.objIdxTypes[var4];
								var10 = GameClient.gameBuffer.readUShortLEA();
								var1 = GameClient.gameBuffer.readUByte();
								var6 = (var1 >> 4 & 7) + Class79.mapPacketBaseX * -1886971203;
								var14 = ObjectDef.mapPacketBaseZ * 616951789 + (var1 & 7);
								var15 = GameClient.gameBuffer.readULEShort();
								byte var18 = GameClient.gameBuffer.method1898();
								var20 = GameClient.gameBuffer.readUShortA();
								byte var26 = GameClient.gameBuffer.method2044((byte) -45);
								byte var13 = GameClient.gameBuffer.method1898();
								byte var12 = GameClient.gameBuffer.method1898();
								Player var11;
								if (GameClient.myIndex * -1731449945 == var10) {
									var11 = Player.me;
								} else {
									var11 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var10];
								}

								if (var11 != null) {
									ObjectDef var8 = Class56.getObjectDef(var20);
									int var9;
									int var16;
									if (var5 != 1 && var5 != 3) {
										var16 = var8.anInt2277 * 1832905927;
										var9 = var8.anInt2274 * 1221908201;
									} else {
										var16 = var8.anInt2274 * 1221908201;
										var9 = var8.anInt2277 * 1832905927;
									}

									int var24 = var6 + (var16 >> 1);
									int var22 = var6 + (1 + var16 >> 1);
									int var25 = var14 + (var9 >> 1);
									int var23 = var14 + (1 + var9 >> 1);
									int[][] var21 = Class32.mapSquareHeights[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619];
									int var19 = var21[var22][var23] + var21[var24][var23] + var21[var22][var25] + var21[var24][var25] >> 2;
									int var17 = (var6 << 7) + (var16 << 6);
									int var27 = (var9 << 6) + (var14 << 7);
									CacheableEntry_Sub23_Sub16_Sub5 var28 = var8.method2446(var4, var5, var21, var17, var19, var27, (short) -3855);
									if (var28 != null) {
										Class101.method1267(CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var6, var14, var7, -1, 0, 0, var15 + 1, var2 + 1, 885114151);
										var11.anInt2821 = (var15 + GameClient.cycle * 1026470457) * 1198116807;
										var11.anInt2828 = (var2 + GameClient.cycle * 1026470457) * 1856627113;
										var11.aClass109_Sub23_Sub16_Sub5_2826 = var28;
										var11.anInt2833 = var16 * -18768064 + var6 * -37536128;
										var11.anInt2834 = var9 * 2019151040 + var14 * -256665216;
										var11.anInt2824 = var19 * -530497367;
										byte var29;
										if (var18 > var26) {
											var29 = var18;
											var18 = var26;
											var26 = var29;
										}

										if (var13 > var12) {
											var29 = var13;
											var13 = var12;
											var12 = var29;
										}

										var11.anInt2819 = (var18 + var6) * -426487473;
										var11.anInt2829 = (var26 + var6) * -957413355;
										var11.anInt2830 = (var13 + var14) * 440657253;
										var11.anInt2825 = (var14 + var12) * 568630327;
									}
								}
							}

							if (GameClient.incomingMessage * -2146869835 == 160) {
								var2 = GameClient.gameBuffer.readUByte();
								var3 = Class79.mapPacketBaseX * -1886971203 + (var2 >> 4 & 7);
								var4 = (var2 & 7) + ObjectDef.mapPacketBaseZ * 616951789;
								var5 = GameClient.gameBuffer.readUShort();
								var7 = GameClient.gameBuffer.readUByte();
								var10 = var7 >> 4 & 15;
								var1 = var7 & 7;
								var6 = GameClient.gameBuffer.readUByte();
								if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
									var14 = 1 + var10;
									if (Player.me.stepQueueX[0] >= var3 - var14 && Player.me.stepQueueX[0] <= var14 + var3 && Player.me.stepQueueY[0] >= var4 - var14 && Player.me.stepQueueY[0] <= var14 + var4 && GameClient.anInt3108 * -1977859941 != 0 && var1 > 0 && GameClient.anInt3075 * 1104054789 < 50) {
										GameClient.anIntArray3110[GameClient.anInt3075 * 1104054789] = var5;
										GameClient.anIntArray3111[GameClient.anInt3075 * 1104054789] = var1;
										GameClient.anIntArray3112[GameClient.anInt3075 * 1104054789] = var6;
										GameClient.aClass8Array3114[GameClient.anInt3075 * 1104054789] = null;
										GameClient.anIntArray3016[GameClient.anInt3075 * 1104054789] = var10 + (var3 << 16) + (var4 << 8);
										GameClient.anInt3075 += 1213510349;
									}
								}
							}

							if (GameClient.incomingMessage * -2146869835 == 145) {
								int itemId = GameClient.gameBuffer.readUShortLEA();
								int pos = GameClient.gameBuffer.readUByteA();
								int x = Class79.mapPacketBaseX * -1886971203 + (pos >> 4 & 7);
								int y = ObjectDef.mapPacketBaseZ * 616951789 + (pos & 7);
								int amt = GameClient.gameBuffer.readULEShort();
								if (x >= 0 && y >= 0 && x < 104 && y < 104) {
									var34 = new CacheableEntry_Sub23_Sub16_Sub3();
									var34.anInt2570 = itemId * -535318985;
									var34.anInt2569 = amt * 1890405661;
									if (GameClient.aJagexLinkedListArrayArrayArray2998[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619][x][y] == null) {
										GameClient.aJagexLinkedListArrayArrayArray2998[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619][x][y] = new JagexLinkedList();
									}

									GameClient.aJagexLinkedListArrayArrayArray2998[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619][x][y].add(var34);
									CacheableEntry_Sub23_Sub16_Sub1.method2940(x, y, (byte) 48);
								}

							} else if (GameClient.incomingMessage * -2146869835 != 95) {
								if (GameClient.incomingMessage * -2146869835 == 197) {
									int tile = GameClient.gameBuffer.readUByte();
									int x = Class79.mapPacketBaseX * -1886971203 + (tile >> 4 & 7);
									int z = ObjectDef.mapPacketBaseZ * 616951789 + (tile & 7);
									int id = GameClient.gameBuffer.readUShort();
									int height = GameClient.gameBuffer.readUByte();
									int delay = GameClient.gameBuffer.readUShort();
									if (x >= 0 && z >= 0 && x < 104 && z < 104) {
										x = 64 + x * 128;
										z = 64 + z * 128;
										CacheableEntry_Sub23_Sub16_Sub1 var30 = new CacheableEntry_Sub23_Sub16_Sub1(id, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, x, z, NpcDef.method2423(x, z, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, -1847964236) - height, delay, GameClient.cycle * 1026470457);
										GameClient.aJagexLinkedList_3001.add(var30);
									}

								}
							} else {
								var2 = GameClient.gameBuffer.readUByteN();
								var3 = var2 >> 2;
								var4 = var2 & 3;
								var5 = GameClient.objIdxTypes[var3];
								var7 = GameClient.gameBuffer.readUByteA();
								var10 = Class79.mapPacketBaseX * -1886971203 + (var7 >> 4 & 7);
								var1 = ObjectDef.mapPacketBaseZ * 616951789 + (var7 & 7);
								var6 = GameClient.gameBuffer.readUShort();
								if (var10 >= 0 && var1 >= 0 && var10 < 103 && var1 < 103) {
									if (var5 == 0) {
										Class26 var36 = LinkedEntry_Sub6.aClass39_1732.method537(CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var10, var1);
										if (var36 != null) {
											var15 = var36.anInt331 * -1209998417 >> 14 & 32767;
											if (var3 == 2) {
												var36.aClass109_Sub23_Sub16_333 = new CacheableEntry_Sub23_Sub16_Sub7(var15, 2, var4 + 4, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var10, var1, var6, false, var36.aClass109_Sub23_Sub16_333);
												var36.aClass109_Sub23_Sub16_330 = new CacheableEntry_Sub23_Sub16_Sub7(var15, 2, 1 + var4 & 3, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var10, var1, var6, false, var36.aClass109_Sub23_Sub16_330);
											} else {
												var36.aClass109_Sub23_Sub16_333 = new CacheableEntry_Sub23_Sub16_Sub7(var15, var3, var4, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var10, var1, var6, false, var36.aClass109_Sub23_Sub16_333);
											}
										}
									}

									if (var5 == 1) {
										Class21 var37 = LinkedEntry_Sub6.aClass39_1732.method524(CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var10, var1);
										if (var37 != null) {
											var15 = var37.anInt262 * -133424889 >> 14 & 32767;
											if (var3 != 4 && var3 != 5) {
												if (var3 == 6) {
													var37.aClass109_Sub23_Sub16_265 = new CacheableEntry_Sub23_Sub16_Sub7(var15, 4, var4 + 4, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var10, var1, var6, false, var37.aClass109_Sub23_Sub16_265);
												} else if (var3 == 7) {
													var37.aClass109_Sub23_Sub16_265 = new CacheableEntry_Sub23_Sub16_Sub7(var15, 4, 4 + (var4 + 2 & 3), CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var10, var1, var6, false, var37.aClass109_Sub23_Sub16_265);
												} else if (var3 == 8) {
													var37.aClass109_Sub23_Sub16_265 = new CacheableEntry_Sub23_Sub16_Sub7(var15, 4, var4 + 4, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var10, var1, var6, false, var37.aClass109_Sub23_Sub16_265);
													var37.aClass109_Sub23_Sub16_266 = new CacheableEntry_Sub23_Sub16_Sub7(var15, 4, (var4 + 2 & 3) + 4, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var10, var1, var6, false, var37.aClass109_Sub23_Sub16_266);
												}
											} else {
												var37.aClass109_Sub23_Sub16_265 = new CacheableEntry_Sub23_Sub16_Sub7(var15, 4, var4, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var10, var1, var6, false, var37.aClass109_Sub23_Sub16_265);
											}
										}
									}

									if (var5 == 2) {
										Class33 var38 = LinkedEntry_Sub6.aClass39_1732.method608(CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var10, var1);
										if (var3 == 11) {
											var3 = 10;
										}

										if (var38 != null) {
											var38.aClass109_Sub23_Sub16_417 = new CacheableEntry_Sub23_Sub16_Sub7(var38.anInt426 * 2064355509 >> 14 & 32767, var3, var4, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var10, var1, var6, false, var38.aClass109_Sub23_Sub16_417);
										}
									}

									if (var5 == 3) {
										Class38 var39 = LinkedEntry_Sub6.aClass39_1732.method526(CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var10, var1);
										if (var39 != null) {
											var39.aClass109_Sub23_Sub16_509 = new CacheableEntry_Sub23_Sub16_Sub7(var39.anInt507 * 714830667 >> 14 & 32767, 22, var4, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var10, var1, var6, false, var39.aClass109_Sub23_Sub16_509);
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

	public static void method133(int var0) {
		CacheableEntry_Sub23_Sub7.aClass128_2214.method1579();
	}

	public static void method134(IndexDescriptor var0, IndexDescriptor var1, IndexDescriptor var2, int var3) {
		AnimationSequence.aIndexDescriptor_2171 = var0;
		AnimationSequence.aIndexDescriptor_2165 = var1;
		AnimationSequence.aIndexDescriptor_2166 = var2;
	}

}
