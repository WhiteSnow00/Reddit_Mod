// 
// Decompiled by Procyon v0.6.0
// 

package ca;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import q3.f;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ml0.a;
import sg2.e;
import java.util.Collection;
import java.util.List;
import a4.a2;
import com.google.accompanist.insets.MutableWindowInsetsType;
import a4.y1;

public final class d extends b
{
    public final h h;
    
    public d(final h h) {
        super(0);
        this.h = h;
    }
    
    public static void f(final MutableWindowInsetsType mutableWindowInsetsType, final a2 a2, final List list, final int n) {
        final boolean b = list instanceof Collection;
        final int n2 = 1;
        int n3 = 0;
        Label_0086: {
            if (!b || !list.isEmpty()) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    if ((((y1)iterator.next()).a() | n) != 0x0) {
                        n3 = n2;
                        break Label_0086;
                    }
                }
            }
            n3 = 0;
        }
        if (n3 != 0) {
            final g e = mutableWindowInsetsType.e;
            final f a3 = a2.a(n);
            sg2.e.e((Object)a3, "platformInsets.getInsets(type)");
            a.L0(e, a3);
            final Iterator iterator2 = list.iterator();
            if (!iterator2.hasNext()) {
                throw new NoSuchElementException();
            }
            float n4 = ((y1)iterator2.next()).a.b();
            while (iterator2.hasNext()) {
                n4 = Math.max(n4, ((y1)iterator2.next()).a.b());
            }
            ((SnapshotMutableStateImpl)mutableWindowInsetsType.h).setValue((Object)n4);
        }
    }
    
    @Override
    public final void b(final y1 y1) {
        sg2.e.f((Object)y1, "animation");
        if ((y1.a() & 0x8) != 0x0) {
            this.h.e.j();
        }
        if ((y1.a() & 0x1) != 0x0) {
            this.h.d.j();
        }
        if ((y1.a() & 0x2) != 0x0) {
            this.h.c.j();
        }
        if ((y1.a() & 0x10) != 0x0) {
            this.h.b.j();
        }
        if ((y1.a() & 0x80) != 0x0) {
            this.h.f.j();
        }
    }
    
    @Override
    public final void c(final y1 y1) {
        if ((y1.a() & 0x8) != 0x0) {
            final MutableWindowInsetsType e = this.h.e;
            ((SnapshotMutableStateImpl)e.c).setValue((Object)(e.i() + 1));
        }
        if ((y1.a() & 0x1) != 0x0) {
            final MutableWindowInsetsType d = this.h.d;
            ((SnapshotMutableStateImpl)d.c).setValue((Object)(d.i() + 1));
        }
        if ((y1.a() & 0x2) != 0x0) {
            final MutableWindowInsetsType c = this.h.c;
            ((SnapshotMutableStateImpl)c.c).setValue((Object)(c.i() + 1));
        }
        if ((y1.a() & 0x10) != 0x0) {
            final MutableWindowInsetsType b = this.h.b;
            ((SnapshotMutableStateImpl)b.c).setValue((Object)(b.i() + 1));
        }
        if ((y1.a() & 0x80) != 0x0) {
            final MutableWindowInsetsType f = this.h.f;
            ((SnapshotMutableStateImpl)f.c).setValue((Object)(f.i() + 1));
        }
    }
    
    @Override
    public final a2 d(final a2 a2, final List<y1> list) {
        sg2.e.f((Object)a2, "platformInsets");
        sg2.e.f((Object)list, "runningAnimations");
        f(this.h.e, a2, list, 8);
        f(this.h.d, a2, list, 1);
        f(this.h.c, a2, list, 2);
        f(this.h.b, a2, list, 16);
        f(this.h.f, a2, list, 128);
        return a2;
    }
}
