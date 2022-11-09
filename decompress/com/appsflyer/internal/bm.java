// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import com.bytedance.covode.number.Covode;

public final class bm<Body>
{
    public final int AFInAppEventParameterName;
    public final boolean AFInAppEventType;
    public final Body AFKeystoreWrapper;
    
    static {
        Covode.recordClassIndex(2645);
    }
    
    public bm(final Body afKeystoreWrapper, final int afInAppEventParameterName, final boolean afInAppEventType) {
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.AFInAppEventParameterName = afInAppEventParameterName;
        this.AFInAppEventType = afInAppEventType;
    }
    
    @Override
    public final boolean equals(Object afKeystoreWrapper) {
        if (this == afKeystoreWrapper) {
            return true;
        }
        if (afKeystoreWrapper != null && this.getClass() == afKeystoreWrapper.getClass()) {
            final bm bm = (bm)afKeystoreWrapper;
            if (this.AFInAppEventParameterName != bm.AFInAppEventParameterName) {
                return false;
            }
            if (this.AFInAppEventType != bm.AFInAppEventType) {
                return false;
            }
            afKeystoreWrapper = this.AFKeystoreWrapper;
            final Body afKeystoreWrapper2 = bm.AFKeystoreWrapper;
            if (afKeystoreWrapper != null) {
                return afKeystoreWrapper.equals(afKeystoreWrapper2);
            }
            if (afKeystoreWrapper2 == null) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Body afKeystoreWrapper = this.AFKeystoreWrapper;
        int hashCode;
        if (afKeystoreWrapper != null) {
            hashCode = afKeystoreWrapper.hashCode();
        }
        else {
            hashCode = 0;
        }
        return (hashCode * 31 + this.AFInAppEventParameterName) * 31 + (this.AFInAppEventType ? 1 : 0);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Response{body=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(", statusCode=");
        sb.append(this.AFInAppEventParameterName);
        sb.append(", isSuccessful=");
        sb.append(this.AFInAppEventType);
        sb.append('}');
        return sb.toString();
    }
    
    public final boolean valueOf() {
        return this.AFInAppEventType;
    }
}
