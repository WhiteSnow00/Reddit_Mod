// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.rtsp;

import com.google.common.collect.ImmutableMultimap;
import java.util.AbstractCollection;
import com.google.common.collect.ImmutableCollection$a;
import com.google.common.collect.x;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.n0;
import java.util.regex.Pattern;
import com.google.common.collect.ImmutableList$a;
import com.google.common.collect.ImmutableListMultimap;
import lg.e0;
import java.util.HashMap;
import java.util.Iterator;
import com.google.android.exoplayer2.ParserException;
import android.os.Handler$Callback;
import android.os.Handler;
import ad.c0;
import jc.k;
import java.net.Socket;
import ad.d0;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import android.util.Log;
import rg.e;
import java.util.List;
import java.io.IOException;
import android.net.Uri;
import jc.j;
import android.util.SparseArray;
import java.util.ArrayDeque;
import javax.net.SocketFactory;
import java.io.Closeable;

public final class d implements Closeable
{
    public final e f;
    public final d g;
    public final String h;
    public final SocketFactory i;
    public final boolean j;
    public final ArrayDeque<f.c> k;
    public final SparseArray<j> l;
    public final c m;
    public Uri n;
    public g o;
    public h.a p;
    public String q;
    public a r;
    public com.google.android.exoplayer2.source.rtsp.c s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public long x;
    
    public d(final f$a f, final f$a g, final String h, final Uri uri, final SocketFactory i, final boolean j) {
        this.f = (e)f;
        this.g = (d)g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = new ArrayDeque<f.c>();
        this.l = (SparseArray<j>)new SparseArray();
        this.m = new c();
        this.n = com.google.android.exoplayer2.source.rtsp.h.d(uri);
        this.o = new g(new d$b(this));
        this.p = com.google.android.exoplayer2.source.rtsp.h.b(uri);
        this.x = -9223372036854775807L;
        this.t = -1;
    }
    
    public static void a(final d d, final RtspMediaSource.RtspPlaybackException q) {
        d.getClass();
        if (d.u) {
            ((f$a)d.g).f.q = q;
        }
        else {
            final e f = d.f;
            final String message = q.getMessage();
            final int a = rg.g.a;
            String s;
            if ((s = message) == null) {
                s = "";
            }
            ((f$a)f).a(s, (IOException)q);
        }
    }
    
    public static void b(final d d, final List list) {
        if (d.j) {
            Log.d("RtspClient", new rg.e("\n").b((Iterable)list));
        }
    }
    
    @Override
    public final void close() throws IOException {
        final a r = this.r;
        if (r != null) {
            r.close();
            this.r = null;
            final c m = this.m;
            final Uri n = this.n;
            final String q = this.q;
            q.getClass();
            final d c = m.c;
            final int t = c.t;
            if (t != -1) {
                if (t != 0) {
                    c.t = 0;
                    m.c(m.a(12, q, (Map<String, String>)ImmutableMap.of(), n));
                }
            }
        }
        this.o.close();
    }
    
    public final void h() {
        final f.c c = this.k.pollFirst();
        if (c == null) {
            ((f$a)this.g).f.i.p(0L);
            return;
        }
        final c m = this.m;
        final Uri b = c.b.b.b;
        d0.g(c.c);
        final String c2 = c.c;
        final String q = this.q;
        m.c.t = 0;
        m.c(m.a(10, q, (Map<String, String>)ImmutableMap.of((Object)"Transport", (Object)c2), b));
    }
    
    public final Socket j(final Uri uri) throws IOException {
        d0.c(uri.getHost() != null);
        int port;
        if (uri.getPort() > 0) {
            port = uri.getPort();
        }
        else {
            port = 554;
        }
        final SocketFactory i = this.i;
        final String host = uri.getHost();
        host.getClass();
        return i.createSocket(host, port);
    }
    
    public final void n(final long x) {
        if (this.t == 2 && !this.w) {
            final c m = this.m;
            final Uri n = this.n;
            final String q = this.q;
            q.getClass();
            d0.f(m.c.t == 2);
            m.c(m.a(5, q, (Map<String, String>)ImmutableMap.of(), n));
            m.c.w = true;
        }
        this.x = x;
    }
    
