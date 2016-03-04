import java.util.Comparator;

final class Class110 implements Comparator {

	static final int anInt1515 = 3;

	int method1387(Class117 var1, Class117 var2, byte var3) {
		return var1.aGrandExchangeOffer_1530.anInt1586 * 1903220993 < var2.aGrandExchangeOffer_1530.anInt1586 * 1903220993 ? -1 : (var1.aGrandExchangeOffer_1530.anInt1586 * 1903220993 == var2.aGrandExchangeOffer_1530.anInt1586 * 1903220993 ? 0 : 1);
	}

	public static CacheableEntry_Sub23_Sub1 method1388(int var0, int var1) {
		CacheableEntry_Sub23_Sub1 var2 = (CacheableEntry_Sub23_Sub1) CacheableEntry_Sub23_Sub1.aClass128_2089.get((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = CacheableEntry_Sub23_Sub1.aIndexDescriptor_2092.getFileData(5, var0);
			var2 = new CacheableEntry_Sub23_Sub1();
			if (var3 != null) {
				var2.method2214(new DataBuffer(var3), -273282240);
			}

			CacheableEntry_Sub23_Sub1.aClass128_2089.put(var2, (long) var0);
			return var2;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return method1387((Class117) var1, (Class117) var2, (byte) -1);
	}

}
