// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import a81.e;
import java.util.Collections;
import java.util.HashMap;
import ad.d0;
import va.w;
import java.util.Map;
import android.net.Uri;

public final class b
{
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map<String, String> e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;
    public final Object j;
    
    static {
        w.a("goog.exo.datasource");
    }
    
    public b(final Uri uri) {
        this(uri, 0L, -1L);
    }
    
    public b(final Uri a, final long b, final int c, byte[] d, final Map<String, String> map, final long f, final long g, final String h, final int i, final Object j) {
        final boolean b2 = true;
        d0.c(b + f >= 0L);
        d0.c(f >= 0L);
        boolean b3 = b2;
        if (g <= 0L) {
            b3 = (g == -1L && b2);
        }
        d0.c(b3);
        this.a = a;
        this.b = b;
        this.c = c;
        if (d == null || d.length == 0) {
            d = null;
        }
        this.d = d;
        this.e = Collections.unmodifiableMap((Map<? extends String, ? extends String>)new HashMap<String, String>(map));
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public b(final Uri uri, final long n, final long n2) {
        this(uri, 0L, 1, null, Collections.emptyMap(), n, n2, null, 0, null);
    }
    
    public final b a(final long n) {
        final long g = this.g;
        long n2 = -1L;
        if (g != -1L) {
            n2 = g - n;
        }
        return this.b(n, n2);
    }
    
    public final b b(final long n, final long n2) {
        if (n == 0L && this.g == n2) {
            return this;
        }
        return new b(this.a, this.b, this.c, this.d, this.e, this.f + n, n2, this.h, this.i, this.j);
    }
    
    @Override
    public final String toString() {
        final int c = this.c;
        String s;
        if (c != 1) {
            if (c != 2) {
                if (c != 3) {
                    throw new IllegalStateException();
                }
                s = "HEAD";
            }
            else {
                s = "POST";
            }
        }
        else {
            s = "GET";
        }
        final String value = String.valueOf(this.a);
        final long f = this.f;
        final long g = this.g;
        final String h = this.h;
        final int i = this.i;
        final StringBuilder k = aw.b.k(a81.e.h(h, value.length() + (s.length() + 70)), "DataSpec[", s, " ", value);
        k.append(", ");
        k.append(f);
        k.append(", ");
        k.append(g);
        k.append(", ");
        k.append(h);
        k.append(", ");
        k.append(i);
        k.append("]");
        return k.toString();
    }
    
    public static final class a
    {
        public Uri a;
        public long b;
        public int c;
        public byte[] d;
        public Map<String, String> e;
        public long f;
        public long g;
        public String h;
        public int i;
        public Object j;
        
        public a() {
            this.c = 1;
            this.e = Collections.emptyMap();
            this.g = -1L;
        }
        
        public a(final b b) {
            this.a = b.a;
            this.b = b.b;
            this.c = b.c;
            this.d = b.d;
            this.e = b.e;
            this.f = b.f;
            this.g = b.g;
            this.h = b.h;
            this.i = b.i;
            this.j = b.j;
        }
        
        public final b a() {
            if (this.a != null) {
                return new b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
            }
            throw new IllegalStateException("The uri must be set.");
        }
    }
}
