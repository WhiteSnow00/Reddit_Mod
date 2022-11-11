// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.types;

import ti2.t;
import yi2.a;
import ti2.z;
import ti2.y;
import ti2.q0;
import rg2.l;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import ti2.m0;
import kh2.w;
import hh2.g;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import hh2.c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import vi2.h;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import ti2.q;
import ti2.v0;
import ti2.j0;
import ti2.f0;
import ti2.f0$a;
import ti2.e0;
import ti2.x;
import ti2.n0;
import hh2.i0;
import hh2.e;
import java.util.List;
import ui2.d;
import ti2.k0;

public final class KotlinTypeFactory
{
    static {
        final KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY.KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1 instance = KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY.KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1.INSTANCE;
    }
    
    public static final a a(final k0 k0, final d d, final List list) {
        final e f = k0.f();
        if (f != null) {
            d.Z0(f);
        }
        return null;
    }
    
    public static final x b(final i0 i0, final List<? extends n0> list) {
        sg2.e.f((Object)i0, "<this>");
        sg2.e.f((Object)list, "arguments");
        final e0 e0 = new e0();
        final f0 a = f0$a.a((f0)null, i0, (List)list);
        j0.g.getClass();
        final j0 h = j0.h;
        sg2.e.f((Object)h, "attributes");
        return e0.c(a, h, false, 0, true);
    }
    
    public static final v0 c(final x x, final x x2) {
        sg2.e.f((Object)x, "lowerBound");
        sg2.e.f((Object)x2, "upperBound");
        if (sg2.e.a((Object)x, (Object)x2)) {
            return (v0)x;
        }
        return (v0)new q(x, x2);
    }
    
    public static final x d(final j0 j0, final IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        sg2.e.f((Object)j0, "attributes");
        sg2.e.f((Object)integerLiteralTypeConstructor, "constructor");
        return h((k0)integerLiteralTypeConstructor, (List)EmptyList.INSTANCE, j0, false, (MemberScope)h.a(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, new String[] { "unknown integer literal type" }));
    }
    
    public static final x e(final j0 j0, final c c, final List<? extends n0> list) {
        sg2.e.f((Object)j0, "attributes");
        sg2.e.f((Object)c, "descriptor");
        sg2.e.f((Object)list, "arguments");
        final k0 m = ((e)c).m();
        sg2.e.e((Object)m, "descriptor.typeConstructor");
        return f(j0, m, list, false, null);
    }
    
    public static final x f(final j0 j0, final k0 k0, final List<? extends n0> list, final boolean b, final d d) {
        sg2.e.f((Object)j0, "attributes");
        sg2.e.f((Object)k0, "constructor");
        sg2.e.f((Object)list, "arguments");
        if (((yi2.a)j0).isEmpty() && list.isEmpty() && !b && k0.f() != null) {
            final e f = k0.f();
            sg2.e.c((Object)f);
            final x q = f.q();
            sg2.e.e((Object)q, "constructor.declarationDescriptor!!.defaultType");
            return q;
        }
        final e f2 = k0.f();
        Object o;
        if (f2 instanceof hh2.j0) {
            o = ((t)((e)f2).q()).p();
        }
        else if (f2 instanceof c) {
            Object i;
            if ((i = d) == null) {
                i = DescriptorUtilsKt.i(DescriptorUtilsKt.j((g)f2));
            }
            final boolean empty = list.isEmpty();
            w w = null;
            final w w2 = null;
            if (empty) {
                final c c = (c)f2;
                sg2.e.f((Object)c, "<this>");
                sg2.e.f(i, "kotlinTypeRefiner");
                w w3 = w2;
                if (c instanceof w) {
                    w3 = (w)c;
                }
                if (w3 == null || (o = w3.S((d)i)) == null) {
                    o = c.H();
                    sg2.e.e(o, "this.unsubstitutedMemberScope");
                }
            }
            else {
                final c c2 = (c)f2;
                final q0 b2 = m0.b.b(k0, (List)list);
                sg2.e.f((Object)c2, "<this>");
                sg2.e.f(i, "kotlinTypeRefiner");
                if (c2 instanceof w) {
                    w = (w)c2;
                }
                if (w == null || (o = w.F(b2, (d)i)) == null) {
                    o = c2.I(b2);
                    sg2.e.e(o, "this.getMemberScope(\n   \u2026ubstitution\n            )");
                }
            }
        }
        else if (f2 instanceof i0) {
            final ErrorScopeKind scope_FOR_ABBREVIATION_TYPE = ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE;
            final String f3 = ((g)f2).getName().f;
            sg2.e.e((Object)f3, "descriptor.name.toString()");
            o = h.a(scope_FOR_ABBREVIATION_TYPE, true, new String[] { f3 });
        }
        else {
            if (!(k0 instanceof IntersectionTypeConstructor)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unsupported classifier: ");
                sb.append(f2);
                sb.append(" for constructor: ");
                sb.append(k0);
                throw new IllegalStateException(sb.toString());
            }
            o = TypeIntersectionScope.a.a("member scope for intersection type", ((IntersectionTypeConstructor)k0).b);
        }
        return g(j0, k0, list, b, (MemberScope)o, (l<? super d, ? extends x>)new KotlinTypeFactory$simpleType.KotlinTypeFactory$simpleType$1(k0, (List)list, j0, b));
    }
    
    public static final x g(final j0 j0, final k0 k0, final List<? extends n0> list, final boolean b, final MemberScope memberScope, final l<? super d, ? extends x> l) {
        sg2.e.f((Object)j0, "attributes");
        sg2.e.f((Object)k0, "constructor");
        sg2.e.f((Object)list, "arguments");
        sg2.e.f((Object)memberScope, "memberScope");
        sg2.e.f((Object)l, "refinedTypeFactory");
        final y y = new y(k0, list, b, memberScope, l);
        Object o;
        if (((yi2.a)j0).isEmpty()) {
            o = y;
        }
        else {
            o = new z((x)y, j0);
        }
        return (x)o;
    }
    
    public static final x h(final k0 k0, final List list, final j0 j0, final boolean b, final MemberScope memberScope) {
        sg2.e.f((Object)j0, "attributes");
        sg2.e.f((Object)k0, "constructor");
        sg2.e.f((Object)list, "arguments");
        sg2.e.f((Object)memberScope, "memberScope");
        Object o = new y(k0, list, b, memberScope, new KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1(k0, list, j0, b, memberScope));
        if (!((yi2.a)j0).isEmpty()) {
            o = new z((x)o, j0);
        }
        return (x)o;
    }
    
    public static final class a
    {
    }
}
