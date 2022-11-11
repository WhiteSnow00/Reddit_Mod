// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import com.squareup.moshi.x;
import qd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.listing.model.sort.SortType;
import com.reddit.listing.model.sort.SortTimeFrame;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016" }, d2 = { "Lcom/reddit/data/local/LinkKeyJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/data/local/LinkKey;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "Lcom/reddit/data/local/LinkKeyType;", "linkKeyTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/listing/model/sort/SortType;", "nullableSortTypeAdapter", "Lcom/reddit/listing/model/sort/SortTimeFrame;", "nullableSortTimeFrameAdapter", "", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "temp_release" }, k = 1, mv = { 1, 7, 1 })
public final class LinkKeyJsonAdapter extends JsonAdapter<LinkKey>
{
    private volatile Constructor<LinkKey> constructorRef;
    private final JsonAdapter<LinkKeyType> linkKeyTypeAdapter;
    private final JsonAdapter<SortTimeFrame> nullableSortTimeFrameAdapter;
    private final JsonAdapter<SortType> nullableSortTypeAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public LinkKeyJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "type", "sort", "sortTimeFrame", "after", "subredditName", "multiredditPath", "geoFilter", "categoryId" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.linkKeyTypeAdapter = (JsonAdapter<LinkKeyType>)y.c((Type)LinkKeyType.class, (Set)instance, "type");
        this.nullableSortTypeAdapter = (JsonAdapter<SortType>)y.c((Type)SortType.class, (Set)instance, "sort");
        this.nullableSortTimeFrameAdapter = (JsonAdapter<SortTimeFrame>)y.c((Type)SortTimeFrame.class, (Set)instance, "sortTimeFrame");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "after");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        LinkKeyType linkKeyType = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        Object o7 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 7: {
                    o7 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFF7F;
                    continue;
                }
                case 6: {
                    o6 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFBF;
                    continue;
                }
                case 5: {
                    o5 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFDF;
                    continue;
                }
                case 4: {
                    o4 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFEF;
                    continue;
                }
                case 3: {
                    o3 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFF7;
                    continue;
                }
                case 2: {
                    o2 = this.nullableSortTimeFrameAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFB;
                    continue;
                }
                case 1: {
                    o = this.nullableSortTypeAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFD;
                    continue;
                }
                case 0: {
                    linkKeyType = (LinkKeyType)this.linkKeyTypeAdapter.fromJson(jsonReader);
                    if (linkKeyType != null) {
                        continue;
                    }
                    throw a.n("type", "type", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        LinkKey linkKey;
        if (n == -255) {
            if (linkKeyType == null) {
                throw a.h("type", "type", jsonReader);
            }
            linkKey = new LinkKey(linkKeyType, (SortType)o, (SortTimeFrame)o2, (String)o3, (String)o4, (String)o5, (String)o6, (String)o7);
        }
        else {
            Constructor<LinkKey> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                constructorRef = LinkKey.class.getDeclaredConstructor(LinkKeyType.class, SortType.class, SortTimeFrame.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, a.c);
                f.e((Object)(this.constructorRef = constructorRef), "LinkKey::class.java.getD\u2026his.constructorRef = it }");
            }
            if (linkKeyType == null) {
                throw a.h("type", "type", jsonReader);
            }
            final LinkKey instance = constructorRef.newInstance(linkKeyType, o, o2, o3, o4, o5, o6, o7, n, null);
            f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            linkKey = instance;
        }
        return linkKey;
    }
    
    public final void toJson(final x x, final Object o) {
        final LinkKey linkKey = (LinkKey)o;
        f.f((Object)x, "writer");
        if (linkKey != null) {
            x.h();
            x.w("type");
            this.linkKeyTypeAdapter.toJson(x, (Object)linkKey.a);
            x.w("sort");
            this.nullableSortTypeAdapter.toJson(x, (Object)linkKey.b);
            x.w("sortTimeFrame");
            this.nullableSortTimeFrameAdapter.toJson(x, (Object)linkKey.c);
            x.w("after");
            this.nullableStringAdapter.toJson(x, (Object)linkKey.d);
            x.w("subredditName");
            this.nullableStringAdapter.toJson(x, (Object)linkKey.e);
            x.w("multiredditPath");
            this.nullableStringAdapter.toJson(x, (Object)linkKey.f);
            x.w("geoFilter");
            this.nullableStringAdapter.toJson(x, (Object)linkKey.g);
            x.w("categoryId");
            this.nullableStringAdapter.toJson(x, (Object)linkKey.h);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(LinkKey)";
    }
}
