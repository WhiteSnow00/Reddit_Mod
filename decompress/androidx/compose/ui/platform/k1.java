// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.graphics.RenderEffect;
import a4.h1;
import sg2.e;
import o1.g0;
import android.view.View;

public final class k1
{
    public static final k1 a;
    
    static {
        a = new k1();
    }
    
    public final void a(final View view, final g0 g0) {
        e.f((Object)view, "view");
        RenderEffect a;
        if (g0 != null) {
            if ((a = g0.a) == null) {
                a = g0.a();
                g0.a = a;
            }
        }
        else {
            a = null;
        }
        h1.b(view, a);
    }
}
