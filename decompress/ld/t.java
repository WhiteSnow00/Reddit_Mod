// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import com.google.android.gms.common.api.b;
import wd.i;
import android.os.Binder;
import qd.a1;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.BasePendingResult;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import yd.a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import android.os.Parcel;
import android.content.Context;
import de.k;

public final class t extends k
{
    public final Context a;
    
    public t(final Context a) {
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
            n.b(this.a).a();
        }
        else {
            this.m();
            final c a = c.a(this.a);
            final GoogleSignInAccount b2 = a.b();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.q;
            if (b2 != null) {
                googleSignInOptions = a.c();
            }
            final Context a2 = this.a;
            yd.a.S0((Object)googleSignInOptions);
            final kd.a a3 = new kd.a(a2, googleSignInOptions);
            if (b2 != null) {
                final a1 h = ((b)a3).h;
                final Context a4 = ((b)a3).a;
                if (a3.d() == 3) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                ld.h.a.a("Revoking access", new Object[0]);
                final String e = c.a(a4).e("refreshToken");
                ld.h.b(a4);
                Object g;
                if (n != 0) {
                    if (e == null) {
                        final ud.a h2 = ld.e.h;
                        final Status status = new Status(4, (PendingIntent)null, (String)null);
                        yd.a.L0(status.f() ^ true, "Status code must not be SUCCESS");
                        g = new pd.e<pd.c>(status);
                        ((BasePendingResult<pd.c>)g).g((pd.c)status);
                    }
                    else {
                        final e e2 = new e(e);
                        new Thread(e2).start();
                        g = e2.g;
                    }
                }
                else {
                    g = new m(h);
                    h.c((com.google.android.gms.common.api.internal.a)g);
                }
                rd.n.a((BasePendingResult)g);
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
