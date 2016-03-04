public class ItemContainer extends LinkedEntry {

	int[] itemIds = new int[]{-1};
	int[] itemAmounts = new int[]{0};

	public static boolean method1840(int var0) {
		if (InterfaceDef.aBoolArray1928[var0]) {
			return true;
		} else if (!InterfaceDef.aIndexDescriptor_1929.method1154(var0, 1336719643)) {
			return false;
		} else {
			int var2 = InterfaceDef.aIndexDescriptor_1929.numFilesInContainer(var0);
			if (var2 == 0) {
				InterfaceDef.aBoolArray1928[var0] = true;
				return true;
			} else {
				if (InterfaceDef.aInterfaceDefArrayArray1975[var0] == null) {
					InterfaceDef.aInterfaceDefArrayArray1975[var0] = new InterfaceDef[var2];
				}

				for (int var3 = 0; var3 < var2; var3++) {
					if (InterfaceDef.aInterfaceDefArrayArray1975[var0][var3] == null) {
						byte[] var4 = InterfaceDef.aIndexDescriptor_1929.getFileData(var0, var3);
						if (var4 != null) {
							InterfaceDef.aInterfaceDefArrayArray1975[var0][var3] = new InterfaceDef();
							InterfaceDef.aInterfaceDefArrayArray1975[var0][var3].hash = (var3 + (var0 << 16)) * -1262844383;
							if (var4[0] == -1) {
								InterfaceDef.aInterfaceDefArrayArray1975[var0][var3].decodeCs2Interface(new DataBuffer(var4));
							} else {
								InterfaceDef.aInterfaceDefArrayArray1975[var0][var3].decodeOld(new DataBuffer(var4));
							}
						}
					}
				}

				InterfaceDef.aBoolArray1928[var0] = true;
				return true;
			}
		}
	}

	static final void method1848(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var5 = NpcDef.method2423(var0, var1, CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619, -1847964236) - var2;
			var0 -= NpcDef.anInt2245 * -1967123133;
			var5 -= Class74.anInt907 * 113597655;
			var1 -= CacheableEntry_Sub23_Sub1.anInt2093 * 681386919;
			int var6 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2719[IndexDescriptor.anInt1366 * -1557542191];
			int var4 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2720[IndexDescriptor.anInt1366 * -1557542191];
			int var8 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2719[Class19.anInt231 * 167182419];
			int var9 = CacheableEntry_Sub23_Sub14_Sub3.anIntArray2720[Class19.anInt231 * 167182419];
			int var7 = var8 * var1 + var0 * var9 >> 16;
			var1 = var1 * var9 - var0 * var8 >> 16;
			var0 = var7;
			var7 = var4 * var5 - var6 * var1 >> 16;
			var1 = var1 * var4 + var5 * var6 >> 16;
			if (var1 >= 50) {
				GameClient.anInt2968 = (GameClient.anInt3131 * -476732681 / 2 + GameClient.anInt3133 * -1951712977 * var0 / var1) * -1738216931;
				GameClient.anInt2969 = (GameClient.anInt3033 * -186527881 / 2 + var7 * GameClient.anInt3133 * -1951712977 / var1) * -1048260499;
			} else {
				GameClient.anInt2968 = 1738216931;
				GameClient.anInt2969 = 1048260499;
			}

		} else {
			GameClient.anInt2968 = 1738216931;
			GameClient.anInt2969 = 1048260499;
		}
	}

	static final void method1850(LinkedEntry_Sub6 var0) {
		int var2 = 0;
		int var4 = -1;
		int var3 = 0;
		int var6 = 0;
		if (var0.anInt1718 * -794083855 == 0) {
			var2 = LinkedEntry_Sub6.aClass39_1732.method646(var0.anInt1717 * -1806974757, var0.anInt1723 * 754007907, var0.anInt1729 * 1618190275);
		}

		if (var0.anInt1718 * -794083855 == 1) {
			var2 = LinkedEntry_Sub6.aClass39_1732.method528(var0.anInt1717 * -1806974757, var0.anInt1723 * 754007907, var0.anInt1729 * 1618190275);
		}

		if (var0.anInt1718 * -794083855 == 2) {
			var2 = LinkedEntry_Sub6.aClass39_1732.method529(var0.anInt1717 * -1806974757, var0.anInt1723 * 754007907, var0.anInt1729 * 1618190275);
		}

		if (var0.anInt1718 * -794083855 == 3) {
			var2 = LinkedEntry_Sub6.aClass39_1732.method530(var0.anInt1717 * -1806974757, var0.anInt1723 * 754007907, var0.anInt1729 * 1618190275);
		}

		if (var2 != 0) {
			int var5 = LinkedEntry_Sub6.aClass39_1732.method531(var0.anInt1717 * -1806974757, var0.anInt1723 * 754007907, var0.anInt1729 * 1618190275, var2);
			var4 = var2 >> 14 & 32767;
			var3 = var5 & 31;
			var6 = var5 >> 6 & 3;
		}

		var0.anInt1721 = var4 * -1211852985;
		var0.anInt1730 = var3 * -540677371;
		var0.anInt1722 = var6 * 1878736589;
	}


	static Class5 aClass5_1788;
	static byte aByte1793;
	static JagexMap activeContainers = new JagexMap(32);

}
