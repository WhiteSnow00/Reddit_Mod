// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.io.Closeable;
import bd.c0;
import bc.h;
import android.net.Uri;
import zc.r;

public final class i<T> implements Loader$d
{
    public final long a;
    public final b b;
    public final int c;
    public final r d;
    public final i.i$a<? extends T> e;
    public volatile T f;
    
    public i(final int n, final Uri a, final a a2, final i.i$a i$a) {
        final b$a b$a = new b$a();
        b$a.a = a;
        b$a.i = 1;
        this(n, a2, b$a.a(), i$a);
    }
    
    public i(final int c, final a a, final b b, final i.i$a e) {
        this.d = new r(a);
        this.b = b;
        this.c = c;
        this.e = (i.i$a<? extends T>)e;
        this.a = h.d.getAndIncrement();
    }
    
    public final void a() {
    }
    
    public final void load() throws IOException {
        this.d.b = 0L;
        final zc.i i = new zc.i((a)this.d, this.b);
        try {
            i.b();
            final Uri uri = this.d.getUri();
            uri.getClass();
            this.f = (T)this.e.a(uri, i);
        }
        finally {
            c0.g((Closeable)i);
        }
    }
}
