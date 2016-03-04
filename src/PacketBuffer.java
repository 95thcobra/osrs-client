public final class PacketBuffer extends DataBuffer {

	protected static Class63 aClass63_2432;
	IsaacCipher cipher;
	int bitpos;
	static int[] anIntArray2428 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};

	public void setIsaacSeed(int[] var1) {
		cipher = new IsaacCipher(var1);
	}

	public void writeOpcode(int op) {
		//if (op != 100 && op != 46 && op != 25 && op != 112)
		System.out.println("Opcode " + op);
		data[(pos += 1303963473) * 1736753585 - 1] = (byte) (op + cipher.method821((byte) 31));
	}

	public int readOpcode() {
		return data[(pos += 1303963473) * 1736753585 - 1] - cipher.method821((byte) 50) & 255;
	}

	public void startBitMode() {
		bitpos = pos * -955684376;
	}

	public int readbits(int var1) {
		int var3 = bitpos * 1321162117 >> 3;
		int var4 = 8 - (bitpos * 1321162117 & 7);
		int var5 = 0;

		for (bitpos += var1 * -873899187; var1 > var4; var4 = 8) {
			var5 += (data[var3++] & anIntArray2428[var4]) << var1 - var4;
			var1 -= var4;
		}

		if (var4 == var1) {
			var5 += data[var3] & anIntArray2428[var4];
		} else {
			var5 += data[var3] >> var4 - var1 & anIntArray2428[var1];
		}

		return var5;
	}

	public void endBitMode() {
		pos = (bitpos * 1321162117 + 7) / 8 * 1303963473;
	}

	public int bitsReadable(int var1) {
		return var1 * 8 - bitpos * 1321162117;
	}

	public PacketBuffer(int var1) {
		super(var1);
	}

	static final void method2822(String var0, int var1) {
		if (var0 != null) {
			if ((GameClient.anInt2984 * 389772333 < 200 || GameClient.member * -1090925967 == 1) && GameClient.anInt2984 * 389772333 < 400) {
				String var4 = Class38.method497(var0, GameClient.aClass119_2919, -1527704141);
				if (var4 != null) {
					String var3;
					int var5;
					String var6;
					for (var5 = 0; var5 < GameClient.anInt2984 * 389772333; var5++) {
						Class46 var2 = GameClient.aClass46Array3136[var5];
						var3 = Class38.method497(var2.aString658, GameClient.aClass119_2919, -1950750634);
						if (var3 != null && var3.equals(var4)) {
							Class93.method1145(30, "", var0 + Class90.aString1223);
							return;
						}

						if (var2.aString647 != null) {
							var6 = Class38.method497(var2.aString647, GameClient.aClass119_2919, -2090291278);
							if (var6 != null && var6.equals(var4)) {
								Class93.method1145(30, "", var0 + Class90.aString1223);
								return;
							}
						}
					}

					for (var5 = 0; var5 < GameClient.anInt3138 * 601840989; var5++) {
						Class41 var7 = GameClient.aClass41Array2895[var5];
						var3 = Class38.method497(var7.aString597, GameClient.aClass119_2919, -1982342766);
						if (var3 != null && var3.equals(var4)) {
							Class93.method1145(30, "", Class90.aString1084 + var0 + Class90.aString1229);
							return;
						}

						if (var7.aString586 != null) {
							var6 = Class38.method497(var7.aString586, GameClient.aClass119_2919, -1803011952);
							if (var6 != null && var6.equals(var4)) {
								Class93.method1145(30, "", Class90.aString1084 + var0 + Class90.aString1229);
								return;
							}
						}
					}

					if (Class38.method497(Player.me.aString2835, GameClient.aClass119_2919, -1937972668).equals(var4)) {
						Class93.method1145(30, "", Class90.aString1226);
					} else {
						GameClient.secureBuffer.writeOpcode(137);
						GameClient.secureBuffer.writeByte(Class56.calcStringBytes(var0));
						GameClient.secureBuffer.writeStr(var0);
					}
				}
			} else {
				Class93.method1145(30, "", Class90.aString1312);
			}
		}
	}

}
