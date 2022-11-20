// 
// Decompiled by Procyon v0.6.0
// 

package th2;

import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

public abstract class i
{
    public static final i.i$c a;
    public static final i.i$c b;
    public static final i.i$c c;
    public static final i.i$c d;
    public static final i.i$c e;
    public static final i.i$c f;
    public static final i.i$c g;
    public static final i.i$c h;
    
    static {
        a = new i.i$c(JvmPrimitiveType.BOOLEAN);
        b = new i.i$c(JvmPrimitiveType.CHAR);
        c = new i.i$c(JvmPrimitiveType.BYTE);
        d = new i.i$c(JvmPrimitiveType.SHORT);
        e = new i.i$c(JvmPrimitiveType.INT);
        f = new i.i$c(JvmPrimitiveType.FLOAT);
        g = new i.i$c(JvmPrimitiveType.LONG);
        h = new i.i$c(JvmPrimitiveType.DOUBLE);
    }
    
    @Override
    public final String toString() {
        return j.g(this);
    }
}
