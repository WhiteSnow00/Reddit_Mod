// 
// Decompiled by Procyon v0.6.0
// 

package kh2;

import zd.b;
import java.util.Collection;
import sh2.f;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import cg.d;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import java.util.List;
import yh2.c;

public final class a
{
    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final List<AnnotationQualifierApplicabilityType> e;
    public static final Map<c, k> f;
    public static final LinkedHashMap g;
    public static final Set<c> h;
    
    static {
        a = new c("javax.annotation.meta.TypeQualifierNickname");
        b = new c("javax.annotation.meta.TypeQualifier");
        c = new c("javax.annotation.meta.TypeQualifierDefault");
        d = new c("kotlin.annotations.jvm.UnderMigration");
        final AnnotationQualifierApplicabilityType field = AnnotationQualifierApplicabilityType.FIELD;
        final AnnotationQualifierApplicabilityType method_RETURN_TYPE = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
        final AnnotationQualifierApplicabilityType value_PARAMETER = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        final List<AnnotationQualifierApplicabilityType> list = e = cg.d.m3((Object[])new AnnotationQualifierApplicabilityType[] { field, method_RETURN_TYPE, value_PARAMETER, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE });
        final c c2 = t.c;
        final NullabilityQualifier not_NULL = NullabilityQualifier.NOT_NULL;
        g = kotlin.collections.c.A4(kotlin.collections.c.w4(new Pair[] { new Pair((Object)new c("javax.annotation.ParametersAreNullableByDefault"), (Object)new k(new f(NullabilityQualifier.NULLABLE, false), cg.d.l3((Object)value_PARAMETER))), new Pair((Object)new c("javax.annotation.ParametersAreNonnullByDefault"), (Object)new k(new f(not_NULL, false), cg.d.l3((Object)value_PARAMETER))) }), f = cg.d.r3(new Pair((Object)c2, (Object)new k(new f(not_NULL, false), list, false))));
        h = zd.b.b1(t.e, t.f);
    }
}
