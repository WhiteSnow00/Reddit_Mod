// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.net;

import java.util.concurrent.ExecutorService;
import java.util.List;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
import java.util.concurrent.ScheduledFuture;
import java.util.Iterator;
import org.chromium.net.UrlRequest$Builder;
import org.chromium.net.UrlRequest;
import org.chromium.net.UploadDataProviders;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest$Callback;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine$Builder;
import java.util.concurrent.Executors;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.CronetEngine;

class CronetHttpClient implements HttpClient
{
    private final CronetEngine engine;
    private final ScheduledExecutorService executor;
    
    public CronetHttpClient(final Context context) {
        this.executor = Executors.newScheduledThreadPool(3);
        this.engine = new CronetEngine$Builder(context).enableHttp2(true).enableQuic(true).build();
    }
    
    public void execute(final Request request, final ResponseCallback responseCallback) {
        final UrlRequest$Builder urlRequestBuilder = this.engine.newUrlRequestBuilder(request.getUrl(), (UrlRequest$Callback)new RequestCallback(this.executor, request, this.executor.schedule((Runnable)new CronetHttpClient$1(this, request, responseCallback), request.getTimeout(), TimeUnit.SECONDS), responseCallback), (Executor)this.executor);
        for (final Map.Entry<String, V> entry : request.getHeaders().entrySet()) {
            urlRequestBuilder.addHeader((String)entry.getKey(), (String)entry.getValue());
        }
        urlRequestBuilder.setHttpMethod(request.getMethod().toString());
        if (request.getContent() != null) {
            urlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(request.getContent()), (Executor)this.executor);
        }
        final UrlRequest build = urlRequestBuilder.build();
        request.setCancellable((Request$Cancellable)new Request$Cancellable(this, build) {
            public final CronetHttpClient this$0;
            public final UrlRequest val$urlRequest;
            
            public void cancel() {
                this.val$urlRequest.cancel();
            }
        });
        build.start();
    }
    
    public void release() {
        this.engine.shutdown();
    }
    
    public static class RequestCallback extends UrlRequest$Callback
    {
        private final ResponseCallback callback;
        private final ScheduledExecutorService executor;
        private final Request httpRequest;
        private ReadCallback readCallback;
        private ScheduledFuture<?> readTimeout;
        private ScheduledFuture<?> requestTimeout;
        
        public RequestCallback(final ScheduledExecutorService executor, final Request httpRequest, final ScheduledFuture<?> requestTimeout, final ResponseCallback callback) {
            this.executor = executor;
            this.httpRequest = httpRequest;
            this.callback = callback;
            this.requestTimeout = requestTimeout;
        }
        
        public static Request access$000(final RequestCallback requestCallback) {
            return requestCallback.httpRequest;
        }
        
        public static ReadCallback access$102(final RequestCallback requestCallback, final ReadCallback readCallback) {
            return requestCallback.readCallback = readCallback;
        }
        
        public static ResponseCallback access$200(final RequestCallback requestCallback) {
            return requestCallback.callback;
        }
        
        public void onFailed(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final CronetException ex) {
            ((Throwable)ex).printStackTrace();
            synchronized (this.httpRequest.lock()) {
                if (!this.httpRequest.isCancelled()) {
                    this.callback.onError((Exception)ex);
                }
            }
        }
        
        public void onReadCompleted(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final ByteBuffer byteBuffer) {
            synchronized (this.httpRequest.lock()) {
                if (!this.httpRequest.isCancelled()) {
                    byteBuffer.flip();
                    final ReadCallback readCallback = this.readCallback;
                    if (readCallback != null) {
                        readCallback.onBuffer(byteBuffer, byteBuffer.remaining(), false);
                    }
                    byteBuffer.clear();
                    urlRequest.read(byteBuffer);
                    final ScheduledFuture<?> readTimeout = this.readTimeout;
                    if (readTimeout != null) {
                        readTimeout.cancel(false);
                    }
                    final int timeout = this.readCallback.getTimeout();
                    if (timeout > 0) {
                        this.readTimeout = this.executor.schedule((Runnable)new CronetHttpClient$RequestCallback$2(this), timeout, TimeUnit.SECONDS);
                    }
                }
            }
        }
        
        public void onRedirectReceived(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final String s) {
            urlRequest.followRedirect();
        }
        
        public void onResponseStarted(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) {
            synchronized (this.httpRequest.lock()) {
                if (!this.httpRequest.isCancelled()) {
                    final Response response = new Response(urlResponseInfo.getHttpStatusCode());
                    for (final Map.Entry<K, List> entry : urlResponseInfo.getAllHeaders().entrySet()) {
                        final List list = entry.getValue();
                        final String s = (String)entry.getKey();
                        String s2;
                        if (list.isEmpty()) {
                            s2 = "";
                        }
                        else {
                            s2 = (String)list.get(0);
                        }
                        response.setHeader(s, s2);
                    }
                    response.setConsumer((ExecutorService)null, (StreamConsumer)new StreamConsumer(this, urlRequest) {
                        public final RequestCallback this$0;
                        public final UrlRequest val$request;
                        
                        public void consume(final ReadCallback readCallback) {
                            synchronized (RequestCallback.access$000(this.this$0).lock()) {
                                RequestCallback.access$102(this.this$0, readCallback);
                                this.val$request.read(ByteBuffer.allocateDirect(16384));
                            }
                        }
                    });
                    this.requestTimeout.cancel(false);
                    this.callback.onResponse(response);
                }
            }
        }
        
        public void onSucceeded(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) {
            synchronized (this.httpRequest.lock()) {
                if (!this.httpRequest.isCancelled()) {
                    final ScheduledFuture<?> readTimeout = this.readTimeout;
                    if (readTimeout != null) {
                        readTimeout.cancel(false);
                    }
                    final ReadCallback readCallback = this.readCallback;
                    if (readCallback != null) {
                        readCallback.onBuffer((ByteBuffer)null, 0, true);
                    }
                }
            }
        }
    }
}
