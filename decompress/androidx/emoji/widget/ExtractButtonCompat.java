// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji.widget;

import android.view.View;
import android.widget.TextView;
import e4.j;
import android.view.ActionMode$Callback;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Button;

public class ExtractButtonCompat extends Button
{
    public ExtractButtonCompat(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final boolean hasWindowFocus() {
        return ((View)this).isEnabled() && ((View)this).getVisibility() == 0;
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(j.f(actionMode$Callback, (TextView)this));
    }
}
