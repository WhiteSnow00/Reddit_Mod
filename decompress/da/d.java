// 
// Decompiled by Procyon v0.6.0
// 

package da;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import q3.f;
import java.util.Iterator;
import java.util.NoSuchElementException;
import vl.a;
import ng2.e;
import a4.p1;
import java.util.Collection;
import java.util.List;
import a4.r1;
import com.google.accompanist.insets.MutableWindowInsetsType;
import a4.p1$b;

public final class d extends p1$b
{
    public final h h;
    
    public d(final h h) {
        super(0);
        this.h = h;
    }
    
    public static void f(final MutableWindowInsetsType mutableWindowInsetsType, final r1 r1, final List list, final int n) {
        final boolean b = list instanceof Collection;
        final int n2 = 1;
        int n3 = 0;
        Label_0086: {
            if (!b || !list.isEmpty()) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    if ((((p1)iterator.next()).a() | n) != 0x0) {
                        n3 = n2;
                        break Label_0086;
                    }
                }
            }
            n3 = 0;
        }
        if (n3 != 0) {
            final g e = mutableWindowInsetsType.e;
            final f a = r1.a(n);
            ng2.e.e((Object)a, "platformInsets.getInsets(type)");
            vl.a.w3(e, a);
            final Iterator iterator2 = list.iterator();
            if (!iterator2.hasNext()) {
                throw new NoSuchElementException();
            }
            float n4 = ((p1)iterator2.next()).a.b();
            while (iterator2.hasNext()) {
                n4 = Math.max(n4, ((p1)iterator2.next()).a.b());
            }
            ((SnapshotMutableStateImpl)mutableWindowInsetsType.h).setValue((Object)n4);
        }
    }
    
    public final void b(final p1 p) {
        e.f((Object)p, "animation");
        if ((p.a() & 0x8) != 0x0) {
            this.h.e.j();
        }
        if ((p.a() & 0x1) != 0x0) {
            this.h.d.j();
        }
        if ((p.a() & 0x2) != 0x0) {
            this.h.c.j();
        }
        if ((p.a() & 0x10) != 0x0) {
            this.h.b.j();
        }
        if ((p.a() & 0x80) != 0x0) {
            this.h.f.j();
        }
    }
    
    public final void c(final p1 p) {
        if ((p.a() & 0x8) != 0x0) {
            final MutableWindowInsetsType e = this.h.e;
            ((SnapshotMutableStateImpl)e.c).setValue((Object)(e.i() + 1));
        }
        if ((p.a() & 0x1) != 0x0) {
            final MutableWindowInsetsType d = this.h.d;
            ((SnapshotMutableStateImpl)d.c).setValue((Object)(d.i() + 1));
        }
        if ((p.a() & 0x2) != 0x0) {
            final MutableWindowInsetsType c = this.h.c;
            ((SnapshotMutableStateImpl)c.c).setValue((Object)(c.i() + 1));
        }
        if ((p.a() & 0x10) != 0x0) {
            final MutableWindowInsetsType b = this.h.b;
            ((SnapshotMutableStateImpl)b.c).setValue((Object)(b.i() + 1));
        }
        if ((p.a() & 0x80) != 0x0) {
            final MutableWindowInsetsType f = this.h.f;
            ((SnapshotMutableStateImpl)f.c).setValue((Object)(f.i() + 1));
        }
    }
    
    public final r1 d(final r1 r1, final List<p1> list) {
        e.f((Object)r1, "platformInsets");
        e.f((Object)list, "runningAnimations");
        f(this.h.e, r1, list, 8);
        f(this.h.d, r1, list, 1);
        f(this.h.c, r1, list, 2);
        f(this.h.b, r1, list, 16);
        f(this.h.f, r1, list, 128);
        return r1;
    }
}
