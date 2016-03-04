public class Class54 {

	static IndexDescriptor_Sub1 aClass94_Sub1_724;
	public static final int anInt725 = 135;
	public static final int anInt726 = 4;
	static final int anInt727 = 14;
	static LinkedEntry_Sub8[] aClass109_Sub8Array728;
	static final int anInt729 = 128;

	Class54() throws Throwable {
		throw new Error();
	}

	static void method783(InterfaceDef var0, int var1, int var2, int var3) {
		if (var0.anInt1944 * 282167005 == 0) {
			var0.anInt1952 = var0.anInt1946 * 208152933;
		} else if (var0.anInt1944 * 282167005 == 1) {
			var0.anInt1952 = (var0.anInt1946 * 1254348635 + (var1 - var0.anInt1954 * 2096072399) / 2) * 1134861887;
		} else if (var0.anInt1944 * 282167005 == 2) {
			var0.anInt1952 = (var1 - var0.anInt1954 * 2096072399 - var0.anInt1946 * 1254348635) * 1134861887;
		} else if (var0.anInt1944 * 282167005 == 3) {
			var0.anInt1952 = (var1 * var0.anInt1946 * 1254348635 >> 14) * 1134861887;
		} else if (var0.anInt1944 * 282167005 == 4) {
			var0.anInt1952 = ((var1 - var0.anInt1954 * 2096072399) / 2 + (var1 * var0.anInt1946 * 1254348635 >> 14)) * 1134861887;
		} else {
			var0.anInt1952 = (var1 - var0.anInt1954 * 2096072399 - (var0.anInt1946 * 1254348635 * var1 >> 14)) * 1134861887;
		}

		if (var0.anInt2020 * -1554609611 == 0) {
			var0.anInt1945 = var0.anInt1949 * -157841519;
		} else if (var0.anInt2020 * -1554609611 == 1) {
			var0.anInt1945 = ((var2 - var0.invsize * 539675235) / 2 + var0.anInt1949 * 1905475965) * -457688411;
		} else if (var0.anInt2020 * -1554609611 == 2) {
			var0.anInt1945 = (var2 - var0.invsize * 539675235 - var0.anInt1949 * 1905475965) * -457688411;
		} else if (var0.anInt2020 * -1554609611 == 3) {
			var0.anInt1945 = (var0.anInt1949 * 1905475965 * var2 >> 14) * -457688411;
		} else if (var0.anInt2020 * -1554609611 == 4) {
			var0.anInt1945 = ((var2 * var0.anInt1949 * 1905475965 >> 14) + (var2 - var0.invsize * 539675235) / 2) * -457688411;
		} else {
			var0.anInt1945 = (var2 - var0.invsize * 539675235 - (var0.anInt1949 * 1905475965 * var2 >> 14)) * -457688411;
		}

		if (GameClient.enableQAInterfaceDebug && var0.contenttype * -1878336627 == 0) {
			if (var0.anInt1952 * -18591297 < 0) {
				var0.anInt1952 = 0;
			} else if (var0.anInt1954 * 2096072399 + var0.anInt1952 * -18591297 > var1) {
				var0.anInt1952 = (var1 - var0.anInt1954 * 2096072399) * 1134861887;
			}

			if (var0.anInt1945 * -591061715 >= 0) {
				if (var0.anInt1945 * -591061715 + var0.invsize * 539675235 > var2) {
					var0.anInt1945 = (var2 - var0.invsize * 539675235) * -457688411;
				}
			} else {
				var0.anInt1945 = 0;
			}
		}

	}

	static void method784(InterfaceDef var0, int var1) {
		InterfaceDef var3 = var0.anInt1958 * -1588791493 == -1 ? null : Class50.method713(var0.anInt1958 * -1588791493, (byte) 22);
		int var2;
		int var4;
		if (var3 == null) {
			var4 = Class5.anInt98 * 2104430923;
			var2 = Class60.anInt769 * -1064642111;
		} else {
			var4 = var3.anInt1954 * 2096072399;
			var2 = var3.invsize * 539675235;
		}

		Class5.method137(var0, var4, var2, false, 1582812183);
		method783(var0, var4, var2, -886687558);
	}

}
