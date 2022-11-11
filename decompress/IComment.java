// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.EmptyList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010H\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\n\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/model/IComment;", "Landroid/os/Parcelable;", "()V", "depth", "", "getDepth", "()I", "id", "", "getId", "()Ljava/lang/String;", "kindWithId", "getKindWithId", "parentKindWithId", "getParentKindWithId", "getInternalCommentReplies", "", "Lcom/reddit/domain/model/ChatPostSystemMessage;", "Lcom/reddit/domain/model/Comment;", "Lcom/reddit/domain/model/CommentPlaceholder;", "Lcom/reddit/domain/model/ModComment;", "Lcom/reddit/domain/model/MoreComment;", "Lcom/reddit/domain/model/RecommendedPostsPlaceholder;", "Lcom/reddit/domain/model/RecommendedTopicsPlaceholder;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class IComment implements Parcelable
{
    private IComment() {
    }
    
    public abstract int getDepth();
    
    public abstract String getId();
    
    public List<IComment> getInternalCommentReplies() {
        return CollectionsKt___CollectionsKt.i2((Collection)EmptyList.INSTANCE);
    }
    
    public abstract String getKindWithId();
    
    public abstract String getParentKindWithId();
}
