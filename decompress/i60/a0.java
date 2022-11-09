// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import androidx.viewpager.widget.c;
import ah2.f;

public final class a0
{
    public final String a;
    public final long b;
    
    public a0(final String a, final long b) {
        f.f((Object)a, "surveyId");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a0)) {
            return false;
        }
        final a0 a0 = (a0)o;
        return f.a((Object)this.a, (Object)a0.a) && this.b == a0.b;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SurveyStatusDataModel(surveyId=");
        k.append(this.a);
        k.append(", triggerCount=");
        return c.k(k, this.b, ')');
    }
}
