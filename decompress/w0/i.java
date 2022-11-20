// 
// Decompiled by Procyon v0.6.0
// 

package w0;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import u1.a;
import o2.l;
import i2.n;
import v0.p;
import androidx.compose.foundation.text.TextFieldState;
import i2.o;
import mg.d0;
import ng2.e;
import n1.c;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import v0.k;

public final class i implements k
{
    public final TextFieldSelectionManager a;
    
    public i(final TextFieldSelectionManager a) {
        this.a = a;
    }
    
    public final void a() {
        TextFieldSelectionManager.b(this.a, Handle.Cursor);
        final TextFieldSelectionManager a = this.a;
        ((SnapshotMutableStateImpl)a.p).setValue((Object)new c(f.a(a.i(true))));
    }
    
    public final void b(long f) {
        final TextFieldSelectionManager a = this.a;
        a.n = c.h(a.n, f);
        final TextFieldState d = this.a.d;
        if (d != null) {
            final p c = d.c();
            if (c != null) {
                final n a2 = c.a;
                if (a2 != null) {
                    final TextFieldSelectionManager a3 = this.a;
                    ((SnapshotMutableStateImpl)a3.p).setValue((Object)new c(n1.c.h(a3.l, a3.n)));
                    final l b = a3.b;
                    final c c2 = (c)((SnapshotMutableStateImpl)a3.p).getValue();
                    e.c((Object)c2);
                    final int a4 = b.a(a2.l(c2.a));
                    f = d0.f(a4, a4);
                    if (o.a(f, a3.j().b)) {
                        return;
                    }
                    final a i = a3.i;
                    if (i != null) {
                        i.a(9);
                    }
                    a3.c.invoke((Object)TextFieldSelectionManager.e(a3.j().a, f));
                }
            }
        }
    }
    
    public final void c(final long n) {
        final TextFieldSelectionManager a = this.a;
        a.l = f.a(a.i(true));
        final TextFieldSelectionManager a2 = this.a;
        ((SnapshotMutableStateImpl)a2.p).setValue((Object)new c(a2.l));
        final TextFieldSelectionManager a3 = this.a;
        a3.n = c.b;
        ((SnapshotMutableStateImpl)a3.o).setValue((Object)Handle.Cursor);
    }
    
    public final void d() {
        TextFieldSelectionManager.b(this.a, (Handle)null);
        TextFieldSelectionManager.a(this.a, (c)null);
    }
    
    public final void onCancel() {
    }
    
    public final void onStop() {
        TextFieldSelectionManager.b(this.a, (Handle)null);
        TextFieldSelectionManager.a(this.a, (c)null);
    }
}
