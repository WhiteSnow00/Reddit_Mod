// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.search;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Iterator;
import android.os.Parcel;
import a2.b;
import ak0.n;
import ag0.a;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import com.reddit.domain.model.Subreddit;
import java.util.Map;
import com.reddit.domain.model.Link;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = {}, d1 = { "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001:\u0001DB\u009d\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\b\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\b\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bB\u0010CJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0004H\u00c6\u0003J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\bH\u00c6\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\bH\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J¯\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\b2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\b2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\"\u001a\u00020\u0004H\u00d6\u0001J\t\u0010$\u001a\u00020#H\u00d6\u0001J\u0013\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010)\u001a\u00020#H\u00d6\u0001J\u0019\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020#H\u00d6\u0001R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\b5\u00104R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u00102\u001a\u0004\b6\u00104R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001a\u00107\u001a\u0004\b8\u00109R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010:\u001a\u0004\b;\u0010<R#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\b8\u0006¢\u0006\f\n\u0004\b\u001c\u00107\u001a\u0004\b=\u00109R#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\b8\u0006¢\u0006\f\n\u0004\b\u001d\u00107\u001a\u0004\b>\u00109R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010:\u001a\u0004\b?\u0010<R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010:\u001a\u0004\b@\u0010<R\u0019\u0010 \u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u00102\u001a\u0004\bA\u00104¨\u0006E" }, d2 = { "Lcom/reddit/domain/model/search/SearchResults;", "Landroid/os/Parcelable;", "Lcom/reddit/domain/model/search/SearchResults$Type;", "component1", "", "component2", "component3", "component4", "", "Lcom/reddit/domain/model/Subreddit;", "component5", "", "Lcom/reddit/domain/model/Link;", "component6", "Lcom/reddit/domain/model/search/Topic;", "component7", "Lcom/reddit/domain/model/search/SuggestedQuery;", "component8", "Lcom/reddit/domain/model/search/DiscoveryUnitSearchResult;", "component9", "component10", "component11", "type", "query", "sort", "timeFrame", "subreddits", "links", "topics", "queries", "header", "body", "after", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lpg2/j;", "writeToParcel", "Lcom/reddit/domain/model/search/SearchResults$Type;", "getType", "()Lcom/reddit/domain/model/search/SearchResults$Type;", "Ljava/lang/String;", "getQuery", "()Ljava/lang/String;", "getSort", "getTimeFrame", "Ljava/util/Map;", "getSubreddits", "()Ljava/util/Map;", "Ljava/util/List;", "getLinks", "()Ljava/util/List;", "getTopics", "getQueries", "getHeader", "getBody", "getAfter", "<init>", "(Lcom/reddit/domain/model/search/SearchResults$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Type", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SearchResults implements Parcelable
{
    public static final Parcelable$Creator<SearchResults> CREATOR;
    private final String after;
    private final List<DiscoveryUnitSearchResult> body;
    private final List<DiscoveryUnitSearchResult> header;
    private final List<Link> links;
    private final Map<String, SuggestedQuery> queries;
    private final String query;
    private final String sort;
    private final Map<String, Subreddit> subreddits;
    private final String timeFrame;
    private final Map<String, Topic> topics;
    private final Type type;
    
    static {
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public SearchResults(final Type type, final String query, final String sort, final String timeFrame, final Map<String, Subreddit> subreddits, final List<Link> links, final Map<String, Topic> topics, final Map<String, SuggestedQuery> queries, final List<DiscoveryUnitSearchResult> header, final List<DiscoveryUnitSearchResult> body, final String after) {
        f.f((Object)type, "type");
        f.f((Object)query, "query");
        f.f((Object)sort, "sort");
        f.f((Object)timeFrame, "timeFrame");
        f.f((Object)subreddits, "subreddits");
        f.f((Object)links, "links");
        f.f((Object)topics, "topics");
        f.f((Object)queries, "queries");
        f.f((Object)header, "header");
        f.f((Object)body, "body");
        this.type = type;
        this.query = query;
        this.sort = sort;
        this.timeFrame = timeFrame;
        this.subreddits = subreddits;
        this.links = links;
        this.topics = topics;
        this.queries = queries;
        this.header = header;
        this.body = body;
        this.after = after;
    }
    
    public SearchResults(final Type type, final String s, final String s2, final String s3, final Map map, final List list, final Map map2, final Map map3, List instance, List instance2, String s4, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x100) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        if ((n & 0x200) != 0x0) {
            instance2 = EmptyList.INSTANCE;
        }
        if ((n & 0x400) != 0x0) {
            s4 = null;
        }
        this(type, s, s2, s3, map, list, map2, map3, (List<DiscoveryUnitSearchResult>)instance, (List<DiscoveryUnitSearchResult>)instance2, s4);
    }
    
    public final Type component1() {
        return this.type;
    }
    
    public final List<DiscoveryUnitSearchResult> component10() {
        return this.body;
    }
    
    public final String component11() {
        return this.after;
    }
    
    public final String component2() {
        return this.query;
    }
    
    public final String component3() {
        return this.sort;
    }
    
    public final String component4() {
        return this.timeFrame;
    }
    
    public final Map<String, Subreddit> component5() {
        return this.subreddits;
    }
    
    public final List<Link> component6() {
        return this.links;
    }
    
    public final Map<String, Topic> component7() {
        return this.topics;
    }
    
    public final Map<String, SuggestedQuery> component8() {
        return this.queries;
    }
    
    public final List<DiscoveryUnitSearchResult> component9() {
        return this.header;
    }
    
    public final SearchResults copy(final Type type, final String s, final String s2, final String s3, final Map<String, Subreddit> map, final List<Link> list, final Map<String, Topic> map2, final Map<String, SuggestedQuery> map3, final List<DiscoveryUnitSearchResult> list2, final List<DiscoveryUnitSearchResult> list3, final String s4) {
        f.f((Object)type, "type");
        f.f((Object)s, "query");
        f.f((Object)s2, "sort");
        f.f((Object)s3, "timeFrame");
        f.f((Object)map, "subreddits");
        f.f((Object)list, "links");
        f.f((Object)map2, "topics");
        f.f((Object)map3, "queries");
        f.f((Object)list2, "header");
        f.f((Object)list3, "body");
        return new SearchResults(type, s, s2, s3, map, list, map2, map3, list2, list3, s4);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchResults)) {
            return false;
        }
        final SearchResults searchResults = (SearchResults)o;
        return this.type == searchResults.type && f.a((Object)this.query, (Object)searchResults.query) && f.a((Object)this.sort, (Object)searchResults.sort) && f.a((Object)this.timeFrame, (Object)searchResults.timeFrame) && f.a((Object)this.subreddits, (Object)searchResults.subreddits) && f.a((Object)this.links, (Object)searchResults.links) && f.a((Object)this.topics, (Object)searchResults.topics) && f.a((Object)this.queries, (Object)searchResults.queries) && f.a((Object)this.header, (Object)searchResults.header) && f.a((Object)this.body, (Object)searchResults.body) && f.a((Object)this.after, (Object)searchResults.after);
    }
    
    public final String getAfter() {
        return this.after;
    }
    
    public final List<DiscoveryUnitSearchResult> getBody() {
        return this.body;
    }
    
    public final List<DiscoveryUnitSearchResult> getHeader() {
        return this.header;
    }
    
    public final List<Link> getLinks() {
        return this.links;
    }
    
    public final Map<String, SuggestedQuery> getQueries() {
        return this.queries;
    }
    
    public final String getQuery() {
        return this.query;
    }
    
    public final String getSort() {
        return this.sort;
    }
    
    public final Map<String, Subreddit> getSubreddits() {
        return this.subreddits;
    }
    
    public final String getTimeFrame() {
        return this.timeFrame;
    }
    
    public final Map<String, Topic> getTopics() {
        return this.topics;
    }
    
    public final Type getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final int a = b.a((List)this.body, b.a((List)this.header, n.g((Map)this.queries, n.g((Map)this.topics, b.a((List)this.links, n.g((Map)this.subreddits, ag0.a.f(this.timeFrame, ag0.a.f(this.sort, ag0.a.f(this.query, this.type.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        final String after = this.after;
        int hashCode;
        if (after == null) {
            hashCode = 0;
        }
        else {
            hashCode = after.hashCode();
        }
        return a + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SearchResults(type=");
        k.append(this.type);
        k.append(", query=");
        k.append(this.query);
        k.append(", sort=");
        k.append(this.sort);
        k.append(", timeFrame=");
        k.append(this.timeFrame);
        k.append(", subreddits=");
        k.append(this.subreddits);
        k.append(", links=");
        k.append(this.links);
        k.append(", topics=");
        k.append(this.topics);
        k.append(", queries=");
        k.append(this.queries);
        k.append(", header=");
        k.append(this.header);
        k.append(", body=");
        k.append(this.body);
        k.append(", after=");
        return b.k(k, this.after, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        f.f((Object)parcel, "out");
        parcel.writeString(this.type.name());
        parcel.writeString(this.query);
        parcel.writeString(this.sort);
        parcel.writeString(this.timeFrame);
        final Map<String, Subreddit> subreddits = this.subreddits;
        parcel.writeInt(subreddits.size());
        for (final Map.Entry<String, V> entry : subreddits.entrySet()) {
            parcel.writeString((String)entry.getKey());
            ((Subreddit)entry.getValue()).writeToParcel(parcel, n);
        }
        final Iterator n2 = b.n((List)this.links, parcel);
        while (n2.hasNext()) {
            ((Link)n2.next()).writeToParcel(parcel, n);
        }
        final Map<String, Topic> topics = this.topics;
        parcel.writeInt(topics.size());
        for (final Map.Entry<String, V> entry2 : topics.entrySet()) {
            parcel.writeString((String)entry2.getKey());
            ((Topic)entry2.getValue()).writeToParcel(parcel, n);
        }
        final Map<String, SuggestedQuery> queries = this.queries;
        parcel.writeInt(queries.size());
        for (final Map.Entry<String, V> entry3 : queries.entrySet()) {
            parcel.writeString((String)entry3.getKey());
            ((SuggestedQuery)entry3.getValue()).writeToParcel(parcel, n);
        }
        final Iterator n3 = b.n((List)this.header, parcel);
        while (n3.hasNext()) {
            ((DiscoveryUnitSearchResult)n3.next()).writeToParcel(parcel, n);
        }
        final Iterator n4 = b.n((List)this.body, parcel);
        while (n4.hasNext()) {
            ((DiscoveryUnitSearchResult)n4.next()).writeToParcel(parcel, n);
        }
        parcel.writeString(this.after);
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<SearchResults>
    {
        public final SearchResults createFromParcel(final Parcel parcel) {
            f.f((Object)parcel, "parcel");
            final Type value = Type.valueOf(parcel.readString());
            final String string = parcel.readString();
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            final int int1 = parcel.readInt();
            final LinkedHashMap linkedHashMap = new LinkedHashMap(int1);
            final int n = 0;
            for (int i = 0; i != int1; ++i) {
                linkedHashMap.put((Object)parcel.readString(), Subreddit.CREATOR.createFromParcel(parcel));
            }
            final int int2 = parcel.readInt();
            final ArrayList list = new ArrayList(int2);
            for (int j = 0; j != int2; j = a.c((Parcelable$Creator)Link.CREATOR, parcel, list, j, 1)) {}
            final int int3 = parcel.readInt();
            final LinkedHashMap linkedHashMap2 = new LinkedHashMap(int3);
            for (int k = 0; k != int3; ++k) {
                linkedHashMap2.put((Object)parcel.readString(), Topic.CREATOR.createFromParcel(parcel));
            }
            final int int4 = parcel.readInt();
            final LinkedHashMap linkedHashMap3 = new LinkedHashMap<String, SuggestedQuery>(int4);
            for (int l = 0; l != int4; ++l) {
                linkedHashMap3.put(parcel.readString(), (SuggestedQuery)SuggestedQuery.CREATOR.createFromParcel(parcel));
            }
            final int int5 = parcel.readInt();
            final ArrayList list2 = new ArrayList<DiscoveryUnitSearchResult>(int5);
            for (int c = 0; c != int5; c = a.c(DiscoveryUnitSearchResult.CREATOR, parcel, list2, c, 1)) {}
            final int int6 = parcel.readInt();
            final ArrayList list3 = new ArrayList<DiscoveryUnitSearchResult>(int6);
            for (int c2 = n; c2 != int6; c2 = a.c(DiscoveryUnitSearchResult.CREATOR, parcel, list3, c2, 1)) {}
            return new SearchResults(value, string, string2, string3, (Map<String, Subreddit>)linkedHashMap, (List<Link>)list, (Map<String, Topic>)linkedHashMap2, (Map<String, SuggestedQuery>)linkedHashMap3, (List<DiscoveryUnitSearchResult>)list2, (List<DiscoveryUnitSearchResult>)list3, parcel.readString());
        }
        
        public final SearchResults[] newArray(final int n) {
            return new SearchResults[n];
        }
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Lcom/reddit/domain/model/search/SearchResults$Type;", "", "(Ljava/lang/String;I)V", "TRENDING", "DEFAULT", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Type
    {
        DEFAULT, 
        TRENDING;
    }
}
