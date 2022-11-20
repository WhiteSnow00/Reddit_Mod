// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import vd.i;
import android.os.Binder;
import pd.a1;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.BasePendingResult;
import od.c;
import od.e;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import kd.a;
import mg.d0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import android.os.Parcel;
import android.content.Context;
import ce.k;

public final class s extends k
{
    public final Context a;
    
    public s(final Context a) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.a = a;
    }
    
    public final boolean k(int n, final Parcel parcel, final Parcel parcel2) {
        boolean b = false;
        if (n != 1) {
            if (n != 2) {
                return b;
            }
            this.m();
            m.b(this.a).a();
        }
        else {
            this.m();
            final b a = ld.b.a(this.a);
            final GoogleSignInAccount b2 = a.b();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.q;
            if (b2 != null) {
                googleSignInOptions = a.c();
            }
            final Context a2 = this.a;
            d0.y((Object)googleSignInOptions);
            final a a3 = new a(a2, googleSignInOptions);
            if (b2 != null) {
                final a1 h = ((com.google.android.gms.common.api.b)a3).h;
                final Context a4 = ((com.google.android.gms.common.api.b)a3).a;
                if (a3.d() == 3) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                g.a.a("Revoking access", new Object[0]);
                final String e = ld.b.a(a4).e("refreshToken");
                g.b(a4);
                Object g;
                if (n != 0) {
                    if (e == null) {
                        final td.a h2 = d.h;
                        final Status status = new Status(4, (PendingIntent)null, (String)null);
                        d0.q(status.g() ^ true, "Status code must not be SUCCESS");
                        g = new e(status);
                        ((BasePendingResult<c>)g).g((c)status);
                    }
                    else {
                        final d d = new d(e);
                        new Thread((Runnable)d).start();
                        g = d.g;
                    }
                }
                else {
                    g = new l(h);
                    h.c((com.google.android.gms.common.api.internal.a)g);
                }
                qd.m.a((BasePendingResult)g);
            }
            else {
                a3.c();
            }
        }
        b = true;
        return b;
    }
    
    public final void m() {
        if (i.a(this.a, Binder.getCallingUid())) {
            return;
        }
        final int callingUid = Binder.getCallingUid();
        final StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }
}
