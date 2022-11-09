// 
// Decompiled by Procyon v0.6.0
// 

package p4;

import android.view.View;
import androidx.emoji2.text.f;
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
        final int b = f.a().b();
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
                    f = androidx.emoji2.text.f.a().f(0, subSequence.length(), subSequence);
                }
                return f;
            }
            if (b != 3) {
                return subSequence;
            }
        }
        final f a = f.a();
        if (this.b == null) {
            this.b = new d.d$a(this.a, this);
        }
        a.g((f.e)this.b);
        return subSequence;
    }
}
