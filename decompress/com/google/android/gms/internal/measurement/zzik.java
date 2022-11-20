// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import je.z4;
import java.io.Serializable;

final class zzik implements Serializable, z4
{
    public final Object zza;
    
    public zzik(final Object zza) {
        this.zza = zza;
    }
    
    @Override
    public final boolean equals(Object zza) {
        if (zza instanceof zzik) {
            final zzik zzik = (zzik)zza;
            zza = this.zza;
            final Object zza2 = zzik.zza;
            return zza == zza2 || zza.equals(zza2);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.zza });
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("Suppliers.ofInstance(");
        t.append(this.zza);
        t.append(")");
        return t.toString();
    }
    
    public final Object zza() {
        return this.zza;
    }
}
