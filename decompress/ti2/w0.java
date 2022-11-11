// 
// Decompiled by Procyon v0.6.0
// 

package ti2;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import sg2.e;
import java.util.List;

public abstract class w0 extends t
{
    public final List<n0> G0() {
        return this.M0().G0();
    }
    
    public final j0 H0() {
        return this.M0().H0();
    }
    
    public final k0 I0() {
        return this.M0().I0();
    }
    
    public final boolean J0() {
        return this.M0().J0();
    }
    
    public final v0 L0() {
        t t;
        for (t = this.M0(); t instanceof w0; t = ((w0)t).M0()) {}
        e.d((Object)t, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (v0)t;
    }
    
    public abstract t M0();
    
    public boolean N0() {
        return true;
    }
    
    public final MemberScope p() {
        return this.M0().p();
    }
    
    public final String toString() {
        String string;
        if (this.N0()) {
            string = this.M0().toString();
        }
        else {
            string = "<Not computed yet>";
        }
        return string;
    }
}
