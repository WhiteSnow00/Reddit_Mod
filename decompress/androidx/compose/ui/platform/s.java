// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.view.PointerIcon;
import z1.b;
import z1.a;
import sg2.e;
import z1.l;
import android.view.View;

public final class s
{
    public static final s a;
    
    static {
        a = new s();
    }
    
    public final void a(final View view, final l l) {
        e.f((Object)view, "view");
        PointerIcon pointerIcon;
        if (l instanceof a) {
            ((a)l).getClass();
            pointerIcon = null;
        }
        else if (l instanceof b) {
            pointerIcon = PointerIcon.getSystemIcon(view.getContext(), ((b)l).a);
        }
        else {
            pointerIcon = PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (!e.a((Object)view.getPointerIcon(), (Object)pointerIcon)) {
            view.setPointerIcon(pointerIcon);
        }
    }
}
