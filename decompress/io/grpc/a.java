// 
// Decompiled by Procyon v0.6.0
// 

package io.grpc;

import pd.r;
import java.util.logging.Level;
import java.util.Locale;
import java.util.BitSet;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.Iterator;
import com.google.common.io.BaseEncoding$a;
import java.nio.charset.Charset;
import java.io.IOException;
import java.math.RoundingMode;
import com.google.common.io.BaseEncoding$d;
import lq0.k;
import rg.b;
import com.google.common.io.BaseEncoding;
import java.util.logging.Logger;

public final class a
{
    public static final Logger c;
    public static final a$a d;
    public static final BaseEncoding e;
    public Object[] a;
    public int b;
    
    static {
        c = Logger.getLogger(a.class.getName());
        d = new a$a();
        Object e2 = BaseEncoding.a;
        if (((BaseEncoding$d)e2).c != null) {
            e2 = ((BaseEncoding$d)e2).c(((BaseEncoding$d)e2).b);
        }
        e = (BaseEncoding)e2;
    }
    
    public final void a(final a$b a$b, final Object o) {
        if (a$b == null) {
            throw new NullPointerException("key");
        }
        if (o != null) {
            final int b = this.b;
            final int n = b * 2;
            Label_0110: {
                if (n != 0) {
                    final Object[] a = this.a;
                    int length;
                    if (a != null) {
                        length = a.length;
                    }
                    else {
                        length = 0;
                    }
                    if (n != length) {
                        break Label_0110;
                    }
                }
                final Object[] a2 = new Object[Math.max(b * 2 * 2, 8)];
                final int b2 = this.b;
                if (b2 != 0) {
                    System.arraycopy(this.a, 0, a2, 0, b2 * 2);
                }
                this.a = a2;
            }
            final int b3 = this.b;
            final byte[] b4 = ((e)a$b).b;
            final Object[] a3 = this.a;
            final int n2 = b3 * 2;
            a3[n2] = b4;
            this.a[n2 + 1] = a$b.b(o);
            ++this.b;
            return;
        }
        throw new NullPointerException("value");
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.b; ++i) {
            if (i != 0) {
                sb.append(',');
            }
            final Object[] a = this.a;
            final int n = i * 2;
            final byte[] array = (byte[])a[n];
            final Charset a2 = rg.b.a;
            final String s = new String(array, a2);
            sb.append(s);
            sb.append('=');
            if (s.endsWith("-bin")) {
                final BaseEncoding e = io.grpc.a.e;
                final Object o = this.a[n + 1];
                byte[] a3;
                if (o instanceof byte[]) {
                    a3 = (byte[])o;
                }
                else {
                    a3 = ((f)o).a();
                }
                e.getClass();
                final int length = a3.length;
                k.r(0, length + 0, a3.length);
                final BaseEncoding$a b = ((BaseEncoding$d)e).b;
                final StringBuilder sb2 = new StringBuilder(tg.b.a(length, b.f, RoundingMode.CEILING) * b.e);
                try {
                    e.a(sb2, a3, length);
                    sb.append(sb2.toString());
                    continue;
                }
                catch (final IOException ex) {
                    throw new AssertionError((Object)ex);
                }
            }
            final Object o2 = this.a[n + 1];
            byte[] a4;
            if (o2 instanceof byte[]) {
                a4 = (byte[])o2;
            }
            else {
                a4 = ((f)o2).a();
            }
            sb.append(new String(a4, a2));
        }
        sb.append(')');
        return sb.toString();
    }
    
    public interface c<T>
    {
        String a(final String p0);
        
        String b(final T p0);
    }
    
    public final class d<T> implements Iterable<T>
    {
        public final e<T> f;
        public int g;
        public final /* synthetic */ a h;
        
        public d(final a$b f, final int g) {
            this.f = (e<T>)f;
            this.g = g;
        }
        
        @Override
        public final Iterator<T> iterator() {
            return new Iterator<T>() {
                public boolean f = true;
                public int g = d.this.g;
                
                @Override
                public final boolean hasNext() {
                    if (this.f) {
                        return true;
                    }
                    while (true) {
                        final int g = this.g;
                        final d h = d.this;
                        final a h2 = h.h;
                        if (g >= h2.b) {
                            return false;
                        }
                        if (Arrays.equals(h.f.b, (byte[])h2.a[g * 2])) {
                            return this.f = true;
                        }
                        ++this.g;
                    }
                }
                
                @Override
                public final T next() {
                    if (this.hasNext()) {
                        this.f = false;
                        final d h = d.this;
                        final a h2 = h.h;
                        final int n = this.g++;
                        final e<T> f = h.f;
                        final Logger c = io.grpc.a.c;
                        final Object o = h2.a[n * 2 + 1];
                        T t;
                        if (o instanceof byte[]) {
                            t = f.a((byte[])o);
                        }
                        else {
                            final f f2 = (f)o;
                            f2.getClass();
                            f.getClass();
                            t = f.a(f2.a());
                        }
                        return t;
                    }
                    throw new NoSuchElementException();
                }
                
                @Override
                public final void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        }
    }
    
    public abstract static class e<T>
    {
        public static final BitSet d;
        public final String a;
        public final byte[] b;
        public final Object c;
        
        static {
            final BitSet d2 = new BitSet(127);
            d2.set(45);
            d2.set(95);
            d2.set(46);
            for (int i = 48; i <= 57; i = (char)(i + 1)) {
                d2.set(i);
            }
            for (int j = 97; j <= 122; j = (char)(j + 1)) {
                d2.set(j);
            }
            d = d2;
        }
        
        public e(String lowerCase, final Object c) {
            if (lowerCase != null) {
                lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                k.p((Object)lowerCase, "name");
                k.k(lowerCase.isEmpty() ^ true, "token must have at least 1 tchar");
                if (lowerCase.equals("connection")) {
                    a.c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", new RuntimeException("exception to show backtrace"));
                }
                for (int i = 0; i < lowerCase.length(); ++i) {
                    final char char1 = lowerCase.charAt(i);
                    if (!e.d.get(char1)) {
                        throw new IllegalArgumentException(r.Z("Invalid character '%s' in key name '%s'", new Object[] { char1, lowerCase }));
                    }
                }
                this.a = lowerCase;
                this.b = lowerCase.getBytes(b.a);
                this.c = c;
                return;
            }
            throw new NullPointerException("name");
        }
        
        public abstract T a(final byte[] p0);
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o != null && this.getClass() == o.getClass() && this.a.equals(((e)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return a.o(a.r("Key{name='"), this.a, "'}");
        }
    }
    
    public static final class f<T>
    {
        public f() {
            throw null;
        }
        
        public final byte[] a() {
            monitorenter(this);
            while (true) {
                try {
                    throw null;
                    monitorexit(this);
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
    
    public interface h<T>
    {
        T a(final byte[] p0);
    }
}
