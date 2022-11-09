// 
// Decompiled by Procyon v0.6.0
// 

package c60;

import okhttp3.Response;
import okhttp3.Interceptor$Chain;
import javax.inject.Inject;
import ah2.f;
import com.reddit.session.r;
import okhttp3.Interceptor;

public final class d implements Interceptor
{
    public final r a;
    
    @Inject
    public d(final r a) {
        f.f((Object)a, "sessionView");
        this.a = a;
    }
    
    public final Response intercept(final Interceptor$Chain interceptor$Chain) {
        f.f((Object)interceptor$Chain, "chain");
        return interceptor$Chain.proceed(interceptor$Chain.request().newBuilder().tag((Class)r.class, (Object)this.a).build());
    }
}
