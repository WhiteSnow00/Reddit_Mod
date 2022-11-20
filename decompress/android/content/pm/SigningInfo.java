// 
// Decompiled by Procyon v0.6.0
// 

package android.content.pm;

import android.os.Parcelable;

public final class SigningInfo implements Parcelable
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public native Signature[] getApkContentsSigners();
    
    public native Signature[] getSigningCertificateHistory();
    
    public native boolean hasMultipleSigners();
}
