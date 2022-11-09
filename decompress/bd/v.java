// 
// Decompiled by Procyon v0.6.0
// 

package bd;

import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader$b;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import java.util.ConcurrentModificationException;
import com.google.android.exoplayer2.source.dash.DashMediaSource$a;
import com.google.android.exoplayer2.upstream.Loader$d;
import com.google.android.exoplayer2.upstream.Loader$a;
import a2.b;
import java.io.IOException;
import java.util.Arrays;
import android.os.SystemClock;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public final class v
{
    public static final Object a;
    public static final Object b;
    public static boolean c;
    public static long d;
    
    static {
        a = new Object();
        b = new Object();
    }
    
    public static long a() throws IOException {
        final Object b = v.b;
        synchronized (b) {
            monitorexit(b);
            final InetAddress byName = InetAddress.getByName("time.android.com");
            final DatagramSocket datagramSocket = new DatagramSocket();
            try {
                datagramSocket.setSoTimeout(10000);
                final byte[] array = new byte[48];
                final DatagramPacket datagramPacket = new DatagramPacket(array, 48, byName, 123);
                array[0] = 27;
                final long currentTimeMillis = System.currentTimeMillis();
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                if (currentTimeMillis == 0L) {
                    Arrays.fill(array, 40, 48, (byte)0);
                }
                else {
                    final long n = currentTimeMillis / 1000L;
                    final long n2 = n + 2208988800L;
                    array[40] = (byte)(n2 >> 24);
                    array[41] = (byte)(n2 >> 16);
                    array[42] = (byte)(n2 >> 8);
                    array[43] = (byte)(n2 >> 0);
                    final long n3 = (currentTimeMillis - n * 1000L) * 4294967296L / 1000L;
                    array[44] = (byte)(n3 >> 24);
                    array[45] = (byte)(n3 >> 16);
                    array[46] = (byte)(n3 >> 8);
                    array[47] = (byte)(Math.random() * 255.0);
                }
                datagramSocket.send(datagramPacket);
                datagramSocket.receive(new DatagramPacket(array, 48));
                final long elapsedRealtime2 = SystemClock.elapsedRealtime();
                final long n4 = elapsedRealtime2 - elapsedRealtime + currentTimeMillis;
                final byte b2 = array[0];
                final byte b3 = (byte)(b2 >> 6 & 0x3);
                final byte b4 = (byte)(b2 & 0x7);
                final byte b5 = array[1];
                final long d = d(24, array);
                final long d2 = d(32, array);
                final long d3 = d(40, array);
                b(b3, b4, b5 & 0xFF, d3);
                final long n5 = (d3 - n4 + (d2 - d)) / 2L;
                datagramSocket.close();
                return n4 + n5 - elapsedRealtime2;
            }
            finally {
                try {
                    datagramSocket.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)b).addSuppressed(t);
                }
            }
        }
    }
    
    public static void b(final byte b, final byte b2, final int n, final long n2) throws IOException {
        if (b == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b2 != 4 && b2 != 5) {
            throw new IOException(b.f(26, "SNTP: Untrusted mode: ", (int)b2));
        }
        if (n == 0 || n > 15) {
            throw new IOException(b.f(36, "SNTP: Untrusted stratum: ", n));
        }
        if (n2 != 0L) {
            return;
        }
        throw new IOException("SNTP: Zero transmitTime");
    }
    
    public static long c(int n, final byte[] array) {
        final int n2 = array[n];
        final byte b = array[n + 1];
        final byte b2 = array[n + 2];
        final byte b3 = array[n + 3];
        n = n2;
        if ((n2 & 0x80) == 0x80) {
            n = (n2 & 0x7F) + 128;
        }
        int n3 = b;
        if ((b & 0x80) == 0x80) {
            n3 = (b & 0x7F) + 128;
        }
        int n4 = b2;
        if ((b2 & 0x80) == 0x80) {
            n4 = (b2 & 0x7F) + 128;
        }
        int n5 = b3;
        if ((b3 & 0x80) == 0x80) {
            n5 = (b3 & 0x7F) + 128;
        }
        return ((long)n << 24) + ((long)n3 << 16) + ((long)n4 << 8) + n5;
    }
    
    public static long d(final int n, final byte[] array) {
        final long c = c(n, array);
        final long c2 = c(n + 4, array);
        if (c == 0L && c2 == 0L) {
            return 0L;
        }
        return c2 * 1000L / 4294967296L + (c - 2208988800L) * 1000L;
    }
    
    public interface a
    {
    }
    
    public static final class b implements Loader$a<Loader$d>
    {
        public final a f;
        
        public b(final DashMediaSource$a f) {
            this.f = (a)f;
        }
        
        public final void n(final Loader$d loader$d, final long n, final long n2, final boolean b) {
        }
        
        public final void p(Loader$d b, long d, final long n) {
            if (this.f != null) {
                b = (Loader$d)v.b;
                synchronized (b) {
                    final boolean c = v.c;
                    monitorexit(b);
                    if (!c) {
                        final a f = this.f;
                        b = (Loader$d)new IOException(new ConcurrentModificationException());
                        final DashMediaSource a = ((DashMediaSource$a)f).a;
                        a.getClass();
                        wi.b.C("DashMediaSource", "Failed to resolve time offset.", (Throwable)b);
                        a.y(true);
                    }
                    else {
                        final DashMediaSource a2 = ((DashMediaSource$a)this.f).a;
                        synchronized (b) {
                            if (v.c) {
                                d = v.d;
                            }
                            else {
                                d = -9223372036854775807L;
                            }
                            monitorexit(b);
                            a2.Q = d;
                            a2.y(true);
                        }
                    }
                }
            }
        }
        
        public final Loader$b r(final Loader$d loader$d, final long n, final long n2, final IOException ex, final int n3) {
            final a f = this.f;
            if (f != null) {
                final DashMediaSource a = ((DashMediaSource$a)f).a;
                a.getClass();
                wi.b.C("DashMediaSource", "Failed to resolve time offset.", (Throwable)ex);
                a.y(true);
            }
            return Loader.e;
        }
    }
    
    public static final class c implements Loader$d
    {
        public final void a() {
        }
        
        public final void load() throws IOException {
            synchronized (v.a) {
                final Object b = v.b;
                monitorenter(b);
                try {
                    if (v.c) {
                        monitorexit(b);
                        return;
                    }
                    monitorexit(b);
                    final long a = v.a();
                    monitorenter(b);
                    while (true) {
                        try {
                            v.d = a;
                            v.c = true;
                            monitorexit(b);
                            return;
                            monitorexit(b);
                            throw;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                    monitorexit(b);
                    throw;
                }
                finally {}
            }
        }
    }
}
