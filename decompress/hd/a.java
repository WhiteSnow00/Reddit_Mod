// 
// Decompiled by Procyon v0.6.0
// 

package hd;

import pd.a1;
import ce.n;
import com.google.android.gms.common.api.internal.BasePendingResult;
import qd.m;
import ce.o;
import mg.d0;
import we.v;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.a$c;
import bu0.e;
import android.app.Activity;
import gd.a$a;
import com.google.android.gms.common.api.b;

public final class a extends b<a$a>
{
    public a(final Activity activity, final hd.b b) {
        super(activity, (com.google.android.gms.common.api.a<a$c>)gd.a.a, (a$c)b, new e(3));
    }
    
    public final v c(final Credential credential) {
        final n c = gd.a.c;
        final a1 h = super.h;
        c.getClass();
        d0.z((Object)h, "client must not be null");
        final o o = new o(h, credential);
        h.c((com.google.android.gms.common.api.internal.a)o);
        return m.a((BasePendingResult)o);
    }
}
