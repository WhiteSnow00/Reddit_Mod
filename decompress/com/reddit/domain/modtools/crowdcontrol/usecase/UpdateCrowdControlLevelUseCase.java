// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.crowdcontrol.usecase;

import ah2.f;
import com.reddit.domain.model.mod.CrowdControlFilterLevel;
import tg2.c;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r" }, d2 = { "Lcom/reddit/domain/modtools/crowdcontrol/usecase/UpdateCrowdControlLevelUseCase;", "", "Lcom/reddit/domain/modtools/crowdcontrol/usecase/UpdateCrowdControlLevelUseCase$Params;", "params", "", "updateLevel", "(Lcom/reddit/domain/modtools/crowdcontrol/usecase/UpdateCrowdControlLevelUseCase$Params;Ltg2/c;)Ljava/lang/Object;", "", "postId", "isFilterEnabled", "updateFilter", "(Ljava/lang/String;ZLtg2/c;)Ljava/lang/Object;", "Params", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public interface UpdateCrowdControlLevelUseCase
{
    Object updateFilter(final String p0, final boolean p1, final c<? super Boolean> p2);
    
    Object updateLevel(final Params p0, final c<? super Boolean> p1);
    
    @Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014" }, d2 = { "Lcom/reddit/domain/modtools/crowdcontrol/usecase/UpdateCrowdControlLevelUseCase$Params;", "", "postId", "", "crowdControlLevel", "Lcom/reddit/domain/model/mod/CrowdControlFilterLevel;", "(Ljava/lang/String;Lcom/reddit/domain/model/mod/CrowdControlFilterLevel;)V", "getCrowdControlLevel", "()Lcom/reddit/domain/model/mod/CrowdControlFilterLevel;", "getPostId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Params
    {
        private final CrowdControlFilterLevel crowdControlLevel;
        private final String postId;
        
        public Params(final String postId, final CrowdControlFilterLevel crowdControlLevel) {
            f.f((Object)postId, "postId");
            f.f((Object)crowdControlLevel, "crowdControlLevel");
            this.postId = postId;
            this.crowdControlLevel = crowdControlLevel;
        }
        
        public final String component1() {
            return this.postId;
        }
        
        public final CrowdControlFilterLevel component2() {
            return this.crowdControlLevel;
        }
        
        public final Params copy(final String s, final CrowdControlFilterLevel crowdControlFilterLevel) {
            f.f((Object)s, "postId");
            f.f((Object)crowdControlFilterLevel, "crowdControlLevel");
            return new Params(s, crowdControlFilterLevel);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Params)) {
                return false;
            }
            final Params params = (Params)o;
            return f.a((Object)this.postId, (Object)params.postId) && this.crowdControlLevel == params.crowdControlLevel;
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
            final StringBuilder k = a.k("Params(postId=");
            k.append(this.postId);
            k.append(", crowdControlLevel=");
            k.append(this.crowdControlLevel);
            k.append(')');
            return k.toString();
        }
    }
}
