// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class u8 implements t8
{
    public static final u4 a;
    public static final u4 b;
    public static final u4 c;
    public static final u4 d;
    
    static {
        final x4 a2 = new x4(r4.a(), false, false).b().a();
        a = a2.e("measurement.enhanced_campaign.client", true);
        b = a2.e("measurement.enhanced_campaign.service", true);
        c = a2.e("measurement.enhanced_campaign.srsltid.client", true);
        d = a2.e("measurement.enhanced_campaign.srsltid.service", true);
    }
    
    public final boolean a() {
        return (boolean)u8.c.b();
    }
    
    public final boolean r() {
        return (boolean)u8.a.b();
    }
    
    public final boolean s() {
        return (boolean)u8.b.b();
    }
    
    public final boolean t() {
        return (boolean)u8.d.b();
    }
    
    public final void zza() {
    }
}
