// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class s5
{
    public static final r5 a;
    public static final q5 b;
    
    static {
        a = new r5();
        q5 b2;
        try {
            b2 = (q5)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final Exception ex) {
            b2 = null;
        }
        b = b2;
    }
}
