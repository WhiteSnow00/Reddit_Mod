// 
// Decompiled by Procyon v0.6.0
// 

package he;

import we.h;
import ih.q0;
import ih.l0;
import hh.f;
import ih.g0;
import mg.d0;
import hh.o;
import hh.d;
import hh.b;
import rd.a;

public final class ob extends gc
{
    public final int p;
    public final a q;
    
    public ob(final b b, final String s) {
        this.p = 1;
        super(2);
        if (b != null) {
            this.q = new ra(i10.a.C0(b, s));
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }
    
    public ob(final d q) {
        this.p = 0;
        super(2);
        this.q = (a)q;
    }
    
    public ob(final o o, final String s) {
        super(this.p = 2);
        d0.y((Object)o);
        this.q = new za(o, s);
    }
    
    public final String a() {
        switch (this.p) {
            default: {
                return "signInWithPhoneNumber";
            }
            case 1: {
                return "signInWithCredential";
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
                ((g0)super.e).a(super.g, (f)b2);
                this.h((Object)new l0(b2));
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
                sb.d((za)this.q, super.b);
                return;
            }
            case 1: {
                super.o = new p5(this, h);
                sb.a((ra)this.q, super.b);
                return;
            }
            case 0: {
                super.o = new p5(this, h);
                final d d = (d)this.q;
                final f d2 = super.d;
                d.getClass();
                d.i = d2.d1();
                d.j = true;
                sb.c(new xa(d), super.b);
            }
        }
    }
}
