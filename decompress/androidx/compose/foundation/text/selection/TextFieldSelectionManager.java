// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import lg.e0;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.foundation.text.HandleState;
import i2.n;
import v0.q;
import sg2.e;
import i2.o;
import androidx.compose.foundation.text.Handle;
import n1.c;
import bg.d;
import u1.a;
import androidx.compose.ui.platform.b1;
import androidx.compose.ui.platform.d0;
import o2.y;
import z0.l0;
import androidx.compose.foundation.text.TextFieldState;
import hg2.j;
import androidx.compose.ui.text.input.TextFieldValue;
import rg2.l;
import o2.m;
import v0.r;

public final class TextFieldSelectionManager
{
    public final r a;
    public m b;
    public l<? super TextFieldValue, j> c;
    public TextFieldState d;
    public final l0 e;
    public y f;
    public d0 g;
    public b1 h;
    public a i;
    public m1.m j;
    public final l0 k;
    public long l;
    public Integer m;
    public long n;
    public final l0 o;
    public final l0 p;
    public TextFieldValue q;
    public final TextFieldSelectionManager$b r;
    
    public TextFieldSelectionManager() {
        this(null);
    }
    
    public TextFieldSelectionManager(final r a) {
        this.a = a;
        this.b = o2.m.a.a;
        this.c = (l<? super TextFieldValue, j>)TextFieldSelectionManager$onValueChange$1.INSTANCE;
        this.e = bg.d.t0((Object)new TextFieldValue(null, 0L, 7));
        this.f = (y)y.a.a;
        this.k = bg.d.t0((Object)Boolean.TRUE);
        final long b = n1.c.b;
        this.l = b;
        this.n = b;
        this.o = bg.d.t0((Object)null);
        this.p = bg.d.t0((Object)null);
        this.q = new TextFieldValue(null, 0L, 7);
        this.r = new TextFieldSelectionManager$b(this);
        new Object(this) {};
    }
    
    public static final void a(final TextFieldSelectionManager textFieldSelectionManager, final c value) {
        ((SnapshotMutableStateImpl)textFieldSelectionManager.p).setValue((Object)value);
    }
    
    public static final void b(final TextFieldSelectionManager textFieldSelectionManager, final Handle value) {
        ((SnapshotMutableStateImpl)textFieldSelectionManager.o).setValue((Object)value);
    }
    
    public static final void c(final TextFieldSelectionManager textFieldSelectionManager, TextFieldValue e, final int n, final int n2, final boolean b, final androidx.compose.foundation.text.selection.a a) {
        final m b2 = textFieldSelectionManager.b;
        final long b3 = e.b;
        final int c = o.c;
        final long i = wd.a.i(b2.b((int)(b3 >> 32)), textFieldSelectionManager.b.b(o.c(e.b)));
        final TextFieldState d = textFieldSelectionManager.d;
        o o = null;
        n a2 = null;
        Label_0090: {
            if (d != null) {
                final q c2 = d.c();
                if (c2 != null) {
                    a2 = c2.a;
                    break Label_0090;
                }
            }
            a2 = null;
        }
        if (!i2.o.b(i)) {
            o = new o(i);
        }
        e.f((Object)a, "adjustment");
        long n3;
        if (a2 != null) {
            n3 = wd.a.i(n, n2);
            if (o != null || !e.a((Object)a, (Object)a.a.a)) {
                n3 = a.a(a2, n3, b, o);
            }
        }
        else {
            n3 = wd.a.i(0, 0);
        }
        final long j = wd.a.i(textFieldSelectionManager.b.a((int)(n3 >> 32)), textFieldSelectionManager.b.a(i2.o.c(n3)));
        if (!i2.o.a(j, e.b)) {
            final a k = textFieldSelectionManager.i;
            if (k != null) {
                k.a(9);
            }
            e = e(e.a, j);
            textFieldSelectionManager.c.invoke(e);
            final TextFieldState d2 = textFieldSelectionManager.d;
            if (d2 != null) {
                ((SnapshotMutableStateImpl)d2.j).setValue((Object)TextFieldSelectionManagerKt.b(textFieldSelectionManager, true));
            }
            final TextFieldState d3 = textFieldSelectionManager.d;
            if (d3 != null) {
                ((SnapshotMutableStateImpl)d3.k).setValue((Object)TextFieldSelectionManagerKt.b(textFieldSelectionManager, false));
            }
        }
    }
    
