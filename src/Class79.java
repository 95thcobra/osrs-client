import java.util.Arrays;
import java.util.Date;

public class Class79 {

	public static final int anInt945 = 101;
	static final int anInt946 = 12;
	static boolean aBool947;
	static final int anInt948 = 2097152;
	public static final int anInt949 = 19136776;
	static IndexDescriptor aIndexDescriptor_950;
	static int mapPacketBaseX;

	static void method1034(ScriptInvocation var0, int var1, byte var2) {
		Object[] var3 = var0.parameters;
		int var4 = ((Integer) var3[0]).intValue();
		System.out.printf("Invoking script %d param array %s%n", var4, Arrays.toString(var3));
		CacheableEntry_Sub23_Sub17 var5 = Class117.method1482(var4, 433742564);
		if (var5 != null) {
			int istackptr = 0;
			int var7 = 0;
			int var8 = -1;
			int[] var9 = var5.anIntArray2425;
			int[] var10 = var5.anIntArray2414;
			byte var11 = -1;
			Class1.anInt1 = 0;

			int var14;
			try {
				Class1.anIntArray9 = new int[var5.anInt2416 * -1926712411];
				int var12 = 0;
				Class71.aStringArray868 = new String[var5.anInt2417 * 171985369];
				int var43 = 0;

				int var15;
				String var53;
				for (var14 = 1; var14 < var3.length; var14++) {
					if (var3[var14] instanceof Integer) {
						var15 = ((Integer) var3[var14]).intValue();
						if (var15 == -2147483647) {
							var15 = var0.anInt1770 * -1033212463;
						}

						if (var15 == -2147483646) {
							var15 = var0.anInt1776 * 1595122943;
						}

						if (var15 == -2147483645) {
							var15 = var0.inter != null ? var0.inter.hash * 1582464481 : -1;
						}

						if (var15 == -2147483644) {
							var15 = var0.anInt1773 * 1379436419;
						}

						if (var15 == -2147483643) {
							var15 = var0.inter != null ? var0.inter.slot * -1395083971 : -1;
						}

						if (var15 == -2147483642) {
							var15 = var0.aInterfaceDef_1774 != null ? var0.aInterfaceDef_1774.hash * 1582464481 : -1;
						}

						if (var15 == -2147483641) {
							var15 = var0.aInterfaceDef_1774 != null ? var0.aInterfaceDef_1774.slot * -1395083971 : -1;
						}

						if (var15 == -2147483640) {
							var15 = var0.anInt1775 * 593982463;
						}

						if (var15 == -2147483639) {
							var15 = var0.anInt1771 * 1474769073;
						}

						Class1.anIntArray9[var12++] = var15;
					} else if (var3[var14] instanceof String) {
						var53 = (String) var3[var14];
						if (var53.equals("event_opbase")) {
							var53 = var0.aString1777;
						}

						Class71.aStringArray868[var43++] = var53;
					}
				}

				var14 = 0;
				Class1.anInt12 = var0.anInt1778 * 1696435903;

				label3086:
				while (true) {
					++var14;
					if (var14 > var1) {
						throw new RuntimeException();
					}

					++var8;
					int opcode = var9[var8];
					int var16;
					int var19;
					int var20;
					String var22;
					int var45;
					int var46;
					int[] var48;
					String var52;
					int var56;
					String var80;
					if (opcode < 100) {
						if (opcode == 0) {
							Class1.intstack[istackptr++] = var10[var8];
							continue;
						}

						if (opcode == 1) {
							var15 = var10[var8];
							System.out.println("gimmi varp " + var15 + " @ script " + var4);
							Class1.intstack[istackptr++] = Class106.varps[var15];
							continue;
						}

						if (opcode == 2) {
							var15 = var10[var8];
							--istackptr;
							Class106.varps[var15] = Class1.intstack[istackptr];
							Class22.method349(var15, (short) 16526);
							continue;
						}

						if (opcode == 3) {
							Class1.stringstack[var7++] = var5.aStringArray2412[var8];
							continue;
						}

						if (opcode == 6) {
							var8 += var10[var8];
							continue;
						}

						if (opcode == 7) {
							istackptr -= 2;
							if (Class1.intstack[istackptr] != Class1.intstack[1 + istackptr]) {
								var8 += var10[var8];
							}
							continue;
						}

						if (opcode == 8) {
							istackptr -= 2;
							if (Class1.intstack[istackptr] == Class1.intstack[1 + istackptr]) {
								var8 += var10[var8];
							}
							continue;
						}

						if (opcode == 9) {
							istackptr -= 2;
							if (Class1.intstack[istackptr] < Class1.intstack[1 + istackptr]) {
								var8 += var10[var8];
							}
							continue;
						}

						if (opcode == 10) {
							istackptr -= 2;
							if (Class1.intstack[istackptr] > Class1.intstack[1 + istackptr]) {
								var8 += var10[var8];
							}
							continue;
						}

						if (opcode == 21) {
							if (Class1.anInt1 * 569712483 == 0) {
								return;
							}

							Class50 var85 = Class1.aClass50Array8[(Class1.anInt1 -= 1634556491) * 569712483];
							var5 = var85.aClass109_Sub23_Sub17_692;
							var9 = var5.anIntArray2425;
							var10 = var5.anIntArray2414;
							var8 = var85.anInt689 * -1761320427;
							Class1.anIntArray9 = var85.anIntArray688;
							Class71.aStringArray868 = var85.aStringArray696;
							continue;
						}

						if (opcode == 25) {
							var15 = var10[var8];
							System.out.println("gimme varpbit pls " + var15);
							Class1.intstack[istackptr++] = GfxDef.method2521(var15, 556088739);
							continue;
						}

						if (opcode == 27) {
							var15 = var10[var8];
							--istackptr;
							var16 = Class1.intstack[istackptr];
							CacheableEntry_Sub23_Sub10 var110 = Class117.method1480(var15, (byte) -101);
							var45 = var110.anInt2314 * -2125842197;
							var19 = var110.anInt2320 * -96319771;
							var20 = var110.anInt2315 * 1068024283;
							var56 = Class106.anIntArray1478[var20 - var19];
							if (var16 < 0 || var16 > var56) {
								var16 = 0;
							}

							var56 <<= var19;
							Class106.varps[var45] = Class106.varps[var45] & ~var56 | var16 << var19 & var56;
							continue;
						}

						if (opcode == 31) {
							istackptr -= 2;
							if (Class1.intstack[istackptr] <= Class1.intstack[1 + istackptr]) {
								var8 += var10[var8];
							}
							continue;
						}

						if (opcode == 32) {
							istackptr -= 2;
							if (Class1.intstack[istackptr] >= Class1.intstack[istackptr + 1]) {
								var8 += var10[var8];
							}
							continue;
						}

						if (opcode == 33) {
							Class1.intstack[istackptr++] = Class1.anIntArray9[var10[var8]];
							continue;
						}

						int var10001;
						if (opcode == 34) {
							var10001 = var10[var8];
							--istackptr;
							Class1.anIntArray9[var10001] = Class1.intstack[istackptr];
							continue;
						}

						if (opcode == 35) {
							Class1.stringstack[var7++] = Class71.aStringArray868[var10[var8]];
							continue;
						}

						if (opcode == 36) {
							var10001 = var10[var8];
							--var7;
							Class71.aStringArray868[var10001] = Class1.stringstack[var7];
							continue;
						}

						if (opcode == 37) {
							var15 = var10[var8];
							var7 -= var15;
							String[] var109 = Class1.stringstack;
							if (var15 == 0) {
								var52 = "";
							} else if (var15 == 1) {
								var80 = var109[var7];
								if (var80 == null) {
									var52 = "null";
								} else {
									var52 = var80.toString();
								}
							} else {
								var45 = var7 + var15;
								var19 = 0;

								for (var20 = var7; var20 < var45; var20++) {
									String var65 = var109[var20];
									if (var65 == null) {
										var19 += 4;
									} else {
										var19 += var65.length();
									}
								}

								StringBuilder var94 = new StringBuilder(var19);

								for (var56 = var7; var56 < var45; var56++) {
									var22 = var109[var56];
									if (var22 == null) {
										var94.append("null");
									} else {
										var94.append(var22);
									}
								}

								var52 = var94.toString();
							}

							Class1.stringstack[var7++] = var52;
							continue;
						}

						if (opcode == 38) {
							--istackptr;
							continue;
						}

						if (opcode == 39) {
							--var7;
							continue;
						}

						if (opcode == 40) {
							var15 = var10[var8];
							CacheableEntry_Sub23_Sub17 var113 = Class117.method1482(var15, 201343677);
							var48 = new int[var113.anInt2416 * -1926712411];
							String[] var98 = new String[var113.anInt2417 * 171985369];

							for (var19 = 0; var19 < var113.anInt2426 * -1176384845; var19++) {
								var48[var19] = Class1.intstack[istackptr - var113.anInt2426 * -1176384845 + var19];
							}

							for (var19 = 0; var19 < var113.anInt2419 * -1204618639; var19++) {
								var98[var19] = Class1.stringstack[var19 + (var7 - var113.anInt2419 * -1204618639)];
							}

							istackptr -= var113.anInt2426 * -1176384845;
							var7 -= var113.anInt2419 * -1204618639;
							Class50 var108 = new Class50();
							var108.aClass109_Sub23_Sub17_692 = var5;
							var108.anInt689 = var8 * -154706627;
							var108.anIntArray688 = Class1.anIntArray9;
							var108.aStringArray696 = Class71.aStringArray868;
							Class1.aClass50Array8[(Class1.anInt1 += 1634556491) * 569712483 - 1] = var108;
							var5 = var113;
							var9 = var113.anIntArray2425;
							var10 = var113.anIntArray2414;
							var8 = -1;
							Class1.anIntArray9 = var48;
							Class71.aStringArray868 = var98;
							continue;
						}

						if (opcode == 42) {
							Class1.intstack[istackptr++] = GameClient.anIntArray3063[var10[var8]];
							continue;
						}

						if (opcode == 43) {
							var10001 = var10[var8];
							--istackptr;
							GameClient.anIntArray3063[var10001] = Class1.intstack[istackptr];
							continue;
						}

						if (opcode == 44) {
							var15 = var10[var8] >> 16;
							var16 = var10[var8] & 65535;
							--istackptr;
							var46 = Class1.intstack[istackptr];
							if (var46 >= 0 && var46 <= 5000) {
								Class1.anIntArray3[var15] = var46;
								byte var95 = -1;
								if (var16 == 105) {
									var95 = 0;
								}

								var19 = 0;

								while (true) {
									if (var19 >= var46) {
										continue label3086;
									}

									Class1.anIntArrayArray13[var15][var19] = var95;
									++var19;
								}
							}

							throw new RuntimeException();
						}

						if (opcode == 45) {
							var15 = var10[var8];
							--istackptr;
							var16 = Class1.intstack[istackptr];
							if (var16 >= 0 && var16 < Class1.anIntArray3[var15]) {
								Class1.intstack[istackptr++] = Class1.anIntArrayArray13[var15][var16];
								continue;
							}

							throw new RuntimeException();
						}

						if (opcode == 46) {
							var15 = var10[var8];
							istackptr -= 2;
							var16 = Class1.intstack[istackptr];
							if (var16 >= 0 && var16 < Class1.anIntArray3[var15]) {
								Class1.anIntArrayArray13[var15][var16] = Class1.intstack[istackptr + 1];
								continue;
							}

							throw new RuntimeException();
						}

						if (opcode == 47) {
							var53 = GameClient.aStringArray2869[var10[var8]];
							if (var53 == null) {
								var53 = "null";
							}

							Class1.stringstack[var7++] = var53;
							continue;
						}

						if (opcode == 48) {
							var10001 = var10[var8];
							--var7;
							GameClient.aStringArray2869[var10001] = Class1.stringstack[var7];
							continue;
						}
					}

					boolean var57;
					if (var10[var8] == 1) {
						var57 = true;
					} else {
						var57 = false;
					}

					InterfaceDef var17;
					InterfaceDef var44;
					InterfaceDef var47;
					InterfaceDef var49;
					boolean var54;
					boolean var62;
					if (opcode < 1000) {
						if (opcode == 100) {
							istackptr -= 3;
							var16 = Class1.intstack[istackptr];
							var46 = Class1.intstack[1 + istackptr];
							var45 = Class1.intstack[istackptr + 2];
							if (var46 == 0) {
								throw new RuntimeException();
							}

							var49 = Class50.method713(var16, (byte) -36);
							if (var49.aInterfaceDefArray2061 == null) {
								var49.aInterfaceDefArray2061 = new InterfaceDef[var45 + 1];
							}

							if (var49.aInterfaceDefArray2061.length <= var45) {
								InterfaceDef[] var90 = new InterfaceDef[var45 + 1];

								for (var56 = 0; var56 < var49.aInterfaceDefArray2061.length; var56++) {
									var90[var56] = var49.aInterfaceDefArray2061[var56];
								}

								var49.aInterfaceDefArray2061 = var90;
							}

							if (var45 > 0 && var49.aInterfaceDefArray2061[var45 - 1] == null) {
								throw new RuntimeException("" + (var45 - 1));
							}

							InterfaceDef var91 = new InterfaceDef();
							var91.contenttype = var46 * 1491066693;
							var91.anInt1958 = (var91.hash = var49.hash * 1) * -1713429101;
							var91.slot = var45 * -1182545387;
							var91.cs2Inter = true;
							var49.aInterfaceDefArray2061[var45] = var91;
							if (var57) {
								Class131.aInterfaceDef_1585 = var91;
							} else {
								Class1.aInterfaceDef_7 = var91;
							}

							Class35.method484(var49, -1309191093);
							continue;
						}

						if (opcode == 101) {
							var44 = var57 ? Class131.aInterfaceDef_1585 : Class1.aInterfaceDef_7;
							var17 = Class50.method713(var44.hash * 1582464481, (byte) -108);
							var17.aInterfaceDefArray2061[var44.slot * -1395083971] = null;
							Class35.method484(var17, -1205935349);
							continue;
						}

						if (opcode == 102) {
							--istackptr;
							var44 = Class50.method713(Class1.intstack[istackptr], (byte) 63);
							var44.aInterfaceDefArray2061 = null;
							Class35.method484(var44, -1480040996);
							continue;
						}

						if (opcode == 200) {
							istackptr -= 2;
							var16 = Class1.intstack[istackptr];
							var46 = Class1.intstack[istackptr + 1];
							var47 = Class50.method712(var16, var46, (short) -4098);
							if (var47 != null && var46 != -1) {
								Class1.intstack[istackptr++] = 1;
								if (var57) {
									Class131.aInterfaceDef_1585 = var47;
								} else {
									Class1.aInterfaceDef_7 = var47;
								}
								continue;
							}

							Class1.intstack[istackptr++] = 0;
							continue;
						}

						if (opcode == 201) {
							--istackptr;
							var44 = Class50.method713(Class1.intstack[istackptr], (byte) -95);
							if (var44 != null) {
								Class1.intstack[istackptr++] = 1;
								if (var57) {
									Class131.aInterfaceDef_1585 = var44;
								} else {
									Class1.aInterfaceDef_7 = var44;
								}
							} else {
								Class1.intstack[istackptr++] = 0;
							}
							continue;
						}
					} else {
						boolean var18;
						if ((opcode < 1000 || opcode >= 1100) && (opcode < 2000 || opcode >= 2100)) {
							if (opcode >= 1100 && opcode < 1200 || opcode >= 2100 && opcode < 2200) {
								var46 = -1;
								if (opcode >= 2000) {
									opcode -= 1000;
									--istackptr;
									var46 = Class1.intstack[istackptr];
									var44 = Class50.method713(var46, (byte) -117);
								} else {
									var44 = var57 ? Class131.aInterfaceDef_1585 : Class1.aInterfaceDef_7;
								}

								if (opcode == 1100) {
									istackptr -= 2;
									var44.anInt2070 = Class1.intstack[istackptr] * 1667903151;
									if (var44.anInt2070 * 706996303 > var44.anInt1962 * -538927815 - var44.anInt1954 * 2096072399) {
										var44.anInt2070 = var44.anInt1962 * -1956268041 - var44.anInt1954 * 1353472385;
									}

									if (var44.anInt2070 * 706996303 < 0) {
										var44.anInt2070 = 0;
									}

									var44.anInt2038 = Class1.intstack[1 + istackptr] * 1811636961;
									if (var44.anInt2038 * -650026719 > var44.anInt1963 * -124837617 - var44.invsize * 539675235) {
										var44.anInt2038 = var44.anInt1963 * -282538961 - var44.invsize * 1999030019;
									}

									if (var44.anInt2038 * -650026719 < 0) {
										var44.anInt2038 = 0;
									}

									Class35.method484(var44, -603565841);
									continue;
								}

								if (opcode == 1101) {
									--istackptr;
									var44.anInt2045 = Class1.intstack[istackptr] * -963482301;
									Class35.method484(var44, -715625299);
									continue;
								}

								if (opcode == 1102) {
									--istackptr;
									var44.aBool2068 = Class1.intstack[istackptr] == 1;
									Class35.method484(var44, -148409549);
									continue;
								}

								if (opcode == 1103) {
									--istackptr;
									var44.anInt1969 = Class1.intstack[istackptr] * 763876863;
									Class35.method484(var44, -872606846);
									continue;
								}

								if (opcode == 1104) {
									--istackptr;
									var44.anInt1970 = Class1.intstack[istackptr] * -400767859;
									Class35.method484(var44, -1762924246);
									continue;
								}

								if (opcode == 1105) {
									--istackptr;
									var44.anInt1971 = Class1.intstack[istackptr] * 2103477855;
									Class35.method484(var44, -429679691);
									continue;
								}

								if (opcode == 1106) {
									--istackptr;
									var44.anInt1974 = Class1.intstack[istackptr] * -1549731937;
									Class35.method484(var44, 57357956);
									continue;
								}

								if (opcode == 1107) {
									--istackptr;
									var44.aBool2015 = Class1.intstack[istackptr] == 1;
									Class35.method484(var44, -1396896605);
									continue;
								}

								if (opcode == 1108) {
									var44.anInt1980 = -559540111;
									--istackptr;
									var44.anInt1981 = Class1.intstack[istackptr] * 999821601;
									Class35.method484(var44, -1592677473);
									continue;
								}

								if (opcode == 1109) {
									istackptr -= 6;
									var44.anInt1986 = Class1.intstack[istackptr] * 1241506715;
									var44.anInt1987 = Class1.intstack[1 + istackptr] * 1709008139;
									var44.anInt1988 = Class1.intstack[istackptr + 2] * 193807915;
									var44.anInt1989 = Class1.intstack[3 + istackptr] * 1932084251;
									var44.anInt1990 = Class1.intstack[4 + istackptr] * 173124353;
									var44.anInt1991 = Class1.intstack[5 + istackptr] * 866853767;
									Class35.method484(var44, -1687228807);
									continue;
								}

								if (opcode == 1110) {
									--istackptr;
									var45 = Class1.intstack[istackptr];
									if (var44.anInt1959 * -335970573 != var45) {
										var44.anInt1959 = var45 * 1616693819;
										var44.anInt2059 = 0;
										var44.anInt2010 = 0;
										Class35.method484(var44, -1923241342);
									}
									continue;
								}

								if (opcode == 1111) {
									--istackptr;
									var44.aBool1994 = Class1.intstack[istackptr] == 1;
									Class35.method484(var44, -504921459);
									continue;
								}

								if (opcode == 1112) {
									--var7;
									var80 = Class1.stringstack[var7];
									if (!var80.equals(var44.aString1997)) {
										var44.aString1997 = var80;
										Class35.method484(var44, -2009765666);
									}
									continue;
								}

								if (opcode == 1113) {
									--istackptr;
									var44.anInt2031 = Class1.intstack[istackptr] * 2115269075;
									Class35.method484(var44, -660928634);
									continue;
								}

								if (opcode == 1114) {
									istackptr -= 3;
									var44.anInt2000 = Class1.intstack[istackptr] * -297867465;
									var44.anInt2001 = Class1.intstack[1 + istackptr] * 2090058093;
									var44.anInt2055 = Class1.intstack[2 + istackptr] * 373228367;
									Class35.method484(var44, -376921787);
									continue;
								}

								if (opcode == 1115) {
									--istackptr;
									var44.aBool2002 = Class1.intstack[istackptr] == 1;
									Class35.method484(var44, -1088431880);
									continue;
								}

								if (opcode == 1116) {
									--istackptr;
									var44.anInt1976 = Class1.intstack[istackptr] * 417047835;
									Class35.method484(var44, -722749955);
									continue;
								}

								if (opcode == 1117) {
									--istackptr;
									var44.anInt2044 = Class1.intstack[istackptr] * 688847885;
									Class35.method484(var44, -1428834137);
									continue;
								}

								if (opcode == 1118) {
									--istackptr;
									var44.aBool2028 = Class1.intstack[istackptr] == 1;
									Class35.method484(var44, -634899232);
									continue;
								}

								if (opcode == 1119) {
									--istackptr;
									var44.aBool1979 = Class1.intstack[istackptr] == 1;
									Class35.method484(var44, -2133965754);
									continue;
								}

								if (opcode == 1120) {
									istackptr -= 2;
									var44.anInt1962 = Class1.intstack[istackptr] * -777567991;
									var44.anInt1963 = Class1.intstack[1 + istackptr] * 1416080879;
									Class35.method484(var44, -614713742);
									if (var46 != -1 && var44.contenttype * -1878336627 == 0) {
										Class57.method796(InterfaceDef.aInterfaceDefArrayArray1975[var46 >> 16], var44, false, -1228189277);
									}
									continue;
								}

								if (opcode == 1121) {
									Class50.method711(var44.hash * 1582464481, var44.slot * -1395083971, (short) 4032);
									GameClient.aInterfaceDef_3029 = var44;
									Class35.method484(var44, -2045126504);
									continue;
								}
							} else if (opcode >= 1200 && opcode < 1300 || opcode >= 2200 && opcode < 2300) {
								if (opcode >= 2000) {
									opcode -= 1000;
									--istackptr;
									var44 = Class50.method713(Class1.intstack[istackptr], (byte) 60);
								} else {
									var44 = var57 ? Class131.aInterfaceDef_1585 : Class1.aInterfaceDef_7;
								}

								Class35.method484(var44, -661493471);
								if (opcode == 1200 || opcode == 1205 || opcode == 1212) {
									istackptr -= 2;
									var46 = Class1.intstack[istackptr];
									var45 = Class1.intstack[1 + istackptr];
									var44.anInt2057 = var46 * 801052415;
									var44.anInt2058 = var45 * -117852123;
									ItemDef var106 = PacketDecoder.getItemDef(var46);
									var44.anInt1988 = var106.xan2d * -2103748037;
									var44.anInt1989 = var106.yan2d * -2128308079;
									var44.anInt1990 = var106.anInt2114 * -1263339933;
									var44.anInt1986 = var106.xof2d * 615584475;
									var44.anInt1987 = var106.yof2d * -798173031;
									var44.anInt1991 = var106.zoom2d * 690567109;
									if (opcode == 1205) {
										var44.anInt1995 = 0;
									} else if (opcode == 1212 | var106.stackable * 833352093 == 1) {
										var44.anInt1995 = 1465661813;
									} else {
										var44.anInt1995 = -1363643670;
									}

									if (var44.anInt1992 * -726159965 > 0) {
										var44.anInt1991 = var44.anInt1991 * -1549383968 / (var44.anInt1992 * -726159965) * 866853767;
									} else if (var44.anInt1950 * -769280817 > 0) {
										var44.anInt1991 = var44.anInt1991 * -1549383968 / (var44.anInt1950 * -769280817) * 866853767;
									}
									continue;
								}

								if (opcode == 1201) {
									var44.anInt1980 = -1119080222;
									--istackptr;
									var44.anInt1981 = Class1.intstack[istackptr] * 999821601;
									continue;
								}

								if (opcode == 1202) {
									var44.anInt1980 = -1678620333;
									var44.anInt1981 = Player.me.aClass108_2815.method1344(899129507) * 999821601;
									continue;
								}
							} else if (opcode >= 1300 && opcode < 1400 || opcode >= 2300 && opcode < 2400) {
								if (opcode >= 2000) {
									opcode -= 1000;
									--istackptr;
									var44 = Class50.method713(Class1.intstack[istackptr], (byte) -93);
								} else {
									var44 = var57 ? Class131.aInterfaceDef_1585 : Class1.aInterfaceDef_7;
								}

								if (opcode == 1300) {
									--istackptr;
									var46 = Class1.intstack[istackptr] - 1;
									if (var46 >= 0 && var46 <= 9) {
										--var7;
										var44.method2160(var46, Class1.stringstack[var7], 1104054789);
										continue;
									}

									--var7;
									continue;
								}

								if (opcode == 1301) {
									istackptr -= 2;
									var46 = Class1.intstack[istackptr];
									var45 = Class1.intstack[1 + istackptr];
									var44.aInterfaceDef_2012 = Class50.method712(var46, var45, (short) -13659);
									continue;
								}

								if (opcode == 1302) {
									--istackptr;
									var44.aBool1983 = Class1.intstack[istackptr] == 1;
									continue;
								}

								if (opcode == 1303) {
									--istackptr;
									var44.anInt2052 = Class1.intstack[istackptr] * -906918979;
									continue;
								}

								if (opcode == 1304) {
									--istackptr;
									var44.anInt2014 = Class1.intstack[istackptr] * -2045675427;
									continue;
								}

								if (opcode == 1305) {
									--var7;
									var44.aString2032 = Class1.stringstack[var7];
									continue;
								}

								if (opcode == 1306) {
									--var7;
									var44.action = Class1.stringstack[var7];
									continue;
								}

								if (opcode == 1307) {
									var44.regularOptions = null;
									continue;
								}
							} else {
								int[] var51;
								String var58;
								if (opcode >= 1400 && opcode < 1500 || opcode >= 2400 && opcode < 2500) {
									if (opcode >= 2000) {
										opcode -= 1000;
										--istackptr;
										var44 = Class50.method713(Class1.intstack[istackptr], (byte) 58);
									} else {
										var44 = var57 ? Class131.aInterfaceDef_1585 : Class1.aInterfaceDef_7;
									}

									--var7;
									var58 = Class1.stringstack[var7];
									var51 = null;
									if (var58.length() > 0 && var58.charAt(var58.length() - 1) == 89) {
										--istackptr;
										var19 = Class1.intstack[istackptr];
										if (var19 > 0) {
											for (var51 = new int[var19]; var19-- > 0; var51[var19] = Class1.intstack[istackptr]) {
												--istackptr;
											}
										}

										var58 = var58.substring(0, var58.length() - 1);
									}

									Object[] var96 = new Object[var58.length() + 1];

									for (var20 = var96.length - 1; var20 >= 1; --var20) {
										if (var58.charAt(var20 - 1) == 115) {
											--var7;
											var96[var20] = Class1.stringstack[var7];
										} else {
											--istackptr;
											var96[var20] = new Integer(Class1.intstack[istackptr]);
										}
									}

									--istackptr;
									var20 = Class1.intstack[istackptr];
									if (var20 != -1) {
										var96[0] = new Integer(var20);
									} else {
										var96 = null;
									}

									if (opcode == 1400) {
										var44.anObjectArray1968 = var96;
									}

									if (opcode == 1401) {
										var44.anObjectArray2022 = var96;
									}

									if (opcode == 1402) {
										var44.anObjectArray2021 = var96;
									}

									if (opcode == 1403) {
										var44.anObjectArray2017 = var96;
									}

									if (opcode == 1404) {
										var44.anObjectArray2025 = var96;
									}

									if (opcode == 1405) {
										var44.anObjectArray2026 = var96;
									}

									if (opcode == 1406) {
										var44.anObjectArray2029 = var96;
									}

									if (opcode == 1407) {
										var44.varpScript = var96;
										var44.varpTriggers = var51;
									}

									if (opcode == 1408) {
										var44.anObjectArray2036 = var96;
									}

									if (opcode == 1409) {
										var44.anObjectArray2037 = var96;
									}

									if (opcode == 1410) {
										var44.anObjectArray2027 = var96;
									}

									if (opcode == 1411) {
										var44.anObjectArray1939 = var96;
									}

									if (opcode == 1412) {
										var44.anObjectArray2051 = var96;
									}

									if (opcode == 1414) {
										var44.itemContainerScript = var96;
										var44.itemContainerListeners = var51;
									}

									if (opcode == 1415) {
										var44.anObjectArray2056 = var96;
										var44.skillTriggers = var51;
									}

									if (opcode == 1416) {
										var44.anObjectArray2039 = var96;
									}

									if (opcode == 1417) {
										var44.anObjectArray1951 = var96;
									}

									if (opcode == 1418) {
										var44.anObjectArray2064 = var96;
									}

									if (opcode == 1419) {
										var44.anObjectArray2040 = var96;
									}

									if (opcode == 1420) {
										var44.anObjectArray2041 = var96;
									}

									if (opcode == 1421) {
										var44.anObjectArray1978 = var96;
									}

									if (opcode == 1422) {
										var44.anObjectArray2043 = var96;
									}

									if (opcode == 1423) {
										var44.anObjectArray1996 = var96;
									}

									if (opcode == 1424) {
										var44.anObjectArray1984 = var96;
									}

									if (opcode == 1425) {
										var44.anObjectArray2047 = var96;
									}

									if (opcode == 1426) {
										var44.anObjectArray2048 = var96;
									}

									if (opcode == 1427) {
										var44.anObjectArray2046 = var96;
									}

									var44.aBool1960 = true;
									continue;
								}

								if (opcode < 1600) {
									var44 = var57 ? Class131.aInterfaceDef_1585 : Class1.aInterfaceDef_7;
									if (opcode == 1500) {
										Class1.intstack[istackptr++] = var44.anInt1952 * -18591297;
										continue;
									}

									if (opcode == 1501) {
										Class1.intstack[istackptr++] = var44.anInt1945 * -591061715;
										continue;
									}

									if (opcode == 1502) {
										Class1.intstack[istackptr++] = var44.anInt1954 * 2096072399;
										continue;
									}

									if (opcode == 1503) {
										Class1.intstack[istackptr++] = var44.invsize * 539675235;
										continue;
									}

									if (opcode == 1504) {
										Class1.intstack[istackptr++] = var44.aBool1982 ? 1 : 0;
										continue;
									}

									if (opcode == 1505) {
										Class1.intstack[istackptr++] = var44.anInt1958 * -1588791493;
										continue;
									}
								} else if (opcode < 1700) {
									var44 = var57 ? Class131.aInterfaceDef_1585 : Class1.aInterfaceDef_7;
									if (opcode == 1600) {
										Class1.intstack[istackptr++] = var44.anInt2070 * 706996303;
										continue;
									}

									if (opcode == 1601) {
										Class1.intstack[istackptr++] = var44.anInt2038 * -650026719;
										continue;
									}

									if (opcode == 1602) {
										Class1.stringstack[var7++] = var44.aString1997;
										continue;
									}

									if (opcode == 1603) {
										Class1.intstack[istackptr++] = var44.anInt1962 * -538927815;
										continue;
									}

									if (opcode == 1604) {
										Class1.intstack[istackptr++] = var44.anInt1963 * -124837617;
										continue;
									}

									if (opcode == 1605) {
										Class1.intstack[istackptr++] = var44.anInt1991 * -1256377801;
										continue;
									}

									if (opcode == 1606) {
										Class1.intstack[istackptr++] = var44.anInt1988 * -1788131197;
										continue;
									}

									if (opcode == 1607) {
										Class1.intstack[istackptr++] = var44.anInt1990 * -1964550911;
										continue;
									}

									if (opcode == 1608) {
										Class1.intstack[istackptr++] = var44.anInt1989 * 1096480275;
										continue;
									}

									if (opcode == 1609) {
										Class1.intstack[istackptr++] = var44.anInt1969 * -745264641;
										continue;
									}
								} else if (opcode < 1800) {
									var44 = var57 ? Class131.aInterfaceDef_1585 : Class1.aInterfaceDef_7;
									if (opcode == 1700) {
										Class1.intstack[istackptr++] = var44.anInt2057 * -181409537;
										continue;
									}

									if (opcode == 1701) {
										if (var44.anInt2057 * -181409537 != -1) {
											Class1.intstack[istackptr++] = var44.anInt2058 * 1867752365;
										} else {
											Class1.intstack[istackptr++] = 0;
										}
										continue;
									}

									if (opcode == 1702) {
										Class1.intstack[istackptr++] = var44.slot * -1395083971;
										continue;
									}
								} else if (opcode < 1900) {
									var44 = var57 ? Class131.aInterfaceDef_1585 : Class1.aInterfaceDef_7;
									if (opcode == 1800) {
										var48 = Class1.intstack;
										var45 = istackptr++;
										var20 = LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(var44);
										var19 = var20 >> 11 & 63;
										var48[var45] = var19;
										continue;
									}

									if (opcode == 1801) {
										--istackptr;
										var46 = Class1.intstack[istackptr];
										--var46;
										if (var44.regularOptions != null && var46 < var44.regularOptions.length && var44.regularOptions[var46] != null) {
											Class1.stringstack[var7++] = var44.regularOptions[var46];
											continue;
										}

										Class1.stringstack[var7++] = "";
										continue;
									}

									if (opcode == 1802) {
										if (var44.aString2032 == null) {
											Class1.stringstack[var7++] = "";
										} else {
											Class1.stringstack[var7++] = var44.aString2032;
										}
										continue;
									}
								} else if (opcode >= 1900 && opcode < 2000 || opcode >= 2900 && opcode < 3000) {
									if (opcode >= 2000) {
										opcode -= 1000;
										--istackptr;
										var44 = Class50.method713(Class1.intstack[istackptr], (byte) 50);
									} else {
										var44 = var57 ? Class131.aInterfaceDef_1585 : Class1.aInterfaceDef_7;
									}

									if (opcode == 1927) {
										if (Class1.anInt12 * 693214753 >= 10) {
											throw new RuntimeException();
										}

										if (var44.anObjectArray2046 == null) {
											return;
										}

										ScriptInvocation var105 = new ScriptInvocation();
										var105.inter = var44;
										var105.parameters = var44.anObjectArray2046;
										var105.anInt1778 = Class1.anInt12 * 1908203839 - 413215905;
										GameClient.scriptInvocationQueue.add(var0);
										continue;
									}
								} else if (opcode < 2600) {
									--istackptr;
									var44 = Class50.method713(Class1.intstack[istackptr], (byte) -120);
									if (opcode == 2500) {
										Class1.intstack[istackptr++] = var44.anInt1952 * -18591297;
										continue;
									}

									if (opcode == 2501) {
										Class1.intstack[istackptr++] = var44.anInt1945 * -591061715;
										continue;
									}

									if (opcode == 2502) {
										Class1.intstack[istackptr++] = var44.anInt1954 * 2096072399;
										continue;
									}

									if (opcode == 2503) {
										Class1.intstack[istackptr++] = var44.invsize * 539675235;
										continue;
									}

									if (opcode == 2504) {
										Class1.intstack[istackptr++] = var44.aBool1982 ? 1 : 0;
										continue;
									}

									if (opcode == 2505) {
										Class1.intstack[istackptr++] = var44.anInt1958 * -1588791493;
										continue;
									}
								} else if (opcode < 2700) {
									--istackptr;
									var44 = Class50.method713(Class1.intstack[istackptr], (byte) -93);
									if (opcode == 2600) {
										Class1.intstack[istackptr++] = var44.anInt2070 * 706996303;
										continue;
									}

									if (opcode == 2601) {
										Class1.intstack[istackptr++] = var44.anInt2038 * -650026719;
										continue;
									}

									if (opcode == 2602) {
										Class1.stringstack[var7++] = var44.aString1997;
										continue;
									}

									if (opcode == 2603) {
										Class1.intstack[istackptr++] = var44.anInt1962 * -538927815;
										continue;
									}

									if (opcode == 2604) {
										Class1.intstack[istackptr++] = var44.anInt1963 * -124837617;
										continue;
									}

									if (opcode == 2605) {
										Class1.intstack[istackptr++] = var44.anInt1991 * -1256377801;
										continue;
									}

									if (opcode == 2606) {
										Class1.intstack[istackptr++] = var44.anInt1988 * -1788131197;
										continue;
									}

									if (opcode == 2607) {
										Class1.intstack[istackptr++] = var44.anInt1990 * -1964550911;
										continue;
									}

									if (opcode == 2608) {
										Class1.intstack[istackptr++] = var44.anInt1989 * 1096480275;
										continue;
									}

									if (opcode == 2609) {
										Class1.intstack[istackptr++] = var44.anInt1969 * -745264641;
										continue;
									}
								} else if (opcode < 2800) {
									if (opcode == 2700) {
										--istackptr;
										var44 = Class50.method713(Class1.intstack[istackptr], (byte) -33);
										Class1.intstack[istackptr++] = var44.anInt2057 * -181409537;
										continue;
									}

									if (opcode == 2701) {
										--istackptr;
										var44 = Class50.method713(Class1.intstack[istackptr], (byte) 34);
										if (var44.anInt2057 * -181409537 != -1) {
											Class1.intstack[istackptr++] = var44.anInt2058 * 1867752365;
										} else {
											Class1.intstack[istackptr++] = 0;
										}
										continue;
									}

									if (opcode == 2702) {
										--istackptr;
										var16 = Class1.intstack[istackptr];
										LinkedEntry_Sub13 var50 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.get((long) var16);
										if (var50 != null) {
											Class1.intstack[istackptr++] = 1;
										} else {
											Class1.intstack[istackptr++] = 0;
										}
										continue;
									}

									if (opcode == 2706) {
										Class1.intstack[istackptr++] = GameClient.activeRoot * 1787246131;
										continue;
									}
								} else if (opcode < 2900) {
									--istackptr;
									var44 = Class50.method713(Class1.intstack[istackptr], (byte) 30);
									if (opcode == 2800) {
										var48 = Class1.intstack;
										var45 = istackptr++;
										var20 = LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(var44);
										var19 = var20 >> 11 & 63;
										var48[var45] = var19;
										continue;
									}

									if (opcode == 2801) {
										--istackptr;
										var46 = Class1.intstack[istackptr];
										--var46;
										if (var44.regularOptions != null && var46 < var44.regularOptions.length && var44.regularOptions[var46] != null) {
											Class1.stringstack[var7++] = var44.regularOptions[var46];
											continue;
										}

										Class1.stringstack[var7++] = "";
										continue;
									}

									if (opcode == 2802) {
										if (var44.aString2032 == null) {
											Class1.stringstack[var7++] = "";
										} else {
											Class1.stringstack[var7++] = var44.aString2032;
										}
										continue;
									}
								} else if (opcode < 3200) {
									if (opcode == 3100) {
										--var7;
										var52 = Class1.stringstack[var7];
										Class93.method1145(0, "", var52);
										continue;
									}

									if (opcode == 3101) {
										istackptr -= 2;
										Class45.method694(Player.me, Class1.intstack[istackptr], Class1.intstack[istackptr + 1], (byte) 45);
										continue;
									}

									if (opcode == 3103) {
										Class36.method489(2143471269);
										continue;
									}

									if (opcode == 3104) {
										--var7;
										var52 = Class1.stringstack[var7];
										var46 = 0;
										var18 = Class19.method343(var52, 10, true, 758272506);
										if (var18) {
											var19 = Npc.method3394(var52, 10, true, (byte) 1);
											var46 = var19;
										}

										GameClient.secureBuffer.writeOpcode(228);
										GameClient.secureBuffer.writeInt(var46);
										continue;
									}

									if (opcode == 3105) {
										--var7;
										var52 = Class1.stringstack[var7];
										GameClient.secureBuffer.writeOpcode(152);
										GameClient.secureBuffer.writeByte(var52.length() + 1);
										GameClient.secureBuffer.writeStr(var52);
										continue;
									}

									if (opcode == 3106) {
										--var7;
										var52 = Class1.stringstack[var7];
										GameClient.secureBuffer.writeOpcode(227);
										GameClient.secureBuffer.writeByte(var52.length() + 1);
										GameClient.secureBuffer.writeStr(var52);
										continue;
									}

									if (opcode == 3107) {
										--istackptr;
										var16 = Class1.intstack[istackptr];
										--var7;
										var58 = Class1.stringstack[var7];
										Class2.method103(var16, var58, (byte) -89);
										continue;
									}

									if (opcode == 3108) {
										istackptr -= 3;
										var16 = Class1.intstack[istackptr];
										var46 = Class1.intstack[1 + istackptr];
										var45 = Class1.intstack[2 + istackptr];
										var49 = Class50.method713(var45, (byte) -49);
										Class1.method40(var49, var16, var46, 1018339509);
										continue;
									}

									if (opcode == 3109) {
										istackptr -= 2;
										var16 = Class1.intstack[istackptr];
										var46 = Class1.intstack[1 + istackptr];
										var47 = var57 ? Class131.aInterfaceDef_1585 : Class1.aInterfaceDef_7;
										Class1.method40(var47, var16, var46, 182206778);
										continue;
									}

									if (opcode == 3110) {
										--istackptr;
										Class46.aBool651 = Class1.intstack[istackptr] == 1;
										continue;
									}

									if (opcode == 3111) {
										Class1.intstack[istackptr++] = Class15.aClass35_195.aBool472 ? 1 : 0;
										continue;
									}

									if (opcode == 3112) {
										--istackptr;
										Class15.aClass35_195.aBool472 = Class1.intstack[istackptr] == 1;
										Class74.method1024(-1916381598);
										continue;
									}

									if (opcode == 3113) {
										--var7;
										var52 = Class1.stringstack[var7];
										--istackptr;
										var54 = Class1.intstack[istackptr] == 1;
										Class89.method1120(var52, var54, false, -982469919);
										continue;
									}

									if (opcode == 3115) {
										--istackptr;
										var16 = Class1.intstack[istackptr];
										GameClient.secureBuffer.writeOpcode(198);
										GameClient.secureBuffer.writeShort(var16);
										continue;
									}
								} else if (opcode < 3300) {
									if (opcode == 3200) {
										istackptr -= 3;
										Class117.method1481(Class1.intstack[istackptr], Class1.intstack[istackptr + 1], Class1.intstack[istackptr + 2], (byte) 9);
										continue;
									}

									if (opcode == 3201) {
										--istackptr;
										CacheableEntry_Sub23_Sub16_Sub1.method2938(Class1.intstack[istackptr], -2084811807);
										continue;
									}

									if (opcode == 3202) {
										istackptr -= 2;
										Class7_Sub1.method1774(Class1.intstack[istackptr], Class1.intstack[istackptr + 1], (byte) -15);
										continue;
									}
								} else if (opcode < 3400) {
									if (opcode == 3300) {
										Class1.intstack[istackptr++] = GameClient.cycle * 1026470457;
										continue;
									}

									if (opcode == 3301) {
										istackptr -= 2;
										int key = Class1.intstack[istackptr];
										int index = Class1.intstack[1 + istackptr];
										Class1.intstack[istackptr++] = Class56.getItemInContainerAt(key, index);
										continue;
									}

									if (opcode == 3302) {
										istackptr -= 2;
										int key = Class1.intstack[istackptr];
										int index = Class1.intstack[istackptr + 1];

										ItemContainer container = (ItemContainer) ItemContainer.activeContainers.get((long) key);
										int amount = 0;
										if (container != null && index >= 0 && index < container.itemAmounts.length) {
											amount = container.itemAmounts[index];
										}

										Class1.intstack[istackptr++] = amount;
										continue;
									}

									if (opcode == 3303) {
										istackptr -= 2;
										int key = Class1.intstack[istackptr];
										int id = Class1.intstack[1 + istackptr];
										Class1.intstack[istackptr++] = Class24.countItemInContainer(key, id);
										continue;
									}

									if (opcode == 3304) {
										--istackptr;
										var16 = Class1.intstack[istackptr];
										Class1.intstack[istackptr++] = Class110.method1388(var16, -46901051).anInt2088 * -117939317;
										continue;
									}

									if (opcode == 3305) {
										--istackptr;
										var16 = Class1.intstack[istackptr];
										Class1.intstack[istackptr++] = GameClient.anIntArray3002[var16];
										continue;
									}

									if (opcode == 3306) {
										--istackptr;
										var16 = Class1.intstack[istackptr];
										Class1.intstack[istackptr++] = GameClient.anIntArray3003[var16];
										continue;
									}

									if (opcode == 3307) {
										--istackptr;
										var16 = Class1.intstack[istackptr];
										Class1.intstack[istackptr++] = GameClient.anIntArray3004[var16];
										continue;
									}

									if (opcode == 3308) {
										var16 = CacheableEntry_Sub23_Sub16_Sub3.anInt2577 * -1093536619;
										var46 = Class35.anInt478 * -1719983039 + (Player.me.anInt2521 * -1051150961 >> 7);
										var45 = (Player.me.anInt2505 * -844883935 >> 7) + LinkedEntry_Sub13.anInt1825 * 803568843;
										Class1.intstack[istackptr++] = (var46 << 14) + (var16 << 28) + var45;
										continue;
									}

									if (opcode == 3309) {
										--istackptr;
										var16 = Class1.intstack[istackptr];
										Class1.intstack[istackptr++] = var16 >> 14 & 16383;
										continue;
									}

									if (opcode == 3310) {
										--istackptr;
										var16 = Class1.intstack[istackptr];
										Class1.intstack[istackptr++] = var16 >> 28;
										continue;
									}

									if (opcode == 3311) {
										--istackptr;
										var16 = Class1.intstack[istackptr];
										Class1.intstack[istackptr++] = var16 & 16383;
										continue;
									}

									if (opcode == 3312) {
										Class1.intstack[istackptr++] = GameClient.aBool2863 ? 1 : 0;
										continue;
									}

									if (opcode == 3313) {
										istackptr -= 2;
										var16 = 32768 + Class1.intstack[istackptr];
										var46 = Class1.intstack[istackptr + 1];
										var51 = Class1.intstack;
										var19 = istackptr++;
										ItemContainer container = (ItemContainer) ItemContainer.activeContainers.get((long) var16);
										if (container == null) {
											var20 = -1;
										} else if (var46 >= 0 && var46 < container.itemIds.length) {
											var20 = container.itemIds[var46];
										} else {
											var20 = -1;
										}

										var51[var19] = var20;
										continue;
									}

									if (opcode == 3314) {
										istackptr -= 2;
										int key = Class1.intstack[istackptr] + 0x8000;
										int index = Class1.intstack[1 + istackptr];

										ItemContainer container = (ItemContainer) ItemContainer.activeContainers.get((long) key);
										int amount = 0;
										if (container != null && index >= 0 && index < container.itemAmounts.length) {
											amount = container.itemAmounts[index];
										}

										Class1.intstack[istackptr++] = amount;
										continue;
									}

									if (opcode == 3315) {
										istackptr -= 2;
										int key = Class1.intstack[istackptr] + 0x8000;
										int id = Class1.intstack[istackptr + 1];
										Class1.intstack[istackptr++] = Class24.countItemInContainer(key, id);
										continue;
									}

									if (opcode == 3316) {
										if (GameClient.playerRights * -624018989 >= 2) {
											Class1.intstack[istackptr++] = GameClient.playerRights * -624018989;
										} else {
											Class1.intstack[istackptr++] = 0;
										}
										continue;
									}

									if (opcode == 3317) {
										Class1.intstack[istackptr++] = GameClient.anInt2877 * 1777370383;
										continue;
									}

									if (opcode == 3318) {
										Class1.intstack[istackptr++] = GameClient.anInt2872 * 1425499025;
										continue;
									}

									if (opcode == 3321) {
										Class1.intstack[istackptr++] = GameClient.anInt3030 * 1278004015;
										continue;
									}

									if (opcode == 3322) {
										Class1.intstack[istackptr++] = GameClient.anInt3031 * -1386837203;
										continue;
									}

									if (opcode == 3323) {
										if (GameClient.unknown) {
											Class1.intstack[istackptr++] = 1;
										} else {
											Class1.intstack[istackptr++] = 0;
										}
										continue;
									}

									if (opcode == 3324) {
										Class1.intstack[istackptr++] = GameClient.anInt2860 * -456057453;
										continue;
									}
								} else if (opcode < 3500) {
									if (opcode == 3400) {
										istackptr -= 2;
										int id = Class1.intstack[istackptr];
										int key = Class1.intstack[istackptr + 1];
										EnumDef enumdef = CacheableEntry_Sub23_Sub1.getEnumDef(id);
										if (enumdef.aChar2187 != 115) {
											;
										}

										for (int idx = 0; idx < enumdef.size * 928089439; idx++) {
											if (key == enumdef.keys[idx]) {
												Class1.stringstack[var7++] = enumdef.strings[idx];
												enumdef = null;
												break;
											}
										}

										if (enumdef != null) {
											Class1.stringstack[var7++] = enumdef.defaultstr;
										}
										continue;
									}

									if (opcode == 3408) {
										istackptr -= 4;
										int input = Class1.intstack[istackptr];
										int output = Class1.intstack[1 + istackptr];
										int id = Class1.intstack[2 + istackptr];
										int key = Class1.intstack[3 + istackptr];
										EnumDef enumdef = CacheableEntry_Sub23_Sub1.getEnumDef(id);
										if (enumdef.aChar2189 == input && enumdef.aChar2187 == output) {
											for (var56 = 0; var56 < enumdef.size * 928089439; var56++) {
												if (enumdef.keys[var56] == key) {
													if (output == 115) {
														Class1.stringstack[var7++] = enumdef.strings[var56];
													} else {
														Class1.intstack[istackptr++] = enumdef.ints[var56];
													}

													enumdef = null;
													break;
												}
											}

											if (enumdef != null) {
												if (output == 115) {
													Class1.stringstack[var7++] = enumdef.defaultstr;
												} else {
													Class1.intstack[istackptr++] = enumdef.anInt2184 * -1308295737;
												}
											}
											continue;
										}

										if (output == 115) {
											Class1.stringstack[var7++] = "null";
										} else {
											Class1.intstack[istackptr++] = 0;
										}
										continue;
									}
								} else {
									int var25;
									int var26;
									char var27;
									String var59;
									if (opcode < 3700) {
										if (opcode == 3600) {
											if (GameClient.anInt2898 * -2040339769 == 0) {
												Class1.intstack[istackptr++] = -2;
											} else if (GameClient.anInt2898 * -2040339769 == 1) {
												Class1.intstack[istackptr++] = -1;
											} else {
												Class1.intstack[istackptr++] = GameClient.anInt2984 * 389772333;
											}
											continue;
										}

										if (opcode == 3601) {
											--istackptr;
											var16 = Class1.intstack[istackptr];
											if (GameClient.anInt2898 * -2040339769 == 2 && var16 < GameClient.anInt2984 * 389772333) {
												Class1.stringstack[var7++] = GameClient.aClass46Array3136[var16].aString658;
												Class1.stringstack[var7++] = GameClient.aClass46Array3136[var16].aString647;
												continue;
											}

											Class1.stringstack[var7++] = "";
											Class1.stringstack[var7++] = "";
											continue;
										}

										if (opcode == 3602) {
											--istackptr;
											var16 = Class1.intstack[istackptr];
											if (GameClient.anInt2898 * -2040339769 == 2 && var16 < GameClient.anInt2984 * 389772333) {
												Class1.intstack[istackptr++] = GameClient.aClass46Array3136[var16].anInt648 * -261257351;
												continue;
											}

											Class1.intstack[istackptr++] = 0;
											continue;
										}

										if (opcode == 3603) {
											--istackptr;
											var16 = Class1.intstack[istackptr];
											if (GameClient.anInt2898 * -2040339769 == 2 && var16 < GameClient.anInt2984 * 389772333) {
												Class1.intstack[istackptr++] = GameClient.aClass46Array3136[var16].anInt649 * -366907351;
												continue;
											}

											Class1.intstack[istackptr++] = 0;
											continue;
										}

										if (opcode == 3604) {
											--var7;
											var52 = Class1.stringstack[var7];
											--istackptr;
											var46 = Class1.intstack[istackptr];
											Class126_Sub1.method1721(var52, var46, -181276419);
											continue;
										}

										if (opcode == 3605) {
											--var7;
											var52 = Class1.stringstack[var7];
											PacketBuffer.method2822(var52, -148912225);
											continue;
										}

										if (opcode == 3606) {
											--var7;
											var52 = Class1.stringstack[var7];
											Class95.method1223(var52, 501050778);
											continue;
										}

										if (opcode == 3607) {
											--var7;
											var52 = Class1.stringstack[var7];
											Class44.method679(var52, false, -1825420436);
											continue;
										}

										if (opcode == 3608) {
											--var7;
											var52 = Class1.stringstack[var7];
											CacheableEntry_Sub23_Sub7.method2397(var52, (byte) 79);
											continue;
										}

										if (opcode == 3609) {
											--var7;
											var52 = Class1.stringstack[var7];
											Class75[] var71 = InterfaceDef.method2176((byte) -38);

											for (var45 = 0; var45 < var71.length; var45++) {
												Class75 var60 = var71[var45];
												if (var60.anInt914 * 1684664313 != -1 && var52.startsWith(Class96.method1232(var60.anInt914 * 1684664313, -652032451))) {
													var52 = var52.substring(6 + Integer.toString(var60.anInt914 * 1684664313).length());
													break;
												}
											}

											Class1.intstack[istackptr++] = Class57.method794(var52, false, 517253235) ? 1 : 0;
											continue;
										}

										long var23;
										String[] var81;
										if (opcode == 3611) {
											if (GameClient.aString3090 == null) {
												Class1.stringstack[var7++] = "";
												continue;
											}

											var81 = Class1.stringstack;
											var46 = var7++;
											var59 = GameClient.aString3090;
											var23 = 0L;
											var25 = var59.length();

											for (var26 = 0; var26 < var25; var26++) {
												var23 *= 37L;
												var27 = var59.charAt(var26);
												if (var27 >= 65 && var27 <= 90) {
													var23 += (long) (1 + var27 - 65);
												} else if (var27 >= 97 && var27 <= 122) {
													var23 += (long) (var27 + 1 - 97);
												} else if (var27 >= 48 && var27 <= 57) {
													var23 += (long) (var27 + 27 - 48);
												}

												if (var23 >= 177917621779460413L) {
													break;
												}
											}

											while (var23 % 37L == 0L && var23 != 0L) {
												var23 /= 37L;
											}

											var22 = Class7.method176(var23);
											if (var22 == null) {
												var22 = "";
											}

											var81[var46] = var22;
											continue;
										}

										if (opcode == 3612) {
											if (GameClient.aString3090 != null) {
												Class1.intstack[istackptr++] = Class41.anInt585 * -1787316275;
											} else {
												Class1.intstack[istackptr++] = 0;
											}
											continue;
										}

										if (opcode == 3613) {
											--istackptr;
											var16 = Class1.intstack[istackptr];
											if (GameClient.aString3090 != null && var16 < Class41.anInt585 * -1787316275) {
												Class1.stringstack[var7++] = Class54.aClass109_Sub8Array728[var16].aString1757;
												continue;
											}

											Class1.stringstack[var7++] = "";
											continue;
										}

										if (opcode == 3614) {
											--istackptr;
											var16 = Class1.intstack[istackptr];
											if (GameClient.aString3090 != null && var16 < Class41.anInt585 * -1787316275) {
												Class1.intstack[istackptr++] = Class54.aClass109_Sub8Array728[var16].anInt1753 * -206755573;
												continue;
											}

											Class1.intstack[istackptr++] = 0;
											continue;
										}

										if (opcode == 3615) {
											--istackptr;
											var16 = Class1.intstack[istackptr];
											if (GameClient.aString3090 != null && var16 < Class41.anInt585 * -1787316275) {
												Class1.intstack[istackptr++] = Class54.aClass109_Sub8Array728[var16].aByte1756;
												continue;
											}

											Class1.intstack[istackptr++] = 0;
											continue;
										}

										if (opcode == 3616) {
											Class1.intstack[istackptr++] = LinkedEntry_Sub16.aByte1888;
											continue;
										}

										if (opcode == 3617) {
											--var7;
											var52 = Class1.stringstack[var7];
											if (Class54.aClass109_Sub8Array728 != null) {
												GameClient.secureBuffer.writeOpcode(244);
												GameClient.secureBuffer.writeByte(Class56.calcStringBytes(var52));
												GameClient.secureBuffer.writeStr(var52);
											}
											continue;
										}

										if (opcode == 3618) {
											Class1.intstack[istackptr++] = ItemContainer.aByte1793;
											continue;
										}

										if (opcode == 3619) {
											--var7;
											var52 = Class1.stringstack[var7];
											if (!var52.equals("")) {
												GameClient.secureBuffer.writeOpcode(13);
												GameClient.secureBuffer.writeByte(Class56.calcStringBytes(var52));
												GameClient.secureBuffer.writeStr(var52);
											}
											continue;
										}

										if (opcode == 3620) {
											GameClient.secureBuffer.writeOpcode(13);
											GameClient.secureBuffer.writeByte(0);
											continue;
										}

										if (opcode == 3621) {
											if (GameClient.anInt2898 * -2040339769 == 0) {
												Class1.intstack[istackptr++] = -1;
											} else {
												Class1.intstack[istackptr++] = GameClient.anInt3138 * 601840989;
											}
											continue;
										}

										if (opcode == 3622) {
											--istackptr;
											var16 = Class1.intstack[istackptr];
											if (GameClient.anInt2898 * -2040339769 != 0 && var16 < GameClient.anInt3138 * 601840989) {
												Class1.stringstack[var7++] = GameClient.aClass41Array2895[var16].aString597;
												Class1.stringstack[var7++] = GameClient.aClass41Array2895[var16].aString586;
												continue;
											}

											Class1.stringstack[var7++] = "";
											Class1.stringstack[var7++] = "";
											continue;
										}

										if (opcode == 3623) {
											--var7;
											var52 = Class1.stringstack[var7];
											if (var52.startsWith(Class96.method1232(0, -398791722)) || var52.startsWith(Class96.method1232(1, -1368344357))) {
												var52 = var52.substring(7);
											}

											Class1.intstack[istackptr++] = Class19.method344(var52, -155112914) ? 1 : 0;
											continue;
										}

										if (opcode == 3624) {
											--istackptr;
											var16 = Class1.intstack[istackptr];
											if (Class54.aClass109_Sub8Array728 != null && var16 < Class41.anInt585 * -1787316275 && Class54.aClass109_Sub8Array728[var16].aString1757.equalsIgnoreCase(Player.me.aString2835)) {
												Class1.intstack[istackptr++] = 1;
												continue;
											}

											Class1.intstack[istackptr++] = 0;
											continue;
										}

										if (opcode == 3625) {
											if (GameClient.aString2921 == null) {
												Class1.stringstack[var7++] = "";
												continue;
											}

											var81 = Class1.stringstack;
											var46 = var7++;
											var59 = GameClient.aString2921;
											var23 = 0L;
											var25 = var59.length();

											for (var26 = 0; var26 < var25; var26++) {
												var23 *= 37L;
												var27 = var59.charAt(var26);
												if (var27 >= 65 && var27 <= 90) {
													var23 += (long) (var27 + 1 - 65);
												} else if (var27 >= 97 && var27 <= 122) {
													var23 += (long) (1 + var27 - 97);
												} else if (var27 >= 48 && var27 <= 57) {
													var23 += (long) (27 + var27 - 48);
												}

												if (var23 >= 177917621779460413L) {
													break;
												}
											}

											while (var23 % 37L == 0L && var23 != 0L) {
												var23 /= 37L;
											}

											var22 = Class7.method176(var23);
											if (var22 == null) {
												var22 = "";
											}

											var81[var46] = var22;
											continue;
										}
									} else {
										int var61;
										if (opcode < 4000) {
											if (opcode == 3903) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												Class1.intstack[istackptr++] = GameClient.grandExchangeOffers[var16].method1615();
												continue;
											}

											if (opcode == 3904) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												Class1.intstack[istackptr++] = GameClient.grandExchangeOffers[var16].anInt1587 * -1544986787;
												continue;
											}

											if (opcode == 3905) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												Class1.intstack[istackptr++] = GameClient.grandExchangeOffers[var16].anInt1586 * 1903220993;
												continue;
											}

											if (opcode == 3906) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												Class1.intstack[istackptr++] = GameClient.grandExchangeOffers[var16].anInt1589 * 122603887;
												continue;
											}

											if (opcode == 3907) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												Class1.intstack[istackptr++] = GameClient.grandExchangeOffers[var16].anInt1590 * -543393497;
												continue;
											}

											if (opcode == 3908) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												Class1.intstack[istackptr++] = GameClient.grandExchangeOffers[var16].anInt1591 * -53420791;
												continue;
											}

											if (opcode == 3910) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												var46 = GameClient.grandExchangeOffers[var16].method1614();
												Class1.intstack[istackptr++] = var46 == 0 ? 1 : 0;
												continue;
											}

											if (opcode == 3911) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												var46 = GameClient.grandExchangeOffers[var16].method1614();
												Class1.intstack[istackptr++] = var46 == 2 ? 1 : 0;
												continue;
											}

											if (opcode == 3912) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												var46 = GameClient.grandExchangeOffers[var16].method1614();
												Class1.intstack[istackptr++] = var46 == 5 ? 1 : 0;
												continue;
											}

											if (opcode == 3913) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												var46 = GameClient.grandExchangeOffers[var16].method1614();
												Class1.intstack[istackptr++] = var46 == 1 ? 1 : 0;
												continue;
											}

