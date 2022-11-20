// 
// Decompiled by Procyon v0.6.0
// 

package sd;

import pd.m;
import pd.p;
import t5.x;
import nd.d;
import pd.p$a;
import we.v;
import qd.q;
import com.google.android.gms.common.api.a$c;
import com.google.android.gms.common.api.b$a;
import android.content.Context;
import com.google.android.gms.common.api.a;
import qd.r;
import com.google.android.gms.common.api.b;

public final class c extends b<r>
{
    public static final a<r> k;
    
    static {
        k = new a("ClientTelemetry.API", (a.a)new sd.b(), new a.f());
    }
    
    public c(final Context context) {
        super(context, (com.google.android.gms.common.api.a<a$c>)c.k, (a$c)r.g, b$a.c);
    }
    
    public final v c(final q q) {
        final p$a p$a = new p$a();
        p$a.c = new d[] { ee.d.a };
        p$a.b = false;
        p$a.a = (m)new x((Object)q);
        return this.b(2, p$a.a());
    }
}
