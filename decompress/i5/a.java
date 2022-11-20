// 
// Decompiled by Procyon v0.6.0
// 

package i5;

import m5.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ng2.e;
import java.util.List;

public final class a implements o.a
{
    public final int f;
    
    public a(final int f) {
        this.f = f;
    }
    
    @Override
    public final Object apply(final Object o) {
        switch (this.f) {
            default: {
                final List list = (List)o;
                e.e((Object)list, "it");
                return new up2.e(CollectionsKt___CollectionsKt.U4(list));
            }
            case 1: {
                return ((b)o).T0();
            }
            case 0: {
                return ((b)o).h1();
            }
        }
    }
}
