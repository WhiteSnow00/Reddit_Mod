// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.x509;

import hl2.a;
import java.security.cert.CertPath;
import org.bouncycastle.i18n.LocalizedException;

public class CertPathReviewerException extends LocalizedException
{
    private CertPath certPath;
    private int index;
    
    public CertPathReviewerException(final a a) {
        super(a);
        this.index = -1;
        this.certPath = null;
    }
    
    public CertPathReviewerException(final a a, final Throwable t) {
        super(a, t);
        this.index = -1;
        this.certPath = null;
    }
    
    public CertPathReviewerException(final a a, final Throwable t, final CertPath certPath, final int index) {
        super(a, t);
        this.index = -1;
        this.certPath = null;
        if (certPath == null || index == -1) {
            throw new IllegalArgumentException();
        }
        if (index >= -1 && index < certPath.getCertificates().size()) {
            this.certPath = certPath;
            this.index = index;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
    
    public CertPathReviewerException(final a a, final CertPath certPath, final int index) {
        super(a);
        this.index = -1;
        this.certPath = null;
        if (certPath == null || index == -1) {
            throw new IllegalArgumentException();
        }
        if (index >= -1 && index < certPath.getCertificates().size()) {
            this.certPath = certPath;
            this.index = index;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
    
    public CertPath getCertPath() {
        return this.certPath;
    }
    
    public int getIndex() {
        return this.index;
    }
}
