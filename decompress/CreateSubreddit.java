// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.communitycreation;

import ag0.a;
import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u00c6\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f" }, d2 = { "Lcom/reddit/domain/model/communitycreation/CreateSubreddit;", "", "name", "", "description", "privacyType", "Lcom/reddit/domain/model/communitycreation/SubredditPrivacyType;", "isNsfw", "", "subredditTopics", "Lcom/reddit/domain/model/communitycreation/CreateSubredditTopics;", "(Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/communitycreation/SubredditPrivacyType;ZLcom/reddit/domain/model/communitycreation/CreateSubredditTopics;)V", "getDescription", "()Ljava/lang/String;", "()Z", "getName", "getPrivacyType", "()Lcom/reddit/domain/model/communitycreation/SubredditPrivacyType;", "getSubredditTopics", "()Lcom/reddit/domain/model/communitycreation/CreateSubredditTopics;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class CreateSubreddit
{
    private final String description;
    private final boolean isNsfw;
    private final String name;
    private final SubredditPrivacyType privacyType;
    private final CreateSubredditTopics subredditTopics;
    
    public CreateSubreddit(final String name, final String description, final SubredditPrivacyType privacyType, final boolean isNsfw, final CreateSubredditTopics subredditTopics) {
        f.f((Object)name, "name");
        f.f((Object)description, "description");
        f.f((Object)privacyType, "privacyType");
        this.name = name;
        this.description = description;
        this.privacyType = privacyType;
        this.isNsfw = isNsfw;
        this.subredditTopics = subredditTopics;
    }
    
    public final String component1() {
        return this.name;
    }
    
    public final String component2() {
        return this.description;
    }
    
    public final SubredditPrivacyType component3() {
        return this.privacyType;
    }
    
    public final boolean component4() {
        return this.isNsfw;
    }
    
    public final CreateSubredditTopics component5() {
        return this.subredditTopics;
    }
    
    public final CreateSubreddit copy(final String s, final String s2, final SubredditPrivacyType subredditPrivacyType, final boolean b, final CreateSubredditTopics createSubredditTopics) {
        f.f((Object)s, "name");
        f.f((Object)s2, "description");
        f.f((Object)subredditPrivacyType, "privacyType");
        return new CreateSubreddit(s, s2, subredditPrivacyType, b, createSubredditTopics);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSubreddit)) {
            return false;
        }
        final CreateSubreddit createSubreddit = (CreateSubreddit)o;
        return f.a((Object)this.name, (Object)createSubreddit.name) && f.a((Object)this.description, (Object)createSubreddit.description) && this.privacyType == createSubreddit.privacyType && this.isNsfw == createSubreddit.isNsfw && f.a((Object)this.subredditTopics, (Object)createSubreddit.subredditTopics);
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final SubredditPrivacyType getPrivacyType() {
        return this.privacyType;
    }
    
    public final CreateSubredditTopics getSubredditTopics() {
        return this.subredditTopics;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.description, this.name.hashCode() * 31, 31);
        final int hashCode = this.privacyType.hashCode();
        int isNsfw;
        if ((isNsfw = (this.isNsfw ? 1 : 0)) != 0) {
            isNsfw = 1;
        }
        final CreateSubredditTopics subredditTopics = this.subredditTopics;
        int hashCode2;
        if (subredditTopics == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = subredditTopics.hashCode();
        }
        return ((hashCode + f) * 31 + isNsfw) * 31 + hashCode2;
    }
    
    public final boolean isNsfw() {
        return this.isNsfw;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CreateSubreddit(name=");
        k.append(this.name);
        k.append(", description=");
        k.append(this.description);
        k.append(", privacyType=");
        k.append(this.privacyType);
        k.append(", isNsfw=");
        k.append(this.isNsfw);
        k.append(", subredditTopics=");
        k.append(this.subredditTopics);
        k.append(')');
        return k.toString();
    }
}
