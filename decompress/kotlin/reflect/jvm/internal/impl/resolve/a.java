// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.resolve;

import hh2.h;
import hh2.j;
import hh2.v;
import ui2.c$a;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import fi2.d;
import hh2.s;
import ui2.d$a;
import hh2.c;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import sg2.e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import hh2.e0;
import hh2.g;
import rg2.p;
import hh2.j0;

public final class a
{
    public static final a a;
    
    static {
        a = new a();
    }
    
    public static /* synthetic */ boolean c(final a a, final j0 j0, final j0 j2, final boolean b) {
        return a.b(j0, j2, b, (p<? super g, ? super g, Boolean>)DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1.INSTANCE);
    }
    
    public static e0 e(kotlin.reflect.jvm.internal.impl.descriptors.a a) {
        while (a instanceof CallableMemberDescriptor) {
            final CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor)a;
            if (callableMemberDescriptor.getKind() != CallableMemberDescriptor$Kind.FAKE_OVERRIDE) {
                break;
            }
            final Collection e = callableMemberDescriptor.e();
            sg2.e.e((Object)e, "overriddenDescriptors");
            a = (kotlin.reflect.jvm.internal.impl.descriptors.a)CollectionsKt___CollectionsKt.c4(e);
            if (a != null) {
                continue;
            }
            return null;
        }
        return ((j)a).f();
    }
    
    public final boolean a(final g g, final g g2, final boolean b, final boolean b2) {
        boolean b3;
        if (g instanceof c && g2 instanceof c) {
            b3 = e.a((Object)((hh2.e)g).m(), (Object)((hh2.e)g2).m());
        }
        else if (g instanceof j0 && g2 instanceof j0) {
            b3 = c(this, (j0)g, (j0)g2, b);
        }
        else if (g instanceof kotlin.reflect.jvm.internal.impl.descriptors.a && g2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) {
            final kotlin.reflect.jvm.internal.impl.descriptors.a a = (kotlin.reflect.jvm.internal.impl.descriptors.a)g;
            final kotlin.reflect.jvm.internal.impl.descriptors.a a2 = (kotlin.reflect.jvm.internal.impl.descriptors.a)g2;
            final d$a h = d$a.h;
            e.f((Object)a, "a");
            e.f((Object)a2, "b");
            e.f((Object)h, "kotlinTypeRefiner");
            Label_0339: {
                if (!e.a((Object)a, (Object)a2)) {
                    if (e.a((Object)((g)a).getName(), (Object)((g)a2).getName())) {
                        if (!b2 || !(a instanceof s) || !(a2 instanceof s) || ((s)a).q0() == ((s)a2).q0()) {
                            if (e.a((Object)((h)a).b(), (Object)((h)a2).b())) {
                                if (!b) {
                                    return false;
                                }
                                if (!e.a((Object)e(a), (Object)e(a2))) {
                                    return false;
                                }
                            }
                            if (!d.o((g)a)) {
                                if (!d.o((g)a2)) {
                                    if (this.d((g)a, (g)a2, (p<? super g, ? super g, Boolean>)DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$1.INSTANCE, b)) {
                                        final OverridingUtil overridingUtil = new OverridingUtil((c$a)new DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1(a, a2, b), h, KotlinTypePreparator.a.a);
                                        final OverridingUtil.OverrideCompatibilityInfo.Result c = overridingUtil.m(a, a2, null, true).c();
                                        final OverridingUtil.OverrideCompatibilityInfo.Result overridable = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
                                        if (c == overridable && overridingUtil.m(a2, a, null, true).c() == overridable) {
                                            break Label_0339;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    b3 = false;
                    return b3;
                }
            }
            b3 = true;
        }
        else if (g instanceof v && g2 instanceof v) {
            b3 = e.a((Object)((v)g).d(), (Object)((v)g2).d());
        }
        else {
            b3 = e.a((Object)g, (Object)g2);
        }
        return b3;
    }
    
    public final boolean b(final j0 j0, final j0 j2, final boolean b, final p<? super g, ? super g, Boolean> p4) {
        e.f((Object)j0, "a");
        e.f((Object)j2, "b");
        e.f((Object)p4, "equivalentCallables");
        final boolean a = e.a((Object)j0, (Object)j2);
        final boolean b2 = true;
        return a || (!e.a((Object)((h)j0).b(), (Object)((h)j2).b()) && this.d((g)j0, (g)j2, p4, b) && j0.getIndex() == j2.getIndex() && b2);
    }
    
    public final boolean d(g b, g b2, final p<? super g, ? super g, Boolean> p4, final boolean b3) {
        b = b.b();
        b2 = b2.b();
        boolean b4;
        if (!(b instanceof CallableMemberDescriptor) && !(b2 instanceof CallableMemberDescriptor)) {
            b4 = this.a(b, b2, b3, true);
        }
        else {
            b4 = p4.invoke(b, b2);
        }
        return b4;
    }
}
