// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.engine;

import q8.o;
import java.util.Collections;
import android.util.Log;
import o8.a;
import android.os.SystemClock;
import k9.f;
import com.bumptech.glide.load.DataSource;
import u8.n$a;

public final class i implements c, a
{
    public final d<?> f;
    public final a g;
    public int h;
    public b i;
    public Object j;
    public volatile n$a<?> k;
    public q8.c l;
    
    public i(final d<?> f, final a g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void a(final o8.d d, final Object o, final com.bumptech.glide.load.data.d<?> d2, final DataSource dataSource, final o8.d d3) {
        this.g.a(d, o, d2, this.k.c.c(), d);
    }
    
    @Override
    public final boolean b() {
        final Object j = this.j;
        if (j != null) {
            this.j = null;
            final int b = k9.f.b;
            final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                final o8.a<Object> d = this.f.d(j);
                final q8.d d2 = new q8.d((o8.a)d, j, this.f.i);
                final o8.d a = this.k.a;
                final d<?> f = this.f;
                this.l = new q8.c(a, f.n);
                ((e.c)f.h).a().b((o8.d)this.l, d2);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Finished encoding source to cache, key: ");
                    sb.append(this.l);
                    sb.append(", data: ");
                    sb.append(j);
                    sb.append(", encoder: ");
                    sb.append(d);
                    sb.append(", duration: ");
                    sb.append(k9.f.a(elapsedRealtimeNanos));
                    Log.v("SourceGenerator", sb.toString());
                }
                this.k.c.b();
                this.i = new b(Collections.singletonList(this.k.a), this.f, this);
            }
            finally {
                this.k.c.b();
            }
        }
        final b i = this.i;
        if (i != null && i.b()) {
            return true;
        }
        this.i = null;
        this.k = null;
        boolean b2;
        for (b2 = false; !b2 && this.h < this.f.b().size(); b2 = true) {
            this.k = (n$a<?>)this.f.b().get(this.h++);
            if (this.k != null && (this.f.p.c(this.k.c.c()) || this.f.c(this.k.c.a()) != null)) {
                this.k.c.d(this.f.o, (com.bumptech.glide.load.data.d.a)new o(this, (n$a)this.k));
            }
        }
        return b2;
    }
    
    @Override
    public final void cancel() {
        final n$a<?> k = this.k;
        if (k != null) {
            k.c.cancel();
        }
    }
    
    @Override
    public final void d(final o8.d d, final Exception ex, final com.bumptech.glide.load.data.d<?> d2, final DataSource dataSource) {
        this.g.d(d, ex, d2, this.k.c.c());
    }
    
    @Override
    public final void e() {
        throw new UnsupportedOperationException();
    }
}
