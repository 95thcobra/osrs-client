import java.util.Comparator;

final class Class131 implements Comparator {

	static InterfaceDef aInterfaceDef_1585;

	int method1603(Class117 var1, Class117 var2, byte var3) {
		return var1.anInt1529 * 1435047135 < var2.anInt1529 * 1435047135 ? -1 : (var1.anInt1529 * 1435047135 == var2.anInt1529 * 1435047135 ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return method1603((Class117) var1, (Class117) var2, (byte) 53);
	}

	public static int method1611(int var0, int var1, int var2, int var3) {
		var2 &= 3;
		return var2 == 0 ? var1 : (var2 == 1 ? 7 - var0 : (var2 == 2 ? 7 - var1 : var0));
	}

}
