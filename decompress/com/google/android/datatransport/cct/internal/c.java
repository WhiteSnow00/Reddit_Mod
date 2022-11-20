// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.datatransport.cct.internal;

public final class c extends NetworkConnectionInfo
{
    public final NetworkConnectionInfo$NetworkType a;
    public final NetworkConnectionInfo$MobileSubtype b;
    
    public c(final NetworkConnectionInfo$NetworkType a, final NetworkConnectionInfo$MobileSubtype b) {
        this.a = a;
        this.b = b;
    }
    
    public final NetworkConnectionInfo$MobileSubtype a() {
        return this.b;
    }
    
    public final NetworkConnectionInfo$NetworkType b() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof NetworkConnectionInfo) {
            final NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo)o;
            final NetworkConnectionInfo$NetworkType a = this.a;
            if (a == null) {
                if (networkConnectionInfo.b() != null) {
                    return false;
                }
            }
            else if (!a.equals(networkConnectionInfo.b())) {
                return false;
            }
            final NetworkConnectionInfo$MobileSubtype b2 = this.b;
            if (b2 == null) {
                if (networkConnectionInfo.a() == null) {
                    return b;
                }
            }
            else if (b2.equals(networkConnectionInfo.a())) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final NetworkConnectionInfo$NetworkType a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final NetworkConnectionInfo$MobileSubtype b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return (hashCode2 ^ 0xF4243) * 1000003 ^ hashCode;
    }
    
    public final String toString() {
        final StringBuilder t = a.t("NetworkConnectionInfo{networkType=");
        t.append(this.a);
        t.append(", mobileSubtype=");
        t.append(this.b);
        t.append("}");
        return t.toString();
    }
    
    public static final class a extends NetworkConnectionInfo$a
    {
        public NetworkConnectionInfo$NetworkType a;
    }
}
