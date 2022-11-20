// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.datatransport.cct.internal;

import ja.a;

public final class b extends ClientInfo
{
    public final ClientInfo$ClientType a;
    public final ja.a b;
    
    public b(final ClientInfo$ClientType a, final ja.a b) {
        this.a = a;
        this.b = b;
    }
    
    public final ja.a a() {
        return this.b;
    }
    
    public final ClientInfo$ClientType b() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof ClientInfo) {
            final ClientInfo clientInfo = (ClientInfo)o;
            final ClientInfo$ClientType a = this.a;
            if (a == null) {
                if (clientInfo.b() != null) {
                    return false;
                }
            }
            else if (!a.equals(clientInfo.b())) {
                return false;
            }
            final ja.a b2 = this.b;
            if (b2 == null) {
                if (clientInfo.a() == null) {
                    return b;
                }
            }
            else if (b2.equals(clientInfo.a())) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final ClientInfo$ClientType a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final ja.a b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return (hashCode2 ^ 0xF4243) * 1000003 ^ hashCode;
    }
    
    public final String toString() {
        final StringBuilder t = a.t("ClientInfo{clientType=");
        t.append(this.a);
        t.append(", androidClientInfo=");
        t.append(this.b);
        t.append("}");
        return t.toString();
    }
    
    public static final class a extends ClientInfo$a
    {
        public ClientInfo$ClientType a;
    }
}
