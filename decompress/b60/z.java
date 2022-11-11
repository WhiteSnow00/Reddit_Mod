// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import sg2.e;

public final class z
{
    public final int a;
    public final String b;
    public final int c;
    
    public z(final int a, final String b, final int c) {
        e.f((Object)b, "triggerJsonName");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof z)) {
            return false;
        }
        final z z = (z)o;
        return this.a == z.a && e.a((Object)this.b, (Object)z.b) && this.c == z.c;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.c) + b.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SurveyLocalDemoDataModel(id=");
        r.append(this.a);
        r.append(", triggerJsonName=");
        r.append(this.b);
        r.append(", desiredTriggerCount=");
        return d.l(r, this.c, ')');
    }
}
