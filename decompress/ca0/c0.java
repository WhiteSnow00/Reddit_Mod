// 
// Decompiled by Procyon v0.6.0
// 

package ca0;

import ah2.f;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.OkHttpClient;
import xe2.a;
import okhttp3.Call$Factory;

public final class c0 implements Call$Factory
{
    public final /* synthetic */ a<OkHttpClient> f;
    
    public c0(final a<OkHttpClient> f) {
        this.f = f;
    }
    
    public final Call newCall(final Request request) {
        ah2.f.f((Object)request, "request");
        return ((OkHttpClient)this.f.get()).newCall(request);
    }
}
