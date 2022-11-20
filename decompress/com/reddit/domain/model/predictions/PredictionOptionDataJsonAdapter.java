// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.predictions;

import com.squareup.moshi.x;
import java.io.Serializable;
import dd2.a;
import com.squareup.moshi.JsonReader;
import java.util.Set;
import java.lang.reflect.Type;
import kotlin.collections.EmptySet;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/model/predictions/PredictionOptionDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/predictions/PredictionOptionData;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lcg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableLongAdapter", "", "nullableIntAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class PredictionOptionDataJsonAdapter extends JsonAdapter<PredictionOptionData>
{
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public PredictionOptionDataJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "text", "vote_count", "user_amount", "total_amount" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "text");
        this.nullableLongAdapter = (JsonAdapter<Long>)y.c((Type)Long.class, (Set)instance, "voteCount");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "userAmountSet");
    }
    
    public PredictionOptionData fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        String s = null;
        Number n;
        Serializable s2 = n = null;
        Number n3;
        Number n2 = n3 = n;
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
                                n3 = (Integer)this.nullableIntAdapter.fromJson(jsonReader);
                            }
                            else {
                                n2 = (Integer)this.nullableIntAdapter.fromJson(jsonReader);
                            }
                        }
                        else {
                            n = (Long)this.nullableLongAdapter.fromJson(jsonReader);
                        }
                    }
                    else {
                        s2 = (String)this.nullableStringAdapter.fromJson(jsonReader);
                    }
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("id", "id", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.G1();
            }
        }
        jsonReader.r();
        if (s != null) {
            return new PredictionOptionData(s, (String)s2, (Long)n, (Integer)n2, (Integer)n3);
        }
        throw a.h("id", "id", jsonReader);
    }
    
    public /* bridge */ Object fromJson(final JsonReader jsonReader) {
        return this.fromJson(jsonReader);
    }
    
    public void toJson(final x x, final PredictionOptionData predictionOptionData) {
        e.f((Object)x, "writer");
        if (predictionOptionData != null) {
            x.h();
            x.v("id");
            this.stringAdapter.toJson(x, (Object)predictionOptionData.getId());
            x.v("text");
            this.nullableStringAdapter.toJson(x, (Object)predictionOptionData.getText());
            x.v("vote_count");
            this.nullableLongAdapter.toJson(x, (Object)predictionOptionData.getVoteCount());
            x.v("user_amount");
            this.nullableIntAdapter.toJson(x, (Object)predictionOptionData.getUserAmountSet());
            x.v("total_amount");
            this.nullableIntAdapter.toJson(x, (Object)predictionOptionData.getOptionTotalAmountSet());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public /* bridge */ void toJson(final x x, final Object o) {
        this.toJson(x, (PredictionOptionData)o);
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(PredictionOptionData)";
    }
}
