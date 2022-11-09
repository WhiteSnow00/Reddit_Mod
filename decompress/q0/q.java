// 
// Decompiled by Procyon v0.6.0
// 

package q0;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import a80.a;
import z0.l0;

public final class q
{
    public final l0 a;
    public final l0 b;
    public boolean c;
    public Object d;
    
    public q(final int n, final int n2) {
        this.a = a80.a.n0(new b(n));
        this.b = a80.a.n0(n2);
    }
    
    public final void a(final int n, final int n2) {
        final float n3 = (float)n;
        final int n4 = 1;
        if (n3 >= 0.0f) {
            int n5;
            if (n == ((SnapshotMutableStateImpl<b>)this.a).getValue().a) {
                n5 = n4;
            }
            else {
                n5 = 0;
            }
            if (n5 == 0) {
                ((SnapshotMutableStateImpl<b>)this.a).setValue(new b(n));
            }
            if (n2 != ((SnapshotMutableStateImpl<Number>)this.b).getValue().intValue()) {
                ((SnapshotMutableStateImpl<Integer>)this.b).setValue(Integer.valueOf(n2));
            }
            return;
        }
        throw new IllegalArgumentException(a.g("Index should be non-negative (", n, ')').toString());
    }
}
