import java.awt.*;

public class Class53 {

	public static final int anInt715 = 38;
	public static final int anInt716 = 74;
	static final int anInt717 = 3;
	static long aLong718;
	public static final int anInt719 = 228;
	static final int anInt720 = 1;
	public static final int anInt721 = 157;
	static final int anInt722 = 67;
	static long aLong723;

	Class53() throws Throwable {
		throw new Error();
	}

	static final void method780(String var0, boolean var1, int var2) {
		byte var3 = 4;
		int var4 = var3 + 6;
		int var5 = var3 + 6;
		int var6 = Class44.aClass109_Sub23_Sub14_Sub4_Sub1_621.method3319(var0, 250);
		int var7 = Class44.aClass109_Sub23_Sub14_Sub4_Sub1_621.method3371(var0, 250) * 13;
		CacheableEntry_Sub23_Sub14.method2718(var4 - var3, var5 - var3, var6 + var3 + var3, var3 + var3 + var7, 0);
		CacheableEntry_Sub23_Sub14.method2720(var4 - var3, var5 - var3, var3 + var6 + var3, var7 + var3 + var3, 16777215);
		Class44.aClass109_Sub23_Sub14_Sub4_Sub1_621.method3346(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
		CacheableEntry_Sub23_Sub16_Sub4.method3075(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var7 + var3, -1235993755);
		if (var1) {
			try {
				Graphics var8 = Class60.aCanvas771.getGraphics();
				Class72.aClass7_871.method160(var8, 0, 0, 689765392);
			} catch (Exception var9) {
				Class60.aCanvas771.repaint();
			}
		} else {
			CacheableEntry_Sub23_Sub16.method2788(var4, var5, var6, var7, (byte) 125);
		}

	}

	static final void method781(DataBuffer buffer, int level, int x, int z, int var4, int var5, int var6, int var7) {
		int value;
		if (x >= 0 && x < 104 && z >= 0 && z < 104) {
			Class32.mapSettings[level][x][z] = 0;

			while (true) {
				value = buffer.readUByte();
				if (value == 0) {
					if (level == 0) {
						Class32.mapSquareHeights[0][x][z] = -CacheableEntry_Sub23_Sub16_Sub4.perlinMapNoise(var4 + 932731 + x, z + 556238 + var5) * 8;
					} else {
						Class32.mapSquareHeights[level][x][z] = Class32.mapSquareHeights[level - 1][x][z] - 240;
					}
					break;
				}

				if (value == 1) {
					int var8 = buffer.readUByte();
					if (var8 == 1) {
						var8 = 0;
					}

					if (level == 0) {
						Class32.mapSquareHeights[0][x][z] = -var8 * 8;
					} else {
						Class32.mapSquareHeights[level][x][z] = Class32.mapSquareHeights[level - 1][x][z] - var8 * 8;
					}
					break;
				}

				if (value <= 49) {
					Class32.aByteArrayArrayArray394[level][x][z] = buffer.readByte();
					Class36.aByteArrayArrayArray485[level][x][z] = (byte) ((value - 2) / 4);
					LinkedEntry_Sub9.aByteArrayArrayArray1762[level][x][z] = (byte) (value - 2 + var6 & 3);
				} else if (value <= 81) {
					Class32.mapSettings[level][x][z] = (byte) (value - 49);
				} else {
					Class32.aByteArrayArrayArray407[level][x][z] = (byte) (value - 81);
				}
			}
		} else {
			while (true) {
				value = buffer.readUByte();
				if (value == 0) {
					break;
				}

				if (value == 1) {
					buffer.readUByte();
					break;
				}

				if (value <= 49) {
					buffer.readUByte();
				}
			}
		}

	}

	public static byte method782(char var0, int var1) {
		byte var2;
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 == 8364) {
				var2 = -128;
			} else if (var0 == 8218) {
				var2 = -126;
			} else if (var0 == 402) {
				var2 = -125;
			} else if (var0 == 8222) {
				var2 = -124;
			} else if (var0 == 8230) {
				var2 = -123;
			} else if (var0 == 8224) {
				var2 = -122;
			} else if (var0 == 8225) {
				var2 = -121;
			} else if (var0 == 710) {
				var2 = -120;
			} else if (var0 == 8240) {
				var2 = -119;
			} else if (var0 == 352) {
				var2 = -118;
			} else if (var0 == 8249) {
				var2 = -117;
			} else if (var0 == 338) {
				var2 = -116;
			} else if (var0 == 381) {
				var2 = -114;
			} else if (var0 == 8216) {
				var2 = -111;
			} else if (var0 == 8217) {
				var2 = -110;
			} else if (var0 == 8220) {
				var2 = -109;
			} else if (var0 == 8221) {
				var2 = -108;
			} else if (var0 == 8226) {
				var2 = -107;
			} else if (var0 == 8211) {
				var2 = -106;
			} else if (var0 == 8212) {
				var2 = -105;
			} else if (var0 == 732) {
				var2 = -104;
			} else if (var0 == 8482) {
				var2 = -103;
			} else if (var0 == 353) {
				var2 = -102;
			} else if (var0 == 8250) {
				var2 = -101;
			} else if (var0 == 339) {
				var2 = -100;
			} else if (var0 == 382) {
				var2 = -98;
			} else if (var0 == 376) {
				var2 = -97;
			} else {
				var2 = 63;
			}
		} else {
			var2 = (byte) var0;
		}

		return var2;
	}

}
