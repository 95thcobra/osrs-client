import java.util.Iterator;

public class Class112 implements Iterator {

	CacheableEntry aClass109_Sub23_1520 = null;
	CacheableEntry aClass109_Sub23_1519;
	Class125 aClass125_1518;

	public void remove() {
		if (aClass109_Sub23_1520 != null) {
			aClass109_Sub23_1520.method2209();
			aClass109_Sub23_1520 = null;
		} else {
			throw new IllegalStateException();
		}
	}

	public Object next() {
		CacheableEntry var1 = aClass109_Sub23_1519;
		if (var1 != aClass125_1518.aClass109_Sub23_1565) {
			aClass109_Sub23_1519 = var1.aClass109_Sub23_2085;
		} else {
			var1 = null;
			aClass109_Sub23_1519 = null;
		}

		aClass109_Sub23_1520 = var1;
		return var1;
	}

	Class112(Class125 var1) {
		aClass125_1518 = var1;
		aClass109_Sub23_1519 = aClass125_1518.aClass109_Sub23_1565.aClass109_Sub23_2085;
		aClass109_Sub23_1520 = null;
	}

	public boolean hasNext() {
		return aClass109_Sub23_1519 != aClass125_1518.aClass109_Sub23_1565;
	}

}