    public final void p(final long n) {
        final c m = this.m;
        final Uri n2 = this.n;
        final String q = this.q;
        q.getClass();
        final int t = m.c.t;
        d0.f(t == 1 || t == 2);
        final k c = jc.k.c;
        m.c(m.a(6, q, (Map<String, String>)ImmutableMap.of((Object)"Range", (Object)c0.n("npt=%.3f-", n / 1000.0)), n2));
    }
    
    public final class a implements Runnable, Closeable
    {
        public final Handler f;
        public boolean g;
        
        public a() {
            this.f = c0.l(null);
        }
        
        @Override
        public final void close() {
            this.g = false;
            this.f.removeCallbacks((Runnable)this);
        }
        
        @Override
        public final void run() {
            final d h = d.this;
            final c m = h.m;
            final Uri n = h.n;
            final String q = h.q;
            m.getClass();
            m.c(m.a(4, q, (Map<String, String>)ImmutableMap.of(), n));
            this.f.postDelayed((Runnable)this, 30000L);
        }
    }
    
    public final class c
    {
        public int a;
        public j b;
        public final /* synthetic */ d c;
        
        public final j a(final int n, String s, final Map<String, String> map, final Uri uri) {
            s = (String)new com.google.android.exoplayer2.source.rtsp.e.a(d.this.h, s, this.a++);
            final d c = d.this;
            if (c.s != null) {
                d0.g(c.p);
                try {
                    final d c2 = d.this;
                    ((com.google.android.exoplayer2.source.rtsp.e.a)s).a("Authorization", c2.s.a(c2.p, uri, n));
                }
                catch (final ParserException ex) {
                    d.a(d.this, new RtspMediaSource.RtspPlaybackException(ex));
                }
            }
            for (final Map.Entry entry : map.entrySet()) {
                ((com.google.android.exoplayer2.source.rtsp.e.a)s).a((String)entry.getKey(), (String)entry.getValue());
            }
            return new j(uri, n, new com.google.android.exoplayer2.source.rtsp.e((com.google.android.exoplayer2.source.rtsp.e.a)s), "");
        }
        
        public final void b() {
            d0.g(this.b);
            final ImmutableListMultimap<String, String> a = this.b.c.a;
            final HashMap hashMap = new HashMap();
            for (final String s : ((x)a).keySet()) {
                if (!s.equals("CSeq") && !s.equals("User-Agent") && !s.equals("Session")) {
                    if (s.equals("Authorization")) {
                        continue;
                    }
                    hashMap.put(s, e0.Q((Iterable)((x)a).get((Object)s)));
                }
            }
            final j b = this.b;
            this.c(this.a(b.b, d.this.q, hashMap, b.a));
        }
        
        public final void c(final j b) {
            final String b2 = b.c.b("CSeq");
            b2.getClass();
            final int int1 = Integer.parseInt(b2);
            d0.f(d.this.l.get(int1) == null);
            d.this.l.append(int1, (Object)b);
            final Pattern a = com.google.android.exoplayer2.source.rtsp.h.a;
            d0.c(b.c.b("CSeq") != null);
            final ImmutableList$a immutableList$a = new ImmutableList$a();
            ((ImmutableCollection$a)immutableList$a).c((Object)c0.n("%s %s %s", com.google.android.exoplayer2.source.rtsp.h.e(b.b), b.a, "RTSP/1.0"));
            final ImmutableListMultimap<String, String> a2 = b.c.a;
            for (final String s : ((ImmutableMultimap)a2).keySet()) {
                final ImmutableList value = a2.get((Object)s);
                for (int i = 0; i < ((AbstractCollection)value).size(); ++i) {
                    ((ImmutableCollection$a)immutableList$a).c((Object)c0.n("%s: %s", s, ((List<Object>)value).get(i)));
                }
            }
            ((ImmutableCollection$a)immutableList$a).c((Object)"");
            ((ImmutableCollection$a)immutableList$a).c((Object)b.d);
            final ImmutableList f = immutableList$a.f();
            d.b(d.this, (List)f);
            d.this.o.b(f);
            this.b = b;
        }
    }
    
    public interface d
    {
    }
    
    public interface e
    {
    }
}
