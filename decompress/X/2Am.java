// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class 2Am extends 1ib
{
    public boolean LIZ;
    
    static {
        Covode.recordClassIndex(23342);
    }
    
    public 2Am(final Context context, final AttributeSet set) {
        super(context, set);
        this.LIZ = true;
    }
    
    public final void LIZ() {
        this.LIZ = false;
        this.setSelected(true);
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        return false;
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
            this.setSelected(true);
        }
    }
    
    public void onWindowFocusChanged(final boolean b) {
    }
}
