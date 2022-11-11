// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public final class s8 implements r8
{
    public static final t4 a;
    
    static {
        final x4 a2 = new x4(r4.a(), false, false).a();
        a2.e("measurement.client.consent_state_v1", true);
        a2.e("measurement.client.3p_consent_state_v1", true);
        a2.e("measurement.service.consent_state_v1_W36", true);
        a = a2.c(203600L, "measurement.service.storage_consent_support_version");
    }
    
    public final long zza() {
        return (long)s8.a.b();
    }
}
