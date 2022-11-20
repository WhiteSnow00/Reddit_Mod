// 
// Decompiled by Procyon v0.6.0
// 

package lh2;

import ng2.e;
import fh2.d0;
import rh2.n;

public interface c
{
    void a(final n p0, final d0 p1);
    
    public static final class a implements c
    {
        public static final a a;
        
        static {
            a = new a();
        }
        
        @Override
        public final void a(final n n, final d0 d0) {
            e.f((Object)n, "field");
            e.f((Object)d0, "descriptor");
        }
    }
}
