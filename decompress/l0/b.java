// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import ah2.f;
import androidx.compose.animation.core.AnimationEndReason;

public final class b<T, V extends i>
{
    public final e<T, V> a;
    public final AnimationEndReason b;
    
    public b(final e<T, V> a, final AnimationEndReason b) {
        f.f((Object)a, "endState");
        f.f((Object)b, "endReason");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("AnimationResult(endReason=");
        k.append(this.b);
        k.append(", endState=");
        k.append(this.a);
        k.append(')');
        return k.toString();
    }
}
