public class Class45 implements Interface2 {

	static final int anInt636 = 5;
	static final int anInt644 = 16384;
	double aDouble639 = 1.0D;
	int anInt637 = 0;
	JagexLinkedList aJagexLinkedList_640 = new JagexLinkedList();
	int anInt641 = -569392512;
	IndexDescriptor aIndexDescriptor_642;
	int anInt638;
	LinkedEntry_Sub4[] aClass109_Sub4Array643;

	public void method682(double var1) {
		aDouble639 = var1;
		method686((byte) 89);
	}

	public int[] method24(int var1, int var2) {
		LinkedEntry_Sub4 var3 = aClass109_Sub4Array643[var1];
		if (var3 != null) {
			if (var3.anIntArray1700 != null) {
				aJagexLinkedList_640.method1396(var3);
				var3.aBool1701 = true;
				return var3.anIntArray1700;
			}

			boolean var4 = var3.method1758(aDouble639, anInt641 * -1752235699, aIndexDescriptor_642);
			if (var4) {
				if (anInt637 * 1731592125 == 0) {
					LinkedEntry_Sub4 var5 = (LinkedEntry_Sub4) aJagexLinkedList_640.method1397();
					var5.method1759();
				} else {
					anInt637 -= 1784001429;
				}

				aJagexLinkedList_640.method1396(var3);
				var3.aBool1701 = true;
				return var3.anIntArray1700;
			}
		}

		return null;
	}

	public Class45(IndexDescriptor var1, IndexDescriptor var2, int var3, double var4, int var6) {
		aIndexDescriptor_642 = var2;
		anInt638 = var3 * -996600599;
		anInt637 = anInt638 * -627364403;
		aDouble639 = var4;
		anInt641 = var6 * 1908154245;
		int[] var7 = var1.method1159(0, 1773905318);
		int var10 = var7.length;
		aClass109_Sub4Array643 = new LinkedEntry_Sub4[var1.numFilesInContainer(0)];

		for (int var8 = 0; var8 < var10; var8++) {
			DataBuffer var9 = new DataBuffer(var1.getFileData(0, var7[var8]));
			aClass109_Sub4Array643[var7[var8]] = new LinkedEntry_Sub4(var9);
		}

	}

	public boolean method26(int var1, byte var2) {
		return anInt641 * -1752235699 == 64;
	}

	public void method685(int var1, int var2) {
		for (int var3 = 0; var3 < aClass109_Sub4Array643.length; var3++) {
			LinkedEntry_Sub4 var4 = aClass109_Sub4Array643[var3];
			if (var4 != null && var4.anInt1698 != 0 && var4.aBool1701) {
				var4.method1763(var1);
				var4.aBool1701 = false;
			}
		}

	}

	public void method686(byte var1) {
		for (int var2 = 0; var2 < aClass109_Sub4Array643.length; var2++) {
			if (aClass109_Sub4Array643[var2] != null) {
				aClass109_Sub4Array643[var2].method1759();
			}
		}

		aJagexLinkedList_640 = new JagexLinkedList();
		anInt637 = anInt638 * -627364403;
	}

	public boolean method23(int var1, byte var2) {
		return aClass109_Sub4Array643[var1].aBool1699;
	}

	public int method29(int var1, int var2) {
		return aClass109_Sub4Array643[var1] != null ? aClass109_Sub4Array643[var1].anInt1692 : 0;
	}

	static final int method689(int var0) {
		if (!Class15.aClass35_195.aBool472) {
			int var1 = NpcDef.method2423(NpcDef.anInt2245 * -1967123133, CacheableEntry_Sub23_Sub1.anInt2093 * 681386919, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, -1847964236);
			return var1 - Class74.anInt907 * 113597655 < 800 && (Class32.mapSettings[CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619][NpcDef.anInt2245 * -1967123133 >> 7][CacheableEntry_Sub23_Sub1.anInt2093 * 681386919 >> 7] & 4) != 0 ? CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619 : 3;
		} else {
			return CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619;
		}
	}

	static void method694(Player var0, int var1, int var2, byte var3) {
		if (var0.anInt2536 * 1287875615 == var1 && var1 != -1) {
			int var4 = CacheableEntry_Sub23_Sub11.getAnimation(var1).anInt2170 * -991178587;
			if (var4 == 1) {
				var0.anInt2537 = 0;
				var0.anInt2538 = 0;
				var0.anInt2517 = var2 * -88244917;
				var0.anInt2515 = 0;
			}

			if (var4 == 2) {
				var0.anInt2515 = 0;
			}
		} else if (var1 == -1 || var0.anInt2536 * 1287875615 == -1 || CacheableEntry_Sub23_Sub11.getAnimation(var1).anInt2176 * -251389863 >= CacheableEntry_Sub23_Sub11.getAnimation(var0.anInt2536 * 1287875615).anInt2176 * -251389863) {
			var0.anInt2536 = var1 * 1940983775;
			var0.anInt2537 = 0;
			var0.anInt2538 = 0;
			var0.anInt2517 = var2 * -88244917;
			var0.anInt2515 = 0;
			var0.anInt2563 = var0.anInt2558 * 1030099461;
		}

	}

}
