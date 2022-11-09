// 
// Decompiled by Procyon v0.6.0
// 

package ng;

import android.os.RemoteException;
import java.util.Iterator;
import android.os.Bundle;
import java.util.ArrayList;
import qg.k;
import java.util.List;

public final class o extends q<List<c>>
{
    public o(final r r, final k<List<c>> k) {
        super(k);
    }
    
    @Override
    public final void t0(final ArrayList list) throws RemoteException {
        super.t0(list);
        final ArrayList list2 = new ArrayList(list.size());
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(c.m((Bundle)iterator.next()));
        }
        super.a.b((Object)list2);
    }
}
