// 
// Decompiled by Procyon v0.6.0
// 

package qj2;

import java.util.Iterator;
import tg2.a;

public final class g implements Iterable<e>, a
{
    public final /* synthetic */ e f;
    
    public g(final e f) {
        this.f = f;
    }
    
    @Override
    public final Iterator<e> iterator() {
        return new f(this.f);
    }
}
