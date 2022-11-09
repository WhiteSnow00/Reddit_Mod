// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.os.Handler;
import android.view.GestureDetector$OnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.GestureDetector$SimpleOnGestureListener;
import android.content.Context;

public final class g
{
    public final a a;
    
    public g(final Context context, final GestureDetector$SimpleOnGestureListener gestureDetector$SimpleOnGestureListener) {
        this.a = new a(context, gestureDetector$SimpleOnGestureListener);
    }
    
    public final boolean a(final MotionEvent motionEvent) {
        return this.a.a.onTouchEvent(motionEvent);
    }
    
    public static final class a
    {
        public final GestureDetector a;
        
        public a(final Context context, final GestureDetector$SimpleOnGestureListener gestureDetector$SimpleOnGestureListener) {
            this.a = new GestureDetector(context, (GestureDetector$OnGestureListener)gestureDetector$SimpleOnGestureListener, (Handler)null);
        }
    }
}
