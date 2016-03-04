public class Class96 {

	public static final int anInt1375 = 16777216;
	public static final int anInt1376 = 38;

	Class96() throws Throwable {
		throw new Error();
	}

	static final void method1231(InterfaceDef var0, int var1, int var2, int var3) {
		if (GameClient.anInt2901 * 382216283 == 0 || GameClient.anInt2901 * 382216283 == 3) {
			if (Class74.anInt903 * 332680755 == 1 || !Class46.aBool651 && Class74.anInt903 * 332680755 == 4) {
				CacheableEntry_Sub23_Sub18 var10 = var0.method2159((byte) 31);
				if (var10 == null) {
					return;
				}

				int var7 = Class74.anInt891 * 1837550337 - var1;
				int var5 = Class74.anInt905 * -1013575437 - var2;
				if (var10.method2826(var7, var5, -1653816978)) {
					var7 -= var10.anInt2439 * -2016633209 / 2;
					var5 -= var10.anInt2438 * -633411239 / 2;
					int var4 = GameClient.anInt2948 * -1072839225 + GameClient.anInt2880 * 1847328669 & 2047;
					int var8 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2719[var4];
					int var6 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2720[var4];
					var8 = (256 + GameClient.anInt2936 * 461573195) * var8 >> 8;
					var6 = var6 * (GameClient.anInt2936 * 461573195 + 256) >> 8;
					int var12 = var5 * var8 + var7 * var6 >> 11;
					int var9 = var5 * var6 - var7 * var8 >> 11;
					int var11 = var12 + Player.me.anInt2521 * -1051150961 >> 7;
					int var13 = Player.me.anInt2505 * -844883935 - var9 >> 7;
					GameClient.secureBuffer.writeOpcode(70);
					GameClient.secureBuffer.writeByte(18);
					GameClient.secureBuffer.writeByteN(Class65.aBoolArray820[82] ? (Class65.aBoolArray820[81] ? 2 : 1) : 0);
					GameClient.secureBuffer.writeShortA(var13 + LinkedEntry_Sub13.anInt1825 * 803568843);
					GameClient.secureBuffer.writeLEShortA(Class35.anInt478 * -1719983039 + var11);
					GameClient.secureBuffer.writeByte(var7);
					GameClient.secureBuffer.writeByte(var5);
					GameClient.secureBuffer.writeShort(GameClient.anInt2948 * -1072839225);
					GameClient.secureBuffer.writeByte(57);
					GameClient.secureBuffer.writeByte(GameClient.anInt2880 * 1847328669);
					GameClient.secureBuffer.writeByte(GameClient.anInt2936 * 461573195);
					GameClient.secureBuffer.writeByte(89);
					GameClient.secureBuffer.writeShort(Player.me.anInt2521 * -1051150961);
					GameClient.secureBuffer.writeShort(Player.me.anInt2505 * -844883935);
					GameClient.secureBuffer.writeByte(63);
					GameClient.mapMarkerX = var11 * -2075522063;
					GameClient.mapMarkerZ = var13 * -700155223;
				}
			}

		}
	}

	static String method1232(int var0, int var1) {
		return "<img=" + var0 + ">";
	}

}
