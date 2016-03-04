import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class133 {

	static CacheableEntry_Sub23_Sub14_Sub1[] aClass109_Sub23_Sub14_Sub1Array1597;
	public static Comparator aComparator1593 = new Class140();
	public static Comparator aComparator1595;
	public static Comparator aComparator1596;
	public static Comparator aComparator1594;
	public List aList1598;

	public void method1632(Comparator var1, boolean var2, int var3) {
		if (!var2) {
			Collections.sort(aList1598, Collections.reverseOrder(var1));
		} else {
			Collections.sort(aList1598, var1);
		}

	}

	static {
		new Class131();
		aComparator1595 = new Class110();
		aComparator1596 = new Class121();
		aComparator1594 = new Class127();
	}

	public Class133(DataBuffer var1, boolean var2) {
		int var6 = var1.readUShort();
		boolean var7 = var1.readUByte() == 1;
		byte var5;
		if (var7) {
			var5 = 1;
		} else {
			var5 = 0;
		}

		int var4 = var1.readUShort();
		aList1598 = new ArrayList(var4);

		for (int var3 = 0; var3 < var4; var3++) {
			aList1598.add(new Class117(var1, var5, var6));
		}

	}

}
