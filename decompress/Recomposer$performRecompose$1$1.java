// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import java.util.Iterator;
import a1.c;
import z0.m;
import kotlin.Metadata;
import pg2.j;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lpg2/j;", "invoke", "()V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class Recomposer$performRecompose$1$1 extends Lambda implements a<j>
{
    public final /* synthetic */ m $composition;
    public final /* synthetic */ c<Object> $modifiedValues;
    
    public Recomposer$performRecompose$1$1(final c<Object> $modifiedValues, final m $composition) {
        this.$modifiedValues = $modifiedValues;
        this.$composition = $composition;
        super(0);
    }
    
    public final void invoke() {
        final c<Object> $modifiedValues = this.$modifiedValues;
        final m $composition = this.$composition;
        final Iterator<Object> iterator = ((Iterable<Object>)$modifiedValues).iterator();
        while (iterator.hasNext()) {
            $composition.x(iterator.next());
        }
    }
}
