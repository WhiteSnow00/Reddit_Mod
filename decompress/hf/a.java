// 
// Decompiled by Procyon v0.6.0
// 

package hf;

import android.view.View;
import dg.l0;
import android.content.res.TypedArray;
import android.widget.CompoundButton;
import rf.c;
import pf.g;
import oy0.b;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.f;

public final class a extends f
{
    public static final int[][] l;
    public ColorStateList j;
    public boolean k;
    
    static {
        l = new int[][] { { 16842910, 16842912 }, { 16842910, -16842912 }, { -16842910, 16842912 }, { -16842910, -16842912 } };
    }
    
    public a(Context context, final AttributeSet set) {
        super(zf.a.a(context, set, 2130968760, 2132018118), set, 2130968760);
        context = ((View)this).getContext();
        final TypedArray d = pf.g.d(context, set, b.Q, 2130968760, 2132018118, new int[0]);
        if (d.hasValue(0)) {
            e4.b.c((CompoundButton)this, c.a(context, d, 0));
        }
        this.k = d.getBoolean(1, false);
        d.recycle();
    }
    
    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.j == null) {
            final int[][] l = a.l;
            final int k0 = l0.k0(2130968819, (View)this);
            final int k2 = l0.k0(2130968836, (View)this);
            final int k3 = l0.k0(2130968828, (View)this);
            this.j = new ColorStateList(l, new int[] { l0.I0(1.0f, k2, k0), l0.I0(0.54f, k2, k3), l0.I0(0.38f, k2, k3), l0.I0(0.38f, k2, k3) });
        }
        return this.j;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.k && e4.b.a((CompoundButton)this) == null) {
            this.setUseMaterialThemeColors(true);
        }
    }
    
    public void setUseMaterialThemeColors(final boolean k) {
        this.k = k;
        if (k) {
            e4.b.c((CompoundButton)this, this.getMaterialThemeColorsTintList());
        }
        else {
            e4.b.c((CompoundButton)this, (ColorStateList)null);
        }
    }
}
