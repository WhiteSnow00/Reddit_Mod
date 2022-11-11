// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.data;

import java.util.Iterator;
import java.net.URISyntaxException;
import java.net.MalformedURLException;
import al0.b;
import com.bumptech.glide.load.HttpException;
import k9.c;
import android.text.TextUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URLConnection;
import java.util.Map;
import java.net.URL;
import android.os.SystemClock;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import android.util.Log;
import java.net.HttpURLConnection;
import u8.f;
import java.io.InputStream;

public final class j implements d<InputStream>
{
    public final f f;
    public final int g;
    public HttpURLConnection h;
    public InputStream i;
    public volatile boolean j;
    
    static {
        new a();
    }
    
    public j(final f f, final int g) {
        this.f = f;
        this.g = g;
    }
    
    public static int e(final HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        }
        catch (final IOException ex) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", (Throwable)ex);
            }
            return -1;
        }
    }
    
    @Override
    public final Class<InputStream> a() {
        return InputStream.class;
    }
    
    @Override
    public final void b() {
        final InputStream i = this.i;
        while (true) {
            if (i == null) {
                break Label_0013;
            }
            try {
                i.close();
                final HttpURLConnection h = this.h;
                if (h != null) {
                    h.disconnect();
                }
                this.h = null;
            }
            catch (final IOException ex) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final DataSource c() {
        return DataSource.REMOTE;
    }
    
    @Override
    public final void cancel() {
        this.j = true;
    }
    
    @Override
    public final void d(final Priority priority, final d.a<? super InputStream> a) {
        final int b = k9.f.b;
        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Label_0136: {
                try {
                    final f f = this.f;
                    if (f.f == null) {
                        f.f = new URL(f.b());
                    }
                    a.e(this.f(f.f, 0, null, this.f.a.getHeaders()));
                    if (Log.isLoggable("HttpUrlFetcher", 2)) {
                        final StringBuilder sb = new StringBuilder();
                        break Label_0136;
                    }
                }
                finally {
                    if (Log.isLoggable("HttpUrlFetcher", 2)) {
                        final StringBuilder r = a.r("Finished http url fetcher fetch in ");
                        r.append(k9.f.a(elapsedRealtimeNanos));
                        Log.v("HttpUrlFetcher", r.toString());
                    }
                    final IOException ex;
                    Log.d("HttpUrlFetcher", "Failed to load data for url", (Throwable)ex);
                    a.f(ex);
                    iftrue(Label_0163:)(!Log.isLoggable("HttpUrlFetcher", 2));
                    Block_9: {
                        break Block_9;
                        Label_0163: {
                            return;
                        }
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Finished http url fetcher fetch in ");
                    sb.append(k9.f.a(elapsedRealtimeNanos));
                    Log.v("HttpUrlFetcher", sb.toString());
                }
            }
        }
        catch (final IOException ex2) {}
    }
    
    public final InputStream f(URL h, int contentLength, URL headerField, Map<String, String> inputStream) throws HttpException {
        Label_0525: {
            if (contentLength >= 5) {
                break Label_0525;
            }
            while (true) {
                if (headerField == null) {
                    break Label_0039;
                }
                try {
                    if (!((URL)h).toURI().equals(headerField.toURI())) {
                        final int n = 0;
                        try {
                            final HttpURLConnection h2 = (HttpURLConnection)FirebasePerfUrlConnection.instrument((Object)((URL)h).openConnection());
                            for (final Map.Entry entry : ((Map<String, String>)inputStream).entrySet()) {
                                h2.addRequestProperty((String)entry.getKey(), (String)entry.getValue());
                            }
                            h2.setConnectTimeout(this.g);
                            h2.setReadTimeout(this.g);
                            h2.setUseCaches(false);
                            h2.setDoInput(true);
                            h2.setInstanceFollowRedirects(false);
                            this.h = h2;
                            try {
                                h2.connect();
                                this.i = this.h.getInputStream();
                                if (this.j) {
                                    return null;
                                }
                                final int e = e(this.h);
                                final int n2 = e / 100;
                                if (n2 == 2) {
                                    h = (IOException)this.h;
                                    try {
                                        if (TextUtils.isEmpty((CharSequence)((URLConnection)h).getContentEncoding())) {
                                            contentLength = ((URLConnection)h).getContentLength();
                                            inputStream = ((URLConnection)h).getInputStream();
                                            this.i = (InputStream)new c(inputStream, (long)contentLength);
                                        }
                                        else {
                                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                                final StringBuilder sb = new StringBuilder();
                                                sb.append("Got non empty content encoding: ");
                                                sb.append(((URLConnection)h).getContentEncoding());
                                                Log.d("HttpUrlFetcher", sb.toString());
                                            }
                                            this.i = ((URLConnection)h).getInputStream();
                                        }
                                        return this.i;
                                    }
                                    catch (final IOException ex) {
                                        throw new HttpException("Failed to obtain InputStream", e((HttpURLConnection)h), ex);
                                    }
                                }
                                int n3 = n;
                                if (n2 == 3) {
                                    n3 = 1;
                                }
                                if (n3 != 0) {
                                    headerField = (URL)this.h.getHeaderField("Location");
                                    if (!TextUtils.isEmpty((CharSequence)headerField)) {
                                        try {
                                            final URL url = new URL((URL)h, (String)headerField);
                                            this.b();
                                            return this.f(url, contentLength + 1, (URL)h, (Map<String, String>)inputStream);
                                        }
                                        catch (final MalformedURLException ex2) {
                                            throw new HttpException(b.h("Bad redirect url: ", (String)headerField), e, ex2);
                                        }
                                    }
                                    throw new HttpException("Received empty or null redirect url", e);
                                }
                                if (e == -1) {
                                    throw new HttpException(e);
                                }
                                try {
                                    throw new HttpException(this.h.getResponseMessage(), e);
                                }
                                catch (final IOException ex3) {
                                    throw new HttpException("Failed to get a response message", e, ex3);
                                }
                            }
                            catch (final IOException ex4) {
                                throw new HttpException("Failed to connect or obtain data", e(this.h), ex4);
                            }
                        }
                        catch (final IOException h) {
                            throw new HttpException("URL.openConnection threw", 0, h);
                        }
                        throw new HttpException("Too many (> 5) redirects!", -1);
                    }
                    throw new HttpException("In re-direct loop", -1);
                }
                catch (final URISyntaxException ex5) {
                    continue;
                }
                break;
            }
        }
    }
    
    public static final class a
    {
    }
}
