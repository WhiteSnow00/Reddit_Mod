// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import ni2.h;
import ni2.e;
import hi2.a;

public final class LazyScopeAdapter extends a
{
    public final e<MemberScope> b;
    
    public LazyScopeAdapter(final h h, final mg2.a<? extends MemberScope> a) {
        ng2.e.f((Object)h, "storageManager");
        this.b = (e<MemberScope>)h.h((mg2.a)new LazyScopeAdapter$lazyScope.LazyScopeAdapter$lazyScope$1((mg2.a)a));
    }
    
    @Override
    public final MemberScope i() {
        return (MemberScope)((mg2.a)this.b).invoke();
    }
}
