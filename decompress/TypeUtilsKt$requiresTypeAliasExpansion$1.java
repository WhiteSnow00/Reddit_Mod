// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import hh2.j0;
import hh2.i0;
import sg2.e;
import ti2.v0;
import rg2.l;
import kotlin.jvm.internal.Lambda;

final class TypeUtilsKt$requiresTypeAliasExpansion$1 extends Lambda implements l<v0, Boolean>
{
    public static final TypeUtilsKt$requiresTypeAliasExpansion$1 INSTANCE;
    
    static {
        INSTANCE = new TypeUtilsKt$requiresTypeAliasExpansion$1();
    }
    
    public TypeUtilsKt$requiresTypeAliasExpansion$1() {
        super(1);
    }
    
    public final Boolean invoke(final v0 v0) {
        e.f((Object)v0, "it");
        final hh2.e f = v0.I0().f();
        boolean b = false;
        if (f != null) {
            if (!(f instanceof i0)) {
                b = b;
                if (!(f instanceof j0)) {
                    return b;
                }
            }
            b = true;
        }
        return b;
    }
}
