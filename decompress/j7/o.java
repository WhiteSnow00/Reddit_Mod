// 
// Decompiled by Procyon v0.6.0
// 

package j7;

import com.reddit.type.CustomType;
import pg2.j;
import zg2.p;
import java.util.List;
import com.apollographql.apollo.api.ResponseField$d;
import com.apollographql.apollo.api.ResponseField;

public interface o
{
    void a(final ResponseField p0, final String p1);
    
    void b(final ResponseField p0, final Integer p1);
    
    void c(final ResponseField p0, final Boolean p1);
    
    void d(final ResponseField p0, final Double p1);
    
    void e(final ResponseField$d p0, final Object p1);
    
     <T> void f(final ResponseField p0, final List<? extends T> p1, final p<? super List<? extends T>, ? super a, j> p2);
    
    void g(final i p0);
    
    void h(final ResponseField p0, final i p1);
    
    public interface a
    {
        void a(final String p0);
        
        void b(final Integer p0);
        
        void c(final i p0);
        
        void d(final CustomType p0, final Object p1);
    }
}
