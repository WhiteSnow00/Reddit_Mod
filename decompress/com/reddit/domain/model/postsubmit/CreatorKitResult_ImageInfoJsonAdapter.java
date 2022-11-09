// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.postsubmit;

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
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012¨\u0006\u001c" }, d2 = { "Lcom/reddit/domain/model/postsubmit/CreatorKitResult_ImageInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/postsubmit/CreatorKitResult$ImageInfo;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableListOfStringAdapter", "nullableStringAdapter", "", "intAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class CreatorKitResult_ImageInfoJsonAdapter extends JsonAdapter<CreatorKitResult$ImageInfo>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public CreatorKitResult_ImageInfoJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "wasFlashUsed", "filterNames", "overlayTextLast", "overlayTextCount", "numPhotos", "crop", "wasOverlayDrawUsed" });
        final Class<Boolean> type = Boolean.TYPE;
        final EmptySet instance = EmptySet.INSTANCE;
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)type, (Set)instance, "wasFlashUsed");
        this.nullableListOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "filterNames");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "overlayTextLast");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "overlayTextCount");
    }
    
    public CreatorKitResult$ImageInfo fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        Boolean b = null;
        Serializable s2;
        Serializable s = s2 = null;
        Object o2;
        Object o = o2 = s2;
        Object o4;
        Object o3 = o4 = o2;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 6: {
                    o2 = this.booleanAdapter.fromJson(jsonReader);
                    if (o2 != null) {
                        continue;
                    }
                    throw a.n("wasOverlayDrawUsed", "wasOverlayDrawUsed", jsonReader);
                }
                case 5: {
                    o4 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    s2 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (s2 != null) {
                        continue;
                    }
                    throw a.n("numPhotos", "numPhotos", jsonReader);
                }
                case 3: {
                    s = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("overlayTextCount", "overlayTextCount", jsonReader);
                }
                case 2: {
                    o3 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 1: {
                    o = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 0: {
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b != null) {
                        continue;
                    }
                    throw a.n("wasFlashUsed", "wasFlashUsed", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (b == null) {
            throw a.h("wasFlashUsed", "wasFlashUsed", jsonReader);
        }
        final boolean booleanValue = b;
        if (s == null) {
            throw a.h("overlayTextCount", "overlayTextCount", jsonReader);
        }
        final int intValue = (int)s;
        if (s2 == null) {
            throw a.h("numPhotos", "numPhotos", jsonReader);
        }
        final int intValue2 = (int)s2;
        if (o2 != null) {
            return new CreatorKitResult$ImageInfo(booleanValue, (List)o, (String)o3, intValue, intValue2, (String)o4, (boolean)o2);
        }
        throw a.h("wasOverlayDrawUsed", "wasOverlayDrawUsed", jsonReader);
    }
    
    public void toJson(final x x, final CreatorKitResult$ImageInfo creatorKitResult$ImageInfo) {
        f.f((Object)x, "writer");
        if (creatorKitResult$ImageInfo != null) {
            x.h();
            x.w("wasFlashUsed");
            this.booleanAdapter.toJson(x, (Object)creatorKitResult$ImageInfo.getWasFlashUsed());
            x.w("filterNames");
            this.nullableListOfStringAdapter.toJson(x, (Object)creatorKitResult$ImageInfo.getFilterNames());
            x.w("overlayTextLast");
            this.nullableStringAdapter.toJson(x, (Object)creatorKitResult$ImageInfo.getOverlayTextLast());
            x.w("overlayTextCount");
            this.intAdapter.toJson(x, (Object)creatorKitResult$ImageInfo.getOverlayTextCount());
            x.w("numPhotos");
            this.intAdapter.toJson(x, (Object)creatorKitResult$ImageInfo.getNumPhotos());
            x.w("crop");
            this.nullableStringAdapter.toJson(x, (Object)creatorKitResult$ImageInfo.getCrop());
            x.w("wasOverlayDrawUsed");
            this.booleanAdapter.toJson(x, (Object)creatorKitResult$ImageInfo.getWasOverlayDrawUsed());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(CreatorKitResult.ImageInfo)";
    }
}
