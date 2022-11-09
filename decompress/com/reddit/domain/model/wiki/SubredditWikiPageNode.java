// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.wiki;

import androidx.appcompat.widget.s0;
import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003JH\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/model/wiki/SubredditWikiPageNode;", "", "path", "", "parent", "name", "depth", "", "isPagePresent", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "getDepth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "getName", "()Ljava/lang/String;", "getParent", "getPath", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/reddit/domain/model/wiki/SubredditWikiPageNode;", "equals", "other", "hashCode", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditWikiPageNode
{
    private final Integer depth;
    private final boolean isPagePresent;
    private final String name;
    private final String parent;
    private final String path;
    
    public SubredditWikiPageNode(final String path, final String parent, final String name, final Integer depth, final boolean isPagePresent) {
        this.path = path;
        this.parent = parent;
        this.name = name;
        this.depth = depth;
        this.isPagePresent = isPagePresent;
    }
    
    public final String component1() {
        return this.path;
    }
    
    public final String component2() {
        return this.parent;
    }
    
    public final String component3() {
        return this.name;
    }
    
    public final Integer component4() {
        return this.depth;
    }
    
    public final boolean component5() {
        return this.isPagePresent;
    }
    
    public final SubredditWikiPageNode copy(final String s, final String s2, final String s3, final Integer n, final boolean b) {
        return new SubredditWikiPageNode(s, s2, s3, n, b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditWikiPageNode)) {
            return false;
        }
        final SubredditWikiPageNode subredditWikiPageNode = (SubredditWikiPageNode)o;
        return f.a((Object)this.path, (Object)subredditWikiPageNode.path) && f.a((Object)this.parent, (Object)subredditWikiPageNode.parent) && f.a((Object)this.name, (Object)subredditWikiPageNode.name) && f.a((Object)this.depth, (Object)subredditWikiPageNode.depth) && this.isPagePresent == subredditWikiPageNode.isPagePresent;
    }
    
    public final Integer getDepth() {
        return this.depth;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final String getParent() {
        return this.parent;
    }
    
    public final String getPath() {
        return this.path;
    }
    
    @Override
    public int hashCode() {
        final String path = this.path;
        int hashCode = 0;
        int hashCode2;
        if (path == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = path.hashCode();
        }
        final String parent = this.parent;
        int hashCode3;
        if (parent == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = parent.hashCode();
        }
        final String name = this.name;
        int hashCode4;
        if (name == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = name.hashCode();
        }
        final Integer depth = this.depth;
        if (depth != null) {
            hashCode = depth.hashCode();
        }
        int isPagePresent;
        if ((isPagePresent = (this.isPagePresent ? 1 : 0)) != 0) {
            isPagePresent = 1;
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode) * 31 + isPagePresent;
    }
    
    public final boolean isPagePresent() {
        return this.isPagePresent;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditWikiPageNode(path=");
        k.append(this.path);
        k.append(", parent=");
        k.append(this.parent);
        k.append(", name=");
        k.append(this.name);
        k.append(", depth=");
        k.append(this.depth);
        k.append(", isPagePresent=");
        return s0.o(k, this.isPagePresent, ')');
    }
}
