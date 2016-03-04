public class CacheableEntry_Sub23_Sub1 extends CacheableEntry {

	public static final int anInt2090 = 10;
	public static final int anInt2091 = 152;
	public static IndexDescriptor aIndexDescriptor_2092;
	static int anInt2093;
	static Class128 aClass128_2089 = new Class128(64);
	public int anInt2088 = 0;

	static final void method2212(InterfaceDef interfaceDef, int var1, int var2) {
		if (interfaceDef.anInt1948 * -1021998289 == 1) {
			Class1.addMenuOption(interfaceDef.aString2054, "", 24, 0, 0, interfaceDef.hash * 1582464481);
		}

		int var6;
		int var7;
		String var8;
		if (interfaceDef.anInt1948 * -1021998289 == 2 && !GameClient.isPickingOption) {
			var6 = LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(interfaceDef);
			var7 = var6 >> 11 & 63;
			if (var7 == 0) {
				var8 = null;
			} else if (interfaceDef.action != null && interfaceDef.action.trim().length() != 0) {
				var8 = interfaceDef.action;
			} else {
				var8 = null;
			}

			if (var8 != null) {
				Class1.addMenuOption(var8, Class22.hexColTag(65280) + interfaceDef.aString2053, 25, 0, -1, interfaceDef.hash * 1582464481);
			}
		}

		if (interfaceDef.anInt1948 * -1021998289 == 3) {
			Class1.addMenuOption(Class90.aString1215, "", 26, 0, 0, interfaceDef.hash * 1582464481);
		}

		if (interfaceDef.anInt1948 * -1021998289 == 4) {
			Class1.addMenuOption(interfaceDef.aString2054, "", 28, 0, 0, interfaceDef.hash * 1582464481);
		}

		if (interfaceDef.anInt1948 * -1021998289 == 5) {
			Class1.addMenuOption(interfaceDef.aString2054, "", 29, 0, 0, interfaceDef.hash * 1582464481);
		}

		if (interfaceDef.anInt1948 * -1021998289 == 6 && GameClient.aInterfaceDef_3029 == null) {
			Class1.addMenuOption(interfaceDef.aString2054, "", 30, 0, -1, interfaceDef.hash * 1582464481);
		}

		int var10;
		int slot;
		if (interfaceDef.contenttype * -1878336627 == 2) {
			slot = 0;

			for (int pos = 0; pos < interfaceDef.invsize * 539675235; pos++) {
				for (var6 = 0; var6 < interfaceDef.anInt1954 * 2096072399; var6++) {
					var10 = (32 + interfaceDef.anInt2003 * 1620079109) * var6;
					int var11 = pos * (32 + interfaceDef.anInt1934 * -1753308347);
					if (slot < 20) {
						var10 += interfaceDef.anIntArray2005[slot];
						var11 += interfaceDef.anIntArray2067[slot];
					}

					if (var1 >= var10 && var2 >= var11 && var1 < var10 + 32 && var2 < 32 + var11) {
						GameClient.anInt2979 = slot * -1255302371;
						Class41.aInterfaceDef_596 = interfaceDef;
						if (interfaceDef.itemIds[slot] > 0) {
							enclosing:
							{
								ItemDef itemDefinition = PacketDecoder.getItemDef(interfaceDef.itemIds[slot] - 1);

								if (GameClient.anInt3018 * -1710049223 == 1) {
									int setting = LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(interfaceDef);
									boolean itemUse = (setting >> 30 & 1) != 0;
									if (itemUse) {
										if (Class44.anInt630 * -1356904377 != interfaceDef.hash * 1582464481 || Class37.anInt500 * 2106654977 != slot) {
											Class1.addMenuOption(Class90.USE, GameClient.aString3019 + " " + Class37.ARROW_RIGHT + " " + Class22.hexColTag(0xff9040) + itemDefinition.name, 31, itemDefinition.id * 1539412267, slot, interfaceDef.hash * 1582464481);
										}
										break enclosing;
									}
								}

								if (GameClient.isPickingOption) {
									int setting = LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(interfaceDef);
									boolean useOnPlayer = (setting >> 30 & 1) != 0;
									if (useOnPlayer) {
										if ((Class48.currentInterfaceOptions * 253871613 & 0x10) == 0x10) {
											Class1.addMenuOption(GameClient.currentInterfaceAction, GameClient.aString2967 + " " + Class37.ARROW_RIGHT + " " + Class22.hexColTag(0xff9040) + itemDefinition.name, 32, itemDefinition.id * 1539412267, slot, interfaceDef.hash * 1582464481);
										}
										break enclosing;
									}
								}

								String[] options = itemDefinition.ioptions;
								if (GameClient.debugOptions) {
									options = Class38.prefixOptionArray(options);
								}

								// Add the first two options, mostly equip or eat and such
								int setting = LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(interfaceDef);
								boolean hasItemOptions = (setting >> 30 & 1) != 0;
								if (hasItemOptions) {
									for (int opt = 4; opt >= 3; --opt) {
										if (options != null && options[opt] != null) {
											byte action;
											if (opt == 3) {
												action = 36;
											} else {
												action = 37;
											}

											Class1.addMenuOption(options[opt], Class22.hexColTag(16748608) + itemDefinition.name, action, itemDefinition.id * 1539412267, slot, interfaceDef.hash * 1582464481);
										} else if (opt == 4) {
											Class1.addMenuOption(Class90.aString1057, Class22.hexColTag(16748608) + itemDefinition.name, 37, itemDefinition.id * 1539412267, slot, interfaceDef.hash * 1582464481);
										}
									}
								}

								// Then add the use option
								int setting_ = LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(interfaceDef);
								boolean canUseOnItem = (setting_ >> 31 & 1) != 0;
								if (canUseOnItem) {
									Class1.addMenuOption(Class90.USE, Class22.hexColTag(16748608) + itemDefinition.name, 38, itemDefinition.id * 1539412267, slot, interfaceDef.hash * 1582464481);
								}

								// And add the rest of the remainder options that appear below use
								int specialOptions = LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(interfaceDef);
								boolean hasItemOptions_ = (specialOptions >> 30 & 1) != 0;
								if (hasItemOptions_ && options != null) {
									for (int opt = 2; opt >= 0; --opt) {
										if (options[opt] != null) {
											int action = 0;
											if (opt == 0) {
												action = 33;
											} else if (opt == 1) {
												action = 34;
											} else if (opt == 2) {
												action = 35;
											}

											Class1.addMenuOption(options[opt], Class22.hexColTag(0xff9040) + itemDefinition.name, action, itemDefinition.id * 1539412267, slot, interfaceDef.hash * 1582464481);
										}
									}
								}

								// Now attempt the inventory's defined options
								options = interfaceDef.itemOptions;
								if (GameClient.debugOptions) {
									options = Class38.prefixOptionArray(options);
								}

								if (options != null) {
									for (int opt = 4; opt >= 0; --opt) {
										if (options[opt] != null) {
											int action = 0;
											if (opt == 0) {
												action = 39;
											} else if (opt == 1) {
												action = 40;
											} else if (opt == 2) {
												action = 41;
											} else if (opt == 3) {
												action = 42;
											} else if (opt == 4) {
												action = 43;
											}

											Class1.addMenuOption(options[opt], Class22.hexColTag(0xff9040) + itemDefinition.name, action, itemDefinition.id * 1539412267, slot, interfaceDef.hash * 1582464481);
										}
									}
								}

								// Always add the examine option it seems
								Class1.addMenuOption(Class90.EXAMINE, Class22.hexColTag(16748608) + itemDefinition.name, 1005, itemDefinition.id * 1539412267, slot, interfaceDef.hash * 1582464481);
							}
						}
					}

					++slot;
				}
			}
		}

		if (interfaceDef.cs2Inter) {
			if (GameClient.isPickingOption) {
				var7 = LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(interfaceDef);
				boolean var23 = (var7 >> 21 & 1) != 0;
				if (var23 && (Class48.currentInterfaceOptions * 253871613 & 32) == 32) {
					Class1.addMenuOption(GameClient.currentInterfaceAction, GameClient.aString2967 + " " + Class37.ARROW_RIGHT + " " + interfaceDef.aString2032, 58, 0, interfaceDef.slot * -1395083971, interfaceDef.hash * 1582464481);
				}
			} else {
				for (slot = 9; slot >= 5; --slot) {
					String var21;
					if (!ScriptInvocation.method1839(LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(interfaceDef), slot) && interfaceDef.anObjectArray2037 == null) {
						var21 = null;
					} else if (interfaceDef.regularOptions != null && interfaceDef.regularOptions.length > slot && interfaceDef.regularOptions[slot] != null && interfaceDef.regularOptions[slot].trim().length() != 0) {
						var21 = interfaceDef.regularOptions[slot];
					} else {
						var21 = null;
					}

					if (var21 != null) {
						Class1.addMenuOption(var21, interfaceDef.aString2032, 1007, 1 + slot, interfaceDef.slot * -1395083971, interfaceDef.hash * 1582464481);
					}
				}

				var6 = LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(interfaceDef);
				var7 = var6 >> 11 & 63;
				if (var7 == 0) {
					var8 = null;
				} else if (interfaceDef.action != null && interfaceDef.action.trim().length() != 0) {
					var8 = interfaceDef.action;
				} else {
					var8 = null;
				}

				if (var8 != null) {
					Class1.addMenuOption(var8, interfaceDef.aString2032, 25, 0, interfaceDef.slot * -1395083971, interfaceDef.hash * 1582464481);
				}

				for (var6 = 4; var6 >= 0; --var6) {
					String var24;
					if (!ScriptInvocation.method1839(LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(interfaceDef), var6) && interfaceDef.anObjectArray2037 == null) {
						var24 = null;
					} else if (interfaceDef.regularOptions != null && interfaceDef.regularOptions.length > var6 && interfaceDef.regularOptions[var6] != null && interfaceDef.regularOptions[var6].trim().length() != 0) {
						var24 = interfaceDef.regularOptions[var6];
					} else {
						var24 = null;
					}

					if (var24 != null) {
						Class1.addMenuOption(var24, interfaceDef.aString2032, 57, 1 + var6, interfaceDef.slot * -1395083971, interfaceDef.hash * 1582464481);
					}
				}

				var10 = LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(interfaceDef);
				boolean var20 = (var10 & 1) != 0;
				if (var20) {
					Class1.addMenuOption(Class90.aString1061, "", 30, 0, interfaceDef.slot * -1395083971, interfaceDef.hash * 1582464481);
				}
			}
		}

	}

	void method2214(DataBuffer var1, int var2) {
		while (true) {
			int var3 = var1.readUByte();
			if (var3 == 0) {
				return;
			}

			method2217(var1, var3, (byte) 9);
		}
	}

	void method2217(DataBuffer var1, int var2, byte var3) {
		if (var2 == 2) {
			anInt2088 = var1.readUShort() * 714845219;
		}

	}

	public static EnumDef getEnumDef(int id) {
		EnumDef var2 = (EnumDef) EnumDef.cache.get((long) id);
		if (var2 == null) {
			byte[] var3 = EnumDef.aIndexDescriptor_2185.getFileData(8, id);
			var2 = new EnumDef();
			if (var3 != null) {
				var2.method2340(new DataBuffer(var3), 688847885);
			}

			EnumDef.cache.put(var2, (long) id);
			return var2;
		} else {
			return var2;
		}
	}

}
