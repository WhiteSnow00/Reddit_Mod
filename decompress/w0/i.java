// 
// Decompiled by Procyon v0.6.0
// 

package w0;

import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import i2.n;
import v0.q;
import androidx.compose.foundation.text.TextFieldState;
import i2.o;
import wd.a;
import sg2.e;
import n1.c;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import v0.k;

public final class i implements k
{
    public final /* synthetic */ TextFieldSelectionManager a;
    
    public i(final TextFieldSelectionManager a) {
        this.a = a;
    }
    
    public final void a() {
        TextFieldSelectionManager.b(this.a, Handle.Cursor);
        final TextFieldSelectionManager a = this.a;
        ((SnapshotMutableStateImpl)a.p).setValue((Object)new c(f.a(a.i(true))));
    }
    
    public final void b(long i) {
        final TextFieldSelectionManager a = this.a;
        a.n = c.f(a.n, i);
        final TextFieldState d = this.a.d;
        if (d != null) {
            final q c = d.c();
            if (c != null) {
                final n a2 = c.a;
                if (a2 != null) {
                    final TextFieldSelectionManager a3 = this.a;
                    ((SnapshotMutableStateImpl)a3.p).setValue((Object)new c(n1.c.f(a3.l, a3.n)));
                    final c c2 = (c)((SnapshotMutableStateImpl)a3.p).getValue();
                    e.c((Object)c2);
                    final int l = a2.l(c2.a);
                    i = wd.a.i(l, l);
                    if (o.a(i, a3.j().b)) {
                        return;
                    }
                    final u1.a j = a3.i;
                    if (j != null) {
                        j.a(9);
                    }
                    a3.c.invoke(TextFieldSelectionManager.e(a3.j().a, i));
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
        TextFieldSelectionManager.b(this.a, null);
        TextFieldSelectionManager.a(this.a, null);
    }
    
    public final void onCancel() {
    }
    
    public final void onStop() {
        TextFieldSelectionManager.b(this.a, null);
        TextFieldSelectionManager.a(this.a, null);
    }
}
