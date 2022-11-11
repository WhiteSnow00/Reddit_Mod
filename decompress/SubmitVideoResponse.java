// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import ah2.f;
import kotlin.Metadata;
import com.reddit.domain.model.GenericResponse;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b" }, d2 = { "Lcom/reddit/data/model/SubmitVideoResponse;", "Lcom/reddit/domain/model/GenericResponse;", "Lcom/reddit/data/model/SubmitVideoResponse$WebsocketLinkResult;", "json", "Lcom/reddit/domain/model/GenericResponse$Json;", "(Lcom/reddit/domain/model/GenericResponse$Json;)V", "websocketUrl", "", "getWebsocketUrl", "()Ljava/lang/String;", "WebsocketLinkResult", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubmitVideoResponse extends GenericResponse<SubmitVideoResponse.SubmitVideoResponse$WebsocketLinkResult>
{
    public SubmitVideoResponse(final Json<SubmitVideoResponse.SubmitVideoResponse$WebsocketLinkResult> json) {
        f.f((Object)json, "json");
        super((Json)json);
    }
    
    public final String getWebsocketUrl() {
        final SubmitVideoResponse.SubmitVideoResponse$WebsocketLinkResult submitVideoResponse$WebsocketLinkResult = this.getJson().getData();
        String websocketUrl;
        if (submitVideoResponse$WebsocketLinkResult != null) {
            websocketUrl = submitVideoResponse$WebsocketLinkResult.getWebsocketUrl();
        }
        else {
            websocketUrl = null;
        }
        return websocketUrl;
    }
}
