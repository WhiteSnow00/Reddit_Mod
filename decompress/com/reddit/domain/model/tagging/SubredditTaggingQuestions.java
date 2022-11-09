// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u00c6\u0003J?\u0010\u0018\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 " }, d2 = { "Lcom/reddit/domain/model/tagging/SubredditTaggingQuestions;", "", "crowdsourceTaggingQuestion", "", "Lcom/reddit/domain/model/tagging/CrowdsourceTaggingQuestion;", "subredditRatingSurvey", "Lcom/reddit/domain/model/tagging/SubredditRatingSurvey;", "newCommunityProgressModule", "Lcom/reddit/domain/model/tagging/NewCommunityProgressModule;", "newCommunityProgressV2Module", "Lcom/reddit/domain/model/tagging/NewCommunityProgressModuleV2;", "(Ljava/util/List;Lcom/reddit/domain/model/tagging/SubredditRatingSurvey;Lcom/reddit/domain/model/tagging/NewCommunityProgressModule;Lcom/reddit/domain/model/tagging/NewCommunityProgressModuleV2;)V", "getCrowdsourceTaggingQuestion", "()Ljava/util/List;", "getNewCommunityProgressModule", "()Lcom/reddit/domain/model/tagging/NewCommunityProgressModule;", "getNewCommunityProgressV2Module", "()Lcom/reddit/domain/model/tagging/NewCommunityProgressModuleV2;", "getSubredditRatingSurvey", "()Lcom/reddit/domain/model/tagging/SubredditRatingSurvey;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditTaggingQuestions
{
    private final List<CrowdsourceTaggingQuestion> crowdsourceTaggingQuestion;
    private final NewCommunityProgressModule newCommunityProgressModule;
    private final NewCommunityProgressModuleV2 newCommunityProgressV2Module;
    private final SubredditRatingSurvey subredditRatingSurvey;
    
    public SubredditTaggingQuestions(final List<CrowdsourceTaggingQuestion> crowdsourceTaggingQuestion, final SubredditRatingSurvey subredditRatingSurvey, final NewCommunityProgressModule newCommunityProgressModule, final NewCommunityProgressModuleV2 newCommunityProgressV2Module) {
        this.crowdsourceTaggingQuestion = crowdsourceTaggingQuestion;
        this.subredditRatingSurvey = subredditRatingSurvey;
        this.newCommunityProgressModule = newCommunityProgressModule;
        this.newCommunityProgressV2Module = newCommunityProgressV2Module;
    }
    
    public final List<CrowdsourceTaggingQuestion> component1() {
        return this.crowdsourceTaggingQuestion;
    }
    
    public final SubredditRatingSurvey component2() {
        return this.subredditRatingSurvey;
    }
    
    public final NewCommunityProgressModule component3() {
        return this.newCommunityProgressModule;
    }
    
    public final NewCommunityProgressModuleV2 component4() {
        return this.newCommunityProgressV2Module;
    }
    
    public final SubredditTaggingQuestions copy(final List<CrowdsourceTaggingQuestion> list, final SubredditRatingSurvey subredditRatingSurvey, final NewCommunityProgressModule newCommunityProgressModule, final NewCommunityProgressModuleV2 newCommunityProgressModuleV2) {
        return new SubredditTaggingQuestions(list, subredditRatingSurvey, newCommunityProgressModule, newCommunityProgressModuleV2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditTaggingQuestions)) {
            return false;
        }
        final SubredditTaggingQuestions subredditTaggingQuestions = (SubredditTaggingQuestions)o;
        return f.a((Object)this.crowdsourceTaggingQuestion, (Object)subredditTaggingQuestions.crowdsourceTaggingQuestion) && f.a((Object)this.subredditRatingSurvey, (Object)subredditTaggingQuestions.subredditRatingSurvey) && f.a((Object)this.newCommunityProgressModule, (Object)subredditTaggingQuestions.newCommunityProgressModule) && f.a((Object)this.newCommunityProgressV2Module, (Object)subredditTaggingQuestions.newCommunityProgressV2Module);
    }
    
    public final List<CrowdsourceTaggingQuestion> getCrowdsourceTaggingQuestion() {
        return this.crowdsourceTaggingQuestion;
    }
    
    public final NewCommunityProgressModule getNewCommunityProgressModule() {
        return this.newCommunityProgressModule;
    }
    
    public final NewCommunityProgressModuleV2 getNewCommunityProgressV2Module() {
        return this.newCommunityProgressV2Module;
    }
    
    public final SubredditRatingSurvey getSubredditRatingSurvey() {
        return this.subredditRatingSurvey;
    }
    
    @Override
    public int hashCode() {
        final List<CrowdsourceTaggingQuestion> crowdsourceTaggingQuestion = this.crowdsourceTaggingQuestion;
        int hashCode = 0;
        int hashCode2;
        if (crowdsourceTaggingQuestion == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = crowdsourceTaggingQuestion.hashCode();
        }
        final SubredditRatingSurvey subredditRatingSurvey = this.subredditRatingSurvey;
        int hashCode3;
        if (subredditRatingSurvey == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = subredditRatingSurvey.hashCode();
        }
        final NewCommunityProgressModule newCommunityProgressModule = this.newCommunityProgressModule;
        int hashCode4;
        if (newCommunityProgressModule == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = newCommunityProgressModule.hashCode();
        }
        final NewCommunityProgressModuleV2 newCommunityProgressV2Module = this.newCommunityProgressV2Module;
        if (newCommunityProgressV2Module != null) {
            hashCode = newCommunityProgressV2Module.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditTaggingQuestions(crowdsourceTaggingQuestion=");
        k.append(this.crowdsourceTaggingQuestion);
        k.append(", subredditRatingSurvey=");
        k.append(this.subredditRatingSurvey);
        k.append(", newCommunityProgressModule=");
        k.append(this.newCommunityProgressModule);
        k.append(", newCommunityProgressV2Module=");
        k.append(this.newCommunityProgressV2Module);
        k.append(')');
        return k.toString();
    }
}
