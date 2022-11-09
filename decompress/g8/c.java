// 
// Decompiled by Procyon v0.6.0
// 

package g8;

import m5.b;
import android.view.ViewParent;
import android.view.View$OnAttachStateChangeListener;
import android.content.Context;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import ah2.f;
import com.bluelinelabs.conductor.ControllerChangeType;
import com.bluelinelabs.conductor.Controller;
import java.util.LinkedHashMap;
import android.os.Bundle;
import androidx.lifecycle.r;
import m5.d;
import androidx.lifecycle.q;

public final class c implements q, d
{
    public r f;
    public m5.c g;
    public boolean h;
    public Bundle i;
    public final LinkedHashMap j;
    
    public c(final Controller controller) {
        this.i = Bundle.EMPTY;
        this.j = new LinkedHashMap();
        controller.RA((Controller.e)new Controller.e() {
            public final /* synthetic */ c f;
            
            @Override
            public final void d(final Controller controller, final com.bluelinelabs.conductor.c c, final ControllerChangeType controllerChangeType) {
                ah2.f.f((Object)controller, "changeController");
                ah2.f.f((Object)c, "changeHandler");
                ah2.f.f((Object)controllerChangeType, "changeType");
                if (controller == controller && controllerChangeType.isEnter && c.i()) {
                    final View q = controller.q;
                    IBinder windowToken;
                    if (q == null) {
                        windowToken = null;
                    }
                    else {
                        windowToken = q.getWindowToken();
                    }
                    if (windowToken != null) {
                        final r f = this.f.f;
                        if (f == null) {
                            ah2.f.n("lifecycleRegistry");
                            throw null;
                        }
                        if (f.c == Lifecycle.State.STARTED) {
                            f.f(Lifecycle.Event.ON_RESUME);
                        }
                    }
                }
            }
            
            @Override
            public final void e(final Controller controller, final com.bluelinelabs.conductor.c c, final ControllerChangeType controllerChangeType) {
                ah2.f.f((Object)controller, "changeController");
                ah2.f.f((Object)controllerChangeType, "changeType");
                c.a(this.f, controller, controller, c, controllerChangeType);
            }
            
            @Override
            public final void f(final Controller controller, final Bundle bundle) {
                ah2.f.f((Object)controller, "controller");
                ah2.f.f((Object)bundle, "savedInstanceState");
                this.f.i = bundle.getBundle("Registry.savedState");
            }
            
            @Override
            public final void g(final Controller controller, final Bundle bundle) {
                bundle.putBundle("Registry.savedState", this.f.i);
            }
            
            @Override
            public final void h(final Controller controller, final Bundle bundle) {
                ah2.f.f((Object)controller, "controller");
                ah2.f.f((Object)bundle, "outState");
                final c f = this.f;
                if (!f.h) {
                    f.i = new Bundle();
                    final c f2 = this.f;
                    final m5.c g = f2.g;
                    if (g == null) {
                        ah2.f.n("savedStateRegistryController");
                        throw null;
                    }
                    g.c(f2.i);
                }
            }
            
            @Override
            public final void i(final Controller controller, final View view) {
                ah2.f.f((Object)controller, "controller");
                ah2.f.f((Object)view, "view");
                final r f = this.f.f;
                if (f != null) {
                    f.f(Lifecycle.Event.ON_RESUME);
                    return;
                }
                ah2.f.n("lifecycleRegistry");
                throw null;
            }
            
            @Override
            public final void j(final Activity activity, final Controller controller) {
                ah2.f.f((Object)controller, "controller");
                this.f.b(controller);
            }
            
            @Override
            public final void l(final Controller controller, final View view) {
                ah2.f.f((Object)view, "view");
                if (view.getTag(2131432177) == null && view.getTag(2131432179) == null) {
                    view.setTag(2131432177, (Object)this.f);
                    ViewTreeSavedStateRegistryOwner.b(view, (d)this.f);
                }
                final r f = this.f.f;
                if (f != null) {
                    f.f(Lifecycle.Event.ON_START);
                    return;
                }
                ah2.f.n("lifecycleRegistry");
                throw null;
            }
            
            @Override
            public final void r(final Context context, Controller r) {
                ah2.f.f((Object)r, "controller");
                ah2.f.f((Object)context, "context");
                final c f = this.f;
                f.getClass();
                r = r.r;
                if (r != null) {
                    final e e = (e)f.j.remove(r.s);
                    if (e != null) {
                        r.FB(e);
                    }
                }
            }
            
            @Override
            public final void s(final Controller controller) {
                final c f = this.f;
                f.h = false;
                f.f = new r((q)f);
                final c f2 = this.f;
                ah2.f.f((Object)f2, "owner");
                f2.g = new m5.c((d)f2);
                final c f3 = this.f;
                final m5.c g = f3.g;
                if (g == null) {
                    ah2.f.n("savedStateRegistryController");
                    throw null;
                }
                g.b(f3.i);
                final r f4 = this.f.f;
                if (f4 != null) {
                    f4.f(Lifecycle.Event.ON_CREATE);
                    return;
                }
                ah2.f.n("lifecycleRegistry");
                throw null;
            }
            
            @Override
            public final void u(final Controller controller, final View view) {
                ah2.f.f((Object)controller, "controller");
                ah2.f.f((Object)view, "view");
                final boolean i = controller.i;
                final View view2 = null;
                if (i && controller.p.f() == 0) {
                    final ViewParent parent = view.getParent();
                    View view3 = view2;
                    if (parent instanceof View) {
                        view3 = (View)parent;
                    }
                    if (view3 != null) {
                        view3.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new c$a$a(view3, this.f));
                    }
                }
                else {
                    final r f = this.f.f;
                    if (f == null) {
                        ah2.f.n("lifecycleRegistry");
                        throw null;
                    }
                    f.f(Lifecycle.Event.ON_DESTROY);
                }
            }
            
            @Override
            public final void v(final Controller controller, final View view) {
                ah2.f.f((Object)controller, "controller");
                ah2.f.f((Object)view, "view");
                final r f = this.f.f;
                if (f == null) {
                    ah2.f.n("lifecycleRegistry");
                    throw null;
                }
                if (f.c == Lifecycle.State.RESUMED) {
                    if (f == null) {
                        ah2.f.n("lifecycleRegistry");
                        throw null;
                    }
                    f.f(Lifecycle.Event.ON_PAUSE);
                }
                final r f2 = this.f.f;
                if (f2 != null) {
                    f2.f(Lifecycle.Event.ON_STOP);
                    return;
                }
                ah2.f.n("lifecycleRegistry");
                throw null;
            }
        });
    }
    
    public static final void a(final c c, final Controller controller, final Controller controller2, final com.bluelinelabs.conductor.c c2, final ControllerChangeType controllerChangeType) {
        c.getClass();
        if (controller == controller2 && !controllerChangeType.isEnter && c2.i() && controller2.q != null) {
            final r f = c.f;
            if (f == null) {
                ah2.f.n("lifecycleRegistry");
                throw null;
            }
            if (f.c == Lifecycle.State.RESUMED) {
                f.f(Lifecycle.Event.ON_PAUSE);
                final Bundle i = new Bundle();
                c.i = i;
                final m5.c g = c.g;
                if (g == null) {
                    ah2.f.n("savedStateRegistryController");
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
            final Controller.e e = new Controller.e() {
                public final /* synthetic */ c f;
                
                @Override
                public final void e(final Controller controller, final com.bluelinelabs.conductor.c c, final ControllerChangeType controllerChangeType) {
                    ah2.f.f((Object)controller, "controller");
                    ah2.f.f((Object)controllerChangeType, "changeType");
                    final c f = this.f;
                    if (f.f != null) {
                        final Controller g = r;
                        ah2.f.e((Object)g, "parent");
                        c.a(f, g, controller, c, controllerChangeType);
                    }
                }
            };
            r.RA((Controller.e)e);
            final LinkedHashMap j = this.j;
            final String s = controller.s;
            ah2.f.e((Object)s, "controller.instanceId");
            j.put(s, e);
            this.b(r);
        }
    }
    
    public final Lifecycle getLifecycle() {
        final r f = this.f;
        if (f != null) {
            return f;
        }
        ah2.f.n("lifecycleRegistry");
        throw null;
    }
    
    public final b getSavedStateRegistry() {
        final m5.c g = this.g;
        if (g != null) {
            final b b = g.b;
            ah2.f.e((Object)b, "savedStateRegistryController.savedStateRegistry");
            return b;
        }
        ah2.f.n("savedStateRegistryController");
        throw null;
    }
}
