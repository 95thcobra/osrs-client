import java.util.Comparator;

final class Class25 implements Comparator {

	static final int anInt322 = 48;
	public static final int anInt323 = 175;
	// $FF: synthetic field
	boolean val$preferOwnWorld;

	int method361(Class117 var1, Class117 var2, int var3) {
		if (var2.anInt1529 * 1435047135 == var1.anInt1529 * 1435047135) {
			return 0;
		} else {
			if (val$preferOwnWorld) {
				if (GameClient.anInt2872 * 1425499025 == var1.anInt1529 * 1435047135) {
					return -1;
				}

				if (GameClient.anInt2872 * 1425499025 == var2.anInt1529 * 1435047135) {
					return 1;
				}
			}

			return var1.anInt1529 * 1435047135 < var2.anInt1529 * 1435047135 ? -1 : 1;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	Class25(boolean var1) {
		val$preferOwnWorld = var1;
	}

	public int compare(Object var1, Object var2) {
		return method361((Class117) var1, (Class117) var2, -1775411380);
	}

	static byte[] method368(byte[] var0, int var1) {
		int var2 = var0.length;
		byte[] var3 = new byte[var2];
		System.arraycopy(var0, 0, var3, 0, var2);
		return var3;
	}

}
