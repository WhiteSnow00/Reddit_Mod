// 
// Decompiled by Procyon v0.6.0
// 

package com.wdullaer.materialdatetimepicker;

import android.view.accessibility.AccessibilityRecord;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.view.accessibility.AccessibilityEvent;
import android.util.AttributeSet;
import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;

public class AccessibleTextView extends AppCompatTextView
{
    public AccessibleTextView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ((AccessibilityRecord)accessibilityEvent).setClassName((CharSequence)Button.class.getName());
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)Button.class.getName());
    }
}
