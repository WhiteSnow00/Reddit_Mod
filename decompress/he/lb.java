// 
// Decompiled by Procyon v0.6.0
// 

package he;

import we.h;
import ih.q0;
import ih.u;
import android.text.TextUtils;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import ih.l0;
import hh.f;
import ih.g0;
import mg.d0;
import hh.b;
import rd.a;

public final class lb extends gc
{
    public final int p;
    public final a q;
    
    public lb(final b b, final String s) {
        this.p = 1;
        super(2);
        if (b != null) {
            final od c0 = i10.a.C0(b, s);
            c0.o = false;
            this.q = new ra(c0);
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }
    
    public lb(final String s) {
        this.p = 0;
        super(1);
        d0.w("refresh token cannot be null", s);
        this.q = new ja(s);
    }
    
    public final String a() {
        switch (this.p) {
            default: {
                return "reauthenticateWithCredentialWithData";
            }
            case 0: {
                return "getAccessToken";
            }
        }
    }
    
    public final void b() {
        switch (this.p) {
            default: {
                final q0 b = qb.b(super.c, super.h);
                if (super.d.z().equalsIgnoreCase(b.g.f)) {
                    ((g0)super.e).a(super.g, (f)b);
                    this.h((Object)new l0(b));
                }
                else {
                    this.g(new Status(17024, (PendingIntent)null, (String)null));
                }
                return;
            }
            case 0: {
                if (TextUtils.isEmpty((CharSequence)super.g.f)) {
                    final bd g = super.g;
                    final String f = ((ja)this.q).f;
                    g.getClass();
                    d0.v(f);
                    g.f = f;
                }
                ((g0)super.e).a(super.g, super.d);
                this.h((Object)u.a(super.g.g));
            }
        }
    }
    
    public final void c(final h h, final sb sb) {
        switch (this.p) {
            default: {
                super.o = new p5(this, h);
                sb.a((ra)this.q, super.b);
                return;
            }
            case 0: {
                super.o = new p5(this, h);
                final ja ja = (ja)this.q;
                final fc b = super.b;
                sb.getClass();
                d0.y((Object)ja);
                d0.y((Object)b);
                d0.v(ja.f);
                final q5 a = sb.a;
                final String f = ja.f;
                final r5 r5 = new r5(b, sb.b);
                a.getClass();
                d0.v(f);
                ((ai2.h)a.f).k0(new r5(f), (jc)new q5(r5));
            }
        }
    }
}
