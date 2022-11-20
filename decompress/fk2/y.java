// 
// Decompiled by Procyon v0.6.0
// 

package fk2;

import java.nio.file.Paths;
import java.nio.file.Path;
import gk2.f;
import java.util.ArrayList;
import ng2.e;
import java.io.File;
import okio.ByteString;

public final class y implements Comparable<y>
{
    public static final String g;
    public final ByteString f;
    
    static {
        new a();
        final String separator = File.separator;
        e.e((Object)separator, "separator");
        g = separator;
    }
    
    public y(final ByteString f) {
        e.f((Object)f, "bytes");
        this.f = f;
    }
    
    public final ArrayList a() {
        final ArrayList list = new ArrayList();
        final int a = gk2.f.a(this);
        int n;
        if (a == -1) {
            n = 0;
        }
        else if ((n = a) < this.f.size()) {
            n = a;
            if (this.f.getByte(a) == (byte)92) {
                n = a + 1;
            }
        }
        final int size = this.f.size();
        int n2;
        if ((n2 = n) < size) {
            int n3 = n;
            int n4 = n;
            int n6 = 0;
            while (true) {
                final int n5 = n4 + 1;
                Label_0134: {
                    if (this.f.getByte(n4) != (byte)47) {
                        n6 = n3;
                        if (this.f.getByte(n4) != (byte)92) {
                            break Label_0134;
                        }
                    }
                    list.add(this.f.substring(n3, n4));
                    n6 = n5;
                }
                if (n5 >= size) {
                    break;
                }
                n4 = n5;
                n3 = n6;
            }
            n2 = n6;
        }
        if (n2 < this.f.size()) {
            final ByteString f = this.f;
            list.add(f.substring(n2, f.size()));
        }
        return list;
    }
    
    public final y c() {
        final ByteString f = this.f;
        final ByteString d = gk2.f.d;
        final boolean a = e.a((Object)f, (Object)d);
        y y2;
        final y y = y2 = null;
        if (!a) {
            final ByteString f2 = this.f;
            final ByteString a2 = gk2.f.a;
            y2 = y;
            if (!e.a((Object)f2, (Object)a2)) {
                final ByteString f3 = this.f;
                final ByteString b = gk2.f.b;
                y2 = y;
                if (!e.a((Object)f3, (Object)b)) {
                    boolean b2 = false;
                    Label_0156: {
                        Label_0154: {
                            if (this.f.endsWith(gk2.f.e)) {
                                if (this.f.size() != 2) {
                                    final ByteString f4 = this.f;
                                    if (!f4.rangeEquals(f4.size() - 3, a2, 0, 1)) {
                                        final ByteString f5 = this.f;
                                        if (!f5.rangeEquals(f5.size() - 3, b, 0, 1)) {
                                            break Label_0154;
                                        }
                                    }
                                }
                                b2 = true;
                                break Label_0156;
                            }
                        }
                        b2 = false;
                    }
                    if (b2) {
                        y2 = y;
                    }
                    else {
                        int n = ByteString.lastIndexOf$default(this.f, a2, 0, 2, (Object)null);
                        if (n == -1) {
                            n = ByteString.lastIndexOf$default(this.f, b, 0, 2, (Object)null);
                        }
                        if (n == 2 && this.i() != null) {
                            if (this.f.size() == 3) {
                                y2 = y;
                            }
                            else {
                                y2 = new y(ByteString.substring$default(this.f, 0, 3, 1, (Object)null));
                            }
                        }
                        else if (n == 1 && this.f.startsWith(b)) {
                            y2 = y;
                        }
                        else if (n == -1 && this.i() != null) {
                            if (this.f.size() == 2) {
                                y2 = y;
                            }
                            else {
                                y2 = new y(ByteString.substring$default(this.f, 0, 2, 1, (Object)null));
                            }
                        }
                        else if (n == -1) {
                            y2 = new y(d);
                        }
                        else if (n == 0) {
                            y2 = new y(ByteString.substring$default(this.f, 0, 1, 1, (Object)null));
                        }
                        else {
                            y2 = new y(ByteString.substring$default(this.f, 0, n, 1, (Object)null));
                        }
                    }
                }
            }
        }
        return y2;
    }
    
    @Override
    public final int compareTo(final Object o) {
        final y y = (y)o;
        e.f((Object)y, "other");
        return this.f.compareTo(y.f);
    }
    
    public final y d(final String s) {
        e.f((Object)s, "child");
        final c c = new c();
        c.a0(s);
        return gk2.f.b(this, gk2.f.d(c, false), false);
    }
    
    public final Path e() {
        final Path value = Paths.get(this.toString(), new String[0]);
        e.e((Object)value, "get(toString())");
        return value;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof y && e.a((Object)((y)o).f, (Object)this.f);
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode();
    }
    
    public final Character i() {
        final ByteString f = this.f;
        final ByteString a = gk2.f.a;
        final boolean b = false;
        Character value = null;
        if (ByteString.indexOf$default(f, a, 0, 2, (Object)null) == -1) {
            if (this.f.size() >= 2) {
                if (this.f.getByte(1) == (byte)58) {
                    final char c = (char)this.f.getByte(0);
                    if ('a' > c || c > 'z') {
                        int n = b ? 1 : 0;
                        if ('A' <= c) {
                            n = (b ? 1 : 0);
                            if (c <= 'Z') {
                                n = 1;
                            }
                        }
                        if (n == 0) {
                            return value;
                        }
                    }
                    value = c;
                }
            }
        }
        return value;
    }
    
    public final File toFile() {
        return new File(this.toString());
    }
    
    @Override
    public final String toString() {
        return this.f.utf8();
    }
    
    public static final class a
    {
        public static y a(final String s, final boolean b) {
            e.f((Object)s, "<this>");
            final ByteString a = f.a;
            final c c = new c();
            c.a0(s);
            return f.d(c, b);
        }
        
        public static y b(final File file) {
            final String g = y.g;
            e.f((Object)file, "<this>");
            final String string = file.toString();
            e.e((Object)string, "toString()");
            return a(string, false);
        }
    }
}
