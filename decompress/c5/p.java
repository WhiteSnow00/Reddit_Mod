// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import kotlinx.coroutines.sync.MutexImpl;
import androidx.paging.PageEvent;
import kotlin.NoWhenBranchMatchedException;
import androidx.paging.PageEvent$Insert;
import java.util.Iterator;
import sg2.e;
import androidx.paging.PageEvent$a;
import androidx.paging.PagingSource$b$b;
import java.util.List;
import lw0.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import hg2.j;
import androidx.paging.LoadType;
import kotlinx.coroutines.channels.BufferOverflow;
import a4.a0;
import java.util.LinkedHashMap;
import kotlinx.coroutines.channels.AbstractChannel;
import java.util.ArrayList;

public final class p<Key, Value>
{
    public final r a;
    public final ArrayList b;
    public final ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final AbstractChannel i;
    public final AbstractChannel j;
    public final LinkedHashMap k;
    public n l;
    
    public p(final r a) {
        this.a = a;
        final ArrayList list = new ArrayList();
        this.b = list;
        this.c = list;
        this.i = a0.g(-1, null, 6);
        this.j = a0.g(-1, null, 6);
        this.k = new LinkedHashMap();
        final n l = new n();
        l.b(LoadType.REFRESH, c5.k.b.b);
        final j a2 = hg2.j.a;
        this.l = l;
    }
    
    public final u<Key, Value> a(final b0.a a) {
        final List q4 = CollectionsKt___CollectionsKt.q4((Iterable)this.c);
        Integer value;
        if (a == null) {
            value = null;
        }
        else {
            int d = this.d();
            final int n = -this.d;
            final int l0 = lw0.b.L0((List)this.c);
            final int d2 = this.d;
            final int e = a.e;
            int n2 = d;
            if (n < e) {
                int n3 = n;
                while (true) {
                    final int n4 = n3 + 1;
                    int n5;
                    if (n3 > l0 - d2) {
                        n5 = this.a.a;
                    }
                    else {
                        n5 = this.c.get(n3 + this.d).a.size();
                    }
                    d += n5;
                    if (n4 >= e) {
                        break;
                    }
                    n3 = n4;
                }
                n2 = d;
            }
            int n6 = n2 + a.f;
            if (a.e < n) {
                n6 -= this.a.a;
            }
            value = n6;
        }
        return new u<Key, Value>(q4, value, this.a, this.d());
    }
    
    public final void b(final PageEvent$a<Value> pageEvent$a) {
        final int c = pageEvent$a.c();
        final int size = this.c.size();
        final int n = 0;
        final int n2 = 0;
        if (c <= size) {
            this.k.remove(pageEvent$a.a);
            this.l.b(pageEvent$a.a, c5.k.c.c);
            final int n3 = p.b.a[pageEvent$a.a.ordinal()];
            if (n3 != 2) {
                if (n3 != 3) {
                    throw new IllegalArgumentException(sg2.e.l((Object)pageEvent$a.a, "cannot drop "));
                }
                for (int c2 = pageEvent$a.c(), i = 0; i < c2; ++i) {
                    this.b.remove(this.c.size() - 1);
                }
                int d = pageEvent$a.d;
                if (d == Integer.MIN_VALUE) {
                    d = n2;
                }
                this.f = d;
                final int h = this.h + 1;
                this.h = h;
                ((gj2.a)this.j).e((Object)h);
            }
            else {
                for (int c3 = pageEvent$a.c(), j = 0; j < c3; ++j) {
                    this.b.remove(0);
                }
                this.d -= pageEvent$a.c();
                int d2 = pageEvent$a.d;
                if (d2 == Integer.MIN_VALUE) {
                    d2 = n;
                }
                this.e = d2;
                final int g = this.g + 1;
                this.g = g;
                ((gj2.a)this.i).e((Object)g);
            }
            return;
        }
        final StringBuilder r = a.r("invalid drop count. have ");
        r.append(this.c.size());
        r.append(" but wanted to drop ");
        r.append(pageEvent$a.c());
        throw new IllegalStateException(r.toString().toString());
    }
    
    public final PageEvent$a<Value> c(final LoadType loadType, final b0 b0) {
        sg2.e.f((Object)loadType, "loadType");
        sg2.e.f((Object)b0, "hint");
        final int e = this.a.e;
        final PageEvent$a<Value> pageEvent$a = null;
        if (e == Integer.MAX_VALUE) {
            return null;
        }
        if (this.c.size() <= 2) {
            return null;
        }
        final Iterator iterator = this.c.iterator();
        final int n = 0;
        final int n2 = 0;
        int n3 = 0;
        while (iterator.hasNext()) {
            n3 += ((PagingSource$b$b)iterator.next()).a.size();
        }
        if (n3 <= this.a.e) {
            return null;
        }
        if (loadType != LoadType.REFRESH) {
            int n4;
            int i;
            for (i = (n4 = 0); i < this.c.size(); ++i) {
                final Iterator iterator2 = this.c.iterator();
                int n5 = 0;
                while (iterator2.hasNext()) {
                    n5 += ((PagingSource$b$b)iterator2.next()).a.size();
                }
                if (n5 - n4 <= this.a.e) {
                    break;
                }
                final int[] a = p.b.a;
                int n6;
                if (a[loadType.ordinal()] == 2) {
                    n6 = this.c.get(i).a.size();
                }
                else {
                    final ArrayList c = this.c;
                    n6 = ((PagingSource$b$b)c.get(lw0.b.L0((List)c) - i)).a.size();
                }
                int n7;
                if (a[loadType.ordinal()] == 2) {
                    n7 = b0.a;
                }
                else {
                    n7 = b0.b;
                }
                if (n7 - n4 - n6 < this.a.b) {
                    break;
                }
                n4 += n6;
            }
            PageEvent$a pageEvent$a2;
            if (i == 0) {
                pageEvent$a2 = pageEvent$a;
            }
            else {
                final int[] a2 = p.b.a;
                int n8;
                if (a2[loadType.ordinal()] == 2) {
                    n8 = -this.d;
                }
                else {
                    n8 = lw0.b.L0((List)this.c) - this.d - (i - 1);
                }
                int n9;
                if (a2[loadType.ordinal()] == 2) {
                    n9 = i - 1 - this.d;
                }
                else {
                    n9 = lw0.b.L0((List)this.c) - this.d;
                }
                final boolean c2 = this.a.c;
                int n10;
                if (!c2) {
                    n10 = n;
                }
                else {
                    int n11;
                    if (loadType == LoadType.PREPEND) {
                        n11 = this.d();
                    }
                    else {
                        n11 = n2;
                        if (c2) {
                            n11 = this.f;
                        }
                    }
                    n10 = n11 + n4;
                }
                pageEvent$a2 = new PageEvent$a(loadType, n8, n9, n10);
            }
            return (PageEvent$a<Value>)pageEvent$a2;
        }
        throw new IllegalArgumentException(sg2.e.l((Object)loadType, "Drop LoadType must be PREPEND or APPEND, but got ").toString());
    }
    
