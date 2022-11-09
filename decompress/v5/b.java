// 
// Decompiled by Procyon v0.6.0
// 

package v5;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Animatable2$AnimationCallback;

public abstract class b
{
    public Animatable2$AnimationCallback mPlatformCallback;
    
    public Animatable2$AnimationCallback getPlatformCallback() {
        if (this.mPlatformCallback == null) {
            this.mPlatformCallback = new Animatable2$AnimationCallback() {
                public final void onAnimationEnd(final Drawable drawable) {
                    b.this.onAnimationEnd(drawable);
                }
                
                public final void onAnimationStart(final Drawable drawable) {
                    b.this.onAnimationStart(drawable);
                }
            };
        }
        return this.mPlatformCallback;
    }
    
    public void onAnimationEnd(final Drawable drawable) {
    }
    
    public void onAnimationStart(final Drawable drawable) {
    }
}
