// 
// Decompiled by Procyon v0.6.0
// 

package wf2;

import io.reactivex.plugins.RxJavaPlugins;
import nt2.b;

public abstract class a<T>
{
    public static <T> a<T> a(final b<? extends T> b, final int n, final int n2) {
        if (b != null) {
            hf2.a.c(n, "parallelism");
            hf2.a.c(n2, "prefetch");
            return RxJavaPlugins.onAssembly((a)new of2.a((b)b));
        }
        throw new NullPointerException("source");
    }
}
