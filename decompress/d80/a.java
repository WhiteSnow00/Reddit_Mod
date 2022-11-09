// 
// Decompiled by Procyon v0.6.0
// 

package d80;

import ah2.f;
import b40.b;
import android.content.Context;
import javax.inject.Provider;
import com.reddit.debug.storage.RedditFileDebugOptionsRepository;
import af2.d;

public final class a implements d<RedditFileDebugOptionsRepository>
{
    public final Provider<Context> a;
    public final Provider<k40.a> b;
    
    public a(final Provider a, final b b) {
        this.a = (Provider<Context>)a;
        this.b = (Provider<k40.a>)b;
    }
    
    public final Object get() {
        final Object value = this.a.get();
        f.e(value, "context.get()");
        final Context context = (Context)value;
        final Object value2 = this.b.get();
        f.e(value2, "permissionChecker.get()");
        return new RedditFileDebugOptionsRepository(context, (k40.a)value2);
    }
}
