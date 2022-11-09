// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import yd.a;
import a4.a1;
import androidx.appcompat.widget.z;
import ah2.f;
import android.view.MotionEvent;

public final class h
{
    public static final h a;
    
    static {
        a = new h();
    }
    
    public final long a(final MotionEvent motionEvent, final int n) {
        f.f((Object)motionEvent, "motionEvent");
        return yd.a.y0(z.a(motionEvent, n), a1.a(motionEvent, n));
    }
}
