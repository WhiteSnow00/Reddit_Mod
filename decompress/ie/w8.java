// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class w8 implements v8
{
    public static final u4 a;
    public static final u4 b;
    
    static {
        final x4 a2 = new x4(r4.a(), false, false).b().a();
        a2.e("measurement.collection.event_safelist", true);
        a = a2.e("measurement.service.store_null_safelist", true);
        b = a2.e("measurement.service.store_safelist", true);
    }
    
    public final boolean r() {
        return (boolean)w8.a.b();
    }
    
    public final boolean s() {
        return (boolean)w8.b.b();
    }
    
    public final void zza() {
    }
}
