// 
// Decompiled by Procyon v0.6.0
// 

package v4;

import ak0.n;
import androidx.lifecycle.l0;
import ah2.f;
import androidx.lifecycle.n0$b;

public final class b implements n0$b
{
    public final e<?>[] a;
    
    public b(final e<?>... a) {
        f.f((Object)a, "initializers");
        this.a = a;
    }
    
    public final l0 a(final Class clazz, final d d) {
        final e<?>[] a = this.a;
        final int length = a.length;
        int i = 0;
        l0 l0 = null;
        while (i < length) {
            final e<?> e = a[i];
            if (f.a((Object)e.a, (Object)clazz)) {
                final Object invoke = e.b.invoke((Object)d);
                if (invoke instanceof l0) {
                    l0 = (l0)invoke;
                }
                else {
                    l0 = null;
                }
            }
            ++i;
        }
        if (l0 != null) {
            return l0;
        }
        throw new IllegalArgumentException(n.j(clazz, a.k("No initializer set for given class ")));
    }
}
