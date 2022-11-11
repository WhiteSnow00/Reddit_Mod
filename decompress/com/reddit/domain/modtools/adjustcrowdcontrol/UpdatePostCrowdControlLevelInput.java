// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.adjustcrowdcontrol;

import sg2.e;
import com.reddit.domain.model.mod.CrowdControlFilterLevel;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014" }, d2 = { "Lcom/reddit/domain/modtools/adjustcrowdcontrol/UpdatePostCrowdControlLevelInput;", "", "postId", "", "crowdControlLevel", "Lcom/reddit/domain/model/mod/CrowdControlFilterLevel;", "(Ljava/lang/String;Lcom/reddit/domain/model/mod/CrowdControlFilterLevel;)V", "getCrowdControlLevel", "()Lcom/reddit/domain/model/mod/CrowdControlFilterLevel;", "getPostId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class UpdatePostCrowdControlLevelInput
{
    private final CrowdControlFilterLevel crowdControlLevel;
    private final String postId;
    
    public UpdatePostCrowdControlLevelInput(final String postId, final CrowdControlFilterLevel crowdControlLevel) {
        e.f((Object)postId, "postId");
        e.f((Object)crowdControlLevel, "crowdControlLevel");
        this.postId = postId;
        this.crowdControlLevel = crowdControlLevel;
    }
    
    public final String component1() {
        return this.postId;
    }
    
    public final CrowdControlFilterLevel component2() {
        return this.crowdControlLevel;
    }
    
    public final UpdatePostCrowdControlLevelInput copy(final String s, final CrowdControlFilterLevel crowdControlFilterLevel) {
        e.f((Object)s, "postId");
        e.f((Object)crowdControlFilterLevel, "crowdControlLevel");
        return new UpdatePostCrowdControlLevelInput(s, crowdControlFilterLevel);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePostCrowdControlLevelInput)) {
            return false;
        }
        final UpdatePostCrowdControlLevelInput updatePostCrowdControlLevelInput = (UpdatePostCrowdControlLevelInput)o;
        return e.a((Object)this.postId, (Object)updatePostCrowdControlLevelInput.postId) && this.crowdControlLevel == updatePostCrowdControlLevelInput.crowdControlLevel;
    }
    
    public final CrowdControlFilterLevel getCrowdControlLevel() {
        return this.crowdControlLevel;
    }
    
    public final String getPostId() {
        return this.postId;
    }
    
    @Override
    public int hashCode() {
        return this.crowdControlLevel.hashCode() + this.postId.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("UpdatePostCrowdControlLevelInput(postId=");
        r.append(this.postId);
        r.append(", crowdControlLevel=");
        r.append(this.crowdControlLevel);
        r.append(')');
        return r.toString();
    }
}
