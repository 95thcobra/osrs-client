public class Class103 {

	static final int anInt1448 = 4;
	public static final int anInt1449 = 86;

	Class103() throws Throwable {
		throw new Error();
	}

	public static String method1268(byte[] var0, int var1, int var2, int var3) {
		char[] var4 = new char[var2];
		int var9 = 0;
		int var7 = var1;

		int var5;
		for (int var6 = var1 + var2; var7 < var6; var4[var9++] = (char) var5) {
			int var8 = var0[var7++] & 255;
			if (var8 < 128) {
				if (var8 == 0) {
					var5 = 65533;
				} else {
					var5 = var8;
				}
			} else if (var8 < 192) {
				var5 = 65533;
			} else if (var8 < 224) {
				if (var7 < var6 && (var0[var7] & 192) == 128) {
					var5 = (var8 & 31) << 6 | var0[var7++] & 63;
					if (var5 < 128) {
						var5 = 65533;
					}
				} else {
					var5 = 65533;
				}
			} else if (var8 < 240) {
				if (1 + var7 < var6 && (var0[var7] & 192) == 128 && (var0[var7 + 1] & 192) == 128) {
					var5 = (var8 & 15) << 12 | (var0[var7++] & 63) << 6 | var0[var7++] & 63;
					if (var5 < 2048) {
						var5 = 65533;
					}
				} else {
					var5 = 65533;
				}
			} else if (var8 < 248) {
				if (var7 + 2 < var6 && (var0[var7] & 192) == 128 && (var0[var7 + 1] & 192) == 128 && (var0[2 + var7] & 192) == 128) {
					var5 = (var8 & 7) << 18 | (var0[var7++] & 63) << 12 | (var0[var7++] & 63) << 6 | var0[var7++] & 63;
					if (var5 >= 65536 && var5 <= 1114111) {
						var5 = 65533;
					} else {
						var5 = 65533;
					}
				} else {
					var5 = 65533;
				}
			} else {
				var5 = 65533;
			}
		}

		return new String(var4, 0, var9);
	}

}
