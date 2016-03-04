public abstract class LinkedEntry_Sub5 extends LinkedEntry {

	int anInt1712;
	LinkedEntry_Sub1 aClass109_Sub1_1713;
	LinkedEntry_Sub5 aClass109_Sub5_1714;
	volatile boolean aBool1715 = true;

	protected abstract int method1794();

	int method1795() {
		return 255;
	}

	protected abstract LinkedEntry_Sub5 method1796();

	protected abstract LinkedEntry_Sub5 method1797();

	protected abstract void method1801(int var1);

	protected abstract void method1803(int[] var1, int var2, int var3);

	final void method1806(int[] var1, int var2, int var3) {
		if (aBool1715) {
			method1803(var1, var2, var3);
		} else {
			method1801(var3);
		}

	}

}
