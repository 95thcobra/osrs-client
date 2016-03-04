public final class Class26 {

	int anInt324;
	int anInt325;
	int anInt326;
	int anInt327;
	int anInt328;
	static CacheableEntry_Sub23_Sub14_Sub1[] aClass109_Sub23_Sub14_Sub1Array329;
	public CacheableEntry_Sub23_Sub16 aClass109_Sub23_Sub16_330;
	public CacheableEntry_Sub23_Sub16 aClass109_Sub23_Sub16_333;
	public static final int anInt334 = 136;
	public int anInt331 = 0;
	int anInt332 = 0;

	public static void method369(int var0) {
		ItemDef.cache.method1579();
		ItemDef.aClass128_2116.method1579();
		ItemDef.aClass128_2117.method1579();
	}

	public static String method370(CharSequence var0) {
		int var2 = var0.length();
		StringBuilder var3 = new StringBuilder(var2);

		for (int var4 = 0; var4 < var2; var4++) {
			char var5 = var0.charAt(var4);
			if ((var5 < 97 || var5 > 122) && (var5 < 65 || var5 > 90) && (var5 < 48 || var5 > 57) && var5 != 46 && var5 != 45 && var5 != 42 && var5 != 95) {
				if (var5 == 32) {
					var3.append('+');
				} else {
					byte var7 = Class53.method782(var5, -1305953540);
					var3.append('%');
					int var6 = var7 >> 4 & 15;
					if (var6 >= 10) {
						var3.append((char) (55 + var6));
					} else {
						var3.append((char) (var6 + 48));
					}

					var6 = var7 & 15;
					if (var6 >= 10) {
						var3.append((char) (55 + var6));
					} else {
						var3.append((char) (48 + var6));
					}
				}
			} else {
				var3.append(var5);
			}
		}

		return var3.toString();
	}

}
