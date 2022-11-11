// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.util;

import sg2.e;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import rg2.l;
import kotlin.jvm.internal.Lambda;

final class Checks$4 extends Lambda implements l
{
    public static final Checks$4 INSTANCE;
    
    static {
        INSTANCE = new Checks$4();
    }
    
    public Checks$4() {
        super(1);
    }
    
    public final Void invoke(final kotlin.reflect.jvm.internal.impl.descriptors.d d) {
        e.f((Object)d, "$this$null");
        return null;
    }
}
