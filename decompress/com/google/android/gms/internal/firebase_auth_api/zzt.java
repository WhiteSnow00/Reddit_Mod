// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.ab;
import ge.v9;
import java.util.regex.Pattern;
import java.io.Serializable;
import ge.ha;

final class zzt extends ha implements Serializable
{
    private final Pattern zza;
    
    public zzt(final Pattern zza) {
        zza.getClass();
        this.zza = zza;
    }
    
    @Override
    public final String toString() {
        return this.zza.toString();
    }
    
    @Override
    public final v9 zza(final CharSequence charSequence) {
        return (v9)new ab(this.zza.matcher(charSequence));
    }
}
