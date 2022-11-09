// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.GestureDetector$OnDoubleTapListener;
import android.view.GestureDetector$OnGestureListener;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 07w
{
    public final a LIZ;
    
    static {
        Covode.recordClassIndex(843);
    }
    
    public 07w(final Context context, final GestureDetector$OnGestureListener gestureDetector$OnGestureListener) {
        this(context, gestureDetector$OnGestureListener, (byte)0);
    }
    
    public 07w(final Context context, final GestureDetector$OnGestureListener gestureDetector$OnGestureListener, final byte b) {
        this.LIZ = (a)new b(context, gestureDetector$OnGestureListener);
    }
    
    public final void LIZ() {
        this.LIZ.LIZ();
    }
    
    public final void LIZ(final GestureDetector$OnDoubleTapListener gestureDetector$OnDoubleTapListener) {
        this.LIZ.LIZ(gestureDetector$OnDoubleTapListener);
    }
    
    public final boolean LIZ(final MotionEvent motionEvent) {
        return this.LIZ.LIZ(motionEvent);
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(844);
        }
        
        void LIZ();
        
        void LIZ(final GestureDetector$OnDoubleTapListener p0);
        
        boolean LIZ(final MotionEvent p0);
    }
    
    public static final class b implements a
    {
        public final GestureDetector LIZ;
        
        static {
            Covode.recordClassIndex(845);
        }
        
        public b(final Context context, final GestureDetector$OnGestureListener gestureDetector$OnGestureListener) {
            this.LIZ = new GestureDetector(context, gestureDetector$OnGestureListener, (Handler)null);
        }
        
        @Override
        public final void LIZ() {
            this.LIZ.setIsLongpressEnabled(false);
        }
        
        @Override
        public final void LIZ(final GestureDetector$OnDoubleTapListener onDoubleTapListener) {
            this.LIZ.setOnDoubleTapListener(onDoubleTapListener);
        }
        
        @Override
        public final boolean LIZ(final MotionEvent motionEvent) {
            return this.LIZ.onTouchEvent(motionEvent);
        }
    }
}
