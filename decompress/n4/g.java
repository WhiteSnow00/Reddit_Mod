// 
// Decompiled by Procyon v0.6.0
// 

package n4;

import android.view.View;
import m4.a$d;
import m4.a;
import android.text.Spannable;
import android.text.Editable;
import android.widget.EditText;
import android.text.TextWatcher;

public final class g implements TextWatcher
{
    public final EditText f;
    public g.g$a g;
    public int h;
    public int i;
    
    public g(final EditText f) {
        this.h = Integer.MAX_VALUE;
        this.i = 0;
        this.f = f;
    }
    
    public final void afterTextChanged(final Editable editable) {
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, int b, final int n2) {
        if (((View)this.f).isInEditMode()) {
            return;
        }
        if (b <= n2 && charSequence instanceof Spannable) {
            b = a.a().b();
            if (b != 0) {
                if (b == 1) {
                    a.a().f(n, n + n2, (CharSequence)charSequence, this.h, this.i);
                    return;
                }
                if (b != 3) {
                    return;
                }
            }
            final a a = m4.a.a();
            if (this.g == null) {
                this.g = new g.g$a(this.f);
            }
            a.g((a$d)this.g);
        }
    }
}
