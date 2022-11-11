// 
// Decompiled by Procyon v0.6.0
// 

package a8;

import okhttp3.Response;
import java.lang.ref.WeakReference;
import okhttp3.Request$Builder;
import okhttp3.OkHttpClient;
import x7.f;
import okhttp3.WebSocketListener;
import sg2.e;
import x7.a$g;
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
    
    public h(final Request a, final WebSocket$Factory b, final a$g c, final d d) {
        sg2.e.g((Object)a, "webSocketRequest");
        sg2.e.g((Object)b, "webSocketConnectionFactory");
        sg2.e.g((Object)d, "serializer");
        this.a = a;
        this.b = b;
        this.c = (g.a)c;
        this.d = d;
        this.e = new AtomicReference<WebSocket>();
        this.f = new AtomicReference<b>();
    }
    
    @Override
    public final void a() {
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
    public final void b(final c.d d) {
        final WebSocket webSocket = this.e.getAndSet(null);
        if (webSocket != null) {
            final jk2.c c = new jk2.c();
            this.d.a(d, c);
            webSocket.close(1001, c.E());
        }
        this.d();
    }
    
    @Override
    public final void c(final c c) {
        final WebSocket webSocket = this.e.get();
        if (webSocket == null) {
            final g.a c2 = this.c;
            final IllegalStateException ex = new IllegalStateException("Send attempted on closed connection");
            final a$g a$g = (a$g)c2;
            a$g.b.execute(new f(a$g, ex));
            return;
        }
        final jk2.c c3 = new jk2.c();
        this.d.a(c, c3);
        webSocket.send(c3.E());
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
            final a8.a a2 = a8.a.a;
            e.g((Object)a, "webSocketConnectionFactory");
            this.a = (WebSocket$Factory)a;
            this.b = a2;
            final Request build = new Request$Builder().url(s).addHeader("Sec-WebSocket-Protocol", "graphql-ws").addHeader("Cookie", "").build();
            e.b((Object)build, "Builder()\n        .url(w\u2026ie\", \"\")\n        .build()");
            this.c = build;
        }
        
        @Override
        public final h a(final a$g a$g) {
            return new h(this.c, this.a, a$g, this.b);
        }
    }
    
    public static final class b extends WebSocketListener
    {
        public final WeakReference<h> a;
        
        public b(final h h) {
            e.g((Object)h, "delegate");
            this.a = new WeakReference<h>(h);
        }
        
        public final void onClosed(WebSocket webSocket, final int n, final String s) {
            sg2.e.g((Object)webSocket, "webSocket");
            sg2.e.g((Object)s, "reason");
            webSocket = (WebSocket)this.a.get();
            if (webSocket == null) {
                return;
            }
            try {
                final a$g a$g = (a$g)((h)webSocket).c;
                a$g.b.execute(new x7.h(a$g));
            }
            finally {
                ((h)webSocket).d();
            }
        }
        
        public final void onClosing(WebSocket webSocket, final int n, final String s) {
            sg2.e.g((Object)webSocket, "webSocket");
            sg2.e.g((Object)s, "reason");
            webSocket = (WebSocket)this.a.get();
            if (webSocket == null) {
                return;
            }
            try {
                final a$g a$g = (a$g)((h)webSocket).c;
                a$g.b.execute(new x7.h(a$g));
            }
            finally {
                ((h)webSocket).d();
            }
        }
        
        public final void onFailure(WebSocket webSocket, final Throwable t, final Response response) {
            sg2.e.g((Object)webSocket, "webSocket");
            sg2.e.g((Object)t, "t");
            webSocket = (WebSocket)this.a.get();
            if (webSocket == null) {
                return;
            }
            try {
                final a$g a$g = (a$g)((h)webSocket).c;
                a$g.b.execute(new f(a$g, t));
            }
            finally {
                ((h)webSocket).d();
            }
        }
        
        public final void onMessage(final WebSocket webSocket, final String s) {
            sg2.e.g((Object)webSocket, "webSocket");
            sg2.e.g((Object)s, "text");
            final h h = this.a.get();
            if (h == null) {
                return;
            }
            final d d = h.d;
            final jk2.c c = new jk2.c();
            c.Y(s);
            final a8.e b = d.b(c);
            final a$g a$g = (a$g)h.c;
            a$g.b.execute(new x7.g(a$g, b));
        }
        
        public final void onOpen(final WebSocket webSocket, final Response response) {
            sg2.e.g((Object)webSocket, "webSocket");
            sg2.e.g((Object)response, "response");
            final h h = this.a.get();
            if (h != null) {
                final a$g a$g = (a$g)h.c;
                a$g.b.execute(new x7.e(a$g));
            }
        }
    }
}
