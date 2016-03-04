import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class Class44 {

	public static final int anInt619 = 190;
	static CacheableEntry_Sub23_Sub14_Sub4_Sub1 aClass109_Sub23_Sub14_Sub4_Sub1_621;
	static MachineInfo myMachine;
	static final int anInt629 = 37;
	static int anInt630;
	public static final int anInt631 = 128;
	public static final int anInt632 = 72;
	static IndexDescriptor_Sub1 aClass94_Sub1_634;
	static int anInt635;
	DataInputStream aDataInputStream633;
	int anInt620;
	int anInt627;
	byte[] aByteArray624;
	int anInt625;
	byte[] aByteArray622 = new byte[4];
	AsyncJob aAsyncJob_623;
	long aLong626;

	byte[] method675(byte var1) throws IOException {
		if (Class10.method216((short) 255) > -475575183579082141L * aLong626) {
			throw new IOException();
		} else {
			if (anInt620 * -1502629331 == 0) {
				if (aAsyncJob_623.stage == 2) {
					throw new IOException();
				}

				if (aAsyncJob_623.stage == 1) {
					aDataInputStream633 = (DataInputStream) aAsyncJob_623.result;
					anInt620 = -1881576027;
				}
			}

			int var3;
			if (anInt620 * -1502629331 == 1) {
				var3 = aDataInputStream633.available();
				if (var3 > 0) {
					if (var3 + anInt627 * 1266010029 > 4) {
						var3 = 4 - anInt627 * 1266010029;
					}

					anInt627 += aDataInputStream633.read(aByteArray622, anInt627 * 1266010029, var3) * 41366565;
					if (anInt627 * 1266010029 == 4) {
						int var2 = (new DataBuffer(aByteArray622)).readInt();
						aByteArray624 = new byte[var2];
						anInt620 = 531815242;
					}
				}
			}

			if (anInt620 * -1502629331 == 2) {
				var3 = aDataInputStream633.available();
				if (var3 > 0) {
					if (anInt625 * 1842810291 + var3 > aByteArray624.length) {
						var3 = aByteArray624.length - anInt625 * 1842810291;
					}

					anInt625 += aDataInputStream633.read(aByteArray624, anInt625 * 1842810291, var3) * 733636987;
					if (aByteArray624.length == anInt625 * 1842810291) {
						return aByteArray624;
					}
				}
			}

			return null;
		}
	}

	static void method677(int var0, int var1, int var2, int var3, byte var4) {
		for (LinkedEntry_Sub7 var5 = (LinkedEntry_Sub7) LinkedEntry_Sub7.aJagexLinkedList_1739.method1405(); var5 != null; var5 = (LinkedEntry_Sub7) LinkedEntry_Sub7.aJagexLinkedList_1739.method1402()) {
			if (var5.anInt1742 * -1608116241 != -1 || var5.anIntArray1749 != null) {
				int var7 = 0;
				if (var1 > var5.anInt1752 * -1029232779) {
					var7 += var1 - var5.anInt1752 * -1029232779;
				} else if (var1 < var5.anInt1737 * -731482411) {
					var7 += var5.anInt1737 * -731482411 - var1;
				}

				if (var2 > var5.anInt1740 * -530221803) {
					var7 += var2 - var5.anInt1740 * -530221803;
				} else if (var2 < var5.anInt1738 * -227524897) {
					var7 += var5.anInt1738 * -227524897 - var2;
				}

				if (var7 - 64 <= var5.anInt1741 * 2136376279 && GameClient.anInt3108 * -1977859941 != 0 && var0 == var5.anInt1747 * 1974067137) {
					var7 -= 64;
					if (var7 < 0) {
						var7 = 0;
					}

					int var8 = (var5.anInt1741 * 2136376279 - var7) * GameClient.anInt3108 * -1977859941 / (var5.anInt1741 * 2136376279);
					if (var5.aClass109_Sub5_Sub2_1743 == null) {
						if (var5.anInt1742 * -1608116241 >= 0) {
							Class8 var9 = Class8.method184(GameClient.aClass94_Sub1_3134, var5.anInt1742 * -1608116241, 0);
							if (var9 != null) {
								LinkedEntry_Sub1_Sub1 var10 = var9.method182().method2705(Class76.aClass10_925);
								LinkedEntry_Sub5_Sub2 var11 = LinkedEntry_Sub5_Sub2.method2659(var10, 100, var8);
								var11.method2573(-1);
								Class48.aClass109_Sub5_Sub1_672.method2544(var11);
								var5.aClass109_Sub5_Sub2_1743 = var11;
							}
						}
					} else {
						var5.aClass109_Sub5_Sub2_1743.method2574(var8);
					}

					if (var5.aClass109_Sub5_Sub2_1748 == null) {
						if (var5.anIntArray1749 != null && (var5.anInt1736 -= var3 * 55643609) * 1009689193 <= 0) {
							int var12 = (int) (Math.random() * (double) var5.anIntArray1749.length);
							Class8 var13 = Class8.method184(GameClient.aClass94_Sub1_3134, var5.anIntArray1749[var12], 0);
							if (var13 != null) {
								LinkedEntry_Sub1_Sub1 var14 = var13.method182().method2705(Class76.aClass10_925);
								LinkedEntry_Sub5_Sub2 var6 = LinkedEntry_Sub5_Sub2.method2659(var14, 100, var8);
								var6.method2573(0);
								Class48.aClass109_Sub5_Sub1_672.method2544(var6);
								var5.aClass109_Sub5_Sub2_1748 = var6;
								var5.anInt1736 = (var5.anInt1744 * 478375745 + (int) (Math.random() * (double) (var5.anInt1745 * 623135975 - var5.anInt1744 * 478375745))) * 55643609;
							}
						}
					} else {
						var5.aClass109_Sub5_Sub2_1748.method2574(var8);
						if (!var5.aClass109_Sub5_Sub2_1748.hasNext()) {
							var5.aClass109_Sub5_Sub2_1748 = null;
						}
					}
				} else {
					if (var5.aClass109_Sub5_Sub2_1743 != null) {
						Class48.aClass109_Sub5_Sub1_672.method2545(var5.aClass109_Sub5_Sub2_1743);
						var5.aClass109_Sub5_Sub2_1743 = null;
					}

					if (var5.aClass109_Sub5_Sub2_1748 != null) {
						Class48.aClass109_Sub5_Sub1_672.method2545(var5.aClass109_Sub5_Sub2_1748);
						var5.aClass109_Sub5_Sub2_1748 = null;
					}
				}
			}
		}

	}

	static final void method679(String var0, boolean var1, int var2) {
		if (var0 != null) {
			if ((GameClient.anInt3138 * 601840989 < 100 || GameClient.member * -1090925967 == 1) && GameClient.anInt3138 * 601840989 < 400) {
				String var5 = Class38.method497(var0, GameClient.aClass119_2919, -1542592146);
				if (var5 != null) {
					String var3;
					int var4;
					String var7;
					for (var4 = 0; var4 < GameClient.anInt3138 * 601840989; var4++) {
						Class41 var6 = GameClient.aClass41Array2895[var4];
						var3 = Class38.method497(var6.aString597, GameClient.aClass119_2919, -1781936336);
						if (var3 != null && var3.equals(var5)) {
							Class93.method1145(31, "", var0 + Class90.aString1093);
							return;
						}

						if (var6.aString586 != null) {
							var7 = Class38.method497(var6.aString586, GameClient.aClass119_2919, -1992860654);
							if (var7 != null && var7.equals(var5)) {
								Class93.method1145(31, "", var0 + Class90.aString1093);
								return;
							}
						}
					}

					for (var4 = 0; var4 < GameClient.anInt2984 * 389772333; var4++) {
						Class46 var8 = GameClient.aClass46Array3136[var4];
						var3 = Class38.method497(var8.aString658, GameClient.aClass119_2919, -1837733720);
						if (var3 != null && var3.equals(var5)) {
							Class93.method1145(31, "", Class90.aString1230 + var0 + Class90.aString1231);
							return;
						}

						if (var8.aString647 != null) {
							var7 = Class38.method497(var8.aString647, GameClient.aClass119_2919, -1719269775);
							if (var7 != null && var7.equals(var5)) {
								Class93.method1145(31, "", Class90.aString1230 + var0 + Class90.aString1231);
								return;
							}
						}
					}

					if (Class38.method497(Player.me.aString2835, GameClient.aClass119_2919, -1545418178).equals(var5)) {
						Class93.method1145(31, "", Class90.aString1179);
					} else {
						GameClient.secureBuffer.writeOpcode(181);
						GameClient.secureBuffer.writeByte(Class56.calcStringBytes(var0));
						GameClient.secureBuffer.writeStr(var0);
					}
				}
			} else {
				Class93.method1145(31, "", Class90.aString1224);
			}
		}
	}

	static void method680(byte var0) {
		for (int var1 = 0; var1 < GameClient.menuActionPtr * 1324290403; var1++) {
			int var2 = GameClient.menuCommands[var1];
			boolean var4 = var2 == 57 || var2 == 58 || var2 == 1007 || var2 == 25 || var2 == 30;
			if (var4) {
				if (var1 < GameClient.menuActionPtr * 1324290403 - 1) {
					for (int var3 = var1; var3 < GameClient.menuActionPtr * 1324290403 - 1; var3++) {
						GameClient.menuOptions[var3] = GameClient.menuOptions[var3 + 1];
						GameClient.menuOptionTexts[var3] = GameClient.menuOptionTexts[var3 + 1];
						GameClient.menuCommands[var3] = GameClient.menuCommands[var3 + 1];
						GameClient.menuParam1[var3] = GameClient.menuParam1[var3 + 1];
						GameClient.menuParam2[var3] = GameClient.menuParam2[1 + var3];
						GameClient.menuParam3[var3] = GameClient.menuParam3[1 + var3];
					}
				}

				GameClient.menuActionPtr += 439682997;
			}
		}

	}

	Class44(Class73 var1, URL var2) {
		aAsyncJob_623 = var1.method971(var2, (byte) 17);
		anInt620 = 0;
		aLong626 = (Class10.method216((short) 255) + 30000L) * -5100844620741345461L;
	}

}
