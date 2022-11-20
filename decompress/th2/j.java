// 
// Decompiled by Procyon v0.6.0
// 

package th2;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p1.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.b;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import ng2.e;

public final class j
{
    public static final j a;
    
    static {
        a = new j();
    }
    
    public static i b(String s) {
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
                        return (i)new i$c(jvmPrimitiveType);
                    }
                    Object o;
                    if (char1 == 'V') {
                        o = new i$c((JvmPrimitiveType)null);
                    }
                    else if (char1 == '[') {
                        s = s.substring(1);
                        e.e((Object)s, "this as java.lang.String).substring(startIndex)");
                        o = new i$a(b(s));
                    }
                    else {
                        if (char1 == 'L') {
                            b.L0((CharSequence)s, ';');
                        }
                        s = s.substring(1, s.length() - 1);
                        e.e((Object)s, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                        o = new i$b(s);
                    }
                    return (i)o;
                }
                else {
                    ++i;
                }
            }
            final JvmPrimitiveType jvmPrimitiveType = null;
            continue;
        }
    }
    
    public static String g(final i i) {
        e.f((Object)i, "type");
        String s;
        if (i instanceof i$a) {
            final StringBuilder o = d.o('[');
            o.append(g(((i$a)i).i));
            s = o.toString();
        }
        else if (i instanceof i$c) {
            final JvmPrimitiveType j = ((i$c)i).i;
            if (j == null || (s = j.getDesc()) == null) {
                s = "V";
            }
        }
        else {
            if (!(i instanceof i$b)) {
                throw new NoWhenBranchMatchedException();
            }
            s = h.c(d.o('L'), ((i$b)i).i, ';');
        }
        return s;
    }
    
    public final i a(final Object o) {
        final i i = (i)o;
        e.f((Object)i, "possiblyPrimitiveType");
        Object o2 = i;
        if (i instanceof i$c) {
            final JvmPrimitiveType j = ((i$c)i).i;
            o2 = i;
            if (j != null) {
                final String e = fi2.b.c(j.getWrapperFqName()).e();
                ng2.e.e((Object)e, "byFqNameWithoutInnerClas\u2026apperFqName).internalName");
                o2 = new i$b(e);
            }
        }
        return (i)o2;
    }
    
    public final i$b c(final String s) {
        e.f((Object)s, "internalName");
        return new i$b(s);
    }
    
    public final i$c d(final PrimitiveType primitiveType) {
        i.i$c i$c = null;
        switch (j.a.a[((Enum)primitiveType).ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 8: {
                i$c = i.h;
                break;
            }
            case 7: {
                i$c = i.g;
                break;
            }
            case 6: {
                i$c = i.f;
                break;
            }
            case 5: {
                i$c = i.e;
                break;
            }
            case 4: {
                i$c = i.d;
                break;
            }
            case 3: {
                i$c = i.c;
                break;
            }
            case 2: {
                i$c = i.b;
                break;
            }
            case 1: {
                i$c = i.a;
                break;
            }
        }
        return i$c;
    }
    
    public final i$b e() {
        return new i$b("java/lang/Class");
    }
    
    public final /* bridge */ String f(final Object o) {
        return g((i)o);
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[PrimitiveType.values().length];
            a2[((Enum)PrimitiveType.BOOLEAN).ordinal()] = 1;
            a2[((Enum)PrimitiveType.CHAR).ordinal()] = 2;
            a2[((Enum)PrimitiveType.BYTE).ordinal()] = 3;
            a2[((Enum)PrimitiveType.SHORT).ordinal()] = 4;
            a2[((Enum)PrimitiveType.INT).ordinal()] = 5;
            a2[((Enum)PrimitiveType.FLOAT).ordinal()] = 6;
            a2[((Enum)PrimitiveType.LONG).ordinal()] = 7;
            a2[((Enum)PrimitiveType.DOUBLE).ordinal()] = 8;
            a = a2;
        }
    }
}
