// 
// Decompiled by Procyon v0.6.0
// 

package kh2;

import cg2.e;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;

public final class p
{
    public static final p d;
    public final ReportLevel a;
    public final e b;
    public final ReportLevel c;
    
    static {
        d = new p(ReportLevel.STRICT, 6);
    }
    
    public p(final ReportLevel reportLevel, final int n) {
        ReportLevel reportLevel2 = null;
        e e;
        if ((n & 0x2) != 0x0) {
            e = new e(0, 0);
        }
        else {
            e = null;
        }
        if ((n & 0x4) != 0x0) {
            reportLevel2 = reportLevel;
        }
        this(reportLevel, e, reportLevel2);
    }
    
    public p(final ReportLevel a, final e b, final ReportLevel c) {
        ng2.e.f((Object)a, "reportLevelBefore");
        ng2.e.f((Object)c, "reportLevelAfter");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof p)) {
            return false;
        }
        final p p = (p)o;
        return this.a == p.a && ng2.e.a((Object)this.b, (Object)p.b) && this.c == p.c;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final e b = this.b;
        int i;
        if (b == null) {
            i = 0;
        }
        else {
            i = b.i;
        }
        return this.c.hashCode() + (hashCode * 31 + i) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("JavaNullabilityAnnotationsStatus(reportLevelBefore=");
        t.append(this.a);
        t.append(", sinceVersion=");
        t.append(this.b);
        t.append(", reportLevelAfter=");
        t.append(this.c);
        t.append(')');
        return t.toString();
    }
}