											boolean var102;
											if (opcode == 3914) {
												--istackptr;
												var102 = Class1.intstack[istackptr] == 1;
												if (Class19.aClass133_234 != null) {
													Class19.aClass133_234.method1632(Class133.aComparator1596, var102, 1793874277);
												}
												continue;
											}

											if (opcode == 3915) {
												--istackptr;
												var102 = Class1.intstack[istackptr] == 1;
												if (Class19.aClass133_234 != null) {
													Class19.aClass133_234.method1632(Class133.aComparator1595, var102, 503530161);
												}
												continue;
											}

											if (opcode == 3916) {
												istackptr -= 2;
												var102 = Class1.intstack[istackptr] == 1;
												var54 = Class1.intstack[istackptr + 1] == 1;
												if (Class19.aClass133_234 != null) {
													Class19.aClass133_234.method1632(new Class25(var54), var102, 1308359225);
												}
												continue;
											}

											if (opcode == 3917) {
												--istackptr;
												var102 = Class1.intstack[istackptr] == 1;
												if (Class19.aClass133_234 != null) {
													Class19.aClass133_234.method1632(Class133.aComparator1593, var102, 1700160107);
												}
												continue;
											}

											if (opcode == 3918) {
												--istackptr;
												var102 = Class1.intstack[istackptr] == 1;
												if (Class19.aClass133_234 != null) {
													Class19.aClass133_234.method1632(Class133.aComparator1594, var102, -731817109);
												}
												continue;
											}

