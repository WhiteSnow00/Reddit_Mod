// 
// Decompiled by Procyon v0.6.0
// 

package ii2;

import oi2.t;

public final class d extends a
{
    public final kotlin.reflect.jvm.internal.impl.descriptors.a c;
    
    public d(final kotlin.reflect.jvm.internal.impl.descriptors.a c, final t t, final f f) {
        if (c == null) {
            b(0);
            throw null;
        }
        if (t != null) {
            super(t, f);
            this.c = c;
            return;
        }
        b(1);
        throw null;
    }
    
    public static void b(final int n) {
        String s;
        if (n != 2) {
            s = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            s = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 2) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] array = new Object[n2];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    array[0] = "callableDescriptor";
                }
                else {
                    array[0] = "newType";
                }
            }
            else {
                array[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
            }
        }
        else {
            array[0] = "receiverType";
        }
        if (n != 2) {
            array[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        }
        else {
            array[1] = "getDeclarationDescriptor";
        }
        if (n != 2) {
            if (n != 3) {
                array[2] = "<init>";
            }
            else {
                array[2] = "replaceType";
            }
        }
        final String format = String.format(s, array);
        RuntimeException ex;
        if (n != 2) {
            ex = new IllegalArgumentException(format);
        }
        else {
            ex = new IllegalStateException(format);
        }
        throw ex;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getType());
        sb.append(": Ext {");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
