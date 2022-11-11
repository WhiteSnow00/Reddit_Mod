// 
// Decompiled by Procyon v0.6.0
// 

package cd;

import android.view.View;
import android.opengl.Matrix;
import android.view.MotionEvent;
import android.view.GestureDetector$OnGestureListener;
import android.content.Context;
import android.view.GestureDetector;
import android.graphics.PointF;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$SimpleOnGestureListener;

public final class k extends GestureDetector$SimpleOnGestureListener implements View$OnTouchListener, d$a
{
    public final PointF f;
    public final PointF g;
    public final k.k$a h;
    public final float i;
    public final GestureDetector j;
    public volatile float k;
    
    public k(final Context context, final j.a h) {
        this.f = new PointF();
        this.g = new PointF();
        this.h = (k.k$a)h;
        this.i = 25.0f;
        this.j = new GestureDetector(context, (GestureDetector$OnGestureListener)this);
        this.k = 3.1415927f;
    }
    
    public final void a(final float n, final float[] array) {
        this.k = -n;
    }
    
    public final boolean onDown(final MotionEvent motionEvent) {
        this.f.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }
    
    public final boolean onScroll(final MotionEvent motionEvent, MotionEvent motionEvent2, float y, float y2) {
        y = (motionEvent2.getX() - this.f.x) / this.i;
        y2 = motionEvent2.getY();
        final PointF f = this.f;
        final float n = (y2 - f.y) / this.i;
        f.set(motionEvent2.getX(), motionEvent2.getY());
        final double n2 = this.k;
        final float n3 = (float)Math.cos(n2);
        y2 = (float)Math.sin(n2);
        final PointF g = this.g;
        g.x -= n3 * y - y2 * n;
        y = n3 * n + y2 * y + g.y;
        g.y = y;
        g.y = Math.max(-45.0f, Math.min(45.0f, y));
        final k.k$a h = this.h;
        final PointF g2 = this.g;
        motionEvent2 = (MotionEvent)h;
        synchronized (motionEvent2) {
            y = g2.y;
            ((j.a)motionEvent2).l = y;
            Matrix.setRotateM(((j.a)motionEvent2).j, 0, -y, (float)Math.cos(((j.a)motionEvent2).m), (float)Math.sin(((j.a)motionEvent2).m), 0.0f);
            Matrix.setRotateM(((j.a)motionEvent2).k, 0, -g2.x, 0.0f, 1.0f, 0.0f);
            return true;
        }
    }
    
    public final boolean onSingleTapUp(final MotionEvent motionEvent) {
        return ((View)((j.a)this.h).p).performClick();
    }
    
    public final boolean onTouch(final View view, final MotionEvent motionEvent) {
        return this.j.onTouchEvent(motionEvent);
    }
}
