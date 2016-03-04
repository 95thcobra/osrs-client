public class LinkedEntry_Sub13 extends LinkedEntry {

	int anInt1819;
	static final int anInt1820 = 51;
	static final int anInt1822 = 48;
	int anInt1823;
	public static final int anInt1824 = 181;
	static int anInt1825;
	boolean aBool1821 = false;

	static final void decodeObjects(byte[] data, int baseX, int baseZ, Class39 var3, Class141[] var4) {
		DataBuffer buffer = new DataBuffer(data);
		int id = -1;

		while (true) {
			int idOffset = buffer.readCompact();
			if (idOffset == 0) {
				return;
			}

			id += idOffset;
			int info = 0;

			while (true) {
				int infoDiff = buffer.readCompact();
				if (infoDiff == 0) {
					break;
				}

				info += infoDiff - 1;
				int localZ = info & 63;
				int localX = info >> 6 & 63;
				int level = info >> 12;
				int settings = buffer.readUByte();
				int type = settings >> 2;
				int rotation = settings & 3;
				int x = localX + baseX;
				int z = localZ + baseZ;

				if (x > 0 && z > 0 && x < 103 && z < 103) {
					int targetLevel = level;
					if ((Class32.mapSettings[1][x][z] & 2) == 2) {
						targetLevel = level - 1;
					}

					Class141 var17 = null;
					if (targetLevel >= 0) {
						var17 = var4[targetLevel];
					}

					CacheableEntry_Sub23_Sub11.method2489(level, x, z, id, rotation, type, var3, var17);
				}
			}
		}
	}

}
