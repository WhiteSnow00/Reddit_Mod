// 
// Decompiled by Procyon v0.6.0
// 

package gk2;

import cg.d;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import fk2.c;
import ng2.e;
import fk2.y;
import okio.ByteString$a;
import okio.ByteString;

public final class f
{
    public static final ByteString a;
    public static final ByteString b;
    public static final ByteString c;
    public static final ByteString d;
    public static final ByteString e;
    
    static {
        ByteString.Companion.getClass();
        a = ByteString$a.c("/");
        b = ByteString$a.c("\\");
        c = ByteString$a.c("/\\");
        d = ByteString$a.c(".");
        e = ByteString$a.c("..");
    }
    
    public static final int a(final y y) {
        final int size = y.f.size();
        final int n = -1;
        int n2;
        if (size == 0) {
            n2 = n;
        }
        else {
            final ByteString f = y.f;
            final boolean b = false;
            if (f.getByte(0) != (byte)47) {
                final byte byte1 = y.f.getByte(0);
                final byte b2 = 92;
                if (byte1 == b2) {
                    if (y.f.size() > 2 && y.f.getByte(1) == b2) {
                        n2 = y.f.indexOf(gk2.f.b, 2);
                        if (n2 == -1) {
                            n2 = y.f.size();
                            return n2;
                        }
                        return n2;
                    }
                }
                else {
                    n2 = n;
                    if (y.f.size() <= 2) {
                        return n2;
                    }
                    n2 = n;
                    if (y.f.getByte(1) != (byte)58) {
                        return n2;
                    }
                    n2 = n;
                    if (y.f.getByte(2) == b2) {
                        final char c = (char)y.f.getByte(0);
                        if ('a' > c || c > 'z') {
                            int n3 = b ? 1 : 0;
                            if ('A' <= c) {
                                n3 = (b ? 1 : 0);
                                if (c <= 'Z') {
                                    n3 = 1;
                                }
                            }
                            if (n3 == 0) {
                                n2 = n;
                                return n2;
                            }
                        }
                        n2 = 3;
                        return n2;
                    }
                    return n2;
                }
            }
            n2 = 1;
        }
        return n2;
    }
    
    public static final y b(final y y, final y y2, final boolean b) {
        ng2.e.f((Object)y, "<this>");
        ng2.e.f((Object)y2, "child");
        if (a(y2) == -1 && y2.i() == null) {
            ByteString byteString;
            if ((byteString = c(y)) == null && (byteString = c(y2)) == null) {
                byteString = f(y.g);
            }
            final c c = new c();
            c.R(y.f);
            if (c.g > 0L) {
                c.R(byteString);
            }
            c.R(y2.f);
            return d(c, b);
        }
        return y2;
    }
    
    public static final ByteString c(final y y) {
        final ByteString f = y.f;
        final ByteString a = gk2.f.a;
        ByteString b;
        if (ByteString.indexOf$default(f, a, 0, 2, (Object)null) != -1) {
            b = a;
        }
        else {
            final ByteString f2 = y.f;
            b = gk2.f.b;
            if (ByteString.indexOf$default(f2, b, 0, 2, (Object)null) == -1) {
                b = null;
            }
        }
        return b;
    }
    
    public static final y d(final c c, final boolean b) {
        final c c2 = new c();
        final int n = 0;
        ByteString byteString = null;
        int n2 = 0;
        ByteString b2;
        while (true) {
            if (!c.o1(0L, f.a)) {
                b2 = f.b;
                if (!c.o1(0L, b2)) {
                    break;
                }
            }
            final byte byte1 = c.readByte();
            ByteString e;
            if ((e = byteString) == null) {
                e = e(byte1);
            }
            ++n2;
            byteString = e;
        }
        final boolean b3 = n2 >= 2 && ng2.e.a((Object)byteString, (Object)b2);
        if (b3) {
            ng2.e.c((Object)byteString);
            c2.R(byteString);
            c2.R(byteString);
        }
        else if (n2 > 0) {
            ng2.e.c((Object)byteString);
            c2.R(byteString);
        }
        else {
            final long k1 = c.k1(f.c);
            ByteString byteString2;
            if ((byteString2 = byteString) == null) {
                if (k1 == -1L) {
                    byteString2 = f(y.g);
                }
                else {
                    byteString2 = e(c.s(k1));
                }
            }
            boolean b4 = false;
            Label_0282: {
                if (ng2.e.a((Object)byteString2, (Object)b2)) {
                    if (c.g >= 2L) {
                        if (c.s(1L) == (byte)58) {
                            final char c3 = (char)c.s(0L);
                            if (('a' <= c3 && c3 <= 'z') || ('A' <= c3 && c3 <= 'Z')) {
                                b4 = true;
                                break Label_0282;
                            }
                        }
                    }
                }
                b4 = false;
            }
            byteString = byteString2;
            if (b4) {
                if (k1 == 2L) {
                    c2.write(c, 3L);
                    byteString = byteString2;
                }
                else {
                    c2.write(c, 2L);
                    byteString = byteString2;
                }
            }
        }
        final boolean b5 = c2.g > 0L;
        final ArrayList list = new ArrayList();
        while (!c.e1()) {
            final long k2 = c.k1(f.c);
            ByteString byteString3;
            if (k2 == -1L) {
                byteString3 = c.D1();
            }
            else {
                byteString3 = c.U0(k2);
                c.readByte();
            }
            final ByteString e2 = f.e;
            if (ng2.e.a((Object)byteString3, (Object)e2)) {
                if (b5 && list.isEmpty()) {
                    continue;
                }
                Label_0509: {
                    if (b) {
                        if (!b5) {
                            if (list.isEmpty()) {
                                break Label_0509;
                            }
                            if (ng2.e.a(CollectionsKt___CollectionsKt.c5((List)list), (Object)e2)) {
                                break Label_0509;
                            }
                        }
                        if (b3 && list.size() == 1) {
                            continue;
                        }
                        if (list.isEmpty()) {
                            continue;
                        }
                        list.remove(cg.d.R2((List)list));
                        continue;
                    }
                }
                list.add(byteString3);
            }
            else {
                if (ng2.e.a((Object)byteString3, (Object)f.d) || ng2.e.a((Object)byteString3, (Object)ByteString.EMPTY)) {
                    continue;
                }
                list.add(byteString3);
            }
        }
        final int size = list.size();
        if (size > 0) {
            int n3 = n;
            while (true) {
                final int n4 = n3 + 1;
                if (n3 > 0) {
                    c2.R(byteString);
                }
                c2.R((ByteString)list.get(n3));
                if (n4 >= size) {
                    break;
                }
                n3 = n4;
            }
        }
        if (c2.g == 0L) {
            c2.R(f.d);
        }
        return new y(c2.D1());
    }
    
    public static final ByteString e(final byte b) {
        ByteString byteString;
        if (b == 47) {
            byteString = f.a;
        }
        else {
            if (b != 92) {
                throw new IllegalArgumentException(ng2.e.l((Object)b, "not a directory separator: "));
            }
            byteString = f.b;
        }
        return byteString;
    }
    
    public static final ByteString f(final String s) {
        ByteString byteString;
        if (ng2.e.a((Object)s, (Object)"/")) {
            byteString = f.a;
        }
        else {
            if (!ng2.e.a((Object)s, (Object)"\\")) {
                throw new IllegalArgumentException(ng2.e.l((Object)s, "not a directory separator: "));
            }
            byteString = f.b;
        }
        return byteString;
    }
}
