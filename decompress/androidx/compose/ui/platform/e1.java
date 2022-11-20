// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.view.ActionMode$Callback;
import android.view.View;
import ng2.e;
import android.view.ActionMode;

public final class e1
{
    public static final e1 a;
    
    static {
        a = new e1();
    }
    
    public final void a(final ActionMode actionMode) {
        e.f((Object)actionMode, "actionMode");
        actionMode.invalidateContentRect();
    }
    
    public final ActionMode b(final View view, final ActionMode$Callback actionMode$Callback, final int n) {
        e.f((Object)view, "view");
        e.f((Object)actionMode$Callback, "actionModeCallback");
        return view.startActionMode(actionMode$Callback, n);
    }
}
