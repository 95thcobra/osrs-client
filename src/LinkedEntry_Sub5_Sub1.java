public class LinkedEntry_Sub5_Sub1 extends LinkedEntry_Sub5 {

	int anInt2374 = 0;
	int anInt2372 = -1;
	JagexLinkedList aJagexLinkedList_2373 = new JagexLinkedList();
	JagexLinkedList aJagexLinkedList_2375 = new JagexLinkedList();

	public final synchronized void method1803(int[] var1, int var2, int var3) {
		do {
			if (anInt2372 < 0) {
				method2549(var1, var2, var3);
				return;
			}

			if (anInt2374 + var3 < anInt2372) {
				anInt2374 += var3;
				method2549(var1, var2, var3);
				return;
			}

			int var4 = anInt2372 - anInt2374;
			method2549(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			anInt2374 += var4;
			method2546();
			LinkedEntry_Sub3 var5 = (LinkedEntry_Sub3) aJagexLinkedList_2375.method1405();
			synchronized (var5) {
				int var7 = var5.method1756(this);
				if (var7 < 0) {
					var5.anInt1687 = 0;
					method2547(var5);
				} else {
					var5.anInt1687 = var7;
					method2560(var5.prev, var5);
				}
			}
		} while (var3 != 0);

	}

	public final synchronized void method2544(LinkedEntry_Sub5 var1) {
		aJagexLinkedList_2373.method1396(var1);
	}

	public final synchronized void method2545(LinkedEntry_Sub5 var1) {
		var1.unlink();
	}

	void method2546() {
		if (anInt2374 > 0) {
			for (LinkedEntry_Sub3 var1 = (LinkedEntry_Sub3) aJagexLinkedList_2375.method1405(); var1 != null; var1 = (LinkedEntry_Sub3) aJagexLinkedList_2375.method1402()) {
				var1.anInt1687 -= anInt2374;
			}

			anInt2372 -= anInt2374;
			anInt2374 = 0;
		}

	}

	void method2547(LinkedEntry_Sub3 var1) {
		var1.unlink();
		var1.method1753();
		LinkedEntry var2 = aJagexLinkedList_2375.head.prev;
		if (var2 == aJagexLinkedList_2375.head) {
			anInt2372 = -1;
		} else {
			anInt2372 = ((LinkedEntry_Sub3) var2).anInt1687;
		}

	}

	protected LinkedEntry_Sub5 method1797() {
		return (LinkedEntry_Sub5) aJagexLinkedList_2373.method1402();
	}

	void method2549(int[] var1, int var2, int var3) {
		for (LinkedEntry_Sub5 var4 = (LinkedEntry_Sub5) aJagexLinkedList_2373.method1405(); var4 != null; var4 = (LinkedEntry_Sub5) aJagexLinkedList_2373.method1402()) {
			var4.method1806(var1, var2, var3);
		}

	}

	public final synchronized void method1801(int var1) {
		do {
			if (anInt2372 < 0) {
				method2550(var1);
				return;
			}

			if (anInt2374 + var1 < anInt2372) {
				anInt2374 += var1;
				method2550(var1);
				return;
			}

			int var2 = anInt2372 - anInt2374;
			method2550(var2);
			var1 -= var2;
			anInt2374 += var2;
			method2546();
			LinkedEntry_Sub3 var3 = (LinkedEntry_Sub3) aJagexLinkedList_2375.method1405();
			synchronized (var3) {
				int var5 = var3.method1756(this);
				if (var5 < 0) {
					var3.anInt1687 = 0;
					method2547(var3);
				} else {
					var3.anInt1687 = var5;
					method2560(var3.prev, var3);
				}
			}
		} while (var1 != 0);

	}

	void method2550(int var1) {
		for (LinkedEntry_Sub5 var2 = (LinkedEntry_Sub5) aJagexLinkedList_2373.method1405(); var2 != null; var2 = (LinkedEntry_Sub5) aJagexLinkedList_2373.method1402()) {
			var2.method1801(var1);
		}

	}

	protected LinkedEntry_Sub5 method1796() {
		return (LinkedEntry_Sub5) aJagexLinkedList_2373.method1405();
	}

	protected int method1794() {
		return 0;
	}

	void method2560(LinkedEntry var1, LinkedEntry_Sub3 var2) {
		while (var1 != aJagexLinkedList_2375.head && ((LinkedEntry_Sub3) var1).anInt1687 <= var2.anInt1687) {
			var1 = var1.prev;
		}

		JagexLinkedList.method1418(var2, var1);
		anInt2372 = ((LinkedEntry_Sub3) aJagexLinkedList_2375.head.prev).anInt1687;
	}

}
