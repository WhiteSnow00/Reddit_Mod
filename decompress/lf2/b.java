// 
// Decompiled by Procyon v0.6.0
// 

package lf2;

import java.util.Iterator;
import java.util.List;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import ej2.c0;
import java.util.LinkedList;
import if2.a;

public final class b implements a, lf2.a
{
    public LinkedList f;
    public volatile boolean g;
    
    public final boolean add(final a a) {
        if (!this.g) {
            synchronized (this) {
                if (!this.g) {
                    LinkedList f;
                    if ((f = this.f) == null) {
                        f = new LinkedList();
                        this.f = f;
                    }
                    f.add(a);
                    return true;
                }
            }
        }
        a.dispose();
        return false;
    }
    
    public final boolean delete(final a a) {
        if (a != null) {
            if (this.g) {
                return false;
            }
            synchronized (this) {
                if (this.g) {
                    return false;
                }
                final LinkedList f = this.f;
                return f != null && f.remove(a);
            }
        }
        throw new NullPointerException("Disposable item is null");
    }
    
    public final void dispose() {
        if (this.g) {
            return;
        }
        synchronized (this) {
            if (this.g) {
                return;
            }
            this.g = true;
            final LinkedList f = this.f;
            List list = null;
            this.f = null;
            monitorexit(this);
            if (f != null) {
                for (final a a : f) {
                    try {
                        a.dispose();
                    }
                    finally {
                        final Throwable t;
                        c0.i4(t);
                        List list2 = list;
                        if (list == null) {
                            list2 = new ArrayList();
                        }
                        list2.add(t);
                        list = list2;
                    }
                }
                if (list != null) {
                    if (list.size() == 1) {
                        throw ExceptionHelper.d((Throwable)list.get(0));
                    }
                    throw new CompositeException(list);
                }
            }
        }
    }
    
    public final boolean isDisposed() {
        return this.g;
    }
    
    public final boolean remove(final a a) {
        if (this.delete(a)) {
            a.dispose();
            return true;
        }
        return false;
    }
}
