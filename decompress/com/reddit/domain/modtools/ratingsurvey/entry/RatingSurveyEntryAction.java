// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.ratingsurvey.entry;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004?\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X?\u0004?\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n?\u0006\u000b" }, d2 = { "Lcom/reddit/domain/modtools/ratingsurvey/entry/RatingSurveyEntryAction;", "", "()V", "position", "", "getPosition", "()I", "Click", "Impression", "Lcom/reddit/domain/modtools/ratingsurvey/entry/RatingSurveyEntryAction$Click;", "Lcom/reddit/domain/modtools/ratingsurvey/entry/RatingSurveyEntryAction$Impression;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class RatingSurveyEntryAction
{
    private RatingSurveyEntryAction() {
    }
    
    public RatingSurveyEntryAction(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    public abstract int getPosition();
}
