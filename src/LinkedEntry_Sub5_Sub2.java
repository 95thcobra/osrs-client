public class LinkedEntry_Sub5_Sub2 extends LinkedEntry_Sub5 {

	int anInt2384;
	int anInt2385;
	boolean aBool2386;
	int anInt2381;
	int anInt2378;
	int anInt2379;
	int anInt2382;
	int anInt2380;
	int anInt2388;
	int anInt2377;
	int anInt2383;
	int anInt2387;
	int anInt2376;
	int anInt2389;
	int anInt2390;

	int method1795() {
		int var1 = anInt2380 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (anInt2383 == 0) {
			var1 -= var1 * anInt2382 / (((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392.length << 8);
		} else if (anInt2383 >= 0) {
			var1 -= var1 * anInt2384 / ((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	public synchronized void method2569(int var1, int var2) {
		method2583(var1, var2, method2602());
	}

	LinkedEntry_Sub5_Sub2(LinkedEntry_Sub1_Sub1 var1, int var2, int var3) {
		aClass109_Sub1_1713 = var1;
		anInt2384 = var1.anInt2393;
		anInt2385 = var1.anInt2394;
		aBool2386 = var1.aBool2391;
		anInt2381 = var2;
		anInt2378 = var3;
		anInt2379 = 8192;
		anInt2382 = 0;
		method2572();
	}

	LinkedEntry_Sub5_Sub2(LinkedEntry_Sub1_Sub1 var1, int var2, int var3, int var4) {
		aClass109_Sub1_1713 = var1;
		anInt2384 = var1.anInt2393;
		anInt2385 = var1.anInt2394;
		aBool2386 = var1.aBool2391;
		anInt2381 = var2;
		anInt2378 = var3;
		anInt2379 = var4;
		anInt2382 = 0;
		method2572();
	}

	public static LinkedEntry_Sub5_Sub2 method2571(LinkedEntry_Sub1_Sub1 var0, int var1, int var2, int var3) {
		return var0.aByteArray2392 != null && var0.aByteArray2392.length != 0 ? new LinkedEntry_Sub5_Sub2(var0, var1, var2, var3) : null;
	}

	void method2572() {
		anInt2380 = anInt2378;
		anInt2388 = method2641(anInt2378, anInt2379);
		anInt2377 = method2603(anInt2378, anInt2379);
	}

	public synchronized void method2573(int var1) {
		anInt2383 = var1;
	}

	public synchronized void method2574(int var1) {
		method2692(var1 << 6, method2602());
	}

	synchronized void method2575(int var1) {
		method2692(var1, method2602());
	}

	int method2576(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (anInt2387 > 0) {
				int var6 = var2 + anInt2387;
				if (var6 > var4) {
					var6 = var4;
				}

				anInt2387 += var2;
				if (anInt2381 == 256 && (anInt2382 & 255) == 0) {
					if (Class2.aBool19) {
						var2 = method2650(0, ((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392, var1, anInt2382, var2, anInt2388, anInt2377, anInt2389, anInt2390, 0, var6, var3, this);
					} else {
						var2 = method2601(((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392, var1, anInt2382, var2, anInt2380, anInt2376, 0, var6, var3, this);
					}
				} else if (Class2.aBool19) {
					var2 = method2606(0, 0, ((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392, var1, anInt2382, var2, anInt2388, anInt2377, anInt2389, anInt2390, 0, var6, var3, this, anInt2381, var5);
				} else {
					var2 = method2621(0, 0, ((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392, var1, anInt2382, var2, anInt2380, anInt2376, 0, var6, var3, this, anInt2381, var5);
				}

				anInt2387 -= var2;
				if (anInt2387 != 0) {
					return var2;
				}

				if (!method2599()) {
					continue;
				}

				return var4;
			}

			if (anInt2381 == 256 && (anInt2382 & 255) == 0) {
				if (Class2.aBool19) {
					return method2594(0, ((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392, var1, anInt2382, var2, anInt2388, anInt2377, 0, var4, var3, this);
				}

				return method2609(((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392, var1, anInt2382, var2, anInt2380, 0, var4, var3, this);
			}

			if (Class2.aBool19) {
				return method2598(0, 0, ((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392, var1, anInt2382, var2, anInt2388, anInt2377, 0, var4, var3, this, anInt2381, var5);
			}

			return method2704(0, 0, ((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392, var1, anInt2382, var2, anInt2380, 0, var4, var3, this, anInt2381, var5);
		}
	}

	public synchronized void method2579(int var1) {
		int var2 = ((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		anInt2382 = var1;
	}

	public synchronized int method2580() {
		return anInt2378 == -2147483648 ? 0 : anInt2378;
	}

	void method2581() {
		if (anInt2387 != 0) {
			if (anInt2378 == -2147483648) {
				anInt2378 = 0;
			}

			anInt2387 = 0;
			method2572();
		}

	}

	public synchronized void method2583(int var1, int var2, int var3) {
		if (var1 == 0) {
			method2692(var2, var3);
		} else {
			int var5 = method2641(var2, var3);
			int var4 = method2603(var2, var3);
			if (anInt2388 == var5 && anInt2377 == var4) {
				anInt2387 = 0;
			} else {
				int var6 = var2 - anInt2380;
				if (anInt2380 - var2 > var6) {
					var6 = anInt2380 - var2;
				}

				if (var5 - anInt2388 > var6) {
					var6 = var5 - anInt2388;
				}

				if (anInt2388 - var5 > var6) {
					var6 = anInt2388 - var5;
				}

				if (var4 - anInt2377 > var6) {
					var6 = var4 - anInt2377;
				}

				if (anInt2377 - var4 > var6) {
					var6 = anInt2377 - var4;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				anInt2387 = var1;
				anInt2378 = var2;
				anInt2379 = var3;
				anInt2376 = (var2 - anInt2380) / var1;
				anInt2389 = (var5 - anInt2388) / var1;
				anInt2390 = (var4 - anInt2377) / var1;
			}
		}
	}

	static int method2584(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, LinkedEntry_Sub5_Sub2 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.anInt2388 += var9.anInt2389 * (var6 - var3);
		var9.anInt2377 += var9.anInt2390 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.anInt2380 = var4 >> 2;
		var9.anInt2382 = var2 << 8;
		return var3;
	}

	public synchronized int method2586() {
		return anInt2381 >= 0 ? anInt2381 : -anInt2381;
	}

	public boolean method2587() {
		return anInt2382 < 0 || anInt2382 >= ((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392.length << 8;
	}

	public boolean method2588() {
		return anInt2387 != 0;
	}

	protected LinkedEntry_Sub5 method1796() {
		return null;
	}

	public synchronized void method2589(int var1) {
		if (anInt2381 >= 0) {
			anInt2381 = var1;
		} else {
			anInt2381 = -var1;
		}

	}

	protected int method1794() {
		return anInt2378 == 0 && anInt2387 == 0 ? 0 : 1;
	}

	public synchronized void method1803(int[] var1, int var2, int var3) {
		if (anInt2378 == 0 && anInt2387 == 0) {
			method1801(var3);
		} else {
			LinkedEntry_Sub1_Sub1 var6 = (LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713;
			int var7 = anInt2384 << 8;
			int var4 = anInt2385 << 8;
			int var5 = var6.aByteArray2392.length << 8;
			int var8 = var4 - var7;
			if (var8 <= 0) {
				anInt2383 = 0;
			}

			int var10 = var2;
			var3 += var2;
			if (anInt2382 < 0) {
				if (anInt2381 <= 0) {
					method2581();
					unlink();
					return;
				}

				anInt2382 = 0;
			}

			if (anInt2382 >= var5) {
				if (anInt2381 >= 0) {
					method2581();
					unlink();
					return;
				}

				anInt2382 = var5 - 1;
			}

			if (anInt2383 < 0) {
				if (aBool2386) {
					if (anInt2381 < 0) {
						var10 = method2591(var1, var2, var7, var3, var6.aByteArray2392[anInt2384]);
						if (anInt2382 >= var7) {
							return;
						}

						anInt2382 = var7 + var7 - 1 - anInt2382;
						anInt2381 = -anInt2381;
					}

					while (true) {
						var10 = method2576(var1, var10, var4, var3, var6.aByteArray2392[anInt2385 - 1]);
						if (anInt2382 < var4) {
							return;
						}

						anInt2382 = var4 + var4 - 1 - anInt2382;
						anInt2381 = -anInt2381;
						var10 = method2591(var1, var10, var7, var3, var6.aByteArray2392[anInt2384]);
						if (anInt2382 >= var7) {
							return;
						}

						anInt2382 = var7 + var7 - 1 - anInt2382;
						anInt2381 = -anInt2381;
					}
				} else if (anInt2381 < 0) {
					while (true) {
						var10 = method2591(var1, var10, var7, var3, var6.aByteArray2392[anInt2385 - 1]);
						if (anInt2382 >= var7) {
							return;
						}

						anInt2382 = var4 - 1 - (var4 - 1 - anInt2382) % var8;
					}
				} else {
					while (true) {
						var10 = method2576(var1, var10, var4, var3, var6.aByteArray2392[anInt2384]);
						if (anInt2382 < var4) {
							return;
						}

						anInt2382 = var7 + (anInt2382 - var7) % var8;
					}
				}
			} else {
				if (anInt2383 > 0) {
					if (aBool2386) {
						label170:
						{
							if (anInt2381 < 0) {
								var10 = method2591(var1, var2, var7, var3, var6.aByteArray2392[anInt2384]);
								if (anInt2382 >= var7) {
									return;
								}

								anInt2382 = var7 + var7 - 1 - anInt2382;
								anInt2381 = -anInt2381;
								if (--anInt2383 == 0) {
									break label170;
								}
							}

							do {
								var10 = method2576(var1, var10, var4, var3, var6.aByteArray2392[anInt2385 - 1]);
								if (anInt2382 < var4) {
									return;
								}

								anInt2382 = var4 + var4 - 1 - anInt2382;
								anInt2381 = -anInt2381;
								if (--anInt2383 == 0) {
									break;
								}

								var10 = method2591(var1, var10, var7, var3, var6.aByteArray2392[anInt2384]);
								if (anInt2382 >= var7) {
									return;
								}

								anInt2382 = var7 + var7 - 1 - anInt2382;
								anInt2381 = -anInt2381;
							} while (--anInt2383 != 0);
						}
					} else {
						int var9;
						if (anInt2381 < 0) {
							while (true) {
								var10 = method2591(var1, var10, var7, var3, var6.aByteArray2392[anInt2385 - 1]);
								if (anInt2382 >= var7) {
									return;
								}

								var9 = (var4 - 1 - anInt2382) / var8;
								if (var9 >= anInt2383) {
									anInt2382 += var8 * anInt2383;
									anInt2383 = 0;
									break;
								}

								anInt2382 += var8 * var9;
								anInt2383 -= var9;
							}
						} else {
							while (true) {
								var10 = method2576(var1, var10, var4, var3, var6.aByteArray2392[anInt2384]);
								if (anInt2382 < var4) {
									return;
								}

								var9 = (anInt2382 - var7) / var8;
								if (var9 >= anInt2383) {
									anInt2382 -= var8 * anInt2383;
									anInt2383 = 0;
									break;
								}

								anInt2382 -= var8 * var9;
								anInt2383 -= var9;
							}
						}
					}
				}

				if (anInt2381 < 0) {
					method2591(var1, var10, 0, var3, 0);
					if (anInt2382 < 0) {
						anInt2382 = -1;
						method2581();
						unlink();
					}
				} else {
					method2576(var1, var10, var5, var3, 0);
					if (anInt2382 >= var5) {
						anInt2382 = var5;
						method2581();
						unlink();
					}
				}

			}
		}
	}

	public synchronized void method1801(int var1) {
		if (anInt2387 > 0) {
			if (var1 >= anInt2387) {
				if (anInt2378 == -2147483648) {
					anInt2378 = 0;
					anInt2377 = 0;
					anInt2388 = 0;
					anInt2380 = 0;
					unlink();
					var1 = anInt2387;
				}

				anInt2387 = 0;
				method2572();
			} else {
				anInt2380 += anInt2376 * var1;
				anInt2388 += anInt2389 * var1;
				anInt2377 += anInt2390 * var1;
				anInt2387 -= var1;
			}
		}

		LinkedEntry_Sub1_Sub1 var3 = (LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713;
		int var2 = anInt2384 << 8;
		int var4 = anInt2385 << 8;
		int var6 = var3.aByteArray2392.length << 8;
		int var5 = var4 - var2;
		if (var5 <= 0) {
			anInt2383 = 0;
		}

		if (anInt2382 < 0) {
			if (anInt2381 <= 0) {
				method2581();
				unlink();
				return;
			}

			anInt2382 = 0;
		}

		if (anInt2382 >= var6) {
			if (anInt2381 >= 0) {
				method2581();
				unlink();
				return;
			}

			anInt2382 = var6 - 1;
		}

		anInt2382 += anInt2381 * var1;
		if (anInt2383 < 0) {
			if (!aBool2386) {
				if (anInt2381 < 0) {
					if (anInt2382 >= var2) {
						return;
					}

					anInt2382 = var4 - 1 - (var4 - 1 - anInt2382) % var5;
				} else {
					if (anInt2382 < var4) {
						return;
					}

					anInt2382 = var2 + (anInt2382 - var2) % var5;
				}

			} else {
				if (anInt2381 < 0) {
					if (anInt2382 >= var2) {
						return;
					}

					anInt2382 = var2 + var2 - 1 - anInt2382;
					anInt2381 = -anInt2381;
				}

				while (anInt2382 >= var4) {
					anInt2382 = var4 + var4 - 1 - anInt2382;
					anInt2381 = -anInt2381;
					if (anInt2382 >= var2) {
						return;
					}

					anInt2382 = var2 + var2 - 1 - anInt2382;
					anInt2381 = -anInt2381;
				}

			}
		} else {
			if (anInt2383 > 0) {
				if (aBool2386) {
					label167:
					{
						if (anInt2381 < 0) {
							if (anInt2382 >= var2) {
								return;
							}

							anInt2382 = var2 + var2 - 1 - anInt2382;
							anInt2381 = -anInt2381;
							if (--anInt2383 == 0) {
								break label167;
							}
						}

						do {
							if (anInt2382 < var4) {
								return;
							}

							anInt2382 = var4 + var4 - 1 - anInt2382;
							anInt2381 = -anInt2381;
							if (--anInt2383 == 0) {
								break;
							}

							if (anInt2382 >= var2) {
								return;
							}

							anInt2382 = var2 + var2 - 1 - anInt2382;
							anInt2381 = -anInt2381;
						} while (--anInt2383 != 0);
					}
				} else {
					label199:
					{
						int var7;
						if (anInt2381 < 0) {
							if (anInt2382 >= var2) {
								return;
							}

							var7 = (var4 - 1 - anInt2382) / var5;
							if (var7 >= anInt2383) {
								anInt2382 += var5 * anInt2383;
								anInt2383 = 0;
								break label199;
							}

							anInt2382 += var5 * var7;
							anInt2383 -= var7;
						} else {
							if (anInt2382 < var4) {
								return;
							}

							var7 = (anInt2382 - var2) / var5;
							if (var7 >= anInt2383) {
								anInt2382 -= var5 * anInt2383;
								anInt2383 = 0;
								break label199;
							}

							anInt2382 -= var5 * var7;
							anInt2383 -= var7;
						}

						return;
					}
				}
			}

			if (anInt2381 < 0) {
				if (anInt2382 < 0) {
					anInt2382 = -1;
					method2581();
					unlink();
				}
			} else if (anInt2382 >= var6) {
				anInt2382 = var6;
				method2581();
				unlink();
			}

		}
	}

	int method2591(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (anInt2387 > 0) {
				int var6 = var2 + anInt2387;
				if (var6 > var4) {
					var6 = var4;
				}

				anInt2387 += var2;
				if (anInt2381 == -256 && (anInt2382 & 255) == 0) {
					if (Class2.aBool19) {
						var2 = method2604(0, ((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392, var1, anInt2382, var2, anInt2388, anInt2377, anInt2389, anInt2390, 0, var6, var3, this);
					} else {
						var2 = method2584(((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392, var1, anInt2382, var2, anInt2380, anInt2376, 0, var6, var3, this);
					}
				} else if (Class2.aBool19) {
					var2 = method2592(0, 0, ((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392, var1, anInt2382, var2, anInt2388, anInt2377, anInt2389, anInt2390, 0, var6, var3, this, anInt2381, var5);
				} else {
					var2 = method2607(0, 0, ((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392, var1, anInt2382, var2, anInt2380, anInt2376, 0, var6, var3, this, anInt2381, var5);
				}

				anInt2387 -= var2;
				if (anInt2387 == 0) {
					if (!method2599()) {
						continue;
					}

					return var4;
				}

				return var2;
			}

			if (anInt2381 == -256 && (anInt2382 & 255) == 0) {
				if (Class2.aBool19) {
					return method2656(0, ((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392, var1, anInt2382, var2, anInt2388, anInt2377, 0, var4, var3, this);
				}

				return method2595(((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392, var1, anInt2382, var2, anInt2380, 0, var4, var3, this);
			}

			if (Class2.aBool19) {
				return method2600(0, 0, ((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392, var1, anInt2382, var2, anInt2388, anInt2377, 0, var4, var3, this, anInt2381, var5);
			}

			return method2622(0, 0, ((LinkedEntry_Sub1_Sub1) aClass109_Sub1_1713).aByteArray2392, var1, anInt2382, var2, anInt2380, 0, var4, var3, this, anInt2381, var5);
		}
	}

	static int method2592(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, LinkedEntry_Sub5_Sub2 var13, int var14, int var15) {
		var13.anInt2380 -= var13.anInt2376 * var5;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.anInt2380 += var13.anInt2376 * var5;
		var13.anInt2388 = var6;
		var13.anInt2377 = var7;
		var13.anInt2382 = var4;
		return var5;
	}

	static int method2594(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, LinkedEntry_Sub5_Sub2 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.anInt2382 = var3 << 8;
		return var4 >> 1;
	}

	static int method2595(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, LinkedEntry_Sub5_Sub2 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.anInt2382 = var2 << 8;
		return var3;
	}

	static int method2598(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, LinkedEntry_Sub5_Sub2 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.anInt2382 = var4;
		return var5 >> 1;
	}

	boolean method2599() {
		int var1 = anInt2378;
		int var2;
		int var3;
		if (var1 == -2147483648) {
			var2 = 0;
			var3 = 0;
			var1 = 0;
		} else {
			var3 = method2641(var1, anInt2379);
			var2 = method2603(var1, anInt2379);
		}

		if (anInt2380 == var1 && anInt2388 == var3 && anInt2377 == var2) {
			if (anInt2378 == -2147483648) {
				anInt2378 = 0;
				anInt2377 = 0;
				anInt2388 = 0;
				anInt2380 = 0;
				unlink();
				return true;
			} else {
				method2572();
				return false;
			}
		} else {
			if (anInt2380 < var1) {
				anInt2376 = 1;
				anInt2387 = var1 - anInt2380;
			} else if (anInt2380 > var1) {
				anInt2376 = -1;
				anInt2387 = anInt2380 - var1;
			} else {
				anInt2376 = 0;
			}

			if (anInt2388 < var3) {
				anInt2389 = 1;
				if (anInt2387 == 0 || anInt2387 > var3 - anInt2388) {
					anInt2387 = var3 - anInt2388;
				}
			} else if (anInt2388 > var3) {
				anInt2389 = -1;
				if (anInt2387 == 0 || anInt2387 > anInt2388 - var3) {
					anInt2387 = anInt2388 - var3;
				}
			} else {
				anInt2389 = 0;
			}

			if (anInt2377 < var2) {
				anInt2390 = 1;
				if (anInt2387 == 0 || anInt2387 > var2 - anInt2377) {
					anInt2387 = var2 - anInt2377;
				}
			} else if (anInt2377 > var2) {
				anInt2390 = -1;
				if (anInt2387 == 0 || anInt2387 > anInt2377 - var2) {
					anInt2387 = anInt2377 - var2;
				}
			} else {
				anInt2390 = 0;
			}

			return false;
		}
	}

	static int method2600(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, LinkedEntry_Sub5_Sub2 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.anInt2382 = var4;
		return var5 >> 1;
	}

	static int method2601(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, LinkedEntry_Sub5_Sub2 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.anInt2388 += var9.anInt2389 * (var6 - var3);
		var9.anInt2377 += var9.anInt2390 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.anInt2380 = var4 >> 2;
		var9.anInt2382 = var2 << 8;
		return var3;
	}

	public synchronized int method2602() {
		return anInt2379 < 0 ? -1 : anInt2379;
	}

	static int method2603(int var0, int var1) {
		return var1 < 0 ? -var0 : (int) ((double) var0 * Math.sqrt((double) var1 * 1.220703125E-4D) + 0.5D);
	}

	static int method2604(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, LinkedEntry_Sub5_Sub2 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.anInt2380 += var12.anInt2376 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.anInt2388 = var5 >> 2;
		var12.anInt2377 = var6 >> 2;
		var12.anInt2382 = var3 << 8;
		return var4 >> 1;
	}

	static int method2606(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, LinkedEntry_Sub5_Sub2 var13, int var14, int var15) {
		var13.anInt2380 -= var13.anInt2376 * var5;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.anInt2380 += var13.anInt2376 * var5;
		var13.anInt2388 = var6;
		var13.anInt2377 = var7;
		var13.anInt2382 = var4;
		return var5;
	}

	static int method2607(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, LinkedEntry_Sub5_Sub2 var11, int var12, int var13) {
		var11.anInt2388 -= var11.anInt2389 * var5;
		var11.anInt2377 -= var11.anInt2390 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.anInt2388 += var11.anInt2389 * var5;
		var11.anInt2377 += var11.anInt2390 * var5;
		var11.anInt2380 = var6;
		var11.anInt2382 = var4;
		return var5;
	}

	protected LinkedEntry_Sub5 method1797() {
		return null;
	}

	static int method2609(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, LinkedEntry_Sub5_Sub2 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.anInt2382 = var2 << 8;
		return var3;
	}

	static int method2621(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, LinkedEntry_Sub5_Sub2 var11, int var12, int var13) {
		var11.anInt2388 -= var11.anInt2389 * var5;
		var11.anInt2377 -= var11.anInt2390 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.anInt2388 += var11.anInt2389 * var5;
		var11.anInt2377 += var11.anInt2390 * var5;
		var11.anInt2380 = var6;
		var11.anInt2382 = var4;
		return var5;
	}

	static int method2622(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, LinkedEntry_Sub5_Sub2 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}

		var10.anInt2382 = var4;
		return var5;
	}

	public synchronized void method2640(int var1) {
		if (var1 == 0) {
			method2575(0);
			unlink();
		} else if (anInt2388 == 0 && anInt2377 == 0) {
			anInt2387 = 0;
			anInt2378 = 0;
			anInt2380 = 0;
			unlink();
		} else {
			int var2 = -anInt2380;
			if (anInt2380 > var2) {
				var2 = anInt2380;
			}

			if (-anInt2388 > var2) {
				var2 = -anInt2388;
			}

			if (anInt2388 > var2) {
				var2 = anInt2388;
			}

			if (-anInt2377 > var2) {
				var2 = -anInt2377;
			}

			if (anInt2377 > var2) {
				var2 = anInt2377;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			anInt2387 = var1;
			anInt2378 = -2147483648;
			anInt2376 = -anInt2380 / var1;
			anInt2389 = -anInt2388 / var1;
			anInt2390 = -anInt2377 / var1;
		}
	}

	static int method2641(int var0, int var1) {
		return var1 >= 0 ? (int) ((double) var0 * Math.sqrt((double) (16384 - var1) * 1.220703125E-4D) + 0.5D) : var0;
	}

	public synchronized void method2644(boolean var1) {
		anInt2381 = (anInt2381 ^ anInt2381 >> 31) + (anInt2381 >>> 31);
		if (var1) {
			anInt2381 = -anInt2381;
		}

	}

	static int method2650(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, LinkedEntry_Sub5_Sub2 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var11 - var3) > var10) {
			var9 = var10;
		}

		var12.anInt2380 += var12.anInt2376 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.anInt2388 = var5 >> 2;
		var12.anInt2377 = var6 >> 2;
		var12.anInt2382 = var3 << 8;
		return var4 >> 1;
	}

	static int method2656(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, LinkedEntry_Sub5_Sub2 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.anInt2382 = var3 << 8;
		return var4 >> 1;
	}

	public static LinkedEntry_Sub5_Sub2 method2659(LinkedEntry_Sub1_Sub1 var0, int var1, int var2) {
		return var0.aByteArray2392 != null && var0.aByteArray2392.length != 0 ? new LinkedEntry_Sub5_Sub2(var0, (int) ((long) var0.anInt2395 * 256L * (long) var1 / (long) (Class2.anInt34 * -395137804)), var2 << 6) : null;
	}

	synchronized void method2692(int var1, int var2) {
		anInt2378 = var1;
		anInt2379 = var2;
		anInt2387 = 0;
		method2572();
	}

	static int method2704(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, LinkedEntry_Sub5_Sub2 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}

		var10.anInt2382 = var4;
		return var5;
	}

}
