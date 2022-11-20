// 
// Decompiled by Procyon v0.6.0
// 

package ih2;

import java.util.ArrayList;

public final class h extends e implements rh2.e
{
    public final Object[] b;
    
    public h(final yh2.e e, final Object[] b) {
        super(e);
        this.b = b;
    }
    
    public final ArrayList getElements() {
        final Object[] b = this.b;
        final ArrayList list = new ArrayList<e>(b.length);
        for (final Object o : b) {
            ng2.e.c(o);
            list.add(e$a.a(o, (yh2.e)null));
        }
        return list;
    }
}
