public class Class11 {

	int anInt136;
	int anInt141;
	int anInt137;
	int anInt139;
	int anInt133;
	int anInt138;
	int anInt142;
	int anInt143;
	int anInt140 = 2;
	int[] anIntArray134 = new int[2];
	int[] anIntArray135 = new int[2];

	final void method219(DataBuffer var1) {
		anInt136 = var1.readUByte();
		anInt141 = var1.readInt();
		anInt137 = var1.readInt();
		method230(var1);
	}

	final void method222() {
		anInt139 = 0;
		anInt133 = 0;
		anInt138 = 0;
		anInt142 = 0;
		anInt143 = 0;
	}

	Class11() {
		anIntArray134[0] = 0;
		anIntArray134[1] = 65535;
		anIntArray135[0] = 0;
		anIntArray135[1] = 65535;
	}

	final void method230(DataBuffer var1) {
		anInt140 = var1.readUByte();
		anIntArray134 = new int[anInt140];
		anIntArray135 = new int[anInt140];

		for (int var2 = 0; var2 < anInt140; var2++) {
			anIntArray134[var2] = var1.readUShort();
			anIntArray135[var2] = var1.readUShort();
		}

	}

	final int method232(int var1) {
		if (anInt143 >= anInt139) {
			anInt142 = anIntArray135[anInt133++] << 15;
			if (anInt133 >= anInt140) {
				anInt133 = anInt140 - 1;
			}

			anInt139 = (int) ((double) anIntArray134[anInt133] / 65536.0D * (double) var1);
			if (anInt139 > anInt143) {
				anInt138 = ((anIntArray135[anInt133] << 15) - anInt142) / (anInt139 - anInt143);
			}
		}

		anInt142 += anInt138;
		++anInt143;
		return anInt142 - anInt138 >> 15;
	}

}
