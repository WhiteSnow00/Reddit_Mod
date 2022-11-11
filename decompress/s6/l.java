// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import java.util.ListIterator;
import java.util.List;
import android.graphics.Matrix;
import t6.q;
import android.graphics.Path$Op;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import android.graphics.Path;

public final class l implements m, j
{
    public final Path a;
    public final Path b;
    public final Path c;
    public final ArrayList d;
    public final MergePaths e;
    
    public l(final MergePaths e) {
        this.a = new Path();
        this.b = new Path();
        this.c = new Path();
        this.d = new ArrayList();
        e.getClass();
        this.e = e;
    }
    
    public final Path T0() {
        this.c.reset();
        final MergePaths e = this.e;
        if (e.b) {
            return this.c;
        }
        final int n = l$a.a[((Enum)e.a).ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n == 5) {
                            this.a(Path$Op.XOR);
                        }
                    }
                    else {
                        this.a(Path$Op.INTERSECT);
                    }
                }
                else {
                    this.a(Path$Op.REVERSE_DIFFERENCE);
                }
            }
            else {
                this.a(Path$Op.UNION);
            }
        }
        else {
            for (int i = 0; i < this.d.size(); ++i) {
                this.c.addPath(((m)this.d.get(i)).T0());
            }
        }
        return this.c;
    }
    
    public final void a(final Path$Op path$Op) {
        this.b.reset();
        this.a.reset();
        for (int i = this.d.size() - 1; i >= 1; --i) {
            final m m = this.d.get(i);
            if (m instanceof d) {
                final d d = (d)m;
                final ArrayList list = (ArrayList)d.c();
                for (int j = list.size() - 1; j >= 0; --j) {
                    final Path t0 = ((m)list.get(j)).T0();
                    final q k = d.k;
                    Matrix matrix;
                    if (k != null) {
                        matrix = k.d();
                    }
                    else {
                        d.c.reset();
                        matrix = d.c;
                    }
                    t0.transform(matrix);
                    this.b.addPath(t0);
                }
            }
            else {
                this.b.addPath(m.T0());
            }
        }
        final ArrayList d2 = this.d;
        int n = 0;
        final m l = d2.get(0);
        if (l instanceof d) {
            final d d3 = (d)l;
            final List<m> c = d3.c();
            while (true) {
                final ArrayList list2 = (ArrayList)c;
                if (n >= list2.size()) {
                    break;
                }
                final Path t2 = ((m)list2.get(n)).T0();
                final q k2 = d3.k;
                Matrix matrix2;
                if (k2 != null) {
                    matrix2 = k2.d();
                }
                else {
                    d3.c.reset();
                    matrix2 = d3.c;
                }
                t2.transform(matrix2);
                this.a.addPath(t2);
                ++n;
            }
        }
        else {
            this.a.set(l.T0());
        }
        this.c.op(this.a, this.b, path$Op);
    }
    
    public final void c(final ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {}
        while (listIterator.hasPrevious()) {
            final c c = listIterator.previous();
            if (c instanceof m) {
                this.d.add(c);
                listIterator.remove();
            }
        }
    }
    
    public final void g(final List<c> list, final List<c> list2) {
        for (int i = 0; i < this.d.size(); ++i) {
            ((c)this.d.get(i)).g(list, list2);
        }
    }
}
