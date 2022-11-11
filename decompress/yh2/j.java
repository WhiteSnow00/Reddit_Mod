// 
// Decompiled by Procyon v0.6.0
// 

package yh2;

import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

public abstract class j
{
    public static final j.j$c a;
    public static final j.j$c b;
    public static final j.j$c c;
    public static final j.j$c d;
    public static final j.j$c e;
    public static final j.j$c f;
    public static final j.j$c g;
    public static final j.j$c h;
    
    static {
        a = new j.j$c(JvmPrimitiveType.BOOLEAN);
        b = new j.j$c(JvmPrimitiveType.CHAR);
        c = new j.j$c(JvmPrimitiveType.BYTE);
        d = new j.j$c(JvmPrimitiveType.SHORT);
        e = new j.j$c(JvmPrimitiveType.INT);
        f = new j.j$c(JvmPrimitiveType.FLOAT);
        g = new j.j$c(JvmPrimitiveType.LONG);
        h = new j.j$c(JvmPrimitiveType.DOUBLE);
    }
    
    @Override
    public final String toString() {
        return k.g(this);
    }
}
