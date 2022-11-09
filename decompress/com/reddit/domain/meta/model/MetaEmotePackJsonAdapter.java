// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.meta.model;

import com.squareup.moshi.x;
import java.io.Serializable;
import qd2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ah2.f;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.common.customemojis.Emote;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u0006\u0013" }, d2 = { "Lcom/reddit/domain/meta/model/MetaEmotePackJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/meta/model/MetaEmotePack;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfStringAdapter", "Lcom/reddit/common/customemojis/Emote;", "listOfEmoteAdapter", "", "nullableIntAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class MetaEmotePackJsonAdapter extends JsonAdapter<MetaEmotePack>
{
    private final JsonAdapter<List<Emote>> listOfEmoteAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public MetaEmotePackJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "subredditId", "title", "collectionTitles", "emotes", "position" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.listOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "collectionTitles");
        this.listOfEmoteAdapter = (JsonAdapter<List<Emote>>)y.c((Type)a0.d((Class)List.class, new Type[] { Emote.class }), (Set)instance, "emotes");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "position");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Serializable s2;
        Serializable s = s2 = null;
        Object o;
        String s3 = (String)(o = s2);
        Object o3;
        Object o2 = o3 = o;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 5: {
                    o3 = this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    o2 = this.listOfEmoteAdapter.fromJson(jsonReader);
                    if (o2 != null) {
                        continue;
                    }
                    throw a.n("emotes", "emotes", jsonReader);
                }
                case 3: {
                    o = this.listOfStringAdapter.fromJson(jsonReader);
                    if (o != null) {
                        continue;
                    }
                    throw a.n("collectionTitles", "collectionTitles", jsonReader);
                }
                case 2: {
                    s3 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s3 != null) {
                        continue;
                    }
                    throw a.n("title", "title", jsonReader);
                }
                case 1: {
                    s2 = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s2 != null) {
                        continue;
                    }
                    throw a.n("subredditId", "subredditId", jsonReader);
                }
                case 0: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
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
        if (s == null) {
            throw a.h("id", "id", jsonReader);
        }
        if (s2 == null) {
            throw a.h("subredditId", "subredditId", jsonReader);
        }
        if (s3 == null) {
            throw a.h("title", "title", jsonReader);
        }
        if (o == null) {
            throw a.h("collectionTitles", "collectionTitles", jsonReader);
        }
        if (o2 != null) {
            return new MetaEmotePack((String)s, (String)s2, s3, (List)o, (List)o2, (Integer)o3);
        }
        throw a.h("emotes", "emotes", jsonReader);
    }
    
    public final void toJson(final x x, final Object o) {
        final MetaEmotePack metaEmotePack = (MetaEmotePack)o;
        f.f((Object)x, "writer");
        if (metaEmotePack != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)metaEmotePack.f);
            x.w("subredditId");
            this.stringAdapter.toJson(x, (Object)metaEmotePack.g);
            x.w("title");
            this.stringAdapter.toJson(x, (Object)metaEmotePack.h);
            x.w("collectionTitles");
            this.listOfStringAdapter.toJson(x, (Object)metaEmotePack.i);
            x.w("emotes");
            this.listOfEmoteAdapter.toJson(x, (Object)metaEmotePack.j);
            x.w("position");
            this.nullableIntAdapter.toJson(x, (Object)metaEmotePack.k);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(MetaEmotePack)";
    }
}
