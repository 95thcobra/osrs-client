import java.awt.*;
import java.io.EOFException;
import java.io.IOException;

public final class PacketEncoder {

	public static final int anInt848 = 72;
	static final int anInt849 = 49;
	static final int anInt850 = 100;
	Class139 aClass139_844 = null;
	Class139 aClass139_846 = null;
	int anInt845 = 1337053704;
	int anInt851;
	static byte[] aByteArray847 = new byte[520];

	static final void method913(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7, byte var8) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		if (var2 == 4) {
			GameClient.anInt2970 = var6 * 1315483603;
			GameClient.anInt2971 = var7 * -613726713;
			GameClient.anInt2973 = -1136925898;
			GameClient.anInt2972 = 0;
			GameClient.mapMarkerX = var0 * -2075522063;
			GameClient.mapMarkerZ = var1 * -700155223;
			GameClient.secureBuffer.writeOpcode(6);
			GameClient.secureBuffer.writeShort(var3 >> 14 & 32767);
			GameClient.secureBuffer.writeByte(Class65.aBoolArray820[82] ? 1 : 0);
			GameClient.secureBuffer.writeShortA(var1 + LinkedEntry_Sub13.anInt1825 * 803568843);
			GameClient.secureBuffer.writeShortA(var0 + Class35.anInt478 * -1719983039);
		}

		if (var2 == 21) {
			GameClient.anInt2970 = var6 * 1315483603;
			GameClient.anInt2971 = var7 * -613726713;
			GameClient.anInt2973 = -1136925898;
			GameClient.anInt2972 = 0;
			GameClient.mapMarkerX = var0 * -2075522063;
			GameClient.mapMarkerZ = var1 * -700155223;
			GameClient.secureBuffer.writeOpcode(155);
			GameClient.secureBuffer.writeShortLE(var3);
			GameClient.secureBuffer.writeShortA(Class35.anInt478 * -1719983039 + var0);
			GameClient.secureBuffer.writeShort(var1 + LinkedEntry_Sub13.anInt1825 * 803568843);
			GameClient.secureBuffer.writeByte(Class65.aBoolArray820[82] ? 1 : 0);
		}

		if (var2 == 20) {
			GameClient.anInt2970 = var6 * 1315483603;
			GameClient.anInt2971 = var7 * -613726713;
			GameClient.anInt2973 = -1136925898;
			GameClient.anInt2972 = 0;
			GameClient.mapMarkerX = var0 * -2075522063;
			GameClient.mapMarkerZ = var1 * -700155223;
			GameClient.secureBuffer.writeOpcode(12);
			GameClient.secureBuffer.writeShort(var1 + LinkedEntry_Sub13.anInt1825 * 803568843);
			GameClient.secureBuffer.writeByteA(Class65.aBoolArray820[82] ? 1 : 0);
			GameClient.secureBuffer.writeShort(var3);
			GameClient.secureBuffer.writeShort(var0 + Class35.anInt478 * -1719983039);
		}

		if (var2 == 1) {
			GameClient.anInt2970 = var6 * 1315483603;
			GameClient.anInt2971 = var7 * -613726713;
			GameClient.anInt2973 = -1136925898;
			GameClient.anInt2972 = 0;
			GameClient.mapMarkerX = var0 * -2075522063;
			GameClient.mapMarkerZ = var1 * -700155223;
			GameClient.secureBuffer.writeOpcode(150);
			GameClient.secureBuffer.writeLEShortA(Class37.anInt500 * 2106654977);
			GameClient.secureBuffer.writeIntv2(Class44.anInt630 * -1356904377);
			GameClient.secureBuffer.writeShortLE(var3 >> 14 & 32767);
			GameClient.secureBuffer.writeByte(Class65.aBoolArray820[82] ? 1 : 0);
			GameClient.secureBuffer.writeLEShortA(LinkedEntry_Sub13.anInt1825 * 803568843 + var1);
			GameClient.secureBuffer.writeShort(Class100.anInt1415 * -1072007021);
			GameClient.secureBuffer.writeShortLE(Class35.anInt478 * -1719983039 + var0);
		}

		if (var2 == 39) {
			GameClient.secureBuffer.writeOpcode(123);
			GameClient.secureBuffer.writeShortLE(var0);
			GameClient.secureBuffer.writeInt(var1);
			GameClient.secureBuffer.writeLEShortA(var3);
			GameClient.anInt2974 = 0;
			Class71.aInterfaceDef_862 = Class50.method713(var1, (byte) -61);
			GameClient.anInt2975 = var0 * -1530235251;
		}

