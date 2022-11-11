// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0006\u0007B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\b" }, d2 = { "Lcom/reddit/domain/model/SubmitResponse;", "Lcom/reddit/domain/model/GenericResponse;", "Lcom/reddit/domain/model/SubmitResponse$LinkResult;", "json", "Lcom/reddit/domain/model/GenericResponse$Json;", "(Lcom/reddit/domain/model/GenericResponse$Json;)V", "Companion", "LinkResult", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubmitResponse extends GenericResponse<LinkResult>
{
    public static final Companion Companion;
    public static final String ERROR_RATELIMIT = "RATELIMIT";
    public static final String ERROR_SUBREDDIT_NOEXISTS = "SUBREDDIT_NOEXIST";
    
    static {
        Companion = new Companion(null);
    }
    
    public SubmitResponse(final GenericResponse$Json<LinkResult> genericResponse$Json) {
        e.f((Object)genericResponse$Json, "json");
        super((GenericResponse$Json)genericResponse$Json);
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006" }, d2 = { "Lcom/reddit/domain/model/SubmitResponse$Companion;", "", "()V", "ERROR_RATELIMIT", "", "ERROR_SUBREDDIT_NOEXISTS", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b" }, d2 = { "Lcom/reddit/domain/model/SubmitResponse$LinkResult;", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "name", "getName", "url", "getUrl", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class LinkResult
    {
        private final String id;
        private final String name;
        private final String url;
        
        public final String getId() {
            return this.id;
        }
        
        public final String getName() {
            return this.name;
        }
        
        public final String getUrl() {
            return this.url;
        }
    }
}
