// 
// Decompiled by Procyon v0.6.0
// 

package fi2;

import yh2.c;

public final class b
{
    public final String a;
    
    public b(final String a) {
        if (a != null) {
            this.a = a;
            return;
        }
        a(5);
        throw null;
    }
    
    public static void a(final int n) {
        String s;
        if (n != 3 && n != 6 && n != 7 && n != 8) {
            s = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            s = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 3 && n != 6 && n != 7 && n != 8) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] array = new Object[n2];
        switch (n) {
            default: {
                array[0] = "internalName";
                break;
            }
            case 3:
            case 6:
            case 7:
            case 8: {
                array[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            }
            case 2:
            case 4: {
                array[0] = "fqName";
                break;
            }
            case 1: {
                array[0] = "classId";
                break;
            }
        }
        if (n != 3) {
            if (n != 6) {
                if (n != 7) {
                    if (n != 8) {
                        array[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    }
                    else {
                        array[1] = "getInternalName";
                    }
                }
                else {
                    array[1] = "getPackageFqName";
                }
            }
            else {
                array[1] = "getFqNameForClassNameWithoutDollars";
            }
        }
        else {
            array[1] = "byFqNameWithoutInnerClasses";
        }
        while (true) {
            switch (n) {
                default: {
                    array[2] = "byInternalName";
                }
                case 3:
                case 6:
                case 7:
                case 8: {
                    final String format = String.format(s, array);
                    RuntimeException ex;
                    if (n != 3 && n != 6 && n != 7 && n != 8) {
                        ex = new IllegalArgumentException(format);
                    }
                    else {
                        ex = new IllegalStateException(format);
                    }
                    throw ex;
                }
                case 5: {
                    array[2] = "<init>";
                    continue;
                }
                case 2:
                case 4: {
                    array[2] = "byFqNameWithoutInnerClasses";
                    continue;
                }
                case 1: {
                    array[2] = "byClassId";
                    continue;
                }
            }
            break;
        }
    }
    
    public static b b(final yh2.b b) {
        if (b != null) {
            final c h = b.h();
            final String replace = b.i().b().replace('.', '$');
            b b2;
            if (h.d()) {
                b2 = new b(replace);
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append(h.b().replace('.', '/'));
                sb.append("/");
                sb.append(replace);
                b2 = new b(sb.toString());
            }
            return b2;
        }
        a(1);
        throw null;
    }
    
    public static b c(final c c) {
        if (c != null) {
            return new b(c.b().replace('.', '/'));
        }
        a(2);
        throw null;
    }
    
    public static b d(final String s) {
        if (s != null) {
            return new b(s);
        }
        a(0);
        throw null;
    }
    
    public final String e() {
        final String a = this.a;
        if (a != null) {
            return a;
        }
        a(8);
        throw null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && b.class == o.getClass() && this.a.equals(((b)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
