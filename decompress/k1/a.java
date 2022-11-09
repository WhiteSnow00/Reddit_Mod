// 
// Decompiled by Procyon v0.6.0
// 

package k1;

import n1.d;
import a4.u1;
import a4.q;
import ah2.f;
import android.view.autofill.AutofillManager;
import android.view.View;

public final class a implements c
{
    public final View a;
    public final h b;
    public final AutofillManager c;
    
    public a(final View a, final h b) {
        f.f((Object)a, "view");
        f.f((Object)b, "autofillTree");
        this.a = a;
        this.b = b;
        final AutofillManager c = (AutofillManager)a.getContext().getSystemService((Class)AutofillManager.class);
        if (c != null) {
            this.c = c;
            q.i(a);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }
    
    @Override
    public final void a(final g g) {
        f.f((Object)g, "autofillNode");
        this.c.notifyViewExited(this.a, g.d);
    }
    
    @Override
    public final void b(final g g) {
        f.f((Object)g, "autofillNode");
        final AutofillManager c = this.c;
        final View a = this.a;
        final int d = g.d;
        final d b = g.b;
        if (b != null) {
            c.notifyViewEntered(a, d, u1.s1(b));
            return;
        }
        throw new IllegalStateException("requestAutofill called before onChildPositioned()".toString());
    }
}
