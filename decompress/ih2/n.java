// 
// Decompiled by Procyon v0.6.0
// 

package ih2;

import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import yh2.b;
import rh2.m;

public final class n extends e implements m
{
    public final Enum<?> b;
    
    public n(final yh2.e e, final Enum<?> b) {
        super(e);
        this.b = b;
    }
    
    public final b c() {
        Class<? extends Enum> clazz = this.b.getClass();
        if (!clazz.isEnum()) {
            clazz = (Class<? extends Enum>)clazz.getEnclosingClass();
        }
        ng2.e.e((Object)clazz, "enumClass");
        return ReflectClassUtilKt.a((Class)clazz);
    }
    
    public final yh2.e d() {
        return yh2.e.g(this.b.name());
    }
}
