// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import s0.c$a;
import zg2.l;
import yl.a;
import kotlin.collections.EmptyList;
import ah2.f;
import r0.c;
import java.util.List;
import java.util.ArrayList;

public final class LazyGridSpanLayoutProvider
{
    public final LazyGridItemsSnapshot a;
    public final ArrayList<a> b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final ArrayList g;
    public List<r0.c> h;
    public int i;
    
    public LazyGridSpanLayoutProvider(final LazyGridItemsSnapshot a) {
        ah2.f.f((Object)a, "itemsSnapshot");
        this.a = a;
        final ArrayList b = new ArrayList();
        b.add(new a(0, 0));
        this.b = b;
        this.f = -1;
        this.g = new ArrayList();
        this.h = (List<r0.c>)EmptyList.INSTANCE;
    }
    
    public final int a() {
        return (int)Math.sqrt(this.d() * 1.0 / this.i) + 1;
    }
    
    public final c b(int i) {
        final boolean b = this.a.b;
        final int n = 0;
        if (!b) {
            final int j = this.i;
            final int n2 = i * j;
            final int n3 = this.d() - n2;
            if ((i = j) > n3) {
                i = n3;
            }
            int n4;
            if ((n4 = i) < 0) {
                n4 = 0;
            }
            List<r0.c> h;
            if (n4 == this.h.size()) {
                h = this.h;
            }
            else {
                h = new ArrayList<r0.c>(n4);
                for (i = n; i < n4; ++i) {
                    ((ArrayList<r0.c>)h).add(new r0.c((long)1));
                }
                this.h = h;
            }
            return new c(n2, h);
        }
        final int min = Math.min(i / this.a(), this.b.size() - 1);
        final int n5 = this.a() * min;
        final int a = this.b.get(min).a;
        final int b2 = this.b.get(min).b;
        final int c = this.c;
        int e;
        int n6;
        int intValue;
        if (n5 <= c && c <= i) {
            final int d = this.d;
            e = this.e;
            n6 = c;
            intValue = d;
        }
        else {
            n6 = n5;
            intValue = a;
            e = b2;
            if (min == this.f) {
                final int n7 = i - n5;
                n6 = n5;
                intValue = a;
                e = b2;
                if (n7 < this.g.size()) {
                    intValue = ((Number)this.g.get(n7)).intValue();
                    n6 = i;
                    e = 0;
                }
            }
        }
        boolean b3 = false;
        Label_0382: {
            if (n6 % this.a() == 0) {
                final int a2 = this.a();
                final int n8 = i - n6;
                if (2 <= n8 && n8 < a2) {
                    b3 = true;
                    break Label_0382;
                }
            }
            b3 = false;
        }
        if (b3) {
            this.f = min;
            this.g.clear();
        }
        if (n6 <= i) {
            int n9 = n6;
            while (n9 < i && intValue < this.d()) {
                if (b3) {
                    this.g.add(intValue);
                }
                final int n10 = 0;
                int n11 = e;
                int n12 = intValue;
                int n13 = n10;
                int n14;
                while (true) {
                    n14 = n11;
                    if (n13 >= this.i) {
                        break;
                    }
                    n14 = n11;
                    if (n12 >= this.d()) {
                        break;
                    }
                    int n15;
                    if (n11 == 0) {
                        final int e2 = this.e(n12);
                        n15 = n11;
                        n11 = e2;
                    }
                    else {
                        n15 = 0;
                    }
                    n13 += n11;
                    if (n13 > this.i) {
                        n14 = n11;
                        break;
                    }
                    ++n12;
                    n11 = n15;
                }
                final int n16 = ++n9;
                intValue = n12;
                e = n14;
                if (n16 % this.a() == 0) {
                    n9 = n16;
                    intValue = n12;
                    e = n14;
                    if (n12 >= this.d()) {
                        continue;
                    }
                    if (this.b.size() != n16 / this.a()) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    this.b.add(new a(n12, n14));
                    n9 = n16;
                    intValue = n12;
                    e = n14;
                }
            }
            this.c = i;
            this.d = intValue;
            this.e = e;
            final ArrayList<r0.c> list = new ArrayList<r0.c>();
            int n17 = 0;
            int n18 = intValue;
            while (n17 < this.i && n18 < this.d()) {
                if (e == 0) {
                    final int e3 = this.e(n18);
                    i = e;
                    e = e3;
                }
                else {
                    i = 0;
                }
                n17 += e;
                if (n17 > this.i) {
                    break;
                }
                ++n18;
                list.add(new r0.c((long)e));
                e = i;
            }
            return new c(intValue, list);
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final int c(final int n) {
        if (this.d() <= 0) {
            return 0;
        }
        if (n >= this.d()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.a.b) {
            return n / this.i;
        }
        final ArrayList<a> b = this.b;
        final LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket.LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1 lazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1 = new LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket.LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(n);
        int size = b.size();
        ah2.c.m0(b.size(), 0, size);
        --size;
        int i = 0;
        while (true) {
            while (i <= size) {
                final int n2 = i + size >>> 1;
                final int intValue = ((Number)((l)lazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1).invoke(b.get(n2))).intValue();
                if (intValue < 0) {
                    i = n2 + 1;
                }
                else {
                    int n3 = n2;
                    if (intValue > 0) {
                        size = n2 - 1;
                    }
                    else {
                        if (n3 < 0) {
                            n3 = -n3 - 2;
                        }
                        int n4 = this.a() * n3;
                        int j = this.b.get(n3).a;
                        if (j <= n) {
                            int n5 = 0;
                            while (j < n) {
                                final int n6 = j + 1;
                                final int e = this.e(j);
                                n5 += e;
                                final int k = this.i;
                                if (n5 >= k) {
                                    ++n4;
                                    if (n5 == k) {
                                        n5 = 0;
                                    }
                                    else {
                                        n5 = e;
                                    }
                                }
                                if (n4 % this.a() == 0 && n4 / this.a() >= this.b.size()) {
                                    final ArrayList<a> b2 = this.b;
                                    int n7;
                                    if (n5 > 0) {
                                        n7 = 1;
                                    }
                                    else {
                                        n7 = 0;
                                    }
                                    b2.add(new a(n6 - n7, 0));
                                }
                                j = n6;
                            }
                            int n8 = n4;
                            if (this.e(n) + n5 > this.i) {
                                n8 = n4 + 1;
                            }
                            return n8;
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
            }
            int n3 = -(i + 1);
            continue;
        }
    }
    
    public final int d() {
        return this.a.a.getSize();
    }
    
    public final int e(final int n) {
        final LazyGridItemsSnapshot a = this.a;
        final LazyGridSpanLayoutProvider.LazyGridSpanLayoutProvider$b a2 = LazyGridSpanLayoutProvider.LazyGridSpanLayoutProvider$b.a;
        LazyGridSpanLayoutProvider.LazyGridSpanLayoutProvider$b.b = this.i;
        a.getClass();
        final s0.c.c$a<r0.f> value = a.a.get(n);
        return yl.a.K((int)((r0.c)((r0.f)((c$a)value).c).b.invoke((Object)a2, (Object)(n - ((c$a)value).a))).a, 1, this.i);
    }
    
    public static final class a
    {
        public final int a;
        public final int b;
        
        public a(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class c
    {
        public final int a;
        public final List<r0.c> b;
        
        public c(final int a, final List<r0.c> b) {
            f.f((Object)b, "spans");
            this.a = a;
            this.b = b;
        }
    }
}
