// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xa.a;
import android.os.Handler;

public interface d
{
    void a(final Handler p0, final a p1);
    
    long c();
    
    void f(final xa.a p0);
    
    l h();
    
    public interface a
    {
        void t(final int p0, final long p1, final long p2);
        
        public static final class a
        {
            public final CopyOnWriteArrayList<d.a.a.a> a;
            
            public a() {
                this.a = new CopyOnWriteArrayList<d.a.a.a>();
            }
            
            public final void a(final d.a a) {
                for (final d.a.a.a a2 : this.a) {
                    if (a2.b == a) {
                        a2.c = true;
                        this.a.remove(a2);
                    }
                }
            }
            
            public static final class a
            {
                public final Handler a;
                public final d.a b;
                public boolean c;
                
                public a(final Handler a, final d.a b) {
                    this.a = a;
                    this.b = b;
                }
            }
        }
    }
}
