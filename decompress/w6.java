// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class w6
{
    public static final v6 a;
    public static final v6 b;
    
    static {
        v6 a2;
        try {
            a2 = (v6)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final Exception ex) {
            a2 = null;
        }
        a = a2;
        b = new v6();
    }
}
