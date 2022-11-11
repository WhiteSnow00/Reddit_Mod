// 
// Decompiled by Procyon v0.6.0
// 

package androidx.room;

import rg2.p;
import ej2.g;
import lg2.c;
import ej2.b1;
import ej2.l;
import ej2.z0;
import lg2.d;
import ej2.k;

public final class RoomDatabaseKt$acquireTransactionThread$2$2 implements Runnable
{
    public final /* synthetic */ k<d> f;
    public final /* synthetic */ z0 g;
    
    public RoomDatabaseKt$acquireTransactionThread$2$2(final l f, final b1 g) {
        this.f = (k<d>)f;
        this.g = (z0)g;
    }
    
    @Override
    public final void run() {
        ej2.g.k((p)new RoomDatabaseKt$acquireTransactionThread$2$2$1((k)this.f, this.g, (c)null));
    }
}
