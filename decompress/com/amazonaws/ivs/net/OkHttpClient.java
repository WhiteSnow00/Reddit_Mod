// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.net;

import okhttp3.ResponseBody;
import java.io.InputStream;
import okhttp3.Response;
import java.io.IOException;
import java.util.Iterator;
import java.nio.ByteBuffer;
import okhttp3.Callback;
import okhttp3.Call;
import java.util.Map;
import java.util.Locale;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Request$Builder;
import java.util.List;
import java.util.Collections;
import okhttp3.Protocol;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient$Builder;

class OkHttpClient implements HttpClient
{
    private okhttp3.OkHttpClient client;
    
    public OkHttpClient() {
        final OkHttpClient$Builder okHttpClient$Builder = new OkHttpClient$Builder();
        final TimeUnit seconds = TimeUnit.SECONDS;
        this.client = okHttpClient$Builder.connectTimeout(10L, seconds).readTimeout(10L, seconds).writeTimeout(10L, seconds).protocols((List)Collections.singletonList(Protocol.HTTP_1_1)).build();
    }
    
    public static okhttp3.OkHttpClient access$000(final OkHttpClient okHttpClient) {
        return okHttpClient.client;
    }
    
    public void execute(final Request request, final ResponseCallback responseCallback) {
        final Request$Builder request$Builder = new Request$Builder();
        final ByteBuffer content = request.getContent();
        RequestBody requestBody = null;
        if (content != null) {
            final ByteBuffer content2 = request.getContent();
            final byte[] array = new byte[content2.remaining()];
            content2.get(array);
            requestBody = RequestBody.create((MediaType)null, array);
        }
        else if (request.getMethod() == Method.POST) {
            requestBody = RequestBody.create((MediaType)null, new byte[0]);
        }
        request$Builder.url(request.getUrl());
        request$Builder.method(request.getMethod().toString().toUpperCase(Locale.ROOT), requestBody);
        for (final Map.Entry<String, V> entry : request.getHeaders().entrySet()) {
            request$Builder.addHeader((String)entry.getKey(), (String)entry.getValue());
        }
        final Call call = this.client.newCall(request$Builder.build());
        request.setCancellable((Request$Cancellable)new Request$Cancellable(this, call) {
            public final OkHttpClient this$0;
            public final Call val$call;
            
            public void cancel() {
                this.val$call.cancel();
            }
        });
        call.enqueue((Callback)new OkHttpResponseCallback(request, responseCallback));
    }
    
    public void release() {
        this.client.dispatcher().executorService().shutdown();
    }
    
    public class OkHttpResponseCallback implements Callback
    {
        private final ResponseCallback callback;
        private final Request request;
        public final OkHttpClient this$0;
        
        public OkHttpResponseCallback(final OkHttpClient this$0, final Request request, final ResponseCallback callback) {
            this.this$0 = this$0;
            this.request = request;
            this.callback = callback;
        }
        
        public void onFailure(final Call call, final IOException ex) {
            ex.printStackTrace();
            synchronized (this.request.lock()) {
                if (!this.request.isCancelled()) {
                    this.callback.onError((Exception)ex);
                }
            }
        }
        
        public void onResponse(final Call call, final Response response) {
            synchronized (this.request.lock()) {
                if (!this.request.isCancelled()) {
                    final com.amazonaws.ivs.net.Response response2 = new com.amazonaws.ivs.net.Response(response.code());
                    for (final Map.Entry<K, List> entry : response.headers().toMultimap().entrySet()) {
                        final List list = entry.getValue();
                        final String s = (String)entry.getKey();
                        String s2;
                        if (list.isEmpty()) {
                            s2 = "";
                        }
                        else {
                            s2 = (String)list.get(0);
                        }
                        response2.setHeader(s, s2);
                    }
                    response2.setConsumer(OkHttpClient.access$000(this.this$0).dispatcher().executorService(), (StreamConsumer)new InputStreamConsumer(this.request, (InputStreamConsumer.InputStreamConsumer$Provider)new InputStreamConsumer$Provider(this, response) {
                        public final OkHttpResponseCallback this$1;
                        public final Response val$okResponse;
                        
                        public InputStream getInputStream(final int n) throws IOException {
                            final ResponseBody body = this.val$okResponse.body();
                            if (body != null) {
                                return body.byteStream();
                            }
                            throw new IOException("No body");
                        }
                    }));
                    this.callback.onResponse(response2);
                }
            }
        }
    }
}
