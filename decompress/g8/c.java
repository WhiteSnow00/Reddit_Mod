// 
// Decompiled by Procyon v0.6.0
// 

package g8;

import l5.b;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import ng2.e;
import com.bluelinelabs.conductor.ControllerChangeType;
import com.bluelinelabs.conductor.Controller$e;
import com.bluelinelabs.conductor.Controller;
import java.util.LinkedHashMap;
import android.os.Bundle;
import androidx.lifecycle.r;
import l5.d;
import androidx.lifecycle.q;

public final class c implements q, d
{
    public r f;
    public l5.c g;
    public boolean h;
    public Bundle i;
    public final LinkedHashMap j;
    
    public c(final Controller controller) {
        this.i = Bundle.EMPTY;
        this.j = new LinkedHashMap();
        controller.HA((Controller$e)new c$a(this, controller));
    }
    
    public static final void a(final c c, final Controller controller, final Controller controller2, final com.bluelinelabs.conductor.c c2, final ControllerChangeType controllerChangeType) {
        c.getClass();
        if (controller == controller2 && !controllerChangeType.isEnter && c2.i() && controller2.q != null) {
            final r f = c.f;
            if (f == null) {
                e.n("lifecycleRegistry");
                throw null;
            }
            if (f.c == Lifecycle$State.RESUMED) {
                f.f(Lifecycle$Event.ON_PAUSE);
                final Bundle i = new Bundle();
                c.i = i;
                final l5.c g = c.g;
                if (g == null) {
                    e.n("savedStateRegistryController");
                    throw null;
                }
                g.c(i);
                c.h = true;
            }
        }
    }
    
    public final void b(final Controller controller) {
        final Controller r = controller.r;
        if (r != null) {
            final c$b c$b = new c$b(this, r);
            r.HA((Controller$e)c$b);
            final LinkedHashMap j = this.j;
            final String s = controller.s;
            e.e((Object)s, "controller.instanceId");
            j.put(s, c$b);
            this.b(r);
        }
    }
    
    public final Lifecycle getLifecycle() {
        final r f = this.f;
        if (f != null) {
            return (Lifecycle)f;
        }
        e.n("lifecycleRegistry");
        throw null;
    }
    
    public final b getSavedStateRegistry() {
        final l5.c g = this.g;
        if (g != null) {
            final b b = g.b;
            e.e((Object)b, "savedStateRegistryController.savedStateRegistry");
            return b;
        }
        e.n("savedStateRegistryController");
        throw null;
    }
}