    public static TextFieldValue e(final i2.a a, final long n) {
        return new TextFieldValue(a, n, null);
    }
    
    public final void d(final boolean b) {
        if (i2.o.b(this.j().b)) {
            return;
        }
        final d0 g = this.g;
        if (g != null) {
            g.a(bg.d.g0(this.j()));
        }
        if (!b) {
            return;
        }
        final int e = i2.o.e(this.j().b);
        this.c.invoke(e(this.j().a, wd.a.i(e, e)));
        this.m(HandleState.None);
    }
    
    public final void f() {
        if (i2.o.b(this.j().b)) {
            return;
        }
        final d0 g = this.g;
        if (g != null) {
            g.a(bg.d.g0(this.j()));
        }
        final i2.a c = bg.d.i0(this.j(), this.j().a.f.length()).c(bg.d.h0(this.j(), this.j().a.f.length()));
        final int f = i2.o.f(this.j().b);
        this.c.invoke(e(c, wd.a.i(f, f)));
        this.m(HandleState.None);
        final r a = this.a;
        if (a != null) {
            a.f = true;
        }
    }
    
    public final void g(final c c) {
        final boolean b = i2.o.b(this.j().b);
        final int n = 1;
        if (!b) {
            final TextFieldState d = this.d;
            q c2;
            if (d != null) {
                c2 = d.c();
            }
            else {
                c2 = null;
            }
            int n2;
            if (c != null && c2 != null) {
                n2 = this.b.a(c2.b(c.a, true));
            }
            else {
                n2 = i2.o.e(this.j().b);
            }
            this.c.invoke(TextFieldValue.a(this.j(), null, wd.a.i(n2, n2), 5));
        }
        HandleState handleState = null;
        Label_0161: {
            if (c != null) {
                int n3;
                if (this.j().a.f.length() > 0) {
                    n3 = n;
                }
                else {
                    n3 = 0;
                }
                if (n3 != 0) {
                    handleState = HandleState.Cursor;
                    break Label_0161;
                }
            }
            handleState = HandleState.None;
        }
        this.m(handleState);
        this.k();
    }
    
    public final void h() {
        final TextFieldState d = this.d;
        int n = 0;
        if (d != null) {
            n = n;
            if (!d.b()) {
                n = 1;
            }
        }
        if (n != 0) {
            final m1.m j = this.j;
            if (j != null) {
                j.a();
            }
        }
        this.q = this.j();
        final TextFieldState d2 = this.d;
        if (d2 != null) {
            d2.i = true;
        }
        this.m(HandleState.Selection);
    }
    
    public final long i(final boolean b) {
        final TextFieldValue j = this.j();
        int c2;
        if (b) {
            final long b2 = j.b;
            final int c = i2.o.c;
            c2 = (int)(b2 >> 32);
        }
        else {
            c2 = i2.o.c(j.b);
        }
        final TextFieldState d = this.d;
        q c3;
        if (d != null) {
            c3 = d.c();
        }
        else {
            c3 = null;
        }
        sg2.e.c((Object)c3);
        final n a = c3.a;
        final int b3 = this.b.b(c2);
        final boolean g = i2.o.g(this.j().b);
        sg2.e.f((Object)a, "textLayoutResult");
        return wd.a.f(bg.d.d0(a, b3, b, g), a.d(a.f(b3)));
    }
    
    public final TextFieldValue j() {
        return (TextFieldValue)((SnapshotMutableStateImpl)this.e).getValue();
    }
    
    public final void k() {
        final b1 h = this.h;
        TextToolbarStatus status;
        if (h != null) {
            status = h.getStatus();
        }
        else {
            status = null;
        }
        if (status == TextToolbarStatus.Shown) {
            final b1 h2 = this.h;
            if (h2 != null) {
                h2.I0();
            }
        }
    }
    
    public final void l() {
        final d0 g = this.g;
        if (g != null) {
            final i2.a text = g.getText();
            if (text != null) {
                final i2.a c = bg.d.i0(this.j(), this.j().a.f.length()).c(text).c(bg.d.h0(this.j(), this.j().a.f.length()));
                final int n = text.length() + i2.o.f(this.j().b);
                this.c.invoke(e(c, wd.a.i(n, n)));
                this.m(HandleState.None);
                final r a = this.a;
                if (a != null) {
                    a.f = true;
                }
            }
        }
    }
    
