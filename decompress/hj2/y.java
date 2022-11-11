// 
// Decompiled by Procyon v0.6.0
// 

package hj2;

import kotlinx.coroutines.flow.StartedLazily;
import kotlinx.coroutines.flow.SharingCommand;

public interface y
{
    e<SharingCommand> a(final a0<Integer> p0);
    
    public static final class a
    {
        public static final z a;
        public static final StartedLazily b;
        
        static {
            a = new z();
            b = new StartedLazily();
        }
    }
}
