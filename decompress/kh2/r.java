// 
// Decompiled by Procyon v0.6.0
// 

package kh2;

import xi2.j;
import ng2.e;
import yh2.b;
import yh2.c;

public final class r
{
    public static final c a;
    public static final b b;
    
    static {
        yh2.b.l(a = new c("kotlin.jvm.JvmField"));
        yh2.b.l(new c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        b = yh2.b.f("kotlin/jvm/internal/RepeatableContainer", false);
    }
    
    public static final String a(String string) {
        e.f((Object)string, "propertyName");
        if (!c(string)) {
            final StringBuilder t = a.t("get");
            t.append(zg.a.h(string));
            string = t.toString();
        }
        return string;
    }
    
    public static final String b(String s) {
        final StringBuilder t = a.t("set");
        if (c(s)) {
            s = s.substring(2);
            e.e((Object)s, "this as java.lang.String).substring(startIndex)");
        }
        else {
            s = zg.a.h(s);
        }
        t.append(s);
        return t.toString();
    }
    
    public static final boolean c(final String s) {
        e.f((Object)s, "name");
        boolean b = false;
        if (!j.I0(s, "is", false)) {
            return false;
        }
        if (s.length() == 2) {
            return false;
        }
        final char char1 = s.charAt(2);
        if (e.h(97, (int)char1) > 0 || e.h((int)char1, 122) > 0) {
            b = true;
        }
        return b;
    }
}
