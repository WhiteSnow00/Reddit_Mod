// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class v9 implements u9
{
    public static final u4 a;
    public static final u4 b;
    
    static {
        final x4 a2 = new x4(r4.a(), false, false).b().a();
        a = a2.e("measurement.collection.enable_session_stitching_token.client.dev", false);
        b = a2.e("measurement.collection.enable_session_stitching_token.service", false);
    }
    
    public final boolean r() {
        return (boolean)v9.a.b();
    }
    
    public final boolean s() {
        return (boolean)v9.b.b();
    }
    
    public final void zza() {
    }
}
