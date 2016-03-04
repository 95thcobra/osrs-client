import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class Connection implements Runnable {

	static IndexDescriptor_Sub1 aClass94_Sub1_972;
	boolean aBool968 = false;
	byte[] buffer;
	int bufpos = 0;
	AsyncJob aAsyncJob_963;
	int anInt966 = 0;
	boolean dummy = false;
	Class73 aClass73_970;
	Socket socket;
	InputStream input;
	OutputStream output;

	public int available() throws IOException {
		return dummy ? 0 : input.available();
	}

	public void read(byte[] dest, int offset, int length) throws IOException {
		if (!dummy) {
			while (length > 0) {
				int numread = input.read(dest, offset, length);
				if (numread <= 0) {
					throw new EOFException();
				}

				offset += numread;
				length -= numread;
			}
		}
	}

	public void write(byte[] src, int pos, int len) throws IOException {
		if (!dummy) {
			if (aBool968) {
				aBool968 = false;
				throw new IOException();
			} else {
				if (buffer == null) {
					buffer = new byte[5000];
				}

				synchronized (this) {
					for (int var6 = 0; var6 < len; var6++) {
						buffer[bufpos * 1692815575] = src[pos + var6];
						bufpos = (1 + bufpos * 1692815575) % 5000 * 25404135;
						if (bufpos * 1692815575 == (anInt966 * -757138255 + 4900) % 5000) {
							throw new IOException();
						}
					}

					if (aAsyncJob_963 == null) {
						aAsyncJob_963 = aClass73_970.submitRunnable(this, 3, (byte) 7);
					}

					notifyAll();
				}
			}
		}
	}

	public void run() {
		try {
			while (true) {
				label81:
				{
					int var3;
					int var4;
					synchronized (this) {
						if (anInt966 * -757138255 == bufpos * 1692815575) {
							if (dummy) {
								break label81;
							}

							try {
								wait();
							} catch (InterruptedException var9) {
								;
							}
						}

						var3 = anInt966 * -757138255;
						if (bufpos * 1692815575 >= anInt966 * -757138255) {
							var4 = bufpos * 1692815575 - anInt966 * -757138255;
						} else {
							var4 = 5000 - anInt966 * -757138255;
						}
					}

					if (var4 <= 0) {
						continue;
					}

					try {
						output.write(buffer, var3, var4);
					} catch (IOException var8) {
						aBool968 = true;
					}

					anInt966 = (anInt966 * -757138255 + var4) % 5000 * 950389841;

					try {
						if (anInt966 * -757138255 == bufpos * 1692815575) {
							output.flush();
						}
					} catch (IOException var7) {
						aBool968 = true;
					}
					continue;
				}

				try {
					if (input != null) {
						input.close();
					}

					if (output != null) {
						output.close();
					}

					if (socket != null) {
						socket.close();
					}
				} catch (IOException var6) {
					;
				}

				buffer = null;
				break;
			}
		} catch (Exception var11) {
			Class72.method964((String) null, var11, (byte) 1);
		}

	}

	public int read() throws IOException {
		return dummy ? 0 : input.read();
	}

	public Connection(Socket var1, Class73 var2) throws IOException {
		aClass73_970 = var2;
		socket = var1;
		socket.setSoTimeout(30000);
		socket.setTcpNoDelay(true);
		input = socket.getInputStream();
		output = socket.getOutputStream();
	}

	protected void finalize() {
		terminate();
	}

	public void terminate() {
		if (!dummy) {
			synchronized (this) {
				dummy = true;
				notifyAll();
			}

			if (aAsyncJob_963 != null) {
				while (aAsyncJob_963.stage == 0) {
					Class24.method357(1L);
				}

				if (aAsyncJob_963.stage == 1) {
					try {
						((Thread) aAsyncJob_963.result).join();
					} catch (InterruptedException var4) {
						;
					}
				}
			}

			aAsyncJob_963 = null;
		}
	}

	static boolean method1061(InterfaceDef var0, byte var1) {
		if (GameClient.enableQAInterfaceDebug) {
			if (LinkedEntry_Sub5_Sub3.getInterfaceSettingFor(var0) != 0) {
				return false;
			}

			if (var0.contenttype * -1878336627 == 0) {
				return false;
			}
		}

		return var0.aBool1982;
	}

}
