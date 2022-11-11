// 
// Decompiled by Procyon v0.6.0
// 

package ca;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import bg.d;
import z0.l0;

public final class g implements e
{
    public final l0 c;
    public final l0 d;
    public final l0 e;
    public final l0 f;
    
    public g(final int n, final int n2, final int n3, final int n4) {
        this.c = bg.d.t0((Object)n);
        this.d = bg.d.t0((Object)n2);
        this.e = bg.d.t0((Object)n3);
        this.f = bg.d.t0((Object)n4);
    }
    
    @Override
    public final int a() {
        return ((Number)((SnapshotMutableStateImpl)this.e).getValue()).intValue();
    }
    
    @Override
    public final int b() {
        return ((Number)((SnapshotMutableStateImpl)this.c).getValue()).intValue();
    }
    
    @Override
    public final int c() {
        return ((Number)((SnapshotMutableStateImpl)this.f).getValue()).intValue();
    }
    
    @Override
    public final int e() {
        return ((Number)((SnapshotMutableStateImpl)this.d).getValue()).intValue();
    }
}
