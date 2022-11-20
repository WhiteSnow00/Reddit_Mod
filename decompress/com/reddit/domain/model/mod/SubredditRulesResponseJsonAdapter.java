// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.mod;

import com.squareup.moshi.x;
import dd2.a;
import com.squareup.moshi.JsonReader;
import dd2.a$b;
import java.util.Set;
import kotlin.collections.EmptySet;
import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import ng2.e;
import com.squareup.moshi.y;
import com.squareup.moshi.JsonReader$b;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/model/mod/SubredditRulesResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/mod/SubredditRulesResponse;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lcg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "Lcom/reddit/domain/model/mod/SubredditRule;", "listOfSubredditRuleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "listOfStringAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubredditRulesResponseJsonAdapter extends JsonAdapter<SubredditRulesResponse>
{
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<List<SubredditRule>> listOfSubredditRuleAdapter;
    private final JsonReader$b options;
    
    public SubredditRulesResponseJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "rules", "site_rules" });
        final a$b d = a0.d((Class)List.class, new Type[] { SubredditRule.class });
        final EmptySet instance = EmptySet.INSTANCE;
        this.listOfSubredditRuleAdapter = (JsonAdapter<List<SubredditRule>>)y.c((Type)d, (Set)instance, "rules");
        this.listOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "siteRules");
    }
    
    public SubredditRulesResponse fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        List list = null;
        List list2 = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        continue;
                    }
                    list2 = (List)this.listOfStringAdapter.fromJson(jsonReader);
                    if (list2 != null) {
                        continue;
                    }
                    throw a.n("siteRules", "site_rules", jsonReader);
                }
                else {
                    list = (List)this.listOfSubredditRuleAdapter.fromJson(jsonReader);
                    if (list != null) {
                        continue;
                    }
                    throw a.n("rules", "rules", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.G1();
            }
        }
        jsonReader.r();
        if (list == null) {
            throw a.h("rules", "rules", jsonReader);
        }
        if (list2 != null) {
            return new SubredditRulesResponse(list, list2);
        }
        throw a.h("siteRules", "site_rules", jsonReader);
    }
    
    public /* bridge */ Object fromJson(final JsonReader jsonReader) {
        return this.fromJson(jsonReader);
    }
    
    public void toJson(final x x, final SubredditRulesResponse subredditRulesResponse) {
        e.f((Object)x, "writer");
        if (subredditRulesResponse != null) {
            x.h();
            x.v("rules");
            this.listOfSubredditRuleAdapter.toJson(x, (Object)subredditRulesResponse.getRules());
            x.v("site_rules");
            this.listOfStringAdapter.toJson(x, (Object)subredditRulesResponse.getSiteRules());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public /* bridge */ void toJson(final x x, final Object o) {
        this.toJson(x, (SubredditRulesResponse)o);
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(SubredditRulesResponse)";
    }
}
