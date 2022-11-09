// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.survey.json;

import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.Map;
import ah2.f;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003" }, d2 = { "Lcom/reddit/data/survey/json/SurveyConfigJson;", "", "SurveyJson", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class SurveyConfigJson
{
    public final List<SurveyJson> a;
    public final long b;
    
    public SurveyConfigJson(final long b, final List a) {
        f.f((Object)a, "active_surveys");
        this.a = a;
        this.b = b;
    }
    
    @o(generateAdapter = true)
    @Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004" }, d2 = { "Lcom/reddit/data/survey/json/SurveyConfigJson$SurveyJson;", "", "SurveyStepJson", "VariantJson", "data_release" }, k = 1, mv = { 1, 7, 1 })
    public static final class SurveyJson
    {
        public final String a;
        public final List<SurveyStepJson> b;
        public final String c;
        public final Map<String, VariantJson> d;
        
        public SurveyJson(final String a, final List<SurveyStepJson> b, final String c, final Map<String, VariantJson> d) {
            f.f((Object)a, "experiment_name");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @o(generateAdapter = true)
        @Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/survey/json/SurveyConfigJson$SurveyJson$SurveyStepJson;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
        public static final class SurveyStepJson
        {
            public final String a;
            public final String b;
            public final List<String> c;
            public final String d;
            
            public SurveyStepJson(final String a, final String b, final List<String> c, final String d) {
                f.f((Object)b, "question");
                this.a = a;
                this.b = b;
                this.c = c;
                this.d = d;
            }
        }
        
        @o(generateAdapter = true)
        @Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/survey/json/SurveyConfigJson$SurveyJson$VariantJson;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
        public static final class VariantJson
        {
            public final boolean a;
            public final int b;
            public final float c;
            
            public VariantJson(final boolean a, final float c, final int b) {
                this.a = a;
                this.b = b;
                this.c = c;
            }
        }
    }
}
