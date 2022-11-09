// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import j0.i;
import androidx.core.app.SharedElementCallback;
import java.util.List;
import java.util.ArrayList;
import android.view.View;
import j0.b;
import u5.f;

public final class o0
{
    public static final q0 a;
    public static final u0 b;
    
    static {
        a = new q0();
        u0 b2;
        try {
            b2 = f.class.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final Exception ex) {
            b2 = null;
        }
        b = b2;
    }
    
    public static void a(final Fragment fragment, final Fragment fragment2, final boolean b, final b<String, View> b2, final boolean b3) {
        SharedElementCallback sharedElementCallback;
        if (b) {
            sharedElementCallback = fragment2.getEnterTransitionCallback();
        }
        else {
            sharedElementCallback = fragment.getEnterTransitionCallback();
        }
        if (sharedElementCallback != null) {
            final ArrayList<View> list = new ArrayList<View>();
            final ArrayList<String> list2 = new ArrayList<String>();
            int i = 0;
            int h;
            if (b2 == null) {
                h = 0;
            }
            else {
                h = ((i)b2).h;
            }
            while (i < h) {
                list2.add((String)((i)b2).j(i));
                list.add((View)((i)b2).n(i));
                ++i;
            }
            if (b3) {
                sharedElementCallback.onSharedElementStart(list2, list, null);
            }
            else {
                sharedElementCallback.onSharedElementEnd(list2, list, null);
            }
        }
    }
    
    public static void b(final ArrayList<View> list, final int visibility) {
        if (list == null) {
            return;
        }
        for (int i = list.size() - 1; i >= 0; --i) {
            ((View)list.get(i)).setVisibility(visibility);
        }
    }
}
