// 
// Decompiled by Procyon v0.6.0
// 

package l6;

import java.util.UUID;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.work.WorkInfo;
import java.util.List;
import o.a;
import c6.h;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.BackoffPolicy;
import androidx.work.b;
import androidx.work.WorkInfo$State;

public final class q
{
    public static final String s;
    public static final q$a t;
    public String a;
    public WorkInfo$State b;
    public String c;
    public String d;
    public androidx.work.b e;
    public androidx.work.b f;
    public long g;
    public long h;
    public long i;
    public c6.b j;
    public int k;
    public BackoffPolicy l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public OutOfQuotaPolicy r;
    
    static {
        s = h.e("WorkSpec");
        t = new a<List<c>, List<WorkInfo>>() {
            public final Object apply(final Object o) {
                final List list = (List)o;
                ArrayList<WorkInfo> list2;
                if (list == null) {
                    list2 = null;
                }
                else {
                    list2 = new ArrayList<WorkInfo>(list.size());
                    final Iterator iterator = list.iterator();
                    while (iterator.hasNext()) {
                        list2.add(((c)iterator.next()).a());
                    }
                }
                return list2;
            }
        };
    }
    
    public q(final String a, final String c) {
        this.b = WorkInfo$State.ENQUEUED;
        final androidx.work.b c2 = androidx.work.b.c;
        this.e = c2;
        this.f = c2;
        this.j = c6.b.i;
        this.l = BackoffPolicy.EXPONENTIAL;
        this.m = 30000L;
        this.p = -1L;
        this.r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.a = a;
        this.c = c;
    }
    
    public q(final q q) {
        this.b = WorkInfo$State.ENQUEUED;
        final androidx.work.b c = androidx.work.b.c;
        this.e = c;
        this.f = c;
        this.j = c6.b.i;
        this.l = BackoffPolicy.EXPONENTIAL;
        this.m = 30000L;
        this.p = -1L;
        this.r = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.a = q.a;
        this.c = q.c;
        this.b = q.b;
        this.d = q.d;
        this.e = new androidx.work.b(q.e);
        this.f = new androidx.work.b(q.f);
        this.g = q.g;
        this.h = q.h;
        this.i = q.i;
        this.j = new c6.b(q.j);
        this.k = q.k;
        this.l = q.l;
        this.m = q.m;
        this.n = q.n;
        this.o = q.o;
        this.p = q.p;
        this.q = q.q;
        this.r = q.r;
    }
    
    public final long a() {
        final WorkInfo$State b = this.b;
        final WorkInfo$State enqueued = WorkInfo$State.ENQUEUED;
        final int n = 1;
        final int n2 = 0;
        long n5;
        long n6;
        if (b == enqueued && this.k > 0) {
            int n3 = n2;
            if (this.l == BackoffPolicy.LINEAR) {
                n3 = 1;
            }
            long n4;
            if (n3 != 0) {
                n4 = this.m * this.k;
            }
            else {
                n4 = (long)Math.scalb((float)this.m, this.k - 1);
            }
            n5 = this.n;
            n6 = Math.min(18000000L, n4);
        }
        else {
            final boolean c = this.c();
            long n7 = 0L;
            if (c) {
                final long currentTimeMillis = System.currentTimeMillis();
                long n8 = this.n;
                final long n9 = lcmp(n8, 0L);
                if (n9 == 0) {
                    n8 = this.g + currentTimeMillis;
                }
                final long i = this.i;
                final long h = this.h;
                int n10;
                if (i != h) {
                    n10 = n;
                }
                else {
                    n10 = 0;
                }
                if (n10 != 0) {
                    if (n9 == 0) {
                        n7 = i * -1L;
                    }
                    return n8 + h + n7;
                }
                if (n9 != 0) {
                    n7 = h;
                }
                return n8 + n7;
            }
            else {
                if ((n6 = this.n) == 0L) {
                    n6 = System.currentTimeMillis();
                }
                n5 = this.g;
            }
        }
        return n6 + n5;
    }
    
    public final boolean b() {
        return c6.b.i.equals((Object)this.j) ^ true;
    }
    
    public final boolean c() {
        return this.h != 0L;
    }
    
