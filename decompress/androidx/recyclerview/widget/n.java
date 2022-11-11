// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public final class n
{
    public static final n$a a;
    
    static {
        a = new Comparator<d>() {
            @Override
            public final int compare(final Object o, final Object o2) {
                return ((d)o).a - ((d)o2).a;
            }
        };
    }
    
    public static e a(final b b, final boolean b2) {
        final int oldListSize = b.getOldListSize();
        final int newListSize = b.getNewListSize();
        final ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();
        list2.add(new h(oldListSize, newListSize));
        final int n = (oldListSize + newListSize + 1) / 2 * 2 + 1;
        final c c = new c(n);
        final c c2 = new c(n);
        ArrayList list3 = new ArrayList();
        while (!list2.isEmpty()) {
            final h h = list2.remove(list2.size() - 1);
            final int b3 = h.b;
            final int a = h.a;
            final int n2 = b3 - a;
            ArrayList list4 = list3;
            ArrayList list5 = list2;
            ArrayList list6 = null;
            ArrayList list7 = null;
            i m = null;
            Label_0973: {
                if (n2 >= 1) {
                    final int n3 = h.d - h.c;
                    if (n3 < 1) {
                        list4 = list3;
                        list5 = list2;
                    }
                    else {
                        final int n4 = (n3 + n2 + 1) / 2;
                        c.a[c.b + 1] = a;
                        c2.a[c2.b + 1] = b3;
                        int n5 = 0;
                    Label_0211:
                        while (true) {
                            list4 = list3;
                            list5 = list2;
                            if (n5 < n4) {
                                final boolean b4 = Math.abs(h.b - h.a - (h.d - h.c)) % 2 == 1;
                                final int b5 = h.b;
                                final int a2 = h.a;
                                final int d = h.d;
                                final int c3 = h.c;
                                while (true) {
                                    int i;
                                    for (int n6 = i = -n5; i <= n5; i += 2) {
                                        int a3;
                                        int a4;
                                        if (i != n6 && (i == n5 || c.a(i + 1) <= c.a(i - 1))) {
                                            a3 = c.a(i - 1);
                                            a4 = a3 + 1;
                                        }
                                        else {
                                            a3 = (a4 = c.a(i + 1));
                                        }
                                        int d2 = a4 - h.a + h.c - i;
                                        int b6;
                                        if (n5 != 0 && a4 == a3) {
                                            b6 = d2 - 1;
                                        }
                                        else {
                                            b6 = d2;
                                        }
                                        while (a4 < h.b && d2 < h.d && b.areItemsTheSame(a4, d2)) {
                                            ++a4;
                                            ++d2;
                                        }
                                        c.a[c.b + i] = a4;
                                        if (b4) {
                                            final int n7 = b5 - a2 - (d - c3) - i;
                                            if (n7 >= n6 + 1 && n7 <= n5 - 1 && c2.a(n7) <= a4) {
                                                final i j = new i();
                                                j.a = a3;
                                                j.b = b6;
                                                j.c = a4;
                                                j.d = d2;
                                                j.e = false;
                                                list6 = list3;
                                                list7 = list2;
                                                i l = null;
                                                Label_0604: {
                                                    if (j == null) {
                                                        final int n8 = h.b - h.a - (h.d - h.c);
                                                        final boolean b7 = n8 % 2 == 0;
                                                        while (true) {
                                                            for (int k = n6; k <= n5; k += 2) {
                                                                int a5;
                                                                int a6;
                                                                if (k != n6 && (k == n5 || c2.a(k + 1) >= c2.a(k - 1))) {
                                                                    a5 = c2.a(k - 1);
                                                                    a6 = a5 - 1;
                                                                }
                                                                else {
                                                                    a5 = (a6 = c2.a(k + 1));
                                                                }
                                                                int b8 = h.d - (h.b - a6 - k);
                                                                int d3;
                                                                if (n5 != 0 && a6 == a5) {
                                                                    d3 = b8 + 1;
                                                                }
                                                                else {
                                                                    d3 = b8;
                                                                }
                                                                while (a6 > h.a && b8 > h.c) {
                                                                    final int n9 = a6 - 1;
                                                                    final int n10 = b8 - 1;
                                                                    if (!b.areItemsTheSame(n9, n10)) {
                                                                        break;
                                                                    }
                                                                    b8 = n10;
                                                                    a6 = n9;
                                                                }
                                                                c2.a[c2.b + k] = a6;
                                                                if (b7) {
                                                                    final int n11 = n8 - k;
                                                                    if (n11 >= n6 && n11 <= n5 && c.a(n11) >= a6) {
                                                                        l = new i();
                                                                        l.a = a6;
                                                                        l.b = b8;
                                                                        l.c = a5;
                                                                        l.d = d3;
                                                                        l.e = true;
                                                                        if (l != null) {
                                                                            break Label_0604;
                                                                        }
                                                                        ++n5;
                                                                        list2 = list7;
                                                                        list3 = list6;
                                                                        continue Label_0211;
                                                                    }
                                                                }
                                                            }
                                                            l = null;
                                                            continue;
                                                        }
                                                    }
                                                    l = j;
                                                }
                                                m = l;
                                                break Label_0973;
                                            }
                                        }
                                    }
                                    final i j = null;
                                    continue;
                                }
                            }
                            break;
                        }
                    }
                }
                list7 = list5;
                final i i2 = null;
                list6 = list4;
                m = i2;
            }
            if (m != null) {
                if (m.a() > 0) {
                    final int d4 = m.d;
                    final int b9 = m.b;
                    final int n12 = d4 - b9;
                    final int c4 = m.c;
                    final int a7 = m.a;
                    final int n13 = c4 - a7;
                    d d5;
                    if (n12 != n13) {
                        if (m.e) {
                            d5 = new d(a7, b9, m.a());
                        }
                        else if (n12 > n13) {
                            d5 = new d(a7, b9 + 1, m.a());
                        }
                        else {
                            d5 = new d(a7 + 1, b9, m.a());
                        }
                    }
                    else {
                        d5 = new d(a7, b9, n13);
                    }
                    list.add(d5);
                }
                h h2;
                if (list6.isEmpty()) {
                    h2 = new h();
                }
                else {
                    h2 = list6.remove(list6.size() - 1);
                }
                h2.a = h.a;
                h2.c = h.c;
                h2.b = m.a;
                h2.d = m.b;
                final ArrayList list8 = list7;
                list8.add(h2);
                h.b = h.b;
                h.d = h.d;
                h.a = m.c;
                h.c = m.d;
                list8.add(h);
            }
            else {
                list6.add(h);
            }
            list2 = list7;
            list3 = list6;
        }
        Collections.sort((List<Object>)list, (Comparator<? super Object>)androidx.recyclerview.widget.n.a);
        return new e(b, list, c.a, c2.a, b2);
    }
    
    public abstract static class b
    {
        public abstract boolean areContentsTheSame(final int p0, final int p1);
        
        public abstract boolean areItemsTheSame(final int p0, final int p1);
        
        public Object getChangePayload(final int n, final int n2) {
            return null;
        }
        
        public abstract int getNewListSize();
        
        public abstract int getOldListSize();
    }
    
    public static final class c
    {
        public final int[] a;
        public final int b;
        
        public c(final int n) {
            final int[] a = new int[n];
            this.a = a;
            this.b = a.length / 2;
        }
        
        public final int a(final int n) {
            return this.a[n + this.b];
        }
    }
    
    public static final class d
    {
        public final int a;
        public final int b;
        public final int c;
        
        public d(final int a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class e
    {
        public final List<d> a;
        public final int[] b;
        public final int[] c;
        public final b d;
        public final int e;
        public final int f;
        public final boolean g;
        
        public e(final b d, final ArrayList a, final int[] b, final int[] c, final boolean g) {
            this.a = a;
            this.b = b;
            this.c = c;
            Arrays.fill(b, 0);
            Arrays.fill(c, 0);
            this.d = d;
            final int oldListSize = d.getOldListSize();
            this.e = oldListSize;
            final int newListSize = d.getNewListSize();
            this.f = newListSize;
            this.g = g;
            d d2;
            if (a.isEmpty()) {
                d2 = null;
            }
            else {
                d2 = a.get(0);
            }
            if (d2 == null || d2.a != 0 || d2.b != 0) {
                a.add(0, new d(0, 0, 0));
            }
            a.add(new d(oldListSize, newListSize, 0));
            for (final d d3 : a) {
                for (int i = 0; i < d3.c; ++i) {
                    final int n = d3.a + i;
                    final int n2 = d3.b + i;
                    int n3;
                    if (this.d.areContentsTheSame(n, n2)) {
                        n3 = 1;
                    }
                    else {
                        n3 = 2;
                    }
                    this.b[n] = (n2 << 4 | n3);
                    this.c[n2] = (n << 4 | n3);
                }
            }
            if (this.g) {
                final Iterator<d> iterator2 = this.a.iterator();
                int n4 = 0;
                while (iterator2.hasNext()) {
                    final d d4 = iterator2.next();
                    int n5 = n4;
                    int a2;
                    while (true) {
                        a2 = d4.a;
                        if (n5 >= a2) {
                            break;
                        }
                        Label_0467: {
                            if (this.b[n5] == 0) {
                                int n6;
                                for (int size = this.a.size(), j = n6 = 0; j < size; ++j) {
                                    final d d5 = this.a.get(j);
                                    while (true) {
                                        final int b2 = d5.b;
                                        if (n6 >= b2) {
                                            n6 = d5.c + b2;
                                            break;
                                        }
                                        if (this.c[n6] == 0 && this.d.areItemsTheSame(n5, n6)) {
                                            int n7;
                                            if (this.d.areContentsTheSame(n5, n6)) {
                                                n7 = 8;
                                            }
                                            else {
                                                n7 = 4;
                                            }
                                            this.b[n5] = (n6 << 4 | n7);
                                            this.c[n6] = (n7 | n5 << 4);
                                            break Label_0467;
                                        }
                                        ++n6;
                                    }
                                }
                            }
                        }
                        ++n5;
                    }
                    n4 = d4.c + a2;
                }
            }
        }
        
        public static g c(final ArrayDeque arrayDeque, final int n, final boolean b) {
            final Iterator iterator = arrayDeque.iterator();
            while (true) {
                while (iterator.hasNext()) {
                    final g g = (g)iterator.next();
                    if (g.a == n && g.c == b) {
                        iterator.remove();
                        while (iterator.hasNext()) {
                            final g g2 = (g)iterator.next();
                            if (b) {
                                --g2.b;
                            }
                            else {
                                ++g2.b;
                            }
                        }
                        return g;
                    }
                }
                final g g = null;
                continue;
            }
        }
        
        public final void a(final a0 a0) {
            androidx.recyclerview.widget.e e;
            if (a0 instanceof androidx.recyclerview.widget.e) {
                e = (androidx.recyclerview.widget.e)a0;
            }
            else {
                e = new androidx.recyclerview.widget.e(a0);
            }
            int e2 = this.e;
            final ArrayDeque arrayDeque = new ArrayDeque();
            int n = this.e;
            int n2 = this.f;
            for (int i = this.a.size() - 1; i >= 0; --i) {
                final d d = this.a.get(i);
                final int a2 = d.a;
                final int c = d.c;
                final int b = d.b;
                int n3 = n;
                int n4 = e2;
                int n5;
                int j;
                while (true) {
                    n5 = 0;
                    e2 = n4;
                    j = n2;
                    if (n3 <= a2 + c) {
                        break;
                    }
                    final int n6 = n3 - 1;
                    final int n7 = this.b[n6];
                    if ((n7 & 0xC) != 0x0) {
                        final int n8 = n7 >> 4;
                        final g c2 = c(arrayDeque, n8, false);
                        if (c2 != null) {
                            final int n9 = n4 - c2.b - 1;
                            e.d(n6, n9);
                            n3 = n6;
                            if ((n7 & 0x4) == 0x0) {
                                continue;
                            }
                            e.a(n9, 1, this.d.getChangePayload(n6, n8));
                            n3 = n6;
                        }
                        else {
                            arrayDeque.add(new g(n6, n4 - n6 - 1, true));
                            n3 = n6;
                        }
                    }
                    else {
                        e.c(n6, 1);
                        --n4;
                        n3 = n6;
                    }
                }
                while (j > b + c) {
                    final int n10 = j - 1;
                    final int n11 = this.c[n10];
                    if ((n11 & 0xC) != 0x0) {
                        final int n12 = n11 >> 4;
                        final g c3 = c(arrayDeque, n12, true);
                        if (c3 == null) {
                            arrayDeque.add(new g(n10, e2 - n3, false));
                            j = n10;
                        }
                        else {
                            e.d(e2 - c3.b - 1, n3);
                            j = n10;
                            if ((n11 & 0x4) == 0x0) {
                                continue;
                            }
                            e.a(n3, 1, this.d.getChangePayload(n12, n10));
                            j = n10;
                        }
                    }
                    else {
                        e.b(n3, 1);
                        ++e2;
                        j = n10;
                    }
                }
                int a3 = d.a;
                int b2 = d.b;
                for (int k = n5; k < d.c; ++k) {
                    if ((this.b[a3] & 0xF) == 0x2) {
                        e.a(a3, 1, this.d.getChangePayload(a3, b2));
                    }
                    ++a3;
                    ++b2;
                }
                n = d.a;
                n2 = d.b;
            }
            e.e();
        }
        
        public final void b(final RecyclerView$Adapter recyclerView$Adapter) {
            this.a((a0)new androidx.recyclerview.widget.b(recyclerView$Adapter));
        }
    }
    
    public abstract static class f<T>
    {
        public abstract boolean a(final T p0, final T p1);
        
        public abstract boolean b(final T p0, final T p1);
        
        public Object c(final T t, final T t2) {
            return null;
        }
    }
    
    public static final class g
    {
        public int a;
        public int b;
        public boolean c;
        
        public g(final int a, final int b, final boolean c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class h
    {
        public int a;
        public int b;
        public int c;
        public int d;
        
        public h() {
        }
        
        public h(final int b, final int d) {
            this.a = 0;
            this.b = b;
            this.c = 0;
            this.d = d;
        }
    }
    
    public static final class i
    {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;
        
        public final int a() {
            return Math.min(this.c - this.a, this.d - this.b);
        }
    }
}
