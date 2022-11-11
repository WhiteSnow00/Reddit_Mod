// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.contrib.viewpropertyobjectanimator;

import android.view.View;
import java.lang.ref.WeakReference;

abstract class ChangeUpdateListener
{
    public final WeakReference<View> viewRef;
    
    public ChangeUpdateListener(final View view) {
        this.viewRef = new WeakReference<View>(view);
    }
    
    public float calculateAnimatedValue(final float n, final float n2, final float n3) {
        return n2 - (1.0f - n3) * (n2 - n);
    }
    
    public boolean hasView() {
        return this.viewRef.get() != null;
    }
    
    public class FloatValues
    {
        public float from;
        public float to;
        
        public FloatValues(final float from, final float to) {
            this.from = from;
            this.to = to;
        }
    }
    
    public class IntValues
    {
        public int from;
        public int to;
        
        public IntValues(final int from, final int to) {
            this.from = from;
            this.to = to;
        }
    }
}
