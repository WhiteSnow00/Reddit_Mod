// 
// Decompiled by Procyon v0.6.0
// 

package m0;

import n1.c;
import yl.a;
import android.widget.Magnifier;
import ah2.f;
import u2.b;
import android.view.View;

public final class u implements t
{
    public static final u a;
    
    static {
        a = new u();
    }
    
    public final s a(final n n, final View view, final b b, final float n2) {
        f.f((Object)n, "style");
        f.f((Object)view, "view");
        f.f((Object)b, "density");
        return (s)new a(new Magnifier(view));
    }
    
    public final boolean b() {
        return false;
    }
    
    public static class a implements s
    {
        public final Magnifier a;
        
        public a(final Magnifier a) {
            this.a = a;
        }
        
        public final long a() {
            return yl.a.c(this.a.getWidth(), this.a.getHeight());
        }
        
        public void b(final long n, final long n2, final float n3) {
            this.a.show(c.c(n), c.d(n));
        }
        
        public final void c() {
            this.a.update();
        }
        
        public final void dismiss() {
            this.a.dismiss();
        }
    }
}