    public final int d() {
        int e;
        if (this.a.c) {
            e = this.e;
        }
        else {
            e = 0;
        }
        return e;
    }
    
    public final boolean e(int n, final LoadType loadType, final PagingSource$b$b<Key, Value> pagingSource$b$b) {
        sg2.e.f((Object)loadType, "loadType");
        sg2.e.f((Object)pagingSource$b$b, "page");
        final int n2 = p.b.a[loadType.ordinal()];
        final int n3 = 0;
        final int n4 = 0;
        final int n5 = 0;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 == 3) {
                    if (!(this.c.isEmpty() ^ true)) {
                        throw new IllegalStateException("should've received an init before append".toString());
                    }
                    if (n != this.h) {
                        return false;
                    }
                    this.b.add(pagingSource$b$b);
                    if ((n = pagingSource$b$b.e) == Integer.MIN_VALUE) {
                        if (this.a.c) {
                            n = this.f;
                        }
                        else {
                            n = 0;
                        }
                        if ((n -= pagingSource$b$b.a.size()) < 0) {
                            n = 0;
                        }
                    }
                    if (n == Integer.MIN_VALUE) {
                        n = n5;
                    }
                    this.f = n;
                    this.k.remove(LoadType.APPEND);
                }
            }
            else {
                if (!(this.c.isEmpty() ^ true)) {
                    throw new IllegalStateException("should've received an init before prepend".toString());
                }
                if (n != this.g) {
                    return false;
                }
                this.b.add(0, pagingSource$b$b);
                ++this.d;
                if ((n = pagingSource$b$b.d) == Integer.MIN_VALUE && (n = this.d() - pagingSource$b$b.a.size()) < 0) {
                    n = 0;
                }
                if (n == Integer.MIN_VALUE) {
                    n = n3;
                }
                this.e = n;
                this.k.remove(LoadType.PREPEND);
            }
        }
        else {
            if (!this.c.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls".toString());
            }
            if (n == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n == 0) {
                throw new IllegalStateException("init loadId must be the initial value, 0".toString());
            }
            this.b.add(pagingSource$b$b);
            this.d = 0;
            if ((n = pagingSource$b$b.e) == Integer.MIN_VALUE) {
                n = 0;
            }
            this.f = n;
            n = pagingSource$b$b.d;
            if (n == Integer.MIN_VALUE) {
                n = n4;
            }
            this.e = n;
        }
        return true;
    }
    
    public final PageEvent$Insert f(final PagingSource$b$b pagingSource$b$b, final LoadType loadType) {
        sg2.e.f((Object)pagingSource$b$b, "<this>");
        sg2.e.f((Object)loadType, "loadType");
        final int[] a = p.b.a;
        final int n = a[loadType.ordinal()];
        final int n2 = 0;
        final int n3 = 0;
        int n4;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                n4 = this.c.size() - this.d - 1;
            }
            else {
                n4 = 0 - this.d;
            }
        }
        else {
            n4 = 0;
        }
        final List r1 = lw0.b.r1((Object)new z(n4, pagingSource$b$b.a));
        final int n5 = a[loadType.ordinal()];
        Object a2;
        if (n5 != 1) {
            if (n5 != 2) {
                if (n5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                final PageEvent$Insert g = PageEvent$Insert.g;
                int f = n3;
                if (this.a.c) {
                    f = this.f;
                }
                a2 = new PageEvent$Insert(LoadType.APPEND, r1, -1, f, this.l.d(), (l)null);
            }
            else {
                final PageEvent$Insert g2 = PageEvent$Insert.g;
                a2 = new PageEvent$Insert(LoadType.PREPEND, r1, this.d(), -1, this.l.d(), (l)null);
            }
        }
        else {
            final PageEvent$Insert g3 = PageEvent$Insert.g;
            final int d = this.d();
            int f2 = n2;
            if (this.a.c) {
                f2 = this.f;
            }
            a2 = PageEvent.PageEvent$Insert.a.a(r1, d, f2, this.l.d(), null);
        }
        return (PageEvent$Insert)a2;
    }
    
    public static final class a<Key, Value>
    {
        public final MutexImpl a;
        public final p<Key, Value> b;
        
        public a(final r r) {
            e.f((Object)r, "config");
            this.a = ml0.a.d();
            this.b = new p<Key, Value>(r);
        }
    }
}
