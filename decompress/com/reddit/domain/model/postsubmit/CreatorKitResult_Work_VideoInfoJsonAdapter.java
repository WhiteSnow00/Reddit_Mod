// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.postsubmit;

import com.squareup.moshi.x;
import dd2.a;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.a0;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\"" }, d2 = { "Lcom/reddit/domain/model/postsubmit/CreatorKitResult_Work_VideoInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/postsubmit/CreatorKitResult$Work$VideoInfo;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lcg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "", "booleanAdapter", "", "nullableListOfStringAdapter", "nullableStringAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class CreatorKitResult_Work_VideoInfoJsonAdapter extends JsonAdapter<CreatorKitResult$Work$VideoInfo>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CreatorKitResult$Work$VideoInfo> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public CreatorKitResult_Work_VideoInfoJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "mediaType", "duration", "wasFlashUsed", "wasTimerUsed", "filterNames", "overlayTextLast", "overlayTextCount", "numSegments", "numSegmentsRecorded", "numSegmentsUploaded", "numPhotos", "wasOverlayDrawUsed", "reactedFrom" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "mediaType");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "duration");
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.TYPE, (Set)instance, "wasFlashUsed");
        this.nullableListOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "filterNames");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "overlayTextLast");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "overlayTextCount");
    }
    
    public CreatorKitResult$Work$VideoInfo fromJson(final JsonReader jsonReader) {
        final Class<String> clazz = String.class;
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Long n2 = null;
        String s = null;
        Boolean b = null;
        Boolean b2 = null;
        Integer n3 = null;
        Integer n4 = null;
        Object o = null;
        Object o2 = null;
        Integer n5 = null;
        Integer n6 = null;
        Integer n7 = null;
        Boolean b3 = null;
        Object o3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.E(this.options)) {
                default: {
                    continue;
                }
                case 12: {
                    o3 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFEFFF;
                    continue;
                }
                case 11: {
                    b3 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b3 != null) {
                        continue;
                    }
                    throw a.n("wasOverlayDrawUsed", "wasOverlayDrawUsed", jsonReader);
                }
                case 10: {
                    n7 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n7 != null) {
                        continue;
                    }
                    throw a.n("numPhotos", "numPhotos", jsonReader);
                }
                case 9: {
                    n6 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n6 != null) {
                        continue;
                    }
                    throw a.n("numSegmentsUploaded", "numSegmentsUploaded", jsonReader);
                }
                case 8: {
                    n5 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n5 != null) {
                        continue;
                    }
                    throw a.n("numSegmentsRecorded", "numSegmentsRecorded", jsonReader);
                }
                case 7: {
                    n4 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n4 != null) {
                        continue;
                    }
                    throw a.n("numSegments", "numSegments", jsonReader);
                }
                case 6: {
                    n3 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n3 != null) {
                        continue;
                    }
                    throw a.n("overlayTextCount", "overlayTextCount", jsonReader);
                }
                case 5: {
                    o2 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 4: {
                    o = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    b2 = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b2 != null) {
                        continue;
                    }
                    throw a.n("wasTimerUsed", "wasTimerUsed", jsonReader);
                }
                case 2: {
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b != null) {
                        continue;
                    }
                    throw a.n("wasFlashUsed", "wasFlashUsed", jsonReader);
                }
                case 1: {
                    n2 = (Long)this.longAdapter.fromJson(jsonReader);
                    if (n2 != null) {
                        continue;
                    }
                    throw a.n("duration", "duration", jsonReader);
                }
                case 0: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("mediaType", "mediaType", jsonReader);
                }
                case -1: {
                    jsonReader.H();
                    jsonReader.G1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (n == -4097) {
            if (s == null) {
                throw a.h("mediaType", "mediaType", jsonReader);
            }
            if (n2 == null) {
                throw a.h("duration", "duration", jsonReader);
            }
            final long longValue = n2;
            if (b == null) {
                throw a.h("wasFlashUsed", "wasFlashUsed", jsonReader);
            }
            final boolean booleanValue = b;
            if (b2 == null) {
                throw a.h("wasTimerUsed", "wasTimerUsed", jsonReader);
            }
            final boolean booleanValue2 = b2;
            if (n3 == null) {
                throw a.h("overlayTextCount", "overlayTextCount", jsonReader);
            }
            final int intValue = n3;
            if (n4 == null) {
                throw a.h("numSegments", "numSegments", jsonReader);
            }
            final int intValue2 = n4;
            if (n5 == null) {
                throw a.h("numSegmentsRecorded", "numSegmentsRecorded", jsonReader);
            }
            final int intValue3 = n5;
            if (n6 == null) {
                throw a.h("numSegmentsUploaded", "numSegmentsUploaded", jsonReader);
            }
            final int intValue4 = n6;
            if (n7 == null) {
                throw a.h("numPhotos", "numPhotos", jsonReader);
            }
            final int intValue5 = n7;
            if (b3 != null) {
                return new CreatorKitResult$Work$VideoInfo(s, longValue, booleanValue, booleanValue2, (List)o, (String)o2, intValue, intValue2, intValue3, intValue4, intValue5, (boolean)b3, (String)o3);
            }
            throw a.h("wasOverlayDrawUsed", "wasOverlayDrawUsed", jsonReader);
        }
        else {
            final Constructor<CreatorKitResult$Work$VideoInfo> constructorRef = this.constructorRef;
            Constructor<CreatorKitResult$Work$VideoInfo> declaredConstructor;
            if (constructorRef == null) {
                final Class<Long> type = Long.TYPE;
                final Class<Boolean> type2 = Boolean.TYPE;
                final Class<Integer> type3 = Integer.TYPE;
                declaredConstructor = CreatorKitResult$Work$VideoInfo.class.getDeclaredConstructor(clazz, type, type2, type2, List.class, clazz, type3, type3, type3, type3, type3, type2, clazz, type3, a.c);
                e.e((Object)(this.constructorRef = declaredConstructor), "CreatorKitResult.Work.Vi\u2026his.constructorRef = it }");
            }
            else {
                declaredConstructor = constructorRef;
            }
            if (s == null) {
                throw a.h("mediaType", "mediaType", jsonReader);
            }
            if (n2 == null) {
                throw a.h("duration", "duration", jsonReader);
            }
            final long longValue2 = n2;
            if (b == null) {
                throw a.h("wasFlashUsed", "wasFlashUsed", jsonReader);
            }
            final boolean booleanValue3 = b;
            if (b2 == null) {
                throw a.h("wasTimerUsed", "wasTimerUsed", jsonReader);
            }
            final boolean booleanValue4 = b2;
            if (n3 == null) {
                throw a.h("overlayTextCount", "overlayTextCount", jsonReader);
            }
            final int intValue6 = n3;
            if (n4 == null) {
                throw a.h("numSegments", "numSegments", jsonReader);
            }
            final int intValue7 = n4;
            if (n5 == null) {
                throw a.h("numSegmentsRecorded", "numSegmentsRecorded", jsonReader);
            }
            final int intValue8 = n5;
            if (n6 == null) {
                throw a.h("numSegmentsUploaded", "numSegmentsUploaded", jsonReader);
            }
            final int intValue9 = n6;
            if (n7 == null) {
                throw a.h("numPhotos", "numPhotos", jsonReader);
            }
            final int intValue10 = n7;
            if (b3 != null) {
                final CreatorKitResult$Work$VideoInfo instance = declaredConstructor.newInstance(s, longValue2, booleanValue3, booleanValue4, o, o2, intValue6, intValue7, intValue8, intValue9, intValue10, Boolean.valueOf(b3), o3, n, null);
                e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("wasOverlayDrawUsed", "wasOverlayDrawUsed", jsonReader);
        }
    }
    
    public /* bridge */ Object fromJson(final JsonReader jsonReader) {
        return this.fromJson(jsonReader);
    }
    
    public void toJson(final x x, final CreatorKitResult$Work$VideoInfo creatorKitResult$Work$VideoInfo) {
        e.f((Object)x, "writer");
        if (creatorKitResult$Work$VideoInfo != null) {
            x.h();
            x.v("mediaType");
            this.stringAdapter.toJson(x, (Object)creatorKitResult$Work$VideoInfo.getMediaType());
            x.v("duration");
            this.longAdapter.toJson(x, (Object)creatorKitResult$Work$VideoInfo.getDuration());
            x.v("wasFlashUsed");
            this.booleanAdapter.toJson(x, (Object)creatorKitResult$Work$VideoInfo.getWasFlashUsed());
            x.v("wasTimerUsed");
            this.booleanAdapter.toJson(x, (Object)creatorKitResult$Work$VideoInfo.getWasTimerUsed());
            x.v("filterNames");
            this.nullableListOfStringAdapter.toJson(x, (Object)creatorKitResult$Work$VideoInfo.getFilterNames());
            x.v("overlayTextLast");
            this.nullableStringAdapter.toJson(x, (Object)creatorKitResult$Work$VideoInfo.getOverlayTextLast());
            x.v("overlayTextCount");
            this.intAdapter.toJson(x, (Object)creatorKitResult$Work$VideoInfo.getOverlayTextCount());
            x.v("numSegments");
            this.intAdapter.toJson(x, (Object)creatorKitResult$Work$VideoInfo.getNumSegments());
            x.v("numSegmentsRecorded");
            this.intAdapter.toJson(x, (Object)creatorKitResult$Work$VideoInfo.getNumSegmentsRecorded());
            x.v("numSegmentsUploaded");
            this.intAdapter.toJson(x, (Object)creatorKitResult$Work$VideoInfo.getNumSegmentsUploaded());
            x.v("numPhotos");
            this.intAdapter.toJson(x, (Object)creatorKitResult$Work$VideoInfo.getNumPhotos());
            x.v("wasOverlayDrawUsed");
            this.booleanAdapter.toJson(x, (Object)creatorKitResult$Work$VideoInfo.getWasOverlayDrawUsed());
            x.v("reactedFrom");
            this.nullableStringAdapter.toJson(x, (Object)creatorKitResult$Work$VideoInfo.getReactedFrom());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public /* bridge */ void toJson(final x x, final Object o) {
        this.toJson(x, (CreatorKitResult$Work$VideoInfo)o);
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(CreatorKitResult.Work.VideoInfo)";
    }
}
