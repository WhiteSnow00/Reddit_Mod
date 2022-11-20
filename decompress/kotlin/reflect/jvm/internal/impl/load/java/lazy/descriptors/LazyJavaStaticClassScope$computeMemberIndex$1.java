// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import rh2.r;
import ng2.e;
import rh2.p;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class LazyJavaStaticClassScope$computeMemberIndex$1 extends Lambda implements l<p, Boolean>
{
    public static final LazyJavaStaticClassScope$computeMemberIndex$1 INSTANCE;
    
    static {
        INSTANCE = new LazyJavaStaticClassScope$computeMemberIndex$1();
    }
    
    public LazyJavaStaticClassScope$computeMemberIndex$1() {
        super(1);
    }
    
    public final Boolean invoke(final p p) {
        e.f((Object)p, "it");
        return ((r)p).h();
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((p)o);
    }
}
