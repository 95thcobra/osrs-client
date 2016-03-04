public final class Class128 {

	int anInt1573;
	CacheableEntry aClass109_Sub23_1572 = new CacheableEntry();
	Class116 aClass116_1574 = new Class116();
	int anInt1575;
	JagexMap aJagexMap_1571;

	public void put(CacheableEntry var1, long var2) {
		if (anInt1573 == 0) {
			CacheableEntry var4 = aClass116_1574.method1468();
			var4.unlink();
			var4.method2209();
			if (var4 == aClass109_Sub23_1572) {
				var4 = aClass116_1574.method1468();
				var4.unlink();
				var4.method2209();
			}
		} else {
			--anInt1573;
		}

		aJagexMap_1571.put(var1, var2);
		aClass116_1574.method1460(var1);
	}

	public CacheableEntry get(long var1) {
		CacheableEntry var3 = (CacheableEntry) aJagexMap_1571.get(var1);
		if (var3 != null) {
			aClass116_1574.method1460(var3);
		}

		return var3;
	}

	public void method1579() {
		aClass116_1574.method1464();
		aJagexMap_1571.method1546();
		aClass109_Sub23_1572 = new CacheableEntry();
		anInt1573 = anInt1575;
	}

	public Class128(int var1) {
		anInt1575 = var1;
		anInt1573 = var1;

		int var2;
		for (var2 = 1; var2 + var2 < var1; var2 += var2) {
			;
		}

		aJagexMap_1571 = new JagexMap(var2);
	}

	public void method1582(long var1) {
		CacheableEntry var3 = (CacheableEntry) aJagexMap_1571.get(var1);
		if (var3 != null) {
			var3.unlink();
			var3.method2209();
			++anInt1573;
		}

	}

}
