// 
// Decompiled by Procyon v0.6.0
// 

package he;

import we.h;
import ih.q0;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import ih.l0;
import hh.f;
import ih.g0;
import mg.d0;
import hh.d;
import rd.a;

public final class mb extends gc
{
    public final int p;
    public final a q;
    
    public mb(final d q, final int p2) {
        this.p = p2;
        if (p2 != 1) {
            super(2);
            this.q = (a)q;
            d0.w("email cannot be null", q.f);
            d0.w("password cannot be null", q.g);
            return;
        }
        super(2);
        this.q = new xa(q);
    }
    
    public mb(final String s, final String s2) {
        super(this.p = 2);
        d0.w("token cannot be null or empty", s);
        this.q = new ta(s, s2);
    }
    
    public final String a() {
        switch (this.p) {
            default: {
                return "signInWithCustomToken";
            }
            case 1: {
                return "reauthenticateWithEmailLinkWithData";
            }
            case 0: {
                return "linkEmailAuthCredential";
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
                final ta ta = (ta)this.q;
                final fc b = super.b;
                sb.getClass();
                d0.y((Object)ta);
                d0.v(ta.f);
                d0.y((Object)b);
                final com.google.android.gms.internal.firebase_auth_api.h h2 = new com.google.android.gms.internal.firebase_auth_api.h(ta.f, ta.g);
                final q5 a = sb.a;
                final r5 r5 = new r5(b, sb.b);
                a.getClass();
                ((ai2.h)a.f).o0((com.google.android.gms.internal.firebase-auth-api.h)h2, new r5(a, r5));
                return;
            }
            case 1: {
                super.o = new p5(this, h);
                sb.c((xa)this.q, super.b);
                return;
            }
            case 0: {
                super.o = new p5(this, h);
                final d d = (d)this.q;
                final String f = d.f;
                final String g = d.g;
                d0.v(g);
                final la la = new la(f, g, super.d.d1());
                final fc b2 = super.b;
                sb.getClass();
                d0.v(la.f);
                d0.v(la.g);
                d0.v(la.h);
                d0.y((Object)b2);
                final q5 a2 = sb.a;
                final String f2 = la.f;
                final String g2 = la.g;
                final String h3 = la.h;
                final r5 r6 = new r5(b2, sb.b);
                a2.getClass();
                d0.v(f2);
                d0.v(g2);
                d0.v(h3);
                a2.e(h3, (jc)new j5(a2, f2, g2, r6));
            }
        }
    }
}
