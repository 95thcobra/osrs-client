public class Class118 {

	static final int anInt1534 = 24;
	static final int anInt1536 = 3;
	static CacheableEntry_Sub23_Sub14_Sub1[] aClass109_Sub23_Sub14_Sub1Array1537;
	public static Class120 aClass120_1535 = new Class120();

	Class118() throws Throwable {
		throw new Error();
	}

	static final void method1490(byte var0) {
		if (Class98.loginConnection != null) {
			if (var0 <= 0) {
				return;
			}

			Class98.loginConnection.terminate();
			Class98.loginConnection = null;
		}

		ObjectDef.method2469(1413384285);
		LinkedEntry_Sub6.aClass39_1732.method501();

		for (int var1 = 0; var1 < 4; var1++) {
			if (var0 <= 0) {
				return;
			}

			GameClient.aClass141Array2923[var1].method1701((byte) 80);
		}

		System.gc();
		IndexDescriptor_Sub1.method2148(2, 1582807555);
		GameClient.anInt3105 = 32697485;
		GameClient.aBool2941 = false;
		Class10.method204(-1190779991);
		Class93.method1146(10, 2081748053);
	}

}
