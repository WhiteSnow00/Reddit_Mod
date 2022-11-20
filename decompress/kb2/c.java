// 
// Decompiled by Procyon v0.6.0
// 

package kb2;

import ng2.e;
import android.view.MotionEvent;
import android.view.View;
import android.view.GestureDetector;
import android.view.View$OnTouchListener;

public final class c implements View$OnTouchListener
{
    public final GestureDetector f;
    
    public c(final GestureDetector f) {
        this.f = f;
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final GestureDetector f = this.f;
        e.f((Object)f, "$gestureDetector");
        f.onTouchEvent(motionEvent);
        return true;
    }
}
