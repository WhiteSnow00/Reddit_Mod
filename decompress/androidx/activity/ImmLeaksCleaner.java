// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.q;
import androidx.lifecycle.o;

final class ImmLeaksCleaner implements o
{
    public static int f;
    
    public ImmLeaksCleaner() {
        throw null;
    }
    
    public final void f(final q q, final Lifecycle$Event lifecycle$Event) {
        if (lifecycle$Event != Lifecycle$Event.ON_DESTROY) {
            return;
        }
        while (true) {
            if (ImmLeaksCleaner.f != 0) {
                break Label_0055;
            }
            try {
                ImmLeaksCleaner.f = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                ImmLeaksCleaner.f = 1;
                if (ImmLeaksCleaner.f != 1) {
                    return;
                }
                throw null;
            }
            catch (final NoSuchFieldException ex) {
                continue;
            }
            break;
        }
    }
}
