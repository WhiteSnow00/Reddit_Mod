// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.jvm.internal;

import sg2.e;
import sg2.h;
import zg2.c;
import zg2.g;
import sg2.d;

public class FunctionReference extends CallableReference implements d, g
{
    private final int arity;
    private final int flags;
    
    public FunctionReference(final int n) {
        this(n, CallableReference.NO_RECEIVER, null, null, null, 0);
    }
    
    public FunctionReference(final int n, final Object o) {
        this(n, o, null, null, null, 0);
    }
    
    public FunctionReference(final int arity, final Object o, final Class clazz, final String s, final String s2, final int n) {
        super(o, clazz, s, s2, (n & 0x1) == 0x1);
        this.arity = arity;
        this.flags = n >> 1;
    }
    
    public c computeReflected() {
        return (c)h.a.a(this);
    }
    
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof FunctionReference) {
            final FunctionReference functionReference = (FunctionReference)o;
            if (!this.getName().equals(functionReference.getName()) || !this.getSignature().equals(functionReference.getSignature()) || this.flags != functionReference.flags || this.arity != functionReference.arity || !e.a(this.getBoundReceiver(), functionReference.getBoundReceiver()) || !e.a((Object)this.getOwner(), (Object)functionReference.getOwner())) {
                b = false;
            }
            return b;
        }
        return o instanceof g && o.equals(this.compute());
    }
    
    public int getArity() {
        return this.arity;
    }
    
    public g getReflected() {
        return (g)super.getReflected();
    }
    
    public int hashCode() {
        int n;
        if (this.getOwner() == null) {
            n = 0;
        }
        else {
            n = this.getOwner().hashCode() * 31;
        }
        return this.getSignature().hashCode() + (this.getName().hashCode() + n) * 31;
    }
    
    public boolean isExternal() {
        return this.getReflected().isExternal();
    }
    
    public boolean isInfix() {
        return this.getReflected().isInfix();
    }
    
    public boolean isInline() {
        return this.getReflected().isInline();
    }
    
    public boolean isOperator() {
        return this.getReflected().isOperator();
    }
    
    public boolean isSuspend() {
        return this.getReflected().isSuspend();
    }
    
    public String toString() {
        final c compute = this.compute();
        if (compute != this) {
            return compute.toString();
        }
        String string;
        if ("<init>".equals(this.getName())) {
            string = "constructor (Kotlin reflection is not available)";
        }
        else {
            final StringBuilder r = a.r("function ");
            r.append(this.getName());
            r.append(" (Kotlin reflection is not available)");
            string = r.toString();
        }
        return string;
    }
}
