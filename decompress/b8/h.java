// 
// Decompiled by Procyon v0.6.0
// 

package b8;

import okhttp3.Response;
import java.lang.ref.WeakReference;
import okhttp3.Request$Builder;
import okhttp3.OkHttpClient;
import okhttp3.WebSocketListener;
import ah2.f;
import y7.a;
import okhttp3.WebSocket;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.WebSocket$Factory;
import okhttp3.Request;

public final class h implements g
{
    public final Request a;
    public final WebSocket$Factory b;
    public final g.a c;
    public final d d;
    public final AtomicReference<WebSocket> e;
    public final AtomicReference<b> f;
    
    public h(final Request a, final WebSocket$Factory b, final y7.a.g c, final d d) {
        ah2.f.g((Object)a, "webSocketRequest");
        ah2.f.g((Object)b, "webSocketConnectionFactory");
        ah2.f.g((Object)d, "serializer");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new AtomicReference<WebSocket>();
        this.f = new AtomicReference<b>();
    }
    
    @Override
    public final void a(final c c) {
        final WebSocket webSocket = this.e.get();
        if (webSocket == null) {
            final g.a c2 = this.c;
            final IllegalStateException ex = new IllegalStateException("Send attempted on closed connection");
            final y7.a.g g = (y7.a.g)c2;
            g.b.execute((Runnable)new y7.f(g, (Throwable)ex));
            return;
        }
        final rk2.c c3 = new rk2.c();
        this.d.a(c, c3);
        webSocket.send(c3.F());
    }
    
    @Override
    public final void b() {
        final b b = new b(this);
        final AtomicReference<b> f = this.f;
        while (true) {
            while (!f.compareAndSet(null, b)) {
                if (f.get() != null) {
                    final boolean b2 = false;
                    if (b2) {
                        this.e.set(this.b.newWebSocket(this.a, (WebSocketListener)b));
                        return;
                    }
                    throw new IllegalStateException("Already connected".toString());
                }
            }
            final boolean b2 = true;
            continue;
        }
    }
    
    @Override
    public final void c(final c.d d) {
        final WebSocket webSocket = this.e.getAndSet(null);
        if (webSocket != null) {
            final rk2.c c = new rk2.c();
            this.d.a((c)d, c);
            webSocket.close(1001, c.F());
        }
        this.d();
    }
    
    public final void d() {
        final b b = this.f.getAndSet(null);
        if (b != null) {
            b.a.clear();
        }
        this.e.set(null);
    }
    
    public static final class a implements g.b
    {
        public final WebSocket$Factory a;
        public final d b;
        public final Request c;
        
        public a(final String s, final OkHttpClient a) {
            final b8.a a2 = b8.a.a;
            f.g((Object)a, "webSocketConnectionFactory");
            this.a = (WebSocket$Factory)a;
            this.b = (d)a2;
            final Request build = new Request$Builder().url(s).addHeader("Sec-WebSocket-Protocol", "graphql-ws").addHeader("Cookie", "").build();
            f.b((Object)build, "Builder()\n        .url(w\u2026ie\", \"\")\n        .build()");
            this.c = build;
        }
        
        @Override
        public final h a(final y7.a.g g) {
            return new h(this.c, this.a, g, this.b);
        }
    }
    
    public static final class b extends WebSocketListener
    {
        public final WeakReference<h> a;
        
        public b(final h h) {
            f.g((Object)h, "delegate");
            this.a = new WeakReference<h>(h);
        }
        
        public final void onClosed(WebSocket webSocket, final int n, final String s) {
            ah2.f.g((Object)webSocket, "webSocket");
            ah2.f.g((Object)s, "reason");
            webSocket = (WebSocket)this.a.get();
            if (webSocket == null) {
                return;
            }
            try {
                final y7.a.g g = (y7.a.g)((h)webSocket).c;
                g.b.execute((Runnable)new y7.h(g));
            }
            finally {
                ((h)webSocket).d();
            }
        }
        
        public final void onClosing(WebSocket webSocket, final int n, final String s) {
            ah2.f.g((Object)webSocket, "webSocket");
            ah2.f.g((Object)s, "reason");
            webSocket = (WebSocket)this.a.get();
            if (webSocket == null) {
                return;
            }
            try {
                final y7.a.g g = (y7.a.g)((h)webSocket).c;
                g.b.execute((Runnable)new y7.h(g));
            }
            finally {
                ((h)webSocket).d();
            }
        }
        
        public final void onFailure(WebSocket webSocket, final Throwable t, final Response response) {
            ah2.f.g((Object)webSocket, "webSocket");
            ah2.f.g((Object)t, "t");
            webSocket = (WebSocket)this.a.get();
            if (webSocket == null) {
                return;
            }
            try {
                final y7.a.g g = (y7.a.g)((h)webSocket).c;
                g.b.execute((Runnable)new y7.f(g, t));
            }
            finally {
                ((h)webSocket).d();
            }
        }
        
        public final void onMessage(final WebSocket webSocket, final String s) {
            ah2.f.g((Object)webSocket, "webSocket");
            ah2.f.g((Object)s, "text");
            final h h = this.a.get();
            if (h == null) {
                return;
            }
            final d d = h.d;
            final rk2.c c = new rk2.c();
            c.d0(s);
            final e b = d.b(c);
            final y7.a.g g = (y7.a.g)h.c;
            g.b.execute((Runnable)new y7.g(g, b));
        }
        
        public final void onOpen(final WebSocket webSocket, final Response response) {
            ah2.f.g((Object)webSocket, "webSocket");
            ah2.f.g((Object)response, "response");
            final h h = this.a.get();
            if (h != null) {
                final y7.a.g g = (y7.a.g)h.c;
                g.b.execute((Runnable)new y7.e(g));
            }
        }
    }
}
