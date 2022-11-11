// 
// Decompiled by Procyon v0.6.0
// 

package x8;

import java.util.concurrent.locks.Lock;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.util.Log;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import r8.d;

public final class k
{
    public static final k$a a;
    
    static {
        a = new k$a();
    }
    
    public static x8.d a(d a, Drawable drawable, int intrinsicWidth, int intrinsicHeight) {
        final Drawable current = drawable.getCurrent();
        final boolean b = current instanceof BitmapDrawable;
        boolean b2 = false;
        drawable = null;
        Object d = null;
        if (b) {
            drawable = (Drawable)((BitmapDrawable)current).getBitmap();
        }
        else if (!(current instanceof Animatable)) {
            Label_0280: {
                if (intrinsicWidth == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                    drawable = (Drawable)d;
                    if (Log.isLoggable("DrawableToBitmap", 5)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unable to draw ");
                        sb.append(current);
                        sb.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
                        Log.w("DrawableToBitmap", sb.toString());
                        drawable = (Drawable)d;
                        break Label_0280;
                    }
                    break Label_0280;
                }
                else if (intrinsicHeight == Integer.MIN_VALUE && current.getIntrinsicHeight() <= 0) {
                    drawable = (Drawable)d;
                    if (Log.isLoggable("DrawableToBitmap", 5)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unable to draw ");
                        sb2.append(current);
                        sb2.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                        Log.w("DrawableToBitmap", sb2.toString());
                        drawable = (Drawable)d;
                        break Label_0280;
                    }
                    break Label_0280;
                }
                else {
                    if (current.getIntrinsicWidth() > 0) {
                        intrinsicWidth = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        intrinsicHeight = current.getIntrinsicHeight();
                    }
                }
                d = v.d;
                ((Lock)d).lock();
                drawable = (Drawable)a.get(intrinsicWidth, intrinsicHeight, Bitmap$Config.ARGB_8888);
                try {
                    final Canvas canvas = new Canvas((Bitmap)drawable);
                    current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    current.draw(canvas);
                    canvas.setBitmap((Bitmap)null);
                    ((Lock)d).unlock();
                    b2 = true;
                }
                finally {
                    ((Lock)d).unlock();
                }
            }
        }
        if (!b2) {
            a = (d)k.a;
        }
        return x8.d.b(a, (Bitmap)drawable);
    }
}
