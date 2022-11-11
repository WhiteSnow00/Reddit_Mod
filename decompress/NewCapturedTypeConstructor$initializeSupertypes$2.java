// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import ti2.v0;
import java.util.List;
import rg2.a;
import kotlin.jvm.internal.Lambda;

final class NewCapturedTypeConstructor$initializeSupertypes$2 extends Lambda implements a<List<? extends v0>>
{
    public final /* synthetic */ List<v0> $boundSupertypes;
    
    public NewCapturedTypeConstructor$initializeSupertypes$2(final List<? extends v0> $boundSupertypes) {
        this.$boundSupertypes = (List<v0>)$boundSupertypes;
        super(0);
    }
    
    public final List<v0> invoke() {
        return this.$boundSupertypes;
    }
}
