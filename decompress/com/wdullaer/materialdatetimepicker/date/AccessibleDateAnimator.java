// 
// Decompiled by Procyon v0.6.0
// 

package com.wdullaer.materialdatetimepicker.date;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import android.text.format.DateUtils;
import android.view.accessibility.AccessibilityEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ViewAnimator;

public class AccessibleDateAnimator extends ViewAnimator
{
    public long f;
    
    public AccessibleDateAnimator(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            ((AccessibilityRecord)accessibilityEvent).getText().clear();
            ((AccessibilityRecord)accessibilityEvent).getText().add(DateUtils.formatDateTime(((View)this).getContext(), this.f, 22));
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
    
    public void setDateMillis(final long f) {
        this.f = f;
    }
}
