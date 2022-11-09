// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.View;
import e4.i;
import gn.a;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.PopupWindow;

public final class o extends PopupWindow
{
    public o(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        final z0 z0 = new z0(context, context.obtainStyledAttributes(set, a.i0, n, n2));
        if (z0.l(2)) {
            i.c((PopupWindow)this, z0.a(2, false));
        }
        this.setBackgroundDrawable(z0.e(0));
        z0.n();
    }
    
    public final void showAsDropDown(final View view, final int n, final int n2) {
        super.showAsDropDown(view, n, n2);
    }
    
    public final void showAsDropDown(final View view, final int n, final int n2, final int n3) {
        super.showAsDropDown(view, n, n2, n3);
    }
    
    public final void update(final View view, final int n, final int n2, final int n3, final int n4) {
        super.update(view, n, n2, n3, n4);
    }
}
