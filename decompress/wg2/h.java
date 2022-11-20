// 
// Decompiled by Procyon v0.6.0
// 

package wg2;

import ch2.w;
import java.util.List;
import lh2.e$a;
import ch2.x;
import androidx.compose.ui.platform.p1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kh2.n;
import ch2.h0;
import th2.p;
import ki2.m;
import th2.k;
import kh2.i;
import pi2.g$a;
import nh2.b$a;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import ch2.h0$a;
import kotlin.collections.EmptyList;
import th2.p$a;
import ch2.t;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$Kind;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import hh2.g;
import vl.a;
import hh2.b;
import cg2.j;
import hh2.d;
import java.lang.ref.WeakReference;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import ng2.e;
import hh2.f;
import java.util.concurrent.ConcurrentHashMap;

public final class h
{
    public static final ConcurrentHashMap a;
    
    static {
        a = new ConcurrentHashMap();
    }
    
    public static final f a(final Class<?> clazz) {
        e.f((Object)clazz, "<this>");
        final ClassLoader d = ReflectClassUtilKt.d((Class)clazz);
        final l l = new l(d);
        final ConcurrentHashMap a = h.a;
        final WeakReference weakReference = a.get(l);
        if (weakReference != null) {
            final f f = (f)weakReference.get();
            if (f != null) {
                return f;
            }
            a.remove(l, weakReference);
        }
        final d d2 = new d(d);
        final ClassLoader classLoader = j.class.getClassLoader();
        e.e((Object)classLoader, "Unit::class.java.classLoader");
        final d d3 = new d(classLoader);
        final b b = new b(d);
        final StringBuilder sb = new StringBuilder();
        sb.append("runtime module for ");
        sb.append(d);
        final String string = sb.toString();
        final a p = vl.a.p;
        final g a2 = g.a;
        e.f((Object)string, "moduleName");
        final LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("DeserializationComponentsForJava.ModuleData");
        final JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(lockBasedStorageManager, JvmBuiltIns$Kind.FROM_DEPENDENCIES);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append('<');
        sb2.append(string);
        sb2.append('>');
        final c c = new c(yh2.e.i(sb2.toString()), (ni2.h)lockBasedStorageManager, (kotlin.reflect.jvm.internal.impl.builtins.c)jvmBuiltIns, 56);
        lockBasedStorageManager.j(new zg2.f(jvmBuiltIns, c));
        jvmBuiltIns.N(c);
        final kotlin.reflect.jvm.internal.impl.load.kotlin.a a3 = new kotlin.reflect.jvm.internal.impl.load.kotlin.a();
        final nh2.e e = new nh2.e();
        final NotFoundClasses notFoundClasses = new NotFoundClasses((ni2.h)lockBasedStorageManager, (t)c);
        final p$a a4 = p$a.a;
        final e$a a5 = lh2.e.a;
        final lh2.c.a a6 = lh2.c.a.a;
        final EmptyList instance = EmptyList.INSTANCE;
        final gi2.b b2 = new gi2.b((ni2.h)lockBasedStorageManager, instance);
        final h0$a a7 = h0$a.a;
        final jh2.c.a a8 = jh2.c.a.a;
        final kotlin.reflect.jvm.internal.impl.builtins.d d4 = new kotlin.reflect.jvm.internal.impl.builtins.d(c, notFoundClasses);
        final JavaTypeEnhancementState d5 = JavaTypeEnhancementState.d;
        final kh2.b b3 = new kh2.b(d5);
        final b$a a9 = b$a.a;
        final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.b b4 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.b(new sh2.c());
        final kh2.j.a a10 = kh2.j.a.a;
        pi2.g.b.getClass();
        final pi2.h b5 = g$a.b;
        final LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = new LazyJavaPackageFragmentProvider(new nh2.a((ni2.h)lockBasedStorageManager, (i)b, (k)d2, a3, (lh2.e)a5, (m)p, (lh2.c)a6, (gi2.a)b2, (qh2.b)a2, (nh2.d)e, (p)a4, (h0)a7, (jh2.c)a8, (t)c, d4, b3, b4, (kh2.j)a10, (nh2.b)a9, (pi2.g)b5, d5, (n)new oy0.b()));
        final th2.f f2 = new th2.f(lockBasedStorageManager, c, new th2.g(d2, a3), new th2.d(c, notFoundClasses, lockBasedStorageManager, d2), lazyJavaPackageFragmentProvider, notFoundClasses, b5, new qc.b(cg.d.l3((Object)oi2.i.a)));
        final ki2.h a11 = f2.a;
        ng2.e.f((Object)a11, "<set-?>");
        a3.a = a11;
        e.a = new p1(lazyJavaPackageFragmentProvider);
        final bh2.f f3 = new bh2.f(lockBasedStorageManager, d3, c, notFoundClasses, jvmBuiltIns.M(), jvmBuiltIns.M(), b5, new gi2.b((ni2.h)lockBasedStorageManager, instance));
        c.E0(new c[] { c });
        final List m3 = cg.d.m3((Object[])new x[] { (x)lazyJavaPackageFragmentProvider, (x)f3 });
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("CompositeProvider@RuntimeModuleData for ");
        sb3.append(c);
        c.m = (w)new fh2.m(m3, sb3.toString());
        final f f4 = new f(f2.a, new d9.b(a3, d2));
        try {
            while (true) {
                final ConcurrentHashMap a12 = h.a;
                final WeakReference weakReference2 = a12.putIfAbsent(l, new WeakReference(f4));
                if (weakReference2 == null) {
                    return f4;
                }
                final f f5 = (f)weakReference2.get();
                if (f5 != null) {
                    return f5;
                }
                a12.remove(l, weakReference2);
            }
        }
        finally {}
    }
}