    public final void m(final HandleState value) {
        final TextFieldState d = this.d;
        if (d != null) {
            sg2.e.f((Object)value, "<set-?>");
            ((SnapshotMutableStateImpl)d.h).setValue((Object)value);
        }
    }
    
    public final void n() {
        final boolean b = this.f instanceof o2.o;
        final boolean b2 = i2.o.b(this.j().b);
        Object o = null;
        Object o2;
        if (!b2 && !b) {
            o2 = new TextFieldSelectionManager$showSelectionToolbar$copy$1(this);
        }
        else {
            o2 = null;
        }
        Object o3;
        if (!i2.o.b(this.j().b) && (boolean)((SnapshotMutableStateImpl)this.k).getValue() && !b) {
            o3 = new TextFieldSelectionManager$showSelectionToolbar$cut$1(this);
        }
        else {
            o3 = null;
        }
        Object o4 = null;
        Label_0157: {
            if (((SnapshotMutableStateImpl)this.k).getValue()) {
                final d0 g = this.g;
                i2.a text;
                if (g != null) {
                    text = g.getText();
                }
                else {
                    text = null;
                }
                if (text != null) {
                    o4 = new TextFieldSelectionManager$showSelectionToolbar$paste$1(this);
                    break Label_0157;
                }
            }
            o4 = null;
        }
        if (i2.o.d(this.j().b) != this.j().a.f.length()) {
            o = new TextFieldSelectionManager$showSelectionToolbar$selectAll$1(this);
        }
        final b1 h = this.h;
        if (h != null) {
            final TextFieldState d = this.d;
            n1.d e;
            if (d != null) {
                final c2.l f = d.f;
                long n;
                if (f != null) {
                    n = f.k(this.i(true));
                }
                else {
                    n = n1.c.b;
                }
                final TextFieldState d2 = this.d;
                long n2 = 0L;
                Label_0293: {
                    if (d2 != null) {
                        final c2.l f2 = d2.f;
                        if (f2 != null) {
                            n2 = f2.k(this.i(false));
                            break Label_0293;
                        }
                    }
                    n2 = n1.c.b;
                }
                final TextFieldState d3 = this.d;
                float d4 = 0.0f;
                Label_0414: {
                    if (d3 != null) {
                        final c2.l f3 = d3.f;
                        if (f3 != null) {
                            final q c = d.c();
                            float b3 = 0.0f;
                            Label_0390: {
                                if (c != null) {
                                    final n a = c.a;
                                    if (a != null) {
                                        b3 = a.c(e0.v((int)(this.j().b >> 32), 0, Math.max(0, this.j().a.f.length() - 1))).b;
                                        break Label_0390;
                                    }
                                }
                                b3 = 0.0f;
                            }
                            d4 = n1.c.d(f3.k(wd.a.f(0.0f, b3)));
                            break Label_0414;
                        }
                    }
                    d4 = 0.0f;
                }
                final TextFieldState d5 = this.d;
                float d6 = 0.0f;
                Label_0534: {
                    if (d5 != null) {
                        final c2.l f4 = d5.f;
                        if (f4 != null) {
                            final q c2 = d.c();
                            float b4 = 0.0f;
                            Label_0510: {
                                if (c2 != null) {
                                    final n a2 = c2.a;
                                    if (a2 != null) {
                                        b4 = a2.c(e0.v(i2.o.c(this.j().b), 0, Math.max(0, this.j().a.f.length() - 1))).b;
                                        break Label_0510;
                                    }
                                }
                                b4 = 0.0f;
                            }
                            d6 = n1.c.d(f4.k(wd.a.f(0.0f, b4)));
                            break Label_0534;
                        }
                    }
                    d6 = 0.0f;
                }
                e = new n1.d(Math.min(n1.c.c(n), n1.c.c(n2)), Math.min(d4, d6), Math.max(n1.c.c(n), n1.c.c(n2)), d.a.f.getDensity() * 25 + Math.max(n1.c.d(n), n1.c.d(n2)));
            }
            else {
                e = n1.d.e;
            }
            h.a(e, (rg2.a)o2, (rg2.a)o4, (rg2.a)o3, (rg2.a)o);
        }
    }
}
