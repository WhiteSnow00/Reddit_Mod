// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.view.ViewParent;
import android.view.View;
import a4.o;
import sg2.e;

public final class t1
{
    public static final t1 a;
    
    static {
        a = new t1();
    }
    
    public final void a(final AndroidComposeView androidComposeView) {
        e.f((Object)androidComposeView, "ownerView");
        final ViewParent parent = ((View)androidComposeView).getParent();
        if (parent != null) {
            o.f(parent, (View)androidComposeView, (View)androidComposeView);
        }
    }
}
