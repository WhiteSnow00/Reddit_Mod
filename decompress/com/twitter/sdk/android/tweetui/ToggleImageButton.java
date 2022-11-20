// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageButton;

public class ToggleImageButton extends ImageButton
{
    private static final int[] STATE_TOGGLED_ON;
    public String contentDescriptionOff;
    public String contentDescriptionOn;
    public boolean isToggledOn;
    public final boolean toggleOnClick;
    
    static {
        STATE_TOGGLED_ON = new int[] { R$attr.state_toggled_on };
    }
    
    public ToggleImageButton(final Context context) {
        this(context, null);
    }
    
    public ToggleImageButton(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ToggleImageButton(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        TypedArray obtainStyledAttributes = null;
        try {
            final TypedArray typedArray = obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, R$styleable.ToggleImageButton, n, 0);
            final String string = typedArray.getString(R$styleable.ToggleImageButton_contentDescriptionOn);
            obtainStyledAttributes = typedArray;
            final String string2 = typedArray.getString(R$styleable.ToggleImageButton_contentDescriptionOff);
            String contentDescriptionOn = string;
            if (string == null) {
                obtainStyledAttributes = typedArray;
                contentDescriptionOn = (String)((View)this).getContentDescription();
            }
            obtainStyledAttributes = typedArray;
            this.contentDescriptionOn = contentDescriptionOn;
            String contentDescriptionOff;
            if ((contentDescriptionOff = string2) == null) {
                obtainStyledAttributes = typedArray;
                contentDescriptionOff = (String)((View)this).getContentDescription();
            }
            obtainStyledAttributes = typedArray;
            this.contentDescriptionOff = contentDescriptionOff;
            obtainStyledAttributes = typedArray;
            this.toggleOnClick = typedArray.getBoolean(R$styleable.ToggleImageButton_toggleOnClick, true);
            obtainStyledAttributes = typedArray;
            this.setToggledOn(false);
            typedArray.recycle();
        }
        finally {
            if (obtainStyledAttributes != null) {
                obtainStyledAttributes.recycle();
            }
        }
    }
    
    public boolean isToggledOn() {
        return this.isToggledOn;
    }
    
    public int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 2);
        if (this.isToggledOn) {
            View.mergeDrawableStates(onCreateDrawableState, ToggleImageButton.STATE_TOGGLED_ON);
        }
        return onCreateDrawableState;
    }
    
    public boolean performClick() {
        if (this.toggleOnClick) {
            this.toggle();
        }
        return super.performClick();
    }
    
    public void setToggledOn(final boolean isToggledOn) {
        this.isToggledOn = isToggledOn;
        String contentDescription;
        if (isToggledOn) {
            contentDescription = this.contentDescriptionOn;
        }
        else {
            contentDescription = this.contentDescriptionOff;
        }
        ((View)this).setContentDescription((CharSequence)contentDescription);
        ((View)this).refreshDrawableState();
    }
    
    public void toggle() {
        this.setToggledOn(this.isToggledOn ^ true);
    }
}
