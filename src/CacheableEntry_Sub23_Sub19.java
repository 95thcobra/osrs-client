public class CacheableEntry_Sub23_Sub19 extends CacheableEntry {

	int anInt2446;
	byte aByte2447;
	public static final int anInt2448 = 125;
	static final int anInt2449 = 2;
	IndexDescriptor_Sub1 aClass94_Sub1_2450;

	public static int method2828(CharSequence var0) {
		int var2 = var0.length();
		int var3 = 0;

		for (int var4 = 0; var4 < var2; var4++) {
			var3 = (var3 << 5) - var3 + var0.charAt(var4);
		}

		return var3;
	}

}
