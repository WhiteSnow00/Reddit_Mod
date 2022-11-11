// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import id2.a;
import com.squareup.moshi.JsonReader;
import id2.a$b;
import java.util.Set;
import kotlin.collections.EmptySet;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import sg2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\"" }, d2 = { "Lcom/reddit/domain/model/PostPollJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/PostPoll;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lhg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "Lcom/reddit/domain/model/PostPollOption;", "listOfPostPollOptionAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "nullableStringAdapter", "", "nullableBooleanAdapter", "", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class PostPollJsonAdapter extends JsonAdapter<PostPoll>
{
    private volatile Constructor<PostPoll> constructorRef;
    private final JsonAdapter<List<PostPollOption>> listOfPostPollOptionAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    
    public PostPollJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "options", "voting_end_timestamp", "total_vote_count", "user_selection", "is_prediction", "total_stake_amount", "user_won_amount", "resolved_option_id", "tournament_id", "vote_updates_remained", "prediction_status" });
        final a$b d = a0.d((Class)List.class, new Type[] { PostPollOption.class });
        final EmptySet instance = EmptySet.INSTANCE;
        this.listOfPostPollOptionAdapter = (JsonAdapter<List<PostPollOption>>)y.c((Type)d, (Set)instance, "options");
        this.longAdapter = (JsonAdapter<Long>)y.c((Type)Long.TYPE, (Set)instance, "votingEndsTimestampMs");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "selectedOptionId");
        this.nullableBooleanAdapter = (JsonAdapter<Boolean>)y.c((Type)Boolean.class, (Set)instance, "isPrediction");
        this.nullableIntAdapter = (JsonAdapter<Integer>)y.c((Type)Integer.class, (Set)instance, "totalCoinsSet");
    }
    
    public PostPoll fromJson(final JsonReader jsonReader) {
        final Class<Integer> clazz = Integer.class;
        final Class<String> clazz2 = String.class;
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        Long n2 = null;
        List list = null;
        Long n3 = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        Object o7 = null;
        Object o8 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.E(this.options)) {
                default: {
                    continue;
                }
                case 10: {
                    o8 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFBFF;
                    continue;
                }
                case 9: {
                    o7 = this.nullableIntAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFDFF;
                    continue;
                }
                case 8: {
                    o6 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFEFF;
                    continue;
                }
                case 7: {
                    o5 = this.nullableStringAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFF7F;
                    continue;
                }
                case 6: {
                    o4 = this.nullableIntAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFBF;
                    continue;
                }
                case 5: {
                    o3 = this.nullableIntAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFDF;
                    continue;
                }
                case 4: {
                    o2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFEF;
                    continue;
                }
                case 3: {
                    o = this.nullableStringAdapter.fromJson(jsonReader);
                    continue;
                }
                case 2: {
                    n3 = (Long)this.longAdapter.fromJson(jsonReader);
                    if (n3 != null) {
                        continue;
                    }
                    throw a.n("totalVoteCount", "total_vote_count", jsonReader);
                }
                case 1: {
                    n2 = (Long)this.longAdapter.fromJson(jsonReader);
                    if (n2 != null) {
                        continue;
                    }
                    throw a.n("votingEndsTimestampMs", "voting_end_timestamp", jsonReader);
                }
                case 0: {
                    list = (List)this.listOfPostPollOptionAdapter.fromJson(jsonReader);
                    if (list != null) {
                        continue;
                    }
                    throw a.n("options_", "options", jsonReader);
                }
                case -1: {
                    jsonReader.H();
                    jsonReader.F1();
                    continue;
                }
            }
        }
        jsonReader.r();
        if (n == -2033) {
            if (list == null) {
                throw a.h("options_", "options", jsonReader);
            }
            if (n2 == null) {
                throw a.h("votingEndsTimestampMs", "voting_end_timestamp", jsonReader);
            }
            final long longValue = n2;
            if (n3 != null) {
                return new PostPoll(list, longValue, (long)n3, (String)o, (Boolean)o2, (Integer)o3, (Integer)o4, (String)o5, (String)o6, (Integer)o7, (String)o8, false, 2048, (DefaultConstructorMarker)null);
            }
            throw a.h("totalVoteCount", "total_vote_count", jsonReader);
        }
        else {
            final Constructor<PostPoll> constructorRef = this.constructorRef;
            Constructor<PostPoll> declaredConstructor;
            if (constructorRef == null) {
                final Class<Long> type = Long.TYPE;
                declaredConstructor = PostPoll.class.getDeclaredConstructor(List.class, type, type, clazz2, Boolean.class, clazz, clazz, clazz2, clazz2, clazz, clazz2, Boolean.TYPE, Integer.TYPE, a.c);
                e.e((Object)(this.constructorRef = declaredConstructor), "PostPoll::class.java.get\u2026his.constructorRef = it }");
            }
            else {
                declaredConstructor = constructorRef;
            }
            if (list == null) {
                throw a.h("options_", "options", jsonReader);
            }
            if (n2 == null) {
                throw a.h("votingEndsTimestampMs", "voting_end_timestamp", jsonReader);
            }
            final long longValue2 = n2;
            if (n3 != null) {
                final PostPoll instance = declaredConstructor.newInstance(list, longValue2, n3, o, o2, o3, o4, o5, o6, o7, o8, Boolean.FALSE, n, null);
                e.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("totalVoteCount", "total_vote_count", jsonReader);
        }
    }
    
    public void toJson(final x x, final PostPoll postPoll) {
        e.f((Object)x, "writer");
        if (postPoll != null) {
            x.h();
            x.u("options");
            this.listOfPostPollOptionAdapter.toJson(x, (Object)postPoll.getOptions());
            x.u("voting_end_timestamp");
            this.longAdapter.toJson(x, (Object)postPoll.getVotingEndsTimestampMs());
            x.u("total_vote_count");
            this.longAdapter.toJson(x, (Object)postPoll.getTotalVoteCount());
            x.u("user_selection");
            this.nullableStringAdapter.toJson(x, (Object)postPoll.getSelectedOptionId());
            x.u("is_prediction");
            this.nullableBooleanAdapter.toJson(x, (Object)postPoll.isPrediction());
            x.u("total_stake_amount");
            this.nullableIntAdapter.toJson(x, (Object)postPoll.getTotalCoinsSet());
            x.u("user_won_amount");
            this.nullableIntAdapter.toJson(x, (Object)postPoll.getUserCoinsWon());
            x.u("resolved_option_id");
            this.nullableStringAdapter.toJson(x, (Object)postPoll.getResolvedOptionId());
            x.u("tournament_id");
            this.nullableStringAdapter.toJson(x, (Object)postPoll.getPredictionTournamentId());
            x.u("vote_updates_remained");
            this.nullableIntAdapter.toJson(x, (Object)postPoll.getPredictionVoteUpdatesRemaining());
            x.u("prediction_status");
            this.nullableStringAdapter.toJson(x, (Object)postPoll.getPredictionStatus());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(PostPoll)";
    }
}
