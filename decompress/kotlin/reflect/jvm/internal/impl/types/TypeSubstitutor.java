// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.types;

import ti2.p;
import ti2.v0;
import ti2.k0;
import ej2.c0;
import ti2.x;
import java.util.ArrayList;
import ti2.s;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import ih2.e;
import ih2.g;
import ti2.s0;
import ti2.t0;
import kotlin.reflect.jvm.internal.impl.builtins.c;
import lg.e0;
import a4.a0;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.builtins.e$a;
import ti2.w;
import ti2.u0;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import vi2.h;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import hh2.j0;
import ti2.n0;
import ti2.p0;
import ui.b;
import ti2.n;
import ti2.m0;
import ti2.t;
import ti2.q0;

public final class TypeSubstitutor
{
    public static final TypeSubstitutor b;
    public final q0 a;
    
    static {
        b = e((q0)q0.a);
    }
    
    public TypeSubstitutor(final q0 a) {
        if (a != null) {
            this.a = a;
            return;
        }
        a(7);
        throw null;
    }
    
    public static /* synthetic */ void a(final int n) {
        String s = null;
        Label_0169: {
            Label_0166: {
                if (n != 1 && n != 2 && n != 8 && n != 34 && n != 37) {
                    switch (n) {
                        default: {
                            switch (n) {
                                default: {
                                    switch (n) {
                                        default: {
                                            switch (n) {
                                                default: {
                                                    s = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                                    break Label_0169;
                                                }
                                                case 40:
                                                case 41:
                                                case 42: {
                                                    break Label_0166;
                                                }
                                            }
                                            break;
                                        }
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32: {
                                            break Label_0166;
                                        }
                                    }
                                    break;
                                }
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25: {
                                    break Label_0166;
                                }
                            }
                            break;
                        }
                        case 11:
                        case 12:
                        case 13: {
                            break;
                        }
                    }
                }
            }
            s = "@NotNull method %s.%s must not return null";
        }
        int n2 = 0;
        Label_0335: {
            Label_0333: {
                if (n != 1 && n != 2 && n != 8 && n != 34 && n != 37) {
                    switch (n) {
                        default: {
                            switch (n) {
                                default: {
                                    switch (n) {
                                        default: {
                                            switch (n) {
                                                default: {
                                                    n2 = 3;
                                                    break Label_0335;
                                                }
                                                case 40:
                                                case 41:
                                                case 42: {
                                                    break Label_0333;
                                                }
                                            }
                                            break;
                                        }
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32: {
                                            break Label_0333;
                                        }
                                    }
                                    break;
                                }
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25: {
                                    break Label_0333;
                                }
                            }
                            break;
                        }
                        case 11:
                        case 12:
                        case 13: {
                            break;
                        }
                    }
                }
            }
            n2 = 2;
        }
        final Object[] array = new Object[n2];
        switch (n) {
            default: {
                array[0] = "substitution";
                break;
            }
            case 39: {
                array[0] = "projectionKind";
                break;
            }
            case 35:
            case 38: {
                array[0] = "typeParameterVariance";
                break;
            }
            case 33: {
                array[0] = "annotations";
                break;
            }
            case 27: {
                array[0] = "substituted";
                break;
            }
            case 26: {
                array[0] = "originalType";
                break;
            }
            case 18:
            case 28: {
                array[0] = "originalProjection";
                break;
            }
            case 16:
            case 17:
            case 36: {
                array[0] = "typeProjection";
                break;
            }
            case 10:
            case 15: {
                array[0] = "howThisTypeIsUsed";
                break;
            }
            case 9:
            case 14: {
                array[0] = "type";
                break;
            }
            case 6: {
                array[0] = "context";
                break;
            }
            case 5: {
                array[0] = "substitutionContext";
                break;
            }
            case 4: {
                array[0] = "second";
                break;
            }
            case 3: {
                array[0] = "first";
                break;
            }
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42: {
                array[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            }
        }
        Label_0869: {
            if (n != 1) {
                if (n != 2) {
                    if (n != 8) {
                        if (n != 34) {
                            Label_0832: {
                                if (n != 37) {
                                    switch (n) {
                                        default: {
                                            switch (n) {
                                                default: {
                                                    switch (n) {
                                                        default: {
                                                            switch (n) {
                                                                default: {
                                                                    array[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                                    break Label_0869;
                                                                }
                                                                case 40:
                                                                case 41:
                                                                case 42: {
                                                                    break Label_0832;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        case 29:
                                                        case 30:
                                                        case 31:
                                                        case 32: {
                                                            array[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                                            break Label_0869;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                case 23:
                                                case 24:
                                                case 25: {
                                                    array[1] = "unsafeSubstitute";
                                                    break Label_0869;
                                                }
                                            }
                                            break;
                                        }
                                        case 11:
                                        case 12:
                                        case 13: {
                                            array[1] = "safeSubstitute";
                                            break Label_0869;
                                        }
                                    }
                                }
                            }
                            array[1] = "combine";
                        }
                        else {
                            array[1] = "filterOutUnsafeVariance";
                        }
                    }
                    else {
                        array[1] = "getSubstitution";
                    }
                }
                else {
                    array[1] = "replaceWithContravariantApproximatingSubstitution";
                }
            }
            else {
                array[1] = "replaceWithNonApproximatingSubstitution";
            }
        }
        while (true) {
            switch (n) {
                default: {
                    array[2] = "create";
                }
                case 1:
                case 2:
                case 8:
                case 11:
                case 12:
                case 13:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 29:
                case 30:
                case 31:
                case 32:
                case 34:
                case 37:
                case 40:
                case 41:
                case 42: {
                    final String format = String.format(s, array);
                    Label_1308: {
                        if (n != 1 && n != 2 && n != 8 && n != 34 && n != 37) {
                            switch (n) {
                                default: {
                                    switch (n) {
                                        default: {
                                            switch (n) {
                                                default: {
                                                    switch (n) {
                                                        default: {
                                                            throw new IllegalArgumentException(format);
                                                        }
                                                        case 40:
                                                        case 41:
                                                        case 42: {
                                                            break Label_1308;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 29:
                                                case 30:
                                                case 31:
                                                case 32: {
                                                    break Label_1308;
                                                }
                                            }
                                            break;
                                        }
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25: {
                                            break Label_1308;
                                        }
                                    }
                                    break;
                                }
                                case 11:
                                case 12:
                                case 13: {
                                    break;
                                }
                            }
                        }
                    }
                    throw new IllegalStateException(format);
                }
                case 35:
                case 36:
                case 38:
                case 39: {
                    array[2] = "combine";
                    continue;
                }
                case 33: {
                    array[2] = "filterOutUnsafeVariance";
                    continue;
                }
                case 26:
                case 27:
                case 28: {
                    array[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                    continue;
                }
                case 18: {
                    array[2] = "unsafeSubstitute";
                    continue;
                }
                case 17: {
                    array[2] = "substituteWithoutApproximation";
                    continue;
                }
                case 14:
                case 15:
                case 16: {
                    array[2] = "substitute";
                    continue;
                }
                case 9:
                case 10: {
                    array[2] = "safeSubstitute";
                    continue;
                }
                case 7: {
                    array[2] = "<init>";
                    continue;
                }
                case 3:
                case 4: {
                    array[2] = "createChainedSubstitutor";
                    continue;
                }
            }
            break;
        }
    }
    
    public static Variance b(final Variance variance, final Variance variance2) {
        if (variance == null) {
            a(38);
            throw null;
        }
        if (variance2 == null) {
            a(39);
            throw null;
        }
        final Variance invariant = Variance.INVARIANT;
        if (variance == invariant) {
            if (variance2 != null) {
                return variance2;
            }
            a(40);
            throw null;
        }
        else if (variance2 == invariant) {
            if (variance != null) {
                return variance;
            }
            a(41);
            throw null;
        }
        else {
            if (variance != variance2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Variance conflict: type parameter variance '");
                sb.append(variance);
                sb.append("' and ");
                sb.append("projection kind '");
                sb.append(variance2);
                sb.append("' cannot be combined");
                throw new AssertionError((Object)sb.toString());
            }
            if (variance2 != null) {
                return variance2;
            }
            a(42);
            throw null;
        }
    }
    
    public static VarianceConflictType c(final Variance variance, final Variance variance2) {
        final Variance in_VARIANCE = Variance.IN_VARIANCE;
        if (variance == in_VARIANCE && variance2 == Variance.OUT_VARIANCE) {
            return VarianceConflictType.OUT_IN_IN_POSITION;
        }
        if (variance == Variance.OUT_VARIANCE && variance2 == in_VARIANCE) {
            return VarianceConflictType.IN_IN_OUT_POSITION;
        }
        return VarianceConflictType.NO_CONFLICT;
    }
    
    public static TypeSubstitutor d(final t t) {
        if (t != null) {
            return e(m0.b.b(t.I0(), t.G0()));
        }
        a(6);
        throw null;
    }
    
    public static TypeSubstitutor e(final q0 q0) {
        if (q0 != null) {
            return new TypeSubstitutor(q0);
        }
        a(0);
        throw null;
    }
    
    public static TypeSubstitutor f(q0 o, final q0 q0) {
        if (o == null) {
            a(3);
            throw null;
        }
        if (q0 != null) {
            final int d = n.d;
            if (((q0)o).e()) {
                o = q0;
            }
            else if (!q0.e()) {
                o = new n((q0)o, q0);
            }
            return e((q0)o);
        }
        a(4);
        throw null;
    }
    
    public static String j(final Object o) {
        try {
            return o.toString();
        }
        finally {
            final Throwable t;
            if (!ui.b.J(t)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("[Exception while computing toString(): ");
                sb.append(t);
                sb.append("]");
                return sb.toString();
            }
            throw (RuntimeException)t;
        }
    }
    
    public final q0 g() {
        final q0 a = this.a;
        if (a != null) {
            return a;
        }
        a(8);
        throw null;
    }
    
    public final boolean h() {
        return this.a.e();
    }
    
    public final t i(t type, final Variance variance) {
        if (type != null) {
            if (variance != null) {
                if (this.h()) {
                    if (type != null) {
                        return type;
                    }
                    a(11);
                    throw null;
                }
                else {
                    try {
                        type = this.l((n0)new p0(type, variance), null, 0).getType();
                        if (type != null) {
                            return type;
                        }
                        a(12);
                        throw null;
                    }
                    catch (final SubstitutionException ex) {
                        return (t)h.c(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, new String[] { ex.getMessage() });
                    }
                }
            }
            a(10);
            throw null;
        }
        a(9);
        throw null;
    }
    
    public final t k(t type, final Variance variance) {
        final t t = null;
        if (type == null) {
            a(14);
            throw null;
        }
        if (variance != null) {
            Object o = new p0(this.g().f(type, variance), variance);
            if (!this.h()) {
                try {
                    o = this.l((n0)o, null, 0);
                }
                catch (final SubstitutionException ex) {
                    o = null;
                }
            }
            if (this.a.a() || this.a.b()) {
                o = CapturedTypeApproximationKt.b((n0)o, this.a.b());
            }
            if (o == null) {
                type = t;
            }
            else {
                type = ((n0)o).getType();
            }
            return type;
        }
        a(15);
        throw null;
    }
    
    public final n0 l(n0 m, final j0 j0, int n) throws SubstitutionException {
        final x x = null;
        if (m == null) {
            a(18);
            throw null;
        }
        final q0 a = this.a;
        if (n > 100) {
            final StringBuilder r = a.r("Recursion too deep. Most likely infinite loop while substituting ");
            r.append(j(m));
            r.append("; substitution: ");
            r.append(j(a));
            throw new IllegalStateException(r.toString());
        }
        if (((n0)m).b()) {
            return (n0)m;
        }
        final t type = ((n0)m).getType();
        if (!(type instanceof u0)) {
            Object o = m;
            if (!lw0.b.i1(type)) {
                if (type.L0() instanceof w) {
                    o = m;
                }
                else {
                    Object d = this.a.d(type);
                    if (d != null) {
                        if (type.getAnnotations().S(e$a.y)) {
                            final k0 i0 = ((n0)d).getType().I0();
                            if (i0 instanceof NewCapturedTypeConstructor) {
                                final n0 a2 = ((NewCapturedTypeConstructor)i0).a;
                                final Variance c = a2.c();
                                final VarianceConflictType c2 = c(((n0)m).c(), c);
                                final VarianceConflictType out_IN_IN_POSITION = VarianceConflictType.OUT_IN_IN_POSITION;
                                if (c2 == out_IN_IN_POSITION) {
                                    d = new p0(a2.getType());
                                }
                                else if (j0 != null) {
                                    if (c(j0.i(), c) == out_IN_IN_POSITION) {
                                        d = new p0(a2.getType());
                                    }
                                }
                            }
                        }
                    }
                    else {
                        d = null;
                    }
                    final Variance c3 = ((n0)m).c();
                    int k = 0;
                    if (d == null && a0.i0(type)) {
                        final v0 l0 = type.L0();
                        ti2.h h;
                        if (l0 instanceof ti2.h) {
                            h = (ti2.h)l0;
                        }
                        else {
                            h = null;
                        }
                        if (h == null || !h.E0()) {
                            final p p3 = a0.p(type);
                            final p0 p4 = new p0((t)p3.g, c3);
                            ++n;
                            final n0 l2 = this.l((n0)p4, j0, n);
                            final n0 l3 = this.l((n0)new p0((t)p3.h, c3), j0, n);
                            final Variance c4 = l2.c();
                            if (l2.getType() == p3.g && l3.getType() == p3.h) {
                                return (n0)m;
                            }
                            return (n0)new p0((t)KotlinTypeFactory.c(e0.p(l2.getType()), e0.p(l3.getType())), c4);
                        }
                    }
                    o = m;
                    if (!c.F(type)) {
                        if (ui.b.H(type)) {
                            o = m;
                        }
                        else if (d != null) {
                            final VarianceConflictType c5 = c(c3, ((n0)d).c());
                            if (!(type.I0() instanceof gi2.b)) {
                                n = TypeSubstitutor$a.a[c5.ordinal()];
                                if (n == 1) {
                                    throw new SubstitutionException("Out-projection in in-position");
                                }
                                if (n == 2) {
                                    return (n0)new p0((t)type.I0().o().p(), Variance.OUT_VARIANCE);
                                }
                            }
                            final v0 l4 = type.L0();
                            ti2.h h2;
                            if (l4 instanceof ti2.h) {
                                h2 = (ti2.h)l4;
                            }
                            else {
                                h2 = null;
                            }
                            if (h2 == null || !h2.E0()) {
                                h2 = null;
                            }
                            if (((n0)d).b()) {
                                return (n0)d;
                            }
                            t t;
                            if (h2 != null) {
                                t = h2.F(((n0)d).getType());
                            }
                            else {
                                t = t0.k(((n0)d).getType(), type.J0());
                            }
                            t m2 = t;
                            if (!type.getAnnotations().isEmpty()) {
                                Object c6 = this.a.c(type.getAnnotations());
                                if (c6 == null) {
                                    a(33);
                                    throw null;
                                }
                                if (((e)c6).S(e$a.y)) {
                                    c6 = new g((e)c6, new s0());
                                }
                                m2 = TypeUtilsKt.m(t, (e)new CompositeAnnotations((List)kotlin.collections.b.v1(new e[] { t.getAnnotations(), (e)c6 })));
                            }
                            Variance b = c3;
                            if (c5 == VarianceConflictType.NO_CONFLICT) {
                                b = b(c3, ((n0)d).c());
                            }
                            return (n0)new p0(m2, b);
                        }
                        else {
                            final t type2 = ((n0)m).getType();
                            final Variance c7 = ((n0)m).c();
                            if (type2.I0().f() instanceof j0) {
                                o = m;
                            }
                            else {
                                final v0 l5 = type2.L0();
                                ti2.a a3;
                                if (l5 instanceof ti2.a) {
                                    a3 = (ti2.a)l5;
                                }
                                else {
                                    a3 = null;
                                }
                                Object h3;
                                if (a3 != null) {
                                    h3 = a3.h;
                                }
                                else {
                                    h3 = null;
                                }
                                Object k2 = x;
                                if (h3 != null) {
                                    final q0 a4 = this.a;
                                    TypeSubstitutor typeSubstitutor;
                                    if (a4 instanceof s && a4.b()) {
                                        final s s = (s)this.a;
                                        typeSubstitutor = new TypeSubstitutor((q0)new s(s.b, s.c, false));
                                    }
                                    else {
                                        typeSubstitutor = this;
                                    }
                                    k2 = typeSubstitutor.k((t)h3, Variance.INVARIANT);
                                }
                                final List parameters = type2.I0().getParameters();
                                final List g0 = type2.G0();
                                final ArrayList list = new ArrayList<Object>(parameters.size());
                                boolean b2 = false;
                                while (k < parameters.size()) {
                                    final j0 j2 = parameters.get(k);
                                    final n0 n2 = g0.get(k);
                                    final n0 l6 = this.l(n2, j2, n + 1);
                                    final int n3 = TypeSubstitutor$a.a[c(j2.i(), l6.c()).ordinal()];
                                    if (n3 != 1 && n3 != 2) {
                                        if (n3 != 3) {
                                            m = l6;
                                        }
                                        else {
                                            final Variance i2 = j2.i();
                                            final Variance invariant = Variance.INVARIANT;
                                            m = l6;
                                            if (i2 != invariant) {
                                                m = l6;
                                                if (!l6.b()) {
                                                    m = new p0(l6.getType(), invariant);
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        m = t0.m(j2);
                                    }
                                    if (m != n2) {
                                        b2 = true;
                                    }
                                    list.add(m);
                                    ++k;
                                }
                                List<Object> list2;
                                if (!b2) {
                                    list2 = g0;
                                }
                                else {
                                    list2 = (List<Object>)list;
                                }
                                final e c8 = this.a.c(type2.getAnnotations());
                                sg2.e.f((Object)list2, "newArguments");
                                sg2.e.f((Object)c8, "newAnnotations");
                                Object o2;
                                final t t2 = (t)(o2 = e0.h0(type2, (List)list2, c8, 4));
                                if (t2 instanceof x) {
                                    o2 = t2;
                                    if (k2 instanceof x) {
                                        o2 = c0.w4((x)t2, (x)k2);
                                    }
                                }
                                o = new p0((t)o2, c7);
                            }
                        }
                    }
                }
            }
            return (n0)o;
        }
        final u0 u0 = (u0)type;
        final v0 s2 = u0.S();
        final t p5 = u0.p0();
        final n0 l7 = this.l((n0)new p0((t)s2, ((n0)m).c()), j0, n + 1);
        if (l7.b()) {
            return l7;
        }
        return (n0)new p0((t)vl.a.L0(l7.getType().L0(), this.k(p5, ((n0)m).c())), l7.c());
    }
    
    public static final class SubstitutionException extends Exception
    {
        public SubstitutionException(final String s) {
            super(s);
        }
    }
    
    public enum VarianceConflictType
    {
        IN_IN_OUT_POSITION, 
        NO_CONFLICT, 
        OUT_IN_IN_POSITION;
    }
}
