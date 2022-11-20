// 
// Decompiled by Procyon v0.6.0
// 

package lh2;

import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor;
import rh2.a;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor;
import mh2.f;
import rh2.d;
import kh2.s;
import kotlin.reflect.jvm.internal.impl.builtins.e$a;
import kotlin.Pair;
import yh2.c;
import java.util.Map;
import yh2.e;

public final class b
{
    public static final e a;
    public static final e b;
    public static final e c;
    public static final Map<c, c> d;
    
    static {
        a = e.g("message");
        b = e.g("allowedTargets");
        c = e.g("value");
        d = kotlin.collections.c.w4(new Pair[] { new Pair((Object)e$a.t, (Object)s.c), new Pair((Object)e$a.w, (Object)s.d), new Pair((Object)e$a.x, (Object)s.f) });
    }
    
    public static f a(final c c, final d d, final nh2.c c2) {
        ng2.e.f((Object)c, "kotlinName");
        ng2.e.f((Object)d, "annotationOwner");
        ng2.e.f((Object)c2, "c");
        if (ng2.e.a((Object)c, (Object)e$a.m)) {
            final c e = s.e;
            ng2.e.e((Object)e, "DEPRECATED_ANNOTATION");
            final a l = d.l(e);
            if (l != null) {
                return (f)new JavaDeprecatedAnnotationDescriptor(l, c2);
            }
            d.t();
        }
        final c c3 = lh2.b.d.get(c);
        f b = null;
        if (c3 != null) {
            final a i = d.l(c3);
            b = b;
            if (i != null) {
                b = b(c2, i, false);
            }
        }
        return b;
    }
    
    public static f b(final nh2.c c, final a a, final boolean b) {
        ng2.e.f((Object)a, "annotation");
        ng2.e.f((Object)c, "c");
        final yh2.b b2 = a.b();
        Object o;
        if (ng2.e.a((Object)b2, (Object)b.l(s.c))) {
            o = new JavaTargetAnnotationDescriptor(a, c);
        }
        else if (ng2.e.a((Object)b2, (Object)b.l(s.d))) {
            o = new JavaRetentionAnnotationDescriptor(a, c);
        }
        else if (ng2.e.a((Object)b2, (Object)b.l(s.f))) {
            o = new JavaAnnotationDescriptor(c, a, e$a.x);
        }
        else if (ng2.e.a((Object)b2, (Object)b.l(s.e))) {
            o = null;
        }
        else {
            o = new LazyJavaAnnotationDescriptor(c, a, b);
        }
        return (f)o;
    }
}
