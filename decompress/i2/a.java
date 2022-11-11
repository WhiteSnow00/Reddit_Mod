// 
// Decompiled by Procyon v0.6.0
// 

package i2;

import al0.f0;
import java.util.ArrayList;
import sg2.e;
import kotlin.collections.EmptyList;
import java.util.List;

public final class a implements CharSequence
{
    public final String f;
    public final List<b<k>> g;
    public final List<b<h>> h;
    public final List<b<?>> i;
    
    public a(final int n, final String s, List instance) {
        if ((n & 0x2) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        Object instance2;
        if ((n & 0x4) != 0x0) {
            instance2 = EmptyList.INSTANCE;
        }
        else {
            instance2 = null;
        }
        this(s, (List<b<k>>)instance, (List<b<h>>)instance2);
    }
    
    public a(final String s, final List<b<k>> list, final List<b<h>> list2) {
        e.f((Object)s, "text");
        e.f((Object)list, "spanStyles");
        e.f((Object)list2, "paragraphStyles");
        this(s, list, list2, (List<? extends b<?>>)EmptyList.INSTANCE);
    }
    
    public a(final String f, final List<b<k>> g, final List<b<h>> h, final List<? extends b<?>> i) {
        e.f((Object)f, "text");
        e.f((Object)g, "spanStyles");
        e.f((Object)h, "paragraphStyles");
        e.f((Object)i, "annotations");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = (List<b<?>>)i;
        final int size = h.size();
        int c = -1;
        for (int j = 0; j < size; ++j) {
            final b b = h.get(j);
            final int b2 = b.b;
            final int n = 1;
            if (b2 < c) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
            int n2;
            if (b.c <= this.f.length()) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 == 0) {
                final StringBuilder r = a.r("ParagraphStyle range [");
                r.append(b.b);
                r.append(", ");
                throw new IllegalArgumentException(al0.a.l(r, b.c, ") is out of boundary").toString());
            }
            c = b.c;
        }
    }
    
    public final ArrayList a(final int n, final int n2) {
        final List<b<?>> i = this.i;
        final ArrayList list = new ArrayList<b>(i.size());
        for (int size = i.size(), j = 0; j < size; ++j) {
            final Object value = i.get(j);
            final b b = (b)value;
            if (b.a instanceof String && i2.b.c(n, n2, b.b, b.c)) {
                list.add((b)value);
            }
        }
        return list;
    }
    
    public final ArrayList b(final int n, final int n2, final String s) {
        final List<b<?>> i = this.i;
        final ArrayList list = new ArrayList<b>(i.size());
        for (int size = i.size(), j = 0; j < size; ++j) {
            final Object value = i.get(j);
            final b b = (b)value;
            if (b.a instanceof String && e.a((Object)s, (Object)b.d) && i2.b.c(n, n2, b.b, b.c)) {
                list.add((b)value);
            }
        }
        return list;
    }
    
    public final a c(final a a) {
        final a a2 = new a(this);
        a2.c(a);
        return a2.i();
    }
    
    @Override
    public final char charAt(final int n) {
        return this.f.charAt(n);
    }
    
