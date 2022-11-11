// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import i2.n;
import v0.r;
import o2.d;
import java.util.List;
import ah2.c;
import o2.a;
import androidx.compose.ui.text.input.TextFieldValue;
import v0.s;
import ah2.f;
import v0.o;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.Metadata;
import pg2.j;
import w0.h;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003" }, d2 = { "Lw0/h;", "Lpg2/j;", "invoke", "(Lw0/h;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class TextFieldKeyInput$process$2 extends Lambda implements l<h, j>
{
    public final /* synthetic */ KeyCommand $command;
    public final /* synthetic */ Ref$BooleanRef $consumed;
    public final /* synthetic */ o this$0;
    
    public TextFieldKeyInput$process$2(final KeyCommand $command, final o this$0, final Ref$BooleanRef $consumed) {
        this.$command = $command;
        this.this$0 = this$0;
        this.$consumed = $consumed;
        super(1);
    }
    
    public final void invoke(final h h) {
        f.f((Object)h, "$this$commandExecutionContext");
        final int n = a.a[this.$command.ordinal()];
        final Object o = null;
        final Object o2 = null;
        final int n2 = 0;
        final int n3 = 0;
        final int n4 = 0;
        final int n5 = 0;
        final int n6 = 0;
        final int n7 = 0;
        final int n8 = 0;
        final int n9 = 0;
        final int n10 = 0;
        final int n11 = 0;
        boolean b = false;
        final int n12 = 1;
        final int n13 = 1;
        final int n14 = 1;
        switch (n) {
            case 47: {
                final s h2 = this.this$0.h;
                if (h2 == null) {
                    break;
                }
                final s.a c = h2.c;
                Object b2 = o2;
                if (c != null) {
                    h2.c = c.a;
                    h2.b = new s.a(h2.b, c.b);
                    h2.d += c.b.a.f.length();
                    b2 = c.b;
                }
                if (b2 != null) {
                    this.this$0.j.invoke(b2);
                    break;
                }
                break;
            }
            case 46: {
                final s h3 = this.this$0.h;
                if (h3 != null) {
                    h3.a(TextFieldValue.a(h.h, ((w0.a)h).g, ((w0.a)h).f, 4));
                }
                final s h4 = this.this$0.h;
                if (h4 == null) {
                    break;
                }
                final s.a b3 = h4.b;
                Object b4 = o;
                if (b3 != null) {
                    final s.a a = b3.a;
                    b4 = o;
                    if (a != null) {
                        h4.b = a;
                        h4.d -= b3.b.a.f.length();
                        h4.c = new s.a(h4.c, b3.b);
                        b4 = a.b;
                    }
                }
                if (b4 != null) {
                    this.this$0.j.invoke(b4);
                    break;
                }
                break;
            }
            case 45: {
                ((w0.a)h).e.a = null;
                if (((w0.a)h).g.f.length() > 0) {
                    b = true;
                }
                if (b) {
                    final int c2 = i2.o.c(((w0.a)h).f);
                    ((w0.a)h).w(c2, c2);
                    break;
                }
                break;
            }
            case 44: {
                ((w0.a)h).q();
                ((w0.a)h).v();
                break;
            }
            case 43: {
                ((w0.a)h).e.a = null;
                int n15;
                if (((w0.a)h).g.f.length() > 0) {
                    n15 = n14;
                }
                else {
                    n15 = 0;
                }
                if (n15 != 0) {
                    ((w0.a)h).w(0, 0);
                }
                ((w0.a)h).v();
                break;
            }
            case 42: {
                int n16 = n2;
                if (((w0.a)h).g.f.length() > 0) {
                    n16 = 1;
                }
                if (n16 != 0) {
                    final r i = h.i;
                    if (i != null) {
                        final int y = h.y(i, 1);
                        ((w0.a)h).w(y, y);
                    }
                }
                ((w0.a)h).v();
                break;
            }
            case 41: {
                int n17 = n3;
                if (((w0.a)h).g.f.length() > 0) {
                    n17 = 1;
                }
                if (n17 != 0) {
                    final r j = h.i;
                    if (j != null) {
                        final int y2 = h.y(j, -1);
                        ((w0.a)h).w(y2, y2);
                    }
                }
                ((w0.a)h).v();
                break;
            }
            case 40: {
                int n18 = n4;
                if (((w0.a)h).g.f.length() > 0) {
                    n18 = 1;
                }
                if (n18 != 0) {
                    final n c3 = ((w0.a)h).c;
                    if (c3 != null) {
                        final int f = ((w0.a)h).f(c3, 1);
                        ((w0.a)h).w(f, f);
                    }
                }
                ((w0.a)h).v();
                break;
            }
            case 39: {
                int n19 = n5;
                if (((w0.a)h).g.f.length() > 0) {
                    n19 = 1;
                }
                if (n19 != 0) {
                    final n c4 = ((w0.a)h).c;
                    if (c4 != null) {
                        final int f2 = ((w0.a)h).f(c4, -1);
                        ((w0.a)h).w(f2, f2);
                    }
                }
                ((w0.a)h).v();
                break;
            }
            case 38: {
                ((w0.a)h).t();
                ((w0.a)h).v();
                break;
            }
            case 37: {
                ((w0.a)h).s();
                ((w0.a)h).v();
                break;
            }
            case 36: {
                ((w0.a)h).r();
                ((w0.a)h).v();
                break;
            }
            case 35: {
                ((w0.a)h).u();
                ((w0.a)h).v();
                break;
            }
            case 34: {
                ((w0.a)h).j();
                ((w0.a)h).v();
                break;
            }
            case 33: {
                ((w0.a)h).m();
                ((w0.a)h).v();
                break;
            }
            case 32: {
                ((w0.a)h).p();
                ((w0.a)h).v();
                break;
            }
            case 31: {
                ((w0.a)h).h();
                ((w0.a)h).v();
                break;
            }
            case 30: {
                ((w0.a)h).o();
                ((w0.a)h).v();
                break;
            }
            case 29: {
                ((w0.a)h).g();
                ((w0.a)h).v();
                break;
            }
            case 28: {
                ((w0.a)h).e.a = null;
                int n20;
                if (((w0.a)h).g.f.length() > 0) {
                    n20 = n12;
                }
                else {
                    n20 = 0;
                }
                if (n20 != 0) {
                    ((w0.a)h).w(0, ((w0.a)h).g.f.length());
                    break;
                }
                break;
            }
            case 27: {
                final o this$0 = this.this$0;
                if (!this$0.e) {
                    this$0.a(c.X((Object)new o2.a("\t", 1)));
                    break;
                }
                this.$consumed.element = false;
                break;
            }
            case 26: {
                final o this$2 = this.this$0;
                if (!this$2.e) {
                    this$2.a(c.X((Object)new o2.a("\n", 1)));
                    break;
                }
                this.$consumed.element = false;
                break;
            }
            case 25: {
                final List x = h.x((l)TextFieldKeyInput$process$2$8.INSTANCE);
                if (x != null) {
                    this.this$0.a(x);
                    break;
                }
                break;
            }
            case 24: {
                final List x2 = h.x((l)TextFieldKeyInput$process$2$7.INSTANCE);
                if (x2 != null) {
                    this.this$0.a(x2);
                    break;
                }
                break;
            }
            case 23: {
                final List x3 = h.x((l)TextFieldKeyInput$process$2$6.INSTANCE);
                if (x3 != null) {
                    this.this$0.a(x3);
                    break;
                }
                break;
            }
            case 22: {
                final List x4 = h.x((l)TextFieldKeyInput$process$2$5.INSTANCE);
                if (x4 != null) {
                    this.this$0.a(x4);
                    break;
                }
                break;
            }
            case 21: {
                final List x5 = h.x((l)TextFieldKeyInput$process$2$4.INSTANCE);
                if (x5 != null) {
                    this.this$0.a(x5);
                    break;
                }
                break;
            }
            case 20: {
                final List x6 = h.x((l)TextFieldKeyInput$process$2$3.INSTANCE);
                if (x6 != null) {
                    this.this$0.a(x6);
                    break;
                }
                break;
            }
            case 19: {
                ((w0.a)h).q();
                break;
            }
            case 18: {
                ((w0.a)h).e.a = null;
                int n21;
                if (((w0.a)h).g.f.length() > 0) {
                    n21 = n13;
                }
                else {
                    n21 = 0;
                }
                if (n21 != 0) {
                    ((w0.a)h).w(0, 0);
                    break;
                }
                break;
            }
            case 17: {
                ((w0.a)h).t();
                break;
            }
            case 16: {
                ((w0.a)h).s();
                break;
            }
            case 15: {
                ((w0.a)h).r();
                break;
            }
            case 14: {
                ((w0.a)h).u();
                break;
            }
            case 13: {
                int n22 = n6;
                if (((w0.a)h).g.f.length() > 0) {
                    n22 = 1;
                }
                if (n22 == 0) {
                    break;
                }
                final r k = h.i;
                if (k != null) {
                    final int y3 = h.y(k, 1);
                    ((w0.a)h).w(y3, y3);
                    break;
                }
                break;
            }
            case 12: {
                int n23 = n7;
                if (((w0.a)h).g.f.length() > 0) {
                    n23 = 1;
                }
                if (n23 == 0) {
                    break;
                }
                final r l = h.i;
                if (l != null) {
                    final int y4 = h.y(l, -1);
                    ((w0.a)h).w(y4, y4);
                    break;
                }
                break;
            }
            case 11: {
                int n24 = n8;
                if (((w0.a)h).g.f.length() > 0) {
                    n24 = 1;
                }
                if (n24 == 0) {
                    break;
                }
                final n c5 = ((w0.a)h).c;
                if (c5 != null) {
                    final int f3 = ((w0.a)h).f(c5, 1);
                    ((w0.a)h).w(f3, f3);
                    break;
                }
                break;
            }
            case 10: {
                int n25 = n9;
                if (((w0.a)h).g.f.length() > 0) {
                    n25 = 1;
                }
                if (n25 == 0) {
                    break;
                }
                final n c6 = ((w0.a)h).c;
                if (c6 != null) {
                    final int f4 = ((w0.a)h).f(c6, -1);
                    ((w0.a)h).w(f4, f4);
                    break;
                }
                break;
            }
            case 9: {
                ((w0.a)h).j();
                break;
            }
            case 8: {
                ((w0.a)h).m();
                break;
            }
            case 7: {
                ((w0.a)h).p();
                break;
            }
            case 6: {
                ((w0.a)h).h();
                break;
            }
            case 5: {
                final TextFieldKeyInput$process$2$2 instance = TextFieldKeyInput$process$2$2.INSTANCE;
                f.f((Object)instance, "or");
                ((w0.a)h).e.a = null;
                int n26 = n10;
                if (((w0.a)h).g.f.length() > 0) {
                    n26 = 1;
                }
                if (n26 == 0) {
                    break;
                }
                if (i2.o.b(((w0.a)h).f)) {
                    ((l)instance).invoke((Object)h);
                    break;
                }
                if (((w0.a)h).e()) {
                    final int e = i2.o.e(((w0.a)h).f);
                    ((w0.a)h).w(e, e);
                    break;
                }
                final int f5 = i2.o.f(((w0.a)h).f);
                ((w0.a)h).w(f5, f5);
                break;
            }
            case 4: {
                final TextFieldKeyInput$process$2$1 instance2 = TextFieldKeyInput$process$2$1.INSTANCE;
                f.f((Object)instance2, "or");
                ((w0.a)h).e.a = null;
                int n27 = n11;
                if (((w0.a)h).g.f.length() > 0) {
                    n27 = 1;
                }
                if (n27 == 0) {
                    break;
                }
                if (i2.o.b(((w0.a)h).f)) {
                    ((l)instance2).invoke((Object)h);
                    break;
                }
                if (((w0.a)h).e()) {
                    final int f6 = i2.o.f(((w0.a)h).f);
                    ((w0.a)h).w(f6, f6);
                    break;
                }
                final int e2 = i2.o.e(((w0.a)h).f);
                ((w0.a)h).w(e2, e2);
                break;
            }
            case 3: {
                this.this$0.b.f();
                break;
            }
            case 2: {
                this.this$0.b.l();
                break;
            }
            case 1: {
                this.this$0.b.d(false);
                break;
            }
        }
    }
}
