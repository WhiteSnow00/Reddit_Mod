// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import kotlin.NoWhenBranchMatchedException;
import sg2.e;
import androidx.paging.LoadType;
import androidx.paging.PagingDataDiffer;

public final class t
{
    public final /* synthetic */ PagingDataDiffer<Object> a;
    
    public t(final PagingDataDiffer<Object> a) {
        this.a = a;
    }
    
    public final void a(final int n, final int n2) {
        this.a.a.c(n2);
    }
    
    public final void b(final LoadType loadType) {
        final k.c c = k.c.c;
        e.f((Object)loadType, "loadType");
        final m e = this.a.e;
        e.getClass();
        final l f = e.f;
        Object o;
        if (f == null) {
            o = null;
        }
        else {
            final int n = l.a.a[loadType.ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o = f.a;
                }
                else {
                    o = f.b;
                }
            }
            else {
                o = f.c;
            }
        }
        if (sg2.e.a(o, (Object)c)) {
            return;
        }
        final m e2 = this.a.e;
        e2.getClass();
        e2.a = true;
        final l f2 = e2.f;
        sg2.e.a((Object)(e2.f = f2.b(loadType)), (Object)f2);
        e2.b();
    }
}
