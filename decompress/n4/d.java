// 
// Decompiled by Procyon v0.6.0
// 

package n4;

import android.view.View;
import m4.a$d;
import m4.a;
import android.text.Spanned;
import android.widget.TextView;
import android.text.InputFilter;

public final class d implements InputFilter
{
    public final TextView a;
    public d.d$a b;
    
    public d(final TextView a) {
        this.a = a;
    }
    
    public final CharSequence filter(CharSequence subSequence, final int n, final int n2, final Spanned spanned, final int n3, final int n4) {
        if (((View)this.a).isInEditMode()) {
            return subSequence;
        }
        final int b = m4.a.a().b();
        if (b != 0) {
            final int n5 = 1;
            if (b == 1) {
                int n6 = n5;
                if (n4 == 0) {
                    n6 = n5;
                    if (n3 == 0) {
                        n6 = n5;
                        if (((CharSequence)spanned).length() == 0) {
                            n6 = n5;
                            if (subSequence == this.a.getText()) {
                                n6 = 0;
                            }
                        }
                    }
                }
                CharSequence f = subSequence;
                if (n6 != 0 && (f = subSequence) != null) {
                    if (n != 0 || n2 != subSequence.length()) {
                        subSequence = subSequence.subSequence(n, n2);
                    }
                    f = m4.a.a().f(0, subSequence.length(), subSequence, Integer.MAX_VALUE, 0);
                }
                return f;
            }
            if (b != 3) {
                return subSequence;
            }
        }
        final a a = m4.a.a();
        if (this.b == null) {
            this.b = new d.d$a(this.a);
        }
        a.g((a$d)this.b);
        return subSequence;
    }
}
