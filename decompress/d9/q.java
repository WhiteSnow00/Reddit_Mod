// 
// Decompiled by Procyon v0.6.0
// 

package d9;

import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

public final class q implements j
{
    public final Set<h9.j<?>> f;
    
    public q() {
        this.f = Collections.newSetFromMap(new WeakHashMap<h9.j<?>, Boolean>());
    }
    
    @Override
    public final void onDestroy() {
        final Iterator iterator = k9.j.e((Set)this.f).iterator();
        while (iterator.hasNext()) {
            ((j)iterator.next()).onDestroy();
        }
    }
    
    @Override
    public final void onStart() {
        final Iterator iterator = k9.j.e((Set)this.f).iterator();
        while (iterator.hasNext()) {
            ((j)iterator.next()).onStart();
        }
    }
    
    @Override
    public final void onStop() {
        final Iterator iterator = k9.j.e((Set)this.f).iterator();
        while (iterator.hasNext()) {
            ((j)iterator.next()).onStop();
        }
    }
}
