// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView;
import android.view.ActionMode$Callback;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.widget.Button;

public class 09b extends Button
{
    static {
        Covode.recordClassIndex(1004);
    }
    
    public 09b(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public boolean hasWindowFocus() {
        return this.isEnabled() && this.getVisibility() == 0;
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(08p.LIZ((TextView)this, actionMode$Callback));
    }
}
