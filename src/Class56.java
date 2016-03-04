import java.util.zip.Inflater;

public class Class56 {

	public static IndexDescriptor aIndexDescriptor_734;
	static final int anInt735 = 1024;
	protected static String aString737;
	static final int anInt738 = 16;
	public static final int anInt739 = 76;
	Inflater anInflater736;

	public Class56() {
		this(-1, 1000000, 1000000);
	}

	public void method787(DataBuffer var1, byte[] var2, short var3) {
		if (var1.data[var1.pos * 1736753585] == 31 && var1.data[1 + var1.pos * 1736753585] == -117) {
			if (anInflater736 == null) {
				anInflater736 = new Inflater(true);
			}

			try {
				anInflater736.setInput(var1.data, 10 + var1.pos * 1736753585, var1.data.length - (8 + 10 + var1.pos * 1736753585));
				anInflater736.inflate(var2);
			} catch (Exception var5) {
				anInflater736.reset();
				throw new RuntimeException("");
			}

			anInflater736.reset();
		} else {
			throw new RuntimeException("");
		}
	}

	public static int calcStringBytes(String var0) {
		return var0.length() + 1;
	}

	Class56(int var1, int var2, int var3) {
	}

	public static ObjectDef getObjectDef(int var0) {
		ObjectDef var2 = (ObjectDef) ObjectDef.aClass128_2260.get((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Class93.aIndexDescriptor_1344.getFileData(6, var0);
			var2 = new ObjectDef();
			var2.id = var0 * -1673633643;
			if (var3 != null) {
				var2.decode(new DataBuffer(var3));
			}

			var2.method2428((byte) -32);
			if (var2.aBool2282) {
				var2.anInt2275 = 0;
				var2.aBool2276 = false;
			}

			ObjectDef.aClass128_2260.put(var2, (long) var0);
			return var2;
		}
	}

	static int getItemInContainerAt(int containerKey, int index) {
		ItemContainer itemContainer = (ItemContainer) ItemContainer.activeContainers.get((long) containerKey);
		return itemContainer == null ? -1 : (index >= 0 && index < itemContainer.itemIds.length ? itemContainer.itemIds[index] : -1);
	}

	static void method792(Class51 var0) {
		if (var0.method715((byte) 16) != GameClient.aBool2863) {
			GameClient.aBool2863 = var0.method715((byte) 16);
			RuntimeException_Sub1.method3306(var0.method715((byte) 16), -1540505320);
		}

		Class10.aString130 = var0.aString699;
		GameClient.anInt2872 = var0.anInt703 * 1557733403;
		GameClient.anInt2860 = var0.anInt704 * -1893770233;
		NpcDef.anInt2239 = 1098229281 * (GameClient.anInt2861 * -134799277 == 0 ? 43594 : var0.anInt703 * 1685233739 + 40000);
		CacheableEntry_Sub23_Sub2.anInt2106 = -417358633 * (GameClient.anInt2861 * -134799277 == 0 ? 443 : var0.anInt703 * 1685233739 + 50000);
		Class51.anInt712 = NpcDef.anInt2239 * 471081033;
	}

}
