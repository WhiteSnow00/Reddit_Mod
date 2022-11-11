// 
// Decompiled by Procyon v0.6.0
// 

package i50;

import com.reddit.data.modtools.remote.RemoteModNotificationSettingsDataSource;
import javax.inject.Provider;
import se2.d;

public final class c implements d<b>
{
    public final Provider<RemoteModNotificationSettingsDataSource> a;
    
    public c(final dt.b a) {
        this.a = (Provider<RemoteModNotificationSettingsDataSource>)a;
    }
    
    public final Object get() {
        return new b((RemoteModNotificationSettingsDataSource)this.a.get());
    }
}
