// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class UnPressableLinearLayout extends LinearLayout
{
    public UnPressableLinearLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final void dispatchSetPressed(final boolean b) {
    }
}
