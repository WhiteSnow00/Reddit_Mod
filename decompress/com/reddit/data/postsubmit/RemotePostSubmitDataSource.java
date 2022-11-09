// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.postsubmit;

import av2.e;
import av2.d;
import java.util.Map;
import com.reddit.domain.model.PostPollParams;
import av2.o;
import com.reddit.domain.model.CreateLinkResponse;
import nf2.c0;
import av2.a;
import com.reddit.data.postsubmit.remote.PostGalleryParams;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0004\u001a\u00020\bH'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0004\u001a\u00020\nH'¨\u0006\f" }, d2 = { "Lcom/reddit/data/postsubmit/RemotePostSubmitDataSource;", "", "", "", "params", "Lnf2/c0;", "Lcom/reddit/domain/model/CreateLinkResponse;", "submitPost", "Lcom/reddit/domain/model/PostPollParams;", "submitPollPost", "Lcom/reddit/data/postsubmit/remote/PostGalleryParams;", "submitGalleryPost", "data_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemotePostSubmitDataSource
{
    @o("/api/submit_gallery_post")
    c0<CreateLinkResponse> submitGalleryPost(@a final PostGalleryParams p0);
    
    @o("/api/submit_poll_post")
    c0<CreateLinkResponse> submitPollPost(@a final PostPollParams p0);
    
    @e
    @o("/api/submit")
    c0<CreateLinkResponse> submitPost(@d final Map<String, String> p0);
}
