public final class Class38 {

	static InterfaceDef[] aInterfaceDefArray503;
	int anInt504;
	int anInt505;
	int anInt506;
	public int anInt507;
	static final int anInt508 = 256;
	public CacheableEntry_Sub23_Sub16 aClass109_Sub23_Sub16_509;
	int anInt510;
	static CacheableEntry_Sub23_Sub14_Sub1[] aClass109_Sub23_Sub14_Sub1Array511;
	public static final int anInt512 = 132;
	public static final int anInt513 = 6;

	public static String method497(CharSequence var0, Class119 var1, int var2) {
		if (var0 == null) {
			return null;
		} else {
			int var4 = 0;

			int var3;
			for (var3 = var0.length(); var4 < var3 && CacheableEntry_Sub23_Sub16_Sub3.method2968(var0.charAt(var4), 696219286); var4++) {
				;
			}

			while (var3 > var4 && CacheableEntry_Sub23_Sub16_Sub3.method2968(var0.charAt(var3 - 1), 696219286)) {
				--var3;
			}

			int var7 = var3 - var4;
			if (var7 >= 1 && var7 <= Class34.method468(var1, -1373253709)) {
				StringBuilder var8 = new StringBuilder(var7);

				for (int var9 = var4; var9 < var3; var9++) {
					char var10 = var0.charAt(var9);
					boolean var11;
					if (Character.isISOControl(var10)) {
						var11 = false;
					} else if (Class31.method414(var10, -364521760)) {
						var11 = true;
					} else {
						char[] var6 = Class84.aCharArray996;
						int var5 = 0;

						label76:
						while (true) {
							char var12;
							if (var5 >= var6.length) {
								var6 = Class84.aCharArray999;

								for (var5 = 0; var5 < var6.length; var5++) {
									var12 = var6[var5];
									if (var12 == var10) {
										var11 = true;
										break label76;
									}
								}

								var11 = false;
								break;
							}

							var12 = var6[var5];
							if (var10 == var12) {
								var11 = true;
								break;
							}

							++var5;
						}
					}

					if (var11) {
						char var13 = Class65.method883(var10, (byte) 7);
						if (var13 != 0) {
							var8.append(var13);
						}
					}
				}

				if (var8.length() == 0) {
					return null;
				} else {
					return var8.toString();
				}
			} else {
				return null;
			}
		}
	}

	public static String method498(String var0, int var1) {
		int var2 = var0.length();
		char[] var3 = new char[var2];
		byte var7 = 2;

		for (int var5 = 0; var5 < var2; var5++) {
			char var4 = var0.charAt(var5);
			if (var7 == 0) {
				var4 = Character.toLowerCase(var4);
			} else if (var7 == 2 || Character.isUpperCase(var4)) {
				char var6;
				if (var4 != 181 && var4 != 402) {
					var6 = Character.toTitleCase(var4);
				} else {
					var6 = var4;
				}

				var4 = var6;
			}

			if (Character.isLetter(var4)) {
				var7 = 0;
			} else if (var4 != 46 && var4 != 63 && var4 != 33) {
				if (Character.isSpaceChar(var4)) {
					if (var7 != 2) {
						var7 = 1;
					}
				} else {
					var7 = 1;
				}
			} else {
				var7 = 2;
			}

			var3[var5] = var4;
		}

		return new String(var3);
	}

	static String[] prefixOptionArray(String[] options) {
		String[] result = new String[5];

		for (int i = 0; i < 5; i++) {
			result[i] = i + ": ";
			if (options != null && options[i] != null) {
				result[i] = result[i] + options[i];
			}
		}

		return result;
	}

}
