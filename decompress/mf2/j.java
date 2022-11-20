// 
// Decompiled by Procyon v0.6.0
// 

package mf2;

import af2.p;
import io.reactivex.plugins.RxJavaPlugins;
import af2.n;
import af2.r;
import if2.c;
import af2.a;

public final class j<T> extends a implements c<T>
{
    public final r<T> f;
    
    public j(final r<T> f) {
        this.f = f;
    }
    
    public final n<T> c() {
        return RxJavaPlugins.onAssembly((n)new i((r)this.f));
    }
    
    @Override
    public final void w(final af2.c c) {
        this.f.a((p)new j.j$a(c));
    }
}
