// 
// Decompiled by Procyon v0.6.0
// 

package si2;

import oi2.q0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import ng2.e;
import oi2.o0;
import oi2.l0;
import oi2.n0;

public final class b extends n0
{
    public final o0 g(final l0 l0) {
        e.f((Object)l0, "key");
        bi2.b b;
        if (l0 instanceof bi2.b) {
            b = (bi2.b)l0;
        }
        else {
            b = null;
        }
        if (b == null) {
            return null;
        }
        if (b.b().a()) {
            return (o0)new q0(b.b().getType(), Variance.OUT_VARIANCE);
        }
        return b.b();
    }
}
