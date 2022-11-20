// 
// Decompiled by Procyon v0.6.0
// 

package w0;

import mg.d0;
import v0.i;
import java.text.BreakIterator;
import ng2.e;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import i2.o;
import o2.l;
import i2.n;

public abstract class a<T extends a<T>>
{
    public final i2.a a;
    public final long b;
    public final n c;
    public final l d;
    public final k e;
    public long f;
    public i2.a g;
    
    public a(final i2.a a, final long n, final n c, final l d, final k e) {
        this.a = a;
        this.b = n;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = n;
        this.g = a;
    }
    
    public final Integer a() {
        final n c = this.c;
        Integer value;
        if (c != null) {
            value = this.d.a(c.e(c.f(this.d.b(o.e(this.f))), true));
        }
        else {
            value = null;
        }
        return value;
    }
    
    public final Integer b() {
        final n c = this.c;
        Integer value;
        if (c != null) {
            value = this.d.a(c.j(c.f(this.d.b(o.f(this.f)))));
        }
        else {
            value = null;
        }
        return value;
    }
    
    public final int c(final n n, int n2) {
        if (n2 >= this.a.length()) {
            return this.a.length();
        }
        int n3 = this.g.f.length() - 1;
        if (n2 <= n3) {
            n3 = n2;
        }
        final long n4 = n.n(n3);
        if (o.c(n4) <= n2) {
            n2 = this.c(n, n2 + 1);
        }
        else {
            n2 = this.d.a(o.c(n4));
        }
        return n2;
    }
    
    public final int d(final n n, int n2) {
        if (n2 < 0) {
            return 0;
        }
        int n3 = this.g.f.length() - 1;
        if (n2 <= n3) {
            n3 = n2;
        }
        final int n4 = (int)(n.n(n3) >> 32);
        if (n4 >= n2) {
            n2 = this.d(n, n2 - 1);
        }
        else {
            n2 = this.d.a(n4);
        }
        return n2;
    }
    
    public final boolean e() {
        final n c = this.c;
        ResolvedTextDirection m;
        if (c != null) {
            m = c.m(o.c(this.f));
        }
        else {
            m = null;
        }
        return m != ResolvedTextDirection.Rtl;
    }
    
    public final int f(final n n, int l) {
        final int b = this.d.b(o.c(this.f));
        final k e = this.e;
        if (e.a == null) {
            e.a = n.c(b).a;
        }
        l += n.f(b);
        if (l < 0) {
            return 0;
        }
        if (l >= n.b.f) {
            return this.g.f.length();
        }
        final float d = n.d(l);
        final float n2 = 1;
        final Float a = this.e.a;
        ng2.e.c((Object)a);
        final float floatValue = a.floatValue();
        if ((this.e() && floatValue >= n.i(l)) || (!this.e() && floatValue <= n.h(l))) {
            return n.e(l, true);
        }
        l = n.l(vl.a.T(a.floatValue(), d - n2));
        return this.d.a(l);
    }
    
    public final void g() {
        this.e.a = null;
        if (this.g.f.length() > 0) {
            if (this.e()) {
                this.l();
            }
            else {
                this.i();
            }
        }
    }
    
    public final void h() {
        this.e.a = null;
        if (this.g.f.length() > 0) {
            if (this.e()) {
                this.n();
            }
            else {
                this.k();
            }
        }
    }
    
    public final void i() {
        this.e.a = null;
        if (this.g.f.length() > 0) {
            final String f = this.g.f;
            final int c = o.c(this.f);
            ng2.e.f((Object)f, "<this>");
            final BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(f);
            final int following = characterInstance.following(c);
            if (following != -1) {
                this.w(following, following);
            }
        }
    }
    
    public final void j() {
        this.e.a = null;
        if (this.g.f.length() > 0) {
            final int c = i.c(o.e(this.f), (CharSequence)this.g.f);
            this.w(c, c);
        }
    }
    
    public final void k() {
        final k e = this.e;
        Number value = null;
        e.a = null;
        if (this.g.f.length() > 0) {
            final n c = this.c;
            if (c != null) {
                value = this.c(c, this.d.b(o.c(this.f)));
            }
            if (value != null) {
                final int intValue = value.intValue();
                this.w(intValue, intValue);
            }
        }
    }
    
    public final void l() {
        this.e.a = null;
        if (this.g.f.length() > 0) {
            final String f = this.g.f;
            final int c = o.c(this.f);
            ng2.e.f((Object)f, "<this>");
            final BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(f);
            final int preceding = characterInstance.preceding(c);
            if (preceding != -1) {
                this.w(preceding, preceding);
            }
        }
    }
    
    public final void m() {
        this.e.a = null;
        final int length = this.g.f.length();
        final int n = 0;
        if (length > 0) {
            final String f = this.g.f;
            int f2 = o.f(this.f);
            ng2.e.f((Object)f, "<this>");
            --f2;
            int n2;
            while (true) {
                n2 = n;
                if (f2 <= 0) {
                    break;
                }
                final int n3 = f2 - 1;
                if (f.charAt(n3) == '\n') {
                    n2 = f2;
                    break;
                }
                f2 = n3;
            }
            this.w(n2, n2);
        }
    }
    
    public final void n() {
        final k e = this.e;
        Number value = null;
        e.a = null;
        if (this.g.f.length() > 0) {
            final n c = this.c;
            if (c != null) {
                value = this.d(c, this.d.b(o.c(this.f)));
            }
            if (value != null) {
                final int intValue = value.intValue();
                this.w(intValue, intValue);
            }
        }
    }
    
    public final void o() {
        this.e.a = null;
        if (this.g.f.length() > 0) {
            if (this.e()) {
                this.i();
            }
            else {
                this.l();
            }
        }
    }
    
    public final void p() {
        this.e.a = null;
        if (this.g.f.length() > 0) {
            if (this.e()) {
                this.k();
            }
            else {
                this.n();
            }
        }
    }
    
    public final void q() {
        this.e.a = null;
        if (this.g.f.length() > 0) {
            final int length = this.g.f.length();
            this.w(length, length);
        }
    }
    
    public final void r() {
        this.e.a = null;
        if (this.g.f.length() > 0) {
            final Integer a = this.a();
            if (a != null) {
                final int intValue = a.intValue();
                this.w(intValue, intValue);
            }
        }
    }
    
    public final void s() {
        this.e.a = null;
        if (this.g.f.length() > 0) {
            if (this.e()) {
                this.u();
            }
            else {
                this.r();
            }
        }
    }
    
    public final void t() {
        this.e.a = null;
        if (this.g.f.length() > 0) {
            if (this.e()) {
                this.r();
            }
            else {
                this.u();
            }
        }
    }
    
    public final void u() {
        this.e.a = null;
        if (this.g.f.length() > 0) {
            final Integer b = this.b();
            if (b != null) {
                final int intValue = b.intValue();
                this.w(intValue, intValue);
            }
        }
    }
    
    public final void v() {
        if (this.g.f.length() > 0) {
            final long b = this.b;
            final int c = o.c;
            this.f = d0.f((int)(b >> 32), o.c(this.f));
        }
    }
    
    public final void w(final int n, final int n2) {
        this.f = d0.f(n, n2);
    }
}
