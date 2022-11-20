// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ch2.e;
import ch2.c;
import oi2.t;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1 extends Lambda implements l<t, c>
{
    public static final LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1 INSTANCE;
    
    static {
        INSTANCE = new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1();
    }
    
    public LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1() {
        super(1);
    }
    
    public final c invoke(final t t) {
        final e f = t.I0().f();
        c c;
        if (f instanceof c) {
            c = (c)f;
        }
        else {
            c = null;
        }
        return c;
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((t)o);
    }
}
