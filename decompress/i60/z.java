// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import ag0.a;
import ah2.f;

public final class z
{
    public final int a;
    public final String b;
    public final int c;
    
    public z(final int a, final String b, final int c) {
        f.f((Object)b, "triggerJsonName");
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
        return this.a == z.a && f.a((Object)this.b, (Object)z.b) && this.c == z.c;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.c) + ag0.a.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SurveyLocalDemoDataModel(id=");
        k.append(this.a);
        k.append(", triggerJsonName=");
        k.append(this.b);
        k.append(", desiredTriggerCount=");
        return d.k(k, this.c, ')');
    }
}
