// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.graphics.Rect;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout
{
    public FitWindowsLinearLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final boolean fitSystemWindows(final Rect rect) {
        return super.fitSystemWindows(rect);
    }
    
    public void setOnFitSystemWindowsListener(final f0 f0) {
    }
}
