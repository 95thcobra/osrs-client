public class Class66 {

	static final int anInt836 = 24;
	public static final int anInt837 = 27;
	public static final int anInt838 = 37;
	static final int anInt839 = 1536;
	static int[] anIntArray840;
	public static final int anInt841 = 80;

	static void method890(short var0) {
		GameClient.secureBuffer.pos = 0;
		GameClient.gameBuffer.pos = 0;
		GameClient.incomingMessage = -426797213;
		GameClient.anInt2912 = 1437130987;
		GameClient.anInt2913 = 1540362023;
		GameClient.anInt2916 = 1844699783;
		GameClient.messageSize = 0;
		GameClient.anInt2910 = 0;
		GameClient.anInt2877 = 0;
		GameClient.menuActionPtr = 0;
		GameClient.aBool3006 = false;
		GameClient.anInt2901 = 0;
		GameClient.mapMarkerX = 0;

		int var1;
		for (var1 = 0; var1 < GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983.length; var1++) {
			if (GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var1] != null) {
				GameClient.aClass109_Sub23_Sub16_Sub2_Sub2Array2983[var1].facedEntity = -357265433;
			}
		}

		for (var1 = 0; var1 < GameClient.sceneNpcs.length; var1++) {
			if (GameClient.sceneNpcs[var1] != null) {
				GameClient.sceneNpcs[var1].facedEntity = -357265433;
			}
		}

		Class84.setupContainerMap();
		Class93.method1146(30, 1938270596);

		for (var1 = 0; var1 < 100; var1++) {
			GameClient.aBoolArray3072[var1] = true;
		}

		GameClient.secureBuffer.writeOpcode(141);
		GameClient.secureBuffer.writeByte(LinkedEntry_Sub5_Sub4.method2933(485599876));
		GameClient.secureBuffer.writeShort(Class5.anInt98 * 2104430923);
		GameClient.secureBuffer.writeShort(Class60.anInt769 * -1064642111);
	}

	public static String method893(byte[] var0, int var1, int var2, int var3) {
		char[] var4 = new char[var2];
		int var8 = 0;

		for (int var7 = 0; var7 < var2; var7++) {
			int var5 = var0[var7 + var1] & 255;
			if (var5 != 0) {
				if (var5 >= 128 && var5 < 160) {
					char var6 = Class91.aCharArray1332[var5 - 128];
					if (var6 == 0) {
						var6 = 63;
					}

					var5 = var6;
				}

				var4[var8++] = (char) var5;
			}
		}

		return new String(var4, 0, var8);
	}

	Class66() throws Throwable {
		throw new Error();
	}

	static void method894(InterfaceDef[] var0, int var1, int var2, int var3, boolean var4, int var5) {
		for (int var6 = 0; var6 < var0.length; var6++) {
			InterfaceDef var7 = var0[var6];
			if (var7 != null && var7.anInt1958 * -1588791493 == var1) {
				Class5.method137(var7, var2, var3, var4, -1071317722);
				Class54.method783(var7, var2, var3, -886687558);
				if (var7.anInt2070 * 706996303 > var7.anInt1962 * -538927815 - var7.anInt1954 * 2096072399) {
					var7.anInt2070 = var7.anInt1962 * -1956268041 - var7.anInt1954 * 1353472385;
				}

				if (var7.anInt2070 * 706996303 < 0) {
					var7.anInt2070 = 0;
				}

				if (var7.anInt2038 * -650026719 > var7.anInt1963 * -124837617 - var7.invsize * 539675235) {
					var7.anInt2038 = var7.anInt1963 * -282538961 - var7.invsize * 1999030019;
				}

				if (var7.anInt2038 * -650026719 < 0) {
					var7.anInt2038 = 0;
				}

				if (var7.contenttype * -1878336627 == 0) {
					Class57.method796(var0, var7, var4, 899200632);
				}
			}
		}

	}

}
