// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.types;

import wi2.f;
import ui2.d;
import ti2.t;
import rg2.a;
import kotlin.jvm.internal.Lambda;

final class LazyWrappedType$refine$1 extends Lambda implements a<t>
{
    public final /* synthetic */ ui2.d $kotlinTypeRefiner;
    public final /* synthetic */ b this$0;
    
    public LazyWrappedType$refine$1(final ui2.d $kotlinTypeRefiner, final b this$0) {
        this.$kotlinTypeRefiner = $kotlinTypeRefiner;
        this.this$0 = this$0;
        super(0);
    }
    
    public final t invoke() {
        return this.$kotlinTypeRefiner.b1((f)this.this$0.h.invoke());
    }
}
