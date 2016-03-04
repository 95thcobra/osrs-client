import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class135 {

	long aLong1604;
	RandomAccessFile aRandomAccessFile1603;
	long aLong1602;

	final void method1639(long var1) throws IOException {
		aRandomAccessFile1603.seek(var1);
		aLong1604 = -8272730773054730887L * var1;
	}

	public final void method1641(int var1) throws IOException {
		if (aRandomAccessFile1603 != null) {
			aRandomAccessFile1603.close();
			aRandomAccessFile1603 = null;
		}

	}

	public final long method1642(int var1) throws IOException {
		return aRandomAccessFile1603.length();
	}

	public final int method1643(byte[] var1, int var2, int var3, int var4) throws IOException {
		int var5 = aRandomAccessFile1603.read(var1, var2, var3);
		if (var5 > 0) {
			aLong1604 += -8272730773054730887L * (long) var5;
		}

		return var5;
	}

	protected void finalize() throws Throwable {
		if (aRandomAccessFile1603 != null) {
			System.out.println("");
			method1641(2075826484);
		}

	}

	public final void method1650(byte[] var1, int var2, int var3, int var4) throws IOException {
		if ((long) var3 + aLong1604 * -5463366847873381175L > aLong1602 * 4154921993714465717L) {
			aRandomAccessFile1603.seek(aLong1602 * 4154921993714465717L + 1L);
			aRandomAccessFile1603.write(1);
			throw new EOFException();
		} else {
			aRandomAccessFile1603.write(var1, var2, var3);
			aLong1604 += (long) var3 * -8272730773054730887L;
		}
	}

	public Class135(File var1, String var2, long var3) throws IOException {
		if (var3 == -1L) {
			var3 = 9223372036854775807L;
		}

		if (var1.length() >= var3) {
			var1.delete();
		}

		aRandomAccessFile1603 = new RandomAccessFile(var1, var2);
		aLong1602 = var3 * 8305230546561817245L;
		aLong1604 = 0L;
		int var5 = aRandomAccessFile1603.read();
		if (var5 != -1 && !var2.equals("r")) {
			aRandomAccessFile1603.seek(0L);
			aRandomAccessFile1603.write(var5);
		}

		aRandomAccessFile1603.seek(0L);
	}

}
