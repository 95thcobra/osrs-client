import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Class35 {

	public static final int anInt470 = 212;
	static final int anInt471 = 10;
	static IndexDescriptor_Sub1 index2;
	static IndexDescriptor_Sub1 aClass94_Sub1_477;
	static int anInt478;
	static final int anInt479 = 49;
	static final int anInt480 = 4;
	public static final int anInt481 = 24;
	int anInt474 = 1292679629;
	LinkedHashMap aLinkedHashMap475 = new LinkedHashMap();
	boolean aBool472;
	boolean aBool473;
	static int anInt482 = -897424324;

	static final String method471(int var0, int var1) {
		return var0 >= 999999999 ? "*" : Integer.toString(var0);
	}

	Class35(DataBuffer var1) {
		if (var1 != null && var1.data != null) {
			int var2 = var1.readUByte();
			if (var2 >= 0 && var2 <= anInt482 * 1938765295) {
				if (var1.readUByte() == 1) {
					aBool472 = true;
				}

				if (var2 > 1) {
					aBool473 = var1.readUByte() == 1;
				}

				if (var2 > 3) {
					anInt474 = var1.readUByte() * 1292679629;
				}

				if (var2 > 2) {
					int var3 = var1.readUByte();

					for (int var4 = 0; var4 < var3; var4++) {
						int var6 = var1.readInt();
						int var5 = var1.readInt();
						aLinkedHashMap475.put(Integer.valueOf(var6), Integer.valueOf(var5));
					}
				}
			} else {
				method478(true, 1865668025);
			}
		} else {
			method478(true, 1865668025);
		}

	}

	Class35() {
		method478(true, 1865668025);
	}

	DataBuffer method472(int var1) {
		DataBuffer var2 = new DataBuffer(100);
		var2.writeByte(anInt482 * 1938765295);
		var2.writeByte(aBool472 ? 1 : 0);
		var2.writeByte(aBool473 ? 1 : 0);
		var2.writeByte(anInt474 * 1158077189);
		var2.writeByte(aLinkedHashMap475.size());
		Iterator var3 = aLinkedHashMap475.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry) var3.next();
			var2.writeInt(((Integer) var4.getKey()).intValue());
			var2.writeInt(((Integer) var4.getValue()).intValue());
		}

		return var2;
	}

	static final String method477(int var0, int var1) {
		return var0 < 100000 ? "<col=ffff00>" + var0 + "</col>" : (var0 >= 10000000 ? "<col=00ff80>" + var0 / 1000000 + Class90.aString1218 + "</col>" : "<col=ffffff>" + var0 / 1000 + Class90.aString1272 + "</col>");
	}

	void method478(boolean var1, int var2) {
	}

	static final void method482(int var0, int var1, int var2, int var3, boolean var4, int var5) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int something2 = var3 - 334;
		if (something2 < 0) {
			something2 = 0;
		} else if (something2 > 100) {
			something2 = 100;
		}

		int var6 = something2 * (GameClient.aShort3122 - GameClient.aShort3106) / 100 + GameClient.aShort3106;
		int var10 = var6 * var3 * 512 / (var2 * 334);
		int something1 = 0;
		int var8;
		short var15;
		if (var10 < GameClient.aShort3137) {
			var15 = GameClient.aShort3137;
			var6 = var2 * var15 * 334 / (var3 * 512);
			if (var6 > GameClient.aShort3126) {
				var6 = GameClient.aShort3126;
				something1 = var3 * var6 * 512 / (var15 * 334);
				var8 = (var2 - something1) / 2;
				if (var4) {
					CacheableEntry_Sub23_Sub14.method2711();
					CacheableEntry_Sub23_Sub14.method2718(var0, var1, var8, var3, -16777216);
					CacheableEntry_Sub23_Sub14.method2718(var2 + var0 - var8, var1, var8, var3, -16777216);
				}

				var0 += var8;
				var2 -= var8 * 2;
			}
		} else if (var10 > GameClient.aShort3057) {
			var15 = GameClient.aShort3057;
			var6 = var15 * var2 * 334 / (var3 * 512);
			if (var6 < GameClient.aShort3125) {
				var6 = GameClient.aShort3125;
				something1 = var15 * var2 * 334 / (var6 * 512);
				var8 = (var3 - something1) / 2;
				if (var4) {
					CacheableEntry_Sub23_Sub14.method2711();
					CacheableEntry_Sub23_Sub14.method2718(var0, var1, var2, var8, -16777216);
					CacheableEntry_Sub23_Sub14.method2718(var0, var1 + var3 - var8, var2, var8, -16777216);
				}

				var1 += var8;
				var3 -= var8 * 2;
			}
		}

		something1 = (GameClient.aShort3024 - GameClient.aShort3123) * something2 / 100 + GameClient.aShort3123;
		GameClient.anInt3133 = (something1 * var6 * var3 / 85504 << 1) * 1234742735;
		if (var2 != GameClient.anInt3131 * -476732681 || var3 != GameClient.anInt3033 * -186527881) {
			int[] var14 = new int[9];

			for (var8 = 0; var8 < 9; var8++) {
				int var13 = 128 + var8 * 32 + 15;
				int var11 = 600 + var13 * 3;
				int var12 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2719[var13];
				var14[var8] = var11 * var12 >> 16;
			}

			Class39.method535(var14, 500, 800, var2, var3);
		}

		GameClient.anInt2944 = var0 * 1483108191;
		GameClient.anInt3099 = var1 * 1023447783;
		GameClient.anInt3131 = var2 * -866271545;
		GameClient.anInt3033 = var3 * -1221215673;
	}

	static void method484(InterfaceDef var0, int var1) {
		if (GameClient.anInt2985 * -387298783 == var0.anInt2069 * -1634494295) {
			GameClient.aBoolArray3072[var0.anInt2060 * -1567323639] = true;
		}

	}

	static final void method485(NpcDef var0, int var1, int var2, int var3, int var4) {
		if (GameClient.menuActionPtr * 1324290403 < 400) {
			if (var0.anIntArray2246 != null) {
				var0 = var0.method2400(-1202659201);
			}

			if (var0 != null) {
				if (var0.aBool2249) {
					if (!var0.aBool2251 || var1 == GameClient.anInt2922 * 674819435) {
						String var8 = var0.aString2221;
						int var9;
						if (var0.anInt2254 * 1699568893 != 0) {
							int var5 = var0.anInt2254 * 1699568893;
							var9 = Player.me.anInt2818 * 2145271731;
							int var10 = var9 - var5;
							String var7;
							if (var10 < -9) {
								var7 = Class22.hexColTag(16711680);
							} else if (var10 < -6) {
								var7 = Class22.hexColTag(16723968);
							} else if (var10 < -3) {
								var7 = Class22.hexColTag(16740352);
							} else if (var10 < 0) {
								var7 = Class22.hexColTag(16756736);
							} else if (var10 > 9) {
								var7 = Class22.hexColTag(65280);
							} else if (var10 > 6) {
								var7 = Class22.hexColTag(4259584);
							} else if (var10 > 3) {
								var7 = Class22.hexColTag(8453888);
							} else if (var10 > 0) {
								var7 = Class22.hexColTag(12648192);
							} else {
								var7 = Class22.hexColTag(16776960);
							}

							var8 = var8 + var7 + " " + Class37.BRACK_OPEN + Class90.LEVEL_ + var0.anInt2254 * 1699568893 + Class37.BRACK_CLOSE;
						}

						if (GameClient.anInt3018 * -1710049223 == 1) {
							Class1.addMenuOption(Class90.USE, GameClient.aString3019 + " " + Class37.ARROW_RIGHT + " " + Class22.hexColTag(16776960) + var8, 7, var1, var2, var3);
						} else if (GameClient.isPickingOption) {
							if ((Class48.currentInterfaceOptions * 253871613 & 2) == 2) {
								Class1.addMenuOption(GameClient.currentInterfaceAction, GameClient.aString2967 + " " + Class37.ARROW_RIGHT + " " + Class22.hexColTag(16776960) + var8, 8, var1, var2, var3);
							}
						} else {
							String[] var6 = var0.aStringArray2236;
							if (GameClient.debugOptions) {
								var6 = Class38.prefixOptionArray(var6);
							}

							int var13;
							if (var6 != null) {
								for (var13 = 4; var13 >= 0; --var13) {
									if (var6[var13] != null && !var6[var13].equalsIgnoreCase(Class90.ATTACK)) {
										byte var11 = 0;
										if (var13 == 0) {
											var11 = 9;
										}

										if (var13 == 1) {
											var11 = 10;
										}

										if (var13 == 2) {
											var11 = 11;
										}

										if (var13 == 3) {
											var11 = 12;
										}

										if (var13 == 4) {
											var11 = 13;
										}

										Class1.addMenuOption(var6[var13], Class22.hexColTag(16776960) + var8, var11, var1, var2, var3);
									}
								}
							}

							if (var6 != null) {
								for (var13 = 4; var13 >= 0; --var13) {
									if (var6[var13] != null && var6[var13].equalsIgnoreCase(Class90.ATTACK)) {
										short var12 = 0;
										if (GameClient.aClass42_2887 == Class42.aClass42_599 || Class42.aClass42_604 == GameClient.aClass42_2887 && var0.anInt2254 * 1699568893 > Player.me.anInt2818 * 2145271731) {
											var12 = 2000;
										}

										var9 = 0;
										if (var13 == 0) {
											var9 = 9 + var12;
										}

										if (var13 == 1) {
											var9 = 10 + var12;
										}

										if (var13 == 2) {
											var9 = var12 + 11;
										}

										if (var13 == 3) {
											var9 = 12 + var12;
										}

										if (var13 == 4) {
											var9 = 13 + var12;
										}

										Class1.addMenuOption(var6[var13], Class22.hexColTag(16776960) + var8, var9, var1, var2, var3);
									}
								}
							}

							Class1.addMenuOption(Class90.EXAMINE, Class22.hexColTag(16776960) + var8, 1003, var1, var2, var3);
						}

					}
				}
			}
		}
	}

}
