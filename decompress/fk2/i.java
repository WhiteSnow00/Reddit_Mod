// 
// Decompiled by Procyon v0.6.0
// 

package fk2;

import mg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import ng2.e;
import kotlin.collections.c;
import ug2.d;
import java.util.Map;

public final class i
{
    public final boolean a;
    public final boolean b;
    public final y c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Map<d<?>, Object> h;
    
    public i(final boolean b, final boolean b2, final y y, final Long n, final Long n2, final Long n3, final Long n4) {
        this(b, b2, y, n, n2, n3, n4, kotlin.collections.c.u4());
    }
    
    public i(final boolean a, final boolean b, final y c, final Long d, final Long e, final Long f, final Long g, final Map<d<?>, ?> map) {
        ng2.e.f((Object)map, "extras");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = kotlin.collections.c.F4((Map)map);
    }
    
    @Override
    public final String toString() {
        final ArrayList list = new ArrayList();
        if (this.a) {
            list.add("isRegularFile");
        }
        if (this.b) {
            list.add("isDirectory");
        }
        final Long d = this.d;
        if (d != null) {
            list.add(ng2.e.l((Object)d, "byteCount="));
        }
        final Long e = this.e;
        if (e != null) {
            list.add(ng2.e.l((Object)e, "createdAt="));
        }
        final Long f = this.f;
        if (f != null) {
            list.add(ng2.e.l((Object)f, "lastModifiedAt="));
        }
        final Long g = this.g;
        if (g != null) {
            list.add(ng2.e.l((Object)g, "lastAccessedAt="));
        }
        if (this.h.isEmpty() ^ true) {
            list.add(ng2.e.l((Object)this.h, "extras="));
        }
        return CollectionsKt___CollectionsKt.a5((Iterable)list, (CharSequence)", ", "FileMetadata(", ")", (l)null, 56);
    }
}