    public final a d(final int n, final int n2) {
        if (n > n2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("start (");
            sb.append(n);
            sb.append(") should be less or equal to end (");
            sb.append(n2);
            sb.append(')');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (n == 0 && n2 == this.f.length()) {
            return this;
        }
        final String substring = this.f.substring(n, n2);
        e.e((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return new a(substring, i2.b.b(n, n2, this.g), i2.b.b(n, n2, this.h), i2.b.b(n, n2, this.i));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final String f = this.f;
        final a a = (a)o;
        return e.a((Object)f, (Object)a.f) && e.a((Object)this.g, (Object)a.g) && e.a((Object)this.h, (Object)a.h) && e.a((Object)this.i, (Object)a.i);
    }
    
    @Override
    public final int hashCode() {
        return this.i.hashCode() + aw.b.c((List)this.h, aw.b.c((List)this.g, this.f.hashCode() * 31, 31), 31);
    }
    
    @Override
    public final int length() {
        return this.f.length();
    }
    
    @Override
    public final String toString() {
        return this.f;
    }
    
    public static final class a
    {
        public final StringBuilder a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;
        
        public a() {
            this(0);
        }
        
        public a(final int n) {
            this.a = new StringBuilder(16);
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
        }
        
        public a(final a a) {
            e.f((Object)a, "text");
            this(0);
            this.c(a);
        }
        
        public final void a(final int n, final int n2, final String s, final String s2) {
            sg2.e.f((Object)s, "tag");
            sg2.e.f((Object)s2, "annotation");
            this.d.add(new a(s2, s, n, n2));
        }
        
        public final void b(final k k, final int n, final int n2) {
            sg2.e.f((Object)k, "style");
            this.b.add(new a(k, n, n2, null, 8));
        }
        
        public final void c(final a a) {
            sg2.e.f((Object)a, "text");
            final int length = this.a.length();
            this.a.append(a.f);
            final List<b<k>> g = a.g;
            final int size = g.size();
            final int n = 0;
            for (int i = 0; i < size; ++i) {
                final b b = (b)g.get(i);
                this.b((k)b.a, b.b + length, b.c + length);
            }
            final List<b<h>> h = a.h;
            for (int size2 = h.size(), j = 0; j < size2; ++j) {
                final b b2 = (b)h.get(j);
                final h h2 = (h)b2.a;
                final int b3 = b2.b;
                final int c = b2.c;
                sg2.e.f((Object)h2, "style");
                this.c.add(new a(h2, length + b3, length + c, null, 8));
            }
            final List<b<?>> k = a.i;
            for (int size3 = k.size(), l = n; l < size3; ++l) {
                final b b4 = (b)k.get(l);
                this.d.add(new a(b4.a, b4.d, b4.b + length, b4.c + length));
            }
        }
        
        public final void d(final String s) {
            sg2.e.f((Object)s, "text");
            this.a.append(s);
        }
        
        public final void e() {
            if (this.e.isEmpty() ^ true) {
                final ArrayList e = this.e;
                ((a)e.remove(e.size() - 1)).c = this.a.length();
                return;
            }
            throw new IllegalStateException("Nothing to pop.".toString());
        }
        
        public final void f(final int n) {
            if (n < this.e.size()) {
                while (this.e.size() - 1 >= n) {
                    this.e();
                }
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(n);
            sb.append(" should be less than ");
            sb.append(this.e.size());
            throw new IllegalStateException(sb.toString().toString());
        }
        
        public final void g(final String s, final String s2) {
            final a a = new a(s2, this.a.length(), 0, s, 4);
            this.e.add(a);
            this.d.add(a);
            this.e.size();
        }
        
        public final int h(final k k) {
            sg2.e.f((Object)k, "style");
            final a a = new a(k, this.a.length(), 0, null, 12);
            this.e.add(a);
            this.b.add(a);
            return this.e.size() - 1;
        }
        
        public final a i() {
            final String string = this.a.toString();
            sg2.e.e((Object)string, "text.toString()");
            final ArrayList b = this.b;
            final ArrayList list = new ArrayList<b<k>>(b.size());
            final int size = b.size();
            final int n = 0;
            for (int i = 0; i < size; ++i) {
                list.add(((a)b.get(i)).a(this.a.length()));
            }
            final ArrayList c = this.c;
            final ArrayList list2 = new ArrayList<b<h>>(c.size());
            for (int size2 = c.size(), j = 0; j < size2; ++j) {
                list2.add(((a)c.get(j)).a(this.a.length()));
            }
            final ArrayList d = this.d;
            final ArrayList list3 = new ArrayList<b<?>>(d.size());
            for (int size3 = d.size(), k = n; k < size3; ++k) {
                list3.add(((a)d.get(k)).a(this.a.length()));
            }
            return new a(string, (List<b<k>>)list, (List<b<h>>)list2, (List<? extends b<?>>)list3);
        }
        
        public static final class a<T>
        {
            public final T a;
            public final int b;
            public int c;
            public final String d;
            
            public a(final Object a, final String d, final int b, final int c) {
                e.f((Object)d, "tag");
                this.a = (T)a;
                this.b = b;
                this.c = c;
                this.d = d;
            }
            
            public final b<T> a(int n) {
                final int c = this.c;
                if (c != Integer.MIN_VALUE) {
                    n = c;
                }
                if (n != Integer.MIN_VALUE) {
                    return (b<T>)new b(this.a, this.d, this.b, n);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }
            
            @Override
            public final boolean equals(final Object o) {
                if (this == o) {
                    return true;
                }
                if (!(o instanceof a)) {
                    return false;
                }
                final a a = (a)o;
                return sg2.e.a((Object)this.a, (Object)a.a) && this.b == a.b && this.c == a.c && sg2.e.a((Object)this.d, (Object)a.d);
            }
            
            @Override
            public final int hashCode() {
                final T a = this.a;
                int hashCode;
                if (a == null) {
                    hashCode = 0;
                }
                else {
                    hashCode = a.hashCode();
                }
                return this.d.hashCode() + a.c(this.c, a.c(this.b, hashCode * 31, 31), 31);
            }
            
            @Override
            public final String toString() {
                final StringBuilder r = a.r("MutableRange(item=");
                r.append(this.a);
                r.append(", start=");
                r.append(this.b);
                r.append(", end=");
                r.append(this.c);
                r.append(", tag=");
                return f0.n(r, this.d, ')');
            }
        }
    }
    
    public static final class b<T>
    {
        public final T a;
        public final int b;
        public final int c;
        public final String d;
        
        public b(final T t, final int n, final int n2) {
            this(t, "", n, n2);
        }
        
        public b(final Object a, final String d, int b, final int c) {
            e.f((Object)d, "tag");
            this.a = (T)a;
            this.b = b;
            this.c = c;
            this.d = d;
            if (b <= c) {
                b = 1;
            }
            else {
                b = 0;
            }
            if (b != 0) {
                return;
            }
            throw new IllegalArgumentException("Reversed range is not supported".toString());
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return e.a((Object)this.a, (Object)b.a) && this.b == b.b && this.c == b.c && e.a((Object)this.d, (Object)b.d);
        }
        
        @Override
        public final int hashCode() {
            final T a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return this.d.hashCode() + a.c(this.c, a.c(this.b, hashCode * 31, 31), 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("Range(item=");
            r.append(this.a);
            r.append(", start=");
            r.append(this.b);
            r.append(", end=");
            r.append(this.c);
            r.append(", tag=");
            return f0.n(r, this.d, ')');
        }
    }
}
