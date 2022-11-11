// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import c2.l;
import androidx.compose.foundation.text.TextFieldState;
import yg.a;
import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import rg2.p;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import lg2.c;
import i2.o;
import v0.k;
import w0.j;
import z0.d$a;
import sg2.e;
import z0.d;
import androidx.compose.ui.text.style.ResolvedTextDirection;

public final class TextFieldSelectionManagerKt
{
    public static final void a(final boolean b, final ResolvedTextDirection resolvedTextDirection, final TextFieldSelectionManager textFieldSelectionManager, final d d, final int n) {
        e.f((Object)resolvedTextDirection, "direction");
        e.f((Object)textFieldSelectionManager, "manager");
        final ComposerImpl s = d.s(-1344558920);
        s.A(511388516);
        final boolean m = s.m((Object)b);
        final boolean i = s.m((Object)textFieldSelectionManager);
        final Object c0 = s.c0();
        Object o;
        if ((m | i) || (o = c0) == d$a.a) {
            o = new j(textFieldSelectionManager, b);
            s.I0(o);
        }
        s.R(false);
        final k k = (k)o;
        final long j = textFieldSelectionManager.i(b);
        final boolean g = i2.o.g(textFieldSelectionManager.j().b);
        final j1.d b2 = SuspendingPointerInputFilterKt.b((j1.d)j1.d.a.f, (Object)k, (p)new TextFieldSelectionManagerKt$TextFieldSelectionHandle$1(k, (c)null));
        final int n2 = n << 3;
        AndroidSelectionHandles_androidKt.c(j, b, resolvedTextDirection, g, b2, null, (d)s, 0x30000 | (n2 & 0x70) | (n2 & 0x380));
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(b, resolvedTextDirection, textFieldSelectionManager, n);
        }
    }
    
    public static final boolean b(final TextFieldSelectionManager textFieldSelectionManager, final boolean b) {
        e.f((Object)textFieldSelectionManager, "<this>");
        final TextFieldState d = textFieldSelectionManager.d;
        boolean b3;
        final boolean b2 = b3 = false;
        if (d != null) {
            final l f = d.f;
            b3 = b2;
            if (f != null) {
                final n1.d y = yg.a.Y(f);
                final long v = f.v(wd.a.f(y.a, y.b));
                final long v2 = f.v(wd.a.f(y.c, y.d));
                final float c = n1.c.c(v);
                final float d2 = n1.c.d(v);
                final float c2 = n1.c.c(v2);
                final float d3 = n1.c.d(v2);
                final long i = textFieldSelectionManager.i(b);
                final float c3 = n1.c.c(i);
                final boolean b4 = c <= c3 && c3 <= c2;
                b3 = b2;
                if (b4) {
                    final float d4 = n1.c.d(i);
                    final boolean b5 = d2 <= d4 && d4 <= d3;
                    b3 = b2;
                    if (b5) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
}
