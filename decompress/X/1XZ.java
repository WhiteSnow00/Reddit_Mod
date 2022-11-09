// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils$TruncateAt;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class 1xz extends 1ib
{
    public boolean LIZ;
    public int LIZIZ;
    public int LIZJ;
    
    static {
        Covode.recordClassIndex(8039);
    }
    
    public 1xz(final Context context, final AttributeSet set) {
        super(context, set);
        this.LIZ = true;
        this.LIZIZ = 1;
        int lizj = 4;
        this.LIZJ = 4;
        this.LIZIZ = (Ghp.LIZ(this.getContext()) ? 1 : 0);
        if (!Ghp.LIZ(this.getContext())) {
            lizj = 3;
        }
        this.LIZJ = lizj;
    }
    
    public final void LIZ() {
        this.LIZ = true;
        this.setSelected(false);
        this.setFocusable(false);
        this.setFocusableInTouchMode(false);
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        return false;
    }
    
    public int getLayoutDirection() {
        return this.LIZIZ;
    }
    
    public float getLeftFadingEdgeStrength() {
        return 0.0f;
    }
    
    public float getRightFadingEdgeStrength() {
        return 0.0f;
    }
    
    public int getTextDirection() {
        return this.LIZJ;
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setSelected(false);
    }
    
    public void onFocusChanged(final boolean b, final int n, final Rect rect) {
        super.onFocusChanged(b, n, rect);
    }
    
    @Override
    public void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (!this.LIZ && this.getRight() - this.getLeft() - this.getCompoundPaddingLeft() - this.getCompoundPaddingRight() > 0) {
            this.setSelected(false);
            this.setEllipsize(TextUtils$TruncateAt.MARQUEE);
            this.setSelected(true);
            this.setFocusable(true);
            this.setFocusableInTouchMode(true);
        }
    }
    
    public void onWindowFocusChanged(final boolean b) {
    }
}
