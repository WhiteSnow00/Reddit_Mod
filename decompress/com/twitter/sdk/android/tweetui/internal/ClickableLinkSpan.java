// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui.internal;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ClickableSpan;

public abstract class ClickableLinkSpan extends ClickableSpan implements HighlightedClickableSpan
{
    private final boolean colored;
    public final int linkColor;
    private boolean selected;
    private final int selectedColor;
    private final boolean underlined;
    
    public ClickableLinkSpan(final int n, final int n2, final boolean b) {
        this(n, n2, true, b);
    }
    
    public ClickableLinkSpan(final int selectedColor, final int linkColor, final boolean colored, final boolean underlined) {
        this.selectedColor = selectedColor;
        this.linkColor = linkColor;
        this.colored = colored;
        this.underlined = underlined;
    }
    
    public boolean isSelected() {
        return this.selected;
    }
    
    public void select(final boolean selected) {
        this.selected = selected;
    }
    
    public void updateDrawState(final TextPaint textPaint) {
        if (this.colored) {
            ((Paint)textPaint).setColor(this.linkColor);
        }
        else {
            ((Paint)textPaint).setColor(textPaint.linkColor);
        }
        if (this.selected) {
            textPaint.bgColor = this.selectedColor;
        }
        else {
            textPaint.bgColor = 0;
        }
        if (this.underlined) {
            ((Paint)textPaint).setUnderlineText(true);
        }
    }
}
