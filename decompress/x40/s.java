// 
// Decompiled by Procyon v0.6.0
// 

package x40;

import ng2.e;
import com.reddit.domain.model.streaming.StateType;
import java.util.concurrent.Callable;

public final class s implements Callable
{
    public final t f;
    public final long g;
    public final StateType h;
    
    public s(final t f, final long g, final StateType h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final Object call() {
        final t f = this.f;
        final long g = this.g;
        final StateType h = this.h;
        e.f((Object)f, "this$0");
        e.f((Object)h, "$type");
        return f.a.M0(g, ((Enum)h).name());
    }
}
