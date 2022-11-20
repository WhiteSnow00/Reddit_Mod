// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import androidx.compose.runtime.snapshots.SnapshotKt;
import cg2.j;
import java.util.Set;
import mg2.p;

public final class e implements c
{
    public final p<Set<?>, f, j> a;
    
    public e(final p<? super Set<?>, ? super f, j> a) {
        this.a = (p<Set<?>, f, j>)a;
    }
    
    public final void dispose() {
        final p<Set<?>, f, j> a = this.a;
        synchronized (SnapshotKt.c) {
            SnapshotKt.g.remove(a);
            final j a2 = j.a;
        }
    }
}
