// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import ah2.f;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012" }, d2 = { "Lcom/reddit/domain/model/streaming/ViewerStreamPrompt;", "", "prompt", "", "subredditName", "(Ljava/lang/String;Ljava/lang/String;)V", "getPrompt", "()Ljava/lang/String;", "getSubredditName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ViewerStreamPrompt
{
    private final String prompt;
    private final String subredditName;
    
    public ViewerStreamPrompt() {
        this(null, null, 3, null);
    }
    
    public ViewerStreamPrompt(final String prompt, @n(name = "subreddit_name") final String subredditName) {
        f.f((Object)prompt, "prompt");
        f.f((Object)subredditName, "subredditName");
        this.prompt = prompt;
        this.subredditName = subredditName;
    }
    
    public final String component1() {
        return this.prompt;
    }
    
    public final String component2() {
        return this.subredditName;
    }
    
    public final ViewerStreamPrompt copy(final String s, @n(name = "subreddit_name") final String s2) {
        f.f((Object)s, "prompt");
        f.f((Object)s2, "subredditName");
        return new ViewerStreamPrompt(s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ViewerStreamPrompt)) {
            return false;
        }
        final ViewerStreamPrompt viewerStreamPrompt = (ViewerStreamPrompt)o;
        return f.a((Object)this.prompt, (Object)viewerStreamPrompt.prompt) && f.a((Object)this.subredditName, (Object)viewerStreamPrompt.subredditName);
    }
    
    public final String getPrompt() {
        return this.prompt;
    }
    
    public final String getSubredditName() {
        return this.subredditName;
    }
    
    @Override
    public int hashCode() {
        return this.subredditName.hashCode() + this.prompt.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ViewerStreamPrompt(prompt=");
        k.append(this.prompt);
        k.append(", subredditName=");
        return b.k(k, this.subredditName, ')');
    }
}
