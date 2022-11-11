// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.io.Closeable;
import ad.c0;
import ac.h;
import android.net.Uri;
import yc.q;

public final class i<T> implements d
{
    public final long a;
    public final com.google.android.exoplayer2.upstream.b b;
    public final int c;
    public final q d;
    public final a<? extends T> e;
    public volatile T f;
    
    public i(final int n, final Uri a, final com.google.android.exoplayer2.upstream.a a2, final a a3) {
        final com.google.android.exoplayer2.upstream.b.a a4 = new com.google.android.exoplayer2.upstream.b.a();
        a4.a = a;
        a4.i = 1;
        this(n, a2, a4.a(), a3);
    }
    
    public i(final int c, final com.google.android.exoplayer2.upstream.a a, final com.google.android.exoplayer2.upstream.b b, final a e) {
        this.d = new q(a);
        this.b = b;
        this.c = c;
        this.e = e;
        this.a = h.d.getAndIncrement();
    }
    
    @Override
    public final void a() {
    }
    
    @Override
    public final void load() throws IOException {
        this.d.b = 0L;
        final yc.i i = new yc.i((com.google.android.exoplayer2.upstream.a)this.d, this.b);
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
    
    public interface a<T>
    {
        Object a(final Uri p0, final yc.i p1) throws IOException;
    }
}
