// 
// Decompiled by Procyon v0.6.0
// 

package kh2;

import ng2.e;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import java.util.Collection;
import sh2.f;

public final class k
{
    public final f a;
    public final Collection<AnnotationQualifierApplicabilityType> b;
    public final boolean c;
    
    public k(final f f, final Collection collection) {
        this(f, collection, f.a == NullabilityQualifier.NOT_NULL);
    }
    
    public k(final f a, final Collection<? extends AnnotationQualifierApplicabilityType> b, final boolean c) {
        e.f((Object)b, "qualifierApplicabilityTypes");
        this.a = a;
        this.b = (Collection<AnnotationQualifierApplicabilityType>)b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k)) {
            return false;
        }
        final k k = (k)o;
        return e.a((Object)this.a, (Object)k.a) && e.a((Object)this.b, (Object)k.b) && this.c == k.c;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return (hashCode2 + hashCode * 31) * 31 + c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("JavaDefaultQualifiers(nullabilityQualifier=");
        t.append(this.a);
        t.append(", qualifierApplicabilityTypes=");
        t.append(this.b);
        t.append(", definitelyNotNull=");
        return d.n(t, this.c, ')');
    }
}
