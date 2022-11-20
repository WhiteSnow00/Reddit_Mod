// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.datatransport.runtime.backends;

public final class a extends BackendResponse
{
    public final BackendResponse$Status a;
    public final long b;
    
    public a(final BackendResponse$Status a, final long b) {
        if (a != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("Null status");
    }
    
    public final long a() {
        return this.b;
    }
    
    public final BackendResponse$Status b() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof BackendResponse) {
            final BackendResponse backendResponse = (BackendResponse)o;
            if (!this.a.equals(backendResponse.b()) || this.b != backendResponse.a()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return (hashCode ^ 0xF4243) * 1000003 ^ (int)(b ^ b >>> 32);
    }
    
    public final String toString() {
        final StringBuilder t = a.t("BackendResponse{status=");
        t.append(this.a);
        t.append(", nextRequestWaitMillis=");
        return d.k(t, this.b, "}");
    }
}
