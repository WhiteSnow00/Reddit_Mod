// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.theme;

import com.google.android.material.textview.MaterialTextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.q;
import hf.a;
import androidx.appcompat.widget.f;
import com.google.android.material.button.MaterialButton;
import androidx.appcompat.widget.AppCompatButton;
import yf.n;
import androidx.appcompat.widget.d;
import android.util.AttributeSet;
import android.content.Context;
import h.o;

public class MaterialComponentsViewInflater extends o
{
    public final d a(final Context context, final AttributeSet set) {
        return (d)new n(context, set);
    }
    
    public final AppCompatButton b(final Context context, final AttributeSet set) {
        return new MaterialButton(context, set);
    }
    
    public final f c(final Context context, final AttributeSet set) {
        return new a(context, set);
    }
    
    public final q d(final Context context, final AttributeSet set) {
        return (q)new qf.a(context, set);
    }
    
    public final AppCompatTextView e(final Context context, final AttributeSet set) {
        return new MaterialTextView(context, set);
    }
}
