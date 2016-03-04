public class LinkedEntry_Sub8 extends LinkedEntry {

	int anInt1753;
	static final int anInt1754 = 13;
	public static final String aString1755 = "main_file_cache.idx255";
	byte aByte1756;
	String aString1757;
	static final int anInt1758 = 25;
	String aString1759;
	static final byte aByte1760 = 0;

	static void method1831(AnimationSequence var0, int var1, int var2, int var3, byte var4) {
		if (GameClient.anInt3075 * 1104054789 < 50 && GameClient.anInt3108 * -1977859941 != 0) {
			if (var0.anIntArray2172 != null && var1 < var0.anIntArray2172.length) {
				int var8 = var0.anIntArray2172[var1];
				if (var8 != 0) {
					int var10 = var8 >> 8;
					int var9 = var8 >> 4 & 7;
					int var7 = var8 & 15;
					GameClient.anIntArray3110[GameClient.anInt3075 * 1104054789] = var10;
					GameClient.anIntArray3111[GameClient.anInt3075 * 1104054789] = var9;
					GameClient.anIntArray3112[GameClient.anInt3075 * 1104054789] = 0;
					GameClient.aClass8Array3114[GameClient.anInt3075 * 1104054789] = null;
					int var6 = (var2 - 64) / 128;
					int var5 = (var3 - 64) / 128;
					GameClient.anIntArray3016[GameClient.anInt3075 * 1104054789] = (var6 << 16) + (var5 << 8) + var7;
					GameClient.anInt3075 += 1213510349;
				}
			}
		}
	}

	static final void method1832(byte var0) {
		Class75.method1027(-1013575437);
		if (CacheableEntry_Sub23_Sub17.aInterfaceDef_2418 == null) {
			if (GameClient.aInterfaceDef_3038 == null) {
				int var3;
				int var5;
				int var14;
				label261:
				{
					int var2 = Class74.anInt903 * 332680755;
					int var1;
					int var8;
					int var15;
					int var17;
					if (GameClient.aBool3006) {
						if (var2 != 1 && (Class46.aBool651 || var2 != 4)) {
							var1 = Class74.anInt897 * -1031552075;
							var5 = Class74.anInt898 * 1941423145;
							if (var1 < LinkedEntry_Sub6.anInt1731 * 681506315 - 10 || var1 > Class3.anInt74 * 1712819025 + LinkedEntry_Sub6.anInt1731 * 681506315 + 10 || var5 < CacheableEntry_Sub23_Sub16_Sub7.anInt2779 * 1953108583 - 10 || var5 > 10 + CacheableEntry_Sub23_Sub16_Sub2.anInt2568 * -2090618933 + CacheableEntry_Sub23_Sub16_Sub7.anInt2779 * 1953108583) {
								GameClient.aBool3006 = false;
								CacheableEntry_Sub23_Sub16_Sub4.method3075(LinkedEntry_Sub6.anInt1731 * 681506315, CacheableEntry_Sub23_Sub16_Sub7.anInt2779 * 1953108583, Class3.anInt74 * 1712819025, CacheableEntry_Sub23_Sub16_Sub2.anInt2568 * -2090618933, -1538745902);
							}
						}

						if (var2 == 1 || !Class46.aBool651 && var2 == 4) {
							var1 = LinkedEntry_Sub6.anInt1731 * 681506315;
							var5 = CacheableEntry_Sub23_Sub16_Sub7.anInt2779 * 1953108583;
							var3 = Class3.anInt74 * 1712819025;
							var15 = Class74.anInt891 * 1837550337;
							var17 = Class74.anInt905 * -1013575437;
							var8 = -1;

							int var7;
							for (var14 = 0; var14 < GameClient.menuActionPtr * 1324290403; var14++) {
								var7 = var5 + 31 + (GameClient.menuActionPtr * 1324290403 - 1 - var14) * 15;
								if (var15 > var1 && var15 < var1 + var3 && var17 > var7 - 13 && var17 < 3 + var7) {
									var8 = var14;
								}
							}

							if (var8 != -1 && var8 >= 0) {
								var14 = GameClient.menuParam2[var8];
								var7 = GameClient.menuParam3[var8];
								int var12 = GameClient.menuCommands[var8];
								int var10 = GameClient.menuParam1[var8];
								String var11 = GameClient.menuOptions[var8];
								String var9 = GameClient.menuOptionTexts[var8];
								PacketEncoder.method913(var14, var7, var12, var10, var11, var9, Class74.anInt891 * 1837550337, Class74.anInt905 * -1013575437, (byte) -2);
							}

							GameClient.aBool3006 = false;
							CacheableEntry_Sub23_Sub16_Sub4.method3075(LinkedEntry_Sub6.anInt1731 * 681506315, CacheableEntry_Sub23_Sub16_Sub7.anInt2779 * 1953108583, Class3.anInt74 * 1712819025, CacheableEntry_Sub23_Sub16_Sub2.anInt2568 * -2090618933, -1886798059);
						}
					} else {
						if ((var2 == 1 || !Class46.aBool651 && var2 == 4) && GameClient.menuActionPtr * 1324290403 > 0) {
							var1 = GameClient.menuCommands[GameClient.menuActionPtr * 1324290403 - 1];
							if (var1 == 39 || var1 == 40 || var1 == 41 || var1 == 42 || var1 == 43 || var1 == 33 || var1 == 34 || var1 == 35 || var1 == 36 || var1 == 37 || var1 == 38 || var1 == 1005) {
								var5 = GameClient.menuParam2[GameClient.menuActionPtr * 1324290403 - 1];
								var3 = GameClient.menuParam3[GameClient.menuActionPtr * 1324290403 - 1];
								InterfaceDef var6 = Class50.method713(var3, (byte) -83);
								var8 = LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(var6);
								boolean var13 = (var8 >> 28 & 1) != 0;
								if (var13) {
									break label261;
								}

								Class99 var10000 = (Class99) null;
								if (Class4.hasDraggableSetting(LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(var6))) {
									break label261;
								}
							}
						}

						if ((var2 == 1 || !Class46.aBool651 && var2 == 4) && (GameClient.anInt3005 * -696348949 == 1 && GameClient.menuActionPtr * 1324290403 > 2 || GameClient.method3792(GameClient.menuActionPtr * 1324290403 - 1, (byte) 1))) {
							var2 = 2;
						}

						if ((var2 == 1 || !Class46.aBool651 && var2 == 4) && GameClient.menuActionPtr * 1324290403 > 0) {
							var1 = GameClient.menuActionPtr * 1324290403 - 1;
							if (var1 >= 0) {
								var5 = GameClient.menuParam2[var1];
								var3 = GameClient.menuParam3[var1];
								var15 = GameClient.menuCommands[var1];
								var17 = GameClient.menuParam1[var1];
								String var16 = GameClient.menuOptions[var1];
								String var4 = GameClient.menuOptionTexts[var1];
								PacketEncoder.method913(var5, var3, var15, var17, var16, var4, Class74.anInt891 * 1837550337, Class74.anInt905 * -1013575437, (byte) 49);
							}
						}

						if (var2 == 2 && GameClient.menuActionPtr * 1324290403 > 0) {
							CacheableEntry_Sub23_Sub16_Sub4.method3067(Class74.anInt891 * 1837550337, Class74.anInt905 * -1013575437, -1795846000);
						}
					}

					return;
				}

				if (CacheableEntry_Sub23_Sub17.aInterfaceDef_2418 != null && !GameClient.aBool3109 && GameClient.anInt3005 * -696348949 != 1 && !GameClient.method3792(GameClient.menuActionPtr * 1324290403 - 1, (byte) 1) && GameClient.menuActionPtr * 1324290403 > 0) {
					Class29.method395(GameClient.anInt2977 * 302755351, GameClient.anInt2978 * 757042921, 1430715310);
				}

				GameClient.aBool3109 = false;
				GameClient.anInt2981 = 0;
				if (CacheableEntry_Sub23_Sub17.aInterfaceDef_2418 != null) {
					Class35.method484(CacheableEntry_Sub23_Sub17.aInterfaceDef_2418, 44133235);
				}

				CacheableEntry_Sub23_Sub17.aInterfaceDef_2418 = Class50.method713(var3, (byte) 105);
				GameClient.anInt3049 = var5 * 1985163809;
				GameClient.anInt2977 = Class74.anInt891 * -1001924953;
				GameClient.anInt2978 = Class74.anInt905 * -349253765;
				if (GameClient.menuActionPtr * 1324290403 > 0) {
					var14 = GameClient.menuActionPtr * 1324290403 - 1;
					ItemContainer.aClass5_1788 = new Class5();
					ItemContainer.aClass5_1788.anInt96 = GameClient.menuParam2[var14] * -1691816191;
					ItemContainer.aClass5_1788.anInt87 = GameClient.menuParam3[var14] * 1319292889;
					ItemContainer.aClass5_1788.anInt93 = GameClient.menuCommands[var14] * -337649953;
					ItemContainer.aClass5_1788.anInt89 = GameClient.menuParam1[var14] * -1803001747;
					ItemContainer.aClass5_1788.aString90 = GameClient.menuOptions[var14];
				}

				Class35.method484(CacheableEntry_Sub23_Sub17.aInterfaceDef_2418, -1680005674);
			}
		}
	}

}
