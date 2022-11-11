// 
// Decompiled by Procyon v0.6.0
// 

package com.vanniktech.rxpermission;

public final class a extends Permission
{
    public final String a;
    public final Permission$State b;
    
    public a(final String a, final Permission$State b) {
        if (a == null) {
            throw new NullPointerException("Null name");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null state");
    }
    
    public final String a() {
        return this.a;
    }
    
    public final Permission$State b() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof Permission) {
            final Permission permission = (Permission)o;
            if (!this.a.equals(permission.a()) || !this.b.equals(permission.b())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    public final String toString() {
        final StringBuilder r = a.r("Permission{name=");
        r.append(this.a);
        r.append(", state=");
        r.append(this.b);
        r.append("}");
        return r.toString();
    }
}
