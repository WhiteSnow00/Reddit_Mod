// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import b4.c;
import android.view.View;
import a4.a;

public final class i extends a
{
    public final MaterialCalendar b;
    
    public i(final MaterialCalendar b) {
        this.b = b;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final c c) {
        super.onInitializeAccessibilityNodeInfo(view, c);
        String s;
        if (this.b.p.getVisibility() == 0) {
            s = ((Fragment)this.b).getString(2131956049);
        }
        else {
            s = ((Fragment)this.b).getString(2131956047);
        }
        c.t(s);
    }
}
