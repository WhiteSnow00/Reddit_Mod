// 
// Decompiled by Procyon v0.6.0
// 

package od;

import pd.m;
import java.util.Arrays;
import com.google.android.gms.common.api.a$c;

public final class a<O extends a$c>
{
    public final int a;
    public final com.google.android.gms.common.api.a<O> b;
    public final O c;
    public final String d;
    
    public a(final com.google.android.gms.common.api.a<O> b, final O c, final String d) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = Arrays.hashCode(new Object[] { b, c, d });
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return m.a((Object)this.b, (Object)a.b) && m.a((Object)this.c, (Object)a.c) && m.a((Object)this.d, (Object)a.d);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
}
