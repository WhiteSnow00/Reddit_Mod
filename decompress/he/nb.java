// 
// Decompiled by Procyon v0.6.0
// 

package he;

import mg.d0;
import we.h;
import ih.q0;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import ih.l0;
import hh.f;
import ih.g0;
import hh.o;
import hh.d;
import rd.a;

public final class nb extends gc
{
    public final int p;
    public final a q;
    
    public nb(final d d) {
        super(this.p = 2);
        this.q = new xa(d);
    }
    
    public nb(final o q) {
        this.p = 0;
        super(2);
        this.q = (a)q;
    }
    
    public nb(final o o, final String s) {
        this.p = 1;
        super(2);
        if (o != null) {
            o.j = false;
            this.q = new za(o, s);
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }
    
    public final String a() {
        switch (this.p) {
            default: {
                return "sendSignInLinkToEmail";
            }
            case 1: {
                return "reauthenticateWithPhoneCredentialWithData";
            }
            case 0: {
                return "linkPhoneAuthCredential";
            }
        }
    }
    
    public final void b() {
        switch (this.p) {
            default: {
                final q0 b = qb.b(super.c, super.h);
                ((g0)super.e).a(super.g, (f)b);
                this.h((Object)new l0(b));
                return;
            }
            case 1: {
                final q0 b2 = qb.b(super.c, super.h);
                if (super.d.z().equalsIgnoreCase(b2.g.f)) {
                    ((g0)super.e).a(super.g, (f)b2);
                    this.h((Object)new l0(b2));
                }
                else {
                    this.g(new Status(17024, (PendingIntent)null, (String)null));
                }
                return;
            }
            case 0: {
                final q0 b3 = qb.b(super.c, super.h);
                ((g0)super.e).a(super.g, (f)b3);
                this.h((Object)new l0(b3));
            }
        }
    }
    
    public final void c(final h h, final sb sb) {
        switch (this.p) {
            default: {
                super.o = new p5(this, h);
                sb.c((xa)this.q, super.b);
                return;
            }
            case 1: {
                super.o = new p5(this, h);
                sb.d((za)this.q, super.b);
                return;
            }
            case 0: {
                super.o = new p5(this, h);
                final pa pa = new pa((o)this.q, super.d.d1());
                final fc b = super.b;
                sb.getClass();
                d0.y((Object)b);
                final o g = pa.g;
                d0.y((Object)g);
                final String f = pa.f;
                d0.v(f);
                final q5 a = sb.a;
                final vd c = g2.c(g);
                final r5 r5 = new r5(b, sb.b);
                a.getClass();
                d0.v(f);
                a.e(f, (jc)new kb(a, c, r5));
            }
        }
    }
}
