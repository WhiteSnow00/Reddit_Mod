// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import com.reddit.data.remote.RemoteAccountPreferenceDataSource;
import com.reddit.data.remote.RemoteEmailVerificationDataDource;
import com.reddit.data.repository.RedditSnoomojiRepository;
import com.reddit.data.remote.RemoteSnoomojiDataSource;
import d60.z;
import r20.a;
import javax.inject.Provider;
import af2.d;

public final class s implements d
{
    public final /* synthetic */ int a;
    public final Provider b;
    public final Provider c;
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new m2((a)this.b.get(), (z)this.c.get());
            }
            case 3: {
                return new RedditSnoomojiRepository((RemoteSnoomojiDataSource)this.b.get(), (a)this.c.get());
            }
            case 2: {
                return new e0((rr0.a)this.b.get(), (d51.a)this.c.get());
            }
            case 1: {
                return new a0((RemoteEmailVerificationDataDource)this.b.get(), (r41.a)this.c.get());
            }
            case 0: {
                return new r((RemoteAccountPreferenceDataSource)this.b.get(), (a)this.c.get());
            }
        }
    }
}
