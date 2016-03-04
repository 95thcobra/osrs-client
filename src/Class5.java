public class Class5 {

	public static final int anInt86 = 9;
	int anInt87;
	public static final int anInt88 = 207;
	int anInt89;
	String aString90;
	public static final int anInt91 = 110;
	static final String aString92 = "random.dat";
	int anInt93;
	public static final int anInt94 = 195;
	static final int anInt95 = 15;
	int anInt96;
	static final int anInt97 = 1;
	public static int anInt98;

	public static void method135(IndexDescriptor var0, byte var1) {
		CacheableEntry_Sub23_Sub6.aIndexDescriptor_2208 = var0;
	}

	public static void method136(int var0) {
		ItemDef.aClass128_2117.method1579();
	}

	static void method137(InterfaceDef var0, int var1, int var2, boolean var3, int var4) {
		int var5 = var0.anInt1954 * 2096072399;
		int var6 = var0.invsize * 539675235;
		if (var0.anInt1964 * -865812299 == 0) {
			var0.anInt1954 = var0.anInt1950 * -311266815;
		} else if (var0.anInt1964 * -865812299 == 1) {
			var0.anInt1954 = (var1 - var0.anInt1950 * -769280817) * -517619665;
		} else if (var0.anInt1964 * -865812299 == 2) {
			var0.anInt1954 = (var0.anInt1950 * -769280817 * var1 >> 14) * -517619665;
		}

		if (var0.anInt1977 * -39629627 == 0) {
			var0.invsize = var0.anInt1953 * -71498513;
		} else if (var0.anInt1977 * -39629627 == 1) {
			var0.invsize = (var2 - var0.anInt1953 * 791903853) * -189135029;
		} else if (var0.anInt1977 * -39629627 == 2) {
			var0.invsize = (var2 * var0.anInt1953 * 791903853 >> 14) * -189135029;
		}

		if (var0.anInt1964 * -865812299 == 4) {
			var0.anInt1954 = var0.anInt1956 * -292993385 * var0.invsize * 539675235 / (var0.anInt1957 * 2112087779) * -517619665;
		}

		if (var0.anInt1977 * -39629627 == 4) {
			var0.invsize = var0.anInt1954 * 2096072399 * var0.anInt1957 * 2112087779 / (var0.anInt1956 * -292993385) * -189135029;
		}

		if (GameClient.enableQAInterfaceDebug && var0.contenttype * -1878336627 == 0) {
			if (var0.invsize * 539675235 < 5 && var0.anInt1954 * 2096072399 < 5) {
				var0.invsize = -945675145;
				var0.anInt1954 = 1706868971;
			} else {
				if (var0.invsize * 539675235 <= 0) {
					var0.invsize = -945675145;
				}

				if (var0.anInt1954 * 2096072399 <= 0) {
					var0.anInt1954 = 1706868971;
				}
			}
		}

		if (var0.anInt1943 * -202095703 == 1337) {
			GameClient.aInterfaceDef_3037 = var0;
		}

		if (var3 && var0.anObjectArray2046 != null && (var5 != var0.anInt1954 * 2096072399 || var6 != var0.invsize * 539675235)) {
			ScriptInvocation var7 = new ScriptInvocation();
			var7.inter = var0;
			var7.parameters = var0.anObjectArray2046;
			GameClient.scriptInvocationQueue.add(var7);
		}

	}

	static final void method138(int var0, int var1, byte var2) {
		if (ItemContainer.method1840(var0)) {
			Class76.method1032(InterfaceDef.aInterfaceDefArrayArray1975[var0], var1, 1840857963);
		}
	}

}
