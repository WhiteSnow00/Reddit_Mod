// 
// Decompiled by Procyon v0.6.0
// 

package xh2;

import al0.g7;
import sg2.e;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

public final class f
{
    public final NullabilityQualifier a;
    public final boolean b;
    
    public f(final NullabilityQualifier a, final boolean b) {
        e.f((Object)a, "qualifier");
        this.a = a;
        this.b = b;
    }
    
    public static f a(final f f, NullabilityQualifier a, boolean b, final int n) {
        if ((n & 0x1) != 0x0) {
            a = f.a;
        }
        if ((n & 0x2) != 0x0) {
            b = f.b;
        }
        f.getClass();
        e.f((Object)a, "qualifier");
        return new f(a, b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return this.a == f.a && this.b == f.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return hashCode * 31 + b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("NullabilityQualifierWithMigrationStatus(qualifier=");
        r.append(this.a);
        r.append(", isForWarningOnly=");
        return g7.m(r, this.b, ')');
    }
}
