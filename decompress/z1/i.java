// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import vl.a;
import androidx.appcompat.widget.z;
import a4.s1;
import ng2.e;
import android.view.MotionEvent;

public final class i
{
    public static final i a;
    
    static {
        a = new i();
    }
    
    public final long a(final MotionEvent motionEvent, final int n) {
        e.f((Object)motionEvent, "motionEvent");
        return vl.a.T(s1.a(motionEvent, n), z.a(motionEvent, n));
    }
}
