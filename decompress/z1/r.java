// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import ng2.e;
import java.util.ArrayList;
import android.view.MotionEvent;
import java.util.List;

public final class r
{
    public final List<s> a;
    public final MotionEvent b;
    
    public r(final ArrayList a, final MotionEvent b) {
        e.f((Object)a, "pointers");
        e.f((Object)b, "motionEvent");
        this.a = a;
        this.b = b;
    }
}
