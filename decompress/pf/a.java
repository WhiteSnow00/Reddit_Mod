// 
// Decompiled by Procyon v0.6.0
// 

package pf;

import android.view.accessibility.AccessibilityRecord;
import b4.c;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import com.google.android.material.internal.CheckableImageButton;

public final class a extends a4.a
{
    public final CheckableImageButton b;
    
    public a(final CheckableImageButton b) {
        this.b = b;
    }
    
    public final void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        ((AccessibilityRecord)accessibilityEvent).setChecked(this.b.isChecked());
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final c c) {
        super.onInitializeAccessibilityNodeInfo(view, c);
        c.a.setCheckable(this.b.j);
        c.a.setChecked(this.b.isChecked());
    }
}
