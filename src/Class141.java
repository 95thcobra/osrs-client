public class Class141 {

	static AsyncJob aAsyncJob_1640;
	int anInt1633 = 0;
	int anInt1636 = 0;
	int anInt1637;
	int anInt1638;
	public int[][] anIntArrayArray1628;

	public void method1694(int var1, int var2, int var3, int var4, boolean var5, int var6) {
		int var7 = 256;
		if (var5) {
			var7 += 131072;
		}

		var1 -= anInt1633 * 1812566561;
		var2 -= anInt1636 * -1170276793;

		for (int var9 = var1; var9 < var3 + var1; var9++) {
			if (var9 >= 0 && var9 < anInt1637 * 92043199) {
				for (int var8 = var2; var8 < var4 + var2; var8++) {
					if (var8 >= 0 && var8 < anInt1638 * 987536373) {
						method1702(var9, var8, var7, (byte) -9);
					}
				}
			}
		}

	}

	public void method1695(int var1, int var2, int var3, int var4, int var5, boolean var6, short var7) {
		int var8 = 256;
		if (var6) {
			var8 += 131072;
		}

		var1 -= anInt1633 * 1812566561;
		var2 -= anInt1636 * -1170276793;
		int var9;
		if (var5 == 1 || var5 == 3) {
			var9 = var3;
			var3 = var4;
			var4 = var9;
		}

		for (var9 = var1; var9 < var3 + var1; var9++) {
			if (var9 >= 0 && var9 < anInt1637 * 92043199) {
				for (int var10 = var2; var10 < var2 + var4; var10++) {
					if (var10 >= 0 && var10 < anInt1638 * 987536373) {
						method1700(var9, var10, var8, -2129684690);
					}
				}
			}
		}

	}

	public void method1696(int var1, int var2, int var3, int var4, boolean var5, int var6) {
		var1 -= anInt1633 * 1812566561;
		var2 -= anInt1636 * -1170276793;
		if (var3 == 0) {
			if (var4 == 0) {
				method1702(var1, var2, 128, (byte) -2);
				method1702(var1 - 1, var2, 8, (byte) -39);
			}

			if (var4 == 1) {
				method1702(var1, var2, 2, (byte) 2);
				method1702(var1, 1 + var2, 32, (byte) -68);
			}

			if (var4 == 2) {
				method1702(var1, var2, 8, (byte) -77);
				method1702(1 + var1, var2, 128, (byte) -52);
			}

			if (var4 == 3) {
				method1702(var1, var2, 32, (byte) -5);
				method1702(var1, var2 - 1, 2, (byte) -1);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				method1702(var1, var2, 1, (byte) -14);
				method1702(var1 - 1, var2 + 1, 16, (byte) -18);
			}

			if (var4 == 1) {
				method1702(var1, var2, 4, (byte) -121);
				method1702(var1 + 1, 1 + var2, 64, (byte) 0);
			}

			if (var4 == 2) {
				method1702(var1, var2, 16, (byte) -43);
				method1702(var1 + 1, var2 - 1, 1, (byte) -71);
			}

			if (var4 == 3) {
				method1702(var1, var2, 64, (byte) -100);
				method1702(var1 - 1, var2 - 1, 4, (byte) 5);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				method1702(var1, var2, 130, (byte) -57);
				method1702(var1 - 1, var2, 8, (byte) -40);
				method1702(var1, var2 + 1, 32, (byte) -59);
			}

			if (var4 == 1) {
				method1702(var1, var2, 10, (byte) -124);
				method1702(var1, var2 + 1, 32, (byte) -66);
				method1702(var1 + 1, var2, 128, (byte) 1);
			}

			if (var4 == 2) {
				method1702(var1, var2, 40, (byte) -108);
				method1702(1 + var1, var2, 128, (byte) -112);
				method1702(var1, var2 - 1, 2, (byte) -100);
			}

			if (var4 == 3) {
				method1702(var1, var2, 160, (byte) -35);
				method1702(var1, var2 - 1, 2, (byte) -47);
				method1702(var1 - 1, var2, 8, (byte) -11);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					method1702(var1, var2, 65536, (byte) -19);
					method1702(var1 - 1, var2, 4096, (byte) -27);
				}

				if (var4 == 1) {
					method1702(var1, var2, 1024, (byte) -115);
					method1702(var1, var2 + 1, 16384, (byte) -27);
				}

				if (var4 == 2) {
					method1702(var1, var2, 4096, (byte) -115);
					method1702(1 + var1, var2, 65536, (byte) -65);
				}

				if (var4 == 3) {
					method1702(var1, var2, 16384, (byte) -61);
					method1702(var1, var2 - 1, 1024, (byte) -1);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					method1702(var1, var2, 512, (byte) 3);
					method1702(var1 - 1, var2 + 1, 8192, (byte) -33);
				}

				if (var4 == 1) {
					method1702(var1, var2, 2048, (byte) -90);
					method1702(1 + var1, var2 + 1, 32768, (byte) -97);
				}

				if (var4 == 2) {
					method1702(var1, var2, 8192, (byte) -121);
					method1702(var1 + 1, var2 - 1, 512, (byte) -84);
				}

				if (var4 == 3) {
					method1702(var1, var2, 32768, (byte) -50);
					method1702(var1 - 1, var2 - 1, 2048, (byte) -77);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					method1702(var1, var2, 66560, (byte) -33);
					method1702(var1 - 1, var2, 4096, (byte) -35);
					method1702(var1, var2 + 1, 16384, (byte) -69);
				}

				if (var4 == 1) {
					method1702(var1, var2, 5120, (byte) -121);
					method1702(var1, var2 + 1, 16384, (byte) -78);
					method1702(var1 + 1, var2, 65536, (byte) -66);
				}

				if (var4 == 2) {
					method1702(var1, var2, 20480, (byte) -29);
					method1702(var1 + 1, var2, 65536, (byte) -26);
					method1702(var1, var2 - 1, 1024, (byte) -87);
				}

				if (var4 == 3) {
					method1702(var1, var2, 81920, (byte) -119);
					method1702(var1, var2 - 1, 1024, (byte) -18);
					method1702(var1 - 1, var2, 4096, (byte) -35);
				}
			}
		}

	}

	public void method1698(int var1, int var2, int var3) {
		var1 -= anInt1633 * 1812566561;
		var2 -= anInt1636 * -1170276793;
		anIntArrayArray1628[var1][var2] |= 2097152;
	}

	public void method1699(int var1, int var2, int var3) {
		var1 -= anInt1633 * 1812566561;
		var2 -= anInt1636 * -1170276793;
		anIntArrayArray1628[var1][var2] |= 262144;
	}

	void method1700(int var1, int var2, int var3, int var4) {
		anIntArrayArray1628[var1][var2] &= ~var3;
	}

	public void method1701(byte var1) {
		for (int var2 = 0; var2 < anInt1637 * 92043199; var2++) {
			for (int var3 = 0; var3 < anInt1638 * 987536373; var3++) {
				if (var2 != 0 && var3 != 0 && var2 < anInt1637 * 92043199 - 5 && var3 < anInt1638 * 987536373 - 5) {
					anIntArrayArray1628[var2][var3] = 16777216;
				} else {
					anIntArrayArray1628[var2][var3] = 16777215;
				}
			}
		}

	}

	void method1702(int var1, int var2, int var3, byte var4) {
		anIntArrayArray1628[var1][var2] |= var3;
	}

	public void method1704(int var1, int var2, int var3) {
		var1 -= anInt1633 * 1812566561;
		var2 -= anInt1636 * -1170276793;
		anIntArrayArray1628[var1][var2] &= -262145;
	}

	public void method1705(int var1, int var2, int var3, int var4, boolean var5, byte var6) {
		var1 -= anInt1633 * 1812566561;
		var2 -= anInt1636 * -1170276793;
		if (var3 == 0) {
			if (var4 == 0) {
				method1700(var1, var2, 128, -1652813290);
				method1700(var1 - 1, var2, 8, 45908779);
			}

			if (var4 == 1) {
				method1700(var1, var2, 2, 1794365099);
				method1700(var1, 1 + var2, 32, 53854458);
			}

			if (var4 == 2) {
				method1700(var1, var2, 8, -2120495830);
				method1700(var1 + 1, var2, 128, -560628494);
			}

			if (var4 == 3) {
				method1700(var1, var2, 32, 1572139256);
				method1700(var1, var2 - 1, 2, 1029882763);
			}
		}

		if (var3 == 1 || var3 == 3) {
			if (var4 == 0) {
				method1700(var1, var2, 1, 1591614710);
				method1700(var1 - 1, 1 + var2, 16, 1732259204);
			}

			if (var4 == 1) {
				method1700(var1, var2, 4, 1482516053);
				method1700(1 + var1, var2 + 1, 64, -1668399313);
			}

			if (var4 == 2) {
				method1700(var1, var2, 16, -1435347875);
				method1700(var1 + 1, var2 - 1, 1, -581800763);
			}

			if (var4 == 3) {
				method1700(var1, var2, 64, -1153317556);
				method1700(var1 - 1, var2 - 1, 4, -957869131);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				method1700(var1, var2, 130, -1943449581);
				method1700(var1 - 1, var2, 8, 50706670);
				method1700(var1, 1 + var2, 32, 357888824);
			}

			if (var4 == 1) {
				method1700(var1, var2, 10, 2130041913);
				method1700(var1, var2 + 1, 32, -1571889000);
				method1700(1 + var1, var2, 128, -1366839164);
			}

			if (var4 == 2) {
				method1700(var1, var2, 40, 200160834);
				method1700(1 + var1, var2, 128, 808519981);
				method1700(var1, var2 - 1, 2, -1685687232);
			}

			if (var4 == 3) {
				method1700(var1, var2, 160, 1142934621);
				method1700(var1, var2 - 1, 2, -1383694488);
				method1700(var1 - 1, var2, 8, 59652686);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					method1700(var1, var2, 65536, -1412234962);
					method1700(var1 - 1, var2, 4096, -980264543);
				}

				if (var4 == 1) {
					method1700(var1, var2, 1024, 1595208817);
					method1700(var1, 1 + var2, 16384, -1747593045);
				}

				if (var4 == 2) {
					method1700(var1, var2, 4096, 1592930130);
					method1700(var1 + 1, var2, 65536, 1764275142);
				}

				if (var4 == 3) {
					method1700(var1, var2, 16384, -525157894);
					method1700(var1, var2 - 1, 1024, 246804641);
				}
			}

			if (var3 == 1 || var3 == 3) {
				if (var4 == 0) {
					method1700(var1, var2, 512, 1731379825);
					method1700(var1 - 1, var2 + 1, 8192, -1882800493);
				}

				if (var4 == 1) {
					method1700(var1, var2, 2048, -751960724);
					method1700(var1 + 1, var2 + 1, 32768, 1416973281);
				}

				if (var4 == 2) {
					method1700(var1, var2, 8192, -991017955);
					method1700(var1 + 1, var2 - 1, 512, 1987420188);
				}

				if (var4 == 3) {
					method1700(var1, var2, 32768, -1254867198);
					method1700(var1 - 1, var2 - 1, 2048, 1563413352);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					method1700(var1, var2, 66560, -3281480);
					method1700(var1 - 1, var2, 4096, 617331402);
					method1700(var1, var2 + 1, 16384, 2075909063);
				}

				if (var4 == 1) {
					method1700(var1, var2, 5120, -2021391996);
					method1700(var1, var2 + 1, 16384, 671273589);
					method1700(1 + var1, var2, 65536, -560339116);
				}

				if (var4 == 2) {
					method1700(var1, var2, 20480, -1235953771);
					method1700(var1 + 1, var2, 65536, 1771703252);
					method1700(var1, var2 - 1, 1024, -224835243);
				}

				if (var4 == 3) {
					method1700(var1, var2, 81920, -1002049858);
					method1700(var1, var2 - 1, 1024, -1660360938);
					method1700(var1 - 1, var2, 4096, 40611142);
				}
			}
		}

	}

	public Class141(int var1, int var2) {
		anInt1637 = var1 * -654084033;
		anInt1638 = var2 * -1511065507;
		anIntArrayArray1628 = new int[anInt1637 * 92043199][anInt1638 * 987536373];
		method1701((byte) 37);
	}

}
