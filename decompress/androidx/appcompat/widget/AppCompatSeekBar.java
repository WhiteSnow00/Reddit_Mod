// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.SeekBar;

public class AppCompatSeekBar extends SeekBar
{
    private final t mAppCompatSeekBarHelper;
    
    public AppCompatSeekBar(final Context context) {
        this(context, null);
    }
    
    public AppCompatSeekBar(final Context context, final AttributeSet set) {
        this(context, set, 2130969741);
    }
    
    public AppCompatSeekBar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        t0.a(((View)this).getContext(), (View)this);
        (this.mAppCompatSeekBarHelper = new t((SeekBar)this)).a(set, n);
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final t mAppCompatSeekBarHelper = this.mAppCompatSeekBarHelper;
        final Drawable e = mAppCompatSeekBarHelper.e;
        if (e != null && e.isStateful() && e.setState(((View)mAppCompatSeekBarHelper.d).getDrawableState())) {
            ((View)mAppCompatSeekBarHelper.d).invalidateDrawable(e);
        }
    }
    
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable e = this.mAppCompatSeekBarHelper.e;
        if (e != null) {
            e.jumpToCurrentState();
        }
    }
    
    public void onDraw(final Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            this.mAppCompatSeekBarHelper.d(canvas);
        }
    }
}