											if (opcode == 3919) {
												Class1.intstack[istackptr++] = Class19.aClass133_234 == null ? 0 : Class19.aClass133_234.aList1598.size();
												continue;
											}

											Class117 var76;
											if (opcode == 3920) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												var76 = (Class117) Class19.aClass133_234.aList1598.get(var16);
												Class1.intstack[istackptr++] = var76.anInt1529 * 1435047135;
												continue;
											}

											if (opcode == 3921) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												var76 = (Class117) Class19.aClass133_234.aList1598.get(var16);
												Class1.stringstack[var7++] = var76.method1475(1071097857);
												continue;
											}

											if (opcode == 3922) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												var76 = (Class117) Class19.aClass133_234.aList1598.get(var16);
												Class1.stringstack[var7++] = var76.method1476((short) 14247);
												continue;
											}

											if (opcode == 3923) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												var76 = (Class117) Class19.aClass133_234.aList1598.get(var16);
												long var30 = Class10.method216((short) 255) - -1497219245063192551L * Class83.aLong995 - 7457134724198763425L * var76.aLong1532;
												var20 = (int) (var30 / 3600000L);
												var56 = (int) ((var30 - (long) (var20 * 3600000)) / 60000L);
												var61 = (int) ((var30 - (long) (var20 * 3600000) - (long) (var56 * 60000)) / 1000L);
												String var32 = var20 + ":" + var56 / 10 + var56 % 10 + ":" + var61 / 10 + var61 % 10;
												Class1.stringstack[var7++] = var32;
												continue;
											}

											if (opcode == 3924) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												var76 = (Class117) Class19.aClass133_234.aList1598.get(var16);
												Class1.intstack[istackptr++] = var76.aGrandExchangeOffer_1530.anInt1589 * 122603887;
												continue;
											}

											if (opcode == 3925) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												var76 = (Class117) Class19.aClass133_234.aList1598.get(var16);
												Class1.intstack[istackptr++] = var76.aGrandExchangeOffer_1530.anInt1586 * 1903220993;
												continue;
											}

											if (opcode == 3926) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												var76 = (Class117) Class19.aClass133_234.aList1598.get(var16);
												Class1.intstack[istackptr++] = var76.aGrandExchangeOffer_1530.anInt1587 * -1544986787;
												continue;
											}
										} else if (opcode < 4100) {
											if (opcode == 4000) {
												istackptr -= 2;
												var16 = Class1.intstack[istackptr];
												var46 = Class1.intstack[istackptr + 1];
												Class1.intstack[istackptr++] = var16 + var46;
												continue;
											}

											if (opcode == 4001) {
												istackptr -= 2;
												var16 = Class1.intstack[istackptr];
												var46 = Class1.intstack[1 + istackptr];
												Class1.intstack[istackptr++] = var16 - var46;
												continue;
											}

											if (opcode == 4002) {
												istackptr -= 2;
												var16 = Class1.intstack[istackptr];
												var46 = Class1.intstack[istackptr + 1];
												Class1.intstack[istackptr++] = var16 * var46;
												continue;
											}

											if (opcode == 4003) {
												istackptr -= 2;
												var16 = Class1.intstack[istackptr];
												var46 = Class1.intstack[istackptr + 1];
												Class1.intstack[istackptr++] = var16 / var46;
												continue;
											}

											if (opcode == 4004) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												Class1.intstack[istackptr++] = (int) (Math.random() * (double) var16);
												continue;
											}

											if (opcode == 4005) {
												--istackptr;
												var16 = Class1.intstack[istackptr];
												Class1.intstack[istackptr++] = (int) (Math.random() * (double) (var16 + 1));
												continue;
											}

											if (opcode == 4006) {
												istackptr -= 5;
												var16 = Class1.intstack[istackptr];
												var46 = Class1.intstack[istackptr + 1];
												var45 = Class1.intstack[2 + istackptr];
												var19 = Class1.intstack[3 + istackptr];
												var20 = Class1.intstack[istackptr + 4];
												Class1.intstack[istackptr++] = var16 + (var46 - var16) * (var20 - var45) / (var19 - var45);
												continue;
											}

											if (opcode == 4007) {
												istackptr -= 2;
												var16 = Class1.intstack[istackptr];
												var46 = Class1.intstack[istackptr + 1];
												Class1.intstack[istackptr++] = var16 + var46 * var16 / 100;
												continue;
											}

											if (opcode == 4008) {
												istackptr -= 2;
												var16 = Class1.intstack[istackptr];
												var46 = Class1.intstack[1 + istackptr];
												Class1.intstack[istackptr++] = var16 | 1 << var46;
												continue;
											}

											if (opcode == 4009) {
												istackptr -= 2;
												var16 = Class1.intstack[istackptr];
												var46 = Class1.intstack[1 + istackptr];
												Class1.intstack[istackptr++] = var16 & -1 - (1 << var46);
												continue;
											}

											if (opcode == 4010) {
												istackptr -= 2;
												var16 = Class1.intstack[istackptr];
												var46 = Class1.intstack[istackptr + 1];
												Class1.intstack[istackptr++] = (var16 & 1 << var46) != 0 ? 1 : 0;
												continue;
											}

											if (opcode == 4011) {
												istackptr -= 2;
												var16 = Class1.intstack[istackptr];
												var46 = Class1.intstack[istackptr + 1];
												Class1.intstack[istackptr++] = var16 % var46;
												continue;
											}

											if (opcode == 4012) {
												istackptr -= 2;
												var16 = Class1.intstack[istackptr];
												var46 = Class1.intstack[istackptr + 1];
												if (var16 == 0) {
													Class1.intstack[istackptr++] = 0;
												} else {
													Class1.intstack[istackptr++] = (int) Math.pow((double) var16, (double) var46);
												}
												continue;
											}

											if (opcode == 4013) {
												istackptr -= 2;
												var16 = Class1.intstack[istackptr];
												var46 = Class1.intstack[1 + istackptr];
												if (var16 == 0) {
													Class1.intstack[istackptr++] = 0;
												} else if (var46 == 0) {
													Class1.intstack[istackptr++] = 2147483647;
												} else {
													Class1.intstack[istackptr++] = (int) Math.pow((double) var16, 1.0D / (double) var46);
												}
												continue;
											}

											if (opcode == 4014) {
												istackptr -= 2;
												var16 = Class1.intstack[istackptr];
												var46 = Class1.intstack[1 + istackptr];
												Class1.intstack[istackptr++] = var16 & var46;
												continue;
											}

											if (opcode == 4015) {
												istackptr -= 2;
												var16 = Class1.intstack[istackptr];
												var46 = Class1.intstack[istackptr + 1];
												Class1.intstack[istackptr++] = var16 | var46;
												continue;
											}
										} else {
											char var36;
											int var87;
											if (opcode < 4200) {
												if (opcode == 4100) {
													--var7;
													var52 = Class1.stringstack[var7];
													--istackptr;
													var46 = Class1.intstack[istackptr];
													Class1.stringstack[var7++] = var52 + var46;
													continue;
												}

												if (opcode == 4101) {
													var7 -= 2;
													var52 = Class1.stringstack[var7];
													var58 = Class1.stringstack[1 + var7];
													Class1.stringstack[var7++] = var52 + var58;
													continue;
												}

												if (opcode == 4102) {
													--var7;
													var52 = Class1.stringstack[var7];
													--istackptr;
													var46 = Class1.intstack[istackptr];
													Class1.stringstack[var7++] = var52 + IsaacCipher.method826(var46, true, (byte) -11);
													continue;
												}

												if (opcode == 4103) {
													--var7;
													var52 = Class1.stringstack[var7];
													Class1.stringstack[var7++] = var52.toLowerCase();
													continue;
												}

												if (opcode == 4104) {
													--istackptr;
													var16 = Class1.intstack[istackptr];
													long var33 = 86400000L * ((long) var16 + 11745L);
													Class1.aCalendar4.setTime(new Date(var33));
													var19 = Class1.aCalendar4.get(5);
													var20 = Class1.aCalendar4.get(2);
													var56 = Class1.aCalendar4.get(1);
													Class1.stringstack[var7++] = var19 + "-" + Class1.aStringArray11[var20] + "-" + var56;
													continue;
												}

												if (opcode == 4105) {
													var7 -= 2;
													var52 = Class1.stringstack[var7];
													var58 = Class1.stringstack[var7 + 1];
													if (Player.me.aClass108_2815 != null && Player.me.aClass108_2815.aBool1502) {
														Class1.stringstack[var7++] = var58;
														continue;
													}

													Class1.stringstack[var7++] = var52;
													continue;
												}

												if (opcode == 4106) {
													--istackptr;
													var16 = Class1.intstack[istackptr];
													Class1.stringstack[var7++] = Integer.toString(var16);
													continue;
												}

												if (opcode == 4107) {
													var7 -= 2;
													int[] var111 = Class1.intstack;
													var46 = istackptr++;
													var59 = Class1.stringstack[var7];
													String var72 = Class1.stringstack[var7 + 1];
													var56 = GameClient.anInt2865 * 1017874057;
													var61 = var59.length();
													var87 = var72.length();
													var25 = 0;
													var26 = 0;
													var27 = 0;
													char var35 = 0;

													label2821:
													while (true) {
														if (var25 - var27 >= var61 && var26 - var35 >= var87) {
															int var99 = Math.min(var61, var87);

															char var39;
															int var100;
															for (var100 = 0; var100 < var99; var100++) {
																char var38 = var59.charAt(var100);
																var39 = var72.charAt(var100);
																if (var39 != var38 && Character.toUpperCase(var38) != Character.toUpperCase(var39)) {
																	var38 = Character.toLowerCase(var38);
																	var39 = Character.toLowerCase(var39);
																	if (var38 != var39) {
																		var45 = Class7.method159(var38, var56, -1371888490) - Class7.method159(var39, var56, -1278015739);
																		break label2821;
																	}
																}
															}

															var100 = var61 - var87;
															if (var100 != 0) {
																var45 = var100;
															} else {
																for (int var101 = 0; var101 < var99; var101++) {
																	var39 = var59.charAt(var101);
																	char var40 = var72.charAt(var101);
																	if (var39 != var40) {
																		var45 = Class7.method159(var39, var56, 791483632) - Class7.method159(var40, var56, 359727078);
																		break label2821;
																	}
																}

																var45 = 0;
															}
															break;
														}

														if (var25 - var27 >= var61) {
															var45 = -1;
															break;
														}

														if (var26 - var35 >= var87) {
															var45 = 1;
															break;
														}

														if (var27 != 0) {
															var36 = var27;
															boolean var75 = false;
														} else {
															var36 = var59.charAt(var25++);
														}

														char var37;
														if (var35 != 0) {
															var37 = var35;
															boolean var92 = false;
														} else {
															var37 = var72.charAt(var26++);
														}

														var27 = Class33.method467(var36, 2062038330);
														var35 = Class33.method467(var37, -64858394);
														var36 = Class86.method1093(var36, var56, 1353884547);
														var37 = Class86.method1093(var37, var56, 1380583713);
														if (var36 != var37 && Character.toUpperCase(var36) != Character.toUpperCase(var37)) {
															var36 = Character.toLowerCase(var36);
															var37 = Character.toLowerCase(var37);
															if (var37 != var36) {
																var45 = Class7.method159(var36, var56, 1113866011) - Class7.method159(var37, var56, -638837322);
																break;
															}
														}
													}

													var111[var46] = Class30.method410(var45, -1678055473);
													continue;
												}

												byte[] var64;
												CacheableEntry_Sub23_Sub14_Sub4_Sub1 var70;
												if (opcode == 4108) {
													--var7;
													var52 = Class1.stringstack[var7];
													istackptr -= 2;
													var46 = Class1.intstack[istackptr];
													var45 = Class1.intstack[istackptr + 1];
													var64 = Class121.aClass94_Sub1_1553.getFileData(var45, 0);
													var70 = new CacheableEntry_Sub23_Sub14_Sub4_Sub1(var64);
													Class1.intstack[istackptr++] = var70.method3371(var52, var46);
													continue;
												}

												if (opcode == 4109) {
													--var7;
													var52 = Class1.stringstack[var7];
													istackptr -= 2;
													var46 = Class1.intstack[istackptr];
													var45 = Class1.intstack[1 + istackptr];
													var64 = Class121.aClass94_Sub1_1553.getFileData(var45, 0);
													var70 = new CacheableEntry_Sub23_Sub14_Sub4_Sub1(var64);
													Class1.intstack[istackptr++] = var70.method3319(var52, var46);
													continue;
												}

												if (opcode == 4110) {
													var7 -= 2;
													var52 = Class1.stringstack[var7];
													var58 = Class1.stringstack[1 + var7];
													--istackptr;
													if (Class1.intstack[istackptr] == 1) {
														Class1.stringstack[var7++] = var52;
													} else {
														Class1.stringstack[var7++] = var58;
													}
													continue;
												}

												if (opcode == 4111) {
													--var7;
													var52 = Class1.stringstack[var7];
													Class1.stringstack[var7++] = CacheableEntry_Sub23_Sub14_Sub4.method3315(var52);
													continue;
												}

												if (opcode == 4112) {
													--var7;
													var52 = Class1.stringstack[var7];
													--istackptr;
													var46 = Class1.intstack[istackptr];
													Class1.stringstack[var7++] = var52 + (char) var46;
													continue;
												}

												if (opcode == 4113) {
													--istackptr;
													var16 = Class1.intstack[istackptr];
													Class1.intstack[istackptr++] = CacheableEntry_Sub23_Sub16_Sub2.method2964((char) var16, (byte) 14) ? 1 : 0;
													continue;
												}

												char var69;
												if (opcode == 4114) {
													--istackptr;
													var16 = Class1.intstack[istackptr];
													var48 = Class1.intstack;
													var45 = istackptr++;
													var69 = (char) var16;
													var62 = var69 >= 48 && var69 <= 57 || var69 >= 65 && var69 <= 90 || var69 >= 97 && var69 <= 122;
													var48[var45] = var62 ? 1 : 0;
													continue;
												}

												if (opcode == 4115) {
													--istackptr;
													var16 = Class1.intstack[istackptr];
													Class1.intstack[istackptr++] = Class55.method785((char) var16, -142725244) ? 1 : 0;
													continue;
												}

												if (opcode == 4116) {
													--istackptr;
													var16 = Class1.intstack[istackptr];
													Class1.intstack[istackptr++] = AnimationSequence.method2338((char) var16, 1317079641) ? 1 : 0;
													continue;
												}

												if (opcode == 4117) {
													--var7;
													var52 = Class1.stringstack[var7];
													if (var52 != null) {
														Class1.intstack[istackptr++] = var52.length();
													} else {
														Class1.intstack[istackptr++] = 0;
													}
													continue;
												}

												if (opcode == 4118) {
													--var7;
													var52 = Class1.stringstack[var7];
													istackptr -= 2;
													var46 = Class1.intstack[istackptr];
													var45 = Class1.intstack[1 + istackptr];
													Class1.stringstack[var7++] = var52.substring(var46, var45);
													continue;
												}

												if (opcode == 4119) {
													--var7;
													var52 = Class1.stringstack[var7];
													StringBuilder var97 = new StringBuilder(var52.length());
													var18 = false;

													for (var19 = 0; var19 < var52.length(); var19++) {
														var69 = var52.charAt(var19);
														if (var69 == 60) {
															var18 = true;
														} else if (var69 == 62) {
															var18 = false;
														} else if (!var18) {
															var97.append(var69);
														}
													}

													Class1.stringstack[var7++] = var97.toString();
													continue;
												}

												if (opcode == 4120) {
													--var7;
													var52 = Class1.stringstack[var7];
													--istackptr;
													var46 = Class1.intstack[istackptr];
													Class1.intstack[istackptr++] = var52.indexOf(var46);
													continue;
												}

												if (opcode == 4121) {
													var7 -= 2;
													var52 = Class1.stringstack[var7];
													var58 = Class1.stringstack[1 + var7];
													--istackptr;
													var45 = Class1.intstack[istackptr];
													Class1.intstack[istackptr++] = var52.indexOf(var58, var45);
													continue;
												}
											} else if (opcode < 4300) {
												if (opcode == 4200) {
													--istackptr;
													var16 = Class1.intstack[istackptr];
													Class1.stringstack[var7++] = PacketDecoder.getItemDef(var16).name;
													continue;
												}

												ItemDef var82;
												if (opcode == 4201) {
													istackptr -= 2;
													var16 = Class1.intstack[istackptr];
													var46 = Class1.intstack[1 + istackptr];
													var82 = PacketDecoder.getItemDef(var16);
													if (var46 >= 1 && var46 <= 5 && var82.options[var46 - 1] != null) {
														Class1.stringstack[var7++] = var82.options[var46 - 1];
														continue;
													}

													Class1.stringstack[var7++] = "";
													continue;
												}

												if (opcode == 4202) {
													istackptr -= 2;
													var16 = Class1.intstack[istackptr];
													var46 = Class1.intstack[istackptr + 1];
													var82 = PacketDecoder.getItemDef(var16);
													if (var46 >= 1 && var46 <= 5 && var82.ioptions[var46 - 1] != null) {
														Class1.stringstack[var7++] = var82.ioptions[var46 - 1];
														continue;
													}

													Class1.stringstack[var7++] = "";
													continue;
												}

												if (opcode == 4203) {
													--istackptr;
													var16 = Class1.intstack[istackptr];
													Class1.intstack[istackptr++] = PacketDecoder.getItemDef(var16).cost * -2063697793;
													continue;
												}

												if (opcode == 4204) {
													--istackptr;
													var16 = Class1.intstack[istackptr];
													Class1.intstack[istackptr++] = PacketDecoder.getItemDef(var16).stackable * 833352093 == 1 ? 1 : 0;
													continue;
												}

												ItemDef var103;
												if (opcode == 4205) {
													--istackptr;
													var16 = Class1.intstack[istackptr];
													var103 = PacketDecoder.getItemDef(var16);
													if (var103.anInt2151 * -993125921 == -1 && var103.anInt2120 * -1776131735 >= 0) {
														Class1.intstack[istackptr++] = var103.anInt2120 * -1776131735;
														continue;
													}

													Class1.intstack[istackptr++] = var16;
													continue;
												}

												if (opcode == 4206) {
													--istackptr;
													var16 = Class1.intstack[istackptr];
													var103 = PacketDecoder.getItemDef(var16);
													if (var103.anInt2151 * -993125921 >= 0 && var103.anInt2120 * -1776131735 >= 0) {
														Class1.intstack[istackptr++] = var103.anInt2120 * -1776131735;
														continue;
													}

													Class1.intstack[istackptr++] = var16;
													continue;
												}

												if (opcode == 4207) {
													--istackptr;
													var16 = Class1.intstack[istackptr];
													Class1.intstack[istackptr++] = PacketDecoder.getItemDef(var16).members ? 1 : 0;
													continue;
												}

												if (opcode == 4210) {
													--var7;
													var52 = Class1.stringstack[var7];
													--istackptr;
													var46 = Class1.intstack[istackptr];
													var62 = var46 == 1;
													var80 = var52.toLowerCase();
													short[] var77 = new short[16];
													var56 = 0;
													var61 = 0;

													while (true) {
														if (var61 >= ItemDef.anInt2111 * -2017913323) {
															Class36.aShortArray486 = var77;
															CacheableEntry_Sub23_Sub6.anInt2207 = 0;
															CacheableEntry_Sub23_Sub16_Sub3.anInt2571 = var56 * 605945049;
															String[] var66 = new String[CacheableEntry_Sub23_Sub16_Sub3.anInt2571 * -257244311];

															for (var87 = 0; var87 < CacheableEntry_Sub23_Sub16_Sub3.anInt2571 * -257244311; var87++) {
																var66[var87] = PacketDecoder.getItemDef(var77[var87]).name;
															}

															Class34.method470(var66, Class36.aShortArray486, -1292716510);
															break;
														}

														ItemDef var88 = PacketDecoder.getItemDef(var61);
														if ((!var62 || var88.grandexchange) && var88.anInt2151 * -993125921 == -1 && var88.name.toLowerCase().indexOf(var80) != -1) {
															if (var56 >= 250) {
																CacheableEntry_Sub23_Sub16_Sub3.anInt2571 = -605945049;
																Class36.aShortArray486 = null;
																break;
															}

															if (var56 >= var77.length) {
																short[] var68 = new short[var77.length * 2];

																for (var26 = 0; var26 < var56; var26++) {
																	var68[var26] = var77[var26];
																}

																var77 = var68;
															}

															var77[var56++] = (short) var61;
														}

														++var61;
													}

													Class1.intstack[istackptr++] = CacheableEntry_Sub23_Sub16_Sub3.anInt2571 * -257244311;
													continue;
												}

												if (opcode == 4211) {
													if (Class36.aShortArray486 != null && CacheableEntry_Sub23_Sub6.anInt2207 * 1745502185 < CacheableEntry_Sub23_Sub16_Sub3.anInt2571 * -257244311) {
														Class1.intstack[istackptr++] = Class36.aShortArray486[(CacheableEntry_Sub23_Sub6.anInt2207 += 488409177) * 1745502185 - 1] & 65535;
														continue;
													}

													Class1.intstack[istackptr++] = -1;
													continue;
												}

												if (opcode == 4212) {
													CacheableEntry_Sub23_Sub6.anInt2207 = 0;
													continue;
												}
											} else if (opcode < 5100) {
												if (opcode == 5000) {
													Class1.intstack[istackptr++] = GameClient.anInt3039 * 500271761;
													continue;
												}

												if (opcode == 5001) {
													istackptr -= 3;
													GameClient.anInt3039 = Class1.intstack[istackptr] * -1443662223;
													DataBuffer.aClass59_1826 = CacheableEntry_Sub23_Sub16_Sub4.method3073(Class1.intstack[istackptr + 1], (short) 1205);
													if (DataBuffer.aClass59_1826 == null) {
														DataBuffer.aClass59_1826 = Class59.aClass59_768;
													}

													GameClient.anInt3086 = Class1.intstack[istackptr + 2] * 1525861331;
													GameClient.secureBuffer.writeOpcode(49);
													GameClient.secureBuffer.writeByte(GameClient.anInt3039 * 500271761);
													GameClient.secureBuffer.writeByte(DataBuffer.aClass59_1826.anInt764 * 1330568289);
													GameClient.secureBuffer.writeByte(GameClient.anInt3086 * -2025012133);
													continue;
												}

												if (opcode == 5002) {
													--var7;
													var52 = Class1.stringstack[var7];
													istackptr -= 2;
													var46 = Class1.intstack[istackptr];
													var45 = Class1.intstack[istackptr + 1];
													GameClient.secureBuffer.writeOpcode(10);
													GameClient.secureBuffer.writeByte(Class56.calcStringBytes(var52) + 2);
													GameClient.secureBuffer.writeStr(var52);
													GameClient.secureBuffer.writeByte(var46 - 1);
													GameClient.secureBuffer.writeByte(var45);
													continue;
												}

												if (opcode == 5003) {
													istackptr -= 2;
													var16 = Class1.intstack[istackptr];
													var46 = Class1.intstack[istackptr + 1];
													CacheableEntry_Sub23_Sub12 var86 = Class3.method129(var16, var46, -2031825513);
													if (var86 != null) {
														Class1.intstack[istackptr++] = var86.anInt2350 * 870241633;
														Class1.intstack[istackptr++] = var86.anInt2341 * 1200897509;
														Class1.stringstack[var7++] = var86.aString2343 != null ? var86.aString2343 : "";
														Class1.stringstack[var7++] = var86.aString2352 != null ? var86.aString2352 : "";
														Class1.stringstack[var7++] = var86.aString2345 != null ? var86.aString2345 : "";
													} else {
														Class1.intstack[istackptr++] = -1;
														Class1.intstack[istackptr++] = 0;
														Class1.stringstack[var7++] = "";
														Class1.stringstack[var7++] = "";
														Class1.stringstack[var7++] = "";
													}
													continue;
												}

												if (opcode == 5004) {
													--istackptr;
													var16 = Class1.intstack[istackptr];
													CacheableEntry_Sub23_Sub12 var104 = (CacheableEntry_Sub23_Sub12) PacketDecoder.aClass122_336.method1516((long) var16);
													if (var104 != null) {
														Class1.intstack[istackptr++] = var104.anInt2344 * -2055125065;
														Class1.intstack[istackptr++] = var104.anInt2341 * 1200897509;
														Class1.stringstack[var7++] = var104.aString2343 != null ? var104.aString2343 : "";
														Class1.stringstack[var7++] = var104.aString2352 != null ? var104.aString2352 : "";
														Class1.stringstack[var7++] = var104.aString2345 != null ? var104.aString2345 : "";
													} else {
														Class1.intstack[istackptr++] = -1;
														Class1.intstack[istackptr++] = 0;
														Class1.stringstack[var7++] = "";
														Class1.stringstack[var7++] = "";
														Class1.stringstack[var7++] = "";
													}
													continue;
												}

												if (opcode == 5005) {
													if (DataBuffer.aClass59_1826 == null) {
														Class1.intstack[istackptr++] = -1;
													} else {
														Class1.intstack[istackptr++] = DataBuffer.aClass59_1826.anInt764 * 1330568289;
													}
													continue;
												}

												if (opcode == 5008) {
													--var7;
													var52 = Class1.stringstack[var7];
													--istackptr;
													var46 = Class1.intstack[istackptr];
													var80 = var52.toLowerCase();
													byte color = 0;
													if (var80.startsWith(Class90.aString1232)) {
														color = 0;
														var52 = var52.substring(Class90.aString1232.length());
													} else if (var80.startsWith(Class90.aString1234)) {
														color = 1;
														var52 = var52.substring(Class90.aString1234.length());
													} else if (var80.startsWith(Class90.aString1238)) {
														color = 2;
														var52 = var52.substring(Class90.aString1238.length());
													} else if (var80.startsWith(Class90.aString1297)) {
														color = 3;
														var52 = var52.substring(Class90.aString1297.length());
													} else if (var80.startsWith(Class90.aString1240)) {
														color = 4;
														var52 = var52.substring(Class90.aString1240.length());
													} else if (var80.startsWith(Class90.aString1242)) {
														color = 5;
														var52 = var52.substring(Class90.aString1242.length());
													} else if (var80.startsWith(Class90.aString1244)) {
														color = 6;
														var52 = var52.substring(Class90.aString1244.length());
													} else if (var80.startsWith(Class90.aString1246)) {
														color = 7;
														var52 = var52.substring(Class90.aString1246.length());
													} else if (var80.startsWith(Class90.aString1193)) {
														color = 8;
														var52 = var52.substring(Class90.aString1193.length());
													} else if (var80.startsWith(Class90.aString1250)) {
														color = 9;
														var52 = var52.substring(Class90.aString1250.length());
													} else if (var80.startsWith(Class90.aString1259)) {
														color = 10;
														var52 = var52.substring(Class90.aString1259.length());
													} else if (var80.startsWith(Class90.aString1175)) {
														color = 11;
														var52 = var52.substring(Class90.aString1175.length());
													} else if (GameClient.anInt2865 * 1017874057 != 0) {
														if (var80.startsWith(Class90.aString1318)) {
															color = 0;
															var52 = var52.substring(Class90.aString1318.length());
														} else if (var80.startsWith(Class90.aString1078)) {
															color = 1;
															var52 = var52.substring(Class90.aString1078.length());
														} else if (var80.startsWith(Class90.aString1328)) {
															color = 2;
															var52 = var52.substring(Class90.aString1328.length());
														} else if (var80.startsWith(Class90.aString1239)) {
															color = 3;
															var52 = var52.substring(Class90.aString1239.length());
														} else if (var80.startsWith(Class90.aString1241)) {
															color = 4;
															var52 = var52.substring(Class90.aString1241.length());
														} else if (var80.startsWith(Class90.aString1243)) {
															color = 5;
															var52 = var52.substring(Class90.aString1243.length());
														} else if (var80.startsWith(Class90.aString1138)) {
															color = 6;
															var52 = var52.substring(Class90.aString1138.length());
														} else if (var80.startsWith(Class90.aString1247)) {
															color = 7;
															var52 = var52.substring(Class90.aString1247.length());
														} else if (var80.startsWith(Class90.aString1186)) {
															color = 8;
															var52 = var52.substring(Class90.aString1186.length());
														} else if (var80.startsWith(Class90.aString1251)) {
															color = 9;
															var52 = var52.substring(Class90.aString1251.length());
														} else if (var80.startsWith(Class90.aString1253)) {
															color = 10;
															var52 = var52.substring(Class90.aString1253.length());
														} else if (var80.startsWith(Class90.aString1255)) {
															color = 11;
															var52 = var52.substring(Class90.aString1255.length());
														}
													}

													var80 = var52.toLowerCase();
													byte effects = 0;
													if (var80.startsWith(Class90.aString1256)) {
														effects = 1;
														var52 = var52.substring(Class90.aString1256.length());
													} else if (var80.startsWith(Class90.aString1258)) {
														effects = 2;
														var52 = var52.substring(Class90.aString1258.length());
													} else if (var80.startsWith(Class90.aString1291)) {
														effects = 3;
														var52 = var52.substring(Class90.aString1291.length());
													} else if (var80.startsWith(Class90.aString1085)) {
														effects = 4;
														var52 = var52.substring(Class90.aString1085.length());
													} else if (var80.startsWith(Class90.aString1264)) {
														effects = 5;
														var52 = var52.substring(Class90.aString1264.length());
													} else if (GameClient.anInt2865 * 1017874057 != 0) {
														if (var80.startsWith(Class90.aString1257)) {
															effects = 1;
															var52 = var52.substring(Class90.aString1257.length());
														} else if (var80.startsWith(Class90.aString1262)) {
															effects = 2;
															var52 = var52.substring(Class90.aString1262.length());
														} else if (var80.startsWith(Class90.aString1261)) {
															effects = 3;
															var52 = var52.substring(Class90.aString1261.length());
														} else if (var80.startsWith(Class90.aString1263)) {
															effects = 4;
															var52 = var52.substring(Class90.aString1263.length());
														} else if (var80.startsWith(Class90.aString1099)) {
															effects = 5;
															var52 = var52.substring(Class90.aString1099.length());
														}
													}

													GameClient.secureBuffer.writeOpcode(210);
													GameClient.secureBuffer.writeByte(0);
													var56 = GameClient.secureBuffer.pos * 1736753585;
													GameClient.secureBuffer.writeByte(var46);
													GameClient.secureBuffer.writeByte(color);
													GameClient.secureBuffer.writeByte(effects);
													PacketBuffer buffer = GameClient.secureBuffer;
													var26 = var52.length();
													byte[] var79 = new byte[var26];

													for (int var93 = 0; var93 < var26; var93++) {
														var36 = var52.charAt(var93);
														if ((var36 <= 0 || var36 >= 128) && (var36 < 160 || var36 > 255)) {
															if (var36 == 8364) {
																var79[var93] = -128;
															} else if (var36 == 8218) {
																var79[var93] = -126;
															} else if (var36 == 402) {
																var79[var93] = -125;
															} else if (var36 == 8222) {
																var79[var93] = -124;
															} else if (var36 == 8230) {
																var79[var93] = -123;
															} else if (var36 == 8224) {
																var79[var93] = -122;
															} else if (var36 == 8225) {
																var79[var93] = -121;
															} else if (var36 == 710) {
																var79[var93] = -120;
															} else if (var36 == 8240) {
																var79[var93] = -119;
															} else if (var36 == 352) {
																var79[var93] = -118;
															} else if (var36 == 8249) {
																var79[var93] = -117;
															} else if (var36 == 338) {
																var79[var93] = -116;
															} else if (var36 == 381) {
																var79[var93] = -114;
															} else if (var36 == 8216) {
																var79[var93] = -111;
															} else if (var36 == 8217) {
																var79[var93] = -110;
															} else if (var36 == 8220) {
																var79[var93] = -109;
															} else if (var36 == 8221) {
																var79[var93] = -108;
															} else if (var36 == 8226) {
																var79[var93] = -107;
															} else if (var36 == 8211) {
																var79[var93] = -106;
															} else if (var36 == 8212) {
																var79[var93] = -105;
															} else if (var36 == 732) {
																var79[var93] = -104;
															} else if (var36 == 8482) {
																var79[var93] = -103;
															} else if (var36 == 353) {
																var79[var93] = -102;
															} else if (var36 == 8250) {
																var79[var93] = -101;
															} else if (var36 == 339) {
																var79[var93] = -100;
															} else if (var36 == 382) {
																var79[var93] = -98;
															} else if (var36 == 376) {
																var79[var93] = -97;
															} else {
																var79[var93] = 63;
															}
														} else {
															var79[var93] = (byte) var36;
														}
													}

													buffer.writeCompact(var79.length);
													buffer.pos += Class137.aClass60_1610.method807(var79, 0, var79.length, buffer.data, buffer.pos * 1736753585, 2065961349) * 1303963473;
													GameClient.secureBuffer.method1866(GameClient.secureBuffer.pos * 1736753585 - var56);
													continue;
												}

												if (opcode == 5009) {
													var7 -= 2;
													var52 = Class1.stringstack[var7];
													var58 = Class1.stringstack[1 + var7];
													GameClient.secureBuffer.writeOpcode(57);
													GameClient.secureBuffer.writeShort(0);
													var45 = GameClient.secureBuffer.pos * 1736753585;
													GameClient.secureBuffer.writeStr(var52);
													PacketBuffer var73 = GameClient.secureBuffer;
													var20 = var73.pos * 1736753585;
													var61 = var58.length();
													byte[] var89 = new byte[var61];

													for (var25 = 0; var25 < var61; var25++) {
														char var78 = var58.charAt(var25);
														if ((var78 <= 0 || var78 >= 128) && (var78 < 160 || var78 > 255)) {
															if (var78 == 8364) {
																var89[var25] = -128;
															} else if (var78 == 8218) {
																var89[var25] = -126;
															} else if (var78 == 402) {
																var89[var25] = -125;
															} else if (var78 == 8222) {
																var89[var25] = -124;
															} else if (var78 == 8230) {
																var89[var25] = -123;
															} else if (var78 == 8224) {
																var89[var25] = -122;
															} else if (var78 == 8225) {
																var89[var25] = -121;
															} else if (var78 == 710) {
																var89[var25] = -120;
															} else if (var78 == 8240) {
																var89[var25] = -119;
															} else if (var78 == 352) {
																var89[var25] = -118;
															} else if (var78 == 8249) {
																var89[var25] = -117;
															} else if (var78 == 338) {
																var89[var25] = -116;
															} else if (var78 == 381) {
																var89[var25] = -114;
															} else if (var78 == 8216) {
																var89[var25] = -111;
															} else if (var78 == 8217) {
																var89[var25] = -110;
															} else if (var78 == 8220) {
																var89[var25] = -109;
															} else if (var78 == 8221) {
																var89[var25] = -108;
															} else if (var78 == 8226) {
																var89[var25] = -107;
															} else if (var78 == 8211) {
																var89[var25] = -106;
															} else if (var78 == 8212) {
																var89[var25] = -105;
															} else if (var78 == 732) {
																var89[var25] = -104;
															} else if (var78 == 8482) {
																var89[var25] = -103;
															} else if (var78 == 353) {
																var89[var25] = -102;
															} else if (var78 == 8250) {
																var89[var25] = -101;
															} else if (var78 == 339) {
																var89[var25] = -100;
															} else if (var78 == 382) {
																var89[var25] = -98;
															} else if (var78 == 376) {
																var89[var25] = -97;
															} else {
																var89[var25] = 63;
															}
														} else {
															var89[var25] = (byte) var78;
														}
													}

													var73.writeCompact(var89.length);
													var73.pos += Class137.aClass60_1610.method807(var89, 0, var89.length, var73.data, var73.pos * 1736753585, 1830722420) * 1303963473;
													GameClient.secureBuffer.writeShortSize(GameClient.secureBuffer.pos * 1736753585 - var45);
													continue;
												}

												if (opcode == 5015) {
													if (Player.me != null && Player.me.aString2835 != null) {
														var52 = Player.me.aString2835;
													} else {
														var52 = "";
													}

													Class1.stringstack[var7++] = var52;
													continue;
												}

												if (opcode == 5016) {
													Class1.intstack[istackptr++] = GameClient.anInt3086 * -2025012133;
													continue;
												}

												if (opcode == 5017) {
													--istackptr;
													var16 = Class1.intstack[istackptr];
													Class1.intstack[istackptr++] = Class10.method218(var16, 649504743);
													continue;
												}

												if (opcode == 5018) {
													--istackptr;
													var16 = Class1.intstack[istackptr];
													var48 = Class1.intstack;
													var45 = istackptr++;
													CacheableEntry_Sub23_Sub12 var83 = (CacheableEntry_Sub23_Sub12) PacketDecoder.aClass122_336.method1516((long) var16);
													if (var83 == null) {
														var19 = -1;
													} else if (PacketDecoder.aClass125_337.aClass109_Sub23_1565 == var83.aClass109_Sub23_2085) {
														var19 = -1;
													} else {
														var19 = ((CacheableEntry_Sub23_Sub12) var83.aClass109_Sub23_2085).anInt2350 * 870241633;
													}

													var48[var45] = var19;
													continue;
												}

												if (opcode == 5019) {
													--istackptr;
													var16 = Class1.intstack[istackptr];
													Class1.intstack[istackptr++] = LinkedEntry_Sub7.method1818(var16, 1335798749);
													continue;
												}

												if (opcode == 5020) {
													--var7;
													var52 = Class1.stringstack[var7];
													Class46.method697(var52, (byte) 7);
													continue;
												}

												if (opcode == 5021) {
													--var7;
													GameClient.aString3096 = Class1.stringstack[var7].toLowerCase().trim();
													continue;
												}

												if (opcode == 5022) {
													Class1.stringstack[var7++] = GameClient.aString3096;
													continue;
												}
											}
										}
									}
								}
							}
						} else {
							var16 = -1;
							if (opcode >= 2000) {
								opcode -= 1000;
								--istackptr;
								var16 = Class1.intstack[istackptr];
								var17 = Class50.method713(var16, (byte) 61);
							} else {
								var17 = var57 ? Class131.aInterfaceDef_1585 : Class1.aInterfaceDef_7;
							}

							if (opcode == 1000) {
								istackptr -= 4;
								var17.anInt1946 = Class1.intstack[istackptr] * 1530429651;
								var17.anInt1949 = Class1.intstack[1 + istackptr] * -1351876651;
								var17.anInt1944 = Class1.intstack[2 + istackptr] * -538410635;
								var17.anInt2020 = Class1.intstack[istackptr + 3] * -1242302435;
								Class35.method484(var17, -938190060);
								Class54.method784(var17, -26170567);
								if (var16 != -1 && var17.contenttype * -1878336627 == 0) {
									Class57.method796(InterfaceDef.aInterfaceDefArrayArray1975[var16 >> 16], var17, false, 864116717);
								}
								continue;
							}

							if (opcode == 1001) {
								istackptr -= 4;
								var17.anInt1950 = Class1.intstack[istackptr] * 194957871;
								var17.anInt1953 = Class1.intstack[1 + istackptr] * -985908379;
								var17.anInt1964 = Class1.intstack[2 + istackptr] * -2101465699;
								var17.anInt1977 = Class1.intstack[istackptr + 3] * 763777549;
								Class35.method484(var17, -669696805);
								Class54.method784(var17, 262497387);
								if (var16 != -1 && var17.contenttype * -1878336627 == 0) {
									Class57.method796(InterfaceDef.aInterfaceDefArrayArray1975[var16 >> 16], var17, false, 1642974972);
								}
								continue;
							}

							if (opcode == 1003) {
								--istackptr;
								var18 = Class1.intstack[istackptr] == 1;
								if (var18 != var17.aBool1982) {
									var17.aBool1982 = var18;
									Class35.method484(var17, -489062954);
								}
								continue;
							}

							if (opcode == 1005) {
								--istackptr;
								var17.aBool2063 = Class1.intstack[istackptr] == 1;
								continue;
							}
						}
					}

					if (opcode < 5400) {
						if (opcode == 5306) {
							Class1.intstack[istackptr++] = LinkedEntry_Sub5_Sub4.method2933(-750586447);
							continue;
						}

						if (opcode == 5307) {
							--istackptr;
							var16 = Class1.intstack[istackptr];
							if (var16 != 1 && var16 != 2) {
								continue;
							}

							GameClient.aLong3080 = 0L;
							if (var16 >= 2) {
								GameClient.aBool3081 = true;
							} else {
								GameClient.aBool3081 = false;
							}

							EnumDef.method2353(-476741378);
							if (GameClient.anInt2868 * -684224463 >= 25) {
								GameClient.secureBuffer.writeOpcode(141);
								GameClient.secureBuffer.writeByte(LinkedEntry_Sub5_Sub4.method2933(451786431));
								GameClient.secureBuffer.writeShort(Class5.anInt98 * 2104430923);
								GameClient.secureBuffer.writeShort(Class60.anInt769 * -1064642111);
							}

							Applet_Sub1.aBool2849 = true;
							continue;
						}

						if (opcode == 5308) {
							Class1.intstack[istackptr++] = Class15.aClass35_195.anInt474 * 1158077189;
							continue;
						}

						if (opcode == 5309) {
							--istackptr;
							var16 = Class1.intstack[istackptr];
							if (var16 == 1 || var16 == 2) {
								Class15.aClass35_195.anInt474 = var16 * 1292679629;
								Class74.method1024(-1935332647);
							}
							continue;
						}
					}

					if (opcode < 5600) {
						if (opcode == 5504) {
							istackptr -= 2;
							var16 = Class1.intstack[istackptr];
							var46 = Class1.intstack[istackptr + 1];
							if (!GameClient.aBool3083) {
								GameClient.anInt2947 = var16 * -1054721373;
								GameClient.anInt2948 = var46 * -1768657929;
							}
						}

						if(opcode == 5505) {
							Class1.intstack[istackptr++] = 0;//GameClient.anInt3006 * -1150538009;
							continue;
						}

						if(opcode == 5506) {
							Class1.intstack[istackptr++] = 0;//GameClient.anInt3007 * -1032455509;
							continue;
						}

						if(opcode == 5530) {
							--istackptr;
							var16 = Class1.intstack[istackptr];
							if(var16 < 0) {
								var16 = 0;
							}

							Class106.zoom = var16;
							continue;
						}

						if(opcode == 5531) {
							Class1.intstack[istackptr++] = Class106.zoom;
							continue;
						}
					} else if (opcode < 5700 && opcode == 5630) {
						GameClient.anInt2915 = 1098944898;
					} else {
						if (opcode < 6300) {
							if (opcode == 6200) {
								istackptr -= 2;
								GameClient.aShort3106 = (short) Class1.intstack[istackptr];
								if (GameClient.aShort3106 <= 0) {
									GameClient.aShort3106 = 256;
								}

								GameClient.aShort3122 = (short) Class1.intstack[1 + istackptr];
								if (GameClient.aShort3122 <= 0) {
									GameClient.aShort3122 = 205;
								}
								continue;
							}

							if (opcode == 6201) {
								istackptr -= 2;
								GameClient.aShort3123 = (short) Class1.intstack[istackptr];
								if (GameClient.aShort3123 <= 0) {
									GameClient.aShort3123 = 256;
								}

								GameClient.aShort3024 = (short) Class1.intstack[istackptr + 1];
								if (GameClient.aShort3024 <= 0) {
									GameClient.aShort3024 = 320;
								}
								continue;
							}

							if (opcode == 6202) {
								istackptr -= 4;
								GameClient.aShort3125 = (short) Class1.intstack[istackptr];
								if (GameClient.aShort3125 <= 0) {
									GameClient.aShort3125 = 1;
								}

								GameClient.aShort3126 = (short) Class1.intstack[1 + istackptr];
								if (GameClient.aShort3126 <= 0) {
									GameClient.aShort3126 = 32767;
								} else if (GameClient.aShort3126 < GameClient.aShort3125) {
									GameClient.aShort3126 = GameClient.aShort3125;
								}

								GameClient.aShort3137 = (short) Class1.intstack[istackptr + 2];
								if (GameClient.aShort3137 <= 0) {
									GameClient.aShort3137 = 1;
								}

								GameClient.aShort3057 = (short) Class1.intstack[3 + istackptr];
								if (GameClient.aShort3057 <= 0) {
									GameClient.aShort3057 = 32767;
								} else if (GameClient.aShort3057 < GameClient.aShort3137) {
									GameClient.aShort3057 = GameClient.aShort3137;
								}
								continue;
							}

							if (opcode == 6203) {
								if (GameClient.aInterfaceDef_3037 != null) {
									Class35.method482(0, 0, GameClient.aInterfaceDef_3037.anInt1954 * 2096072399, GameClient.aInterfaceDef_3037.invsize * 539675235, false, -82959261);
									Class1.intstack[istackptr++] = GameClient.anInt3131 * -476732681;
									Class1.intstack[istackptr++] = GameClient.anInt3033 * -186527881;
								} else {
									Class1.intstack[istackptr++] = -1;
									Class1.intstack[istackptr++] = -1;
								}
								continue;
							}

							if (opcode == 6204) {
								Class1.intstack[istackptr++] = GameClient.aShort3123;
								Class1.intstack[istackptr++] = GameClient.aShort3024;
								continue;
							}

							if (opcode == 6205) {
								Class1.intstack[istackptr++] = GameClient.aShort3106;
								Class1.intstack[istackptr++] = GameClient.aShort3122;
								continue;
							}
						}

						if (opcode < 6600) {
							if (opcode == 6500) {
								Class1.intstack[istackptr++] = Class61.method816((byte) -101) ? 1 : 0;
								continue;
							}

							Class51 var107;
							if (opcode == 6501) {
								Class51.anInt700 = 0;
								if (Class51.anInt700 * 1421591807 < Class51.anInt711 * 1121294703) {
									var107 = Class4.aClass51Array80[(Class51.anInt700 -= 2002044161) * 1421591807 - 1];
								} else {
									var107 = null;
								}

								if (var107 != null) {
									Class1.intstack[istackptr++] = var107.anInt703 * 1685233739;
									Class1.intstack[istackptr++] = var107.anInt704 * 438674181;
									Class1.stringstack[var7++] = var107.aString707;
									Class1.intstack[istackptr++] = var107.anInt710 * -1139554955;
									Class1.intstack[istackptr++] = var107.anInt701 * 1599434219;
									Class1.stringstack[var7++] = var107.aString699;
								} else {
									Class1.intstack[istackptr++] = -1;
									Class1.intstack[istackptr++] = 0;
									Class1.stringstack[var7++] = "";
									Class1.intstack[istackptr++] = 0;
									Class1.intstack[istackptr++] = 0;
									Class1.stringstack[var7++] = "";
								}
								continue;
							}

							if (opcode == 6502) {
								Class51 var112;
								if (Class51.anInt700 * 1421591807 < Class51.anInt711 * 1121294703) {
									var112 = Class4.aClass51Array80[(Class51.anInt700 -= 2002044161) * 1421591807 - 1];
								} else {
									var112 = null;
								}

								if (var112 != null) {
									Class1.intstack[istackptr++] = var112.anInt703 * 1685233739;
									Class1.intstack[istackptr++] = var112.anInt704 * 438674181;
									Class1.stringstack[var7++] = var112.aString707;
									Class1.intstack[istackptr++] = var112.anInt710 * -1139554955;
									Class1.intstack[istackptr++] = var112.anInt701 * 1599434219;
									Class1.stringstack[var7++] = var112.aString699;
								} else {
									Class1.intstack[istackptr++] = -1;
									Class1.intstack[istackptr++] = 0;
									Class1.stringstack[var7++] = "";
									Class1.intstack[istackptr++] = 0;
									Class1.intstack[istackptr++] = 0;
									Class1.stringstack[var7++] = "";
								}
								continue;
							}

							if (opcode == 6506) {
								--istackptr;
								var16 = Class1.intstack[istackptr];
								var107 = null;

								for (var45 = 0; var45 < Class51.anInt711 * 1121294703; var45++) {
									if (var16 == Class4.aClass51Array80[var45].anInt703 * 1685233739) {
										var107 = Class4.aClass51Array80[var45];
										break;
									}
								}

								if (var107 != null) {
									Class1.intstack[istackptr++] = var107.anInt703 * 1685233739;
									Class1.intstack[istackptr++] = var107.anInt704 * 438674181;
									Class1.stringstack[var7++] = var107.aString707;
									Class1.intstack[istackptr++] = var107.anInt710 * -1139554955;
									Class1.intstack[istackptr++] = var107.anInt701 * 1599434219;
									Class1.stringstack[var7++] = var107.aString699;
								} else {
									Class1.intstack[istackptr++] = -1;
									Class1.intstack[istackptr++] = 0;
									Class1.stringstack[var7++] = "";
									Class1.intstack[istackptr++] = 0;
									Class1.intstack[istackptr++] = 0;
									Class1.stringstack[var7++] = "";
								}
								continue;
							}

							if (opcode == 6507) {
								istackptr -= 4;
								var16 = Class1.intstack[istackptr];
								var54 = Class1.intstack[1 + istackptr] == 1;
								var45 = Class1.intstack[istackptr + 2];
								var62 = Class1.intstack[3 + istackptr] == 1;
								CacheableEntry_Sub23_Sub16_Sub7.method3296(var16, var54, var45, var62, 49523198);
								continue;
							}

							if (opcode == 6511) {
								--istackptr;
								var16 = Class1.intstack[istackptr];
								if (var16 >= 0 && var16 < Class51.anInt711 * 1121294703) {
									var107 = Class4.aClass51Array80[var16];
									Class1.intstack[istackptr++] = var107.anInt703 * 1685233739;
									Class1.intstack[istackptr++] = var107.anInt704 * 438674181;
									Class1.stringstack[var7++] = var107.aString707;
									Class1.intstack[istackptr++] = var107.anInt710 * -1139554955;
									Class1.intstack[istackptr++] = var107.anInt701 * 1599434219;
									Class1.stringstack[var7++] = var107.aString699;
									continue;
								}

								Class1.intstack[istackptr++] = -1;
								Class1.intstack[istackptr++] = 0;
								Class1.stringstack[var7++] = "";
								Class1.intstack[istackptr++] = 0;
								Class1.intstack[istackptr++] = 0;
								Class1.stringstack[var7++] = "";
								continue;
							}
						}

						System.err.println("nigga opcode " + opcode);
						System.exit(0);
						throw new IllegalStateException("unknown opcode " + opcode);
					}
				}
			} catch (Exception var41) {
				StringBuilder var13 = new StringBuilder(30);
				var13.append("").append(var5.key).append(" ");

				for (var14 = Class1.anInt1 * 569712483 - 1; var14 >= 0; --var14) {
					var13.append("").append(Class1.aClass50Array8[var14].aClass109_Sub23_Sub17_692.key).append(" ");
				}

				var13.append("").append(var11);
				Class72.method964(var13.toString(), var41, (byte) 1);
			}
		}
	}

	Class79() throws Throwable {
		throw new Error();
	}

}
