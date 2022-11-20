// 
// Decompiled by Procyon v0.6.0
// 

package mf2;

import io.reactivex.plugins.RxJavaPlugins;
import af2.p;
import af2.e0;
import af2.n;
import af2.r;
import if2.c;
import af2.c0;

public final class l<T> extends c0<Boolean> implements c<Boolean>
{
    public final r<T> f;
    
    public l(final n f) {
        this.f = (r<T>)f;
    }
    
    @Override
    public final void G(final e0<? super Boolean> e0) {
        this.f.a((p)new l.l$a((e0)e0));
    }
    
    public final n<Boolean> c() {
        return RxJavaPlugins.onAssembly((n)new k((r)this.f));
    }
}
