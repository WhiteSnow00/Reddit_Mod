// 
// Decompiled by Procyon v0.6.0
// 

package w0;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.platform.b1;
import androidx.compose.ui.platform.TextToolbarStatus;
import o2.m;
import i2.n;
import v0.q;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.selection.a;
import i2.o;
import sg2.e;
import n1.c;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import v0.k;

public final class j implements k
{
    public final /* synthetic */ TextFieldSelectionManager a;
    public final /* synthetic */ boolean b;
    
    public j(final TextFieldSelectionManager a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        final TextFieldSelectionManager a = this.a;
        Handle handle;
        if (this.b) {
            handle = Handle.SelectionStart;
        }
        else {
            handle = Handle.SelectionEnd;
        }
        TextFieldSelectionManager.b(a, handle);
        final TextFieldSelectionManager a2 = this.a;
        ((SnapshotMutableStateImpl)a2.p).setValue((Object)new c(f.a(a2.i(this.b))));
    }
    
    public final void b(long b) {
        final TextFieldSelectionManager a = this.a;
        a.n = c.f(a.n, b);
        final TextFieldState d = this.a.d;
        if (d != null) {
            final q c = d.c();
            if (c != null) {
                final n a2 = c.a;
                if (a2 != null) {
                    final TextFieldSelectionManager a3 = this.a;
                    final boolean b2 = this.b;
                    ((SnapshotMutableStateImpl)a3.p).setValue((Object)new c(n1.c.f(a3.l, a3.n)));
                    int n;
                    if (b2) {
                        final c c2 = (c)((SnapshotMutableStateImpl)a3.p).getValue();
                        e.c((Object)c2);
                        n = a2.l(c2.a);
                    }
                    else {
                        final m b3 = a3.b;
                        b = a3.j().b;
                        final int c3 = o.c;
                        n = b3.b((int)(b >> 32));
                    }
                    int n2;
                    if (b2) {
                        n2 = a3.b.b(o.c(a3.j().b));
                    }
                    else {
                        final c c4 = (c)((SnapshotMutableStateImpl)a3.p).getValue();
                        e.c((Object)c4);
                        n2 = a2.l(c4.a);
                    }
                    TextFieldSelectionManager.c(a3, a3.j(), n, n2, b2, (a)androidx.compose.foundation.text.selection.a.a.a);
                }
            }
        }
        final TextFieldState d2 = this.a.d;
        if (d2 != null) {
            d2.i = false;
        }
    }
    
    public final void c(final long n) {
        final TextFieldSelectionManager a = this.a;
        a.l = f.a(a.i(this.b));
        final TextFieldSelectionManager a2 = this.a;
        ((SnapshotMutableStateImpl)a2.p).setValue((Object)new c(a2.l));
        final TextFieldSelectionManager a3 = this.a;
        a3.n = c.b;
        Handle value;
        if (this.b) {
            value = Handle.SelectionStart;
        }
        else {
            value = Handle.SelectionEnd;
        }
        ((SnapshotMutableStateImpl)a3.o).setValue((Object)value);
        final TextFieldState d = this.a.d;
        if (d != null) {
            d.i = false;
        }
    }
    
    public final void d() {
        TextFieldSelectionManager.b(this.a, null);
        TextFieldSelectionManager.a(this.a, null);
    }
    
    public final void onCancel() {
    }
    
    public final void onStop() {
        final TextFieldSelectionManager a = this.a;
        TextToolbarStatus status = null;
        TextFieldSelectionManager.b(a, null);
        TextFieldSelectionManager.a(this.a, null);
        final TextFieldSelectionManager a2 = this.a;
        final TextFieldState d = a2.d;
        if (d != null) {
            d.i = true;
        }
        final b1 h = a2.h;
        if (h != null) {
            status = h.getStatus();
        }
        if (status == TextToolbarStatus.Hidden) {
            this.a.n();
        }
    }
}
