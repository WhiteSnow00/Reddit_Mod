// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import ie.c5;
import java.io.Serializable;

final class zzik implements Serializable, c5
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
        final StringBuilder r = a.r("Suppliers.ofInstance(");
        r.append(this.zza);
        r.append(")");
        return r.toString();
    }
    
    @Override
    public final Object zza() {
        return this.zza;
    }
}
