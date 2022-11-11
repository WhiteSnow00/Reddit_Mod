// 
// Decompiled by Procyon v0.6.0
// 

package cn0;

import uw.a;
import com.reddit.domain.model.Announcement;
import java.util.Map;
import uw.c;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.util.Comparator;

public final class b<T> implements Comparator
{
    public final /* synthetic */ Ref$ObjectRef f;
    
    public b(final Ref$ObjectRef f) {
        this.f = f;
    }
    
    @Override
    public final int compare(final T t, final T t2) {
        final c c = ((Map)this.f.element).get(new a(((Announcement)t).getAnnouncementId-ldoH_W0()));
        long c2 = 0L;
        long c3;
        if (c != null) {
            c3 = c.c;
        }
        else {
            c3 = 0L;
        }
        final c c4 = ((Map)this.f.element).get(new a(((Announcement)t2).getAnnouncementId-ldoH_W0()));
        if (c4 != null) {
            c2 = c4.c;
        }
        return yg.a.h0((Comparable)c3, (Comparable)c2);
    }
}
