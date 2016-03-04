public class Class117 {

	public static final int anInt1533 = 82;
	String aString1531;
	String aString1528;
	public int anInt1529;
	public long aLong1532;
	public GrandExchangeOffer aGrandExchangeOffer_1530;

	Class117(DataBuffer var1, byte var2, int var3) {
		aString1531 = var1.readString();
		aString1528 = var1.readString();
		anInt1529 = var1.readUShort() * -531126497;
		aLong1532 = var1.readLong() * 2250881020653705313L;
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		aGrandExchangeOffer_1530 = new GrandExchangeOffer();
		aGrandExchangeOffer_1530.method1616(2);
		aGrandExchangeOffer_1530.method1629(var2, 1736753585);
		aGrandExchangeOffer_1530.anInt1586 = var4 * -578803967;
		aGrandExchangeOffer_1530.anInt1589 = var5 * -1248938609;
		aGrandExchangeOffer_1530.anInt1590 = 0;
		aGrandExchangeOffer_1530.anInt1591 = 0;
		aGrandExchangeOffer_1530.anInt1587 = var3 * -19469067;
	}

	public String method1475(int var1) {
		return aString1531;
	}

	public String method1476(short var1) {
		return aString1528;
	}

	public static CacheableEntry_Sub23_Sub10 method1480(int var0, byte var1) {
		CacheableEntry_Sub23_Sub10 var2 = (CacheableEntry_Sub23_Sub10) CacheableEntry_Sub23_Sub10.aClass128_2312.get((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = CacheableEntry_Sub23_Sub10.aIndexDescriptor_2311.getFileData(14, var0);
			var2 = new CacheableEntry_Sub23_Sub10();
			if (var3 != null) {
				var2.method2471(new DataBuffer(var3), 1455905763);
			}

			CacheableEntry_Sub23_Sub10.aClass128_2312.put(var2, (long) var0);
			return var2;
		}
	}

	static void method1481(int var0, int var1, int var2, byte var3) {
		if (GameClient.anInt2954 * 696556151 != 0 && var1 != 0 && GameClient.anInt3075 * 1104054789 < 50) {
			GameClient.anIntArray3110[GameClient.anInt3075 * 1104054789] = var0;
			GameClient.anIntArray3111[GameClient.anInt3075 * 1104054789] = var1;
			GameClient.anIntArray3112[GameClient.anInt3075 * 1104054789] = var2;
			GameClient.aClass8Array3114[GameClient.anInt3075 * 1104054789] = null;
			GameClient.anIntArray3016[GameClient.anInt3075 * 1104054789] = 0;
			GameClient.anInt3075 += 1213510349;
		}

	}

	static CacheableEntry_Sub23_Sub17 method1482(int var0, int var1) {
		CacheableEntry_Sub23_Sub17 var2 = (CacheableEntry_Sub23_Sub17) CacheableEntry_Sub23_Sub17.aClass128_2415.get((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var4 = Connection.aClass94_Sub1_972.getFileData(var0, 0);
			if (var4 == null) {
				return null;
			} else {
				var2 = new CacheableEntry_Sub23_Sub17();
				DataBuffer var3 = new DataBuffer(var4);
				var3.pos = (var3.data.length - 12) * 1303963473;
				int var6 = var3.readInt();
				var2.anInt2416 = var3.readUShort() * 1801124909;
				var2.anInt2417 = var3.readUShort() * 995599977;
				var2.anInt2426 = var3.readUShort() * 1944843387;
				var2.anInt2419 = var3.readUShort() * 1998161553;
				var3.pos = 0;
				var3.readNullString();
				var2.anIntArray2425 = new int[var6];
				var2.anIntArray2414 = new int[var6];
				var2.aStringArray2412 = new String[var6];

				int var5;
				for (int var7 = 0; var3.pos * 1736753585 < var3.data.length - 12; var2.anIntArray2425[var7++] = var5) {
					var5 = var3.readUShort();
					if (var5 == 3) {
						var2.aStringArray2412[var7] = var3.readString();
					} else if (var5 < 100 && var5 != 21 && var5 != 38 && var5 != 39) {
						var2.anIntArray2414[var7] = var3.readInt();
					} else {
						var2.anIntArray2414[var7] = var3.readUByte();
					}
				}

				CacheableEntry_Sub23_Sub17.aClass128_2415.put(var2, (long) var0);
				return var2;
			}
		}
	}

}
