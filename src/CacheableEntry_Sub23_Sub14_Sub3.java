public class CacheableEntry_Sub23_Sub14_Sub3 extends CacheableEntry_Sub23_Sub14 {

	static final int anInt2696 = 3500;
	static final int anInt2703 = 14;
	static final int anInt2704 = 3;
	static final int anInt2714 = 50;
	static int anInt2717;
	static int anInt2709;
	static int[] anIntArray2712 = new int[1024];
	static int anInt2706;
	static int anInt2707;
	static int anInt2710;
	static int anInt2716;
	static int anInt2702;
	static int anInt2708;
	public static Interface2 anInterface2_2715;
	static boolean aBool2701 = false;
	static boolean aBool2698 = false;
	static boolean aBool2697 = false;
	public static boolean aBool2699 = true;
	static int anInt2700 = 0;
	public static int anInt2705 = 512;
	public static int[] anIntArray2713 = new int[65536];
	static int[] anIntArray2711 = new int[512];
	static int[] anIntArray2718 = new int[2048];
	public static int[] anIntArray2719 = new int[2048];
	public static int[] anIntArray2720 = new int[2048];

	public static final void method3148() {
		method3150(anInt2401, anInt2397, anInt2402, anInt2400);
	}

	static final void method3150(int var0, int var1, int var2, int var3) {
		anInt2717 = var2 - var0;
		anInt2709 = var3 - var1;
		method3167();
		if (anIntArray2712.length < anInt2709) {
			anIntArray2712 = new int[LinkedEntry_Sub12.method1851(anInt2709, 2098054018)];
		}

		int var5 = var1 * anInt2399 + var0;

		for (int var4 = 0; var4 < anInt2709; var4++) {
			anIntArray2712[var4] = var5;
			var5 += anInt2399;
		}

	}

	public static final void method3152(int var0, int var1) {
		int var2 = anIntArray2712[0];
		int var3 = var2 / anInt2399;
		int var4 = var2 - var3 * anInt2399;
		anInt2706 = var0 - var4;
		anInt2707 = var1 - var3;
		anInt2710 = -anInt2706;
		anInt2716 = anInt2717 - anInt2706;
		anInt2702 = -anInt2707;
		anInt2708 = anInt2709 - anInt2707;
	}

	public static final void method3153(Interface2 var0) {
		anInterface2_2715 = var0;
	}

	public static final void method3154(double var0) {
		method3155(var0, 0, 512);
	}

	static final void method3155(double var0, int var2, int var3) {
		var0 += Math.random() * 0.03D - 0.015D;
		int var32 = var2 * 128;

		for (int var20 = var2; var20 < var3; var20++) {
			double var8 = (double) (var20 >> 3) / 64.0D + 0.0078125D;
			double var21 = (double) (var20 & 7) / 8.0D + 0.0625D;

			for (int var13 = 0; var13 < 128; var13++) {
				double var14 = (double) var13 / 128.0D;
				double var16 = var14;
				double var18 = var14;
				double var27 = var14;
				if (var21 != 0.0D) {
					double var23;
					if (var14 < 0.5D) {
						var23 = var14 * (1.0D + var21);
					} else {
						var23 = var14 + var21 - var14 * var21;
					}

					double var25 = 2.0D * var14 - var23;
					double var6 = var8 + 0.3333333333333333D;
					if (var6 > 1.0D) {
						--var6;
					}

					double var11 = var8 - 0.3333333333333333D;
					if (var11 < 0.0D) {
						++var11;
					}

					if (6.0D * var6 < 1.0D) {
						var16 = var25 + (var23 - var25) * 6.0D * var6;
					} else if (2.0D * var6 < 1.0D) {
						var16 = var23;
					} else if (3.0D * var6 < 2.0D) {
						var16 = var25 + (var23 - var25) * (0.6666666666666666D - var6) * 6.0D;
					} else {
						var16 = var25;
					}

					if (6.0D * var8 < 1.0D) {
						var18 = var25 + (var23 - var25) * 6.0D * var8;
					} else if (2.0D * var8 < 1.0D) {
						var18 = var23;
					} else if (3.0D * var8 < 2.0D) {
						var18 = var25 + (var23 - var25) * (0.6666666666666666D - var8) * 6.0D;
					} else {
						var18 = var25;
					}

					if (6.0D * var11 < 1.0D) {
						var27 = var25 + (var23 - var25) * 6.0D * var11;
					} else if (2.0D * var11 < 1.0D) {
						var27 = var23;
					} else if (3.0D * var11 < 2.0D) {
						var27 = var25 + (var23 - var25) * (0.6666666666666666D - var11) * 6.0D;
					} else {
						var27 = var25;
					}
				}

				int var29 = (int) (var16 * 256.0D);
				int var30 = (int) (var18 * 256.0D);
				int var31 = (int) (var27 * 256.0D);
				int var10 = (var29 << 16) + (var30 << 8) + var31;
				var10 = method3156(var10, var0);
				if (var10 == 0) {
					var10 = 1;
				}

				anIntArray2713[var32++] = var10;
			}
		}

	}

	static int method3156(int var0, double var1) {
		double var3 = (double) (var0 >> 16) / 256.0D;
		double var8 = (double) (var0 >> 8 & 255) / 256.0D;
		double var6 = (double) (var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var8 = Math.pow(var8, var1);
		var6 = Math.pow(var6, var1);
		int var5 = (int) (var3 * 256.0D);
		int var10 = (int) (var8 * 256.0D);
		int var11 = (int) (var6 * 256.0D);
		return (var5 << 16) + (var10 << 8) + var11;
	}

	public static void method3157(int var0, int var1, int var2) {
		aBool2701 = var0 < 0 || var0 > anInt2717 || var1 < 0 || var1 > anInt2717 || var2 < 0 || var2 > anInt2717;
	}

	static final void method3158(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = var4 - var3;
		int var13 = var1 - var0;
		int var16 = var5 - var3;
		int var17 = var2 - var0;
		int var19 = var7 - var6;
		int var20 = var8 - var6;
		int var10;
		if (var2 != var1) {
			var10 = (var5 - var4 << 14) / (var2 - var1);
		} else {
			var10 = 0;
		}

		int var14;
		if (var1 != var0) {
			var14 = (var9 << 14) / var13;
		} else {
			var14 = 0;
		}

		int var11;
		if (var2 != var0) {
			var11 = (var16 << 14) / var17;
		} else {
			var11 = 0;
		}

		int var18 = var9 * var17 - var16 * var13;
		if (var18 != 0) {
			int var15 = (var19 * var17 - var20 * var13 << 8) / var18;
			int var12 = (var20 * var9 - var19 * var16 << 8) / var18;
			if (var0 <= var1 && var0 <= var2) {
				if (var0 < anInt2709) {
					if (var1 > anInt2709) {
						var1 = anInt2709;
					}

					if (var2 > anInt2709) {
						var2 = anInt2709;
					}

					var6 = (var6 << 8) - var15 * var3 + var15;
					if (var1 < var2) {
						var5 = var3 <<= 14;
						if (var0 < 0) {
							var5 -= var11 * var0;
							var3 -= var14 * var0;
							var6 -= var12 * var0;
							var0 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var10 * var1;
							var1 = 0;
						}

						if (var0 != var1 && var11 < var14 || var0 == var1 && var11 > var10) {
							var2 -= var1;
							var1 -= var0;
							var0 = anIntArray2712[var0];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method3159(anIntArray2396, var0, 0, 0, var5 >> 14, var4 >> 14, var6, var15);
										var5 += var11;
										var4 += var10;
										var6 += var12;
										var0 += anInt2399;
									}
								}

								method3159(anIntArray2396, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var15);
								var5 += var11;
								var3 += var14;
								var6 += var12;
								var0 += anInt2399;
							}
						} else {
							var2 -= var1;
							var1 -= var0;
							var0 = anIntArray2712[var0];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method3159(anIntArray2396, var0, 0, 0, var4 >> 14, var5 >> 14, var6, var15);
										var5 += var11;
										var4 += var10;
										var6 += var12;
										var0 += anInt2399;
									}
								}

								method3159(anIntArray2396, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var15);
								var5 += var11;
								var3 += var14;
								var6 += var12;
								var0 += anInt2399;
							}
						}
					} else {
						var4 = var3 <<= 14;
						if (var0 < 0) {
							var4 -= var11 * var0;
							var3 -= var14 * var0;
							var6 -= var12 * var0;
							var0 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var10 * var2;
							var2 = 0;
						}

						if ((var0 == var2 || var11 >= var14) && (var0 != var2 || var10 <= var14)) {
							var1 -= var2;
							var2 -= var0;
							var0 = anIntArray2712[var0];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method3159(anIntArray2396, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var15);
										var5 += var10;
										var3 += var14;
										var6 += var12;
										var0 += anInt2399;
									}
								}

								method3159(anIntArray2396, var0, 0, 0, var3 >> 14, var4 >> 14, var6, var15);
								var4 += var11;
								var3 += var14;
								var6 += var12;
								var0 += anInt2399;
							}
						} else {
							var1 -= var2;
							var2 -= var0;
							var0 = anIntArray2712[var0];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method3159(anIntArray2396, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var15);
										var5 += var10;
										var3 += var14;
										var6 += var12;
										var0 += anInt2399;
									}
								}

								method3159(anIntArray2396, var0, 0, 0, var4 >> 14, var3 >> 14, var6, var15);
								var4 += var11;
								var3 += var14;
								var6 += var12;
								var0 += anInt2399;
							}
						}
					}
				}
			} else if (var1 <= var2) {
				if (var1 < anInt2709) {
					if (var2 > anInt2709) {
						var2 = anInt2709;
					}

					if (var0 > anInt2709) {
						var0 = anInt2709;
					}

					var7 = (var7 << 8) - var15 * var4 + var15;
					if (var2 < var0) {
						var3 = var4 <<= 14;
						if (var1 < 0) {
							var3 -= var14 * var1;
							var4 -= var10 * var1;
							var7 -= var12 * var1;
							var1 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var11 * var2;
							var2 = 0;
						}

						if (var1 != var2 && var14 < var10 || var1 == var2 && var14 > var11) {
							var0 -= var2;
							var2 -= var1;
							var1 = anIntArray2712[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method3159(anIntArray2396, var1, 0, 0, var3 >> 14, var5 >> 14, var7, var15);
										var3 += var14;
										var5 += var11;
										var7 += var12;
										var1 += anInt2399;
									}
								}

								method3159(anIntArray2396, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var15);
								var3 += var14;
								var4 += var10;
								var7 += var12;
								var1 += anInt2399;
							}
						} else {
							var0 -= var2;
							var2 -= var1;
							var1 = anIntArray2712[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method3159(anIntArray2396, var1, 0, 0, var5 >> 14, var3 >> 14, var7, var15);
										var3 += var14;
										var5 += var11;
										var7 += var12;
										var1 += anInt2399;
									}
								}

								method3159(anIntArray2396, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var15);
								var3 += var14;
								var4 += var10;
								var7 += var12;
								var1 += anInt2399;
							}
						}
					} else {
						var5 = var4 <<= 14;
						if (var1 < 0) {
							var5 -= var14 * var1;
							var4 -= var10 * var1;
							var7 -= var12 * var1;
							var1 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var11 * var0;
							var0 = 0;
						}

						if (var14 < var10) {
							var2 -= var0;
							var0 -= var1;
							var1 = anIntArray2712[var1];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method3159(anIntArray2396, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var15);
										var3 += var11;
										var4 += var10;
										var7 += var12;
										var1 += anInt2399;
									}
								}

								method3159(anIntArray2396, var1, 0, 0, var5 >> 14, var4 >> 14, var7, var15);
								var5 += var14;
								var4 += var10;
								var7 += var12;
								var1 += anInt2399;
							}
						} else {
							var2 -= var0;
							var0 -= var1;
							var1 = anIntArray2712[var1];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method3159(anIntArray2396, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var15);
										var3 += var11;
										var4 += var10;
										var7 += var12;
										var1 += anInt2399;
									}
								}

								method3159(anIntArray2396, var1, 0, 0, var4 >> 14, var5 >> 14, var7, var15);
								var5 += var14;
								var4 += var10;
								var7 += var12;
								var1 += anInt2399;
							}
						}
					}
				}
			} else if (var2 < anInt2709) {
				if (var0 > anInt2709) {
					var0 = anInt2709;
				}

				if (var1 > anInt2709) {
					var1 = anInt2709;
				}

				var8 = (var8 << 8) - var15 * var5 + var15;
				if (var0 < var1) {
					var4 = var5 <<= 14;
					if (var2 < 0) {
						var4 -= var10 * var2;
						var5 -= var11 * var2;
						var8 -= var12 * var2;
						var2 = 0;
					}

					var3 <<= 14;
					if (var0 < 0) {
						var3 -= var14 * var0;
						var0 = 0;
					}

					if (var10 < var11) {
						var1 -= var0;
						var0 -= var2;
						var2 = anIntArray2712[var2];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method3159(anIntArray2396, var2, 0, 0, var4 >> 14, var3 >> 14, var8, var15);
									var4 += var10;
									var3 += var14;
									var8 += var12;
									var2 += anInt2399;
								}
							}

							method3159(anIntArray2396, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var15);
							var4 += var10;
							var5 += var11;
							var8 += var12;
							var2 += anInt2399;
						}
					} else {
						var1 -= var0;
						var0 -= var2;
						var2 = anIntArray2712[var2];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method3159(anIntArray2396, var2, 0, 0, var3 >> 14, var4 >> 14, var8, var15);
									var4 += var10;
									var3 += var14;
									var8 += var12;
									var2 += anInt2399;
								}
							}

							method3159(anIntArray2396, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var15);
							var4 += var10;
							var5 += var11;
							var8 += var12;
							var2 += anInt2399;
						}
					}
				} else {
					var3 = var5 <<= 14;
					if (var2 < 0) {
						var3 -= var10 * var2;
						var5 -= var11 * var2;
						var8 -= var12 * var2;
						var2 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var14 * var1;
						var1 = 0;
					}

					if (var10 < var11) {
						var0 -= var1;
						var1 -= var2;
						var2 = anIntArray2712[var2];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method3159(anIntArray2396, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var15);
									var4 += var14;
									var5 += var11;
									var8 += var12;
									var2 += anInt2399;
								}
							}

							method3159(anIntArray2396, var2, 0, 0, var3 >> 14, var5 >> 14, var8, var15);
							var3 += var10;
							var5 += var11;
							var8 += var12;
							var2 += anInt2399;
						}
					} else {
						var0 -= var1;
						var1 -= var2;
						var2 = anIntArray2712[var2];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method3159(anIntArray2396, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var15);
									var4 += var14;
									var5 += var11;
									var8 += var12;
									var2 += anInt2399;
								}
							}

							method3159(anIntArray2396, var2, 0, 0, var5 >> 14, var3 >> 14, var8, var15);
							var3 += var10;
							var5 += var11;
							var8 += var12;
							var2 += anInt2399;
						}
					}
				}
			}
		}
	}

	static final void method3159(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (aBool2701) {
			if (var5 > anInt2717) {
				var5 = anInt2717;
			}

			if (var4 < 0) {
				var4 = 0;
			}
		}

		if (var4 < var5) {
			var1 += var4;
			var6 += var7 * var4;
			int var8;
			int var9;
			int var10;
			if (aBool2699) {
				var3 = var5 - var4 >> 2;
				var7 <<= 2;
				if (anInt2700 != 0) {
					var10 = anInt2700;
					var8 = 256 - anInt2700;
					if (var3 > 0) {
						do {
							var2 = anIntArray2713[var6 >> 8];
							var6 += var7;
							var2 = ((var2 & 16711935) * var8 >> 8 & 16711935) + ((var2 & 65280) * var8 >> 8 & 65280);
							var9 = var0[var1];
							var0[var1++] = var2 + ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & 65280) * var10 >> 8 & 65280);
							var9 = var0[var1];
							var0[var1++] = var2 + ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & 65280) * var10 >> 8 & 65280);
							var9 = var0[var1];
							var0[var1++] = var2 + ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & 65280) * var10 >> 8 & 65280);
							var9 = var0[var1];
							var0[var1++] = var2 + ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & 65280) * var10 >> 8 & 65280);
							--var3;
						} while (var3 > 0);
					}

					var3 = var5 - var4 & 3;
					if (var3 > 0) {
						var2 = anIntArray2713[var6 >> 8];
						var2 = ((var2 & 16711935) * var8 >> 8 & 16711935) + ((var2 & 65280) * var8 >> 8 & 65280);

						do {
							var9 = var0[var1];
							var0[var1++] = var2 + ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & 65280) * var10 >> 8 & 65280);
							--var3;
						} while (var3 > 0);
					}
				} else {
					if (var3 > 0) {
						do {
							var2 = anIntArray2713[var6 >> 8];
							var6 += var7;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);
					}

					var3 = var5 - var4 & 3;
					if (var3 > 0) {
						var2 = anIntArray2713[var6 >> 8];

						do {
							var0[var1++] = var2;
							--var3;
						} while (var3 > 0);
					}
				}

			} else {
				var3 = var5 - var4;
				if (anInt2700 == 0) {
					do {
						var0[var1++] = anIntArray2713[var6 >> 8];
						var6 += var7;
						--var3;
					} while (var3 > 0);
				} else {
					var10 = anInt2700;
					var8 = 256 - anInt2700;

					do {
						var2 = anIntArray2713[var6 >> 8];
						var6 += var7;
						var2 = ((var2 & 16711935) * var8 >> 8 & 16711935) + ((var2 & 65280) * var8 >> 8 & 65280);
						var9 = var0[var1];
						var0[var1++] = var2 + ((var9 & 16711935) * var10 >> 8 & 16711935) + ((var9 & 65280) * var10 >> 8 & 65280);
						--var3;
					} while (var3 > 0);
				}

			}
		}
	}

	public static final void method3160(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = 0;
		if (var1 != var0) {
			var7 = (var4 - var3 << 14) / (var1 - var0);
		}

		int var8 = 0;
		if (var2 != var1) {
			var8 = (var5 - var4 << 14) / (var2 - var1);
		}

		int var9 = 0;
		if (var2 != var0) {
			var9 = (var3 - var5 << 14) / (var0 - var2);
		}

		if (var0 <= var1 && var0 <= var2) {
			if (var0 < anInt2709) {
				if (var1 > anInt2709) {
					var1 = anInt2709;
				}

				if (var2 > anInt2709) {
					var2 = anInt2709;
				}

				if (var1 < var2) {
					var5 = var3 <<= 14;
					if (var0 < 0) {
						var5 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var8 * var1;
						var1 = 0;
					}

					if ((var0 == var1 || var9 >= var7) && (var0 != var1 || var9 <= var8)) {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray2712[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method3161(anIntArray2396, var0, var6, 0, var4 >> 14, var5 >> 14);
									var5 += var9;
									var4 += var8;
									var0 += anInt2399;
								}
							}

							method3161(anIntArray2396, var0, var6, 0, var3 >> 14, var5 >> 14);
							var5 += var9;
							var3 += var7;
							var0 += anInt2399;
						}
					} else {
						var2 -= var1;
						var1 -= var0;
						var0 = anIntArray2712[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method3161(anIntArray2396, var0, var6, 0, var5 >> 14, var4 >> 14);
									var5 += var9;
									var4 += var8;
									var0 += anInt2399;
								}
							}

							method3161(anIntArray2396, var0, var6, 0, var5 >> 14, var3 >> 14);
							var5 += var9;
							var3 += var7;
							var0 += anInt2399;
						}
					}
				} else {
					var4 = var3 <<= 14;
					if (var0 < 0) {
						var4 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var8 * var2;
						var2 = 0;
					}

					if (var0 != var2 && var9 < var7 || var0 == var2 && var8 > var7) {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray2712[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method3161(anIntArray2396, var0, var6, 0, var5 >> 14, var3 >> 14);
									var5 += var8;
									var3 += var7;
									var0 += anInt2399;
								}
							}

							method3161(anIntArray2396, var0, var6, 0, var4 >> 14, var3 >> 14);
							var4 += var9;
							var3 += var7;
							var0 += anInt2399;
						}
					} else {
						var1 -= var2;
						var2 -= var0;
						var0 = anIntArray2712[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method3161(anIntArray2396, var0, var6, 0, var3 >> 14, var5 >> 14);
									var5 += var8;
									var3 += var7;
									var0 += anInt2399;
								}
							}

							method3161(anIntArray2396, var0, var6, 0, var3 >> 14, var4 >> 14);
							var4 += var9;
							var3 += var7;
							var0 += anInt2399;
						}
					}
				}
			}
		} else if (var1 <= var2) {
			if (var1 < anInt2709) {
				if (var2 > anInt2709) {
					var2 = anInt2709;
				}

				if (var0 > anInt2709) {
					var0 = anInt2709;
				}

				if (var2 < var0) {
					var3 = var4 <<= 14;
					if (var1 < 0) {
						var3 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var9 * var2;
						var2 = 0;
					}

					if (var1 != var2 && var7 < var8 || var1 == var2 && var7 > var9) {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray2712[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method3161(anIntArray2396, var1, var6, 0, var3 >> 14, var5 >> 14);
									var3 += var7;
									var5 += var9;
									var1 += anInt2399;
								}
							}

							method3161(anIntArray2396, var1, var6, 0, var3 >> 14, var4 >> 14);
							var3 += var7;
							var4 += var8;
							var1 += anInt2399;
						}
					} else {
						var0 -= var2;
						var2 -= var1;
						var1 = anIntArray2712[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method3161(anIntArray2396, var1, var6, 0, var5 >> 14, var3 >> 14);
									var3 += var7;
									var5 += var9;
									var1 += anInt2399;
								}
							}

							method3161(anIntArray2396, var1, var6, 0, var4 >> 14, var3 >> 14);
							var3 += var7;
							var4 += var8;
							var1 += anInt2399;
						}
					}
				} else {
					var5 = var4 <<= 14;
					if (var1 < 0) {
						var5 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var3 <<= 14;
					if (var0 < 0) {
						var3 -= var9 * var0;
						var0 = 0;
					}

					if (var7 < var8) {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray2712[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method3161(anIntArray2396, var1, var6, 0, var3 >> 14, var4 >> 14);
									var3 += var9;
									var4 += var8;
									var1 += anInt2399;
								}
							}

							method3161(anIntArray2396, var1, var6, 0, var5 >> 14, var4 >> 14);
							var5 += var7;
							var4 += var8;
							var1 += anInt2399;
						}
					} else {
						var2 -= var0;
						var0 -= var1;
						var1 = anIntArray2712[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method3161(anIntArray2396, var1, var6, 0, var4 >> 14, var3 >> 14);
									var3 += var9;
									var4 += var8;
									var1 += anInt2399;
								}
							}

							method3161(anIntArray2396, var1, var6, 0, var4 >> 14, var5 >> 14);
							var5 += var7;
							var4 += var8;
							var1 += anInt2399;
						}
					}
				}
			}
		} else if (var2 < anInt2709) {
			if (var0 > anInt2709) {
				var0 = anInt2709;
			}

			if (var1 > anInt2709) {
				var1 = anInt2709;
			}

			if (var0 < var1) {
				var4 = var5 <<= 14;
				if (var2 < 0) {
					var4 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var3 <<= 14;
				if (var0 < 0) {
					var3 -= var7 * var0;
					var0 = 0;
				}

				if (var8 < var9) {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray2712[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								method3161(anIntArray2396, var2, var6, 0, var4 >> 14, var3 >> 14);
								var4 += var8;
								var3 += var7;
								var2 += anInt2399;
							}
						}

						method3161(anIntArray2396, var2, var6, 0, var4 >> 14, var5 >> 14);
						var4 += var8;
						var5 += var9;
						var2 += anInt2399;
					}
				} else {
					var1 -= var0;
					var0 -= var2;
					var2 = anIntArray2712[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								method3161(anIntArray2396, var2, var6, 0, var3 >> 14, var4 >> 14);
								var4 += var8;
								var3 += var7;
								var2 += anInt2399;
							}
						}

						method3161(anIntArray2396, var2, var6, 0, var5 >> 14, var4 >> 14);
						var4 += var8;
						var5 += var9;
						var2 += anInt2399;
					}
				}
			} else {
				var3 = var5 <<= 14;
				if (var2 < 0) {
					var3 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var4 <<= 14;
				if (var1 < 0) {
					var4 -= var7 * var1;
					var1 = 0;
				}

				if (var8 < var9) {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray2712[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								method3161(anIntArray2396, var2, var6, 0, var4 >> 14, var5 >> 14);
								var4 += var7;
								var5 += var9;
								var2 += anInt2399;
							}
						}

						method3161(anIntArray2396, var2, var6, 0, var3 >> 14, var5 >> 14);
						var3 += var8;
						var5 += var9;
						var2 += anInt2399;
					}
				} else {
					var0 -= var1;
					var1 -= var2;
					var2 = anIntArray2712[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								method3161(anIntArray2396, var2, var6, 0, var5 >> 14, var4 >> 14);
								var4 += var7;
								var5 += var9;
								var2 += anInt2399;
							}
						}

						method3161(anIntArray2396, var2, var6, 0, var5 >> 14, var3 >> 14);
						var3 += var8;
						var5 += var9;
						var2 += anInt2399;
					}
				}
			}
		}
	}

	static final void method3161(int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (aBool2701) {
			if (var5 > anInt2717) {
				var5 = anInt2717;
			}

			if (var4 < 0) {
				var4 = 0;
			}
		}

		if (var4 < var5) {
			var1 += var4;
			var3 = var5 - var4 >> 2;
			if (anInt2700 != 0) {
				if (anInt2700 == 254) {
					while (true) {
						--var3;
						if (var3 < 0) {
							var3 = var5 - var4 & 3;

							while (true) {
								--var3;
								if (var3 < 0) {
									return;
								}

								var0[var1++] = var0[var1];
							}
						}

						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
					}
				} else {
					int var7 = anInt2700;
					int var8 = 256 - anInt2700;
					var2 = ((var2 & 16711935) * var8 >> 8 & 16711935) + ((var2 & 65280) * var8 >> 8 & 65280);

					while (true) {
						--var3;
						int var6;
						if (var3 < 0) {
							var3 = var5 - var4 & 3;

							while (true) {
								--var3;
								if (var3 < 0) {
									return;
								}

								var6 = var0[var1];
								var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & 65280) * var7 >> 8 & 65280);
							}
						}

						var6 = var0[var1];
						var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & 65280) * var7 >> 8 & 65280);
						var6 = var0[var1];
						var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & 65280) * var7 >> 8 & 65280);
						var6 = var0[var1];
						var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & 65280) * var7 >> 8 & 65280);
						var6 = var0[var1];
						var0[var1++] = var2 + ((var6 & 16711935) * var7 >> 8 & 16711935) + ((var6 & 65280) * var7 >> 8 & 65280);
					}
				}
			} else {
				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = var5 - var4 & 3;

						while (true) {
							--var3;
							if (var3 < 0) {
								return;
							}

							var0[var1++] = var2;
						}
					}

					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
				}
			}
		}
	}

	static final void method3163(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (aBool2701) {
			if (var6 > anInt2717) {
				var6 = anInt2717;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var22 = var6 - var5;
			int var15;
			int var16;
			int var10000;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var23;
			if (aBool2698) {
				var19 = var5 - anInt2706;
				var9 += (var12 >> 3) * var19;
				var10 += (var13 >> 3) * var19;
				var11 += (var14 >> 3) * var19;
				var15 = var11 >> 12;
				if (var15 != 0) {
					var17 = var9 / var15;
					var20 = var10 / var15;
					if (var17 < 0) {
						var17 = 0;
					} else if (var17 > 4032) {
						var17 = 4032;
					}
				} else {
					var17 = 0;
					var20 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var15 = var11 >> 12;
				if (var15 != 0) {
					var18 = var9 / var15;
					var16 = var10 / var15;
					if (var18 < 0) {
						var18 = 0;
					} else if (var18 > 4032) {
						var18 = 4032;
					}
				} else {
					var18 = 0;
					var16 = 0;
				}

				var2 = (var17 << 20) + var20;
				var23 = (var18 - var17 >> 3 << 20) + (var16 - var20 >> 3);
				var22 >>= 3;
				var8 <<= 3;
				var21 = var7 >> 8;
				if (aBool2697) {
					if (var22 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							var2 += var23;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							var2 += var23;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							var2 += var23;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							var2 += var23;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							var2 += var23;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							var2 += var23;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							var2 += var23;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							var10000 = var2 + var23;
							var17 = var18;
							var20 = var16;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var15 = var11 >> 12;
							if (var15 != 0) {
								var18 = var9 / var15;
								var16 = var10 / var15;
								if (var18 < 0) {
									var18 = 0;
								} else if (var18 > 4032) {
									var18 = 4032;
								}
							} else {
								var18 = 0;
								var16 = 0;
							}

							var2 = (var17 << 20) + var20;
							var23 = (var18 - var17 >> 3 << 20) + (var16 - var20 >> 3);
							var7 += var8;
							var21 = var7 >> 8;
							--var22;
						} while (var22 > 0);
					}

					var22 = var6 - var5 & 7;
					if (var22 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							var2 += var23;
							--var22;
						} while (var22 > 0);
					}
				} else {
					if (var22 > 0) {
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							}

							++var4;
							var2 += var23;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							}

							++var4;
							var2 += var23;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							}

							++var4;
							var2 += var23;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							}

							++var4;
							var2 += var23;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							}

							++var4;
							var2 += var23;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							}

							++var4;
							var2 += var23;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							}

							++var4;
							var2 += var23;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							}

							++var4;
							var10000 = var2 + var23;
							var17 = var18;
							var20 = var16;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var15 = var11 >> 12;
							if (var15 != 0) {
								var18 = var9 / var15;
								var16 = var10 / var15;
								if (var18 < 0) {
									var18 = 0;
								} else if (var18 > 4032) {
									var18 = 4032;
								}
							} else {
								var18 = 0;
								var16 = 0;
							}

							var2 = (var17 << 20) + var20;
							var23 = (var18 - var17 >> 3 << 20) + (var16 - var20 >> 3);
							var7 += var8;
							var21 = var7 >> 8;
							--var22;
						} while (var22 > 0);
					}

					var22 = var6 - var5 & 7;
					if (var22 > 0) {
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							}

							++var4;
							var2 += var23;
							--var22;
						} while (var22 > 0);
					}
				}
			} else {
				var19 = var5 - anInt2706;
				var9 += (var12 >> 3) * var19;
				var10 += (var13 >> 3) * var19;
				var11 += (var14 >> 3) * var19;
				var15 = var11 >> 14;
				if (var15 != 0) {
					var17 = var9 / var15;
					var20 = var10 / var15;
					if (var17 < 0) {
						var17 = 0;
					} else if (var17 > 16256) {
						var17 = 16256;
					}
				} else {
					var17 = 0;
					var20 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var15 = var11 >> 14;
				if (var15 != 0) {
					var18 = var9 / var15;
					var16 = var10 / var15;
					if (var18 < 0) {
						var18 = 0;
					} else if (var18 > 16256) {
						var18 = 16256;
					}
				} else {
					var18 = 0;
					var16 = 0;
				}

				var2 = (var17 << 18) + var20;
				var23 = (var18 - var17 >> 3 << 18) + (var16 - var20 >> 3);
				var22 >>= 3;
				var8 <<= 3;
				var21 = var7 >> 8;
				if (aBool2697) {
					if (var22 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							var2 += var23;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							var2 += var23;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							var2 += var23;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							var2 += var23;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							var2 += var23;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							var2 += var23;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							var2 += var23;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							var10000 = var2 + var23;
							var17 = var18;
							var20 = var16;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var15 = var11 >> 14;
							if (var15 != 0) {
								var18 = var9 / var15;
								var16 = var10 / var15;
								if (var18 < 0) {
									var18 = 0;
								} else if (var18 > 16256) {
									var18 = 16256;
								}
							} else {
								var18 = 0;
								var16 = 0;
							}

							var2 = (var17 << 18) + var20;
							var23 = (var18 - var17 >> 3 << 18) + (var16 - var20 >> 3);
							var7 += var8;
							var21 = var7 >> 8;
							--var22;
						} while (var22 > 0);
					}

					var22 = var6 - var5 & 7;
					if (var22 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							var2 += var23;
							--var22;
						} while (var22 > 0);
					}
				} else {
					if (var22 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							}

							++var4;
							var2 += var23;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							}

							++var4;
							var2 += var23;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							}

							++var4;
							var2 += var23;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							}

							++var4;
							var2 += var23;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							}

							++var4;
							var2 += var23;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							}

							++var4;
							var2 += var23;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							}

							++var4;
							var2 += var23;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							}

							++var4;
							var10000 = var2 + var23;
							var17 = var18;
							var20 = var16;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var15 = var11 >> 14;
							if (var15 != 0) {
								var18 = var9 / var15;
								var16 = var10 / var15;
								if (var18 < 0) {
									var18 = 0;
								} else if (var18 > 16256) {
									var18 = 16256;
								}
							} else {
								var18 = 0;
								var16 = 0;
							}

							var2 = (var17 << 18) + var20;
							var23 = (var18 - var17 >> 3 << 18) + (var16 - var20 >> 3);
							var7 += var8;
							var21 = var7 >> 8;
							--var22;
						} while (var22 > 0);
					}

					var22 = var6 - var5 & 7;
					if (var22 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var21 & -16711936) + ((var3 & 65280) * var21 & 16711680) >> 8;
							}

							++var4;
							var2 += var23;
							--var22;
						} while (var22 > 0);
					}
				}
			}

		}
	}

	static final void method3164(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = anInterface2_2715.method24(var18, -497416600);
		int var20;
		if (var19 == null) {
			var20 = anInterface2_2715.method29(var18, 2111863495);
			method3158(var0, var1, var2, var3, var4, var5, method3166(var20, var6), method3166(var20, var7), method3166(var20, var8));
		} else {
			aBool2698 = anInterface2_2715.method26(var18, (byte) 115);
			aBool2697 = anInterface2_2715.method23(var18, (byte) -83);
			var20 = var4 - var3;
			int var36 = var1 - var0;
			int var41 = var5 - var3;
			int var28 = var2 - var0;
			int var29 = var7 - var6;
			int var40 = var8 - var6;
			int var31 = 0;
			if (var1 != var0) {
				var31 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var33 = 0;
			if (var2 != var1) {
				var33 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var34 = 0;
			if (var2 != var0) {
				var34 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var35 = var20 * var28 - var41 * var36;
			if (var35 != 0) {
				int var21 = (var29 * var28 - var40 * var36 << 9) / var35;
				int var37 = (var40 * var20 - var29 * var41 << 9) / var35;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var22 = var11 * var12 - var14 * var9 << 14;
				int var25 = (int) (((long) (var14 * var15 - var17 * var12) << 14) / (long) anInt2705);
				int var39 = (int) (((long) (var17 * var9 - var11 * var15) << 14) / (long) anInt2705);
				int var23 = var10 * var12 - var13 * var9 << 14;
				int var26 = (int) (((long) (var13 * var15 - var16 * var12) << 14) / (long) anInt2705);
				int var38 = (int) (((long) (var16 * var9 - var10 * var15) << 14) / (long) anInt2705);
				int var24 = var13 * var11 - var10 * var14 << 14;
				int var27 = (int) (((long) (var16 * var14 - var13 * var17) << 14) / (long) anInt2705);
				int var30 = (int) (((long) (var10 * var17 - var16 * var11) << 14) / (long) anInt2705);
				int var32;
				if (var0 <= var1 && var0 <= var2) {
					if (var0 < anInt2709) {
						if (var1 > anInt2709) {
							var1 = anInt2709;
						}

						if (var2 > anInt2709) {
							var2 = anInt2709;
						}

						var6 = (var6 << 9) - var21 * var3 + var21;
						if (var1 < var2) {
							var5 = var3 <<= 14;
							if (var0 < 0) {
								var5 -= var34 * var0;
								var3 -= var31 * var0;
								var6 -= var37 * var0;
								var0 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var33 * var1;
								var1 = 0;
							}

							var32 = var0 - anInt2707;
							var22 += var39 * var32;
							var23 += var38 * var32;
							var24 += var30 * var32;
							if (var0 != var1 && var34 < var31 || var0 == var1 && var34 > var33) {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray2712[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method3165(anIntArray2396, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var21, var22, var23, var24, var25, var26, var27);
											var5 += var34;
											var4 += var33;
											var6 += var37;
											var0 += anInt2399;
											var22 += var39;
											var23 += var38;
											var24 += var30;
										}
									}

									method3165(anIntArray2396, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var21, var22, var23, var24, var25, var26, var27);
									var5 += var34;
									var3 += var31;
									var6 += var37;
									var0 += anInt2399;
									var22 += var39;
									var23 += var38;
									var24 += var30;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray2712[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method3165(anIntArray2396, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var21, var22, var23, var24, var25, var26, var27);
											var5 += var34;
											var4 += var33;
											var6 += var37;
											var0 += anInt2399;
											var22 += var39;
											var23 += var38;
											var24 += var30;
										}
									}

									method3165(anIntArray2396, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var21, var22, var23, var24, var25, var26, var27);
									var5 += var34;
									var3 += var31;
									var6 += var37;
									var0 += anInt2399;
									var22 += var39;
									var23 += var38;
									var24 += var30;
								}
							}
						} else {
							var4 = var3 <<= 14;
							if (var0 < 0) {
								var4 -= var34 * var0;
								var3 -= var31 * var0;
								var6 -= var37 * var0;
								var0 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var33 * var2;
								var2 = 0;
							}

							var32 = var0 - anInt2707;
							var22 += var39 * var32;
							var23 += var38 * var32;
							var24 += var30 * var32;
							if ((var0 == var2 || var34 >= var31) && (var0 != var2 || var33 <= var31)) {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray2712[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											method3165(anIntArray2396, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var21, var22, var23, var24, var25, var26, var27);
											var5 += var33;
											var3 += var31;
											var6 += var37;
											var0 += anInt2399;
											var22 += var39;
											var23 += var38;
											var24 += var30;
										}
									}

									method3165(anIntArray2396, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var21, var22, var23, var24, var25, var26, var27);
									var4 += var34;
									var3 += var31;
									var6 += var37;
									var0 += anInt2399;
									var22 += var39;
									var23 += var38;
									var24 += var30;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray2712[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											method3165(anIntArray2396, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var21, var22, var23, var24, var25, var26, var27);
											var5 += var33;
											var3 += var31;
											var6 += var37;
											var0 += anInt2399;
											var22 += var39;
											var23 += var38;
											var24 += var30;
										}
									}

									method3165(anIntArray2396, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var21, var22, var23, var24, var25, var26, var27);
									var4 += var34;
									var3 += var31;
									var6 += var37;
									var0 += anInt2399;
									var22 += var39;
									var23 += var38;
									var24 += var30;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < anInt2709) {
						if (var2 > anInt2709) {
							var2 = anInt2709;
						}

						if (var0 > anInt2709) {
							var0 = anInt2709;
						}

						var7 = (var7 << 9) - var21 * var4 + var21;
						if (var2 < var0) {
							var3 = var4 <<= 14;
							if (var1 < 0) {
								var3 -= var31 * var1;
								var4 -= var33 * var1;
								var7 -= var37 * var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var34 * var2;
								var2 = 0;
							}

							var32 = var1 - anInt2707;
							var22 += var39 * var32;
							var23 += var38 * var32;
							var24 += var30 * var32;
							if (var1 != var2 && var31 < var33 || var1 == var2 && var31 > var34) {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray2712[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											method3165(anIntArray2396, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var21, var22, var23, var24, var25, var26, var27);
											var3 += var31;
											var5 += var34;
											var7 += var37;
											var1 += anInt2399;
											var22 += var39;
											var23 += var38;
											var24 += var30;
										}
									}

									method3165(anIntArray2396, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var21, var22, var23, var24, var25, var26, var27);
									var3 += var31;
									var4 += var33;
									var7 += var37;
									var1 += anInt2399;
									var22 += var39;
									var23 += var38;
									var24 += var30;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray2712[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											method3165(anIntArray2396, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var21, var22, var23, var24, var25, var26, var27);
											var3 += var31;
											var5 += var34;
											var7 += var37;
											var1 += anInt2399;
											var22 += var39;
											var23 += var38;
											var24 += var30;
										}
									}

									method3165(anIntArray2396, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var21, var22, var23, var24, var25, var26, var27);
									var3 += var31;
									var4 += var33;
									var7 += var37;
									var1 += anInt2399;
									var22 += var39;
									var23 += var38;
									var24 += var30;
								}
							}
						} else {
							var5 = var4 <<= 14;
							if (var1 < 0) {
								var5 -= var31 * var1;
								var4 -= var33 * var1;
								var7 -= var37 * var1;
								var1 = 0;
							}

							var3 <<= 14;
							if (var0 < 0) {
								var3 -= var34 * var0;
								var0 = 0;
							}

							var32 = var1 - anInt2707;
							var22 += var39 * var32;
							var23 += var38 * var32;
							var24 += var30 * var32;
							if (var31 < var33) {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray2712[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method3165(anIntArray2396, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var21, var22, var23, var24, var25, var26, var27);
											var3 += var34;
											var4 += var33;
											var7 += var37;
											var1 += anInt2399;
											var22 += var39;
											var23 += var38;
											var24 += var30;
										}
									}

									method3165(anIntArray2396, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var21, var22, var23, var24, var25, var26, var27);
									var5 += var31;
									var4 += var33;
									var7 += var37;
									var1 += anInt2399;
									var22 += var39;
									var23 += var38;
									var24 += var30;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray2712[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method3165(anIntArray2396, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var21, var22, var23, var24, var25, var26, var27);
											var3 += var34;
											var4 += var33;
											var7 += var37;
											var1 += anInt2399;
											var22 += var39;
											var23 += var38;
											var24 += var30;
										}
									}

									method3165(anIntArray2396, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var21, var22, var23, var24, var25, var26, var27);
									var5 += var31;
									var4 += var33;
									var7 += var37;
									var1 += anInt2399;
									var22 += var39;
									var23 += var38;
									var24 += var30;
								}
							}
						}
					}
				} else if (var2 < anInt2709) {
					if (var0 > anInt2709) {
						var0 = anInt2709;
					}

					if (var1 > anInt2709) {
						var1 = anInt2709;
					}

					var8 = (var8 << 9) - var21 * var5 + var21;
					if (var0 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var33 * var2;
							var5 -= var34 * var2;
							var8 -= var37 * var2;
							var2 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var31 * var0;
							var0 = 0;
						}

						var32 = var2 - anInt2707;
						var22 += var39 * var32;
						var23 += var38 * var32;
						var24 += var30 * var32;
						if (var33 < var34) {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray2712[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method3165(anIntArray2396, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var21, var22, var23, var24, var25, var26, var27);
										var4 += var33;
										var3 += var31;
										var8 += var37;
										var2 += anInt2399;
										var22 += var39;
										var23 += var38;
										var24 += var30;
									}
								}

								method3165(anIntArray2396, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var21, var22, var23, var24, var25, var26, var27);
								var4 += var33;
								var5 += var34;
								var8 += var37;
								var2 += anInt2399;
								var22 += var39;
								var23 += var38;
								var24 += var30;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray2712[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method3165(anIntArray2396, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var21, var22, var23, var24, var25, var26, var27);
										var4 += var33;
										var3 += var31;
										var8 += var37;
										var2 += anInt2399;
										var22 += var39;
										var23 += var38;
										var24 += var30;
									}
								}

								method3165(anIntArray2396, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var21, var22, var23, var24, var25, var26, var27);
								var4 += var33;
								var5 += var34;
								var8 += var37;
								var2 += anInt2399;
								var22 += var39;
								var23 += var38;
								var24 += var30;
							}
						}
					} else {
						var3 = var5 <<= 14;
						if (var2 < 0) {
							var3 -= var33 * var2;
							var5 -= var34 * var2;
							var8 -= var37 * var2;
							var2 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var31 * var1;
							var1 = 0;
						}

						var32 = var2 - anInt2707;
						var22 += var39 * var32;
						var23 += var38 * var32;
						var24 += var30 * var32;
						if (var33 < var34) {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray2712[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method3165(anIntArray2396, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var21, var22, var23, var24, var25, var26, var27);
										var4 += var31;
										var5 += var34;
										var8 += var37;
										var2 += anInt2399;
										var22 += var39;
										var23 += var38;
										var24 += var30;
									}
								}

								method3165(anIntArray2396, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var21, var22, var23, var24, var25, var26, var27);
								var3 += var33;
								var5 += var34;
								var8 += var37;
								var2 += anInt2399;
								var22 += var39;
								var23 += var38;
								var24 += var30;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray2712[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method3165(anIntArray2396, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var21, var22, var23, var24, var25, var26, var27);
										var4 += var31;
										var5 += var34;
										var8 += var37;
										var2 += anInt2399;
										var22 += var39;
										var23 += var38;
										var24 += var30;
									}
								}

								method3165(anIntArray2396, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var21, var22, var23, var24, var25, var26, var27);
								var3 += var33;
								var5 += var34;
								var8 += var37;
								var2 += anInt2399;
								var22 += var39;
								var23 += var38;
								var24 += var30;
							}
						}
					}
				}
			}
		}
	}

	static final void method3165(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (aBool2701) {
			if (var6 > anInt2717) {
				var6 = anInt2717;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var15 = var6 - var5;
			int var16;
			int var17;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (aBool2698) {
				var17 = var5 - anInt2706;
				var9 += var12 * var17;
				var10 += var13 * var17;
				var11 += var14 * var17;
				var18 = var11 >> 12;
				if (var18 != 0) {
					var19 = var9 / var18;
					var23 = var10 / var18;
				} else {
					var19 = 0;
					var23 = 0;
				}

				var9 += var12 * var15;
				var10 += var13 * var15;
				var11 += var14 * var15;
				var18 = var11 >> 12;
				if (var18 != 0) {
					var21 = var9 / var18;
					var22 = var10 / var18;
				} else {
					var21 = 0;
					var22 = 0;
				}

				var2 = (var19 << 20) + var23;
				var20 = ((var21 - var19) / var15 << 20) + (var22 - var23) / var15;
				var15 >>= 3;
				var8 <<= 3;
				var16 = var7 >> 8;
				if (aBool2697) {
					if (var15 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var20;
							var7 += var8;
							var16 = var7 >> 8;
							--var15;
						} while (var15 > 0);
					}

					var15 = var6 - var5 & 7;
					if (var15 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var20;
							--var15;
						} while (var15 > 0);
					}
				} else {
					if (var15 > 0) {
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var20;
							var7 += var8;
							var16 = var7 >> 8;
							--var15;
						} while (var15 > 0);
					}

					var15 = var6 - var5 & 7;
					if (var15 > 0) {
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var20;
							--var15;
						} while (var15 > 0);
					}
				}
			} else {
				var17 = var5 - anInt2706;
				var9 += var12 * var17;
				var10 += var13 * var17;
				var11 += var14 * var17;
				var18 = var11 >> 14;
				if (var18 != 0) {
					var19 = var9 / var18;
					var23 = var10 / var18;
				} else {
					var19 = 0;
					var23 = 0;
				}

				var9 += var12 * var15;
				var10 += var13 * var15;
				var11 += var14 * var15;
				var18 = var11 >> 14;
				if (var18 != 0) {
					var21 = var9 / var18;
					var22 = var10 / var18;
				} else {
					var21 = 0;
					var22 = 0;
				}

				var2 = (var19 << 18) + var23;
				var20 = ((var21 - var19) / var15 << 18) + (var22 - var23) / var15;
				var15 >>= 3;
				var8 <<= 3;
				var16 = var7 >> 8;
				if (aBool2697) {
					if (var15 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var20;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var20;
							var7 += var8;
							var16 = var7 >> 8;
							--var15;
						} while (var15 > 0);
					}

					var15 = var6 - var5 & 7;
					if (var15 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							var2 += var20;
							--var15;
						} while (var15 > 0);
					}
				} else {
					if (var15 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var20;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var20;
							var7 += var8;
							var16 = var7 >> 8;
							--var15;
						} while (var15 > 0);
					}

					var15 = var6 - var5 & 7;
					if (var15 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var16 & -16711936) + ((var3 & 65280) * var16 & 16711680) >> 8;
							}

							++var4;
							var2 += var20;
							--var15;
						} while (var15 > 0);
					}
				}
			}

		}
	}

	static final int method3166(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	public static final void method3167() {
		anInt2706 = anInt2717 / 2;
		anInt2707 = anInt2709 / 2;
		anInt2710 = -anInt2706;
		anInt2716 = anInt2717 - anInt2706;
		anInt2702 = -anInt2707;
		anInt2708 = anInt2709 - anInt2707;
	}

	static final void method3176(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = anInterface2_2715.method24(var18, -497416600);
		int var21;
		if (var19 == null) {
			var21 = anInterface2_2715.method29(var18, -1015870875);
			method3158(var0, var1, var2, var3, var4, var5, method3166(var21, var6), method3166(var21, var7), method3166(var21, var8));
		} else {
			aBool2698 = anInterface2_2715.method26(var18, (byte) 118);
			aBool2697 = anInterface2_2715.method23(var18, (byte) -21);
			var21 = var4 - var3;
			int var24 = var1 - var0;
			int var25 = var5 - var3;
			int var26 = var2 - var0;
			int var33 = var7 - var6;
			int var27 = var8 - var6;
			int var30 = 0;
			if (var1 != var0) {
				var30 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var20 = 0;
			if (var2 != var1) {
				var20 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var31 = 0;
			if (var2 != var0) {
				var31 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var32 = var21 * var26 - var25 * var24;
			if (var32 != 0) {
				int var41 = (var33 * var26 - var27 * var24 << 9) / var32;
				int var34 = (var27 * var21 - var33 * var25 << 9) / var32;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var35 = var11 * var12 - var14 * var9 << 14;
				int var37 = (int) (((long) (var14 * var15 - var17 * var12) << 3 << 14) / (long) anInt2705);
				int var36 = (int) (((long) (var17 * var9 - var11 * var15) << 14) / (long) anInt2705);
				int var28 = var10 * var12 - var13 * var9 << 14;
				int var38 = (int) (((long) (var13 * var15 - var16 * var12) << 3 << 14) / (long) anInt2705);
				int var29 = (int) (((long) (var16 * var9 - var10 * var15) << 14) / (long) anInt2705);
				int var22 = var13 * var11 - var10 * var14 << 14;
				int var39 = (int) (((long) (var16 * var14 - var13 * var17) << 3 << 14) / (long) anInt2705);
				int var23 = (int) (((long) (var10 * var17 - var16 * var11) << 14) / (long) anInt2705);
				int var40;
				if (var0 <= var1 && var0 <= var2) {
					if (var0 < anInt2709) {
						if (var1 > anInt2709) {
							var1 = anInt2709;
						}

						if (var2 > anInt2709) {
							var2 = anInt2709;
						}

						var6 = (var6 << 9) - var41 * var3 + var41;
						if (var1 < var2) {
							var5 = var3 <<= 14;
							if (var0 < 0) {
								var5 -= var31 * var0;
								var3 -= var30 * var0;
								var6 -= var34 * var0;
								var0 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var20 * var1;
								var1 = 0;
							}

							var40 = var0 - anInt2707;
							var35 += var36 * var40;
							var28 += var29 * var40;
							var22 += var23 * var40;
							if (var0 != var1 && var31 < var30 || var0 == var1 && var31 > var20) {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray2712[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method3163(anIntArray2396, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var41, var35, var28, var22, var37, var38, var39);
											var5 += var31;
											var4 += var20;
											var6 += var34;
											var0 += anInt2399;
											var35 += var36;
											var28 += var29;
											var22 += var23;
										}
									}

									method3163(anIntArray2396, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var41, var35, var28, var22, var37, var38, var39);
									var5 += var31;
									var3 += var30;
									var6 += var34;
									var0 += anInt2399;
									var35 += var36;
									var28 += var29;
									var22 += var23;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = anIntArray2712[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method3163(anIntArray2396, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var41, var35, var28, var22, var37, var38, var39);
											var5 += var31;
											var4 += var20;
											var6 += var34;
											var0 += anInt2399;
											var35 += var36;
											var28 += var29;
											var22 += var23;
										}
									}

									method3163(anIntArray2396, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var41, var35, var28, var22, var37, var38, var39);
									var5 += var31;
									var3 += var30;
									var6 += var34;
									var0 += anInt2399;
									var35 += var36;
									var28 += var29;
									var22 += var23;
								}
							}
						} else {
							var4 = var3 <<= 14;
							if (var0 < 0) {
								var4 -= var31 * var0;
								var3 -= var30 * var0;
								var6 -= var34 * var0;
								var0 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var20 * var2;
								var2 = 0;
							}

							var40 = var0 - anInt2707;
							var35 += var36 * var40;
							var28 += var29 * var40;
							var22 += var23 * var40;
							if ((var0 == var2 || var31 >= var30) && (var0 != var2 || var20 <= var30)) {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray2712[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											method3163(anIntArray2396, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var41, var35, var28, var22, var37, var38, var39);
											var5 += var20;
											var3 += var30;
											var6 += var34;
											var0 += anInt2399;
											var35 += var36;
											var28 += var29;
											var22 += var23;
										}
									}

									method3163(anIntArray2396, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var41, var35, var28, var22, var37, var38, var39);
									var4 += var31;
									var3 += var30;
									var6 += var34;
									var0 += anInt2399;
									var35 += var36;
									var28 += var29;
									var22 += var23;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = anIntArray2712[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											method3163(anIntArray2396, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var41, var35, var28, var22, var37, var38, var39);
											var5 += var20;
											var3 += var30;
											var6 += var34;
											var0 += anInt2399;
											var35 += var36;
											var28 += var29;
											var22 += var23;
										}
									}

									method3163(anIntArray2396, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var41, var35, var28, var22, var37, var38, var39);
									var4 += var31;
									var3 += var30;
									var6 += var34;
									var0 += anInt2399;
									var35 += var36;
									var28 += var29;
									var22 += var23;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < anInt2709) {
						if (var2 > anInt2709) {
							var2 = anInt2709;
						}

						if (var0 > anInt2709) {
							var0 = anInt2709;
						}

						var7 = (var7 << 9) - var41 * var4 + var41;
						if (var2 < var0) {
							var3 = var4 <<= 14;
							if (var1 < 0) {
								var3 -= var30 * var1;
								var4 -= var20 * var1;
								var7 -= var34 * var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var31 * var2;
								var2 = 0;
							}

							var40 = var1 - anInt2707;
							var35 += var36 * var40;
							var28 += var29 * var40;
							var22 += var23 * var40;
							if (var1 != var2 && var30 < var20 || var1 == var2 && var30 > var31) {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray2712[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											method3163(anIntArray2396, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var41, var35, var28, var22, var37, var38, var39);
											var3 += var30;
											var5 += var31;
											var7 += var34;
											var1 += anInt2399;
											var35 += var36;
											var28 += var29;
											var22 += var23;
										}
									}

									method3163(anIntArray2396, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var41, var35, var28, var22, var37, var38, var39);
									var3 += var30;
									var4 += var20;
									var7 += var34;
									var1 += anInt2399;
									var35 += var36;
									var28 += var29;
									var22 += var23;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = anIntArray2712[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											method3163(anIntArray2396, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var41, var35, var28, var22, var37, var38, var39);
											var3 += var30;
											var5 += var31;
											var7 += var34;
											var1 += anInt2399;
											var35 += var36;
											var28 += var29;
											var22 += var23;
										}
									}

									method3163(anIntArray2396, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var41, var35, var28, var22, var37, var38, var39);
									var3 += var30;
									var4 += var20;
									var7 += var34;
									var1 += anInt2399;
									var35 += var36;
									var28 += var29;
									var22 += var23;
								}
							}
						} else {
							var5 = var4 <<= 14;
							if (var1 < 0) {
								var5 -= var30 * var1;
								var4 -= var20 * var1;
								var7 -= var34 * var1;
								var1 = 0;
							}

							var3 <<= 14;
							if (var0 < 0) {
								var3 -= var31 * var0;
								var0 = 0;
							}

							var40 = var1 - anInt2707;
							var35 += var36 * var40;
							var28 += var29 * var40;
							var22 += var23 * var40;
							if (var30 < var20) {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray2712[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method3163(anIntArray2396, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var41, var35, var28, var22, var37, var38, var39);
											var3 += var31;
											var4 += var20;
											var7 += var34;
											var1 += anInt2399;
											var35 += var36;
											var28 += var29;
											var22 += var23;
										}
									}

									method3163(anIntArray2396, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var41, var35, var28, var22, var37, var38, var39);
									var5 += var30;
									var4 += var20;
									var7 += var34;
									var1 += anInt2399;
									var35 += var36;
									var28 += var29;
									var22 += var23;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = anIntArray2712[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method3163(anIntArray2396, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var41, var35, var28, var22, var37, var38, var39);
											var3 += var31;
											var4 += var20;
											var7 += var34;
											var1 += anInt2399;
											var35 += var36;
											var28 += var29;
											var22 += var23;
										}
									}

									method3163(anIntArray2396, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var41, var35, var28, var22, var37, var38, var39);
									var5 += var30;
									var4 += var20;
									var7 += var34;
									var1 += anInt2399;
									var35 += var36;
									var28 += var29;
									var22 += var23;
								}
							}
						}
					}
				} else if (var2 < anInt2709) {
					if (var0 > anInt2709) {
						var0 = anInt2709;
					}

					if (var1 > anInt2709) {
						var1 = anInt2709;
					}

					var8 = (var8 << 9) - var41 * var5 + var41;
					if (var0 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var20 * var2;
							var5 -= var31 * var2;
							var8 -= var34 * var2;
							var2 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var30 * var0;
							var0 = 0;
						}

						var40 = var2 - anInt2707;
						var35 += var36 * var40;
						var28 += var29 * var40;
						var22 += var23 * var40;
						if (var20 < var31) {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray2712[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method3163(anIntArray2396, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var41, var35, var28, var22, var37, var38, var39);
										var4 += var20;
										var3 += var30;
										var8 += var34;
										var2 += anInt2399;
										var35 += var36;
										var28 += var29;
										var22 += var23;
									}
								}

								method3163(anIntArray2396, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var41, var35, var28, var22, var37, var38, var39);
								var4 += var20;
								var5 += var31;
								var8 += var34;
								var2 += anInt2399;
								var35 += var36;
								var28 += var29;
								var22 += var23;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = anIntArray2712[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method3163(anIntArray2396, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var41, var35, var28, var22, var37, var38, var39);
										var4 += var20;
										var3 += var30;
										var8 += var34;
										var2 += anInt2399;
										var35 += var36;
										var28 += var29;
										var22 += var23;
									}
								}

								method3163(anIntArray2396, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var41, var35, var28, var22, var37, var38, var39);
								var4 += var20;
								var5 += var31;
								var8 += var34;
								var2 += anInt2399;
								var35 += var36;
								var28 += var29;
								var22 += var23;
							}
						}
					} else {
						var3 = var5 <<= 14;
						if (var2 < 0) {
							var3 -= var20 * var2;
							var5 -= var31 * var2;
							var8 -= var34 * var2;
							var2 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var30 * var1;
							var1 = 0;
						}

						var40 = var2 - anInt2707;
						var35 += var36 * var40;
						var28 += var29 * var40;
						var22 += var23 * var40;
						if (var20 < var31) {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray2712[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method3163(anIntArray2396, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var41, var35, var28, var22, var37, var38, var39);
										var4 += var30;
										var5 += var31;
										var8 += var34;
										var2 += anInt2399;
										var35 += var36;
										var28 += var29;
										var22 += var23;
									}
								}

								method3163(anIntArray2396, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var41, var35, var28, var22, var37, var38, var39);
								var3 += var20;
								var5 += var31;
								var8 += var34;
								var2 += anInt2399;
								var35 += var36;
								var28 += var29;
								var22 += var23;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = anIntArray2712[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method3163(anIntArray2396, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var41, var35, var28, var22, var37, var38, var39);
										var4 += var30;
										var5 += var31;
										var8 += var34;
										var2 += anInt2399;
										var35 += var36;
										var28 += var29;
										var22 += var23;
									}
								}

								method3163(anIntArray2396, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var41, var35, var28, var22, var37, var38, var39);
								var3 += var20;
								var5 += var31;
								var8 += var34;
								var2 += anInt2399;
								var35 += var36;
								var28 += var29;
								var22 += var23;
							}
						}
					}
				}
			}
		}
	}

	static {
		int var0;
		for (var0 = 1; var0 < 512; var0++) {
			anIntArray2711[var0] = 32768 / var0;
		}

		for (var0 = 1; var0 < 2048; var0++) {
			anIntArray2718[var0] = 65536 / var0;
		}

		for (var0 = 0; var0 < 2048; var0++) {
			anIntArray2719[var0] = (int) (65536.0D * Math.sin((double) var0 * 0.0030679615D));
			anIntArray2720[var0] = (int) (65536.0D * Math.cos((double) var0 * 0.0030679615D));
		}

	}

	CacheableEntry_Sub23_Sub14_Sub3() throws Throwable {
		throw new Error();
	}

}
