// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import sg2.e;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import rg2.a;
import hg2.j;
import rg2.l;

public final class i<T>
{
    public final l<T, j> a;
    public final a<Boolean> b;
    public final ReentrantLock c;
    public final ArrayList d;
    public boolean e;
    
    public i(final l a) {
        sg2.e.f((Object)a, "callbackInvoker");
        this.a = a;
        this.b = null;
        this.c = new ReentrantLock();
        this.d = new ArrayList();
    }
    
    public final void a() {
        if (this.e) {
            return;
        }
        Object o = this.c;
        ((ReentrantLock)o).lock();
        try {
            if (this.e) {
                return;
            }
            this.e = true;
            final List q4 = CollectionsKt___CollectionsKt.q4((Iterable)this.d);
            this.d.clear();
            final j a = j.a;
            ((ReentrantLock)o).unlock();
            if (q4 != null) {
                o = this.a;
                final Iterator iterator = q4.iterator();
                while (iterator.hasNext()) {
                    ((l<Object, Object>)o).invoke(iterator.next());
                }
            }
        }
        finally {
            ((ReentrantLock)o).unlock();
        }
    }
}
