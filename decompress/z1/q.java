// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import ah2.f;
import java.util.ArrayList;
import android.view.MotionEvent;
import java.util.List;

public final class q
{
    public final List<r> a;
    public final MotionEvent b;
    
    public q(final ArrayList a, final MotionEvent b) {
        f.f((Object)a, "pointers");
        f.f((Object)b, "motionEvent");
        this.a = a;
        this.b = b;
    }
}
