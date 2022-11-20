// 
// Decompiled by Procyon v0.6.0
// 

package ob1;

import android.view.View;
import com.bluelinelabs.conductor.ControllerChangeType;
import com.bluelinelabs.conductor.Controller$e;
import android.view.ViewGroup;
import pi2.k;
import ng2.e;
import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.c$d;

public final class c implements c$d
{
    public static void c(final Controller controller) {
        e.d((Object)controller, "null cannot be cast to non-null type com.reddit.screen.color.ColorSource");
        final b topIsDark = ((a)controller).getTopIsDark();
        if (e.a((Object)topIsDark, (Object)b$a.a)) {
            k.A0(controller).c(false);
        }
        else if (topIsDark instanceof b$c) {
            k.A0(controller).c(((b$c)topIsDark).a);
        }
        else {
            e.a((Object)topIsDark, (Object)b$b.a);
        }
    }
    
    public final void a(final Controller controller, final Controller controller2, final boolean b, final ViewGroup viewGroup, final com.bluelinelabs.conductor.c c) {
        e.f((Object)viewGroup, "container");
        e.f((Object)c, "handler");
    }
    
    public final void b(final Controller controller, final Controller controller2, final boolean b, final ViewGroup viewGroup, final com.bluelinelabs.conductor.c c) {
        if (controller == null) {
            return;
        }
        if (k.A0(controller).a()) {
            this.d(controller);
            return;
        }
        throw new IllegalStateException("StatusBarColorControllerChangeListener should only be used if status bar colors are meant to change");
    }
    
    public final void d(final Controller controller) {
        e.f((Object)controller, "controller");
        if (controller instanceof a) {
            if (controller.k) {
                c(controller);
            }
            controller.HA((Controller$e)new Controller$e(controller, this) {
                public c$a$a f;
                public final Controller g;
                public final c h;
                
                public final void e(final Controller controller, final com.bluelinelabs.conductor.c c, final ControllerChangeType controllerChangeType) {
                    e.f((Object)controller, "controller");
                    e.f((Object)controllerChangeType, "changeType");
                    if (!controllerChangeType.isEnter) {
                        controller.wB((Controller$e)this);
                        final a$a f = (a$a)this.f;
                        if (f != null) {
                            ((a)this.g).W6((a$a)f);
                        }
                    }
                }
                
                public final void p(final Controller controller, final View view) {
                    e.f((Object)controller, "controller");
                    e.f((Object)view, "view");
                    this.h.getClass();
                    c.c(controller);
                    ((a)this.g).Ob((a$a)(this.f = new a$a(controller, this.h) {
                        public final c f;
                        public final Controller g;
                        
                        public final void ve(final Integer n) {
                        }
                        
                        public final void y5(final b b) {
                            e.f((Object)b, "isDark");
                            final c f = this.f;
                            final Controller g = this.g;
                            f.getClass();
                            c.c(g);
                        }
                    }));
                }
                
                public final void v(final Controller controller, final View view) {
                    e.f((Object)controller, "controller");
                    e.f((Object)view, "view");
                    final a$a f = (a$a)this.f;
                    if (f != null) {
                        ((a)this.g).W6((a$a)f);
                    }
                    this.f = null;
                }
            });
        }
        else {
            k.A0(controller).c(false);
        }
    }
}
