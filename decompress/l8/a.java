// 
// Decompiled by Procyon v0.6.0
// 

package l8;

import com.bumptech.glide.load.HttpException;
import ng.f0;
import okhttp3.Response;
import android.util.Log;
import okhttp3.Request;
import java.util.Iterator;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.util.Map;
import okhttp3.Request$Builder;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import okhttp3.Call;
import com.bumptech.glide.load.data.d$a;
import okhttp3.ResponseBody;
import l9.c;
import v8.f;
import okhttp3.Call$Factory;
import okhttp3.Callback;
import java.io.InputStream;
import com.bumptech.glide.load.data.d;

public final class a implements d<InputStream>, Callback
{
    public final Call$Factory f;
    public final f g;
    public c h;
    public ResponseBody i;
    public d$a<? super InputStream> j;
    public volatile Call k;
    
    public a(final Call$Factory f, final f g) {
        this.f = f;
        this.g = g;
    }
    
    public final Class<InputStream> a() {
        return InputStream.class;
    }
    
    public final void b() {
        while (true) {
            try {
                try (final c h = this.h) {}
                try (final ResponseBody i = this.i) {}
                this.j = null;
            }
            catch (final IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public final DataSource c() {
        return DataSource.REMOTE;
    }
    
    public final void cancel() {
        final Call k = this.k;
        if (k != null) {
            k.cancel();
        }
    }
    
    public final void d(final Priority priority, final d$a<? super InputStream> j) {
        final Request$Builder url = new Request$Builder().url(this.g.b());
        for (final Map.Entry entry : this.g.a.getHeaders().entrySet()) {
            url.addHeader((String)entry.getKey(), (String)entry.getValue());
        }
        final Request build = url.build();
        this.j = j;
        FirebasePerfOkHttpClient.enqueue(this.k = this.f.newCall(build), (Callback)this);
    }
    
    public final void onFailure(final Call call, final IOException ex) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", (Throwable)ex);
        }
        this.j.f((Exception)ex);
    }
    
    public final void onResponse(final Call call, final Response response) {
        this.i = response.body();
        if (response.isSuccessful()) {
            final ResponseBody i = this.i;
            f0.a2(i);
            final c h = new c(this.i.byteStream(), i.contentLength());
            this.h = h;
            this.j.e((Object)h);
        }
        else {
            this.j.f((Exception)new HttpException(response.message(), response.code()));
        }
    }
}
