// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.textview;

import android.view.View;
import android.content.res.TypedArray;
import android.content.res.Resources$Theme;
import android.util.TypedValue;
import rf.b;
import zf.a;
import android.util.AttributeSet;
import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;

public class MaterialTextView extends AppCompatTextView
{
    public MaterialTextView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public MaterialTextView(Context context, final AttributeSet set, int n) {
        super(zf.a.a(context, set, 16842884, 0), set, 16842884);
        context = ((View)this).getContext();
        final TypedValue a = b.a(2130969908, context);
        final int n2 = 1;
        if (a != null && a.type == 18 && a.data == 0) {
            n = 0;
        }
        else {
            n = 1;
        }
        if (n != 0) {
            final Resources$Theme theme = context.getTheme();
            final int[] u = oy0.b.U;
            final TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(set, u, 16842884, 0);
            n = c(context, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (n != -1) {
                n = n2;
            }
            else {
                n = 0;
            }
            if (n == 0) {
                final TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(set, u, 16842884, 0);
                n = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (n != -1) {
                    this.a(n, theme);
                }
            }
        }
    }
    
    public static int c(final Context context, final TypedArray typedArray, final int... array) {
        int n;
        int n2;
        for (n = 0, n2 = -1; n < array.length && n2 < 0; ++n) {
            final int n3 = array[n];
            final TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(n3, typedValue) && typedValue.type == 2) {
                final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { typedValue.data });
                n2 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
            }
            else {
                n2 = typedArray.getDimensionPixelSize(n3, -1);
            }
        }
        return n2;
    }
    
    public final void a(int c, final Resources$Theme resources$Theme) {
        final TypedArray obtainStyledAttributes = resources$Theme.obtainStyledAttributes(c, oy0.b.T);
        c = c(((View)this).getContext(), obtainStyledAttributes, 0, 1);
        obtainStyledAttributes.recycle();
        if (c >= 0) {
            this.setLineHeight(c);
        }
    }
    
    @Override
    public final void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final TypedValue a = b.a(2130969908, context);
        int n3;
        final int n2 = n3 = 1;
        if (a != null) {
            n3 = n2;
            if (a.type == 18) {
                if (a.data != 0) {
                    n3 = n2;
                }
                else {
                    n3 = 0;
                }
            }
        }
        if (n3 != 0) {
            this.a(n, context.getTheme());
        }
    }
}
