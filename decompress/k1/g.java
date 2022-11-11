// 
// Decompiled by Procyon v0.6.0
// 

package k1;

import sg2.e;
import hg2.j;
import rg2.l;
import n1.d;
import androidx.compose.ui.autofill.AutofillType;
import java.util.List;

public final class g
{
    public static final a e;
    public static int f;
    public final List<AutofillType> a;
    public d b;
    public final l<String, j> c;
    public final int d;
    
    static {
        e = new a();
    }
    
    public g() {
        throw null;
    }
    
    public g(final List a, final l c) {
        sg2.e.f((Object)a, "autofillTypes");
        this.a = a;
        this.b = null;
        this.c = c;
        synchronized (g.e) {
            final int d = ++g.f;
            monitorexit(g.e);
            this.d = d;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof g)) {
            return false;
        }
        final List<AutofillType> a = this.a;
        final g g = (g)o;
        return sg2.e.a((Object)a, (Object)g.a) && sg2.e.a((Object)this.b, (Object)g.b) && sg2.e.a((Object)this.c, (Object)g.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final d b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final l<String, j> c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    public static final class a
    {
    }
}
