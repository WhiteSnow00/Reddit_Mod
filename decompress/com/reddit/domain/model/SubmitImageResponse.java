// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.n;
import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b" }, d2 = { "Lcom/reddit/domain/model/SubmitImageResponse;", "Lcom/reddit/domain/model/GenericResponse;", "Lcom/reddit/domain/model/SubmitImageResponse$WebsocketLinkResult;", "json", "Lcom/reddit/domain/model/GenericResponse$Json;", "(Lcom/reddit/domain/model/GenericResponse$Json;)V", "websocketUrl", "", "getWebsocketUrl", "()Ljava/lang/String;", "WebsocketLinkResult", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubmitImageResponse extends GenericResponse<WebsocketLinkResult>
{
    public SubmitImageResponse(final GenericResponse$Json<WebsocketLinkResult> genericResponse$Json) {
        e.f((Object)genericResponse$Json, "json");
        super((GenericResponse$Json)genericResponse$Json);
    }
    
    public final String getWebsocketUrl() {
        final WebsocketLinkResult websocketLinkResult = (WebsocketLinkResult)this.getJson().getData();
        String websocketUrl;
        if (websocketLinkResult != null) {
            websocketUrl = websocketLinkResult.getWebsocketUrl();
        }
        else {
            websocketUrl = null;
        }
        return websocketUrl;
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n" }, d2 = { "Lcom/reddit/domain/model/SubmitImageResponse$WebsocketLinkResult;", "", "()V", "websocketUrl", "", "getWebsocketUrl$annotations", "getWebsocketUrl", "()Ljava/lang/String;", "setWebsocketUrl", "(Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class WebsocketLinkResult
    {
        private String websocketUrl;
        
        @n(name = "websocket_url")
        public static void getWebsocketUrl$annotations() {
        }
        
        public final String getWebsocketUrl() {
            return this.websocketUrl;
        }
        
        public final void setWebsocketUrl(final String websocketUrl) {
            this.websocketUrl = websocketUrl;
        }
    }
}
