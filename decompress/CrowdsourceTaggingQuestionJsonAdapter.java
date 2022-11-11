// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

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

@Metadata(bv = {}, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 " }, d2 = { "Lcom/reddit/domain/model/tagging/CrowdsourceTaggingQuestionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/tagging/CrowdsourceTaggingQuestion;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lpg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/reddit/domain/model/tagging/CrowdsourceTaggingAnswer;", "listOfCrowdsourceTaggingAnswerAdapter", "Lcom/reddit/domain/model/tagging/CrowdsourceTaggingQuestionType;", "crowdsourceTaggingQuestionTypeAdapter", "Lcom/reddit/domain/model/tagging/QuestionAnalyticsData;", "nullableQuestionAnalyticsDataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class CrowdsourceTaggingQuestionJsonAdapter extends JsonAdapter<CrowdsourceTaggingQuestion>
{
    private volatile Constructor<CrowdsourceTaggingQuestion> constructorRef;
    private final JsonAdapter<CrowdsourceTaggingQuestionType> crowdsourceTaggingQuestionTypeAdapter;
    private final JsonAdapter<List<CrowdsourceTaggingAnswer>> listOfCrowdsourceTaggingAnswerAdapter;
    private final JsonAdapter<QuestionAnalyticsData> nullableQuestionAnalyticsDataAdapter;
    private final JsonReader$b options;
    private final JsonAdapter<String> stringAdapter;
    
    public CrowdsourceTaggingQuestionJsonAdapter(final y y) {
        f.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "id", "subreddit_name", "text", "answers", "type", "analytics_data" });
        final EmptySet instance = EmptySet.INSTANCE;
        this.stringAdapter = (JsonAdapter<String>)y.c((Type)String.class, (Set)instance, "id");
        this.listOfCrowdsourceTaggingAnswerAdapter = (JsonAdapter<List<CrowdsourceTaggingAnswer>>)y.c((Type)a0.d((Class)List.class, new Type[] { CrowdsourceTaggingAnswer.class }), (Set)instance, "answers");
        this.crowdsourceTaggingQuestionTypeAdapter = (JsonAdapter<CrowdsourceTaggingQuestionType>)y.c((Type)CrowdsourceTaggingQuestionType.class, (Set)instance, "type");
        this.nullableQuestionAnalyticsDataAdapter = (JsonAdapter<QuestionAnalyticsData>)y.c((Type)QuestionAnalyticsData.class, (Set)instance, "analyticsData");
    }
    
    public CrowdsourceTaggingQuestion fromJson(final JsonReader jsonReader) {
        final Class<String> clazz = String.class;
        f.f((Object)jsonReader, "reader");
        jsonReader.h();
        int n = -1;
        String s = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.F(this.options)) {
                default: {
                    continue;
                }
                case 5: {
                    o5 = this.nullableQuestionAnalyticsDataAdapter.fromJson(jsonReader);
                    n &= 0xFFFFFFDF;
                    continue;
                }
                case 4: {
                    o4 = this.crowdsourceTaggingQuestionTypeAdapter.fromJson(jsonReader);
                    if (o4 != null) {
                        continue;
                    }
                    throw a.n("type", "type", jsonReader);
                }
                case 3: {
                    o3 = this.listOfCrowdsourceTaggingAnswerAdapter.fromJson(jsonReader);
                    if (o3 != null) {
                        continue;
                    }
                    throw a.n("answers", "answers", jsonReader);
                }
                case 2: {
                    o2 = this.stringAdapter.fromJson(jsonReader);
                    if (o2 != null) {
                        continue;
                    }
                    throw a.n("text", "text", jsonReader);
                }
                case 1: {
                    o = this.stringAdapter.fromJson(jsonReader);
                    if (o != null) {
                        continue;
                    }
                    throw a.n("subredditName", "subreddit_name", jsonReader);
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
        if (n == -33) {
            if (s == null) {
                throw a.h("id", "id", jsonReader);
            }
            if (o == null) {
                throw a.h("subredditName", "subreddit_name", jsonReader);
            }
            if (o2 == null) {
                throw a.h("text", "text", jsonReader);
            }
            if (o3 == null) {
                throw a.h("answers", "answers", jsonReader);
            }
            if (o4 != null) {
                return new CrowdsourceTaggingQuestion(s, (String)o, (String)o2, (List<CrowdsourceTaggingAnswer>)o3, (CrowdsourceTaggingQuestionType)o4, (QuestionAnalyticsData)o5);
            }
            throw a.h("type", "type", jsonReader);
        }
        else {
            final Constructor<CrowdsourceTaggingQuestion> constructorRef = this.constructorRef;
            Constructor<CrowdsourceTaggingQuestion> declaredConstructor;
            if (constructorRef == null) {
                declaredConstructor = CrowdsourceTaggingQuestion.class.getDeclaredConstructor(clazz, clazz, clazz, List.class, CrowdsourceTaggingQuestionType.class, QuestionAnalyticsData.class, Integer.TYPE, a.c);
                f.e((Object)(this.constructorRef = declaredConstructor), "CrowdsourceTaggingQuesti\u2026his.constructorRef = it }");
            }
            else {
                declaredConstructor = constructorRef;
            }
            if (s == null) {
                throw a.h("id", "id", jsonReader);
            }
            if (o == null) {
                throw a.h("subredditName", "subreddit_name", jsonReader);
            }
            if (o2 == null) {
                throw a.h("text", "text", jsonReader);
            }
            if (o3 == null) {
                throw a.h("answers", "answers", jsonReader);
            }
            if (o4 != null) {
                final CrowdsourceTaggingQuestion instance = declaredConstructor.newInstance(s, o, o2, o3, o4, o5, n, null);
                f.e((Object)instance, "localConstructor.newInst\u2026torMarker */ null\n      )");
                return instance;
            }
            throw a.h("type", "type", jsonReader);
        }
    }
    
    public void toJson(final x x, final CrowdsourceTaggingQuestion crowdsourceTaggingQuestion) {
        f.f((Object)x, "writer");
        if (crowdsourceTaggingQuestion != null) {
            x.h();
            x.w("id");
            this.stringAdapter.toJson(x, (Object)crowdsourceTaggingQuestion.getId());
            x.w("subreddit_name");
            this.stringAdapter.toJson(x, (Object)crowdsourceTaggingQuestion.getSubredditName());
            x.w("text");
            this.stringAdapter.toJson(x, (Object)crowdsourceTaggingQuestion.getText());
            x.w("answers");
            this.listOfCrowdsourceTaggingAnswerAdapter.toJson(x, (Object)crowdsourceTaggingQuestion.getAnswers());
            x.w("type");
            this.crowdsourceTaggingQuestionTypeAdapter.toJson(x, (Object)crowdsourceTaggingQuestion.getType());
            x.w("analytics_data");
            this.nullableQuestionAnalyticsDataAdapter.toJson(x, (Object)crowdsourceTaggingQuestion.getAnalyticsData());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(CrowdsourceTaggingQuestion)";
    }
}
