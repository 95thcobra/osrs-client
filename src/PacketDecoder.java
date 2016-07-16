import java.awt.Desktop;
import java.awt.datatransfer.Clipboard;
import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PacketDecoder {

	static Clipboard aClipboard339;
	static int[] anIntArray341;
	static int param6;
	static Map aMap335 = new HashMap();
	static Class122 aClass122_336 = new Class122(1024);
	static Class125 aClass125_337 = new Class125();
	static int anInt344 = 0;
	public static int tick;

	PacketDecoder() throws Throwable {
		throw new Error();
	}

	public static ItemDef getItemDef(int itemId) {
		ItemDef itemdef = (ItemDef) ItemDef.cache.get(itemId);
		if (itemdef != null) {
			return itemdef;
		} else {
			byte[] data = ItemDef.configIndex2.getFileData(10, itemId);
			itemdef = new ItemDef();
			itemdef.id = itemId * -1222204029;
			if (data != null) {
				itemdef.decode(new DataBuffer(data));
			}

			itemdef.method2291((byte) 22);
			if (itemdef.anInt2151 * -993125921 != -1) {
				itemdef.method2250(getItemDef(itemdef.anInt2151 * -993125921), getItemDef(itemdef.anInt2120 * -1776131735), -542859962);
			}

			if (itemdef.anInt2150 * -1715175993 != -1) {
				itemdef.method2251(getItemDef(itemdef.anInt2150 * -1715175993), getItemDef(itemdef.anInt2159 * -210825537), 1564903593);
			}

			if (!Class136.aBool1607 && itemdef.members) {
				itemdef.name = Class90.aString1087;
				itemdef.grandexchange = false;
				itemdef.options = null;
				itemdef.ioptions = null;
				itemdef.anInt2157 = 0;
			}

			ItemDef.cache.put(itemdef, itemId);
			return itemdef;
		}
	}

	static void setContainerItem(int id, int slot, int item, int amount) {
		ItemContainer itemContainer = (ItemContainer) ItemContainer.activeContainers.get(id);
		if (itemContainer == null) {
			itemContainer = new ItemContainer();
			ItemContainer.activeContainers.put(itemContainer, id);
		}

		if (itemContainer.itemIds.length <= slot) {
			int[] ids = new int[slot + 1];
			int[] amounts = new int[slot + 1];

			for (int idx = 0; idx < itemContainer.itemIds.length; idx++) {
				ids[idx] = itemContainer.itemIds[idx];
				amounts[idx] = itemContainer.itemAmounts[idx];
			}

			for (int idx = itemContainer.itemIds.length; idx < slot; idx++) {
				ids[idx] = -1;
				amounts[idx] = 0;
			}

			itemContainer.itemIds = ids;
			itemContainer.itemAmounts = amounts;
		}

		itemContainer.itemIds[slot] = item;
		itemContainer.itemAmounts[slot] = amount;
	}

	public static void method388(IndexDescriptor var0, IndexDescriptor var1, IndexDescriptor var2, IndexDescriptor var3, int var4) {
		InterfaceDef.aIndexDescriptor_1929 = var0;
		InterfaceDef.aIndexDescriptor_2023 = var1;
		InterfaceDef.aIndexDescriptor_1931 = var2;
		InterfaceDef.aIndexDescriptor_1932 = var3;
		InterfaceDef.aInterfaceDefArrayArray1975 = new InterfaceDef[InterfaceDef.aIndexDescriptor_1929.method1160((byte) -63)][];
		InterfaceDef.aBoolArray1928 = new boolean[InterfaceDef.aIndexDescriptor_1929.method1160((byte) -120)];
	}

	static final boolean method389(int var0) {
		if (Class98.loginConnection == null) {
			return false;
		} else {
			String var2;
			int var3;
			try {
				int var1 = Class98.loginConnection.available();
				if (var1 == 0) {
					return false;
				}

				if (GameClient.incomingMessage * -2146869835 == -1) {
					Class98.loginConnection.read(GameClient.gameBuffer.data, 0, 1);
					GameClient.gameBuffer.pos = 0;
					GameClient.incomingMessage = GameClient.gameBuffer.readOpcode() * 426797213;
					GameClient.messageSize = Class101.anIntArray1437[GameClient.incomingMessage * -2146869835] * 20645833;
					--var1;
				}

				if (GameClient.messageSize * 1964753529 == -1) {
					if (var1 <= 0) {
						return false;
					}

					Class98.loginConnection.read(GameClient.gameBuffer.data, 0, 1);
					GameClient.messageSize = (GameClient.gameBuffer.data[0] & 255) * 20645833;
					--var1;
				}

				if (GameClient.messageSize * 1964753529 == -2) {
					if (var1 <= 1) {
						return false;
					}

					Class98.loginConnection.read(GameClient.gameBuffer.data, 0, 2);
					GameClient.gameBuffer.pos = 0;
					GameClient.messageSize = GameClient.gameBuffer.readUShort() * 20645833;
					var1 -= 2;
				}

				if (var1 < GameClient.messageSize * 1964753529) {
					return false;
				}

				GameClient.gameBuffer.pos = 0;
				Class98.loginConnection.read(GameClient.gameBuffer.data, 0, GameClient.messageSize * 1964753529);
				GameClient.anInt2910 = 0;
				GameClient.anInt2916 = GameClient.anInt2913 * -1789153887;
				GameClient.anInt2913 = GameClient.anInt2912 * 956357557;
				GameClient.anInt2912 = GameClient.incomingMessage * -1381983527;
				int var41;
				int var43;
				LinkedEntry_Sub13 var58;

				int op = GameClient.incomingMessage * -2146869835;
				if (op != 79 && op != 153 /* && op != 234 */ && op != 154 && op != 193 && op != 47 && op != 190 && op != 78) {
					if (Loader.DEBUG)
						System.out.printf("Incoming message: %d, size %d%n", op, GameClient.messageSize * 1964753529);
				}
				if (GameClient.incomingMessage * -2146869835 == 193) {
					int id = GameClient.gameBuffer.readUShortLEA();
					int walk = GameClient.gameBuffer.readUByteS();
					int target = GameClient.gameBuffer.readIntLE();
					if (Loader.DEBUG)
						System.err.printf("Interface: targ=[%d:%d] id=%d walk=%d%n", target >> 16, target & 0xFFFF, id, walk);

					var58 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.get(target);
					if (var58 != null) {
						CacheableEntry_Sub23_Sub6.method2374(var58, id != var58.anInt1819 * -1385416029, 1345746199);
					}

					Class7.method179(target, id, walk, 53195343);
					GameClient.incomingMessage = -426797213;
					return true;
				}

				int var7;
				int var51;
				int var53;
				if (GameClient.incomingMessage * -2146869835 == 239) {
					var41 = GameClient.gameBuffer.readULEShort();
					var3 = GameClient.gameBuffer.readIntV1();
					var43 = var41 >> 10 & 31;
					var51 = var41 >> 5 & 31;
					var53 = var41 & 31;
					var7 = (var43 << 19) + (var51 << 11) + (var53 << 3);
					InterfaceDef var79 = Class50.method713(var3, (byte) 40);
					if (var7 != var79.anInt2045 * 1480230763) {
						var79.anInt2045 = var7 * -963482301;
						Class35.method484(var79, 14387856);
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 160 || GameClient.incomingMessage * -2146869835 == 113 || GameClient.incomingMessage * -2146869835 == 245 || GameClient.incomingMessage * -2146869835 == 197 || GameClient.incomingMessage * -2146869835 == 101
						|| GameClient.incomingMessage * -2146869835 == 244 || GameClient.incomingMessage * -2146869835 == 145 || GameClient.incomingMessage * -2146869835 == 95 || GameClient.incomingMessage * -2146869835 == 186 || GameClient.incomingMessage * -2146869835 == 63) {
					Class4.method132(-2117993455);
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 225) {
					Class2.method101(true);
					GameClient.incomingMessage = -426797213;
					return true;
				}

				long var9;
				long var11;
				long var13;
				long var16;
				boolean var85;
				if (GameClient.incomingMessage * -2146869835 == 104) { // Send clan chat message		
					String sender = GameClient.gameBuffer.readString();
					long chatname = GameClient.gameBuffer.readLong();
					long world = GameClient.gameBuffer.readUShort();
					long uid = GameClient.gameBuffer.readTriByte();
					Class75 var86 = (Class75) CacheableEntry_Sub23_Sub7.method2390(InterfaceDef.method2176((byte) -22), GameClient.gameBuffer.readUByte(), 1897298915);
					long msgid = (world << 32) + uid;
					var85 = false;

					for (int var91 = 0; var91 < 100; var91++) {
						if (msgid == GameClient.aLongArray2871[var91]) {
							var85 = true;
							break;
						}
					}

					if (var86.aBool911 && Class19.method344(sender, 583521055)) {
						var85 = true;
					}

					if (!var85 && GameClient.anInt2982 * -246740433 == 0) {
						GameClient.aLongArray2871[GameClient.anInt3089 * 1965929751] = msgid;
						GameClient.anInt3089 = (GameClient.anInt3089 * 1965929751 + 1) % 100 * -1112616281;
						PacketBuffer buffer = GameClient.gameBuffer;

						String message;
						try {
							int size = buffer.readCompact();
							if (size > 32767) {
								size = 32767;
							}

							byte[] var94 = new byte[size];
							buffer.pos += Class137.aClass60_1610.method812(buffer.data, buffer.pos * 1736753585, var94, 0, size, 1536079938) * 1303963473;
							String msg = Class66.method893(var94, 0, size, 1967361289);
							message = msg;
						} catch (Exception ex) {
							message = "Cabbage";
						}

						message = CacheableEntry_Sub23_Sub14_Sub4.method3315(Class38.method498(message, 2118678300));
						if (var86.anInt914 * 1684664313 != -1) {
							IsaacCipher.method822(9, Class96.method1232(var86.anInt914 * 1684664313, -265103478) + sender, message, Class7.method176(chatname), -629065166);
						} else {
							IsaacCipher.method822(9, sender, message, Class7.method176(chatname), 1298747405);
						}
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				InterfaceDef var4;
				if (GameClient.incomingMessage * -2146869835 == 252) { // Update
																		// items
					var41 = GameClient.gameBuffer.readInt();
					var3 = GameClient.gameBuffer.readUShort();
					if (var41 < -70000) {
						var3 += 32768;
					}

					if (var41 >= 0) {
						var4 = Class50.method713(var41, (byte) 111);
					} else {
						var4 = null;
					}

					for (; GameClient.gameBuffer.pos * 1736753585 < GameClient.messageSize * 1964753529; setContainerItem(var3, var51, var53 - 1, var7)) {
						var51 = GameClient.gameBuffer.readCompact();
						var53 = GameClient.gameBuffer.readUShort();
						var7 = 0;
						if (var53 != 0) {
							var7 = GameClient.gameBuffer.readUByte();
							if (var7 == 255) {
								var7 = GameClient.gameBuffer.readInt();
							}
						}

						if (var4 != null && var51 >= 0 && var51 < var4.itemIds.length) {
							var4.itemIds[var51] = var53;
							var4.itemAmounts[var51] = var7;
						}
					}

					if (var4 != null) {
						Class35.method484(var4, 136185866);
					}

					ScriptInvocation.method1835();
					GameClient.itemContainerTriggers[(GameClient.itemContainerTriggerptr += 1158399665) * -84622767 - 1 & 31] = var3 & 32767;
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 5) {
					var41 = GameClient.gameBuffer.readIntLE();
					Class141.aAsyncJob_1640 = Class50.aClass73_693.method970(var41, 1580628845);
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 234) { // npcs
					NpcFlags.decodeNpcSync(false);
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 188) {
					GameClient.gameBuffer.pos -= 2143728420;
					if (GameClient.gameBuffer.method2086()) {
						PacketBuffer var99 = GameClient.gameBuffer;
						var3 = GameClient.gameBuffer.pos * 1736753585 - 28;
						if (Class83.aClass139_989 != null) {
							try {
								Class83.aClass139_989.method1659(0L);
								Class83.aClass139_989.method1683(var99.data, var3, 24, 1744727329);
							} catch (Exception var37) {
								;
							}
						}
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 58) {
					GameClient.anInt2898 = -1812119817;
					GameClient.anInt2990 = GameClient.anInt3050 * 1609802529;
					GameClient.incomingMessage = -426797213;
					return true;
				}

				int var8;
				if (GameClient.incomingMessage * -2146869835 == 235) { // set items
					int target = GameClient.gameBuffer.readInt();
					int key = GameClient.gameBuffer.readUShort();
					if (target < -70000) {
						key += 32768;
					}

					if (target >= 0) {
						var4 = Class50.method713(target, (byte) 31);
					} else {
						var4 = null;
					}

					if (var4 != null) {
						for (var51 = 0; var51 < var4.itemIds.length; var51++) {
							var4.itemIds[var51] = 0;
							var4.itemAmounts[var51] = 0;
						}
					}

					ItemContainer itemContainer = (ItemContainer) ItemContainer.activeContainers.get(key);
					if (itemContainer != null) {
						for (int slot = 0; slot < itemContainer.itemIds.length; slot++) {
							itemContainer.itemIds[slot] = -1;
							itemContainer.itemAmounts[slot] = 0;
						}
					}

					int size = GameClient.gameBuffer.readUShort();

					for (int idx = 0; idx < size; idx++) {
						int id = GameClient.gameBuffer.readUShort();
						int amount = GameClient.gameBuffer.readUByte();
						if (amount == 255) {
							amount = GameClient.gameBuffer.readIntLE();
						}

						if (var4 != null && idx < var4.itemIds.length) {
							var4.itemIds[idx] = id;
							var4.itemAmounts[idx] = amount;
						}

						setContainerItem(key, idx, id - 1, amount);
					}

					if (var4 != null) {
						Class35.method484(var4, -1976825491);
					}

					ScriptInvocation.method1835();
					GameClient.itemContainerTriggers[(GameClient.itemContainerTriggerptr += 1158399665) * -84622767 - 1 & 31] = key & 32767;
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 248) {
					int id = GameClient.gameBuffer.readUShort();
					int volume = GameClient.gameBuffer.readUByte();
					int always1 = GameClient.gameBuffer.readUShort();
					Class117.method1481(id, volume, always1, (byte) -85);
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 67) {
					for (var41 = 0; var41 < GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983.length; var41++) {
						if (GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var41] != null) {
							GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var41].anInt2536 = -1940983775;
						}
					}

					for (var41 = 0; var41 < GameClient.sceneNpcs.length; var41++) {
						if (GameClient.sceneNpcs[var41] != null) {
							GameClient.sceneNpcs[var41].anInt2536 = -1940983775;
						}
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				int var15;
				long var27;
				int var32;
				String var48;
				boolean var84;
				if (GameClient.incomingMessage * -2146869835 == 38) {
					GameClient.anInt3014 = GameClient.anInt3050 * 1312885291;
					if (GameClient.messageSize * 1964753529 == 0) {
						GameClient.aString3090 = null;
						GameClient.aString2921 = null;
						Class41.anInt585 = 0;
						Class54.aClass109_Sub8Array728 = null;
						GameClient.incomingMessage = -426797213;
						return true;
					}

					GameClient.aString2921 = GameClient.gameBuffer.readString();
					long var25 = GameClient.gameBuffer.readLong();
					var11 = var25;
					if (var25 > 0L && var25 < 6582952005840035281L) {
						if (var25 % 37L == 0L) {
							var48 = null;
						} else {
							var7 = 0;

							for (var27 = var25; var27 != 0L; var27 /= 37L) {
								++var7;
							}

							StringBuilder var103 = new StringBuilder(var7);

							while (var11 != 0L) {
								long var30 = var11;
								var11 /= 37L;
								var103.append(Class76.aCharArray923[(int) (var30 - 37L * var11)]);
							}

							var48 = var103.reverse().toString();
						}
					} else {
						var48 = null;
					}

					GameClient.aString3090 = var48;
					LinkedEntry_Sub16.aByte1888 = GameClient.gameBuffer.readByte();
					var7 = GameClient.gameBuffer.readUByte();
					if (var7 == 255) {
						GameClient.incomingMessage = -426797213;
						return true;
					}

					Class41.anInt585 = var7 * 1168379141;
					LinkedEntry_Sub8[] var77 = new LinkedEntry_Sub8[100];

					for (var15 = 0; var15 < Class41.anInt585 * -1787316275; var15++) {
						var77[var15] = new LinkedEntry_Sub8();
						var77[var15].aString1757 = GameClient.gameBuffer.readString();
						var77[var15].aString1759 = Class38.method497(var77[var15].aString1757, GameClient.aClass119_2919, -2051437637);
						var77[var15].anInt1753 = GameClient.gameBuffer.readUShort() * -1785505117;
						var77[var15].aByte1756 = GameClient.gameBuffer.readByte();
						GameClient.gameBuffer.readString();
						if (var77[var15].aString1757.equals(Player.me.aString2835)) {
							ItemContainer.aByte1793 = var77[var15].aByte1756;
						}
					}

					var84 = false;
					var32 = Class41.anInt585 * -1787316275;

					while (var32 > 0) {
						var84 = true;
						--var32;

						for (int var87 = 0; var87 < var32; var87++) {
							if (var77[var87].aString1759.compareTo(var77[1 + var87].aString1759) > 0) {
								LinkedEntry_Sub8 var104 = var77[var87];
								var77[var87] = var77[var87 + 1];
								var77[var87 + 1] = var104;
								var84 = false;
							}
						}

						if (var84) {
							break;
						}
					}

					Class54.aClass109_Sub8Array728 = var77;
					GameClient.incomingMessage = -426797213;
					return true;
				}

				boolean var60;
				if (GameClient.incomingMessage * -2146869835 == 120) {
					var41 = GameClient.gameBuffer.readInt();
					var60 = GameClient.gameBuffer.readUByteN() == 1;
					var4 = Class50.method713(var41, (byte) -76);
					if (var4.aBool1982 != var60) {
						var4.aBool1982 = var60;
						Class35.method484(var4, -1275264682);
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 49) {
					var41 = GameClient.gameBuffer.readUByte();
					var3 = GameClient.gameBuffer.readUByte();
					var43 = GameClient.gameBuffer.readUByte();
					var51 = GameClient.gameBuffer.readUByte();
					GameClient.aBoolArray3116[var41] = true;
					GameClient.anIntArray3117[var41] = var3;
					GameClient.anIntArray3118[var41] = var43;
					GameClient.anIntArray3119[var41] = var51;
					GameClient.anIntArray3120[var41] = 0;
					GameClient.incomingMessage = -426797213;
					return true;
				}

				InterfaceDef var72;
				if (GameClient.incomingMessage * -2146869835 == 33) {
					var41 = GameClient.gameBuffer.readInt();
					var72 = Class50.method713(var41, (byte) 120);

					for (var43 = 0; var43 < var72.itemIds.length; var43++) {
						var72.itemIds[var43] = -1;
						var72.itemIds[var43] = 0;
					}

					Class35.method484(var72, -1341725814);
					GameClient.incomingMessage = -426797213;
					return true;
				}

				String var54;
				byte[] var62;
				if (GameClient.incomingMessage * -2146869835 == 60) {
					var2 = GameClient.gameBuffer.readString();
					PacketBuffer var83 = GameClient.gameBuffer;

					try {
						var53 = var83.readCompact();
						if (var53 > 32767) {
							var53 = 32767;
						}

						var62 = new byte[var53];
						var83.pos += Class137.aClass60_1610.method812(var83.data, var83.pos * 1736753585, var62, 0, var53, -2061204776) * 1303963473;
						String var76 = Class66.method893(var62, 0, var53, 1643959059);
						var54 = var76;
					} catch (Exception var36) {
						var54 = "Cabbage";
					}

					var54 = CacheableEntry_Sub23_Sub14_Sub4.method3315(Class38.method498(var54, 1634974047));
					Class93.sendMessage(6, var2, var54);
					GameClient.incomingMessage = -426797213;
					return true;
				}

				boolean var46;
				if (GameClient.incomingMessage * -2146869835 == 78) {
					int type = GameClient.gameBuffer.readCompact();
					var60 = GameClient.gameBuffer.readUByte() == 1;
					var48 = "";
					var46 = false;
					if (var60) {
						var48 = GameClient.gameBuffer.readString();
						if (Class19.method344(var48, -1644200240)) {
							var46 = true;
						}
					}

					String var81 = GameClient.gameBuffer.readString();
					if (!var46) {
						Class93.sendMessage(type, var48, var81);
					}

					if (type == 29) { // Npc examine
						ExamineDumper.onresp(var81);
					}
					if (Loader.DEBUG)
						System.out.printf("Gamemsg: type=%d, str1=\"%s\" str2=\"%s\"%n", type, var48, var81);

					GameClient.incomingMessage = -426797213;
					return true;
				}

				String var52;
				boolean var65;
				boolean var75;
				int var101;
				if (GameClient.incomingMessage * -2146869835 == 195) {
					while (GameClient.gameBuffer.pos * 1736753585 < GameClient.messageSize * 1964753529) {
						var75 = GameClient.gameBuffer.readUByte() == 1;
						var52 = GameClient.gameBuffer.readString();
						var48 = GameClient.gameBuffer.readString();
						var51 = GameClient.gameBuffer.readUShort();
						var53 = GameClient.gameBuffer.readUByte();
						var7 = GameClient.gameBuffer.readUByte();
						var65 = (var7 & 2) != 0;
						var84 = (var7 & 1) != 0;
						if (var51 > 0) {
							GameClient.gameBuffer.readString();
							GameClient.gameBuffer.readUByte();
							GameClient.gameBuffer.readInt();
						}

						GameClient.gameBuffer.readString();

						for (var101 = 0; var101 < GameClient.anInt2984 * 389772333; var101++) {
							Class46 var106 = GameClient.aClass46Array3136[var101];
							if (!var75) {
								if (var52.equals(var106.aString658)) {
									if (var106.anInt648 * -261257351 != var51) {
										var85 = true;

										for (Class126_Sub1 var89 = (Class126_Sub1) GameClient.aClass115_2892.method1452(); var89 != null; var89 = (Class126_Sub1) GameClient.aClass115_2892.method1456()) {
											if (var89.aString1644.equals(var52)) {
												if (var51 != 0 && var89.aShort1645 == 0) {
													var89.method1564();
													var85 = false;
												} else if (var51 == 0 && var89.aShort1645 != 0) {
													var89.method1564();
													var85 = false;
												}
											}
										}

										if (var85) {
											GameClient.aClass115_2892.method1451(new Class126_Sub1(var52, var51));
										}

										var106.anInt648 = var51 * -802999607;
									}

									var106.aString647 = var48;
									var106.anInt649 = var53 * -764597223;
									var106.aBool645 = var65;
									var106.aBool650 = var84;
									var52 = null;
									break;
								}
							} else if (var48.equals(var106.aString658)) {
								var106.aString658 = var52;
								var106.aString647 = var48;
								var52 = null;
								break;
							}
						}

						if (var52 != null && GameClient.anInt2984 * 389772333 < 400) {
							Class46 var102 = new Class46();
							GameClient.aClass46Array3136[GameClient.anInt2984 * 389772333] = var102;
							var102.aString658 = var52;
							var102.aString647 = var48;
							var102.anInt648 = var51 * -802999607;
							var102.anInt649 = var53 * -764597223;
							var102.aBool645 = var65;
							var102.aBool650 = var84;
							GameClient.anInt2984 += 681507749;
						}
					}

					GameClient.anInt2898 = 670727662;
					GameClient.anInt2990 = GameClient.anInt3050 * 1609802529;
					var75 = false;
					var3 = GameClient.anInt2984 * 389772333;

					while (var3 > 0) {
						var75 = true;
						--var3;

						for (var43 = 0; var43 < var3; var43++) {
							var46 = false;
							Class46 var80 = GameClient.aClass46Array3136[var43];
							Class46 var71 = GameClient.aClass46Array3136[var43 + 1];
							if (GameClient.anInt2872 * 1425499025 != var80.anInt648 * -261257351 && GameClient.anInt2872 * 1425499025 == var71.anInt648 * -261257351) {
								var46 = true;
							}

							if (!var46 && var80.anInt648 * -261257351 == 0 && var71.anInt648 * -261257351 != 0) {
								var46 = true;
							}

							if (!var46 && !var80.aBool645 && var71.aBool645) {
								var46 = true;
							}

							if (!var46 && !var80.aBool650 && var71.aBool650) {
								var46 = true;
							}

							if (var46) {
								Class46 var74 = GameClient.aClass46Array3136[var43];
								GameClient.aClass46Array3136[var43] = GameClient.aClass46Array3136[var43 + 1];
								GameClient.aClass46Array3136[1 + var43] = var74;
								var75 = false;
							}
						}

						if (var75) {
							break;
						}
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 167) { // update skill
					ScriptInvocation.method1835();
					int level = GameClient.gameBuffer.readUByteS();
					int xp = GameClient.gameBuffer.readIntV2();
					int skill = GameClient.gameBuffer.readUByteA();
					GameClient.anIntArray3004[skill] = xp;
					GameClient.anIntArray3002[skill] = level;
					GameClient.anIntArray3003[skill] = 1;

					for (int x = 0; x < 98; x++) {
						if (xp >= Class78.skillXps[x]) {
							GameClient.anIntArray3003[skill] = 2 + x;
						}
					}

					GameClient.skillIncreaseTriggers[(GameClient.skillTriggerPtr -= 1644873877) * -44417725 - 1 & 31] = skill;
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 133) { // Player
																		// option
					int top = GameClient.gameBuffer.readUByteS();
					int slot = GameClient.gameBuffer.readUByteN();
					String option = GameClient.gameBuffer.readString();
					if (slot >= 1 && slot <= 8) {
						if (option.equalsIgnoreCase("null")) {
							option = null;
						}

						GameClient.aStringArray2994[slot - 1] = option;
						GameClient.aBoolArray3008[slot - 1] = top == 0;
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 14) {
					int inter = GameClient.gameBuffer.readIntV2();
					int anim = GameClient.gameBuffer.readShort();
					var4 = Class50.method713(inter, (byte) -3);
					if (anim != var4.anInt1959 * -335970573 || anim == -1) {
						var4.anInt1959 = anim * 1616693819;
						var4.anInt2059 = 0;
						var4.anInt2010 = 0;
						Class35.method484(var4, -595934627);
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 105) {
					int inter = GameClient.gameBuffer.readIntV2();
					int npcid = GameClient.gameBuffer.readUShortLEA();
					var4 = Class50.method713(inter, (byte) 76);
					if (var4.anInt1980 * 1661118609 != 2 || npcid != var4.anInt1981 * -982469919) {
						var4.anInt1980 = -1119080222;
						var4.anInt1981 = npcid * 999821601;
						Class35.method484(var4, 43305670);
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 61) {
					ScriptInvocation.method1835();
					GameClient.anInt3031 = GameClient.gameBuffer.readShort() * 1914240165;
					GameClient.anInt3062 = GameClient.anInt3050 * 108236717;
					GameClient.incomingMessage = -426797213;
					return true;
				}

				InterfaceDef var56;
				if (GameClient.incomingMessage * -2146869835 == 37) {
					var41 = GameClient.gameBuffer.readIntV1();
					var3 = GameClient.gameBuffer.readULEShort();
					var43 = GameClient.gameBuffer.readUShortLEA();
					var51 = GameClient.gameBuffer.readUShortLEA();

					System.err.println(var41 + "," + var3 + "," + var43 + "," + var51);

					var56 = Class50.method713(var41, (byte) -13);

					if (var3 != var56.anInt1988 * -1788131197 || var43 != var56.anInt1989 * 1096480275 || var56.anInt1991 * -1256377801 != var51) {
						var56.anInt1988 = var3 * 193807915;
						var56.anInt1989 = var43 * 1932084251;
						var56.anInt1991 = var51 * 866853767;
						Class35.method484(var56, -1558032961);
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 159) {
					int to = GameClient.gameBuffer.readULEShort();
					if (to == 65535) {
						to = -1;
					}

					int target = GameClient.gameBuffer.readIntV1();
					int setting = GameClient.gameBuffer.readIntLE();
					int from = GameClient.gameBuffer.readUShort();
					if (from == 65535) {
						from = -1;
					}

					for (int slot = from; slot <= to; slot++) {
						long key = slot + ((long) target << 32);
						LinkedEntry active = GameClient.interfaceSettings.get(key);
						if (active != null) {
							active.unlink();
						}

						GameClient.interfaceSettings.put(new InterfaceSetting(setting), key);
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 230) { // Hint
																		// arrow
					GameClient.anInt3113 = GameClient.gameBuffer.readUByte() * 1260862725;
					if (GameClient.anInt3113 * 1066731469 == 1) {
						GameClient.anInt2879 = GameClient.gameBuffer.readUShort() * -377558041;
					}

					if (GameClient.anInt3113 * 1066731469 >= 2 && GameClient.anInt3113 * 1066731469 <= 6) {
						if (GameClient.anInt3113 * 1066731469 == 2) {
							GameClient.anInt2884 = -1570029248;
							GameClient.anInt2885 = -1777288512;
						}

						if (GameClient.anInt3113 * 1066731469 == 3) {
							GameClient.anInt2884 = 0;
							GameClient.anInt2885 = -1777288512;
						}

						if (GameClient.anInt3113 * 1066731469 == 4) {
							GameClient.anInt2884 = 1154908800;
							GameClient.anInt2885 = -1777288512;
						}

						if (GameClient.anInt3113 * 1066731469 == 5) {
							GameClient.anInt2884 = -1570029248;
							GameClient.anInt2885 = 0;
						}

						if (GameClient.anInt3113 * 1066731469 == 6) {
							GameClient.anInt2884 = -1570029248;
							GameClient.anInt2885 = 740390272;
						}

						GameClient.anInt3113 = -1773241846;
						GameClient.anInt2899 = GameClient.gameBuffer.readUShort() * -1482462703;
						GameClient.anInt3139 = GameClient.gameBuffer.readUShort() * 2099856463;
						GameClient.anInt2883 = GameClient.gameBuffer.readUByte() * 1818408695;
					}

					if (GameClient.anInt3113 * 1066731469 == 10) {
						GameClient.anInt3026 = GameClient.gameBuffer.readUShort() * 1031675027;
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				InterfaceDef var5;
				if (GameClient.incomingMessage * -2146869835 == 51) {
					var41 = GameClient.gameBuffer.readInt();
					var3 = GameClient.gameBuffer.readUShortA();
					if (var3 == 65535) {
						var3 = -1;
					}

					var43 = GameClient.gameBuffer.readIntLE();

					var5 = Class50.method713(var41, (byte) 16);
					ItemDef var78;
					if (!var5.cs2Inter) {
						if (var3 == -1) {
							var5.anInt1980 = 0;
							GameClient.incomingMessage = -426797213;
							return true;
						}

						var78 = getItemDef(var3);
						var5.anInt1980 = 2056806852;
						var5.anInt1981 = var3 * 999821601;
						var5.anInt1988 = var78.xan2d * -2103748037;
						var5.anInt1989 = var78.yan2d * -2128308079;
						var5.anInt1991 = var78.zoom2d * -1569860500 / var43 * 866853767;
						Class35.method484(var5, -1042169834);
					} else {
						var5.anInt2057 = var3 * 801052415;
						var5.anInt2058 = var43 * -117852123;
						var78 = getItemDef(var3);
						var5.anInt1988 = var78.xan2d * -2103748037;
						var5.anInt1989 = var78.yan2d * -2128308079;
						var5.anInt1990 = var78.anInt2114 * -1263339933;
						var5.anInt1986 = var78.xof2d * 615584475;
						var5.anInt1987 = var78.yof2d * -798173031;
						var5.anInt1991 = var78.zoom2d * 690567109;
						if (var78.stackable * 833352093 == 1) {
							var5.anInt1995 = 1465661813;
						} else {
							var5.anInt1995 = -1363643670;
						}

						if (var5.anInt1992 * -726159965 > 0) {
							var5.anInt1991 = var5.anInt1991 * -1549383968 / (var5.anInt1992 * -726159965) * 866853767;
						} else if (var5.anInt1950 * -769280817 > 0) {
							var5.anInt1991 = var5.anInt1991 * -1549383968 / (var5.anInt1950 * -769280817) * 866853767;
						}

						Class35.method484(var5, -754853423);
					}
					System.err.println(var41 + ", " + var3 + ", " + var43);

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 16) {
					Class2.method101(false);
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 153) {
					MorePacketEncode.mapPacketBaseX = GameClient.gameBuffer.readUByteN() * 1231171733;
					ObjectDef.mapPacketBaseZ = GameClient.gameBuffer.readUByteN() * -559168027;

					while (GameClient.gameBuffer.pos * 1736753585 < GameClient.messageSize * 1964753529) {
						GameClient.incomingMessage = GameClient.gameBuffer.readUByte() * 426797213;
						Class4.method132(-337007894);
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 117) {
					var41 = GameClient.messageSize * 1964753529 + GameClient.gameBuffer.pos * 1736753585;
					int rootId = GameClient.gameBuffer.readUShort();
					int numSubinterfaces = GameClient.gameBuffer.readUShort();
					if (Loader.DEBUG)
						System.out.printf("The things %d and %d%n", rootId, numSubinterfaces);
					if (GameClient.activeRoot * 1787246131 != rootId) {
						GameClient.activeRoot = rootId * -1855539973;
						CacheableEntry_Sub23_Sub16_Sub7.method3298(false, (byte) -57);
						CacheableEntry_Sub23_Sub10.method2487(GameClient.activeRoot * 1787246131, 2005546330);
						Class85.method1092(GameClient.activeRoot * 1787246131, -375953389);

						for (var51 = 0; var51 < 100; var51++) {
							GameClient.aBoolArray3072[var51] = true;
						}
					}

					LinkedEntry_Sub13 var67;
					for (; numSubinterfaces-- > 0; var67.aBool1821 = true) {
						int targ = GameClient.gameBuffer.readInt();
						int id = GameClient.gameBuffer.readUShort();
						int walk = GameClient.gameBuffer.readUByte();
						if (Loader.DEBUG)
							System.out.printf("Tiny inter? [%d, %d], %d, %d%n", targ >> 16, targ & 0xFFFF, id, walk);
						var67 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.get(targ);
						if (var67 != null && id != var67.anInt1819 * -1385416029) {
							CacheableEntry_Sub23_Sub6.method2374(var67, true, 1345746199);
							var67 = null;
						}

						if (var67 == null) {
							var67 = Class7.method179(targ, id, walk, 53195343);
						}
					}

					for (var58 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.method1537(); var58 != null; var58 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.method1543()) {
						if (var58.aBool1821) {
							var58.aBool1821 = false;
						} else {
							CacheableEntry_Sub23_Sub6.method2374(var58, true, 1345746199);
						}
					}

					GameClient.interfaceSettings = new JagexMap(512);

					while (GameClient.gameBuffer.pos * 1736753585 < var41) {
						int target = GameClient.gameBuffer.readInt();
						int from = GameClient.gameBuffer.readUShort();
						int to = GameClient.gameBuffer.readUShort();
						int value = GameClient.gameBuffer.readInt();
						if (Loader.DEBUG)
							System.out.printf("Unlocks: %d %d %d %d%n", target, from, to, value);

						for (var15 = from; var15 <= to; var15++) {
							var16 = ((long) target << 32) + var15;
							GameClient.interfaceSettings.put(new InterfaceSetting(value), var16);
						}
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				Class75 var55;
				if (GameClient.incomingMessage * -2146869835 == 79) {
					tick++;
					GameClient.numNpcsPendingRemoval = 0;
					GameClient.npcUpdatePointer = 0;
					GameClient.gameBuffer.startBitMode();
					var41 = GameClient.gameBuffer.readbits(1);
					if (var41 != 0) {
						var3 = GameClient.gameBuffer.readbits(2);
						if (var3 == 0) {
							GameClient.npcIndicesNeedingUpdating[(GameClient.npcUpdatePointer -= 302765877) * -435618589 - 1] = 2047;
						} else if (var3 == 1) {
							var43 = GameClient.gameBuffer.readbits(3);
							Player.me.moveInDirection(var43, false);
							var51 = GameClient.gameBuffer.readbits(1);
							if (var51 == 1) {
								GameClient.npcIndicesNeedingUpdating[(GameClient.npcUpdatePointer -= 302765877) * -435618589 - 1] = 2047;
							}
						} else if (var3 == 2) {
							var43 = GameClient.gameBuffer.readbits(3);
							Player.me.moveInDirection(var43, true);
							var51 = GameClient.gameBuffer.readbits(3);
							Player.me.moveInDirection(var51, true);
							var53 = GameClient.gameBuffer.readbits(1);
							if (var53 == 1) {
								GameClient.npcIndicesNeedingUpdating[(GameClient.npcUpdatePointer -= 302765877) * -435618589 - 1] = 2047;
							}
						} else if (var3 == 3) {
							var43 = GameClient.gameBuffer.readbits(7);
							var51 = GameClient.gameBuffer.readbits(1);
							var53 = GameClient.gameBuffer.readbits(7);
							var7 = GameClient.gameBuffer.readbits(1);
							if (var7 == 1) {
								GameClient.npcIndicesNeedingUpdating[(GameClient.npcUpdatePointer -= 302765877) * -435618589 - 1] = 2047;
							}

							CacheableEntry_Sub23_Sub16_Sub3.anInt2577 = GameClient.gameBuffer.readbits(2) * 1191917245;
							Player.me.method2942(var53, var43, var51 == 1, (byte) 14);
						}
					}

					var41 = GameClient.gameBuffer.readbits(8);
					if (var41 < GameClient.anInt3091 * -796710281) {
						for (var3 = var41; var3 < GameClient.anInt3091 * -796710281; var3++) {
							GameClient.npcsPendingRemoval[(GameClient.numNpcsPendingRemoval += 880507307) * -807159549 - 1] = GameClient.anIntArray3107[var3];
						}
					}

					if (var41 > GameClient.anInt3091 * -796710281) {
						throw new RuntimeException("");
					}

					GameClient.anInt3091 = 0;

					for (var3 = 0; var3 < var41; var3++) {
						var43 = GameClient.anIntArray3107[var3];
						Player var63 = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var43];
						var53 = GameClient.gameBuffer.readbits(1);
						if (var53 == 0) {
							GameClient.anIntArray3107[(GameClient.anInt3091 -= 549466297) * -796710281 - 1] = var43;
							var63.lastSync = GameClient.cycle * 489897939;
						} else {
							var7 = GameClient.gameBuffer.readbits(2);
							if (var7 == 0) {
								GameClient.anIntArray3107[(GameClient.anInt3091 -= 549466297) * -796710281 - 1] = var43;
								var63.lastSync = GameClient.cycle * 489897939;
								GameClient.npcIndicesNeedingUpdating[(GameClient.npcUpdatePointer -= 302765877) * -435618589 - 1] = var43;
							} else if (var7 == 1) {
								GameClient.anIntArray3107[(GameClient.anInt3091 -= 549466297) * -796710281 - 1] = var43;
								var63.lastSync = GameClient.cycle * 489897939;
								var8 = GameClient.gameBuffer.readbits(3);
								var63.moveInDirection(var8, false);
								var15 = GameClient.gameBuffer.readbits(1);
								if (var15 == 1) {
									GameClient.npcIndicesNeedingUpdating[(GameClient.npcUpdatePointer -= 302765877) * -435618589 - 1] = var43;
								}
							} else if (var7 == 2) {
								GameClient.anIntArray3107[(GameClient.anInt3091 -= 549466297) * -796710281 - 1] = var43;
								var63.lastSync = GameClient.cycle * 489897939;
								var8 = GameClient.gameBuffer.readbits(3);
								var63.moveInDirection(var8, true);
								var15 = GameClient.gameBuffer.readbits(3);
								var63.moveInDirection(var15, true);
								var101 = GameClient.gameBuffer.readbits(1);
								if (var101 == 1) {
									GameClient.npcIndicesNeedingUpdating[(GameClient.npcUpdatePointer -= 302765877) * -435618589 - 1] = var43;
								}
							} else if (var7 == 3) {
								GameClient.npcsPendingRemoval[(GameClient.numNpcsPendingRemoval += 880507307) * -807159549 - 1] = var43;
							}
						}
					}

					Class30.method411(-1434852589);

					for (var41 = 0; var41 < GameClient.npcUpdatePointer * -435618589; var41++) {
						var3 = GameClient.npcIndicesNeedingUpdating[var41];
						Player player = GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var3];
						int syncval = GameClient.gameBuffer.readUByte();
						if ((syncval & 0x80) != 0) {
							syncval += GameClient.gameBuffer.readUByte() << 8;
						}

						if ((syncval & 0x40) != 0) { // Player hit1
							int value = GameClient.gameBuffer.readUShortLEA();
							int type = GameClient.gameBuffer.readUByteA();
							player.addHit(value, type, GameClient.cycle * 1026470457);
							player.anInt2527 = GameClient.cycle * 1810132455 - 2012164012;
							player.anInt2528 = GameClient.gameBuffer.readUByte() * -1158152579;
							player.anInt2529 = GameClient.gameBuffer.readUByteA() * 1033095941;
						}

						if ((syncval & 0x1) != 0) {
							player.facedEntity = GameClient.gameBuffer.readUShortLEA() * 357265433;
							if (player.facedEntity * 1253370921 == 65535) {
								player.facedEntity = -357265433;
							}
						}

						if ((syncval & 0x100) != 0) { // player graphic
							player.anInt2541 = GameClient.gameBuffer.readUShort() * 1325550547;
							int settings = GameClient.gameBuffer.readIntLE();
							
							player.anInt2545 = (settings >> 16) * 1119651467;
							player.anInt2544 = (GameClient.cycle * 1026470457 + (settings & 65535)) * 433468627;

							player.anInt2542 = 0;
							player.anInt2543 = 0;
							if (player.anInt2544 * -1244118181 > GameClient.cycle * 1026470457) {
								player.anInt2542 = 708692887;
							}

							if (player.anInt2541 * -1444330405 == 65535) {
								
								player.anInt2541 = -1325550547;
							}
						}

						if ((syncval & 2) != 0) { // Player shout
							player.aString2523 = GameClient.gameBuffer.readString();
							if (player.aString2523.charAt(0) == '~') {
								player.aString2523 = player.aString2523.substring(1);
								Class93.sendMessage(2, player.aString2835, player.aString2523);
							} else if (Player.me == player) {
								Class93.sendMessage(2, player.aString2835, player.aString2523);
							}

							player.aBool2518 = false;
							player.anInt2513 = 0;
							player.anInt2522 = 0;
							player.anInt2511 = 2010966242;
						}

						if ((syncval & 8) != 0) {
							var53 = GameClient.gameBuffer.readUByte();
							var62 = new byte[var53];
							DataBuffer var64 = new DataBuffer(var62);
							GameClient.gameBuffer.method1917(var62, 0, var53);
							GameClient.aDataBufferArray2988[var3] = var64;
							player.method3396(var64, 2005613572);
						}

						if ((syncval & 0x400) != 0) {
							int a, b, c, d, e, f, g;
							player.dx1 = (a = GameClient.gameBuffer.readUByteA()) * 1337821425;
							player.anInt2548 = (b = GameClient.gameBuffer.readUByteN()) * -1220278451;
							player.dx2 = (c = GameClient.gameBuffer.readUByteN()) * -843099727;
							player.anInt2549 = (d = GameClient.gameBuffer.readUByteS()) * -753515983;
							player.anInt2540 = ((e = GameClient.gameBuffer.readUShort()) + GameClient.cycle * 1026470457) * -607885345;
							player.anInt2539 = ((f = GameClient.gameBuffer.readUShortLEA()) + GameClient.cycle * 1026470457) * 1210315727;
							player.anInt2552 = (g = GameClient.gameBuffer.readUByteA()) * 884983917;
							if (Loader.DEBUG)
								System.out.printf("Forcemove %d, %d, %d, %d, %d, %d, %d%n", a, b, c, d, e, f, g);
							player.anInt2558 = -519240193;
							player.anInt2563 = 0;
						}

						if ((syncval & 4) != 0) { // Face tile
							player.anInt2531 = GameClient.gameBuffer.readULEShort() * 72414077;
							player.anInt2532 = GameClient.gameBuffer.readULEShort() * 246722269;
						}

						if ((syncval & 32) != 0) {
							int effectset = GameClient.gameBuffer.readUShortLEA();
							Class75 icon = (Class75) CacheableEntry_Sub23_Sub7.method2390(InterfaceDef.method2176((byte) -102), GameClient.gameBuffer.readUByteA(), 1937910734);
							boolean unsure = GameClient.gameBuffer.readUByteN() == 1;
							int bufsize = GameClient.gameBuffer.readUByteN();
							var101 = GameClient.gameBuffer.pos * 1736753585;
							if (player.aString2835 != null && player.aClass108_2815 != null) {
								boolean var105 = false;
								if (icon.aBool911 && Class19.method344(player.aString2835, -799568136)) {
									var105 = true;
								}

								if (!var105 && GameClient.anInt2982 * -246740433 == 0 && !player.aBool2822) {
									GameClient.aDataBuffer_2886.pos = 0;
									GameClient.gameBuffer.readBytes(GameClient.aDataBuffer_2886.data, 0, bufsize);
									GameClient.aDataBuffer_2886.pos = 0;
									DataBuffer var88 = GameClient.aDataBuffer_2886;

									String var96;
									int var98;
									try {
										var98 = var88.readCompact();
										if (var98 > 32767) {
											var98 = 32767;
										}

										byte[] var92 = new byte[var98];
										var88.pos += Class137.aClass60_1610.method812(var88.data, var88.pos * 1736753585, var92, 0, var98, -1359249603) * 1303963473;
										String var22 = Class66.method893(var92, 0, var98, 1622614080);
										var96 = var22;
									} catch (Exception var35) {
										var96 = "Cabbage";
									}

									var96 = CacheableEntry_Sub23_Sub14_Sub4.method3315(Class38.method498(var96, 1332945648));
									player.aString2523 = var96.trim();
									player.anInt2513 = (effectset >> 8) * 1394262111;
									player.anInt2522 = (effectset & 255) * 856626875;
									player.anInt2511 = 2010966242;
									player.aBool2518 = unsure;
									player.aBool2519 = Player.me != player && icon.aBool911 && GameClient.aString3096 != "" && var96.toLowerCase().indexOf(GameClient.aString3096) == -1;
									if (icon.aBool918) {
										var98 = unsure ? 91 : 1;
									} else {
										var98 = unsure ? 90 : 2;
									}

									if (icon.anInt914 * 1684664313 != -1) {
										Class93.sendMessage(var98, Class96.method1232(icon.anInt914 * 1684664313, -1088453175) + player.aString2835, var96);
									} else {
										Class93.sendMessage(var98, player.aString2835, var96);
									}
								}
							}

							GameClient.gameBuffer.pos = (var101 + bufsize) * 1303963473;
						}

						if ((syncval & 0x10) != 0) { // player animation
							var53 = GameClient.gameBuffer.readULEShort();
							if (var53 == 65535) {
								var53 = -1;
							}

							var7 = GameClient.gameBuffer.readUByteA();
							Class45.method694(player, var53, var7, (byte) -17);
						}

						if ((syncval & 0x200) != 0) {
							int value = GameClient.gameBuffer.readUShortLEA();
							int type = GameClient.gameBuffer.readUByte();
							player.addHit(value, type, GameClient.cycle * 1026470457);
							player.anInt2527 = GameClient.cycle * 1810132455 - 2012164012;
							player.anInt2528 = GameClient.gameBuffer.readUByteS() * -1158152579;
							player.anInt2529 = GameClient.gameBuffer.readUByteN() * 1033095941;
						}
					}

					for (var41 = 0; var41 < GameClient.numNpcsPendingRemoval * -807159549; var41++) {
						var3 = GameClient.npcsPendingRemoval[var41];
						if (GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var3].lastSync * 354830915 != GameClient.cycle * 1026470457) {
							GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var3] = null;
						}
					}

					if (GameClient.gameBuffer.pos * 1736753585 != GameClient.messageSize * 1964753529) {
						throw new RuntimeException(GameClient.gameBuffer.pos * 1736753585 + Class37.COMMA + GameClient.messageSize * 1964753529);
					}

					for (var41 = 0; var41 < GameClient.anInt3091 * -796710281; var41++) {
						if (GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[GameClient.anIntArray3107[var41]] == null) {
							throw new RuntimeException(var41 + Class37.COMMA + GameClient.anInt3091 * -796710281);
						}
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 182) {
					GameClient.aBool3083 = true;
					CacheableEntry_Sub23_Sub16_Sub7.anInt2774 = GameClient.gameBuffer.readUByte() * -2125036847;
					Class31.anInt386 = GameClient.gameBuffer.readUByte() * -844963033;
					Class85.anInt1004 = GameClient.gameBuffer.readUShort() * -862136053;
					Class72.anInt870 = GameClient.gameBuffer.readUByte() * 1473239971;
					NpcFlags.anInt67 = GameClient.gameBuffer.readUByte() * 1052421375;
					if (NpcFlags.anInt67 * 1935430399 >= 100) {
						NpcDef.anInt2245 = 50846400 + CacheableEntry_Sub23_Sub16_Sub7.anInt2774 * -1021657728;
						CacheableEntry_Sub23_Sub1.anInt2093 = Class31.anInt386 * 2037303424 - 1907030592;
						Class74.anInt907 = (NpcDef.method2423(NpcDef.anInt2245 * -1967123133, CacheableEntry_Sub23_Sub1.anInt2093 * 681386919, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, -1847964236) - Class85.anInt1004 * -984470877) * 653219559;
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 155) {
					GameClient.aBool3083 = false;

					for (var41 = 0; var41 < 5; var41++) {
						GameClient.aBoolArray3116[var41] = false;
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 154) {
					var2 = GameClient.gameBuffer.readString();
					Object[] var73 = new Object[var2.length() + 1];

					for (var43 = var2.length() - 1; var43 >= 0; --var43) {
						if (var2.charAt(var43) == 115) {
							var73[var43 + 1] = GameClient.gameBuffer.readString();
						} else {
							var73[1 + var43] = GameClient.gameBuffer.readInt();
						}
					}

					var73[0] = GameClient.gameBuffer.readInt();
					if (Loader.DEBUG)
						System.out.printf("ScriptInvoke(%s): %s%n", var2, Arrays.toString(var73));
					ScriptInvocation var59 = new ScriptInvocation();
					var59.parameters = var73;
					InterfaceDef.method2182(var59, 989333815);
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 24) {
					GameClient.mapMarkerX = GameClient.gameBuffer.readUByte() * -2075522063;
					if (GameClient.mapMarkerX * -1846442735 == 255) {
						GameClient.mapMarkerX = 0;
					}

					GameClient.mapMarkerZ = GameClient.gameBuffer.readUByte() * -700155223;
					if (GameClient.mapMarkerZ * -1524315751 == 255) {
						GameClient.mapMarkerZ = 0;
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 4) {
					var41 = GameClient.gameBuffer.readUByteN();
					var3 = GameClient.gameBuffer.readUByteS();
					var43 = GameClient.gameBuffer.readUByte();
					CacheableEntry_Sub23_Sub16_Sub3.anInt2577 = (var43 >> 1) * 1191917245;
					Player.me.method2942(var41, var3, (var43 & 1) == 1, (byte) 14);
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 172) {
					var41 = GameClient.gameBuffer.readIntV1();
					var72 = Class50.method713(var41, (byte) -23);
					var72.anInt1980 = -1678620333;
					var72.anInt1981 = Player.me.aClass108_2815.method1344(899129507) * 999821601;
					Class35.method484(var72, -1014984309);
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 47) { // varp
					int id = GameClient.gameBuffer.readUShortLEA();
					int value = GameClient.gameBuffer.readIntLE();
					if (Loader.DEBUG)
						System.out.printf("Config %d: from %d => %d%n", id, Class106.varps[id], value);

					Class106.anIntArray1476[id] = value;
					if (Class106.varps[id] != value) {
						Class106.varps[id] = value;
						Class22.method349(id, (short) -15508);
					}

					GameClient.anIntArray2964[(GameClient.anInt3052 -= 1071090989) * -539970213 - 1 & 31] = id;
					GameClient.incomingMessage = -426797213;
					return true;
				}

				// Makes minigame or world orb black, idk.
				if (GameClient.incomingMessage * -2146869835 == 106) {
					GameClient.anInt2901 = GameClient.gameBuffer.readUByte() * -713504813;
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 242) {
					var75 = GameClient.gameBuffer.readUByte() == 1;
					if (var75) {
						Class83.aLong995 = (Class10.method216((short) 255) - GameClient.gameBuffer.readLong()) * 1300896244636982313L;
						Class19.aClass133_234 = new Class133(GameClient.gameBuffer, true);
					} else {
						Class19.aClass133_234 = null;
					}

					GameClient.anInt2929 = GameClient.anInt3050 * 554463163;
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 144) {
					int a, b;
					ObjectDef.mapPacketBaseZ = (a = GameClient.gameBuffer.readUByteA()) * -559168027;
					MorePacketEncode.mapPacketBaseX = (b = GameClient.gameBuffer.readUByte()) * 1231171733;
					if (Loader.DEBUG)
						System.out.printf("Mapbase put at %d,%d%n", a, b);
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 250) {
					GameClient.anInt3039 = GameClient.gameBuffer.readUByte() * -1443662223;
					GameClient.anInt3086 = GameClient.gameBuffer.readUByte() * 1525861331;
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 89) { // Destroy
																		// container
					int key = GameClient.gameBuffer.readUShort();
					ItemContainer itemContainer = (ItemContainer) ItemContainer.activeContainers.get(key);
					if (itemContainer != null) {
						itemContainer.unlink();
					}

					GameClient.itemContainerTriggers[(GameClient.itemContainerTriggerptr += 1158399665) * -84622767 - 1 & 31] = key & 0x7fff;
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 173) {
					for (var41 = 0; var41 < Class106.varps.length; var41++) {
						if (Class106.varps[var41] != Class106.anIntArray1476[var41]) {
							Class106.varps[var41] = Class106.anIntArray1476[var41];
							Class22.method349(var41, (short) -5444);
							GameClient.anIntArray2964[(GameClient.anInt3052 -= 1071090989) * -539970213 - 1 & 31] = var41;
						}
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 174) {
					var41 = GameClient.gameBuffer.readInt();
					var3 = GameClient.gameBuffer.readUShortA();
					var4 = Class50.method713(var41, (byte) -59);

					if (var4 != null && var4.contenttype * -1878336627 == 0) {
						if (var3 > var4.anInt1963 * -124837617 - var4.invsize * 539675235) {
							var3 = var4.anInt1963 * -124837617 - var4.invsize * 539675235;
						}

						if (var3 < 0) {
							var3 = 0;
						}

						if (var4.anInt2038 * -650026719 != var3) {
							var4.anInt2038 = var3 * 1811636961;
							Class35.method484(var4, -1699137812);
						}
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 31) {
					while (GameClient.gameBuffer.pos * 1736753585 < GameClient.messageSize * 1964753529) {
						var41 = GameClient.gameBuffer.readUByte();
						var60 = (var41 & 1) == 1;
						var48 = GameClient.gameBuffer.readString();
						var54 = GameClient.gameBuffer.readString();
						GameClient.gameBuffer.readString();

						for (var53 = 0; var53 < GameClient.anInt3138 * 601840989; var53++) {
							Class41 var57 = GameClient.aClass41Array2895[var53];
							if (var60) {
								if (var54.equals(var57.aString597)) {
									var57.aString597 = var48;
									var57.aString586 = var54;
									var48 = null;
									break;
								}
							} else if (var48.equals(var57.aString597)) {
								var57.aString597 = var48;
								var57.aString586 = var54;
								var48 = null;
								break;
							}
						}

						if (var48 != null && GameClient.anInt3138 * 601840989 < 400) {
							Class41 var61 = new Class41();
							GameClient.aClass41Array2895[GameClient.anInt3138 * 601840989] = var61;
							var61.aString597 = var48;
							var61.aString586 = var54;
							GameClient.anInt3138 += 1879695093;
						}
					}

					GameClient.anInt2990 = GameClient.anInt3050 * 1609802529;
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 198) {
					Class51 var69 = new Class51();
					var69.aString699 = GameClient.gameBuffer.readString();
					var69.anInt703 = GameClient.gameBuffer.readUShort() * -469751453;
					var3 = GameClient.gameBuffer.readInt();
					var69.anInt704 = var3 * 1718530509;
					Class93.method1146(45, 1956768955);
					Class98.loginConnection.terminate();
					Class98.loginConnection = null;
					Class56.method792(var69);
					GameClient.incomingMessage = -426797213;
					return false;
				}

				if (GameClient.incomingMessage * -2146869835 == 161) {
					DataBuffer.aClass59_1826 = CacheableEntry_Sub23_Sub16_Sub4.method3073(GameClient.gameBuffer.readUByte(), (short) 1205);
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 139) {
					if (GameClient.activeRoot * 1787246131 != -1) {
						Class5.method138(GameClient.activeRoot * 1787246131, 0, (byte) 124);
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 124) {
					Class7_Sub1.method1783(GameClient.gameBuffer, GameClient.messageSize * 1964753529, -711928237);
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 99) {
					var2 = GameClient.gameBuffer.readString();
					var9 = GameClient.gameBuffer.readUShort();
					var11 = GameClient.gameBuffer.readTriByte();
					var55 = (Class75) CacheableEntry_Sub23_Sub7.method2390(InterfaceDef.method2176((byte) -84), GameClient.gameBuffer.readUByte(), 2080596118);
					var27 = var11 + (var9 << 32);
					boolean var29 = false;

					for (var32 = 0; var32 < 100; var32++) {
						if (var27 == GameClient.aLongArray2871[var32]) {
							var29 = true;
							break;
						}
					}

					if (Class19.method344(var2, 784507029)) {
						var29 = true;
					}

					if (!var29 && GameClient.anInt2982 * -246740433 == 0) {
						GameClient.aLongArray2871[GameClient.anInt3089 * 1965929751] = var27;
						GameClient.anInt3089 = (1 + GameClient.anInt3089 * 1965929751) % 100 * -1112616281;
						PacketBuffer var18 = GameClient.gameBuffer;

						String var19;
						try {
							int var20 = var18.readCompact();
							if (var20 > 32767) {
								var20 = 32767;
							}

							byte[] var24 = new byte[var20];
							var18.pos += Class137.aClass60_1610.method812(var18.data, var18.pos * 1736753585, var24, 0, var20, -1902021787) * 1303963473;
							String var21 = Class66.method893(var24, 0, var20, 1821902210);
							var19 = var21;
						} catch (Exception var34) {
							var19 = "Cabbage";
						}

						var19 = CacheableEntry_Sub23_Sub14_Sub4.method3315(Class38.method498(var19, 1807110952));
						byte var90;
						if (var55.aBool918) {
							var90 = 7;
						} else {
							var90 = 3;
						}

						if (var55.anInt914 * 1684664313 != -1) {
							Class93.sendMessage(var90, Class96.method1232(var55.anInt914 * 1684664313, -1238302374) + var2, var19);
						} else {
							Class93.sendMessage(var90, var2, var19);
						}
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 196) {
					NpcFlags.decodeNpcSync(true);
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 136) {
					Class118.method1490((byte) 59);
					GameClient.incomingMessage = -426797213;
					return false;
				}

				if (GameClient.incomingMessage * -2146869835 == 190) { // varp
					byte value = GameClient.gameBuffer.readSByte();
					int id = GameClient.gameBuffer.readUShortLEA();
					if (Loader.DEBUG)
						System.out.printf("Config %d: from %d => %d%n", id, Class106.varps[id], value);

					Class106.anIntArray1476[id] = value;
					if (Class106.varps[id] != value) {
						Class106.varps[id] = value;
						Class22.method349(id, (short) -13905);
					}

					GameClient.anIntArray2964[(GameClient.anInt3052 -= 1071090989) * -539970213 - 1 & 31] = id;
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 107) {
					int newinter = GameClient.gameBuffer.readIntLE();
					int replace = GameClient.gameBuffer.readIntV1();
					if (Loader.DEBUG)
						System.out.printf("Interswitch: [%d:%d] [%d:%d]%n", newinter >> 16, newinter & 0xFFFF, replace >> 16, replace & 0xFFFF);
					LinkedEntry_Sub13 var49 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.get(replace);
					var58 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.get(newinter);
					if (var58 != null) {
						CacheableEntry_Sub23_Sub6.method2374(var58, var49 == null || var58.anInt1819 * -1385416029 != var49.anInt1819 * -1385416029, 1345746199);
					}

					if (var49 != null) {
						var49.unlink();
						GameClient.aJagexMap_3073.put(var49, newinter);
					}

					var56 = Class50.method713(replace, (byte) -119);
					if (var56 != null) {
						Class35.method484(var56, -1922525950);
					}

					var56 = Class50.method713(newinter, (byte) 40);
					if (var56 != null) {
						Class35.method484(var56, -1963434672);
						Class57.method796(InterfaceDef.aInterfaceDefArrayArray1975[var56.hash * 1582464481 >>> 16], var56, true, -522490405);
					}

					if (GameClient.activeRoot * 1787246131 != -1) {
						Class5.method138(GameClient.activeRoot * 1787246131, 1, (byte) 6);
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 231) {
					int song = GameClient.gameBuffer.readUShort();
					if (song == 65535) {
						song = -1;
					}

					CacheableEntry_Sub23_Sub16_Sub1.method2938(song, -2036717338);
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 175) {
					var41 = GameClient.gameBuffer.readULEShort();
					if (var41 == 65535) {
						var41 = -1;
					}

					var3 = GameClient.gameBuffer.method1910();
					Class7_Sub1.method1774(var41, var3, (byte) -43);
					GameClient.incomingMessage = -426797213;
					return true;
				}

				// Update Game countdown
				if (GameClient.incomingMessage * -2146869835 == 135) {
					GameClient.anInt2877 = GameClient.gameBuffer.readUShort() * 772647426;
					GameClient.anInt3062 = GameClient.anInt3050 * 108236717;
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 233) {
					var2 = GameClient.gameBuffer.readString();
					GameClient.aString2866 = var2;

					try {
						var52 = GameClient.aGameClient2857.getParameter(Class107.aClass107_1495.aString1498);
						var48 = GameClient.aGameClient2857.getParameter(Class107.aClass107_1496.aString1498);
						var54 = var52 + "settings=" + var2 + "; version=1; path=/; domain=" + var48;
						if (var2.length() == 0) {
							var54 = var54 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
						} else {
							var54 = var54 + "; Expires=" + CacheableEntry_Sub23_Sub11.method2497(Class10.method216((short) 255) + 94608000000L) + "; Max-Age=" + 94608000L;
						}

						Class69.method924(GameClient.aGameClient2857, "document.cookie=\"" + var54 + "\"", (byte) -125);
					} catch (Throwable var33) {
						;
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 131) {
					GameClient.aBool3083 = true;
					Class32.anInt410 = GameClient.gameBuffer.readUByte() * 660111577;
					CacheableEntry_Sub23_Sub10.anInt2321 = GameClient.gameBuffer.readUByte() * 690044465;
					CacheableEntry_Sub23_Sub16_Sub2.anInt2550 = GameClient.gameBuffer.readUShort() * -766471883;
					Player.anInt2827 = GameClient.gameBuffer.readUByte() * -138722029;
					Class63.anInt803 = GameClient.gameBuffer.readUByte() * -1775269453;
					if (Class63.anInt803 * -817214085 >= 100) {
						var41 = Class32.anInt410 * 704623744 + 64;
						var3 = CacheableEntry_Sub23_Sub10.anInt2321 * -1750243200 + 64;
						var43 = NpcDef.method2423(var41, var3, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, -1847964236) - CacheableEntry_Sub23_Sub16_Sub2.anInt2550 * 276298013;
						var51 = var41 - NpcDef.anInt2245 * -1967123133;
						var53 = var43 - Class74.anInt907 * 113597655;
						var7 = var3 - CacheableEntry_Sub23_Sub1.anInt2093 * 681386919;
						var8 = (int) Math.sqrt(var51 * var51 + var7 * var7);
						IndexDescriptor.anInt1366 = ((int) (Math.atan2(var53, var8) * 325.949D) & 2047) * 34393649;
						Class19.anInt231 = ((int) (Math.atan2(var51, var7) * -325.949D) & 2047) * -112245797;
						if (IndexDescriptor.anInt1366 * -1557542191 < 128) {
							IndexDescriptor.anInt1366 = 107419776;
						}

						if (IndexDescriptor.anInt1366 * -1557542191 > 383) {
							IndexDescriptor.anInt1366 = 287865679;
						}
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 177) {
					var2 = GameClient.gameBuffer.readString();
					var3 = GameClient.gameBuffer.readUShort();
					byte var45 = GameClient.gameBuffer.readByte();
					var46 = false;
					if (var45 == -128) {
						var46 = true;
					}

					if (var46) {
						if (Class41.anInt585 * -1787316275 == 0) {
							GameClient.incomingMessage = -426797213;
							return true;
						}

						boolean var50 = false;

						for (var53 = 0; var53 < Class41.anInt585 * -1787316275 && (!Class54.aClass109_Sub8Array728[var53].aString1757.equals(var2) || var3 != Class54.aClass109_Sub8Array728[var53].anInt1753 * -206755573); var53++) {
							;
						}

						if (var53 < Class41.anInt585 * -1787316275) {
							while (var53 < Class41.anInt585 * -1787316275 - 1) {
								Class54.aClass109_Sub8Array728[var53] = Class54.aClass109_Sub8Array728[1 + var53];
								++var53;
							}

							Class41.anInt585 -= 1168379141;
							Class54.aClass109_Sub8Array728[Class41.anInt585 * -1787316275] = null;
						}
					} else {
						GameClient.gameBuffer.readString();
						LinkedEntry_Sub8 var6 = new LinkedEntry_Sub8();
						var6.aString1757 = var2;
						var6.aString1759 = Class38.method497(var6.aString1757, GameClient.aClass119_2919, -2130384532);
						var6.anInt1753 = var3 * -1785505117;
						var6.aByte1756 = var45;

						for (var7 = Class41.anInt585 * -1787316275 - 1; var7 >= 0; --var7) {
							var8 = Class54.aClass109_Sub8Array728[var7].aString1759.compareTo(var6.aString1759);
							if (var8 == 0) {
								Class54.aClass109_Sub8Array728[var7].anInt1753 = var3 * -1785505117;
								Class54.aClass109_Sub8Array728[var7].aByte1756 = var45;
								if (var2.equals(Player.me.aString2835)) {
									ItemContainer.aByte1793 = var45;
								}

								GameClient.anInt3014 = GameClient.anInt3050 * 1312885291;
								GameClient.incomingMessage = -426797213;
								return true;
							}

							if (var8 < 0) {
								break;
							}
						}

						if (Class41.anInt585 * -1787316275 >= Class54.aClass109_Sub8Array728.length) {
							GameClient.incomingMessage = -426797213;
							return true;
						}

						for (var8 = Class41.anInt585 * -1787316275 - 1; var8 > var7; --var8) {
							Class54.aClass109_Sub8Array728[1 + var8] = Class54.aClass109_Sub8Array728[var8];
						}

						if (Class41.anInt585 * -1787316275 == 0) {
							Class54.aClass109_Sub8Array728 = new LinkedEntry_Sub8[100];
						}

						Class54.aClass109_Sub8Array728[1 + var7] = var6;
						Class41.anInt585 += 1168379141;
						if (var2.equals(Player.me.aString2835)) {
							ItemContainer.aByte1793 = var45;
						}
					}

					GameClient.anInt3014 = GameClient.anInt3050 * 1312885291;
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 20) {
					var41 = GameClient.gameBuffer.readIntV2();
					var52 = GameClient.gameBuffer.readString();
					var4 = Class50.method713(var41, (byte) 23);
					if (!var52.equals(var4.aString1997)) {
						var4.aString1997 = var52;
						Class35.method484(var4, -1875104054);
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				// item on interface
				if (GameClient.incomingMessage * -2146869835 == 80) {
					var41 = GameClient.gameBuffer.method1908();
					var3 = GameClient.gameBuffer.method1907();
					var43 = GameClient.gameBuffer.readIntV1();
					var5 = Class50.method713(var43, (byte) 114);
					if (var5.anInt1946 * 1254348635 != var3 || var5.anInt1949 * 1905475965 != var41 || var5.anInt1944 * 282167005 != 0 || var5.anInt2020 * -1554609611 != 0) {
						var5.anInt1946 = var3 * 1530429651;
						var5.anInt1949 = var41 * -1351876651;
						var5.anInt1944 = 0;
						var5.anInt2020 = 0;
						Class35.method484(var5, -1222145190);
						Class54.method784(var5, 1693427225);
						if (var5.contenttype * -1878336627 == 0) {
							Class57.method796(InterfaceDef.aInterfaceDefArrayArray1975[var43 >> 16], var5, false, 691355272);
						}
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}
				if (GameClient.incomingMessage * -2146869835 == 54) {
					MorePacketEncode.mapPacketBaseX = GameClient.gameBuffer.readUByteA() * 1231171733;
					ObjectDef.mapPacketBaseZ = GameClient.gameBuffer.readUByteN() * -559168027;

					for (var41 = MorePacketEncode.mapPacketBaseX * -1886971203; var41 < 8 + MorePacketEncode.mapPacketBaseX * -1886971203; var41++) {
						for (var3 = ObjectDef.mapPacketBaseZ * 616951789; var3 < 8 + ObjectDef.mapPacketBaseZ * 616951789; var3++) {
							if (GameClient.aJagexLinkedListArrayArrayArray2998[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619][var41][var3] != null) {
								GameClient.aJagexLinkedListArrayArrayArray2998[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619][var41][var3] = null;
								CacheableEntry_Sub23_Sub16_Sub1.method2940(var41, var3, (byte) 34);
							}
						}
					}

					for (LinkedEntry_Sub6 var47 = (LinkedEntry_Sub6) GameClient.aJagexLinkedList_2999.method1405(); var47 != null; var47 = (LinkedEntry_Sub6) GameClient.aJagexLinkedList_2999.method1402()) {
						if (var47.anInt1723 * 754007907 >= MorePacketEncode.mapPacketBaseX * -1886971203 && var47.anInt1723 * 754007907 < MorePacketEncode.mapPacketBaseX * -1886971203 + 8 && var47.anInt1729 * 1618190275 >= ObjectDef.mapPacketBaseZ * 616951789
								&& var47.anInt1729 * 1618190275 < 8 + ObjectDef.mapPacketBaseZ * 616951789 && CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619 == var47.anInt1717 * -1806974757) {
							var47.anInt1728 = 0;
						}
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 26) {
					int offer = GameClient.gameBuffer.readUByte();
					if (GameClient.gameBuffer.readUByte() == 0) {
						GameClient.grandExchangeOffers[offer] = new GrandExchangeOffer();
						GameClient.gameBuffer.pos += 1996506034;
					} else {
						GameClient.gameBuffer.pos -= 1303963473;
						GameClient.grandExchangeOffers[offer] = new GrandExchangeOffer(GameClient.gameBuffer, false);
					}

					GameClient.anInt2980 = GameClient.anInt3050 * -1454914357;
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 115) {
					ScriptInvocation.method1835();
					GameClient.anInt3030 = GameClient.gameBuffer.readUByte() * 1641176015;
					GameClient.anInt3062 = GameClient.anInt3050 * 108236717;
					GameClient.incomingMessage = -426797213;
					return true;
				}
				if (GameClient.incomingMessage * -2146869835 == 142) {
					var41 = GameClient.gameBuffer.readUShortA();
					var3 = GameClient.gameBuffer.readInt();
					var43 = GameClient.gameBuffer.readUShortLEA();

					var5 = Class50.method713(var3, (byte) -29);
					var5.anInt1993 = ((var41 << 16) + var43) * -999881371;
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 111) {
					var41 = GameClient.gameBuffer.readULEShort();
					var3 = GameClient.gameBuffer.readIntLE();
					var4 = Class50.method713(var3, (byte) -64);

					if (var4.anInt1980 * 1661118609 != 1 || var41 != var4.anInt1981 * -982469919) {
						var4.anInt1980 = -559540111;
						var4.anInt1981 = var41 * 999821601;
						Class35.method484(var4, -60336288);
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 181) {
					var41 = GameClient.gameBuffer.readInt();
					LinkedEntry_Sub13 var44 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.get(var41);
					if (var44 != null) {
						CacheableEntry_Sub23_Sub6.method2374(var44, true, 1345746199);
					}

					if (GameClient.aInterfaceDef_3029 != null) {
						Class35.method484(GameClient.aInterfaceDef_3029, -24325828);
						GameClient.aInterfaceDef_3029 = null;
					}

					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 45) {
					var41 = GameClient.gameBuffer.readUShortLEA();
					if (Loader.DEBUG)
						System.out.printf("Rootpane %d%n", var41);

					try {
						GameClient.activeRoot = var41 * -1855539973;
						CacheableEntry_Sub23_Sub16_Sub7.method3298(false, (byte) -101);
						CacheableEntry_Sub23_Sub10.method2487(var41, 2005546330);
						Class85.method1092(GameClient.activeRoot * 1787246131, -1051839745);
					} catch (Exception e) {

					}

					for (var3 = 0; var3 < 100; var3++) {
						GameClient.aBoolArray3072[var3] = true;
					}
					GameClient.incomingMessage = -426797213;
					return true;
				}

				if (GameClient.incomingMessage * -2146869835 == 28) {
					for (var41 = 0; var41 < CacheableEntry_Sub23_Sub7.anInt2212 * -1601269221; var41++) {
						CacheableEntry_Sub23_Sub7 var42 = CacheableEntry_Sub23_Sub16_Sub3.method2967(var41, (byte) -30);
						if (var42 != null) {
							Class106.anIntArray1476[var41] = 0;
							Class106.varps[var41] = 0;
						}
					}

					ScriptInvocation.method1835();
					GameClient.anInt3052 += 84826720;
					GameClient.incomingMessage = -426797213;
					return true;
				}
				
				// START CUSTOM
				
				System.out.println("YO INCOMING MESSAGE = " + GameClient.incomingMessage * -2146869835);
				
				// open forums
				if (GameClient.incomingMessage * -2146869835 == 200) {
					Class89.method1120(Loader.FORUMS_LINK, true, false, -982469919);
					//String url= GameClient.gameBuffer.readString();//dont work
					GameClient.incomingMessage = -426797213;
					return true;
				}
				
				// open hiscores
				if (GameClient.incomingMessage * -2146869835 == 201) {
					Class89.method1120(Loader.HISCORES_LINK, true, false, -982469919);
					//String url= GameClient.gameBuffer.readString();//dont work
					GameClient.incomingMessage = -426797213;
					return true;
				}
				
				// END CUSTOM

				Class72.method964("" + GameClient.incomingMessage * -2146869835 + Class37.COMMA + GameClient.anInt2913 * -1223323799 + Class37.COMMA + GameClient.anInt2916 * -1483162423 + Class37.COMMA + GameClient.messageSize * 1964753529, (Throwable) null, (byte) 1);
				Class118.method1490((byte) 122);
			} catch (IOException var39) {
				Class58.method802(-1124316003);
			} catch (Exception var40) {
				var2 = "" + GameClient.incomingMessage * -2146869835 + Class37.COMMA + GameClient.anInt2913 * -1223323799 + Class37.COMMA + GameClient.anInt2916 * -1483162423 + Class37.COMMA + GameClient.messageSize * 1964753529 + Class37.COMMA
						+ (Class35.anInt478 * -1719983039 + Player.me.stepQueueX[0]) + Class37.COMMA + (Player.me.stepQueueY[0] + LinkedEntry_Sub13.anInt1825 * 803568843) + Class37.COMMA;

				for (var3 = 0; var3 < GameClient.messageSize * 1964753529 && var3 < 50; var3++) {
					var2 = var2 + GameClient.gameBuffer.data[var3] + Class37.COMMA;
				}

				Class72.method964(var2, var40, (byte) 1);
				Class118.method1490((byte) 52);
			}

			return true;
		}
	}

	static void method390(int var0, int var1, int var2, ObjectDef var3, int var4, int var5) {
		LinkedEntry_Sub7 var6 = new LinkedEntry_Sub7();
		var6.anInt1747 = var0 * -1603653567;
		var6.anInt1737 = var1 * -729203072;
		var6.anInt1738 = var2 * 1031704448;
		int var7 = var3.anInt2277 * 1832905927;
		int var8 = var3.anInt2274 * 1221908201;
		if (var4 == 1 || var4 == 3) {
			var7 = var3.anInt2274 * 1221908201;
			var8 = var3.anInt2277 * 1832905927;
		}

		var6.anInt1752 = (var7 + var1) * 1016622720;
		var6.anInt1740 = (var8 + var2) * 815341184;
		var6.anInt1742 = var3.anInt2302 * 136265569;
		var6.anInt1741 = var3.anInt2303 * 948119936;
		var6.anInt1744 = var3.anInt2304 * 1077586367;
		var6.anInt1745 = var3.anInt2290 * -1990256399;
		var6.anIntArray1749 = var3.anIntArray2306;
		if (var3.anIntArray2299 != null) {
			var6.aClass109_Sub23_Sub9_1735 = var3;
			var6.method1819((byte) 112);
		}

		LinkedEntry_Sub7.aJagexLinkedList_1739.add(var6);
		if (var6.anIntArray1749 != null) {
			var6.anInt1736 = (var6.anInt1744 * 478375745 + (int) (Math.random() * (var6.anInt1745 * 623135975 - var6.anInt1744 * 478375745))) * 55643609;
		}

	}

}
