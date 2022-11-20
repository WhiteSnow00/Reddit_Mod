// 
// Decompiled by Procyon v0.6.0
// 

package r0;

import c2.h0;
import java.util.List;
import u2.a;
import ng2.e;
import androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$a;
import s0.g;
import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;

public final class u
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    public u(final LMOtsParameters b, final byte[] c, final int a, final byte[] d) {
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public u(final i b, final g c, final int a, final LazyGridKt$rememberLazyGridMeasurePolicy$1$1$a d) {
        e.f((Object)b, "itemProvider");
        e.f((Object)c, "measureScope");
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    public final t a(final int n, final int n2, final long n3) {
        final Object a = ((s0.e)this.b).a(n);
        final List k = ((g)this.c).K(n, n3);
        int n4;
        if (u2.a.f(n3)) {
            n4 = u2.a.j(n3);
        }
        else {
            if (!u2.a.e(n3)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            n4 = u2.a.i(n3);
        }
        return ((y)this.d).a(n, a, n4, n2, k);
    }
}
