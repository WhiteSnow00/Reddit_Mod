// 
// Decompiled by Procyon v0.6.0
// 

package v9;

import com.danikula.videocache.ProxyCacheException;
import java.util.Arrays;
import x9.a;
import pj2.u;
import java.util.concurrent.Callable;
import java.util.Locale;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.Executors;
import au2.c;
import java.util.concurrent.ExecutorService;
import au2.b;

public final class j
{
    public static final b d;
    public final ExecutorService a;
    public final String b;
    public final int c;
    
    static {
        d = c.b("Pinger");
    }
    
    public j(final int c) {
        this.a = Executors.newSingleThreadExecutor();
        this.b = "127.0.0.1";
        this.c = c;
    }
    
    public static void b(final Socket socket) throws IOException {
        final OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
        outputStream.write("ping ok".getBytes());
    }
    
    public final String a() {
        return String.format(Locale.US, "http://%s:%d/%s", this.b, this.c, "ping");
    }
    
    public final class a implements Callable<Boolean>
    {
        @Override
        public final Object call() throws Exception {
            final h h = new h(j.this.a(), (y9.b)new u(), (x9.a)new u());
            boolean equals;
            try {
                try {
                    final byte[] bytes = "ping ok".getBytes();
                    h.a(0L);
                    final byte[] array = new byte[bytes.length];
                    h.read(array);
                    equals = Arrays.equals(bytes, array);
                    final b d = j.d;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Ping response: `");
                    sb.append(new String(array));
                    sb.append("`, pinged? ");
                    sb.append(equals);
                    d.info(sb.toString());
                }
                finally {}
            }
            catch (final ProxyCacheException ex) {
                j.d.error("Error reading ping response", (Throwable)ex);
                equals = false;
            }
            h.close();
            return equals;
            h.close();
        }
    }
}
