// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.name;

import cj2.j;
import sg2.e;
import di2.c;

public final class a
{
    public static final boolean a(final String s) {
        State state = State.BEGINNING;
        boolean b = false;
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            final int n = a.a[state.ordinal()];
            if (n != 1 && n != 2) {
                if (n == 3) {
                    if (char1 == '.') {
                        state = State.AFTER_DOT;
                    }
                    else if (!Character.isJavaIdentifierPart(char1)) {
                        return false;
                    }
                }
            }
            else {
                if (!Character.isJavaIdentifierPart(char1)) {
                    return false;
                }
                state = State.MIDDLE;
            }
        }
        if (state != State.AFTER_DOT) {
            b = true;
        }
        return b;
    }
    
    public static final c b(final c c, final c c2) {
        e.f((Object)c, "<this>");
        e.f((Object)c2, "prefix");
        int n = 0;
        Label_0091: {
            if (!e.a((Object)c, (Object)c2)) {
                if (!c2.d()) {
                    final String b = c.b();
                    e.e((Object)b, "this.asString()");
                    final String b2 = c2.b();
                    e.e((Object)b2, "packageName.asString()");
                    n = 0;
                    if (!j.O0(b, b2, false)) {
                        break Label_0091;
                    }
                    n = n;
                    if (b.charAt(b2.length()) != '.') {
                        break Label_0091;
                    }
                }
            }
            n = 1;
        }
        c c3 = c;
        if (n != 0) {
            if (c2.d()) {
                c3 = c;
            }
            else if (e.a((Object)c, (Object)c2)) {
                c3 = c.c;
                e.e((Object)c3, "ROOT");
            }
            else {
                final String b3 = c.b();
                e.e((Object)b3, "asString()");
                final String substring = b3.substring(c2.b().length() + 1);
                e.e((Object)substring, "this as java.lang.String).substring(startIndex)");
                c3 = new c(substring);
            }
        }
        return c3;
    }
}
