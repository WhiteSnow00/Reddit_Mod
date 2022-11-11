// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import lg2.c;
import kotlin.Result;
import ej2.k;
import kotlin.Metadata;
import hg2.j;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n" }, d2 = { "T", "", "it", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
final class SimpleProducerScopeImpl$awaitClose$2$1 extends Lambda implements l<Throwable, j>
{
    public final /* synthetic */ k<j> $cont;
    
    public SimpleProducerScopeImpl$awaitClose$2$1(final k<? super j> $cont) {
        this.$cont = (k<j>)$cont;
        super(1);
    }
    
    public final void invoke(final Throwable t) {
        ((c)this.$cont).resumeWith(Result.constructor-impl((Object)j.a));
    }
}
