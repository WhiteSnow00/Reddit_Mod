// 
// Decompiled by Procyon v0.6.0
// 

package mi2;

import java.util.Iterator;
import zd.b;
import dh2.e$b;
import dh2.c;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1;
import ug2.f;
import kotlin.jvm.internal.PropertyReference1Impl;
import ng2.h;
import ug2.k;
import dh2.e;

public class a implements e
{
    public static final k<Object>[] g;
    public final ni2.e f;
    
    static {
        g = new k[] { (k)h.c((PropertyReference1)new PropertyReference1Impl((f)h.a((Class)a.class), "annotations", "getAnnotations()Ljava/util/List;")) };
    }
    
    public a(final ni2.h h, final mg2.a<? extends List<? extends c>> a) {
        ng2.e.f((Object)h, "storageManager");
        this.f = (ni2.e)h.h((mg2.a)a);
    }
    
    public final boolean W(final yh2.c c) {
        return e$b.b((e)this, c);
    }
    
    public boolean isEmpty() {
        return ((List)b.f0(this.f, a.g[0])).isEmpty();
    }
    
    public final Iterator<c> iterator() {
        return ((List)b.f0(this.f, a.g[0])).iterator();
    }
    
    public final c l(final yh2.c c) {
        return e$b.a((e)this, c);
    }
}
