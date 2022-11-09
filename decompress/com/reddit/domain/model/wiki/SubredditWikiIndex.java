// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.wiki;

import qg2.m;
import java.util.ArrayList;
import zg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;
import kotlin.text.a;
import a40.f;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H\u00c6\u0003J)\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\t\u0010\u0017\u001a\u00020\u0015H\u00d6\u0001R\u001b\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/model/wiki/SubredditWikiIndex;", "", "status", "Lcom/reddit/domain/model/wiki/SubredditWikiPageStatus;", "pageTree", "", "Lcom/reddit/domain/model/wiki/SubredditWikiPageNode;", "(Lcom/reddit/domain/model/wiki/SubredditWikiPageStatus;Ljava/util/List;)V", "getPageTree", "()Ljava/util/List;", "getStatus", "()Lcom/reddit/domain/model/wiki/SubredditWikiPageStatus;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toRichText", "", "subredditName", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditWikiIndex
{
    private final List<SubredditWikiPageNode> pageTree;
    private final SubredditWikiPageStatus status;
    
    public SubredditWikiIndex(final SubredditWikiPageStatus status, final List<SubredditWikiPageNode> pageTree) {
        this.status = status;
        this.pageTree = pageTree;
    }
    
    private static final String toRichText$document(final String s) {
        return f.n("\n      {\n        \"document\": [\n          ", s, "\n        ]\n      }\n    ");
    }
    
    private static final String toRichText$link(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("\n      {\n        \"c\": [{\n          \"u\": \"");
        sb.append(s2);
        sb.append("\",\n          \"e\": \"link\",\n          \"t\": \"");
        sb.append(s);
        sb.append("\"\n        }],\n        \"e\": \"par\"\n      }\n      ");
        return a.N1(sb.toString());
    }
    
    private static final String toRichText$list(final List<String> list, final Iterator<Integer> iterator) {
        return CollectionsKt___CollectionsKt.y1((Iterable)list, (CharSequence)null, "\n        {\n          \"c\": [\n      ", "\n           ],\n          \"e\": \"list\",\n          \"o\": false\n        }\n      ", (l)new SubredditWikiIndex$toRichText$list$1((Iterator)iterator), 25);
    }
    
    private static final String toRichText$text(final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append("\n     {\n        \"c\": [{\n          \"e\": \"text\",\n          \"t\": \"");
        sb.append(s);
        sb.append("\"\n        }],\n        \"e\": \"par\"\n      }\n      ");
        return a.N1(sb.toString());
    }
    
    public final SubredditWikiPageStatus component1() {
        return this.status;
    }
    
    public final List<SubredditWikiPageNode> component2() {
        return this.pageTree;
    }
    
    public final SubredditWikiIndex copy(final SubredditWikiPageStatus subredditWikiPageStatus, final List<SubredditWikiPageNode> list) {
        return new SubredditWikiIndex(subredditWikiPageStatus, list);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditWikiIndex)) {
            return false;
        }
        final SubredditWikiIndex subredditWikiIndex = (SubredditWikiIndex)o;
        return this.status == subredditWikiIndex.status && ah2.f.a((Object)this.pageTree, (Object)subredditWikiIndex.pageTree);
    }
    
    public final List<SubredditWikiPageNode> getPageTree() {
        return this.pageTree;
    }
    
    public final SubredditWikiPageStatus getStatus() {
        return this.status;
    }
    
    @Override
    public int hashCode() {
        final SubredditWikiPageStatus status = this.status;
        int hashCode = 0;
        int hashCode2;
        if (status == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = status.hashCode();
        }
        final List<SubredditWikiPageNode> pageTree = this.pageTree;
        if (pageTree != null) {
            hashCode = pageTree.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    public final String toRichText(final String s) {
        ah2.f.f((Object)s, "subredditName");
        final List<SubredditWikiPageNode> pageTree = this.pageTree;
        if (pageTree == null) {
            return null;
        }
        final ArrayList list = new ArrayList();
        final Iterator<Object> iterator = pageTree.iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            boolean b = false;
            if (!hasNext) {
                break;
            }
            final SubredditWikiPageNode next = iterator.next();
            final SubredditWikiPageNode subredditWikiPageNode = next;
            String path;
            if (subredditWikiPageNode != null) {
                path = subredditWikiPageNode.getPath();
            }
            else {
                path = null;
            }
            if (path != null) {
                b = true;
            }
            if (!b) {
                continue;
            }
            list.add(next);
        }
        if (list.isEmpty()) {
            return null;
        }
        final ArrayList list2 = new ArrayList<String>(m.P0((Iterable)list, 10));
        for (final SubredditWikiPageNode subredditWikiPageNode2 : list) {
            String s2;
            if (subredditWikiPageNode2.isPagePresent()) {
                final String path2 = subredditWikiPageNode2.getPath();
                ah2.f.c((Object)path2);
                final StringBuilder sb = new StringBuilder();
                sb.append("http://reddit.com/r/");
                sb.append(s);
                sb.append("/wiki/");
                sb.append(subredditWikiPageNode2.getPath());
                s2 = toRichText$link(path2, sb.toString());
            }
            else {
                final String path3 = subredditWikiPageNode2.getPath();
                ah2.f.c((Object)path3);
                s2 = toRichText$text(path3);
            }
            list2.add(s2);
        }
        final ArrayList list3 = new ArrayList(m.P0((Iterable)list, 10));
        final Iterator iterator3 = list.iterator();
        while (iterator3.hasNext()) {
            final Integer depth = ((SubredditWikiPageNode)iterator3.next()).getDepth();
            int intValue;
            if (depth != null) {
                intValue = depth;
            }
            else {
                intValue = 0;
            }
            list3.add((Object)intValue);
        }
        return toRichText$document(toRichText$list((List<String>)list2, list3.iterator()));
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditWikiIndex(status=");
        k.append(this.status);
        k.append(", pageTree=");
        return ak0.m.n(k, (List)this.pageTree, ')');
    }
}
