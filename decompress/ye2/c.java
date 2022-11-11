// 
// Decompiled by Procyon v0.6.0
// 

package ye2;

import io.grpc.a;
import io.grpc.Status;

public abstract class c<ReqT, RespT>
{
    public abstract void a();
    
    public abstract void b();
    
    public abstract void c();
    
    public abstract void d(final ReqT p0);
    
    public abstract static class a<T>
    {
        public abstract void a(final Status p0, final io.grpc.a p1);
        
        public abstract void b(final T p0);
    }
}
