// 
// Decompiled by Procyon v0.6.0
// 

package sa;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.c;
import java.io.Closeable;

public interface d extends Closeable
{
    Iterable<c> A1();
    
    void G(final Iterable<j> p0);
    
    long K1(final c p0);
    
    boolean L1(final c p0);
    
    void N1(final Iterable<j> p0);
    
    Iterable<j> R1(final c p0);
    
    void Y1(final long p0, final c p1);
    
    int cleanUp();
    
    b d2(final c p0, final EventInternal p1);
}
