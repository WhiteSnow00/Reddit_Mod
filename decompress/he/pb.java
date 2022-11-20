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
import hh.b;
import rd.a;

public final class pb extends gc
{
    public final int p;
    public final a q;
    
    public pb(final b b) {
        super(this.p = 2);
        this.q = i10.a.C0(b, (String)null);
    }
    
    public pb(final String s, final String s2, final String s3, final int p4) {
        this.p = p4;
        if (p4 != 1) {
            super(2);
            d0.w("email cannot be null or empty", s);
            d0.w("password cannot be null or empty", s2);
            this.q = new va(s, s2, s3);
            return;
        }
        super(2);
        d0.w("email cannot be null or empty", s);
        d0.w("password cannot be null or empty", s2);
        this.q = new va(s, s2, s3);
    }
    
    public final String a() {
        switch (this.p) {
            default: {
                return "linkFederatedCredential";
            }
            case 1: {
                return "signInWithEmailAndPassword";
            }
            case 0: {
                return "reauthenticateWithEmailPasswordWithData";
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
                ((g0)super.e).a(super.g, (f)b2);
                this.h((Object)new l0(b2));
                return;
            }
            case 0: {
                final q0 b3 = qb.b(super.c, super.h);
                if (super.d.z().equalsIgnoreCase(b3.g.f)) {
                    ((g0)super.e).a(super.g, (f)b3);
                    this.h((Object)new l0(b3));
                }
                else {
                    this.g(new Status(17024, (PendingIntent)null, (String)null));
                }
            }
        }
    }
    
    public final void c(final h h, final sb sb) {
        switch (this.p) {
            default: {
                super.o = new p5(this, h);
                final na na = new na(super.d.d1(), (od)this.q);
                final fc b = super.b;
                sb.getClass();
                d0.v(na.f);
                d0.y((Object)na.g);
                d0.y((Object)b);
                final q5 a = sb.a;
                final String f = na.f;
                final od g = na.g;
                final r5 r5 = new r5(b, sb.b);
                a.getClass();
                d0.v(f);
                d0.y((Object)g);
                a.e(f, (jc)new d9.b(a, g, r5));
                return;
            }
            case 1: {
                super.o = new p5(this, h);
                sb.b((va)this.q, super.b);
                return;
            }
            case 0: {
                super.o = new p5(this, h);
                sb.b((va)this.q, super.b);
            }
        }
    }
}
