// 
// Decompiled by Procyon v0.6.0
// 

package qh2;

import sg2.e;
import kh2.d0;
import wh2.n;

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
