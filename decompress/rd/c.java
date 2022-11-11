// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import od.m;
import od.p;
import bg.k;
import md.d;
import od.p$a;
import ve.x;
import pd.q;
import com.google.android.gms.common.api.a$c;
import com.google.android.gms.common.api.b$a;
import android.content.Context;
import com.google.android.gms.common.api.a;
import pd.s;
import com.google.android.gms.common.api.b;

public final class c extends b<s>
{
    public static final a<s> k;
    
    static {
        k = new a("ClientTelemetry.API", (a.a)new rd.b(), new a.f());
    }
    
    public c(final Context context) {
        super(context, (com.google.android.gms.common.api.a<a$c>)c.k, (a$c)s.g, b$a.c);
    }
    
    public final x c(final q q) {
        final p$a p$a = new p$a();
        p$a.c = new d[] { de.d.a };
        p$a.b = false;
        p$a.a = (m)new k((Object)q, 6);
        return this.b(2, p$a.a());
    }
}
