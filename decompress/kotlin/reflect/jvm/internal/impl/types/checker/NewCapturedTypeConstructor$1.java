// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import ti2.v0;
import java.util.List;
import rg2.a;
import kotlin.jvm.internal.Lambda;

final class NewCapturedTypeConstructor$1 extends Lambda implements a<List<? extends v0>>
{
    public final /* synthetic */ List<v0> $supertypes;
    
    public NewCapturedTypeConstructor$1(final List<? extends v0> $supertypes) {
        this.$supertypes = (List<v0>)$supertypes;
        super(0);
    }
    
    public final List<v0> invoke() {
        return this.$supertypes;
    }
}
