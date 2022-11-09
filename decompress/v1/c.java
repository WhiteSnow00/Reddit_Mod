// 
// Decompiled by Procyon v0.6.0
// 

package v1;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import z0.l0;
import zg2.l;

public final class c implements b
{
    public final l<a, Boolean> a;
    public final l0 b;
    
    public c(final int n, final l a) {
        this.a = (l<a, Boolean>)a;
        this.b = a80.a.n0(new a(n));
    }
    
    @Override
    public final int a() {
        return ((SnapshotMutableStateImpl<a>)this.b).getValue().a;
    }
}
