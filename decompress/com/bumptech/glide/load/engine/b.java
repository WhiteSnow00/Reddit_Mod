// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import u8.n$a;
import java.io.File;
import u8.n;
import java.util.List;
import com.bumptech.glide.load.data.d;

public final class b implements c, d.a<Object>
{
    public final List<o8.d> f;
    public final com.bumptech.glide.load.engine.d<?> g;
    public final c.a h;
    public int i;
    public o8.d j;
    public List<n<File, ?>> k;
    public int l;
    public volatile n$a<?> m;
    public File n;
    
    public b(final List<o8.d> f, final com.bumptech.glide.load.engine.d<?> g, final c.a h) {
        this.i = -1;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean b() {
        while (true) {
            final List<n<File, ?>> k = this.k;
            if (k != null && this.l < k.size()) {
                this.m = null;
                boolean b;
                for (b = false; !b && this.l < this.k.size(); b = true) {
                    final n n = this.k.get(this.l++);
                    final File n2 = this.n;
                    final com.bumptech.glide.load.engine.d<?> g = this.g;
                    this.m = (n$a<?>)n.buildLoadData((Object)n2, g.e, g.f, g.i);
                    if (this.m != null && this.g.c(this.m.c.a()) != null) {
                        this.m.c.d(this.g.o, (d.a)this);
                    }
                }
                return b;
            }
            if (++this.i >= this.f.size()) {
                return false;
            }
            final o8.d j = this.f.get(this.i);
            final com.bumptech.glide.load.engine.d<?> g2 = this.g;
            final File e = ((e.c)g2.h).a().e((o8.d)new q8.c(j, g2.n));
            if ((this.n = e) == null) {
                continue;
            }
            this.j = j;
            this.k = this.g.c.b.e(e);
            this.l = 0;
        }
    }
    
    @Override
    public final void cancel() {
        final n$a<?> m = this.m;
        if (m != null) {
            m.c.cancel();
        }
    }
    
    @Override
    public final void e(final Object o) {
        this.h.a(this.j, o, this.m.c, DataSource.DATA_DISK_CACHE, this.j);
    }
    
    @Override
    public final void f(final Exception ex) {
        this.h.d(this.j, ex, this.m.c, DataSource.DATA_DISK_CACHE);
    }
}
