// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import a4.c1;
import sg2.e;
import java.util.Map;
import android.view.View;

public final class u1
{
    public static final u1 a;
    
    static {
        a = new u1();
    }
    
    public final Map<Integer, Integer> a(final View view) {
        e.f((Object)view, "view");
        final Map e = c1.e(view);
        sg2.e.e((Object)e, "view.attributeSourceResourceMap");
        return e;
    }
}
