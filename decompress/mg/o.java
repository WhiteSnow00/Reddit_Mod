// 
// Decompiled by Procyon v0.6.0
// 

package mg;

import java.util.Collection;
import java.util.HashSet;
import ng.c0;

public final class o implements c0
{
    public final /* synthetic */ a a;
    
    public o(final a a) {
        this.a = a;
    }
    
    public final HashSet zza() {
        final a a = this.a;
        synchronized (a.c) {
            return new HashSet(a.c);
        }
    }
}
