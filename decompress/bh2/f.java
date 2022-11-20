// 
// Decompiled by Procyon v0.6.0
// 

package bh2;

import java.util.List;
import ki2.n;
import ki2.n$a;
import ki2.m;
import ch2.t;
import ch2.w;
import ki2.k;
import ng2.e;
import gi2.b;
import pi2.h;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c;
import hh2.d;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

public final class f extends a
{
    public f(final LockBasedStorageManager lockBasedStorageManager, final d d, final c c, final NotFoundClasses notFoundClasses, final JvmBuiltInsCustomizer jvmBuiltInsCustomizer, final JvmBuiltInsCustomizer jvmBuiltInsCustomizer2, final h h, final b b) {
        e.f((Object)jvmBuiltInsCustomizer, "additionalClassPartsProvider");
        e.f((Object)jvmBuiltInsCustomizer2, "platformDependentDeclarationFilter");
        e.f((Object)h, "kotlinTypeChecker");
        super(lockBasedStorageManager, d, c);
        final k k = new k((w)this);
        final li2.a m = li2.a.m;
        super.d = new ki2.h((ni2.h)lockBasedStorageManager, (t)c, k, new ki2.b((t)c, notFoundClasses, m), (w)this, (m)ki2.m.j3, (n)n$a.f, cg.d.m3((Object[])new eh2.b[] { (eh2.b)new ah2.a((ni2.h)lockBasedStorageManager, c), (eh2.b)new kotlin.reflect.jvm.internal.impl.builtins.jvm.a((ni2.h)lockBasedStorageManager, c) }), notFoundClasses, (eh2.a)jvmBuiltInsCustomizer, (eh2.c)jvmBuiltInsCustomizer2, ((ji2.a)m).a, h, b, null, 786432);
    }
}
