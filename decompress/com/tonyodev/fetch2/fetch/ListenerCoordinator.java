// 
// Decompiled by Procyon v0.6.0
// 

package com.tonyodev.fetch2.fetch;

import mg2.a;
import java.util.Iterator;
import hd2.d;
import java.lang.ref.WeakReference;
import java.util.Set;
import hd2.f;
import cg2.j;
import ng2.e;
import androidx.compose.ui.platform.k0;
import t5.u;
import android.os.Handler;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class ListenerCoordinator
{
    public final Object a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final ArrayList d;
    public final Handler e;
    public final LinkedHashMap f;
    public final ListenerCoordinator$a g;
    public final u h;
    public final Handler i;
    
    public ListenerCoordinator(final String s, final u h, final k0 k0, final Handler i) {
        ng2.e.g((Object)s, "namespace");
        ng2.e.g((Object)i, "uiHandler");
        this.h = h;
        this.i = i;
        this.a = new Object();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new ArrayList();
        this.e = (Handler)((a)ListenerCoordinator$fetchNotificationHandler$1.INSTANCE).invoke();
        this.f = new LinkedHashMap();
        this.g = new ListenerCoordinator$a(this);
    }
    
    public final void a() {
        synchronized (this.a) {
            this.b.clear();
            this.c.clear();
            this.d.clear();
            this.f.clear();
            final j a = j.a;
        }
    }
    
    public final void b(final int n, final f f) {
        ng2.e.g((Object)f, "fetchListener");
        synchronized (this.a) {
            final Set set = this.b.get(n);
            final Iterator iterator = null;
            Iterator iterator2;
            if (set != null) {
                iterator2 = set.iterator();
            }
            else {
                iterator2 = null;
            }
            if (iterator2 != null) {
                while (iterator2.hasNext()) {
                    if (ng2.e.a((Object)((WeakReference<f>)iterator2.next()).get(), (Object)f)) {
                        iterator2.remove();
                        break;
                    }
                }
            }
            if (f instanceof d) {
                final Set set2 = this.c.get(n);
                Iterator iterator3 = iterator;
                if (set2 != null) {
                    iterator3 = set2.iterator();
                }
                if (iterator3 != null) {
                    while (iterator3.hasNext()) {
                        if (ng2.e.a((Object)((WeakReference<d>)iterator3.next()).get(), (Object)f)) {
                            iterator3.remove();
                            break;
                        }
                    }
                }
            }
            final j a = j.a;
        }
    }
}
