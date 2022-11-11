// 
// Decompiled by Procyon v0.6.0
// 

package yh2;

import pi2.n;
import pi2.m;
import hh2.w;
import hh2.t;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import sg2.e;
import mf1.a;
import s6.b;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import pi2.h;

public final class f
{
    public final h a;
    
    public f(final LockBasedStorageManager lockBasedStorageManager, final c c, final yh2.h h, final d d, final LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, final NotFoundClasses notFoundClasses, final ui2.h h2, final b b) {
        final a i = mf1.a.i;
        e.f((Object)h2, "kotlinTypeChecker");
        final kotlin.reflect.jvm.internal.impl.builtins.c j = c.i;
        JvmBuiltIns jvmBuiltIns;
        if (j instanceof JvmBuiltIns) {
            jvmBuiltIns = (JvmBuiltIns)j;
        }
        else {
            jvmBuiltIns = null;
        }
        final vl.a y = vl.a.y;
        final EmptyList instance = EmptyList.INSTANCE;
        Object o = null;
        Label_0078: {
            if (jvmBuiltIns != null) {
                o = jvmBuiltIns.M();
                if (o != null) {
                    break Label_0078;
                }
            }
            o = jh2.a.a.a;
        }
        Object o2 = null;
        Label_0103: {
            if (jvmBuiltIns != null) {
                o2 = jvmBuiltIns.M();
                if (o2 != null) {
                    break Label_0103;
                }
            }
            o2 = jh2.c.b.a;
        }
        this.a = new h((si2.h)lockBasedStorageManager, (t)c, (pi2.f)h, (pi2.a)d, (w)lazyJavaPackageFragmentProvider, (m)i, (n)y, (Iterable)instance, notFoundClasses, (jh2.a)o, (jh2.c)o2, ci2.h.a, h2, new li2.b((si2.h)lockBasedStorageManager, instance), b.a, 262144);
    }
}
