// 
// Decompiled by Procyon v0.6.0
// 

package d9;

import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

public final class a implements i
{
    public final Set<j> f;
    public boolean g;
    public boolean h;
    
    public a() {
        this.f = Collections.newSetFromMap(new WeakHashMap<j, Boolean>());
    }
    
    @Override
    public final void a(final j j) {
        this.f.add(j);
        if (this.h) {
            j.onDestroy();
        }
        else if (this.g) {
            j.onStart();
        }
        else {
            j.onStop();
        }
    }
    
    public final void b() {
        this.h = true;
        final Iterator iterator = k9.j.e((Set)this.f).iterator();
        while (iterator.hasNext()) {
            ((j)iterator.next()).onDestroy();
        }
    }
    
    public final void c() {
        this.g = true;
        final Iterator iterator = k9.j.e((Set)this.f).iterator();
        while (iterator.hasNext()) {
            ((j)iterator.next()).onStart();
        }
    }
    
    @Override
    public final void d(final j j) {
        this.f.remove(j);
    }
    
    public final void e() {
        this.g = false;
        final Iterator iterator = k9.j.e((Set)this.f).iterator();
        while (iterator.hasNext()) {
            ((j)iterator.next()).onStop();
        }
    }
}
