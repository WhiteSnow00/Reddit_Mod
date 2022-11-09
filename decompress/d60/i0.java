// 
// Decompiled by Procyon v0.6.0
// 

package d60;

import ah2.f;
import com.reddit.data.remote.RemoteSearchDataSource;
import javax.inject.Provider;
import af2.d;

public final class i0 implements d<h0>
{
    public final Provider<RemoteSearchDataSource> a;
    
    public i0(final Provider<RemoteSearchDataSource> a) {
        this.a = a;
    }
    
    public final Object get() {
        final Object value = this.a.get();
        f.e(value, "remoteDataSource.get()");
        return new h0((RemoteSearchDataSource)value);
    }
}
