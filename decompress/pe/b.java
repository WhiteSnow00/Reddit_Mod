// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import java.util.HashSet;

public final class b extends b7
{
    public String i;
    public HashSet j;
    public j0.b k;
    public Long l;
    public Long m;
    
    public b(final g7 g7) {
        super(g7);
    }
    
    @Override
    public final boolean P() {
        return false;
    }
    
    public final t7 Q(final Integer n) {
        if (this.k.containsKey((Object)n)) {
            return (t7)this.k.getOrDefault((Object)n, (Object)null);
        }
        final t7 t7 = new t7(this, this.i);
        this.k.put((Object)n, (Object)t7);
        return t7;
    }
}
