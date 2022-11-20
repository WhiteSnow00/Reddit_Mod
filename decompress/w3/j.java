// 
// Decompiled by Procyon v0.6.0
// 

package w3;

import j0.i;
import java.util.ArrayList;
import z3.a;

public final class j implements a<k.a>
{
    public final String a;
    
    public j(final String a) {
        this.a = a;
    }
    
    @Override
    public final void accept(final Object o) {
        final k.a a = (k.a)o;
        synchronized (k.c) {
            final i<String, ArrayList<a<k.a>>> d = k.d;
            final ArrayList list = (ArrayList)d.getOrDefault((Object)this.a, (Object)null);
            if (list == null) {
                monitorexit(k.c);
            }
            else {
                d.remove((Object)this.a);
                monitorexit(k.c);
                for (int i = 0; i < list.size(); ++i) {
                    ((a<k.a>)list.get(i)).accept(a);
                }
            }
        }
    }
}
