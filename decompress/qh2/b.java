// 
// Decompiled by Procyon v0.6.0
// 

package qh2;

import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor;
import wh2.a;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor;
import rh2.f;
import wh2.d;
import ph2.s;
import kotlin.reflect.jvm.internal.impl.builtins.e$a;
import kotlin.Pair;
import di2.c;
import java.util.Map;
import di2.e;

public final class b
{
    public static final e a;
    public static final e b;
    public static final e c;
    public static final Map<c, c> d;
    
    static {
        a = e.f("message");
        b = e.f("allowedTargets");
        c = e.f("value");
        d = kotlin.collections.c.X0(new Pair[] { new Pair((Object)e$a.t, (Object)s.c), new Pair((Object)e$a.w, (Object)s.d), new Pair((Object)e$a.x, (Object)s.f) });
    }
    
    public static f a(final c c, final d d, final sh2.c c2) {
        sg2.e.f((Object)c, "kotlinName");
        sg2.e.f((Object)d, "annotationOwner");
        sg2.e.f((Object)c2, "c");
        if (sg2.e.a((Object)c, (Object)e$a.m)) {
            final c e = s.e;
            sg2.e.e((Object)e, "DEPRECATED_ANNOTATION");
            final a f = d.f(e);
            if (f != null) {
                return (f)new JavaDeprecatedAnnotationDescriptor(f, c2);
            }
            d.s();
        }
        final c c3 = qh2.b.d.get(c);
        f b = null;
        if (c3 != null) {
            final a f2 = d.f(c3);
            b = b;
            if (f2 != null) {
                b = b(c2, f2, false);
            }
        }
        return b;
    }
    
    public static f b(final sh2.c c, final a a, final boolean b) {
        sg2.e.f((Object)a, "annotation");
        sg2.e.f((Object)c, "c");
        final di2.b b2 = a.b();
        Object o;
        if (sg2.e.a((Object)b2, (Object)b.l(s.c))) {
            o = new JavaTargetAnnotationDescriptor(a, c);
        }
        else if (sg2.e.a((Object)b2, (Object)b.l(s.d))) {
            o = new JavaRetentionAnnotationDescriptor(a, c);
        }
        else if (sg2.e.a((Object)b2, (Object)b.l(s.f))) {
            o = new JavaAnnotationDescriptor(c, a, e$a.x);
        }
        else if (sg2.e.a((Object)b2, (Object)b.l(s.e))) {
            o = null;
        }
        else {
            o = new LazyJavaAnnotationDescriptor(c, a, b);
        }
        return (f)o;
    }
}
