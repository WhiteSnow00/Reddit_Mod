// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.awards.model;

import androidx.viewpager.widget.c;
import com.squareup.moshi.x;
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
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR$\u0010\u0011\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a" }, d2 = { "Lcom/reddit/domain/awards/model/AwardResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/awards/model/AwardResponse;", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "", "longAdapter", "", "Lcom/reddit/domain/awards/model/Award;", "nullableListOfAwardAdapter", "", "nullableListOfNullableStringAdapter", "listOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class AwardResponseJsonAdapter extends JsonAdapter<AwardResponse>
{
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<AwardResponse> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<List<Award>> nullableListOfAwardAdapter;
    private final JsonAdapter<List<String>> nullableListOfNullableStringAdapter;
    private final JsonReader$b options;
    
    public AwardResponseJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "ok", "coins", "awardKarmaReceived", "awardings", "json", "treatment_tags" });
        final Class<Boolean> type = Boolean.TYPE;
        final EmptySet instance = EmptySet.INSTANCE;
        this.booleanAdapter = (JsonAdapter<Boolean>)y.c((Type)type, (Set)instance, "awardSucceeded");
        this.intAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.TYPE, (Set)instance, "userCoinBalance");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "awardKarmaReceived");
        this.nullableListOfAwardAdapter = (JsonAdapter<List<Award>>)y.c((Type)a0.d((Class)List.class, new Type[] { Award.class }), (Set)instance, "awardings");
        this.nullableListOfNullableStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "errors");
        this.listOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "treatmentTags");
    }
    
    public final Object fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Boolean b = null;
        Integer n2 = null;
        Long n3 = null;
        Object o = null;
        List<String> list = null;
        List<String> list2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 5: {
                    list2 = (List)this.listOfStringAdapter.fromJson(jsonReader);
                    if (list2 != null) {
                        n &= 0xFFFFFFDF;
                        continue;
                    }
                    throw a.n("treatmentTags", "treatment_tags", jsonReader);
                }
                case 4: {
                    list = (List)this.nullableListOfNullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    o = this.nullableListOfAwardAdapter.fromJson(jsonReader);
                    continue;
                }
                case 2: {
                    n3 = (Long)this.longAdapter.fromJson(jsonReader);
                    if (n3 != null) {
                        continue;
                    }
                    throw a.n("awardKarmaReceived", "awardKarmaReceived", jsonReader);
                }
                case 1: {
                    n2 = (Integer)this.intAdapter.fromJson(jsonReader);
                    if (n2 != null) {
                        continue;
                    }
                    throw a.n("userCoinBalance", "coins", jsonReader);
                }
                case 0: {
                    b = (Boolean)this.booleanAdapter.fromJson(jsonReader);
                    if (b != null) {
                        continue;
                    }
                    throw a.n("awardSucceeded", "ok", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        AwardResponse awardResponse;
        if (n == -33) {
            if (b == null) {
                throw a.h("awardSucceeded", "ok", jsonReader);
            }
            final boolean booleanValue = b;
            if (n2 == null) {
                throw a.h("userCoinBalance", "coins", jsonReader);
            }
            final int intValue = n2;
            if (n3 == null) {
                throw a.h("awardKarmaReceived", "awardKarmaReceived", jsonReader);
            }
            final long longValue = n3;
            f.d((Object)list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            awardResponse = new AwardResponse(booleanValue, intValue, longValue, (List<Award>)o, list, list2);
        }
        else {
            Constructor<AwardResponse> constructorRef = this.constructorRef;
            if (constructorRef == null) {
                final Class<Boolean> type = Boolean.TYPE;
                final Class<Integer> type2 = Integer.TYPE;
                constructorRef = AwardResponse.class.getDeclaredConstructor(type, type2, Long.TYPE, List.class, List.class, List.class, type2, a.c);
                f.e((Object)(this.constructorRef = constructorRef), "AwardResponse::class.jav\u2026his.constructorRef = it }");
            }
            if (b == null) {
                throw a.h("awardSucceeded", "ok", jsonReader);
            }
            final boolean booleanValue2 = b;
            if (n2 == null) {
                throw a.h("userCoinBalance", "coins", jsonReader);
            }
            final int intValue2 = n2;
            if (n3 == null) {
                throw a.h("awardKarmaReceived", "awardKarmaReceived", jsonReader);
            }
            final AwardResponse instance = constructorRef.newInstance(booleanValue2, intValue2, n3, o, list, list2, n, null);
            f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
            awardResponse = instance;
        }
        return awardResponse;
    }
    
    public final void toJson(final x x, final Object o) {
        final AwardResponse awardResponse = (AwardResponse)o;
        f.f((Object)x, "writer");
        if (awardResponse != null) {
            x.h();
            x.w("ok");
            a.v(awardResponse.a, (JsonAdapter)this.booleanAdapter, x, "coins");
            c.n(awardResponse.b, this.intAdapter, x, "awardKarmaReceived");
            this.longAdapter.toJson(x, (Object)awardResponse.c);
            x.w("awardings");
            this.nullableListOfAwardAdapter.toJson(x, (Object)awardResponse.d);
            x.w("json");
            this.nullableListOfNullableStringAdapter.toJson(x, (Object)awardResponse.e);
            x.w("treatment_tags");
            this.listOfStringAdapter.toJson(x, (Object)awardResponse.f);
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public final String toString() {
        return "GeneratedJsonAdapter(AwardResponse)";
    }
}
