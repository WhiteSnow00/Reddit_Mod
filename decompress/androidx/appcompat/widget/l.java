// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.View;
import android.content.res.TypedArray;
import gn.a;
import android.util.AttributeSet;
import android.text.InputFilter;
import p4.f;
import android.widget.TextView;

public final class l
{
    public final TextView a;
    public final f b;
    
    public l(final TextView a) {
        this.a = a;
        this.b = new f(a);
    }
    
    public final InputFilter[] a(final InputFilter[] array) {
        return this.b.a.a(array);
    }
    
    public final void b(final AttributeSet set, final int n) {
        final TypedArray obtainStyledAttributes = ((View)this.a).getContext().obtainStyledAttributes(set, gn.a.Y, n, 0);
        try {
            final boolean hasValue = obtainStyledAttributes.hasValue(14);
            boolean boolean1 = true;
            if (hasValue) {
                boolean1 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            this.d(boolean1);
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    public final void c(final boolean b) {
        this.b.a.c(b);
    }
    
    public final void d(final boolean b) {
        this.b.a.d(b);
    }
}
