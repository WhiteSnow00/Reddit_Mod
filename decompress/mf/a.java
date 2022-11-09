// 
// Decompiled by Procyon v0.6.0
// 

package mf;

import android.os.Build$VERSION;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.graphics.Rect;
import android.app.Dialog;
import android.view.View$OnTouchListener;

public final class a implements View$OnTouchListener
{
    public final Dialog f;
    public final int g;
    public final int h;
    public final int i;
    
    public a(final Dialog f, final Rect rect) {
        this.f = f;
        this.g = rect.left;
        this.h = rect.top;
        this.i = ViewConfiguration.get(f.getContext()).getScaledWindowTouchSlop();
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        final View viewById = view.findViewById(16908290);
        final int n = viewById.getLeft() + this.g;
        final int width = viewById.getWidth();
        final int n2 = viewById.getTop() + this.h;
        if (new RectF((float)n, (float)n2, (float)(width + n), (float)(viewById.getHeight() + n2)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        final MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build$VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            final int i = this.i;
            obtain.setLocation((float)(-i - 1), (float)(-i - 1));
        }
        view.performClick();
        return this.f.onTouchEvent(obtain);
    }
}
