// 
// Decompiled by Procyon v0.6.0
// 

package h7;

import java.util.Map;
import hg2.j;
import k7.d;
import k7.b;
import jk2.c;
import sg2.e;
import j7.i;
import j7.h;
import okio.ByteString;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import java.io.IOException;
import jk2.f;

public interface k<D extends a, T, V extends b>
{
    public static final b a = new b();
    
    T a(final D p0);
    
    String b();
    
    n<T> c(final f p0) throws IOException;
    
    ByteString d(final boolean p0, final boolean p1, final ScalarTypeAdapters p2);
    
    String e();
    
    V f();
    
    h<D> g();
    
    l name();
    
    public interface a
    {
        i a();
    }
    
    public static class b
    {
        public final String a(final ScalarTypeAdapters scalarTypeAdapters) throws IOException {
            e.g((Object)scalarTypeAdapters, "scalarTypeAdapters");
            final c c = new c();
            final k7.c c2 = new k7.c(c);
            try {
                ((d)c2).j = true;
                c2.h();
                this.b().a((j7.e)new k7.b((d)c2, scalarTypeAdapters));
                c2.r();
                final j a = j.a;
                c2.close();
                return c.E();
            }
            finally {
                try {}
                finally {
                    try {
                        c2.close();
                    }
                    finally {}
                }
            }
        }
        
        public j7.d b() {
            return (j7.d)new k$b$a();
        }
        
        public Map<String, Object> c() {
            return kotlin.collections.c.V0();
        }
    }
}
