// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.okhttp3;

import fk2.g0;
import fk2.u;
import fk2.f;
import java.io.InputStream;
import okhttp3.MediaType;
import okhttp3.Connection;
import okhttp3.Request;
import java.io.IOException;
import okhttp3.ResponseBody;
import com.facebook.stetho.inspector.network.ResponseHandler;
import com.facebook.stetho.inspector.network.DefaultResponseHandler;
import com.facebook.stetho.inspector.network.NetworkEventReporter$InspectorResponse;
import com.facebook.stetho.inspector.network.NetworkEventReporter$InspectorRequest;
import com.facebook.stetho.inspector.network.RequestBodyHelper;
import okhttp3.Response;
import okhttp3.Interceptor$Chain;
import com.facebook.stetho.inspector.network.NetworkEventReporterImpl;
import com.facebook.stetho.inspector.network.NetworkEventReporter;
import okhttp3.Interceptor;

public class StethoInterceptor implements Interceptor
{
    private final NetworkEventReporter mEventReporter;
    
    public StethoInterceptor() {
        this.mEventReporter = NetworkEventReporterImpl.get();
    }
    
    public Response intercept(final Interceptor$Chain interceptor$Chain) throws IOException {
        final String nextRequestId = this.mEventReporter.nextRequestId();
        final Request request = interceptor$Chain.request();
        final boolean enabled = this.mEventReporter.isEnabled();
        final String s = null;
        RequestBodyHelper requestBodyHelper;
        if (enabled) {
            requestBodyHelper = new RequestBodyHelper(this.mEventReporter, nextRequestId);
            this.mEventReporter.requestWillBeSent((NetworkEventReporter$InspectorRequest)new StethoInterceptor.StethoInterceptor$OkHttpInspectorRequest(nextRequestId, request, requestBodyHelper));
        }
        else {
            requestBodyHelper = null;
        }
        try {
            Response response2;
            final Response response = response2 = interceptor$Chain.proceed(request);
            if (this.mEventReporter.isEnabled()) {
                if (requestBodyHelper != null && requestBodyHelper.hasBody()) {
                    requestBodyHelper.reportDataSent();
                }
                final Connection connection = interceptor$Chain.connection();
                if (connection == null) {
                    throw new IllegalStateException("No connection associated with this request; did you use addInterceptor instead of addNetworkInterceptor?");
                }
                this.mEventReporter.responseHeadersReceived((NetworkEventReporter$InspectorResponse)new StethoInterceptor.StethoInterceptor$OkHttpInspectorResponse(nextRequestId, request, response, connection));
                final ResponseBody body = response.body();
                MediaType contentType;
                InputStream byteStream;
                if (body != null) {
                    contentType = body.contentType();
                    byteStream = body.byteStream();
                }
                else {
                    contentType = null;
                    byteStream = null;
                }
                final NetworkEventReporter mEventReporter = this.mEventReporter;
                String string = s;
                if (contentType != null) {
                    string = contentType.toString();
                }
                final InputStream interpretResponseStream = mEventReporter.interpretResponseStream(nextRequestId, string, response.header("Content-Encoding"), byteStream, (ResponseHandler)new DefaultResponseHandler(this.mEventReporter, nextRequestId));
                response2 = response;
                if (interpretResponseStream != null) {
                    response2 = response.newBuilder().body((ResponseBody)new ForwardingResponseBody(body, interpretResponseStream)).build();
                }
            }
            return response2;
        }
        catch (final IOException ex) {
            if (this.mEventReporter.isEnabled()) {
                this.mEventReporter.httpExchangeFailed(nextRequestId, ex.toString());
            }
            throw ex;
        }
    }
    
    public static class ForwardingResponseBody extends ResponseBody
    {
        private final ResponseBody mBody;
        private final f mInterceptedSource;
        
        public ForwardingResponseBody(final ResponseBody mBody, final InputStream inputStream) {
            this.mBody = mBody;
            this.mInterceptedSource = (f)u.b((g0)u.g(inputStream));
        }
        
        public long contentLength() {
            return this.mBody.contentLength();
        }
        
        public MediaType contentType() {
            return this.mBody.contentType();
        }
        
        public f source() {
            return this.mInterceptedSource;
        }
    }
}
