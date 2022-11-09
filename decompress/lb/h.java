// 
// Decompiled by Procyon v0.6.0
// 

package lb;

import db.e;
import db.u$b;
import db.u;
import com.google.android.exoplayer2.n;
import java.io.IOException;
import bd.s;
import db.j;
import db.w;

public abstract class h
{
    public final d a;
    public w b;
    public j c;
    public f d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public a j;
    public long k;
    public boolean l;
    public boolean m;
    
    public h() {
        this.a = new d();
        this.j = new a();
    }
    
    public void a(final long g) {
        this.g = g;
    }
    
    public abstract long b(final s p0);
    
    public abstract boolean c(final s p0, final long p1, final a p2) throws IOException;
    
    public void d(final boolean b) {
        if (b) {
            this.j = new a();
            this.f = 0L;
            this.h = 0;
        }
        else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
    
    public static final class a
    {
        public n a;
        public lb.b.a b;
    }
    
    public static final class b implements f
    {
        @Override
        public final u a() {
            return (u)new u$b(-9223372036854775807L);
        }
        
        @Override
        public final void b(final long n) {
        }
        
        @Override
        public final long c(final e e) {
            return -1L;
        }
    }
}
