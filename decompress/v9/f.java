// 
// Decompiled by Procyon v0.6.0
// 

package v9;

import pj2.u;
import android.os.Environment;
import android.content.Context;
import java.net.URISyntaxException;
import java.net.URI;
import java.util.concurrent.TimeoutException;
import ag0.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import android.net.Uri;
import java.util.concurrent.Callable;
import w9.d$a;
import w9.d;
import java.io.File;
import w9.e;
import java.util.Iterator;
import java.net.SocketException;
import com.danikula.videocache.ProxyCacheException;
import java.net.Socket;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.net.ProxySelector;
import java.net.InetAddress;
import java.util.concurrent.Executors;
import java.net.ServerSocket;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import au2.b;

public final class f
{
    public static final au2.b h;
    public final Object a;
    public final ExecutorService b;
    public final ConcurrentHashMap c;
    public final ServerSocket d;
    public final int e;
    public final v9.c f;
    public final j g;
    
    static {
        h = au2.c.b("HttpProxyCacheServer");
    }
    
    public f(v9.c ex) {
        this.a = new Object();
        this.b = Executors.newFixedThreadPool(8);
        this.c = new ConcurrentHashMap();
        this.f = (v9.c)ex;
        try {
            ex = (InterruptedException)InetAddress.getByName("127.0.0.1");
            final ServerSocket d = new ServerSocket(0, 8, (InetAddress)ex);
            this.d = d;
            final int localPort = d.getLocalPort();
            this.e = localPort;
            ex = (InterruptedException)i.d;
            ex = (InterruptedException)ProxySelector.getDefault();
            ProxySelector.setDefault(new i((ProxySelector)ex, localPort));
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            ex = (InterruptedException)new Thread(new c(countDownLatch));
            ((Thread)ex).start();
            countDownLatch.await();
            ex = (InterruptedException)new j(localPort);
            this.g = (j)ex;
            ex = (InterruptedException)v9.f.h;
            final StringBuilder sb = new StringBuilder();
            sb.append("Proxy cache server started. Is it alive? ");
            sb.append(this.d());
            ((au2.b)ex).info(sb.toString());
            return;
        }
        catch (final InterruptedException ex) {}
        catch (final IOException ex2) {}
        this.b.shutdown();
        throw new IllegalStateException("Error starting local proxy server", ex);
    }
    
    public static void e(final Socket socket) {
        try {
            if (!socket.isInputShutdown()) {
                socket.shutdownInput();
            }
        }
        catch (final IOException ex) {
            f.h.error("HttpProxyCacheServer error", (Throwable)new ProxyCacheException("Error closing socket input stream", (Throwable)ex));
        }
        catch (final SocketException ex2) {
            f.h.debug("Releasing input stream\u2026 Socket is closed by client.");
        }
        try {
            if (!socket.isOutputShutdown()) {
                socket.shutdownOutput();
            }
        }
        catch (final IOException ex3) {
            f.h.warn("Failed to close socket on proxy side: {}. It seems client have already closed connection.", (Object)ex3.getMessage());
        }
        try {
            if (!socket.isClosed()) {
                socket.close();
            }
        }
        catch (final IOException ex4) {
            f.h.error("HttpProxyCacheServer error", (Throwable)new ProxyCacheException("Error closing socket", (Throwable)ex4));
        }
    }
    
    public final g a(final String s) throws ProxyCacheException {
        synchronized (this.a) {
            g g;
            if ((g = this.c.get(s)) == null) {
                g = new g(s, this.f);
                this.c.put(s, g);
            }
            return g;
        }
    }
    
    public final int b() {
        synchronized (this.a) {
            final Iterator iterator = this.c.values().iterator();
            int n = 0;
            while (iterator.hasNext()) {
                n += ((g)iterator.next()).a.get();
            }
            return n;
        }
    }
    
    public final String c(String encode, final boolean b) {
        if (b) {
            if (encode == null) {
                throw new NullPointerException("Url can't be null!");
            }
            final v9.c f = this.f;
            final File a = f.a;
            f.b.getClass();
            if (new File(a, w9.e.c(encode)).exists()) {
                final v9.c f2 = this.f;
                final File a2 = f2.a;
                f2.b.getClass();
                encode = (String)new File(a2, w9.e.c(encode));
                try {
                    final d d = (d)this.f.c;
                    d.a.submit((Callable<Object>)new d$a(d, (File)encode));
                }
                catch (final IOException ex) {
                    final au2.b h = v9.f.h;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Error touching file ");
                    sb.append((Object)encode);
                    h.error(sb.toString(), (Throwable)ex);
                }
                return Uri.fromFile((File)encode).toString();
            }
        }
        String format = encode;
        if (this.d()) {
            final Locale us = Locale.US;
            final int e = this.e;
            final au2.b a3 = l.a;
            try {
                encode = URLEncoder.encode(encode, "utf-8");
                format = String.format(us, "http://%s:%d/%s", "127.0.0.1", e, encode);
            }
            catch (final UnsupportedEncodingException ex2) {
                throw new RuntimeException("Error encoding url", ex2);
            }
        }
        return format;
    }
    
