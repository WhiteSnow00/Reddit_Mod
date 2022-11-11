// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import a4.d1;
import a4.c1;
import sg2.e;
import android.graphics.Canvas;

public final class q
{
    public static final q a;
    
    static {
        a = new q();
    }
    
    public final void a(final Canvas canvas, final boolean b) {
        e.f((Object)canvas, "canvas");
        if (b) {
            c1.g(canvas);
        }
        else {
            d1.e(canvas);
        }
    }
}
