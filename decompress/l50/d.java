// 
// Decompiled by Procyon v0.6.0
// 

package l50;

import ry.b;
import mr0.g;
import javax.inject.Provider;
import com.reddit.data.modtools.remote.RemoteWelcomeMessageDataSource;

public final class d implements ne2.d<RemoteWelcomeMessageDataSource>
{
    public final Provider<g> a;
    
    public d(final b a) {
        this.a = (Provider<g>)a;
    }
    
    public final Object get() {
        return new RemoteWelcomeMessageDataSource((g)this.a.get());
    }
}