    public final boolean d() {
        final j g = this.g;
        g.getClass();
        boolean b = false;
        int n;
        int i;
        for (n = 70, i = 0; i < 3; ++i, n *= 2) {
            try {
                final ExecutorService a = g.a;
                final j.a a2 = g.new a();
                if (a.submit((Callable<Boolean>)a2).get(n, TimeUnit.MILLISECONDS)) {
                    b = true;
                    return b;
                }
            }
            catch (final ExecutionException a2) {
                goto Label_0085;
            }
            catch (final InterruptedException ex) {}
            catch (final TimeoutException a2) {
                j.d.warn(ag0.a.n("Error pinging server (attempt: ", i, ", timeout: ", n, "). "));
            }
        }
        final Locale us = Locale.US;
        final int n2 = n / 2;
        try {
            final String format = String.format(us, "Error pinging server (attempts: %d, max timeout: %d). If you see this message, please, report at https://github.com/danikula/AndroidVideoCache/issues/134. Default proxies are: %s", i, n2, ProxySelector.getDefault().select(new URI(g.a())));
            j.d.error(format, (Throwable)new ProxyCacheException(format));
            return b;
        }
        catch (final URISyntaxException ex2) {
            throw new IllegalStateException(ex2);
        }
    }
    
    public static final class a
    {
        public File a;
        public e b;
        public y9.a c;
        public x9.a d;
        
        public a(final Context context) {
            this.c = new y9.a(context);
            final au2.b a = o.a;
            String externalStorageState;
            try {
                externalStorageState = Environment.getExternalStorageState();
            }
            catch (final NullPointerException ex) {
                externalStorageState = "";
            }
            File file2;
            final File file = file2 = null;
            if ("mounted".equals(externalStorageState)) {
                file2 = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "cache");
                if (!file2.exists() && !file2.mkdirs()) {
                    o.a.warn("Unable to create external cache directory");
                    file2 = file;
                }
            }
            File cacheDir;
            if ((cacheDir = file2) == null) {
                cacheDir = context.getCacheDir();
            }
            File file3;
            if ((file3 = cacheDir) == null) {
                final StringBuilder k = a.k("/data/data/");
                k.append(context.getPackageName());
                k.append("/cache/");
                final String string = k.toString();
                final au2.b a2 = o.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("Can't define system cache directory! '");
                sb.append(string);
                sb.append("%s' will be used.");
                a2.warn(sb.toString());
                file3 = new File(string);
            }
            this.a = new File(file3, "video-cache");
            new w9.g();
            this.b = new e();
            this.d = (x9.a)new u();
        }
    }
    
    public final class b implements Runnable
    {
        public final Socket f;
        
        public b(final Socket f) {
            this.f = f;
        }
        
        @Override
        public final void run() {
            final f g = v9.f.this;
            Object f = this.f;
            g.getClass();
            au2.b h2 = null;
            StringBuilder sb2 = null;
            try {
                try {
                    final v9.d a = v9.d.a(((Socket)f).getInputStream());
                    final au2.b h = v9.f.h;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Request to cache proxy:");
                    sb.append(a);
                    h.debug(sb.toString());
                    final String a2 = l.a(a.a);
                    g.g.getClass();
                    if ("ping".equals(a2)) {
                        g.g.getClass();
                        j.b((Socket)f);
                    }
                    else {
                        g.a(a2).b(a, (Socket)f);
                    }
                    v9.f.e((Socket)f);
                    f = new StringBuilder();
                    ((StringBuilder)f).append("Opened connections: ");
                    ((StringBuilder)f).append(g.b());
                    h.debug(((StringBuilder)f).toString());
                }
                finally {}
            }
            catch (final IOException t) {
                goto Label_0172;
            }
            catch (final ProxyCacheException ex) {}
            catch (final SocketException ex2) {
                h2 = v9.f.h;
                h2.debug("Closing socket\u2026 Socket is closed by client.");
                v9.f.e((Socket)f);
                sb2 = new StringBuilder();
            }
            sb2.append("Opened connections: ");
            sb2.append(g.b());
            h2.debug(sb2.toString());
            return;
            v9.f.e((Socket)f);
            final au2.b h3 = v9.f.h;
            final StringBuilder k = a.k("Opened connections: ");
            k.append(g.b());
            h3.debug(k.toString());
        }
    }
    
    public final class c implements Runnable
    {
        public final CountDownLatch f;
        
        public c(final CountDownLatch f) {
            this.f = f;
        }
        
        @Override
        public final void run() {
            this.f.countDown();
            final f g = v9.f.this;
            g.getClass();
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    final Socket accept = g.d.accept();
                    final au2.b h = v9.f.h;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Accept new socket ");
                    sb.append(accept);
                    h.debug(sb.toString());
                    g.b.submit(g.new b(accept));
                }
            }
            catch (final IOException ex) {
                v9.f.h.error("HttpProxyCacheServer error", (Throwable)new ProxyCacheException("Error during waiting connection", (Throwable)ex));
            }
        }
    }
}
