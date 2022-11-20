// 
// Decompiled by Procyon v0.6.0
// 

package da;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import ah0.b;
import z0.k0;

public final class g implements e
{
    public final k0 c;
    public final k0 d;
    public final k0 e;
    public final k0 f;
    
    public g(final int n, final int n2, final int n3, final int n4) {
        this.c = b.Z0((Object)n);
        this.d = b.Z0((Object)n2);
        this.e = b.Z0((Object)n3);
        this.f = b.Z0((Object)n4);
    }
    
    public final int a() {
        return ((Number)((SnapshotMutableStateImpl)this.e).getValue()).intValue();
    }
    
    public final int b() {
        return ((Number)((SnapshotMutableStateImpl)this.c).getValue()).intValue();
    }
    
    public final int c() {
        return ((Number)((SnapshotMutableStateImpl)this.f).getValue()).intValue();
    }
    
    public final int e() {
        return ((Number)((SnapshotMutableStateImpl)this.d).getValue()).intValue();
    }
}
