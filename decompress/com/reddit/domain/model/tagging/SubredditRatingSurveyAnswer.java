// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyAnswer;", "Landroid/os/Parcelable;", "()V", "answerText", "", "getAnswerText", "()Ljava/lang/String;", "id", "getId", "isMutuallyExclusive", "", "()Z", "Branch", "Leaf", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyAnswer$Branch;", "Lcom/reddit/domain/model/tagging/SubredditRatingSurveyAnswer$Leaf;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class SubredditRatingSurveyAnswer implements Parcelable
{
    private SubredditRatingSurveyAnswer() {
    }
    
    public abstract String getAnswerText();
    
    public abstract String getId();
    
    public abstract boolean isMutuallyExclusive();
}
