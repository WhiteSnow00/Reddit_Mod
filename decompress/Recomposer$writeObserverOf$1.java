// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import ah2.f;
import a1.c;
import z0.m;
import kotlin.Metadata;
import pg2.j;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "", "value", "Lpg2/j;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class Recomposer$writeObserverOf$1 extends Lambda implements l<Object, j>
{
    public final /* synthetic */ m $composition;
    public final /* synthetic */ c<Object> $modifiedValues;
    
    public Recomposer$writeObserverOf$1(final m $composition, final c<Object> $modifiedValues) {
        this.$composition = $composition;
        this.$modifiedValues = $modifiedValues;
        super(1);
    }
    
    public final void invoke(final Object o) {
        f.f(o, "value");
        this.$composition.x(o);
        final c<Object> $modifiedValues = this.$modifiedValues;
        if ($modifiedValues != null) {
            $modifiedValues.add(o);
        }
    }
}
