// 
// Decompiled by Procyon v0.6.0
// 

package th2;

import ki2.n;
import ki2.m;
import ch2.w;
import ch2.t;
import eh2.c$b;
import eh2.a$a;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import ng2.e;
import vl.a;
import qc.b;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import ki2.h;

public final class f
{
    public final h a;
    
    public f(final LockBasedStorageManager lockBasedStorageManager, final c c, final g g, final d d, final LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, final NotFoundClasses notFoundClasses, final pi2.h h, final b b) {
        final a p8 = vl.a.p;
        e.f((Object)h, "kotlinTypeChecker");
        final kotlin.reflect.jvm.internal.impl.builtins.c i = c.i;
        JvmBuiltIns jvmBuiltIns;
        if (i instanceof JvmBuiltIns) {
            jvmBuiltIns = (JvmBuiltIns)i;
        }
        else {
            jvmBuiltIns = null;
        }
        final px1.a r = px1.a.r;
        final EmptyList instance = EmptyList.INSTANCE;
        Object o = null;
        Label_0078: {
            if (jvmBuiltIns != null) {
                o = jvmBuiltIns.M();
                if (o != null) {
                    break Label_0078;
                }
            }
            o = a$a.a;
        }
        Object o2 = null;
        Label_0103: {
            if (jvmBuiltIns != null) {
                o2 = jvmBuiltIns.M();
                if (o2 != null) {
                    break Label_0103;
                }
            }
            o2 = c$b.a;
        }
        this.a = new h((ni2.h)lockBasedStorageManager, (t)c, (ki2.f)g, (ki2.a)d, (w)lazyJavaPackageFragmentProvider, (m)p8, (n)r, (Iterable)instance, notFoundClasses, (eh2.a)o, (eh2.c)o2, xh2.h.a, h, new gi2.b((ni2.h)lockBasedStorageManager, instance), b.f, 262144);
    }
}
