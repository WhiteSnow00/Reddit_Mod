// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget;

import android.widget.TextView;
import android.content.res.TypedArray;
import aa1.a;
import android.util.AttributeSet;
import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;

public class KernedTextView extends AppCompatTextView
{
    public float relativeLetterSpacing;
    
    public KernedTextView(final Context context) {
        this(context, null);
    }
    
    public KernedTextView(Context obtainStyledAttributes, final AttributeSet set) {
        super(obtainStyledAttributes, set);
        this.relativeLetterSpacing = 0.0f;
        if (set != null) {
            obtainStyledAttributes = (Context)obtainStyledAttributes.getTheme().obtainStyledAttributes(set, a.o, 0, 0);
            try {
                ((TypedArray)obtainStyledAttributes).getFloat(0, 0.0f);
            }
            finally {
                ((TypedArray)obtainStyledAttributes).recycle();
            }
        }
    }
    
    public void invalidate() {
        ((TextView)this).setLetterSpacing(this.relativeLetterSpacing / ((TextView)this).getTextSize());
        super.invalidate();
    }
}
