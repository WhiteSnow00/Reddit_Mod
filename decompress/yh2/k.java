// 
// Decompiled by Procyon v0.6.0
// 

package yh2;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import al0.f0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.b;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import sg2.e;

public final class k
{
    public static final k a;
    
    static {
        a = new k();
    }
    
    public static j b(String s) {
        e.f((Object)s, "representation");
        final char char1 = s.charAt(0);
        final JvmPrimitiveType[] values = JvmPrimitiveType.values();
        final int length = values.length;
        int i = 0;
        while (true) {
            while (i < length) {
                final JvmPrimitiveType jvmPrimitiveType = values[i];
                if (jvmPrimitiveType.getDesc().charAt(0) == char1) {
                    if (jvmPrimitiveType != null) {
                        return (j)new j$c(jvmPrimitiveType);
                    }
                    Object o;
                    if (char1 == 'V') {
                        o = new j$c((JvmPrimitiveType)null);
                    }
                    else if (char1 == '[') {
                        s = s.substring(1);
                        e.e((Object)s, "this as java.lang.String).substring(startIndex)");
                        o = new j$a(b(s));
                    }
                    else {
                        if (char1 == 'L') {
                            b.R0((CharSequence)s, ';');
                        }
                        s = s.substring(1, s.length() - 1);
                        e.e((Object)s, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                        o = new j$b(s);
                    }
                    return (j)o;
                }
                else {
                    ++i;
                }
            }
            final JvmPrimitiveType jvmPrimitiveType = null;
            continue;
        }
    }
    
    public static String g(final j j) {
        e.f((Object)j, "type");
        String s;
        if (j instanceof j$a) {
            final StringBuilder p = d.p('[');
            p.append(g(((j$a)j).i));
            s = p.toString();
        }
        else if (j instanceof j$c) {
            final JvmPrimitiveType i = ((j$c)j).i;
            if (i == null || (s = i.getDesc()) == null) {
                s = "V";
            }
        }
        else {
            if (!(j instanceof j$b)) {
                throw new NoWhenBranchMatchedException();
            }
            s = f0.n(d.p('L'), ((j$b)j).i, ';');
        }
        return s;
    }
    
    public final j a(final Object o) {
        final j j = (j)o;
        e.f((Object)j, "possiblyPrimitiveType");
        Object o2 = j;
        if (j instanceof j$c) {
            final JvmPrimitiveType i = ((j$c)j).i;
            o2 = j;
            if (i != null) {
                final String e = ki2.b.c(i.getWrapperFqName()).e();
                sg2.e.e((Object)e, "byFqNameWithoutInnerClas\u2026apperFqName).internalName");
                o2 = new j$b(e);
            }
        }
        return (j)o2;
    }
    
    public final j$b c(final String s) {
        e.f((Object)s, "internalName");
        return new j$b(s);
    }
    
    public final j$c d(final PrimitiveType primitiveType) {
        j.j$c j$c = null;
        switch (k.a.a[((Enum)primitiveType).ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 8: {
                j$c = j.h;
                break;
            }
            case 7: {
                j$c = j.g;
                break;
            }
            case 6: {
                j$c = j.f;
                break;
            }
            case 5: {
                j$c = j.e;
                break;
            }
            case 4: {
                j$c = j.d;
                break;
            }
            case 3: {
                j$c = j.c;
                break;
            }
            case 2: {
                j$c = j.b;
                break;
            }
            case 1: {
                j$c = j.a;
                break;
            }
        }
        return j$c;
    }
    
    public final j$b e() {
        return new j$b("java/lang/Class");
    }
}
