// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.communitycreation;

import ah2.f;
import com.reddit.domain.model.Subreddit;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0007H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017" }, d2 = { "Lcom/reddit/domain/model/communitycreation/CreateSubredditResult;", "", "subreddit", "Lcom/reddit/domain/model/Subreddit;", "isValid", "", "errorMessage", "", "(Lcom/reddit/domain/model/Subreddit;ZLjava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "()Z", "getSubreddit", "()Lcom/reddit/domain/model/Subreddit;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class CreateSubredditResult
{
    private final String errorMessage;
    private final boolean isValid;
    private final Subreddit subreddit;
    
    public CreateSubredditResult(final Subreddit subreddit, final boolean isValid, final String errorMessage) {
        this.subreddit = subreddit;
        this.isValid = isValid;
        this.errorMessage = errorMessage;
    }
    
    public final Subreddit component1() {
        return this.subreddit;
    }
    
    public final boolean component2() {
        return this.isValid;
    }
    
    public final String component3() {
        return this.errorMessage;
    }
    
    public final CreateSubredditResult copy(final Subreddit subreddit, final boolean b, final String s) {
        return new CreateSubredditResult(subreddit, b, s);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSubredditResult)) {
            return false;
        }
        final CreateSubredditResult createSubredditResult = (CreateSubredditResult)o;
        return f.a((Object)this.subreddit, (Object)createSubredditResult.subreddit) && this.isValid == createSubredditResult.isValid && f.a((Object)this.errorMessage, (Object)createSubredditResult.errorMessage);
    }
    
    public final String getErrorMessage() {
        return this.errorMessage;
    }
    
    public final Subreddit getSubreddit() {
        return this.subreddit;
    }
    
    @Override
    public int hashCode() {
        final Subreddit subreddit = this.subreddit;
        int hashCode = 0;
        int hashCode2;
        if (subreddit == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = subreddit.hashCode();
        }
        int isValid;
        if ((isValid = (this.isValid ? 1 : 0)) != 0) {
            isValid = 1;
        }
        final String errorMessage = this.errorMessage;
        if (errorMessage != null) {
            hashCode = errorMessage.hashCode();
        }
        return (hashCode2 * 31 + isValid) * 31 + hashCode;
    }
    
    public final boolean isValid() {
        return this.isValid;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CreateSubredditResult(subreddit=");
        k.append(this.subreddit);
        k.append(", isValid=");
        k.append(this.isValid);
        k.append(", errorMessage=");
        return b.k(k, this.errorMessage, ')');
    }
}
