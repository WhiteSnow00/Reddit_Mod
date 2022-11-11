// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.appbar;

import a4.u1;
import java.util.WeakHashMap;
import android.graphics.drawable.Drawable;
import android.view.View;
import a4.p0;
import android.content.res.ColorStateList;
import vf.f;
import android.graphics.drawable.ColorDrawable;
import ag.a;
import android.util.AttributeSet;
import android.content.Context;
import androidx.appcompat.widget.Toolbar;

public class MaterialToolbar extends Toolbar
{
    public MaterialToolbar(Context a, final AttributeSet set) {
        a = a.a(a, set, 2130970004, 2132018170);
        int color = 0;
        super(a, set, 0);
        final Context context = ((View)this).getContext();
        final Drawable background = ((View)this).getBackground();
        if (background == null || background instanceof ColorDrawable) {
            final vf.f f = new vf.f();
            if (background != null) {
                color = ((ColorDrawable)background).getColor();
            }
            f.l(ColorStateList.valueOf(color));
            f.i(context);
            final WeakHashMap a2 = p0.a;
            f.k(p0.i.i((View)this));
            p0.d.q((View)this, (Drawable)f);
        }
    }
    
    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final Drawable background = ((View)this).getBackground();
        if (background instanceof vf.f) {
            u1.c1((View)this, (vf.f)background);
        }
    }
    
    public void setElevation(final float elevation) {
        super.setElevation(elevation);
        final Drawable background = ((View)this).getBackground();
        if (background instanceof vf.f) {
            ((vf.f)background).k(elevation);
        }
    }
}
