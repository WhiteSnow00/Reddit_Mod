// 
// Decompiled by Procyon v0.6.0
// 

package ai2;

import oi2.t;
import ng2.e;
import ri2.f;
import b6.h;
import android.support.v4.media.b;
import ri2.l;
import pi2.d;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;

public final class o extends TypeCheckerState
{
    public final p i;
    
    public o(final p i, final KotlinTypePreparator kotlinTypePreparator, final d d) {
        super(true, true, (l)(this.i = i), (b)kotlinTypePreparator, (h)d);
    }
    
    public final boolean b(final f f, final f f2) {
        e.f((Object)f, "subType");
        e.f((Object)f2, "superType");
        if (!(f instanceof t)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (f2 instanceof t) {
            return (boolean)this.i.j.invoke((Object)f, (Object)f2);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
