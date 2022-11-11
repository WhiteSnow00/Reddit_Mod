// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import id2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import com.reddit.domain.image.model.ImageResolution;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011¨\u0006\u001c" }, d2 = { "Lcom/reddit/domain/model/RedditorJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/Redditor;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lhg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/reddit/domain/image/model/ImageResolution;", "listOfImageResolutionAdapter", "nullableStringAdapter", "", "booleanAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class RedditorJsonAdapter extends JsonAdapter<Redditor>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<ImageResolution>> listOfImageResolutionAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public RedditorJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "userId", "username", "resizedIcons", "snoovatarIconUrl", "isNsfw" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "userId");
        this.listOfImageResolutionAdapter = (JsonAdapter<List<ImageResolution>>)y.c((Type)a0.d((Class)List.class, new Type[] { ImageResolution.class }), (Set)instance, "resizedIcons");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "snoovatarIconUrl");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "isNsfw");
    }
    
    public Redditor fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        Object o2;
        Object o = o2 = null;
        Object o4;
        Object o3 = o4 = o2;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            if (e != 3) {
                                if (e != 4) {
                                    continue;
                                }
                                b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                                if (b != null) {
                                    continue;
                                }
                                throw a.n("isNsfw", "isNsfw", jsonReader);
                            }
                            else {
                                o4 = this.nullableStringAdapter.fromJson(jsonReader);
                            }
                        }
                        else {
                            o3 = this.listOfImageResolutionAdapter.fromJson(jsonReader);
                            if (o3 != null) {
                                continue;
                            }
                            throw a.n("resizedIcons", "resizedIcons", jsonReader);
                        }
                    }
                    else {
                        o2 = this.stringAdapter.fromJson(jsonReader);
                        if (o2 != null) {
                            continue;
                        }
                        throw a.n("username", "username", jsonReader);
                    }
                }
                else {
                    o = this.stringAdapter.fromJson(jsonReader);
                    if (o != null) {
                        continue;
                    }
                    throw a.n("userId", "userId", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        if (o == null) {
            throw a.h("userId", "userId", jsonReader);
        }
        if (o2 == null) {
            throw a.h("username", "username", jsonReader);
        }
        if (o3 == null) {
            throw a.h("resizedIcons", "resizedIcons", jsonReader);
        }
        if (b != null) {
            return new Redditor((String)o, (String)o2, (List<ImageResolution>)o3, (String)o4, b);
        }
        throw a.h("isNsfw", "isNsfw", jsonReader);
    }
    
    public void toJson(final x x, final Redditor redditor) {
        e.f((Object)x, "writer");
        if (redditor != null) {
            x.h();
            x.u("userId");
            this.stringAdapter.toJson(x, (Object)redditor.getUserId());
            x.u("username");
            this.stringAdapter.toJson(x, (Object)redditor.getUsername());
            x.u("resizedIcons");
            this.listOfImageResolutionAdapter.toJson(x, (Object)redditor.getResizedIcons());
            x.u("snoovatarIconUrl");
            this.nullableStringAdapter.toJson(x, (Object)redditor.getSnoovatarIconUrl());
            x.u("isNsfw");
            this.booleanAdapter.toJson(x, (Object)redditor.isNsfw());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(Redditor)";
    }
}
