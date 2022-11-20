// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget;

import android.content.res.TypedArray;
import zg.a;
import android.util.AttributeSet;
import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;

public class KernedTextView extends AppCompatTextView
{
    public float relativeLetterSpacing;
    
    public KernedTextView(final Context context) {
        this(context, null);
    }
    
    public KernedTextView(final Context context, AttributeSet obtainStyledAttributes) {
        super(context, obtainStyledAttributes);
        this.relativeLetterSpacing = 0.0f;
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes = (AttributeSet)context.getTheme().obtainStyledAttributes(obtainStyledAttributes, zg.a.p, 0, 0);
            try {
                ((TypedArray)obtainStyledAttributes).getFloat(0, 0.0f);
            }
            finally {
                ((TypedArray)obtainStyledAttributes).recycle();
            }
        }
    }
    
    public void invalidate() {
        this.setLetterSpacing(this.relativeLetterSpacing / this.getTextSize());
        super.invalidate();
    }
}
