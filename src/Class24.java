import java.util.Calendar;
import java.util.TimeZone;

public class Class24 {

	static int anInt317;
	public static final int anInt318 = 58;
	static final int anInt319 = 87;
	static final int anInt320 = 34;
	public static final int anInt321 = 231;
	static String[][] aStringArrayArray314 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}};
	static String[] aStringArray315 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
	static Calendar aCalendar316;

	static final void method354(InterfaceDef[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
		for (int var9 = 0; var9 < var0.length; var9++) {
			InterfaceDef inter = var0[var9];
			if (inter != null && (!inter.cs2Inter || inter.contenttype * -1878336627 == 0 || inter.aBool1960 || LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(inter) != 0 || inter == GameClient.aInterfaceDef_3036 || inter.anInt1943 * -202095703 == 1338) && var1 == inter.anInt1958 * -1588791493 && (!inter.cs2Inter || !Connection.method1061(inter, (byte) -50))) {
				int var10 = var6 + inter.anInt1952 * -18591297;
				int var19 = var7 + inter.anInt1945 * -591061715;
				int var12;
				int var15;
				int var16;
				int var17;
				int var18;
				int var20;
				int var21;
				int var22;
				if (inter.contenttype * -1878336627 == 2) {
					var15 = var2;
					var16 = var3;
					var17 = var4;
					var18 = var5;
				} else if (inter.contenttype * -1878336627 == 9) {
					var12 = var10;
					var20 = var19;
					var21 = inter.anInt1954 * 2096072399 + var10;
					var22 = inter.invsize * 539675235 + var19;
					if (var21 < var10) {
						var12 = var21;
						var21 = var10;
					}

					if (var22 < var19) {
						var20 = var22;
						var22 = var19;
					}

					++var21;
					++var22;
					var15 = var12 > var2 ? var12 : var2;
					var16 = var20 > var3 ? var20 : var3;
					var17 = var21 < var4 ? var21 : var4;
					var18 = var22 < var5 ? var22 : var5;
				} else {
					var12 = var10 + inter.anInt1954 * 2096072399;
					var20 = inter.invsize * 539675235 + var19;
					var15 = var10 > var2 ? var10 : var2;
					var16 = var19 > var3 ? var19 : var3;
					var17 = var12 < var4 ? var12 : var4;
					var18 = var20 < var5 ? var20 : var5;
				}

				if (GameClient.aInterfaceDef_3038 == inter) {
					GameClient.aBool3046 = true;
					GameClient.anInt3044 = var10 * 70397561;
					GameClient.anInt3121 = var19 * -1380790065;
				}

				if (!inter.cs2Inter || var15 < var17 && var16 < var18) {
					var12 = Class74.anInt897 * -1031552075;
					var20 = Class74.anInt898 * 1941423145;
					if (Class74.anInt903 * 332680755 != 0) {
						var12 = Class74.anInt891 * 1837550337;
						var20 = Class74.anInt905 * -1013575437;
					}

					if (inter.anInt1943 * -202095703 == 1337) {
						if (!GameClient.aBool2953 && !GameClient.aBool3006 && var12 >= var15 && var20 >= var16 && var12 < var17 && var20 < var18) {
							Class23.method350(var12, var20, var15, var16, -387339345);
						}
					} else if (inter.anInt1943 * -202095703 == 1338) {
						Class96.method1231(inter, var10, var19, -1851343786);
					} else {
						if (!GameClient.aBool3006 && var12 >= var15 && var20 >= var16 && var12 < var17 && var20 < var18) {
							CacheableEntry_Sub23_Sub1.method2212(inter, var12 - var10, var20 - var19);
						}

						if (inter.contenttype * -1878336627 == 0) {
							if (!inter.cs2Inter && Connection.method1061(inter, (byte) 8) && inter != Class6.aInterfaceDef_103) {
								continue;
							}

							method354(var0, inter.hash * 1582464481, var15, var16, var17, var18, var10 - inter.anInt2070 * 706996303, var19 - inter.anInt2038 * -650026719, (byte) -1);
							if (inter.aInterfaceDefArray2061 != null) {
								method354(inter.aInterfaceDefArray2061, inter.hash * 1582464481, var15, var16, var17, var18, var10 - inter.anInt2070 * 706996303, var19 - inter.anInt2038 * -650026719, (byte) -1);
							}

							LinkedEntry_Sub13 var30 = (LinkedEntry_Sub13) GameClient.aJagexMap_3073.get((long) (inter.hash * 1582464481));
							if (var30 != null) {
								if (var30.anInt1823 * -1355411471 == 0 && Class74.anInt897 * -1031552075 >= var15 && Class74.anInt898 * 1941423145 >= var16 && Class74.anInt897 * -1031552075 < var17 && Class74.anInt898 * 1941423145 < var18 && !GameClient.aBool3006 && !GameClient.enableQAInterfaceDebug) {
									GameClient.menuOptions[0] = Class90.aString1245;
									GameClient.menuOptionTexts[0] = "";
									GameClient.menuCommands[0] = 1006;
									GameClient.menuActionPtr = -439682997;
								}

								RuntimeException_Sub1.method3300(var30.anInt1819 * -1385416029, var15, var16, var17, var18, var10, var19, (byte) -4);
							}
						}

						int var24;
						int var25;
						int var29;
						if (inter.cs2Inter) {
							if (inter.aBool2063 && Class74.anInt897 * -1031552075 >= var15 && Class74.anInt898 * 1941423145 >= var16 && Class74.anInt897 * -1031552075 < var17 && Class74.anInt898 * 1941423145 < var18) {
								for (ScriptInvocation var31 = (ScriptInvocation) GameClient.scriptInvocationQueue.method1405(); var31 != null; var31 = (ScriptInvocation) GameClient.scriptInvocationQueue.method1402()) {
									if (var31.aBool1769) {
										var31.unlink();
										var31.inter.aBool2062 = false;
									}
								}

								if (Class44.anInt635 * 1969654907 == 0) {
									GameClient.aInterfaceDef_3038 = null;
									GameClient.aInterfaceDef_3036 = null;
								}

								if (!GameClient.aBool3006) {
									GameClient.menuOptions[0] = Class90.aString1245;
									GameClient.menuOptionTexts[0] = "";
									GameClient.menuCommands[0] = 1006;
									GameClient.menuActionPtr = -439682997;
								}
							}

							boolean var32;
							if (Class74.anInt897 * -1031552075 >= var15 && Class74.anInt898 * 1941423145 >= var16 && Class74.anInt897 * -1031552075 < var17 && Class74.anInt898 * 1941423145 < var18) {
								var32 = true;
							} else {
								var32 = false;
							}

							boolean var33 = false;
							if ((Class74.anInt896 * 445478637 == 1 || !Class46.aBool651 && Class74.anInt896 * 445478637 == 4) && var32) {
								var33 = true;
							}

							boolean var23 = false;
							if ((Class74.anInt903 * 332680755 == 1 || !Class46.aBool651 && Class74.anInt903 * 332680755 == 4) && Class74.anInt891 * 1837550337 >= var15 && Class74.anInt905 * -1013575437 >= var16 && Class74.anInt891 * 1837550337 < var17 && Class74.anInt905 * -1013575437 < var18) {
								var23 = true;
							}

							if (var23) {
								Class1.method40(inter, Class74.anInt891 * 1837550337 - var10, Class74.anInt905 * -1013575437 - var19, 182421926);
							}

							if (GameClient.aInterfaceDef_3038 != null && GameClient.aInterfaceDef_3038 != inter && var32) {
								var24 = LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(inter);
								boolean var14 = (var24 >> 20 & 1) != 0;
								if (var14) {
									GameClient.aInterfaceDef_3042 = inter;
								}
							}

							if (inter == GameClient.aInterfaceDef_3036) {
								GameClient.aBool3043 = true;
								GameClient.anInt2934 = var10 * 1418079215;
								GameClient.anInt3045 = var19 * 1618015443;
							}

							if (inter.aBool1960) {
								ScriptInvocation var28;
								if (var32 && GameClient.anInt3065 * 498699079 != 0 && inter.anObjectArray1951 != null) {
									var28 = new ScriptInvocation();
									var28.aBool1769 = true;
									var28.inter = inter;
									var28.anInt1776 = GameClient.anInt3065 * 227389881;
									var28.parameters = inter.anObjectArray1951;
									GameClient.scriptInvocationQueue.add(var28);
								}

								if (GameClient.aInterfaceDef_3038 != null || CacheableEntry_Sub23_Sub17.aInterfaceDef_2418 != null || GameClient.aBool3006) {
									var23 = false;
									var33 = false;
									var32 = false;
								}

								if (!inter.aBool1961 && var23) {
									inter.aBool1961 = true;
									if (inter.anObjectArray1968 != null) {
										var28 = new ScriptInvocation();
										var28.aBool1769 = true;
										var28.inter = inter;
										var28.anInt1770 = (Class74.anInt891 * 1837550337 - var10) * -2053567695;
										var28.anInt1776 = (Class74.anInt905 * -1013575437 - var19) * 1536383743;
										var28.parameters = inter.anObjectArray1968;
										GameClient.scriptInvocationQueue.add(var28);
									}
								}

								if (inter.aBool1961 && var33 && inter.anObjectArray1939 != null) {
									var28 = new ScriptInvocation();
									var28.aBool1769 = true;
									var28.inter = inter;
									var28.anInt1770 = (Class74.anInt897 * -1031552075 - var10) * -2053567695;
									var28.anInt1776 = (Class74.anInt898 * 1941423145 - var19) * 1536383743;
									var28.parameters = inter.anObjectArray1939;
									GameClient.scriptInvocationQueue.add(var28);
								}

								if (inter.aBool1961 && !var33) {
									inter.aBool1961 = false;
									if (inter.anObjectArray2021 != null) {
										var28 = new ScriptInvocation();
										var28.aBool1769 = true;
										var28.inter = inter;
										var28.anInt1770 = (Class74.anInt897 * -1031552075 - var10) * -2053567695;
										var28.anInt1776 = (Class74.anInt898 * 1941423145 - var19) * 1536383743;
										var28.parameters = inter.anObjectArray2021;
										GameClient.aJagexLinkedList_3068.add(var28);
									}
								}

								if (var33 && inter.anObjectArray2022 != null) {
									var28 = new ScriptInvocation();
									var28.aBool1769 = true;
									var28.inter = inter;
									var28.anInt1770 = (Class74.anInt897 * -1031552075 - var10) * -2053567695;
									var28.anInt1776 = (Class74.anInt898 * 1941423145 - var19) * 1536383743;
									var28.parameters = inter.anObjectArray2022;
									GameClient.scriptInvocationQueue.add(var28);
								}

								if (!inter.aBool2062 && var32) {
									inter.aBool2062 = true;
									if (inter.anObjectArray2017 != null) {
										var28 = new ScriptInvocation();
										var28.aBool1769 = true;
										var28.inter = inter;
										var28.anInt1770 = (Class74.anInt897 * -1031552075 - var10) * -2053567695;
										var28.anInt1776 = (Class74.anInt898 * 1941423145 - var19) * 1536383743;
										var28.parameters = inter.anObjectArray2017;
										GameClient.scriptInvocationQueue.add(var28);
									}
								}

								if (inter.aBool2062 && var32 && inter.anObjectArray2051 != null) {
									var28 = new ScriptInvocation();
									var28.aBool1769 = true;
									var28.inter = inter;
									var28.anInt1770 = (Class74.anInt897 * -1031552075 - var10) * -2053567695;
									var28.anInt1776 = (Class74.anInt898 * 1941423145 - var19) * 1536383743;
									var28.parameters = inter.anObjectArray2051;
									GameClient.scriptInvocationQueue.add(var28);
								}

								if (inter.aBool2062 && !var32) {
									inter.aBool2062 = false;
									if (inter.anObjectArray2025 != null) {
										var28 = new ScriptInvocation();
										var28.aBool1769 = true;
										var28.inter = inter;
										var28.anInt1770 = (Class74.anInt897 * -1031552075 - var10) * -2053567695;
										var28.anInt1776 = (Class74.anInt898 * 1941423145 - var19) * 1536383743;
										var28.parameters = inter.anObjectArray2025;
										GameClient.aJagexLinkedList_3068.add(var28);
									}
								}

								if (inter.anObjectArray2036 != null) {
									var28 = new ScriptInvocation();
									var28.inter = inter;
									var28.parameters = inter.anObjectArray2036;
									GameClient.aJagexLinkedList_3067.add(var28);
								}

								ScriptInvocation invocation;
								if (inter.varpScript != null && GameClient.anInt3052 * -539970213 > inter.anInt2004 * 530516545) {
									if (inter.varpTriggers != null && GameClient.anInt3052 * -539970213 - inter.anInt2004 * 530516545 <= 32) {
										label764:
										for (var29 = inter.anInt2004 * 530516545; var29 < GameClient.anInt3052 * -539970213; var29++) {
											var24 = GameClient.anIntArray2964[var29 & 31];

											for (var25 = 0; var25 < inter.varpTriggers.length; var25++) {
												if (var24 == inter.varpTriggers[var25]) {
													invocation = new ScriptInvocation();
													invocation.inter = inter;
													invocation.parameters = inter.varpScript;
													GameClient.scriptInvocationQueue.add(invocation);
													break label764;
												}
											}
										}
									} else {
										var28 = new ScriptInvocation();
										var28.inter = inter;
										var28.parameters = inter.varpScript;
										GameClient.scriptInvocationQueue.add(var28);
									}

									inter.anInt2004 = GameClient.anInt3052 * 975536283;
								}

								if (inter.itemContainerScript != null && GameClient.itemContainerTriggerptr * -84622767 > inter.anInt2066 * -648939829) {
									if (inter.itemContainerListeners != null && GameClient.itemContainerTriggerptr * -84622767 - inter.anInt2066 * -648939829 <= 32) {
										label740:
										for (var29 = inter.anInt2066 * -648939829; var29 < GameClient.itemContainerTriggerptr * -84622767; var29++) {
											int triggerKey = GameClient.itemContainerTriggers[var29 & 31];

											for (int index = 0; index < inter.itemContainerListeners.length; index++) {
												if (inter.itemContainerListeners[index] == triggerKey) {
													invocation = new ScriptInvocation();
													invocation.inter = inter;
													invocation.parameters = inter.itemContainerScript;
													GameClient.scriptInvocationQueue.add(invocation);
													break label740;
												}
											}
										}
									} else {
										var28 = new ScriptInvocation();
										var28.inter = inter;
										var28.parameters = inter.itemContainerScript;
										GameClient.scriptInvocationQueue.add(var28);
									}

									inter.anInt2066 = GameClient.itemContainerTriggerptr * -1488000045;
								}

								if (inter.anObjectArray2056 != null && GameClient.skillTriggerPtr * -44417725 > inter.anInt2042 * -312838873) {
									if (inter.skillTriggers != null && GameClient.skillTriggerPtr * -44417725 - inter.anInt2042 * -312838873 <= 32) {
										label716:
										for (var29 = inter.anInt2042 * -312838873; var29 < GameClient.skillTriggerPtr * -44417725; var29++) {
											int skillid = GameClient.skillIncreaseTriggers[var29 & 31];

											for (var25 = 0; var25 < inter.skillTriggers.length; var25++) {
												if (skillid == inter.skillTriggers[var25]) {
													invocation = new ScriptInvocation();
													invocation.inter = inter;
													invocation.parameters = inter.anObjectArray2056;
													GameClient.scriptInvocationQueue.add(invocation);
													break label716;
												}
											}
										}
									} else {
										var28 = new ScriptInvocation();
										var28.inter = inter;
										var28.parameters = inter.anObjectArray2056;
										GameClient.scriptInvocationQueue.add(var28);
									}

									inter.anInt2042 = GameClient.skillTriggerPtr * -1901748091;
								}

								if (GameClient.anInt2874 * 408056177 > inter.anInt1942 * 301551831 && inter.anObjectArray2064 != null) {
									var28 = new ScriptInvocation();
									var28.inter = inter;
									var28.parameters = inter.anObjectArray2064;
									GameClient.scriptInvocationQueue.add(var28);
								}

								if (GameClient.anInt2990 * -1412764705 > inter.anInt1942 * 301551831 && inter.anObjectArray2041 != null) {
									var28 = new ScriptInvocation();
									var28.inter = inter;
									var28.parameters = inter.anObjectArray2041;
									GameClient.scriptInvocationQueue.add(var28);
								}

								if (GameClient.anInt3014 * -1231214147 > inter.anInt1942 * 301551831 && inter.anObjectArray1978 != null) {
									var28 = new ScriptInvocation();
									var28.inter = inter;
									var28.parameters = inter.anObjectArray1978;
									GameClient.scriptInvocationQueue.add(var28);
								}

								if (GameClient.anInt2980 * -369109667 > inter.anInt1942 * 301551831 && inter.anObjectArray2047 != null) {
									var28 = new ScriptInvocation();
									var28.inter = inter;
									var28.parameters = inter.anObjectArray2047;
									GameClient.scriptInvocationQueue.add(var28);
								}

								if (GameClient.anInt2929 * -705690419 > inter.anInt1942 * 301551831 && inter.anObjectArray2048 != null) {
									var28 = new ScriptInvocation();
									var28.inter = inter;
									var28.parameters = inter.anObjectArray2048;
									GameClient.scriptInvocationQueue.add(var28);
								}

								if (GameClient.anInt3062 * 1979638683 > inter.anInt1942 * 301551831 && inter.anObjectArray2043 != null) {
									var28 = new ScriptInvocation();
									var28.inter = inter;
									var28.parameters = inter.anObjectArray2043;
									GameClient.scriptInvocationQueue.add(var28);
								}

								inter.anInt1942 = GameClient.anInt3050 * 613926489;
								if (inter.anObjectArray2040 != null) {
									for (var29 = 0; var29 < GameClient.anInt2858 * 858685769; var29++) {
										ScriptInvocation var35 = new ScriptInvocation();
										var35.inter = inter;
										var35.anInt1775 = GameClient.anIntArray3092[var29] * 268995583;
										var35.anInt1771 = GameClient.anIntArray2976[var29] * 1645811793;
										var35.parameters = inter.anObjectArray2040;
										GameClient.scriptInvocationQueue.add(var35);
									}
								}
							}
						}

						if (!inter.cs2Inter && GameClient.aInterfaceDef_3038 == null && CacheableEntry_Sub23_Sub17.aInterfaceDef_2418 == null && !GameClient.aBool3006) {
							if ((inter.anInt1930 * -1224986539 >= 0 || inter.anInt1966 * -315882783 != 0) && Class74.anInt897 * -1031552075 >= var15 && Class74.anInt898 * 1941423145 >= var16 && Class74.anInt897 * -1031552075 < var17 && Class74.anInt898 * 1941423145 < var18) {
								if (inter.anInt1930 * -1224986539 >= 0) {
									Class6.aInterfaceDef_103 = var0[inter.anInt1930 * -1224986539];
								} else {
									Class6.aInterfaceDef_103 = inter;
								}
							}

							if (inter.contenttype * -1878336627 == 8 && Class74.anInt897 * -1031552075 >= var15 && Class74.anInt898 * 1941423145 >= var16 && Class74.anInt897 * -1031552075 < var17 && Class74.anInt898 * 1941423145 < var18) {
								Class21.aInterfaceDef_260 = inter;
							}

							if (inter.anInt1963 * -124837617 > inter.invsize * 539675235) {
								var21 = inter.anInt1954 * 2096072399 + var10;
								var22 = inter.invsize * 539675235;
								int var34 = inter.anInt1963 * -124837617;
								var29 = Class74.anInt897 * -1031552075;
								var24 = Class74.anInt898 * 1941423145;
								if (GameClient.aBool2945) {
									GameClient.anInt2946 = -1889899168;
								} else {
									GameClient.anInt2946 = 0;
								}

								GameClient.aBool2945 = false;
								if (Class74.anInt896 * 445478637 == 1 || !Class46.aBool651 && Class74.anInt896 * 445478637 == 4) {
									if (var29 >= var21 && var29 < 16 + var21 && var24 >= var19 && var24 < var19 + 16) {
										inter.anInt2038 += 1343386748;
										Class35.method484(inter, -1366832819);
									} else if (var29 >= var21 && var29 < var21 + 16 && var24 >= var22 + var19 - 16 && var24 < var22 + var19) {
										inter.anInt2038 -= 1343386748;
										Class35.method484(inter, -1932053959);
									} else if (var29 >= var21 - GameClient.anInt2946 * 1948631363 && var29 < 16 + var21 + GameClient.anInt2946 * 1948631363 && var24 >= var19 + 16 && var24 < var19 + var22 - 16) {
										var25 = (var22 - 32) * var22 / var34;
										if (var25 < 8) {
											var25 = 8;
										}

										int var27 = var24 - var19 - 16 - var25 / 2;
										int var26 = var22 - 32 - var25;
										inter.anInt2038 = (var34 - var22) * var27 / var26 * 1811636961;
										Class35.method484(inter, -1978069294);
										GameClient.aBool2945 = true;
									}
								}

								if (GameClient.anInt3065 * 498699079 != 0) {
									var25 = inter.anInt1954 * 2096072399;
									if (var29 >= var21 - var25 && var24 >= var19 && var29 < 16 + var21 && var24 <= var19 + var22) {
										inter.anInt2038 += GameClient.anInt3065 * 1732746523;
										Class35.method484(inter, -8949493);
									}
								}
							}
						}
					}
				}
			}
		}

	}

	static {
		Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
		aCalendar316 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	public static final void method357(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (InterruptedException var8) {
					;
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var7) {
					;
				}
			} else {
				try {
					Thread.sleep(var0);
				} catch (InterruptedException var6) {
					;
				}
			}

		}
	}

	static int countItemInContainer(int containerId, int itemId) {
		ItemContainer itemContainer = (ItemContainer) ItemContainer.activeContainers.get((long) containerId);
		if (itemContainer == null || itemId == -1) {
			return 0;
		}

		int total = 0;
		for (int index = 0; index < itemContainer.itemAmounts.length; index++) {
			if (itemId == itemContainer.itemIds[index]) {
				total += itemContainer.itemAmounts[index];
			}
		}

		return total;
	}

	public static CacheableEntry_Sub23_Sub14_Sub1[] method359(IndexDescriptor var0, String var1, String var2, int var3) {
		int var4 = var0.method1170(var1);
		int var6 = var0.method1165(var4, var2, (byte) 105);
		CacheableEntry_Sub23_Sub14_Sub1[] var5;
		if (CacheableEntry_Sub23_Sub16_Sub2.method2962(var0, var4, var6, 2130737637)) {
			var5 = Class7.method178((byte) 28);
		} else {
			var5 = null;
		}

		return var5;
	}

	Class24() throws Throwable {
		throw new Error();
	}

}
