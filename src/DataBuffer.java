import java.math.BigInteger;

public class DataBuffer extends LinkedEntry {

	static Class59 aClass59_1826;
	static CacheableEntry_Sub23_Sub19 aClass109_Sub23_Sub19_1831;
	public byte[] data;
	public int pos;
	static int[] anIntArray1833 = new int[256];

	public DataBuffer(byte[] var1) {
		data = var1;
		pos = 0;
	}

	public void writeByte(int var1) {
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) var1;
	}

	public void writeShort(int var1) {
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 8);
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) var1;
	}

	public void writeTriByte(int var1) {
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 16);
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 8);
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) var1;
	}

	public void writeInt(int var1) {
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 24);
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 16);
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 8);
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) var1;
	}

	public void write6Byte(long var1) {
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) ((int) (var1 >> 40));
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) ((int) (var1 >> 32));
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) ((int) (var1 >> 24));
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) ((int) (var1 >> 16));
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) ((int) (var1 >> 8));
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) ((int) var1);
	}

	public void writeLong(long var1) {
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) ((int) (var1 >> 56));
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) ((int) (var1 >> 48));
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) ((int) (var1 >> 40));
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) ((int) (var1 >> 32));
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) ((int) (var1 >> 24));
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) ((int) (var1 >> 16));
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) ((int) (var1 >> 8));
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) ((int) var1);
	}

	public void writeStr(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			pos += Class83.method1078(var1, 0, var1.length(), data, pos * 1736753585, 452054574) * 1303963473;
			data[(pos += 1303963473) * 1736753585 - 1] = 0;
		}
	}

	public void writeJagStr(String var1, byte var2) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			if (var2 == 0) {
				throw new IllegalArgumentException("");
			}
		} else {
			data[(pos += 1303963473) * 1736753585 - 1] = 0;
			pos += Class83.method1078(var1, 0, var1.length(), data, pos * 1736753585, -99292191) * 1303963473;
			data[(pos += 1303963473) * 1736753585 - 1] = 0;
		}
	}

	public void endVarInt(int var1) {
		data[pos * 1736753585 - var1 - 4] = (byte) (var1 >> 24);
		data[pos * 1736753585 - var1 - 3] = (byte) (var1 >> 16);
		data[pos * 1736753585 - var1 - 2] = (byte) (var1 >> 8);
		data[pos * 1736753585 - var1 - 1] = (byte) var1;
	}

	public void writeLEInt(int var1) {
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) var1;
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 8);
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 16);
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 24);
	}

	public void method1866(int var1) {
		data[pos * 1736753585 - var1 - 1] = (byte) var1;
	}

	public void writeCompact(int value) {
		if (value >= 0 && value < 128) {
			writeByte(value);
		} else if (value >= 0 && value < 32768) {
			writeShort(32768 + value);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int readUByte() {
		return data[(pos += 1303963473) * 1736753585 - 1] & 255;
	}

	public byte readByte() {
		return data[(pos += 1303963473) * 1736753585 - 1];
	}

	public int readUShort() {
		pos -= 1687040350;
		return (data[pos * 1736753585 - 1] & 255) + ((data[pos * 1736753585 - 2] & 255) << 8);
	}

	public int readShort() {
		pos -= 1687040350;
		int var2 = ((data[pos * 1736753585 - 2] & 255) << 8) + (data[pos * 1736753585 - 1] & 255);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int readTriByte() {
		pos -= 383076877;
		return ((data[pos * 1736753585 - 3] & 255) << 16) + ((data[pos * 1736753585 - 2] & 255) << 8) + (data[pos * 1736753585 - 1] & 255);
	}

	public int readInt() {
		pos += 920886596;
		return ((data[pos * 1736753585 - 4] & 255) << 24) + ((data[pos * 1736753585 - 3] & 255) << 16) + ((data[pos * 1736753585 - 2] & 255) << 8) + (data[pos * 1736753585 - 1] & 255);
	}

	public long readLong() {
		long var2 = (long) readInt() & 4294967295L;
		long var4 = (long) readInt() & 4294967295L;
		return (var2 << 32) + var4;
	}

	public String readNullString() {
		if (data[pos * 1736753585] != 0) {
			return readString();
		} else {
			pos += 1303963473;
			return null;
		}
	}

	public String readString() {
		int var2 = pos * 1736753585;

		while (data[(pos += 1303963473) * 1736753585 - 1] != 0) {
			;
		}

		int var3 = pos * 1736753585 - var2 - 1;
		return var3 == 0 ? "" : Class66.method893(data, var2, var3, 1956190973);
	}

	public String method1878() {
		byte var2 = data[(pos += 1303963473) * 1736753585 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = pos * 1736753585;

			while (data[(pos += 1303963473) * 1736753585 - 1] != 0) {
				;
			}

			int var4 = pos * 1736753585 - var3 - 1;
			return var4 == 0 ? "" : Class66.method893(data, var3, var4, 1579949569);
		}
	}

	public void writeShortA(int var1) {
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 8);
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 + 128);
	}

	public void readBytes(byte[] dest, int start, int len) {
		for (int ptr = start; ptr < len + start; ptr++) {
			dest[ptr] = data[(pos += 1303963473) * 1736753585 - 1];
		}
	}

	public int method1881() {
		int var2 = data[pos * 1736753585] & 255;
		return var2 < 128 ? readUByte() - 64 : readUShort() - 49152;
	}

	public int readCompact() {
		int var2 = data[pos * 1736753585] & 255;
		return var2 < 128 ? readUByte() : readUShort() - 32768;
	}

	public int method1883() {
		return data[pos * 1736753585] < 0 ? readInt() & 2147483647 : readUShort();
	}

	public void method1885(int[] var1) {
		int var3 = pos * 1736753585 / 8;
		pos = 0;

		for (int var4 = 0; var4 < var3; var4++) {
			int var9 = readInt();
			int var6 = readInt();
			int var7 = 0;
			int var8 = -1640531527;

			for (int var5 = 32; var5-- > 0; var6 += var9 + (var9 << 4 ^ var9 >>> 5) ^ var7 + var1[var7 >>> 11 & 3]) {
				var9 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
				var7 += var8;
			}

			pos -= 1841773192;
			writeInt(var9);
			writeInt(var6);
		}
	}

	public void method1887(int[] var1, int var2, int var3) {
		int var5 = pos * 1736753585;
		pos = var2 * 1303963473;
		int var7 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var7; var6++) {
			int var11 = readInt();
			int var8 = readInt();
			int var9 = 0;
			int var10 = -1640531527;

			for (int var12 = 32; var12-- > 0; var8 += (var11 << 4 ^ var11 >>> 5) + var11 ^ var1[var9 >>> 11 & 3] + var9) {
				var11 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
				var9 += var10;
			}

			pos -= 1841773192;
			writeInt(var11);
			writeInt(var8);
		}

		pos = var5 * 1303963473;
	}

	public void method1888(int[] var1, int var2, int var3) {
		int var5 = pos * 1736753585;
		pos = var2 * 1303963473;
		int var7 = (var3 - var2) / 8;

		for (int var8 = 0; var8 < var7; var8++) {
			int var6 = readInt();
			int var9 = readInt();
			int var10 = -957401312;
			int var11 = -1640531527;

			for (int var12 = 32; var12-- > 0; var6 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3]) {
				var9 -= var6 + (var6 << 4 ^ var6 >>> 5) ^ var1[var10 >>> 11 & 3] + var10;
				var10 -= var11;
			}

			pos -= 1841773192;
			writeInt(var6);
			writeInt(var9);
		}

		pos = var5 * 1303963473;
	}

	public int method1890(int var1) {
		int var3 = Class3.method114(data, var1, pos * 1736753585, 59142782);
		writeInt(var3);
		return var3;
	}

	public int readULEShort() {
		pos -= 1687040350;
		return (data[pos * 1736753585 - 2] & 255) + ((data[pos * 1736753585 - 1] & 255) << 8);
	}

	public int readUByteA() {
		return data[(pos += 1303963473) * 1736753585 - 1] - 128 & 255;
	}

	public int readUByteN() {
		return 0 - data[(pos += 1303963473) * 1736753585 - 1] & 255;
	}

	public int readUByteS() {
		return 128 - data[(pos += 1303963473) * 1736753585 - 1] & 255;
	}

	public byte method1898() {
		return (byte) (data[(pos += 1303963473) * 1736753585 - 1] - 128);
	}

	public byte readSByte() {
		return (byte) (128 - data[(pos += 1303963473) * 1736753585 - 1]);
	}

	public void writeShortLE(int var1) {
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) var1;
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 8);
	}

	public int readUShortA() {
		pos -= 1687040350;
		return ((data[pos * 1736753585 - 2] & 255) << 8) + (data[pos * 1736753585 - 1] - 128 & 255);
	}

	public int method1907() {
		pos -= 1687040350;
		int var2 = ((data[pos * 1736753585 - 2] & 255) << 8) + (data[pos * 1736753585 - 1] - 128 & 255);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int method1908() {
		pos -= 1687040350;
		int var2 = ((data[pos * 1736753585 - 1] & 255) << 8) + (data[pos * 1736753585 - 2] - 128 & 255);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int method1910() {
		pos -= 383076877;
		return ((data[pos * 1736753585 - 3] & 255) << 16) + ((data[pos * 1736753585 - 1] & 255) << 8) + (data[pos * 1736753585 - 2] & 255);
	}

	public void writeIntv2(int var1) {
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 16);
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 24);
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) var1;
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 8);
	}

	public int readIntV1() {
		pos += 920886596;
		return ((data[pos * 1736753585 - 1] & 255) << 16) + ((data[pos * 1736753585 - 2] & 255) << 24) + ((data[pos * 1736753585 - 4] & 255) << 8) + (data[pos * 1736753585 - 3] & 255);
	}

	public int readIntV2() {
		pos += 920886596;
		return (data[pos * 1736753585 - 2] & 255) + ((data[pos * 1736753585 - 4] & 255) << 16) + ((data[pos * 1736753585 - 3] & 255) << 24) + ((data[pos * 1736753585 - 1] & 255) << 8);
	}

	public void method1917(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var2 + var3; var5++) {
			var1[var5] = (byte) (data[(pos += 1303963473) * 1736753585 - 1] - 128);
		}
	}

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			int var1 = var0;

			for (int var2 = 0; var2 < 8; var2++) {
				if ((var1 & 1) == 1) {
					var1 = var1 >>> 1 ^ -306674912;
				} else {
					var1 >>>= 1;
				}
			}

			anIntArray1833[var0] = var1;
		}
	}

	public void writeBytes(byte[] src, int start, int len) {
		for (int var5 = start; var5 < start + len; var5++) {
			data[(pos += 1303963473) * 1736753585 - 1] = src[var5];
		}
	}

	public void writeByteA(int var1) {
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (128 + var1);
	}

	public void writeLEShortA(int var1) {
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 + 128);
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 8);
	}

	public void method1956(int var1) {
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 8);
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 16);
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) var1;
	}

	public void doRsa(BigInteger exp, BigInteger mod) {
		if (Loader.local)
			return;
		int start = pos * 1736753585;
		pos = 0;
		byte[] original = new byte[start];
		readBytes(original, 0, start);
		BigInteger curdata = new BigInteger(original);
		BigInteger encrypted = curdata.modPow(exp, mod);
		byte[] encdata = encrypted.toByteArray();
		pos = 0;

		writeShort(encdata.length);
		writeBytes(encdata, 0, encdata.length);
	}

	public void method1996(CharSequence var1) {
		int var3 = var1.length();
		int var9 = 0;

		int var5;
		for (var5 = 0; var5 < var3; var5++) {
			char var6 = var1.charAt(var5);
			if (var6 <= 127) {
				++var9;
			} else if (var6 <= 2047) {
				var9 += 2;
			} else {
				var9 += 3;
			}
		}

		data[(pos += 1303963473) * 1736753585 - 1] = 0;
		method2019(var9);
		var9 = pos;
		byte[] var13 = data;
		int var10 = pos * 1736753585;
		int var4 = var1.length();
		int var7 = var10;

		for (int var11 = 0; var11 < var4; var11++) {
			char var8 = var1.charAt(var11);
			if (var8 <= 127) {
				var13[var7++] = (byte) var8;
			} else if (var8 <= 2047) {
				var13[var7++] = (byte) (192 | var8 >> 6);
				var13[var7++] = (byte) (128 | var8 & 63);
			} else {
				var13[var7++] = (byte) (224 | var8 >> 12);
				var13[var7++] = (byte) (128 | var8 >> 6 & 63);
				var13[var7++] = (byte) (128 | var8 & 63);
			}
		}

		var5 = var7 - var10;
		pos = var9 + var5 * 1303963473;
	}

	public int readIntLE() {
		pos += 920886596;
		return ((data[pos * 1736753585 - 1] & 255) << 24) + ((data[pos * 1736753585 - 2] & 255) << 16) + ((data[pos * 1736753585 - 3] & 255) << 8) + (data[pos * 1736753585 - 4] & 255);
	}

	public int readUShortLEA() {
		pos -= 1687040350;
		return (data[pos * 1736753585 - 2] - 128 & 255) + ((data[pos * 1736753585 - 1] & 255) << 8);
	}

	public void writeByteN(int var1) {
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (0 - var1);
	}

	public void method2019(int var1) {
		if ((var1 & -128) != 0) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0) {
						writeByte(var1 >>> 28 | 128);
					}

					writeByte(var1 >>> 21 | 128);
				}

				writeByte(var1 >>> 14 | 128);
			}

			writeByte(var1 >>> 7 | 128);
		}

		writeByte(var1 & 127);
	}

	public String method2021() {
		byte var2 = data[(pos += 1303963473) * 1736753585 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = method2075(-2040339769);
			if (var3 + pos * 1736753585 > data.length) {
				throw new IllegalStateException("");
			} else {
				String var4 = Class103.method1268(data, pos * 1736753585, var3, 1179430365);
				pos += var3 * 1303963473;
				return var4;
			}
		}
	}

	static final void method2033(Player var0, int var1, int var2, int var3, int var4) {
		if (Player.me != var0) {
			if (GameClient.menuActionPtr * 1324290403 < 400) {
				int var6;
				String var10;
				if (var0.anInt2817 * 1775825441 == 0) {
					String var7 = var0.aString2835;
					var6 = var0.anInt2818 * 2145271731;
					int var9 = Player.me.anInt2818 * 2145271731;
					int var8 = var9 - var6;
					String var5;
					if (var8 < -9) {
						var5 = Class22.hexColTag(16711680);
					} else if (var8 < -6) {
						var5 = Class22.hexColTag(16723968);
					} else if (var8 < -3) {
						var5 = Class22.hexColTag(16740352);
					} else if (var8 < 0) {
						var5 = Class22.hexColTag(16756736);
					} else if (var8 > 9) {
						var5 = Class22.hexColTag(65280);
					} else if (var8 > 6) {
						var5 = Class22.hexColTag(4259584);
					} else if (var8 > 3) {
						var5 = Class22.hexColTag(8453888);
					} else if (var8 > 0) {
						var5 = Class22.hexColTag(12648192);
					} else {
						var5 = Class22.hexColTag(16776960);
					}

					var10 = var7 + var5 + " " + Class37.BRACK_OPEN + Class90.LEVEL_ + var0.anInt2818 * 2145271731 + Class37.BRACK_CLOSE;
				} else {
					var10 = var0.aString2835 + " " + Class37.BRACK_OPEN + Class90.SKILL_ + var0.anInt2817 * 1775825441 + Class37.BRACK_CLOSE;
				}

				int var12;
				if (GameClient.anInt3018 * -1710049223 == 1) {
					Class1.addMenuOption(Class90.USE, GameClient.aString3019 + " " + Class37.ARROW_RIGHT + " " + Class22.hexColTag(16777215) + var10, 14, var1, var2, var3);
				} else if (GameClient.isPickingOption) {
					if ((Class48.currentInterfaceOptions * 253871613 & 8) == 8) {
						Class1.addMenuOption(GameClient.currentInterfaceAction, GameClient.aString2967 + " " + Class37.ARROW_RIGHT + " " + Class22.hexColTag(16777215) + var10, 15, var1, var2, var3);
					}
				} else {
					for (var12 = 7; var12 >= 0; --var12) {
						if (GameClient.aStringArray2994[var12] != null) {
							short var13 = 0;
							if (GameClient.aStringArray2994[var12].equalsIgnoreCase(Class90.ATTACK)) {
								if (GameClient.aClass42_2887 == Class42.aClass42_599 || GameClient.aClass42_2887 == Class42.aClass42_604 && var0.anInt2818 * 2145271731 > Player.me.anInt2818 * 2145271731) {
									var13 = 2000;
								}

								if (Player.me.anInt2832 * -1891106653 != 0 && var0.anInt2832 * -1891106653 != 0) {
									if (Player.me.anInt2832 * -1891106653 == var0.anInt2832 * -1891106653) {
										var13 = 2000;
									} else {
										var13 = 0;
									}
								}
							} else if (GameClient.aBoolArray3008[var12]) {
								var13 = 2000;
							}

							boolean var11 = false;
							var6 = GameClient.anIntArray2993[var12] + var13;
							Class1.addMenuOption(GameClient.aStringArray2994[var12], Class22.hexColTag(16777215) + var10, var6, var1, var2, var3);
						}
					}
				}

				for (var12 = 0; var12 < GameClient.menuActionPtr * 1324290403; var12++) {
					if (GameClient.menuCommands[var12] == 23) {
						GameClient.menuOptionTexts[var12] = Class22.hexColTag(16777215) + var10;
						break;
					}
				}

			}
		}
	}

	public byte method2044(byte var1) {
		return (byte) (0 - data[(pos += 1303963473) * 1736753585 - 1]);
	}

	public void writeIntV1(int var1) {
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 8);
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) var1;
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 24);
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (var1 >> 16);
	}

	public DataBuffer(int var1) {
		data = Class57.method793(var1, -670647699);
		pos = 0;
	}

	public void method2066(int[] var1) {
		int var3 = pos * 1736753585 / 8;
		pos = 0;

		for (int var4 = 0; var4 < var3; var4++) {
			int var6 = readInt();
			int var8 = readInt();
			int var7 = -957401312;
			int var5 = -1640531527;

			for (int var9 = 32; var9-- > 0; var6 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var7 + var1[var7 & 3]) {
				var8 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 >>> 11 & 3];
				var7 -= var5;
			}

			pos -= 1841773192;
			writeInt(var6);
			writeInt(var8);
		}

	}

	public void writeShortSize(int size) {
		data[pos * 1736753585 - size - 2] = (byte) (size >> 8);
		data[pos * 1736753585 - size - 1] = (byte) size;
	}

	public void method2069(int var1) {
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (128 - var1);
	}

	public int method2075(int var1) {
		byte var2 = data[(pos += 1303963473) * 1736753585 - 1];

		int var3;
		for (var3 = 0; var2 < 0; var2 = data[(pos += 1303963473) * 1736753585 - 1]) {
			var3 = (var3 | var2 & 127) << 7;
		}

		return var3 | var2;
	}

	public boolean method2086() {
		pos -= 920886596;
		int var3 = Class3.method114(data, 0, pos * 1736753585, 59142782);
		int var2 = readInt();
		return var2 == var3;
	}

	public static void method2087(IndexDescriptor var0, IndexDescriptor var1, boolean var2, CacheableEntry_Sub23_Sub14_Sub4_Sub1 var3, byte var4) {
		ItemDef.configIndex2 = var0;
		Class79.aIndexDescriptor_950 = var1;
		Class136.aBool1607 = var2;
		ItemDef.anInt2111 = ItemDef.configIndex2.numFilesInContainer(10) * 1768098109;
		LinkedEntry_Sub20.aClass109_Sub23_Sub14_Sub4_Sub1_2075 = var3;
	}

	public static int method2088(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if ((var5 & 1) == 1) {
			int var7 = var3;
			var3 = var4;
			var4 = var7;
		}

		var2 &= 3;
		return var2 == 0 ? var0 : (var2 == 1 ? var1 : (var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1)));
	}

}
