// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.internal;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

final class zzg extends zzh
{
    private final byte[] zza;
    
    public zzg(final X509Certificate x509Certificate, final byte[] zza) {
        super(x509Certificate);
        this.zza = zza;
    }
    
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.zza;
    }
}
