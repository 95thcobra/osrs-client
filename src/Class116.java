public final class Class116 {

	CacheableEntry aClass109_Sub23_1527 = new CacheableEntry();

	public void method1460(CacheableEntry var1) {
		if (var1.aClass109_Sub23_2086 != null) {
			var1.method2209();
		}

		var1.aClass109_Sub23_2086 = aClass109_Sub23_1527.aClass109_Sub23_2086;
		var1.aClass109_Sub23_2085 = aClass109_Sub23_1527;
		var1.aClass109_Sub23_2086.aClass109_Sub23_2085 = var1;
		var1.aClass109_Sub23_2085.aClass109_Sub23_2086 = var1;
	}

	public void method1461(CacheableEntry var1) {
		if (var1.aClass109_Sub23_2086 != null) {
			var1.method2209();
		}

		var1.aClass109_Sub23_2086 = aClass109_Sub23_1527;
		var1.aClass109_Sub23_2085 = aClass109_Sub23_1527.aClass109_Sub23_2085;
		var1.aClass109_Sub23_2086.aClass109_Sub23_2085 = var1;
		var1.aClass109_Sub23_2085.aClass109_Sub23_2086 = var1;
	}

	public CacheableEntry method1463() {
		CacheableEntry var1 = aClass109_Sub23_1527.aClass109_Sub23_2085;
		return var1 != aClass109_Sub23_1527 ? var1 : null;
	}

	void method1464() {
		while (true) {
			CacheableEntry var1 = aClass109_Sub23_1527.aClass109_Sub23_2085;
			if (var1 == aClass109_Sub23_1527) {
				return;
			}

			var1.method2209();
		}
	}

	CacheableEntry method1468() {
		CacheableEntry var1 = aClass109_Sub23_1527.aClass109_Sub23_2085;
		if (var1 == aClass109_Sub23_1527) {
			return null;
		} else {
			var1.method2209();
			return var1;
		}
	}

	public Class116() {
		aClass109_Sub23_1527.aClass109_Sub23_2085 = aClass109_Sub23_1527;
		aClass109_Sub23_1527.aClass109_Sub23_2086 = aClass109_Sub23_1527;
	}

}