		Player var9;
		if (var2 == 47) {
			var9 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var3];
			if (var9 != null) {
				GameClient.anInt2970 = var6 * 1315483603;
				GameClient.anInt2971 = var7 * -613726713;
				GameClient.anInt2973 = -1136925898;
				GameClient.anInt2972 = 0;
				GameClient.mapMarkerX = var0 * -2075522063;
				GameClient.mapMarkerZ = var1 * -700155223;
				GameClient.secureBuffer.writeOpcode(56);
				GameClient.secureBuffer.writeByte(Class65.aBoolArray820[82] ? 1 : 0);
				GameClient.secureBuffer.writeShort(var3);
			}
		}

		if (var2 == 40) {
			GameClient.secureBuffer.writeOpcode(200);
			GameClient.secureBuffer.writeShort(var3);
			GameClient.secureBuffer.writeLEShortA(var0);
			GameClient.secureBuffer.writeLEInt(var1);
			GameClient.anInt2974 = 0;
			Class71.aInterfaceDef_862 = Class50.method713(var1, (byte) -94);
			GameClient.anInt2975 = var0 * -1530235251;
		}

		Npc var17;
		if (var2 == 10) {
			var17 = GameClient.sceneNpcs[var3];
			if (var17 != null) {
				GameClient.anInt2970 = var6 * 1315483603;
				GameClient.anInt2971 = var7 * -613726713;
				GameClient.anInt2973 = -1136925898;
				GameClient.anInt2972 = 0;
				GameClient.mapMarkerX = var0 * -2075522063;
				GameClient.mapMarkerZ = var1 * -700155223;
				GameClient.secureBuffer.writeOpcode(254);
				GameClient.secureBuffer.writeByteA(Class65.aBoolArray820[82] ? 1 : 0);
				GameClient.secureBuffer.writeShortA(var3);
			}
		}

		if (var2 == 1002) {
			GameClient.anInt2970 = var6 * 1315483603;
			GameClient.anInt2971 = var7 * -613726713;
			GameClient.anInt2973 = -1136925898;
			GameClient.anInt2972 = 0;
			GameClient.secureBuffer.writeOpcode(213);
			GameClient.secureBuffer.writeShortLE(var3 >> 14 & 32767);
		}

		int var10;
		InterfaceDef var18;
		if (var2 == 29) {
			GameClient.secureBuffer.writeOpcode(34);
			GameClient.secureBuffer.writeInt(var1);
			var18 = Class50.method713(var1, (byte) -32);
			if (var18.anIntArrayArray2049 != null && var18.anIntArrayArray2049[0][0] == 5) {
				var10 = var18.anIntArrayArray2049[0][1];
				if (Class106.varps[var10] != var18.anIntArray2013[0]) {
					Class106.varps[var10] = var18.anIntArray2013[0];
					Class22.method349(var10, (short) 4754);
				}
			}
		}

		if (var2 == 11) {
			var17 = GameClient.sceneNpcs[var3];
			if (var17 != null) {
				GameClient.anInt2970 = var6 * 1315483603;
				GameClient.anInt2971 = var7 * -613726713;
				GameClient.anInt2973 = -1136925898;
				GameClient.anInt2972 = 0;
				GameClient.mapMarkerX = var0 * -2075522063;
				GameClient.mapMarkerZ = var1 * -700155223;
				GameClient.secureBuffer.writeOpcode(31);
				GameClient.secureBuffer.writeShortA(var3);
				GameClient.secureBuffer.writeByte(Class65.aBoolArray820[82] ? 1 : 0);
			}
		}

		if (var2 == 13) {
			var17 = GameClient.sceneNpcs[var3];
			if (var17 != null) {
				GameClient.anInt2970 = var6 * 1315483603;
				GameClient.anInt2971 = var7 * -613726713;
				GameClient.anInt2973 = -1136925898;
				GameClient.anInt2972 = 0;
				GameClient.mapMarkerX = var0 * -2075522063;
				GameClient.mapMarkerZ = var1 * -700155223;
				GameClient.secureBuffer.writeOpcode(139);
				GameClient.secureBuffer.writeByteN(Class65.aBoolArray820[82] ? 1 : 0);
				GameClient.secureBuffer.writeShortA(var3);
			}
		}

		if (var2 == 34) {
			GameClient.secureBuffer.writeOpcode(122);
			GameClient.secureBuffer.writeShortA(var0);
			GameClient.secureBuffer.writeIntV1(var1);
			GameClient.secureBuffer.writeShortLE(var3);
			GameClient.anInt2974 = 0;
			Class71.aInterfaceDef_862 = Class50.method713(var1, (byte) -111);
			GameClient.anInt2975 = var0 * -1530235251;
		}

		if (var2 == 25) {
			var18 = Class50.method712(var1, var0, (short) -7192);
			if (var18 != null) {
				CacheableEntry_Sub23_Sub17.method2798((short) 255);
				int var13 = LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(var18);
				var10 = var13 >> 11 & 63;
				int var14 = var18.anInt2057 * -181409537;
				InterfaceDef var12 = Class50.method712(var1, var0, (short) -3655);
				if (var12 != null && var12.anObjectArray2039 != null) {
					ScriptInvocation var15 = new ScriptInvocation();
					var15.inter = var12;
					var15.parameters = var12.anObjectArray2039;
					InterfaceDef.method2182(var15, 1232637796);
				}

				GameClient.anInt3022 = var14 * 2106201685;
				GameClient.isPickingOption = true;
				Class63.anInt799 = var1 * 604877399;
				GameClient.anInt2881 = var0 * -1832237769;
				Class48.currentInterfaceOptions = var10 * 1733312341;
				Class35.method484(var12, -1808383424);
				GameClient.anInt3018 = 0;
				int var16 = LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(var18);
				int var22 = var16 >> 11 & 63;
				String var21;
				if (var22 == 0) {
					var21 = null;
				} else if (var18.action != null && var18.action.trim().length() != 0) {
					var21 = var18.action;
				} else {
					var21 = null;
				}

				GameClient.currentInterfaceAction = var21;
				if (GameClient.currentInterfaceAction == null) {
					GameClient.currentInterfaceAction = "Null";
				}

				if (var18.cs2Inter) {
					GameClient.aString2967 = var18.aString2032 + Class22.hexColTag(16777215);
				} else {
					GameClient.aString2967 = Class22.hexColTag(65280) + var18.aString2053 + Class22.hexColTag(16777215);
				}
			}

		} else {
			if (var2 == 58) {
				var18 = Class50.method712(var1, var0, (short) 14064);
				if (var18 != null) {
					GameClient.secureBuffer.writeOpcode(224);
					GameClient.secureBuffer.writeShortLE(var0);
					GameClient.secureBuffer.writeLEShortA(GameClient.anInt3022 * -1266010371);
					GameClient.secureBuffer.writeShortA(GameClient.anInt2881 * -1911127929);
					GameClient.secureBuffer.writeShortLE(var18.anInt2057 * -181409537);
					GameClient.secureBuffer.writeIntV1(Class63.anInt799 * -464823961);
					GameClient.secureBuffer.writeLEInt(var1);
				}
			}

			if (var2 == 22) {
				GameClient.anInt2970 = var6 * 1315483603;
				GameClient.anInt2971 = var7 * -613726713;
				GameClient.anInt2973 = -1136925898;
				GameClient.anInt2972 = 0;
				GameClient.mapMarkerX = var0 * -2075522063;
				GameClient.mapMarkerZ = var1 * -700155223;
				GameClient.secureBuffer.writeOpcode(252);
				GameClient.secureBuffer.writeShortLE(Class35.anInt478 * -1719983039 + var0);
				GameClient.secureBuffer.writeLEShortA(var1 + LinkedEntry_Sub13.anInt1825 * 803568843);
				GameClient.secureBuffer.writeShort(var3);
				GameClient.secureBuffer.writeByteA(Class65.aBoolArray820[82] ? 1 : 0);
			}

			if (var2 == 57 || var2 == 1007) {
				var18 = Class50.method712(var1, var0, (short) 21688);
				if (var18 != null) {
					Class80.method1036(var3, var1, var0, var18.anInt2057 * -181409537, var5, -635196373);
				}
			}

			if (var2 == 28) {
				GameClient.secureBuffer.writeOpcode(34);
				GameClient.secureBuffer.writeInt(var1);
				var18 = Class50.method713(var1, (byte) -17);
				if (var18.anIntArrayArray2049 != null && var18.anIntArrayArray2049[0][0] == 5) {
					var10 = var18.anIntArrayArray2049[0][1];
					Class106.varps[var10] = 1 - Class106.varps[var10];
					Class22.method349(var10, (short) -7179);
				}
			}

			if (var2 == 32) {
				GameClient.secureBuffer.writeOpcode(3);
				GameClient.secureBuffer.writeInt(var1);
				GameClient.secureBuffer.writeShortLE(GameClient.anInt2881 * -1911127929);
				GameClient.secureBuffer.writeInt(Class63.anInt799 * -464823961);
				GameClient.secureBuffer.writeShortA(var0);
				GameClient.secureBuffer.writeShortA(var3);
				GameClient.anInt2974 = 0;
				Class71.aInterfaceDef_862 = Class50.method713(var1, (byte) -3);
				GameClient.anInt2975 = var0 * -1530235251;
			}

			if (var2 == 2) {
				GameClient.anInt2970 = var6 * 1315483603;
				GameClient.anInt2971 = var7 * -613726713;
				GameClient.anInt2973 = -1136925898;
				GameClient.anInt2972 = 0;
				GameClient.mapMarkerX = var0 * -2075522063;
				GameClient.mapMarkerZ = var1 * -700155223;
				GameClient.secureBuffer.writeOpcode(206);
				GameClient.secureBuffer.method2069(Class65.aBoolArray820[82] ? 1 : 0);
				GameClient.secureBuffer.writeLEShortA(var1 + LinkedEntry_Sub13.anInt1825 * 803568843);
				GameClient.secureBuffer.writeLEInt(Class63.anInt799 * -464823961);
				GameClient.secureBuffer.writeShortLE(var3 >> 14 & 32767);
				GameClient.secureBuffer.writeLEShortA(var0 + Class35.anInt478 * -1719983039);
				GameClient.secureBuffer.writeShortA(GameClient.anInt2881 * -1911127929);
			}

			if (var2 == 5) {
				GameClient.anInt2970 = var6 * 1315483603;
				GameClient.anInt2971 = var7 * -613726713;
				GameClient.anInt2973 = -1136925898;
				GameClient.anInt2972 = 0;
				GameClient.mapMarkerX = var0 * -2075522063;
				GameClient.mapMarkerZ = var1 * -700155223;
				GameClient.secureBuffer.writeOpcode(94);
				GameClient.secureBuffer.writeShortA(var0 + Class35.anInt478 * -1719983039);
				GameClient.secureBuffer.writeShort(var1 + LinkedEntry_Sub13.anInt1825 * 803568843);
				GameClient.secureBuffer.writeShort(var3 >> 14 & 32767);
				GameClient.secureBuffer.writeByteA(Class65.aBoolArray820[82] ? 1 : 0);
			}

			if (var2 == 44) {
				var9 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var3];
				if (var9 != null) {
					GameClient.anInt2970 = var6 * 1315483603;
					GameClient.anInt2971 = var7 * -613726713;
					GameClient.anInt2973 = -1136925898;
					GameClient.anInt2972 = 0;
					GameClient.mapMarkerX = var0 * -2075522063;
					GameClient.mapMarkerZ = var1 * -700155223;
					GameClient.secureBuffer.writeOpcode(199);
					GameClient.secureBuffer.writeByteN(Class65.aBoolArray820[82] ? 1 : 0);
					GameClient.secureBuffer.writeShortLE(var3);
				}
			}

			if (var2 == 38) {
				CacheableEntry_Sub23_Sub17.method2798((short) 255);
				var18 = Class50.method713(var1, (byte) -93);
				GameClient.anInt3018 = 56079881;
				Class37.anInt500 = var0 * -1552941311;
				Class44.anInt630 = var1 * 488235383;
				Class100.anInt1415 = var3 * 1801282971;
				Class35.method484(var18, -952760123);
				GameClient.aString3019 = Class22.hexColTag(16748608) + PacketDecoder.getItemDef(var3).name + Class22.hexColTag(16777215);
				if (GameClient.aString3019 == null) {
					GameClient.aString3019 = "null";
				}

			} else {
				if (var2 == 48) {
					var9 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var3];
					if (var9 != null) {
						GameClient.anInt2970 = var6 * 1315483603;
						GameClient.anInt2971 = var7 * -613726713;
						GameClient.anInt2973 = -1136925898;
						GameClient.anInt2972 = 0;
						GameClient.mapMarkerX = var0 * -2075522063;
						GameClient.mapMarkerZ = var1 * -700155223;
						GameClient.secureBuffer.writeOpcode(175);
						GameClient.secureBuffer.writeShortLE(var3);
						GameClient.secureBuffer.writeByteA(Class65.aBoolArray820[82] ? 1 : 0);
					}
				}

				if (var2 == 23) {
					LinkedEntry_Sub6.aClass39_1732.method584(CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, var0, var1);
				}

				if (var2 == 41) {
					GameClient.secureBuffer.writeOpcode(26);
					GameClient.secureBuffer.writeInt(var1);
					GameClient.secureBuffer.writeShortA(var3);
					GameClient.secureBuffer.writeShortA(var0);
					GameClient.anInt2974 = 0;
					Class71.aInterfaceDef_862 = Class50.method713(var1, (byte) 73);
					GameClient.anInt2975 = var0 * -1530235251;
				}

				if (var2 == 7) {
					var17 = GameClient.sceneNpcs[var3];
					if (var17 != null) {
						GameClient.anInt2970 = var6 * 1315483603;
						GameClient.anInt2971 = var7 * -613726713;
						GameClient.anInt2973 = -1136925898;
						GameClient.anInt2972 = 0;
						GameClient.mapMarkerX = var0 * -2075522063;
						GameClient.mapMarkerZ = var1 * -700155223;
						GameClient.secureBuffer.writeOpcode(132);
						GameClient.secureBuffer.writeShort(Class37.anInt500 * 2106654977);
						GameClient.secureBuffer.writeShortA(var3);
						GameClient.secureBuffer.writeIntV1(Class44.anInt630 * -1356904377);
						GameClient.secureBuffer.writeLEShortA(Class100.anInt1415 * -1072007021);
						GameClient.secureBuffer.writeByteN(Class65.aBoolArray820[82] ? 1 : 0);
					}
				}

				if (var2 == 36) {
					int a = 6029312 >> 16;
					GameClient.secureBuffer.writeOpcode(88);
					GameClient.secureBuffer.writeShortA(var3);
					GameClient.secureBuffer.writeInt(var1);
					GameClient.secureBuffer.writeLEShortA(var0);
					GameClient.anInt2974 = 0;
					Class71.aInterfaceDef_862 = Class50.method713(var1, (byte) -97);
					GameClient.anInt2975 = var0 * -1530235251;
				}

				if (var2 == 46) {
					var9 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var3];
					if (var9 != null) {
						GameClient.anInt2970 = var6 * 1315483603;
						GameClient.anInt2971 = var7 * -613726713;
						GameClient.anInt2973 = -1136925898;
						GameClient.anInt2972 = 0;
						GameClient.mapMarkerX = var0 * -2075522063;
						GameClient.mapMarkerZ = var1 * -700155223;
						GameClient.secureBuffer.writeOpcode(229);
						GameClient.secureBuffer.writeShortA(var3);
						GameClient.secureBuffer.method2069(Class65.aBoolArray820[82] ? 1 : 0);
					}
				}

				if (var2 == 1003) {
					GameClient.anInt2970 = var6 * 1315483603;
					GameClient.anInt2971 = var7 * -613726713;
					GameClient.anInt2973 = -1136925898;
					GameClient.anInt2972 = 0;
					var17 = GameClient.sceneNpcs[var3];
					if (var17 != null) {
						NpcDef var19 = var17.definition;
						if (var19.anIntArray2246 != null) {
							var19 = var19.method2400(-1977766431);
						}

						if (var19 != null) {
							GameClient.secureBuffer.writeOpcode(130);
							GameClient.secureBuffer.writeShortLE(var19.id * 1380254665);
						}
					}
				}

				if (var2 == 26) {
					Class36.method489(1250489455);
				}

				if (var2 == 9) {
					var17 = GameClient.sceneNpcs[var3];
					if (var17 != null) {
						GameClient.anInt2970 = var6 * 1315483603;
						GameClient.anInt2971 = var7 * -613726713;
						GameClient.anInt2973 = -1136925898;
						GameClient.anInt2972 = 0;
						GameClient.mapMarkerX = var0 * -2075522063;
						GameClient.mapMarkerZ = var1 * -700155223;
						GameClient.secureBuffer.writeOpcode(189);
						GameClient.secureBuffer.writeShortLE(var3);
						GameClient.secureBuffer.method2069(Class65.aBoolArray820[82] ? 1 : 0);
					}
				}

				if (var2 == 8) {
					var17 = GameClient.sceneNpcs[var3];
					if (var17 != null) {
						GameClient.anInt2970 = var6 * 1315483603;
						GameClient.anInt2971 = var7 * -613726713;
						GameClient.anInt2973 = -1136925898;
						GameClient.anInt2972 = 0;
						GameClient.mapMarkerX = var0 * -2075522063;
						GameClient.mapMarkerZ = var1 * -700155223;
						GameClient.secureBuffer.writeOpcode(40);
						GameClient.secureBuffer.writeShortLE(GameClient.anInt2881 * -1911127929);
						GameClient.secureBuffer.writeIntV1(Class63.anInt799 * -464823961);
						GameClient.secureBuffer.writeByte(Class65.aBoolArray820[82] ? 1 : 0);
						GameClient.secureBuffer.writeShortA(var3);
					}
				}

				if (var2 == 35) {
					GameClient.secureBuffer.writeOpcode(212);
					GameClient.secureBuffer.writeShort(var0);
					GameClient.secureBuffer.writeIntV1(var1);
					GameClient.secureBuffer.writeShortLE(var3);
					GameClient.anInt2974 = 0;
					Class71.aInterfaceDef_862 = Class50.method713(var1, (byte) -97);
					GameClient.anInt2975 = var0 * -1530235251;
				}

				if (var2 == 1001) {
					GameClient.anInt2970 = var6 * 1315483603;
					GameClient.anInt2971 = var7 * -613726713;
					GameClient.anInt2973 = -1136925898;
					GameClient.anInt2972 = 0;
					GameClient.mapMarkerX = var0 * -2075522063;
					GameClient.mapMarkerZ = var1 * -700155223;
					GameClient.secureBuffer.writeOpcode(30);
					GameClient.secureBuffer.writeLEShortA(var0 + Class35.anInt478 * -1719983039);
					GameClient.secureBuffer.writeShortLE(LinkedEntry_Sub13.anInt1825 * 803568843 + var1);
					GameClient.secureBuffer.writeByteN(Class65.aBoolArray820[82] ? 1 : 0);
					GameClient.secureBuffer.writeShort(var3 >> 14 & 32767);
				}

				if (var2 == 3) {
					GameClient.anInt2970 = var6 * 1315483603;
					GameClient.anInt2971 = var7 * -613726713;
					GameClient.anInt2973 = -1136925898;
					GameClient.anInt2972 = 0;
					GameClient.mapMarkerX = var0 * -2075522063;
					GameClient.mapMarkerZ = var1 * -700155223;
					GameClient.secureBuffer.writeOpcode(185);
					GameClient.secureBuffer.writeShortA(var3 >> 14 & 32767);
					GameClient.secureBuffer.writeByteA(Class65.aBoolArray820[82] ? 1 : 0);
					GameClient.secureBuffer.writeShort(var1 + LinkedEntry_Sub13.anInt1825 * 803568843);
					GameClient.secureBuffer.writeShortA(Class35.anInt478 * -1719983039 + var0);
				}

				if (var2 == 19) {
					GameClient.anInt2970 = var6 * 1315483603;
					GameClient.anInt2971 = var7 * -613726713;
					GameClient.anInt2973 = -1136925898;
					GameClient.anInt2972 = 0;
					GameClient.mapMarkerX = var0 * -2075522063;
					GameClient.mapMarkerZ = var1 * -700155223;
					GameClient.secureBuffer.writeOpcode(2);
					GameClient.secureBuffer.writeShortLE(var3);
					GameClient.secureBuffer.writeShortLE(var1 + LinkedEntry_Sub13.anInt1825 * 803568843);
					GameClient.secureBuffer.writeLEShortA(Class35.anInt478 * -1719983039 + var0);
					GameClient.secureBuffer.writeByteA(Class65.aBoolArray820[82] ? 1 : 0);
				}

				if (var2 == 16) {
					GameClient.anInt2970 = var6 * 1315483603;
					GameClient.anInt2971 = var7 * -613726713;
					GameClient.anInt2973 = -1136925898;
					GameClient.anInt2972 = 0;
					GameClient.mapMarkerX = var0 * -2075522063;
					GameClient.mapMarkerZ = var1 * -700155223;
					GameClient.secureBuffer.writeOpcode(72);
					GameClient.secureBuffer.writeShort(Class100.anInt1415 * -1072007021);
					GameClient.secureBuffer.writeIntv2(Class44.anInt630 * -1356904377);
					GameClient.secureBuffer.writeShortLE(var1 + LinkedEntry_Sub13.anInt1825 * 803568843);
					GameClient.secureBuffer.writeShortA(var3);
					GameClient.secureBuffer.writeShortA(var0 + Class35.anInt478 * -1719983039);
					GameClient.secureBuffer.writeShort(Class37.anInt500 * 2106654977);
					GameClient.secureBuffer.writeByteN(Class65.aBoolArray820[82] ? 1 : 0);
				}

				if (var2 == 37) {
					GameClient.secureBuffer.writeOpcode(246);
					GameClient.secureBuffer.writeShortA(var0);
					GameClient.secureBuffer.writeLEShortA(var3);
					GameClient.secureBuffer.writeInt(var1);
					GameClient.anInt2974 = 0;
					Class71.aInterfaceDef_862 = Class50.method713(var1, (byte) 30);
					GameClient.anInt2975 = var0 * -1530235251;
				}

				if (var2 == 1004) {
					GameClient.anInt2970 = var6 * 1315483603;
					GameClient.anInt2971 = var7 * -613726713;
					GameClient.anInt2973 = -1136925898;
					GameClient.anInt2972 = 0;
					GameClient.secureBuffer.writeOpcode(156);
					GameClient.secureBuffer.writeShortA(var3);
				}

				if (var2 == 51) {
					var9 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var3];
					if (var9 != null) {
						GameClient.anInt2970 = var6 * 1315483603;
						GameClient.anInt2971 = var7 * -613726713;
						GameClient.anInt2973 = -1136925898;
						GameClient.anInt2972 = 0;
						GameClient.mapMarkerX = var0 * -2075522063;
						GameClient.mapMarkerZ = var1 * -700155223;
						GameClient.secureBuffer.writeOpcode(220);
						GameClient.secureBuffer.writeByteA(Class65.aBoolArray820[82] ? 1 : 0);
						GameClient.secureBuffer.writeShort(var3);
					}
				}

				if (var2 == 33) {
					GameClient.secureBuffer.writeOpcode(165);
					GameClient.secureBuffer.writeShortA(var0);
					GameClient.secureBuffer.writeShort(var3);
					GameClient.secureBuffer.writeLEInt(var1);
					System.out.printf("Examine %d, %d, %d%n", var0, var3, var1);
					GameClient.anInt2974 = 0;
					Class71.aInterfaceDef_862 = Class50.method713(var1, (byte) -43);
					GameClient.anInt2975 = var0 * -1530235251;
				}

				if (var2 == 50) {
					var9 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var3];
					if (var9 != null) {
						GameClient.anInt2970 = var6 * 1315483603;
						GameClient.anInt2971 = var7 * -613726713;
						GameClient.anInt2973 = -1136925898;
						GameClient.anInt2972 = 0;
						GameClient.mapMarkerX = var0 * -2075522063;
						GameClient.mapMarkerZ = var1 * -700155223;
						GameClient.secureBuffer.writeOpcode(95);
						GameClient.secureBuffer.writeByte(Class65.aBoolArray820[82] ? 1 : 0);
						GameClient.secureBuffer.writeShort(var3);
					}
				}

				if (var2 == 18) {
					GameClient.anInt2970 = var6 * 1315483603;
					GameClient.anInt2971 = var7 * -613726713;
					GameClient.anInt2973 = -1136925898;
					GameClient.anInt2972 = 0;
					GameClient.mapMarkerX = var0 * -2075522063;
					GameClient.mapMarkerZ = var1 * -700155223;
					GameClient.secureBuffer.writeOpcode(186);
					GameClient.secureBuffer.writeLEShortA(LinkedEntry_Sub13.anInt1825 * 803568843 + var1);
					GameClient.secureBuffer.writeByteN(Class65.aBoolArray820[82] ? 1 : 0);
					GameClient.secureBuffer.writeLEShortA(var0 + Class35.anInt478 * -1719983039);
					GameClient.secureBuffer.writeLEShortA(var3);
				}

				if (var2 == 45) {
					var9 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var3];
					if (var9 != null) {
						GameClient.anInt2970 = var6 * 1315483603;
						GameClient.anInt2971 = var7 * -613726713;
						GameClient.anInt2973 = -1136925898;
						GameClient.anInt2972 = 0;
						GameClient.mapMarkerX = var0 * -2075522063;
						GameClient.mapMarkerZ = var1 * -700155223;
						GameClient.secureBuffer.writeOpcode(237);
						GameClient.secureBuffer.writeShortLE(var3);
						GameClient.secureBuffer.method2069(Class65.aBoolArray820[82] ? 1 : 0);
					}
				}

				if (var2 == 31) {
					GameClient.secureBuffer.writeOpcode(107);
					GameClient.secureBuffer.writeLEInt(var1);
					GameClient.secureBuffer.writeLEShortA(var0);
					GameClient.secureBuffer.writeShortA(Class37.anInt500 * 2106654977);
					GameClient.secureBuffer.writeLEShortA(var3);
					GameClient.secureBuffer.writeShortA(Class100.anInt1415 * -1072007021);
					GameClient.secureBuffer.writeLEInt(Class44.anInt630 * -1356904377);
					GameClient.anInt2974 = 0;
					Class71.aInterfaceDef_862 = Class50.method713(var1, (byte) -120);
					GameClient.anInt2975 = var0 * -1530235251;
				}

				if (var2 == 15) {
					var9 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var3];
					if (var9 != null) {
						GameClient.anInt2970 = var6 * 1315483603;
						GameClient.anInt2971 = var7 * -613726713;
						GameClient.anInt2973 = -1136925898;
						GameClient.anInt2972 = 0;
						GameClient.mapMarkerX = var0 * -2075522063;
						GameClient.mapMarkerZ = var1 * -700155223;
						GameClient.secureBuffer.writeOpcode(110);
						GameClient.secureBuffer.writeShort(GameClient.anInt2881 * -1911127929);
						GameClient.secureBuffer.writeShortLE(var3);
						GameClient.secureBuffer.writeIntV1(Class63.anInt799 * -464823961);
						GameClient.secureBuffer.writeByte(Class65.aBoolArray820[82] ? 1 : 0);
					}
				}

				if (var2 == 12) {
					var17 = GameClient.sceneNpcs[var3];
					if (var17 != null) {
						GameClient.anInt2970 = var6 * 1315483603;
						GameClient.anInt2971 = var7 * -613726713;
						GameClient.anInt2973 = -1136925898;
						GameClient.anInt2972 = 0;
						GameClient.mapMarkerX = var0 * -2075522063;
						GameClient.mapMarkerZ = var1 * -700155223;
						GameClient.secureBuffer.writeOpcode(76);
						GameClient.secureBuffer.method2069(Class65.aBoolArray820[82] ? 1 : 0);
						GameClient.secureBuffer.writeShortA(var3);
					}
				}

				if (var2 == 14) {
					var9 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var3];
					if (var9 != null) {
						GameClient.anInt2970 = var6 * 1315483603;
						GameClient.anInt2971 = var7 * -613726713;
						GameClient.anInt2973 = -1136925898;
						GameClient.anInt2972 = 0;
						GameClient.mapMarkerX = var0 * -2075522063;
						GameClient.mapMarkerZ = var1 * -700155223;
						GameClient.secureBuffer.writeOpcode(37);
						GameClient.secureBuffer.writeInt(Class44.anInt630 * -1356904377);
						GameClient.secureBuffer.writeLEShortA(var3);
						GameClient.secureBuffer.writeShort(Class37.anInt500 * 2106654977);
						GameClient.secureBuffer.writeByteN(Class65.aBoolArray820[82] ? 1 : 0);
						GameClient.secureBuffer.writeShortLE(Class100.anInt1415 * -1072007021);
					}
				}

				if (var2 == 24) {
					var18 = Class50.method713(var1, (byte) 15);
					boolean var20 = true;
					if (var18.anInt1943 * -202095703 > 0) {
						var20 = Class63_Sub1.method2092(var18, (byte) -3);
					}

					if (var20) {
						GameClient.secureBuffer.writeOpcode(34);
						GameClient.secureBuffer.writeInt(var1);
					}
				}

				if (var2 == 49) {
					var9 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var3];
					if (var9 != null) {
						GameClient.anInt2970 = var6 * 1315483603;
						GameClient.anInt2971 = var7 * -613726713;
						GameClient.anInt2973 = -1136925898;
						GameClient.anInt2972 = 0;
						GameClient.mapMarkerX = var0 * -2075522063;
						GameClient.mapMarkerZ = var1 * -700155223;
						GameClient.secureBuffer.writeOpcode(218);
						GameClient.secureBuffer.writeLEShortA(var3);
						GameClient.secureBuffer.method2069(Class65.aBoolArray820[82] ? 1 : 0);
					}
				}

				if (var2 == 1005) {
					var18 = Class50.method713(var1, (byte) -82);
					if (var18 != null && var18.itemAmounts[var0] >= 100000) {
						Class93.sendMessage(27, "", var18.itemAmounts[var0] + " x " + PacketDecoder.getItemDef(var3).name);
					} else {
						GameClient.secureBuffer.writeOpcode(156);
						GameClient.secureBuffer.writeShortA(var3);
					}

					GameClient.anInt2974 = 0;
					Class71.aInterfaceDef_862 = Class50.method713(var1, (byte) 21);
					GameClient.anInt2975 = var0 * -1530235251;
				}

				if (var2 == 6) {
					GameClient.anInt2970 = var6 * 1315483603;
					GameClient.anInt2971 = var7 * -613726713;
					GameClient.anInt2973 = -1136925898;
					GameClient.anInt2972 = 0;
					GameClient.mapMarkerX = var0 * -2075522063;
					GameClient.mapMarkerZ = var1 * -700155223;
					GameClient.secureBuffer.writeOpcode(24);
					GameClient.secureBuffer.writeByteA(Class65.aBoolArray820[82] ? 1 : 0);
					GameClient.secureBuffer.writeShort(Class35.anInt478 * -1719983039 + var0);
					GameClient.secureBuffer.writeShort(var3 >> 14 & 32767);
					GameClient.secureBuffer.writeShortLE(LinkedEntry_Sub13.anInt1825 * 803568843 + var1);
				}

				if (var2 == 43) {
					GameClient.secureBuffer.writeOpcode(125);
					GameClient.secureBuffer.writeShort(var3);
					GameClient.secureBuffer.writeShortA(var0);
					GameClient.secureBuffer.writeIntV1(var1);
					GameClient.anInt2974 = 0;
					Class71.aInterfaceDef_862 = Class50.method713(var1, (byte) 77);
					GameClient.anInt2975 = var0 * -1530235251;
				}

				if (var2 == 42) {
					GameClient.secureBuffer.writeOpcode(211);
					GameClient.secureBuffer.writeShortLE(var0);
					GameClient.secureBuffer.writeInt(var1);
					GameClient.secureBuffer.writeShortLE(var3);
					GameClient.anInt2974 = 0;
					Class71.aInterfaceDef_862 = Class50.method713(var1, (byte) 54);
					GameClient.anInt2975 = var0 * -1530235251;
				}

				if (var2 == 30 && GameClient.aInterfaceDef_3029 == null) {
					Class50.method711(var1, var0, (short) 4032);
					GameClient.aInterfaceDef_3029 = Class50.method712(var1, var0, (short) 4516);
					Class35.method484(GameClient.aInterfaceDef_3029, -807509536);
				}

				if (var2 == 17) {
					GameClient.anInt2970 = var6 * 1315483603;
					GameClient.anInt2971 = var7 * -613726713;
					GameClient.anInt2973 = -1136925898;
					GameClient.anInt2972 = 0;
					GameClient.mapMarkerX = var0 * -2075522063;
					GameClient.mapMarkerZ = var1 * -700155223;
					GameClient.secureBuffer.writeOpcode(242);
					GameClient.secureBuffer.writeInt(Class63.anInt799 * -464823961);
					GameClient.secureBuffer.writeShortA(var0 + Class35.anInt478 * -1719983039);
					GameClient.secureBuffer.writeShortA(LinkedEntry_Sub13.anInt1825 * 803568843 + var1);
					GameClient.secureBuffer.writeShortLE(var3);
					GameClient.secureBuffer.writeShort(GameClient.anInt2881 * -1911127929);
					GameClient.secureBuffer.writeByteA(Class65.aBoolArray820[82] ? 1 : 0);
				}

				if (GameClient.anInt3018 * -1710049223 != 0) {
					GameClient.anInt3018 = 0;
					Class35.method484(Class50.method713(Class44.anInt630 * -1356904377, (byte) 10), -1024916820);
				}

				if (GameClient.isPickingOption) {
					CacheableEntry_Sub23_Sub17.method2798((short) 255);
				}

				if (Class71.aInterfaceDef_862 != null && GameClient.anInt2974 * 756602047 == 0) {
					Class35.method484(Class71.aInterfaceDef_862, -325348708);
				}

			}
		}
	}

	public byte[] method914(int var1, short var2) {
		Class139 var3 = aClass139_844;
		synchronized (var3) {
			try {
				if (aClass139_846.method1671(-1606211368) < (long) (6 + var1 * 6)) {
					return null;
				} else {
					aClass139_846.method1659((long) (var1 * 6));
					aClass139_846.method1681(aByteArray847, 0, 6, -209747204);
					int var4 = (aByteArray847[2] & 255) + ((aByteArray847[0] & 255) << 16) + ((aByteArray847[1] & 255) << 8);
					int var5 = ((aByteArray847[4] & 255) << 8) + ((aByteArray847[3] & 255) << 16) + (aByteArray847[5] & 255);
					if (var4 < 0 || var4 > anInt845 * 1691233917) {
						return null;
					} else if (var5 <= 0 || (long) var5 > aClass139_844.method1671(2081122554) / 520L) {
						return null;
					} else {
						byte[] var6 = new byte[var4];
						int var7 = 0;

						for (int var8 = 0; var7 < var4; var8++) {
							if (var5 == 0) {
								return null;
							}

							aClass139_844.method1659((long) (var5 * 520));
							int var9 = var4 - var7;
							if (var9 > 512) {
								var9 = 512;
							}

							aClass139_844.method1681(aByteArray847, 0, var9 + 8, -1449235454);
							int var10 = ((aByteArray847[0] & 255) << 8) + (aByteArray847[1] & 255);
							int var11 = (aByteArray847[3] & 255) + ((aByteArray847[2] & 255) << 8);
							int var12 = ((aByteArray847[5] & 255) << 8) + ((aByteArray847[4] & 255) << 16) + (aByteArray847[6] & 255);
							int var13 = aByteArray847[7] & 255;
							if (var1 != var10 || var11 != var8 || anInt851 * 2050793387 != var13) {
								return null;
							}

							if (var12 < 0 || (long) var12 > aClass139_844.method1671(1027604024) / 520L) {
								return null;
							}

							for (int var14 = 0; var14 < var9; var14++) {
								var6[var7++] = aByteArray847[var14 + 8];
							}

							var5 = var12;
						}

						byte[] var10000 = var6;
						return var10000;
					}
				}
			} catch (IOException var16) {
				return null;
			}
		}
	}

	public PacketEncoder(int var1, Class139 var2, Class139 var3, int var4) {
		anInt851 = var1 * 530670339;
		aClass139_844 = var2;
		aClass139_846 = var3;
		anInt845 = var4 * 1585920725;
	}

	boolean method915(int var1, byte[] var2, int var3, boolean var4, int var5) {
		Class139 var6 = aClass139_844;
		synchronized (var6) {
			boolean var10000;
			try {
				int var7;
				if (var4) {
					if (aClass139_846.method1671(2143349893) < (long) (6 + var1 * 6)) {
						return false;
					}

					aClass139_846.method1659((long) (var1 * 6));
					aClass139_846.method1681(aByteArray847, 0, 6, 602160758);
					var7 = ((aByteArray847[3] & 255) << 16) + ((aByteArray847[4] & 255) << 8) + (aByteArray847[5] & 255);
					if (var7 <= 0 || (long) var7 > aClass139_844.method1671(1916476923) / 520L) {
						return false;
					}
				} else {
					var7 = (int) ((aClass139_844.method1671(-1167510203) + 519L) / 520L);
					if (var7 == 0) {
						var7 = 1;
					}
				}

				aByteArray847[0] = (byte) (var3 >> 16);
				aByteArray847[1] = (byte) (var3 >> 8);
				aByteArray847[2] = (byte) var3;
				aByteArray847[3] = (byte) (var7 >> 16);
				aByteArray847[4] = (byte) (var7 >> 8);
				aByteArray847[5] = (byte) var7;
				aClass139_846.method1659((long) (var1 * 6));
				aClass139_846.method1683(aByteArray847, 0, 6, 1769550700);
				int var8 = 0;

				for (int var9 = 0; var8 < var3; var9++) {
					int var10 = 0;
					int var11;
					if (var4) {
						aClass139_844.method1659((long) (var7 * 520));

						try {
							aClass139_844.method1681(aByteArray847, 0, 8, 295289594);
						} catch (EOFException var15) {
							break;
						}

						var11 = (aByteArray847[1] & 255) + ((aByteArray847[0] & 255) << 8);
						int var12 = (aByteArray847[3] & 255) + ((aByteArray847[2] & 255) << 8);
						var10 = (aByteArray847[6] & 255) + ((aByteArray847[5] & 255) << 8) + ((aByteArray847[4] & 255) << 16);
						int var13 = aByteArray847[7] & 255;
						if (var11 != var1 || var9 != var12 || var13 != anInt851 * 2050793387) {
							return false;
						}

						if (var10 < 0 || (long) var10 > aClass139_844.method1671(-632127161) / 520L) {
							return false;
						}
					}

					if (var10 == 0) {
						var4 = false;
						var10 = (int) ((aClass139_844.method1671(680587379) + 519L) / 520L);
						if (var10 == 0) {
							++var10;
						}

						if (var10 == var7) {
							++var10;
						}
					}

					if (var3 - var8 <= 512) {
						var10 = 0;
					}

					aByteArray847[0] = (byte) (var1 >> 8);
					aByteArray847[1] = (byte) var1;
					aByteArray847[2] = (byte) (var9 >> 8);
					aByteArray847[3] = (byte) var9;
					aByteArray847[4] = (byte) (var10 >> 16);
					aByteArray847[5] = (byte) (var10 >> 8);
					aByteArray847[6] = (byte) var10;
					aByteArray847[7] = (byte) (anInt851 * 2050793387);
					aClass139_844.method1659((long) (var7 * 520));
					aClass139_844.method1683(aByteArray847, 0, 8, 2066579113);
					var11 = var3 - var8;
					if (var11 > 512) {
						var11 = 512;
					}

					aClass139_844.method1683(var2, var8, var11, 1871848158);
					var8 += var11;
					var7 = var10;
				}

				var10000 = true;
			} catch (IOException var16) {
				return false;
			}

			return var10000;
		}
	}

	public boolean method920(int var1, byte[] var2, int var3, int var4) {
		Class139 var5 = aClass139_844;
		synchronized (var5) {
			if (var3 >= 0 && var3 <= anInt845 * 1691233917) {
				boolean var6 = method915(var1, var2, var3, true, -218714770);
				if (!var6) {
					var6 = method915(var1, var2, var3, false, 1054377071);
				}

				return var6;
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	static void method922(CacheableEntry_Sub23_Sub14_Sub4_Sub1 var0, CacheableEntry_Sub23_Sub14_Sub4_Sub1 var1, CacheableEntry_Sub23_Sub14_Sub4_Sub1 var2, boolean var3, byte var4) {
		if (var3) {
			Class3.anInt42 = (Class5.anInt98 * 2104430923 - GameClient.anInt3082 * 1386143757) / 2 * -1646540671;
			Class3.anInt47 = Class3.anInt42 * -2012744469 - 1809848210;
		}

		if (Class3.aBool69) {
			Class30.method409(var0, var1, (byte) 20);
		} else {
			if (var3) {
				Class134.aClass109_Sub23_Sub14_Sub2_1599.method2995(Class3.anInt42 * -468945023, 0);
				Class3.aClass109_Sub23_Sub14_Sub2_45.method2995(382 + Class3.anInt42 * -468945023, 0);
				Class106.aClass109_Sub23_Sub14_Sub1_1475.method2972(382 + Class3.anInt42 * -468945023 - Class106.aClass109_Sub23_Sub14_Sub1_1475.anInt2585 / 2, 18);
			}

			int var6;
			if (GameClient.anInt2868 * -684224463 == 0 || GameClient.anInt2868 * -684224463 == 5) {
				byte var5 = 20;
				var0.method3381(Class90.aString1081, Class3.anInt47 * 23501379 + 180, 245 - var5, 16777215, -1);
				var6 = 253 - var5;
				CacheableEntry_Sub23_Sub14.method2720(180 + Class3.anInt47 * 23501379 - 152, var6, 304, 34, 9179409);
				CacheableEntry_Sub23_Sub14.method2720(180 + Class3.anInt47 * 23501379 - 151, var6 + 1, 302, 32, 0);
				CacheableEntry_Sub23_Sub14.method2718(180 + Class3.anInt47 * 23501379 - 150, 2 + var6, Class3.anInt66 * -2136314695, 30, 9179409);
				CacheableEntry_Sub23_Sub14.method2718(Class3.anInt47 * 23501379 + 180 - 150 + Class3.anInt66 * -2136314695, var6 + 2, 300 - Class3.anInt66 * -2136314695, 30, 0);
				var0.method3381(Class3.aString56, 180 + Class3.anInt47 * 23501379, 276 - var5, 16777215, -1);
			}

			String var7;
			String var9;
			String var10;
			int var11;
			char[] var12;
			int var13;
			String var14;
			short var17;
			int var18;
			short var19;
			if (GameClient.anInt2868 * -684224463 == 20) {
				Class3.aClass109_Sub23_Sub14_Sub1_43.method2972(Class3.anInt47 * 23501379 + 180 - Class3.aClass109_Sub23_Sub14_Sub1_43.anInt2585 / 2, 271 - Class3.aClass109_Sub23_Sub14_Sub1_43.anInt2582 / 2);
				var17 = 211;
				var0.method3381(Class3.aString58, 180 + Class3.anInt47 * 23501379, var17, 16776960, 0);
				var18 = var17 + 15;
				var0.method3381(Class3.aString59, 180 + Class3.anInt47 * 23501379, var18, 16776960, 0);
				var18 += 15;
				var0.method3381(Class3.aString60, Class3.anInt47 * 23501379 + 180, var18, 16776960, 0);
				var18 += 15;
				var18 += 10;
				if (Class3.anInt57 * -1261736495 != 4) {
					var0.method3316(Class90.aString1071, 180 + Class3.anInt47 * 23501379 - 110, var18, 16777215, 0);
					var19 = 200;

					for (var7 = Class3.aString55; var0.method3311(var7) > var19; var7 = var7.substring(0, var7.length() - 1)) {
						;
					}

					var0.method3316(CacheableEntry_Sub23_Sub14_Sub4.method3315(var7), Class3.anInt47 * 23501379 + 180 - 70, var18, 16777215, 0);
					var18 += 15;
					var9 = Class90.aString1077;
					var10 = Class3.password;
					var11 = var10.length();
					var12 = new char[var11];

					for (var13 = 0; var13 < var11; var13++) {
						var12[var13] = 42;
					}

					var14 = new String(var12);
					var0.method3316(var9 + var14, 180 + Class3.anInt47 * 23501379 - 108, var18, 16777215, 0);
					var18 += 15;
				}
			}

			int var8;
			int var25;
			int var30;
			int var32;
			if (GameClient.anInt2868 * -684224463 == 10 || GameClient.anInt2868 * -684224463 == 11) {
				Class3.aClass109_Sub23_Sub14_Sub1_43.method2972(Class3.anInt47 * 23501379, 171);
				short var20;
				if (Class3.anInt57 * -1261736495 == 0) {
					var17 = 251;
					var0.method3381(Class90.aString1288, 180 + Class3.anInt47 * 23501379, var17, 16776960, 0);
					var18 = var17 + 30;
					var6 = Class3.anInt47 * 23501379 + 180 - 80;
					var20 = 291;
					Class3.aClass109_Sub23_Sub14_Sub1_44.method2972(var6 - 73, var20 - 20);
					var0.method3346(Class90.aString1289, var6 - 73, var20 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var6 = Class3.anInt47 * 23501379 + 180 + 80;
					Class3.aClass109_Sub23_Sub14_Sub1_44.method2972(var6 - 73, var20 - 20);
					var0.method3346(Class90.aString1327, var6 - 73, var20 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Class3.anInt57 * -1261736495 == 1) {
					var0.method3381(Class90.aString1236, Class3.anInt47 * 23501379 + 180, 211, 16776960, 0);
					var17 = 236;
					var0.method3381(Class3.aString58, Class3.anInt47 * 23501379 + 180, var17, 16777215, 0);
					var18 = var17 + 15;
					var0.method3381(Class3.aString59, Class3.anInt47 * 23501379 + 180, var18, 16777215, 0);
					var18 += 15;
					var0.method3381(Class3.aString60, 180 + Class3.anInt47 * 23501379, var18, 16777215, 0);
					var18 += 15;
					var6 = Class3.anInt47 * 23501379 + 180 - 80;
					var20 = 321;
					Class3.aClass109_Sub23_Sub14_Sub1_44.method2972(var6 - 73, var20 - 20);
					var0.method3381(Class90.aString1061, var6, var20 + 5, 16777215, 0);
					var6 = 80 + Class3.anInt47 * 23501379 + 180;
					Class3.aClass109_Sub23_Sub14_Sub1_44.method2972(var6 - 73, var20 - 20);
					var0.method3381(Class90.aString1245, var6, 5 + var20, 16777215, 0);
				} else if (Class3.anInt57 * -1261736495 == 2) {
					var17 = 211;
					var0.method3381(Class3.aString58, 180 + Class3.anInt47 * 23501379, var17, 16776960, 0);
					var18 = var17 + 15;
					var0.method3381(Class3.aString59, Class3.anInt47 * 23501379 + 180, var18, 16776960, 0);
					var18 += 15;
					var0.method3381(Class3.aString60, 180 + Class3.anInt47 * 23501379, var18, 16776960, 0);
					var18 += 15;
					var18 += 10;
					var0.method3316(Class90.aString1071, 180 + Class3.anInt47 * 23501379 - 110, var18, 16777215, 0);
					var19 = 200;

					for (var7 = Class3.aString55; var0.method3311(var7) > var19; var7 = var7.substring(1)) {
						;
					}

					var0.method3316(CacheableEntry_Sub23_Sub14_Sub4.method3315(var7) + (Class3.anInt65 * -763095547 == 0 & GameClient.cycle * 1026470457 % 40 < 20 ? Class22.hexColTag(16776960) + Class37.PIPE : ""), 180 + Class3.anInt47 * 23501379 - 70, var18, 16777215, 0);
					var18 += 15;
					var9 = Class90.aString1077;
					var10 = Class3.password;
					var11 = var10.length();
					var12 = new char[var11];

					for (var13 = 0; var13 < var11; var13++) {
						var12[var13] = 42;
					}

					var14 = new String(var12);
					var0.method3316(var9 + var14 + (Class3.anInt65 * -763095547 == 1 & GameClient.cycle * 1026470457 % 40 < 20 ? Class22.hexColTag(16776960) + Class37.PIPE : ""), 180 + Class3.anInt47 * 23501379 - 108, var18, 16777215, 0);
					var18 += 15;
					var30 = 180 + Class3.anInt47 * 23501379 - 80;
					short var26 = 321;
					Class3.aClass109_Sub23_Sub14_Sub1_44.method2972(var30 - 73, var26 - 20);
					var0.method3381(Class90.aString1198, var30, 5 + var26, 16777215, 0);
					var30 = 80 + Class3.anInt47 * 23501379 + 180;
					Class3.aClass109_Sub23_Sub14_Sub1_44.method2972(var30 - 73, var26 - 20);
					var0.method3381(Class90.aString1245, var30, var26 + 5, 16777215, 0);
					var17 = 357;
					var1.method3381(Class90.aString1293, Class3.anInt47 * 23501379 + 180, var17, 16776960, 0);
				} else if (Class3.anInt57 * -1261736495 == 4) {
					var0.method3381(Class90.aString1295, Class3.anInt47 * 23501379 + 180, 211, 16776960, 0);
					var17 = 236;
					var0.method3381(Class3.aString58, 180 + Class3.anInt47 * 23501379, var17, 16777215, 0);
					var18 = var17 + 15;
					var0.method3381(Class3.aString59, Class3.anInt47 * 23501379 + 180, var18, 16777215, 0);
					var18 += 15;
					var0.method3381(Class3.aString60, 180 + Class3.anInt47 * 23501379, var18, 16777215, 0);
					var18 += 15;
					var7 = Class90.aString1287;
					var9 = Class126_Sub1.aString1646;
					var25 = var9.length();
					char[] var31 = new char[var25];

					for (var11 = 0; var11 < var25; var11++) {
						var31[var11] = 42;
					}

					String var15 = new String(var31);
					var0.method3316(var7 + var15 + (GameClient.cycle * 1026470457 % 40 < 20 ? Class22.hexColTag(16776960) + Class37.PIPE : ""), 180 + Class3.anInt47 * 23501379 - 108, var18, 16777215, 0);
					var18 -= 8;
					var0.method3316(Class90.aString1063, 180 + Class3.anInt47 * 23501379 - 9, var18, 16776960, 0);
					var18 += 15;
					var0.method3316(Class90.aString1064, Class3.anInt47 * 23501379 + 180 - 9, var18, 16776960, 0);
					var32 = 180 + Class3.anInt47 * 23501379 - 9 + var0.method3311(Class90.aString1064) + 15;
					var25 = var18 - var0.anInt2807;
					CacheableEntry_Sub23_Sub14_Sub1 var33;
					if (Class3.aBool75) {
						var33 = Class42.aClass109_Sub23_Sub14_Sub1_605;
					} else {
						var33 = Class3.aClass109_Sub23_Sub14_Sub1_41;
					}

					var33.method2972(var32, var25);
					var18 += 15;
					var11 = 180 + Class3.anInt47 * 23501379 - 80;
					short var27 = 321;
					Class3.aClass109_Sub23_Sub14_Sub1_44.method2972(var11 - 73, var27 - 20);
					var0.method3381(Class90.aString1061, var11, 5 + var27, 16777215, 0);
					var11 = Class3.anInt47 * 23501379 + 180 + 80;
					Class3.aClass109_Sub23_Sub14_Sub1_44.method2972(var11 - 73, var27 - 20);
					var0.method3381(Class90.aString1245, var11, var27 + 5, 16777215, 0);
					var1.method3381(Class90.aString1281, 180 + Class3.anInt47 * 23501379, var27 + 36, 255, 0);
				} else if (Class3.anInt57 * -1261736495 == 5) {
					var0.method3381(Class90.aString1294, 180 + Class3.anInt47 * 23501379, 201, 16776960, 0);
					var17 = 221;
					var2.method3381(Class3.aString58, Class3.anInt47 * 23501379 + 180, var17, 16776960, 0);
					var18 = var17 + 15;
					var2.method3381(Class3.aString59, Class3.anInt47 * 23501379 + 180, var18, 16776960, 0);
					var18 += 15;
					var2.method3381(Class3.aString60, 180 + Class3.anInt47 * 23501379, var18, 16776960, 0);
					var18 += 15;
					var18 += 14;
					var0.method3316(Class90.aString1299, Class3.anInt47 * 23501379 + 180 - 145, var18, 16777215, 0);
					var19 = 174;

					for (var7 = Class3.aString55; var0.method3311(var7) > var19; var7 = var7.substring(1)) {
						;
					}

					var0.method3316(CacheableEntry_Sub23_Sub14_Sub4.method3315(var7) + (GameClient.cycle * 1026470457 % 40 < 20 ? Class22.hexColTag(16776960) + Class37.PIPE : ""), 180 + Class3.anInt47 * 23501379 - 34, var18, 16777215, 0);
					var18 += 15;
					var8 = 180 + Class3.anInt47 * 23501379 - 80;
					short var21 = 321;
					Class3.aClass109_Sub23_Sub14_Sub1_44.method2972(var8 - 73, var21 - 20);
					var0.method3381(Class90.aString1296, var8, 5 + var21, 16777215, 0);
					var8 = 180 + Class3.anInt47 * 23501379 + 80;
					Class3.aClass109_Sub23_Sub14_Sub1_44.method2972(var8 - 73, var21 - 20);
					var0.method3381(Class90.aString1225, var8, 5 + var21, 16777215, 0);
				} else if (Class3.anInt57 * -1261736495 == 6) {
					var17 = 211;
					var0.method3381(Class3.aString58, Class3.anInt47 * 23501379 + 180, var17, 16776960, 0);
					var18 = var17 + 15;
					var0.method3381(Class3.aString59, Class3.anInt47 * 23501379 + 180, var18, 16776960, 0);
					var18 += 15;
					var0.method3381(Class3.aString60, 180 + Class3.anInt47 * 23501379, var18, 16776960, 0);
					var18 += 15;
					var6 = Class3.anInt47 * 23501379 + 180;
					var20 = 321;
					Class3.aClass109_Sub23_Sub14_Sub1_44.method2972(var6 - 73, var20 - 20);
					var0.method3381(Class90.aString1225, var6, var20 + 5, 16777215, 0);
				}
			}

			if (Class3.anInt53 * -2057645811 > 0) {
				Class61.method819(Class3.anInt53 * -2057645811, 626868295);
				Class3.anInt53 = 0;
			}

			var17 = 256;
			if (Class3.anInt49 * 948700643 > 0) {
				for (var6 = 0; var6 < 256; var6++) {
					if (Class3.anInt49 * 948700643 > 768) {
						Class60.anIntArray775[var6] = CacheableEntry_Sub23_Sub12.method2514(Class33.anIntArray430[var6], Class51.anIntArray706[var6], 1024 - Class3.anInt49 * 948700643, -2067546620);
					} else if (Class3.anInt49 * 948700643 > 256) {
						Class60.anIntArray775[var6] = Class51.anIntArray706[var6];
					} else {
						Class60.anIntArray775[var6] = CacheableEntry_Sub23_Sub12.method2514(Class51.anIntArray706[var6], Class33.anIntArray430[var6], 256 - Class3.anInt49 * 948700643, -562867895);
					}
				}
			} else if (Class3.anInt50 * -476800185 > 0) {
				for (var6 = 0; var6 < 256; var6++) {
					if (Class3.anInt50 * -476800185 > 768) {
						Class60.anIntArray775[var6] = CacheableEntry_Sub23_Sub12.method2514(Class33.anIntArray430[var6], Class42.anIntArray598[var6], 1024 - Class3.anInt50 * -476800185, -473723166);
					} else if (Class3.anInt50 * -476800185 > 256) {
						Class60.anIntArray775[var6] = Class42.anIntArray598[var6];
					} else {
						Class60.anIntArray775[var6] = CacheableEntry_Sub23_Sub12.method2514(Class42.anIntArray598[var6], Class33.anIntArray430[var6], 256 - Class3.anInt50 * -476800185, -1076935946);
					}
				}
			} else {
				for (var6 = 0; var6 < 256; var6++) {
					Class60.anIntArray775[var6] = Class33.anIntArray430[var6];
				}
			}

			CacheableEntry_Sub23_Sub14.method2771(Class3.anInt42 * -468945023, 9, 128 + Class3.anInt42 * -468945023, 7 + var17);
			Class134.aClass109_Sub23_Sub14_Sub2_1599.method2995(Class3.anInt42 * -468945023, 0);
			CacheableEntry_Sub23_Sub14.method2711();
			var6 = 0;
			int var23 = Class3.anInt42 * -468945023 + Class72.aClass7_871.anInt108 * -822155747;

			int var24;
			int var28;
			for (var8 = 1; var8 < var17 - 1; var8++) {
				var24 = (var17 - var8) * Class3.anIntArray61[var8] / var17;
				var32 = 22 + var24;
				if (var32 < 0) {
					var32 = 0;
				}

				var6 += var32;

				for (var25 = var32; var25 < 128; var25++) {
					var30 = Class30.anIntArray382[var6++];
					if (var30 != 0) {
						var11 = var30;
						var28 = 256 - var30;
						var30 = Class60.anIntArray775[var30];
						var13 = Class72.aClass7_871.anIntArray109[var23];
						Class72.aClass7_871.anIntArray109[var23++] = ((var30 & 16711935) * var11 + (var13 & 16711935) * var28 & -16711936) + ((var13 & 65280) * var28 + (var30 & 65280) * var11 & 16711680) >> 8;
					} else {
						++var23;
					}
				}

				var23 += var32 + Class72.aClass7_871.anInt108 * -568569227 - 128;
			}

			CacheableEntry_Sub23_Sub14.method2771(Class3.anInt42 * -468945023 + 765 - 128, 9, 765 + Class3.anInt42 * -468945023, 7 + var17);
			Class3.aClass109_Sub23_Sub14_Sub2_45.method2995(382 + Class3.anInt42 * -468945023, 0);
			CacheableEntry_Sub23_Sub14.method2711();
			var6 = 0;
			var23 = Class3.anInt42 * -468945023 + Class72.aClass7_871.anInt108 * -822155747 + 24 + 637;

			for (var8 = 1; var8 < var17 - 1; var8++) {
				var24 = (var17 - var8) * Class3.anIntArray61[var8] / var17;
				var32 = 103 - var24;
				var23 += var24;

				for (var25 = 0; var25 < var32; var25++) {
					var30 = Class30.anIntArray382[var6++];
					if (var30 != 0) {
						var11 = var30;
						var28 = 256 - var30;
						var30 = Class60.anIntArray775[var30];
						var13 = Class72.aClass7_871.anIntArray109[var23];
						Class72.aClass7_871.anIntArray109[var23++] = (var28 * (var13 & 65280) + var11 * (var30 & 65280) & 16711680) + (var11 * (var30 & 16711935) + (var13 & 16711935) * var28 & -16711936) >> 8;
					} else {
						++var23;
					}
				}

				var6 += 128 - var32;
				var23 += Class72.aClass7_871.anInt108 * -568569227 - var32 - var24;
			}

			Class118.aClass109_Sub23_Sub14_Sub1Array1537[Class15.aClass35_195.aBool473 ? 1 : 0].method2972(Class3.anInt42 * -468945023 + 765 - 40, 463);
			if (GameClient.anInt2868 * -684224463 > 5 && GameClient.anInt2865 * 1017874057 == 0) {
				if (Class73.aClass109_Sub23_Sub14_Sub1_886 != null) {
					var18 = Class3.anInt42 * -468945023 + 5;
					var19 = 463;
					byte var29 = 100;
					byte var22 = 35;
					Class73.aClass109_Sub23_Sub14_Sub1_886.method2972(var18, var19);
					var0.method3381(Class90.aString1221 + " " + GameClient.anInt2872 * 1425499025, var18 + var29 / 2, var19 + var22 / 2 - 2, 16777215, 0);
					if (Class48.aClass44_673 != null) {
						var1.method3381(Class90.aString1183, var18 + var29 / 2, 12 + var22 / 2 + var19, 16777215, 0);
					} else {
						var1.method3381(Class90.aString1329, var29 / 2 + var18, 12 + var22 / 2 + var19, 16777215, 0);
					}
				} else {
					Class73.aClass109_Sub23_Sub14_Sub1_886 = Class19.method342(Class18.aClass94_Sub1_217, "sl_button", "", (byte) 96);
				}
			}

			try {
				Graphics var34 = Class60.aCanvas771.getGraphics();
				Class72.aClass7_871.method160(var34, 0, 0, 577474655);
			} catch (Exception var16) {
				Class60.aCanvas771.repaint();
			}

		}
	}

}
