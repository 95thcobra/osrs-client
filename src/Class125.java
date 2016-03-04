import java.util.Iterator;

public class Class125 implements Iterable {

	public CacheableEntry aClass109_Sub23_1565 = new CacheableEntry();

	public void method1552(CacheableEntry var1) {
		if (var1.aClass109_Sub23_2086 != null) {
			var1.method2209();
		}

		var1.aClass109_Sub23_2086 = aClass109_Sub23_1565.aClass109_Sub23_2086;
		var1.aClass109_Sub23_2085 = aClass109_Sub23_1565;
		var1.aClass109_Sub23_2086.aClass109_Sub23_2085 = var1;
		var1.aClass109_Sub23_2085.aClass109_Sub23_2086 = var1;
	}

	public void method1553() {
		while (aClass109_Sub23_1565.aClass109_Sub23_2085 != aClass109_Sub23_1565) {
			aClass109_Sub23_1565.aClass109_Sub23_2085.method2209();
		}

	}

	public Class125() {
		aClass109_Sub23_1565.aClass109_Sub23_2085 = aClass109_Sub23_1565;
		aClass109_Sub23_1565.aClass109_Sub23_2086 = aClass109_Sub23_1565;
	}

	public Iterator iterator() {
		return new Class112(this);
	}

}
