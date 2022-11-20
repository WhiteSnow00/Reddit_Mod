// 
// Decompiled by Procyon v0.6.0
// 

package he;

import android.os.RemoteException;
import td.a;
import hh.o;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import android.text.TextUtils;
import ih.i;

public final class jb implements jc
{
    public final int f;
    public final Object g;
    public final Object h;
    
    public jb(final int f, final Object h, final Object g) {
        this.f = f;
        this.h = h;
        this.g = g;
    }
    
    public final void a(final String s) {
        switch (this.f) {
            default: {
                ((r5)this.g).d(i.a(s));
                return;
            }
            case 0: {
                ((jc)this.g).a(s);
            }
        }
    }
    
    public final void c(cc cc) {
        switch (this.f) {
            default: {
                final qd qd = (qd)cc;
                if (!(TextUtils.isEmpty((CharSequence)qd.u) ^ true)) {
                    q5.h((q5)this.h, qd, (r5)this.g, (jc)this);
                }
                else {
                    ((r5)this.g).b(new eb(qd.u, qd.t, qd.b()));
                }
                return;
            }
            case 0: {
                final wd wd = (wd)cc;
                if (!TextUtils.isEmpty((CharSequence)wd.j)) {
                    final Status status = new Status(17025, (PendingIntent)null, (String)null);
                    cc = (cc)((kb)this.h).g;
                    final o o = new o((String)null, (String)null, wd.k, wd.j, (String)null, false, true);
                    cc.getClass();
                    try {
                        ((rb)((r5)cc).f).b(status, o);
                    }
                    catch (final RemoteException ex) {
                        ((a)((r5)cc).g).b((Exception)ex, "RemoteException when sending failure result.", new Object[0]);
                    }
                }
                else {
                    q5.g((q5)((kb)this.h).h, (r5)((kb)this.h).g, (jc)this.g, new bd(wd.g, wd.f, wd.h, "Bearer"), Boolean.valueOf(wd.i), "phone");
                }
            }
        }
    }
}