    public final void d(long n, long i) {
        long h = n;
        if (n < 900000L) {
            c6.h.c().f(l6.q.s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            h = 900000L;
        }
        n = i;
        if (i < 300000L) {
            c6.h.c().f(l6.q.s, String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new Throwable[0]);
            n = 300000L;
        }
        i = n;
        if (n > h) {
            c6.h.c().f(l6.q.s, String.format("Flex duration greater than interval duration; Changed to %s", h), new Throwable[0]);
            i = h;
        }
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null || q.class != o.getClass()) {
            return false;
        }
        final q q = (q)o;
        if (this.g != q.g) {
            return false;
        }
        if (this.h != q.h) {
            return false;
        }
        if (this.i != q.i) {
            return false;
        }
        if (this.k != q.k) {
            return false;
        }
        if (this.m != q.m) {
            return false;
        }
        if (this.n != q.n) {
            return false;
        }
        if (this.o != q.o) {
            return false;
        }
        if (this.p != q.p) {
            return false;
        }
        if (this.q != q.q) {
            return false;
        }
        if (!this.a.equals(q.a)) {
            return false;
        }
        if (this.b != q.b) {
            return false;
        }
        if (!this.c.equals(q.c)) {
            return false;
        }
        final String d = this.d;
        Label_0231: {
            if (d != null) {
                if (d.equals(q.d)) {
                    break Label_0231;
                }
            }
            else if (q.d == null) {
                break Label_0231;
            }
            return false;
        }
        if (!this.e.equals((Object)q.e)) {
            return false;
        }
        if (!this.f.equals((Object)q.f)) {
            return false;
        }
        if (!this.j.equals((Object)q.j)) {
            return false;
        }
        if (this.l != q.l) {
            return false;
        }
        if (this.r != q.r) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        final int f = ag0.a.f(this.c, (this.b.hashCode() + this.a.hashCode() * 31) * 31, 31);
        final String d = this.d;
        int hashCode;
        if (d != null) {
            hashCode = d.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int hashCode2 = this.e.hashCode();
        final int hashCode3 = this.f.hashCode();
        final long g = this.g;
        final int n = (int)(g ^ g >>> 32);
        final long h = this.h;
        final int n2 = (int)(h ^ h >>> 32);
        final long i = this.i;
        final int n3 = (int)(i ^ i >>> 32);
        final int hashCode4 = this.j.hashCode();
        final int k = this.k;
        final int hashCode5 = this.l.hashCode();
        final long m = this.m;
        final int n4 = (int)(m ^ m >>> 32);
        final long n5 = this.n;
        final int n6 = (int)(n5 ^ n5 >>> 32);
        final long o = this.o;
        final int n7 = (int)(o ^ o >>> 32);
        final long p = this.p;
        return this.r.hashCode() + ((((((hashCode5 + ((hashCode4 + ((((hashCode3 + (hashCode2 + (f + hashCode) * 31) * 31) * 31 + n) * 31 + n2) * 31 + n3) * 31) * 31 + k) * 31) * 31 + n4) * 31 + n6) * 31 + n7) * 31 + (int)(p ^ p >>> 32)) * 31 + (this.q ? 1 : 0)) * 31;
    }
    
    @Override
    public final String toString() {
        return a2.b.j(a.k("{WorkSpec: "), this.a, "}");
    }
    
    public static final class b
    {
        public String a;
        public WorkInfo$State b;
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return this.b == b.b && this.a.equals(b.a);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
    }
    
    public static final class c
    {
        public String a;
        public WorkInfo$State b;
        public androidx.work.b c;
        public int d;
        public ArrayList e;
        public ArrayList f;
        
        public final WorkInfo a() {
            final ArrayList f = this.f;
            androidx.work.b c;
            if (f != null && !f.isEmpty()) {
                c = (androidx.work.b)this.f.get(0);
            }
            else {
                c = androidx.work.b.c;
            }
            return new WorkInfo(UUID.fromString(this.a), this.b, this.c, (List)this.e, c, this.d);
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean equals = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            if (this.d != c.d) {
                return false;
            }
            final String a = this.a;
            Label_0068: {
                if (a != null) {
                    if (a.equals(c.a)) {
                        break Label_0068;
                    }
                }
                else if (c.a == null) {
                    break Label_0068;
                }
                return false;
            }
            if (this.b != c.b) {
                return false;
            }
            final androidx.work.b c2 = this.c;
            Label_0113: {
                if (c2 != null) {
                    if (c2.equals((Object)c.c)) {
                        break Label_0113;
                    }
                }
                else if (c.c == null) {
                    break Label_0113;
                }
                return false;
            }
            final ArrayList e = this.e;
            Label_0147: {
                if (e != null) {
                    if (e.equals(c.e)) {
                        break Label_0147;
                    }
                }
                else if (c.e == null) {
                    break Label_0147;
                }
                return false;
            }
            final ArrayList f = this.f;
            final ArrayList f2 = c.f;
            if (f != null) {
                equals = f.equals(f2);
            }
            else if (f2 != null) {
                equals = false;
            }
            return equals;
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a != null) {
                hashCode2 = a.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final WorkInfo$State b = this.b;
            int hashCode3;
            if (b != null) {
                hashCode3 = b.hashCode();
            }
            else {
                hashCode3 = 0;
            }
            final androidx.work.b c = this.c;
            int hashCode4;
            if (c != null) {
                hashCode4 = c.hashCode();
            }
            else {
                hashCode4 = 0;
            }
            final int d = this.d;
            final ArrayList e = this.e;
            int hashCode5;
            if (e != null) {
                hashCode5 = e.hashCode();
            }
            else {
                hashCode5 = 0;
            }
            final ArrayList f = this.f;
            if (f != null) {
                hashCode = f.hashCode();
            }
            return ((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + d) * 31 + hashCode5) * 31 + hashCode;
        }
    }
}
