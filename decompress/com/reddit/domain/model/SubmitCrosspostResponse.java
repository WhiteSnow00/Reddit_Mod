// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0006B\u0017\u0012\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/SubmitCrosspostResponse;", "Lcom/reddit/domain/model/GenericResponse;", "Lcom/reddit/domain/model/SubmitCrosspostResponse$LinkResult;", "json", "Lcom/reddit/domain/model/GenericResponse$Json;", "(Lcom/reddit/domain/model/GenericResponse$Json;)V", "LinkResult", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubmitCrosspostResponse extends GenericResponse<LinkResult>
{
    public SubmitCrosspostResponse(final GenericResponse$Json<LinkResult> genericResponse$Json) {
        e.f((Object)genericResponse$Json, "json");
        super((GenericResponse$Json)genericResponse$Json);
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/SubmitCrosspostResponse$LinkResult;", "", "id", "", "(Lcom/reddit/domain/model/SubmitCrosspostResponse;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public final class LinkResult
    {
        private final String id;
        
        public LinkResult(final String id) {
            e.f((Object)id, "id");
            this.id = id;
        }
        
        public final String getId() {
            return this.id;
        }
    }
}
