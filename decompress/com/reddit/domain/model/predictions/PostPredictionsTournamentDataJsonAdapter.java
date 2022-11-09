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

@Metadata(bv = {}, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d" }, d2 = { "Lcom/reddit/domain/model/predictions/PostPredictionsTournamentDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/predictions/PostPredictionsTournamentData;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "Lcom/reddit/domain/model/predictions/PredictionData;", "nullableListOfPredictionDataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class PostPredictionsTournamentDataJsonAdapter extends JsonAdapter<PostPredictionsTournamentData>
{
    private volatile Constructor<PostPredictionsTournamentData> constructorRef;
    private final JsonAdapter<List<PredictionData>> nullableListOfPredictionDataAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public PostPredictionsTournamentDataJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "tournament_id", "name", "status", "theme_id", "predictions" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "tournamentId");
        this.nullableStringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "name");
        this.nullableListOfPredictionDataAdapter = (JsonAdapter<List<PredictionData>>)y.c((Type)a0.d((Class)List.class, new Type[] { PredictionData.class }), (Set)instance, "predictions");
    }
    
    public PostPredictionsTournamentData fromJson(final JsonReader jsonReader) {
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        String s = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        while (jsonReader.hasNext()) {
            final int f = jsonReader.F(this.options);
            if (f != -1) {
                if (f != 0) {
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                if (f != 4) {
                                    continue;
                                }
                                o4 = this.nullableListOfPredictionDataAdapter.fromJson(jsonReader);
                                n &= 0xFFFFFFEF;
                            }
                            else {
                                o3 = this.nullableStringAdapter.fromJson(jsonReader);
                                n &= 0xFFFFFFF7;
                            }
                        }
                        else {
                            o2 = this.nullableStringAdapter.fromJson(jsonReader);
                            n &= 0xFFFFFFFB;
                        }
                    }
                    else {
                        o = this.nullableStringAdapter.fromJson(jsonReader);
                        n &= 0xFFFFFFFD;
                    }
                }
                else {
                    s = (String)this.stringAdapter.fromJson(jsonReader);
                    if (s != null) {
                        continue;
                    }
                    throw a.n("tournamentId", "tournament_id", jsonReader);
                }
            }
            else {
                jsonReader.J();
                jsonReader.z1();
            }
        }
        jsonReader.r();
        if (n == -31) {
            if (s != null) {
                return new PostPredictionsTournamentData(s, (String)o, (String)o2, (String)o3, (List)o4);
            }
            throw a.h("tournamentId", "tournament_id", jsonReader);
        }
        else {
            Constructor<PostPredictionsTournamentData> constructorRef;
            if ((constructorRef = this.constructorRef) == null) {
                constructorRef = PostPredictionsTournamentData.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, List.class, Integer.TYPE, a.c);
                f.e((Object)(this.constructorRef = constructorRef), "PostPredictionsTournamen\u2026his.constructorRef = it }");
            }
            if (s != null) {
                final PostPredictionsTournamentData instance = constructorRef.newInstance(s, o, o2, o3, o4, n, null);
                f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("tournamentId", "tournament_id", jsonReader);
        }
    }
    
    public void toJson(final x x, final PostPredictionsTournamentData postPredictionsTournamentData) {
        f.f((Object)x, "writer");
        if (postPredictionsTournamentData != null) {
            x.h();
            x.w("tournament_id");
            this.stringAdapter.toJson(x, (Object)postPredictionsTournamentData.getTournamentId());
            x.w("name");
            this.nullableStringAdapter.toJson(x, (Object)postPredictionsTournamentData.getName());
            x.w("status");
            this.nullableStringAdapter.toJson(x, (Object)postPredictionsTournamentData.getStatus());
            x.w("theme_id");
            this.nullableStringAdapter.toJson(x, (Object)postPredictionsTournamentData.getThemeId());
            x.w("predictions");
            this.nullableListOfPredictionDataAdapter.toJson(x, (Object)postPredictionsTournamentData.getPredictions());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(PostPredictionsTournamentData)";
    }
}
