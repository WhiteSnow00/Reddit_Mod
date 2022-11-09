// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.discover.model;

import androidx.viewpager.widget.c;
import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.DiscoverTopic;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\b¨\u0006\u0017" }, d2 = { "Lcom/reddit/domain/discover/model/LinkDiscoveryFeedItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/discover/model/LinkDiscoveryFeedItem;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "Lcom/reddit/domain/model/Link;", "linkAdapter", "Lcom/reddit/domain/discover/model/LinkDiscoveryFeedItem$Type;", "typeAdapter", "Lcom/reddit/domain/model/DiscoverTopic;", "discoverTopicAdapter", "", "booleanAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "public_release" }, k = 1, mv = { 1, 7, 1 })
public final class LinkDiscoveryFeedItemJsonAdapter extends JsonAdapter<LinkDiscoveryFeedItem>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<DiscoverTopic> discoverTopicAdapter;
    private final JsonAdapter<Link> linkAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<LinkDiscoveryFeedItem$Type> typeAdapter;
    
    public LinkDiscoveryFeedItemJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "width", "height", "link", "type", "topic", "isObfuscated" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "width");
        this.linkAdapter = (JsonAdapter<Link>)y.c((Type)Link.class, (Set)instance, "link");
        this.typeAdapter = (JsonAdapter<LinkDiscoveryFeedItem$Type>)y.c((Type)LinkDiscoveryFeedItem$Type.class, (Set)instance, "type");
        this.discoverTopicAdapter = (JsonAdapter<DiscoverTopic>)y.c((Type)DiscoverTopic.class, (Set)instance, "topic");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "isObfuscated");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        Object o2;
        Object o = o2 = null;
        Object o4;
        Object o3 = o4 = o2;
        Object o6;
        Object o5 = o6 = o4;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 6: {
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b != null) {
                        continue;
                    }
                    throw a.n("isObfuscated", "isObfuscated", jsonReader);
                }
                case 5: {
                    o6 = this.discoverTopicAdapter.fromJson(jsonReader);
                    if (o6 != null) {
                        continue;
                    }
                    throw a.n("topic", "topic", jsonReader);
                }
                case 4: {
                    o5 = this.typeAdapter.fromJson(jsonReader);
                    if (o5 != null) {
                        continue;
                    }
                    throw a.n("type", "type", jsonReader);
                }
                case 3: {
                    o4 = this.linkAdapter.fromJson(jsonReader);
                    if (o4 != null) {
                        continue;
                    }
                    throw a.n("link", "link", jsonReader);
                }
                case 2: {
                    o3 = this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 1: {
                    o2 = this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 0: {
                    o = this.stringAdapter.fromJson(jsonReader);
                    if (o != null) {
                        continue;
                    }
                    throw a.n("id", "id", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (o == null) {
            throw a.h("id", "id", jsonReader);
        }
        if (o4 == null) {
            throw a.h("link", "link", jsonReader);
        }
        if (o5 == null) {
            throw a.h("type", "type", jsonReader);
        }
        if (o6 == null) {
            throw a.h("topic", "topic", jsonReader);
        }
        if (b != null) {
            return new LinkDiscoveryFeedItem((String)o, (Integer)o2, (Integer)o3, (Link)o4, (LinkDiscoveryFeedItem.LinkDiscoveryFeedItem$Type)o5, (DiscoverTopic)o6, b);
        }
        throw a.h("isObfuscated", "isObfuscated", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final LinkDiscoveryFeedItem linkDiscoveryFeedItem = (LinkDiscoveryFeedItem)o;
        f.f((Object)x, "writer");
        if (linkDiscoveryFeedItem != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)linkDiscoveryFeedItem.a);
            x.w("width");
            this.nullableIntAdapter.toJson(x, (Object)linkDiscoveryFeedItem.b);
            x.w("height");
            this.nullableIntAdapter.toJson(x, (Object)linkDiscoveryFeedItem.c);
            x.w("link");
            this.linkAdapter.toJson(x, (Object)linkDiscoveryFeedItem.d);
            x.w("type");
            this.typeAdapter.toJson(x, (Object)linkDiscoveryFeedItem.e);
            x.w("topic");
            this.discoverTopicAdapter.toJson(x, (Object)linkDiscoveryFeedItem.f);
            x.w("isObfuscated");
            c.u(linkDiscoveryFeedItem.g, this.booleanAdapter, x);
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(LinkDiscoveryFeedItem)";
    }
}
