// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector;

import com.facebook.stetho.server.http.PathMatcher;
import com.facebook.stetho.server.http.ExactPathMatcher;
import com.facebook.stetho.server.http.HandlerRegistry;
import com.facebook.stetho.server.http.LightHttpRequest;
import com.facebook.stetho.server.SocketLike;
import com.facebook.stetho.common.ProcessUtil;
import org.json.JSONException;
import android.net.Uri$Builder;
import org.json.JSONObject;
import org.json.JSONArray;
import com.facebook.stetho.server.http.LightHttpResponse;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import com.facebook.stetho.server.http.LightHttpBody;
import android.content.Context;
import com.facebook.stetho.server.http.HttpHandler;

public class ChromeDiscoveryHandler implements HttpHandler
{
    private static final String PAGE_ID = "1";
    private static final String PATH_ACTIVATE = "/json/activate/1";
    private static final String PATH_PAGE_LIST = "/json";
    private static final String PATH_VERSION = "/json/version";
    private static final String PROTOCOL_VERSION = "1.1";
    private static final String USER_AGENT = "Stetho";
    private static final String WEBKIT_REV = "@188492";
    private static final String WEBKIT_VERSION = "537.36 (@188492)";
    private final Context mContext;
    private final String mInspectorPath;
    private LightHttpBody mPageListResponse;
    private LightHttpBody mVersionResponse;
    
    public ChromeDiscoveryHandler(final Context mContext, final String mInspectorPath) {
        this.mContext = mContext;
        this.mInspectorPath = mInspectorPath;
    }
    
    private CharSequence getAppLabel() {
        return this.mContext.getPackageManager().getApplicationLabel(this.mContext.getApplicationInfo());
    }
    
    private String getAppLabelAndVersion() {
        final StringBuilder sb = new StringBuilder();
        final PackageManager packageManager = this.mContext.getPackageManager();
        sb.append(this.getAppLabel());
        sb.append('/');
        try {
            sb.append(packageManager.getPackageInfo(this.mContext.getPackageName(), 0).versionName);
            return sb.toString();
        }
        catch (final PackageManager$NameNotFoundException ex) {
            throw new RuntimeException((Throwable)ex);
        }
    }
    
    private void handleActivate(final LightHttpResponse lightHttpResponse) {
        setSuccessfulResponse(lightHttpResponse, LightHttpBody.create("Target activation ignored\n", "text/plain"));
    }
    
    private void handlePageList(final LightHttpResponse lightHttpResponse) throws JSONException {
        if (this.mPageListResponse == null) {
            final JSONArray jsonArray = new JSONArray();
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("type", (Object)"app");
            jsonObject.put("title", (Object)this.makeTitle());
            jsonObject.put("id", (Object)"1");
            jsonObject.put("description", (Object)"");
            final StringBuilder sb = new StringBuilder();
            sb.append("ws://");
            sb.append(this.mInspectorPath);
            jsonObject.put("webSocketDebuggerUrl", (Object)sb.toString());
            jsonObject.put("devtoolsFrontendUrl", (Object)new Uri$Builder().scheme("http").authority("chrome-devtools-frontend.appspot.com").appendEncodedPath("serve_rev").appendEncodedPath("@188492").appendEncodedPath("devtools.html").appendQueryParameter("ws", this.mInspectorPath).build().toString());
            jsonArray.put((Object)jsonObject);
            this.mPageListResponse = LightHttpBody.create(jsonArray.toString(), "application/json");
        }
        setSuccessfulResponse(lightHttpResponse, this.mPageListResponse);
    }
    
    private void handleVersion(final LightHttpResponse lightHttpResponse) throws JSONException {
        if (this.mVersionResponse == null) {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("WebKit-Version", (Object)"537.36 (@188492)");
            jsonObject.put("User-Agent", (Object)"Stetho");
            jsonObject.put("Protocol-Version", (Object)"1.1");
            jsonObject.put("Browser", (Object)this.getAppLabelAndVersion());
            jsonObject.put("Android-Package", (Object)this.mContext.getPackageName());
            this.mVersionResponse = LightHttpBody.create(jsonObject.toString(), "application/json");
        }
        setSuccessfulResponse(lightHttpResponse, this.mVersionResponse);
    }
    
    private String makeTitle() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getAppLabel());
        sb.append(" (powered by Stetho)");
        final String processName = ProcessUtil.getProcessName();
        final int index = processName.indexOf(58);
        if (index >= 0) {
            sb.append(processName.substring(index));
        }
        return sb.toString();
    }
    
    private static void setSuccessfulResponse(final LightHttpResponse lightHttpResponse, final LightHttpBody body) {
        lightHttpResponse.code = 200;
        lightHttpResponse.reasonPhrase = "OK";
        lightHttpResponse.body = body;
    }
    
    @Override
    public boolean handleRequest(final SocketLike socketLike, final LightHttpRequest lightHttpRequest, final LightHttpResponse lightHttpResponse) {
        final String path = lightHttpRequest.uri.getPath();
        try {
            if ("/json/version".equals(path)) {
                this.handleVersion(lightHttpResponse);
            }
            else if ("/json".equals(path)) {
                this.handlePageList(lightHttpResponse);
            }
            else if ("/json/activate/1".equals(path)) {
                this.handleActivate(lightHttpResponse);
            }
            else {
                lightHttpResponse.code = 501;
                lightHttpResponse.reasonPhrase = "Not implemented";
                final StringBuilder sb = new StringBuilder();
                sb.append("No support for ");
                sb.append(path);
                sb.append("\n");
                lightHttpResponse.body = LightHttpBody.create(sb.toString(), "text/plain");
            }
        }
        catch (final JSONException ex) {
            lightHttpResponse.code = 500;
            lightHttpResponse.reasonPhrase = "Internal server error";
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(ex.toString());
            sb2.append("\n");
            lightHttpResponse.body = LightHttpBody.create(sb2.toString(), "text/plain");
        }
        return true;
    }
    
    public void register(final HandlerRegistry handlerRegistry) {
        handlerRegistry.register((PathMatcher)new ExactPathMatcher("/json"), this);
        handlerRegistry.register((PathMatcher)new ExactPathMatcher("/json/version"), this);
        handlerRegistry.register((PathMatcher)new ExactPathMatcher("/json/activate/1"), this);
    }
}
