// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import hh2.h;
import kotlin.sequences.SequencesKt__SequencesKt;
import bj2.k;
import ui2.j;
import ui2.d$a;
import hh2.t;
import hh2.f;
import hh2.v;
import di2.d;
import di2.c;
import hh2.g;
import zi2.b$a;
import kotlin.jvm.internal.Ref$ObjectRef;
import i92.a;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import rg2.l;
import zi2.b$b;
import lw0.b;
import hh2.m0;
import di2.e;

public final class DescriptorUtilsKt
{
    static {
        e.f("value");
    }
    
    public static final boolean a(final m0 m0) {
        sg2.e.f((Object)m0, "<this>");
        final Boolean d = zi2.b.d(b.r1((Object)m0), (b$b)DescriptorUtilsKt$a.f, (l)DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.INSTANCE);
        sg2.e.e((Object)d, "ifAny(\n        listOf(th\u2026eclaresDefaultValue\n    )");
        return d;
    }
    
    public static CallableMemberDescriptor b(final CallableMemberDescriptor callableMemberDescriptor, final l l) {
        sg2.e.f((Object)callableMemberDescriptor, "<this>");
        sg2.e.f((Object)l, "predicate");
        return (CallableMemberDescriptor)zi2.b.b(b.r1((Object)callableMemberDescriptor), (b$b)new a(false), (b$a)new ji2.a(new Ref$ObjectRef(), l));
    }
    
    public static final c c(final g g) {
        sg2.e.f((Object)g, "<this>");
        d h = h(g);
        final boolean f = h.f();
        c i = null;
        if (!f) {
            h = null;
        }
        if (h != null) {
            i = h.i();
        }
        return i;
    }
    
    public static final hh2.c d(final ih2.c c) {
        sg2.e.f((Object)c, "<this>");
        final hh2.e f = c.getType().I0().f();
        hh2.c c2;
        if (f instanceof hh2.c) {
            c2 = (hh2.c)f;
        }
        else {
            c2 = null;
        }
        return c2;
    }
    
    public static final kotlin.reflect.jvm.internal.impl.builtins.c e(final g g) {
        sg2.e.f((Object)g, "<this>");
        return j(g).o();
    }
    
    public static final di2.b f(final hh2.e e) {
        di2.b d;
        final di2.b b = d = null;
        if (e != null) {
            final g b2 = ((h)e).b();
            d = b;
            if (b2 != null) {
                if (b2 instanceof v) {
                    d = new di2.b(((v)b2).d(), ((g)e).getName());
                }
                else {
                    d = b;
                    if (b2 instanceof f) {
                        final di2.b f = f((hh2.e)b2);
                        d = b;
                        if (f != null) {
                            d = f.d(((g)e).getName());
                        }
                    }
                }
            }
        }
        return d;
    }
    
    public static final c g(final g g) {
        sg2.e.f((Object)g, "<this>");
        final c h = fi2.d.h(g);
        c i;
        if (h != null) {
            i = h;
        }
        else {
            i = fi2.d.g(g.b()).c(g.getName()).i();
        }
        if (i != null) {
            return i;
        }
        fi2.d.a(4);
        throw null;
    }
    
    public static final d h(final g g) {
        sg2.e.f((Object)g, "<this>");
        final d g2 = fi2.d.g(g);
        sg2.e.e((Object)g2, "getFqName(this)");
        return g2;
    }
    
    public static final d$a i(final t t) {
        sg2.e.f((Object)t, "<this>");
        final j j = (j)t.v(ui2.e.a);
        return d$a.h;
    }
    
    public static final t j(final g g) {
        sg2.e.f((Object)g, "<this>");
        final t d = fi2.d.d(g);
        sg2.e.e((Object)d, "getContainingModule(this)");
        return d;
    }
    
    public static final k<g> k(final g g) {
        sg2.e.f((Object)g, "<this>");
        return (k<g>)kotlin.sequences.b.h1(SequencesKt__SequencesKt.b1((l)DescriptorUtilsKt$parentsWithSelf$1.INSTANCE, (Object)g), 1);
    }
    
    public static final CallableMemberDescriptor l(final CallableMemberDescriptor callableMemberDescriptor) {
        sg2.e.f((Object)callableMemberDescriptor, "<this>");
        Object h0 = callableMemberDescriptor;
        if (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            h0 = ((kotlin.reflect.jvm.internal.impl.descriptors.e)callableMemberDescriptor).h0();
            sg2.e.e(h0, "correspondingProperty");
        }
        return (CallableMemberDescriptor)h0;
    }
}
