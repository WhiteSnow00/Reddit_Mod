// 
// Decompiled by Procyon v0.6.0
// 

package t60;

import kotlinx.coroutines.flow.SubscribedSharedFlow;

public interface e<T>
{
    void a();
    
    SubscribedSharedFlow b(final boolean p0);
    
    SubscribedSharedFlow c();
    
    boolean d();
    
    void invalidate();
    
    public abstract static class a<T>
    {
    }
}
