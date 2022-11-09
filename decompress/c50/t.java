// 
// Decompiled by Procyon v0.6.0
// 

package c50;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import q6.l;
import nf2.a;
import i60.s;
import nf2.n;
import javax.inject.Inject;
import ah2.f;
import javax.inject.Provider;
import h60.q0;

public final class t implements n0
{
    public final q0 a;
    
    @Inject
    public t(final Provider<q0> provider) {
        f.f((Object)provider, "dao");
        this.a = (q0)provider.get();
    }
    
    @Override
    public final n<s> l(final String s) {
        f.f((Object)s, "streamdId");
        return this.a.l(s);
    }
    
    @Override
    public final a m(final s s) {
        final a onAssembly = RxJavaPlugins.onAssembly((a)new xf2.f((Callable)new l(3, this, s)));
        f.e((Object)onAssembly, "fromCallable { streamLin\u2026ink(linkStateDataModel) }");
        return onAssembly;
    }
}
