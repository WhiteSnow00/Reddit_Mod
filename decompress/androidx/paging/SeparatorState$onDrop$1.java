// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import sg2.e;
import yg2.i;
import kotlin.Metadata;
import c5.z;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n" }, d2 = { "", "R", "T", "Lc5/z;", "stash", "", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
final class SeparatorState$onDrop$1 extends Lambda implements l<z<Object>, Boolean>
{
    public final /* synthetic */ i $pageOffsetsToDrop;
    
    public SeparatorState$onDrop$1(final i $pageOffsetsToDrop) {
        this.$pageOffsetsToDrop = $pageOffsetsToDrop;
        super(1);
    }
    
    public final Boolean invoke(final z<Object> z) {
        e.f((Object)z, "stash");
        final int[] a = z.a;
        final i $pageOffsetsToDrop = this.$pageOffsetsToDrop;
        final int length = a.length;
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= length) {
                break;
            }
            if ($pageOffsetsToDrop.k(a[n])) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
}
