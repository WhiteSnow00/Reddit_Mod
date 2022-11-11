// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.jvm.internal;

import zg2.c;
import sg2.e;
import zg2.k;

public abstract class PropertyReference extends CallableReference implements k
{
    public PropertyReference() {
    }
    
    public PropertyReference(final Object o) {
        super(o);
    }
    
    public PropertyReference(final Object o, final Class clazz, final String s, final String s2, final int n) {
        boolean b = true;
        if ((n & 0x1) != 0x1) {
            b = false;
        }
        super(o, clazz, s, s2, b);
    }
    
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof PropertyReference) {
            final PropertyReference propertyReference = (PropertyReference)o;
            if (!this.getOwner().equals(propertyReference.getOwner()) || !this.getName().equals(propertyReference.getName()) || !this.getSignature().equals(propertyReference.getSignature()) || !e.a(this.getBoundReceiver(), propertyReference.getBoundReceiver())) {
                b = false;
            }
            return b;
        }
        return o instanceof k && o.equals(this.compute());
    }
    
    public k getReflected() {
        return (k)super.getReflected();
    }
    
    public int hashCode() {
        return this.getSignature().hashCode() + (this.getName().hashCode() + this.getOwner().hashCode() * 31) * 31;
    }
    
    public boolean isConst() {
        return this.getReflected().isConst();
    }
    
    public boolean isLateinit() {
        return this.getReflected().isLateinit();
    }
    
    public String toString() {
        final c compute = this.compute();
        if (compute != this) {
            return compute.toString();
        }
        final StringBuilder r = a.r("property ");
        r.append(this.getName());
        r.append(" (Kotlin reflection is not available)");
        return r.toString();
    }
}
