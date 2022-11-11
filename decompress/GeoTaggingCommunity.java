// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import com.reddit.domain.model.mod.ModPermissions;
import kotlin.Metadata;

@Metadata(d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a" }, d2 = { "Lcom/reddit/domain/model/GeoTaggingCommunity;", "", "subreddit", "Lcom/reddit/domain/model/Subreddit;", "modPermissions", "Lcom/reddit/domain/model/mod/ModPermissions;", "suggestion", "Lcom/reddit/domain/model/GeoAutocompleteSuggestion;", "(Lcom/reddit/domain/model/Subreddit;Lcom/reddit/domain/model/mod/ModPermissions;Lcom/reddit/domain/model/GeoAutocompleteSuggestion;)V", "getModPermissions", "()Lcom/reddit/domain/model/mod/ModPermissions;", "getSubreddit", "()Lcom/reddit/domain/model/Subreddit;", "getSuggestion", "()Lcom/reddit/domain/model/GeoAutocompleteSuggestion;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class GeoTaggingCommunity
{
    private final ModPermissions modPermissions;
    private final Subreddit subreddit;
    private final GeoAutocompleteSuggestion suggestion;
    
    public GeoTaggingCommunity(final Subreddit subreddit, final ModPermissions modPermissions, final GeoAutocompleteSuggestion suggestion) {
        f.f((Object)subreddit, "subreddit");
        this.subreddit = subreddit;
        this.modPermissions = modPermissions;
        this.suggestion = suggestion;
    }
    
    public final Subreddit component1() {
        return this.subreddit;
    }
    
    public final ModPermissions component2() {
        return this.modPermissions;
    }
    
    public final GeoAutocompleteSuggestion component3() {
        return this.suggestion;
    }
    
    public final GeoTaggingCommunity copy(final Subreddit subreddit, final ModPermissions modPermissions, final GeoAutocompleteSuggestion geoAutocompleteSuggestion) {
        f.f((Object)subreddit, "subreddit");
        return new GeoTaggingCommunity(subreddit, modPermissions, geoAutocompleteSuggestion);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GeoTaggingCommunity)) {
            return false;
        }
        final GeoTaggingCommunity geoTaggingCommunity = (GeoTaggingCommunity)o;
        return f.a((Object)this.subreddit, (Object)geoTaggingCommunity.subreddit) && f.a((Object)this.modPermissions, (Object)geoTaggingCommunity.modPermissions) && f.a((Object)this.suggestion, (Object)geoTaggingCommunity.suggestion);
    }
    
    public final ModPermissions getModPermissions() {
        return this.modPermissions;
    }
    
    public final Subreddit getSubreddit() {
        return this.subreddit;
    }
    
    public final GeoAutocompleteSuggestion getSuggestion() {
        return this.suggestion;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.subreddit.hashCode();
        final ModPermissions modPermissions = this.modPermissions;
        int hashCode2 = 0;
        int hashCode3;
        if (modPermissions == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = modPermissions.hashCode();
        }
        final GeoAutocompleteSuggestion suggestion = this.suggestion;
        if (suggestion != null) {
            hashCode2 = suggestion.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("GeoTaggingCommunity(subreddit=");
        k.append(this.subreddit);
        k.append(", modPermissions=");
        k.append(this.modPermissions);
        k.append(", suggestion=");
        k.append(this.suggestion);
        k.append(')');
        return k.toString();
    }
}
