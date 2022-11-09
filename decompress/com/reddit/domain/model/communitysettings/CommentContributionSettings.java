// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.communitysettings;

import ak0.m;
import ah2.f;
import com.reddit.domain.model.media.MediaInCommentType;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011" }, d2 = { "Lcom/reddit/domain/model/communitysettings/CommentContributionSettings;", "", "allowedMediaTypes", "", "Lcom/reddit/domain/model/media/MediaInCommentType;", "(Ljava/util/List;)V", "getAllowedMediaTypes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class CommentContributionSettings
{
    private final List<MediaInCommentType> allowedMediaTypes;
    
    public CommentContributionSettings(final List<? extends MediaInCommentType> allowedMediaTypes) {
        this.allowedMediaTypes = (List<MediaInCommentType>)allowedMediaTypes;
    }
    
    public final List<MediaInCommentType> component1() {
        return this.allowedMediaTypes;
    }
    
    public final CommentContributionSettings copy(final List<? extends MediaInCommentType> list) {
        return new CommentContributionSettings(list);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof CommentContributionSettings && f.a((Object)this.allowedMediaTypes, (Object)((CommentContributionSettings)o).allowedMediaTypes));
    }
    
    public final List<MediaInCommentType> getAllowedMediaTypes() {
        return this.allowedMediaTypes;
    }
    
    @Override
    public int hashCode() {
        final List<MediaInCommentType> allowedMediaTypes = this.allowedMediaTypes;
        int hashCode;
        if (allowedMediaTypes == null) {
            hashCode = 0;
        }
        else {
            hashCode = allowedMediaTypes.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        return m.n(a.k("CommentContributionSettings(allowedMediaTypes="), (List)this.allowedMediaTypes, ')');
    }
}
