// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.predictions;

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

@Metadata(bv = {}, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$" }, d2 = { "Lcom/reddit/domain/model/predictions/PredictionDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/predictions/PredictionData;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableBooleanAdapter", "", "nullableLongAdapter", "longAdapter", "", "nullableIntAdapter", "", "Lcom/reddit/domain/model/predictions/PredictionOptionData;", "nullableListOfPredictionOptionDataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class PredictionDataJsonAdapter extends JsonAdapter<PredictionData>
{
    private volatile Constructor<PredictionData> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<PredictionOptionData>> nullableListOfPredictionOptionDataAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public PredictionDataJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "status", "title", "is_nsfw", "is_spoiler", "created_at", "voting_end_timestamp", "total_vote_count", "user_selection", "total_stake_amount", "user_won_amount", "resolved_option_id", "options", "vote_updates_remained" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "postKindWithId");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "status");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "isNsfw");
        this.nullableLongAdapter = (JsonAdapter<Long>)y.c((Type)Long.class, (Set)instance, "creationTimeMs");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "votingEndsTimestampMs");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "totalVoteCount");
        this.nullableListOfPredictionOptionDataAdapter = (JsonAdapter<List<PredictionOptionData>>)y.c((Type)a0.d((Class)List.class, new Type[] { PredictionOptionData.class }), (Set)instance, "options");
    }
    
    public PredictionData fromJson(final JsonReader jsonReader) {
        final Class<Boolean> clazz = Boolean.class;
        final Class<Integer> clazz2 = Integer.class;
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Long n2 = null;
        String s = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        Object o7 = null;
        Object o8 = null;
        Object o9 = null;
        Object o10 = null;
        Object o11 = null;
        Object o12 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 13: {
                    o12 = this.nullableIntAdapter.fromJson(jsonReader);
                    n &= 0xFFFFDFFF;
                    continue;
                }
                case 12: {
                    o11 = this.nullableListOfPredictionOptionDataAdapter.fromJson(jsonReader);
                    continue;
                }
                case 11: {
                    o10 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 10: {
                    o9 = this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 9: {
                    o8 = this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 8: {
                    o7 = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 7: {
                    o6 = this.nullableIntAdapter.fromJson(jsonReader);
                    continue;
                }
                case 6: {
                    n2 = (Long)this.longAdapter.fromJson(jsonReader);
                    if (n2 != null) {
                        continue;
                    }
                    throw a.n("votingEndsTimestampMs", "voting_end_timestamp", jsonReader);
                }
                case 5: {
                    o5 = this.nullableLongAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFDF;
                    continue;
                }
                case 4: {
                    o4 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 3: {
                    o3 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    continue;
                }
                case 2: {
                    o2 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFB;
                    continue;
                }
                case 1: {
                    o = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFFD;
                    continue;
                }
                case 0: {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("postKindWithId", "id", jsonReader);
                }
                case -1: {
                    jsonReader.J();
                    jsonReader.z1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (n == -8231) {
            if (s == null) {
                throw a.h("postKindWithId", "id", jsonReader);
            }
            if (n2 != null) {
                return new PredictionData(s, (String)o, (String)o2, (Boolean)o3, (Boolean)o4, (Long)o5, (long)n2, (Integer)o6, (String)o7, (Integer)o8, (Integer)o9, (String)o10, (List)o11, (Integer)o12);
            }
            throw a.h("votingEndsTimestampMs", "voting_end_timestamp", jsonReader);
        }
        else {
            final Constructor<PredictionData> constructorRef = this.constructorRef;
            Constructor<PredictionData> declaredConstructor;
            if (constructorRef == null) {
                declaredConstructor = PredictionData.class.getDeclaredConstructor(String.class, String.class, String.class, clazz, clazz, Long.class, Long.TYPE, clazz2, String.class, clazz2, clazz2, String.class, List.class, clazz2, Integer.TYPE, a.c);
                f.e((Object)(this.constructorRef = declaredConstructor), "PredictionData::class.ja\u2026his.constructorRef = it }");
            }
            else {
                declaredConstructor = constructorRef;
            }
            if (s == null) {
                throw a.h("postKindWithId", "id", jsonReader);
            }
            if (n2 != null) {
                final PredictionData instance = declaredConstructor.newInstance(s, o, o2, o3, o4, o5, n2, o6, o7, o8, o9, o10, o11, o12, n, null);
                f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("votingEndsTimestampMs", "voting_end_timestamp", jsonReader);
        }
    }
    
    public void toJson(final x x, final PredictionData predictionData) {
        f.f((Object)x, "writer");
        if (predictionData != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)predictionData.getPostKindWithId());
            x.w("status");
            this.nullableStringAdapter.toJson(x, (Object)predictionData.getStatus());
            x.w("title");
            this.nullableStringAdapter.toJson(x, (Object)predictionData.getTitle());
            x.w("is_nsfw");
            this.nullableBooleanAdapter.toJson(x, (Object)predictionData.isNsfw());
            x.w("is_spoiler");
            this.nullableBooleanAdapter.toJson(x, (Object)predictionData.isSpoiler());
            x.w("created_at");
            this.nullableLongAdapter.toJson(x, (Object)predictionData.getCreationTimeMs());
            x.w("voting_end_timestamp");
            this.longAdapter.toJson(x, (Object)predictionData.getVotingEndsTimestampMs());
            x.w("total_vote_count");
            this.nullableIntAdapter.toJson(x, (Object)predictionData.getTotalVoteCount());
            x.w("user_selection");
            this.nullableStringAdapter.toJson(x, (Object)predictionData.getSelectedOptionId());
            x.w("total_stake_amount");
            this.nullableIntAdapter.toJson(x, (Object)predictionData.getTotalStakeAmount());
            x.w("user_won_amount");
            this.nullableIntAdapter.toJson(x, (Object)predictionData.getUserWonAmount());
            x.w("resolved_option_id");
            this.nullableStringAdapter.toJson(x, (Object)predictionData.getResolvedOptionId());
            x.w("options");
            this.nullableListOfPredictionOptionDataAdapter.toJson(x, (Object)predictionData.getOptions());
            x.w("vote_updates_remained");
            this.nullableIntAdapter.toJson(x, (Object)predictionData.getVoteUpdatesRemaining());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(PredictionData)";
    }
}
