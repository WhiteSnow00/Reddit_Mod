// 
// Decompiled by Procyon v0.6.0
// 

package eg;

import android.content.Context;
import gg.b;
import com.google.android.play.core.assetpacks.e;
import ig.l0;
import ng.e0;
import java.io.File;
import aj2.c;
import ng.h;
import java.util.List;
import com.tonyodev.fetch2.Download;
import vd2.i;
import ae2.a;
import com.tonyodev.fetch2core.Reason;
import java.util.Iterator;
import pg2.j;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.LinkedHashMap;
import ah2.f;
import h.s;
import ig.m0;

public final class t0 implements m0
{
    public final /* synthetic */ int f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    
    public t0(final String i, final s j) {
        this.f = 2;
        ah2.f.g((Object)i, "namespace");
        this.i = i;
        this.j = j;
        this.g = new Object();
        this.h = new LinkedHashMap();
    }
    
    public final void a() {
        synchronized (this.g) {
            final Iterator iterator = ((Map)this.h).entrySet().iterator();
            while (iterator.hasNext()) {
                if (((Map.Entry<K, WeakReference>)iterator.next()).getValue().get() == null) {
                    iterator.remove();
                }
            }
            final j a = pg2.j.a;
        }
    }
    
    public final a b(final int n, final Reason reason) {
        ah2.f.g((Object)reason, "reason");
        synchronized (this.g) {
            final WeakReference weakReference = ((Map)this.h).get(n);
            a a;
            if (weakReference != null) {
                a = (a)weakReference.get();
            }
            else {
                a = null;
            }
            a a2 = a;
            if (a == null) {
                a2 = new a((String)this.i);
                a2.a(((i)((s)this.j).g).j1(n), (Download)null, reason);
                ((Map)this.h).put(n, new WeakReference(a2));
            }
            return a2;
        }
    }
    
    public final a c(final int n, final Download download, final Reason reason) {
        ah2.f.g((Object)download, "download");
        ah2.f.g((Object)reason, "reason");
        synchronized (this.g) {
            final a b = this.b(n, reason);
            b.a((List)((s)this.j).h(n, download), download, reason);
            return b;
        }
    }
    
    public final void d(final int n, final Download download, final Reason reason) {
        ah2.f.g((Object)download, "download");
        ah2.f.g((Object)reason, "reason");
        synchronized (this.g) {
            final WeakReference weakReference = ((Map)this.h).get(n);
            a a;
            if (weakReference != null) {
                a = (a)weakReference.get();
            }
            else {
                a = null;
            }
            if (a != null) {
                a.a((List)((s)this.j).h(n, download), download, reason);
                final j a2 = pg2.j.a;
            }
        }
    }
    
    public final Object zza() {
        switch (this.f) {
            default: {
                final Context a = ((h)this.g).f.a;
                c.e1((Object)a);
                return new pg.a(a, (File)((m0)this.h).zza(), (e0)((m0)this.i).zza(), l0.a((m0)this.j));
            }
            case 0: {
                return new com.google.android.play.core.assetpacks.j((com.google.android.play.core.assetpacks.i)((m0)this.g).zza(), (com.google.android.play.core.assetpacks.c)((m0)this.h).zza(), (e)((m0)this.i).zza(), (b)((m0)this.j).zza());
            }
        }
    }
}
