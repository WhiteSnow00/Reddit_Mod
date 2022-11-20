// 
// Decompiled by Procyon v0.6.0
// 

package c8;

import com.bluelinelabs.conductor.c;
import com.bluelinelabs.conductor.Controller;

public final class e
{
    public final Controller a;
    public String b;
    public c c;
    public c d;
    public boolean e;
    public int f;
    
    public e(final Controller a, final String b, final c c, final c d, final boolean e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final c d) {
        if (!this.e) {
            this.d = d;
            return;
        }
        throw new RuntimeException(ng2.e.l((Object)"s can not be modified after being added to a Router.", e.class.getSimpleName()));
    }
    
    public final c b() {
        c c;
        if ((c = this.a.z) == null) {
            c = this.c;
        }
        return c;
    }
    
    public final void c(final c c) {
        if (!this.e) {
            this.c = c;
            return;
        }
        throw new RuntimeException(ng2.e.l((Object)"s can not be modified after being added to a Router.", e.class.getSimpleName()));
    }
    
    public final void d(final String b) {
        if (!this.e) {
            this.b = b;
            return;
        }
        throw new RuntimeException(ng2.e.l((Object)"s can not be modified after being added to a Router.", e.class.getSimpleName()));
    }
    
    public static final class a
    {
        public static e a(final Controller controller) {
            ng2.e.f((Object)controller, "controller");
            return new e(controller, null, null, null, false, -1);
        }
    }
}
