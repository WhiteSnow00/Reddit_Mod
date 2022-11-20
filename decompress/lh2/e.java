// 
// Decompiled by Procyon v0.6.0
// 

package lh2;

import oi2.t;
import java.util.ArrayList;
import ch2.j0;
import ch2.m0;
import java.util.List;

public interface e
{
    public static final e$a a = new e$a();
    
    public static final class b
    {
        public final List<m0> a;
        public final List<j0> b;
        public final List<String> c;
        
        public b(final List a, final ArrayList b, final List c, final t t) {
            if (a == null) {
                a(1);
                throw null;
            }
            if (c != null) {
                this.a = a;
                this.b = b;
                this.c = c;
                return;
            }
            a(3);
            throw null;
        }
        
        public static void a(final int n) {
            String s;
            if (n != 4 && n != 5 && n != 6 && n != 7) {
                s = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            else {
                s = "@NotNull method %s.%s must not return null";
            }
            int n2;
            if (n != 4 && n != 5 && n != 6 && n != 7) {
                n2 = 3;
            }
            else {
                n2 = 2;
            }
            final Object[] array = new Object[n2];
            switch (n) {
                default: {
                    array[0] = "returnType";
                    break;
                }
                case 4:
                case 5:
                case 6:
                case 7: {
                    array[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                }
                case 3: {
                    array[0] = "signatureErrors";
                    break;
                }
                case 2: {
                    array[0] = "typeParameters";
                    break;
                }
                case 1: {
                    array[0] = "valueParameters";
                    break;
                }
            }
            if (n != 4) {
                if (n != 5) {
                    if (n != 6) {
                        if (n != 7) {
                            array[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                        }
                        else {
                            array[1] = "getErrors";
                        }
                    }
                    else {
                        array[1] = "getTypeParameters";
                    }
                }
                else {
                    array[1] = "getValueParameters";
                }
            }
            else {
                array[1] = "getReturnType";
            }
            if (n != 4 && n != 5 && n != 6 && n != 7) {
                array[2] = "<init>";
            }
            final String format = String.format(s, array);
            RuntimeException ex;
            if (n != 4 && n != 5 && n != 6 && n != 7) {
                ex = new IllegalArgumentException(format);
            }
            else {
                ex = new IllegalStateException(format);
            }
            throw ex;
        }
    }
}
