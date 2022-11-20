// 
// Decompiled by Procyon v0.6.0
// 

package kh2;

import ch2.v;
import ai2.d;
import gh2.b;
import gh2.c;
import ch2.g;
import ch2.k;
import kotlin.reflect.jvm.internal.impl.descriptors.c$b;
import ch2.o0;
import gh2.a;
import java.util.HashMap;

public final class l
{
    public static final l$a a;
    public static final l$b b;
    public static final l$c c;
    public static final HashMap d;
    
    static {
        final ch2.l l = a = new ch2.l(gh2.a.a) {
            public static void e(final int n) {
                final Object[] array = new Object[3];
                if (n != 1) {
                    array[0] = "what";
                }
                else {
                    array[0] = "from";
                }
                array[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
                array[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", array));
            }
            
            public final boolean c(final c$b c$b, final k k, final g g) {
                if (g != null) {
                    return l.c((g)k, g);
                }
                e(1);
                throw null;
            }
        };
        final ch2.l i = b = new ch2.l(gh2.c.a) {
            public static void e(final int n) {
                final Object[] array = new Object[3];
                if (n != 1) {
                    array[0] = "what";
                }
                else {
                    array[0] = "from";
                }
                array[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
                array[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", array));
            }
            
            public final boolean c(final c$b c$b, final k k, final g g) {
                if (g != null) {
                    return l.b(c$b, k, g);
                }
                e(1);
                throw null;
            }
        };
        final ch2.l j = c = new ch2.l(gh2.b.a) {
            public static void e(final int n) {
                final Object[] array = new Object[3];
                if (n != 1) {
                    array[0] = "what";
                }
                else {
                    array[0] = "from";
                }
                array[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
                array[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", array));
            }
            
            public final boolean c(final c$b c$b, final k k, final g g) {
                if (g != null) {
                    return l.b(c$b, k, g);
                }
                e(1);
                throw null;
            }
        };
        final HashMap d2 = new HashMap();
        (d = d2).put(l.a, l);
        d2.put(i.a, i);
        d2.put(j.a, j);
    }
    
    public static void a(final int n) {
        String s;
        if (n != 5 && n != 6) {
            s = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            s = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 5 && n != 6) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] array = new Object[n2];
        switch (n) {
            default: {
                array[0] = "what";
                break;
            }
            case 5:
            case 6: {
                array[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            }
            case 4: {
                array[0] = "visibility";
                break;
            }
            case 3: {
                array[0] = "second";
                break;
            }
            case 2: {
                array[0] = "first";
                break;
            }
            case 1: {
                array[0] = "from";
                break;
            }
        }
        if (n != 5 && n != 6) {
            array[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        else {
            array[1] = "toDescriptorVisibility";
        }
        if (n != 2 && n != 3) {
            if (n != 4) {
                if (n != 5 && n != 6) {
                    array[2] = "isVisibleForProtectedAndPackage";
                }
            }
            else {
                array[2] = "toDescriptorVisibility";
            }
        }
        else {
            array[2] = "areInSamePackage";
        }
        final String format = String.format(s, array);
        RuntimeException ex;
        if (n != 5 && n != 6) {
            ex = new IllegalArgumentException(format);
        }
        else {
            ex = new IllegalStateException(format);
        }
        throw ex;
    }
    
    public static boolean b(final c$b c$b, final k k, final g g) {
        boolean c = true;
        if (g != null) {
            if (!c((g)ai2.d.v(k), g)) {
                c = kotlin.reflect.jvm.internal.impl.descriptors.c.c.c(c$b, k, g);
            }
            return c;
        }
        a(1);
        throw null;
    }
    
    public static boolean c(final g g, final g g2) {
        if (g == null) {
            a(2);
            throw null;
        }
        if (g2 != null) {
            final boolean b = false;
            final v v = (v)ai2.d.i(g, (Class)v.class, false);
            final v v2 = (v)ai2.d.i(g2, (Class)v.class, false);
            boolean b2 = b;
            if (v2 != null) {
                b2 = b;
                if (v != null) {
                    b2 = b;
                    if (v.d().equals((Object)v2.d())) {
                        b2 = true;
                    }
                }
            }
            return b2;
        }
        a(3);
        throw null;
    }
}
