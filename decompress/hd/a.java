// 
// Decompiled by Procyon v0.6.0
// 

package hd;

import qd.a1;
import com.google.android.gms.common.api.internal.BasePendingResult;
import rd.n;
import de.o;
import xe.x;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.a$c;
import android.app.Activity;
import com.google.android.gms.common.api.b;

public final class a extends b<gd.a.a>
{
    public a(final Activity activity, final hd.b b) {
        super(activity, (com.google.android.gms.common.api.a<a$c>)gd.a.a, (a$c)b, new h3.b(5));
    }
    
    public final x c(final Credential credential) {
        final de.n c = gd.a.c;
        final a1 h = super.h;
        c.getClass();
        yd.a.T0((Object)h, "client must not be null");
        final o o = new o(h, credential);
        h.c(o);
        return n.a((BasePendingResult)o);
    }
}
