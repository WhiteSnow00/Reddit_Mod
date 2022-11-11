// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import com.squareup.moshi.x;
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
import kotlin.Metadata;
import com.squareup.moshi.JsonAdapter;

@Metadata(bv = {}, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/model/RulesWrapperJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/reddit/domain/model/RulesWrapper;", "", "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lcom/squareup/moshi/x;", "writer", "value_", "Lhg2/j;", "toJson", "Lcom/squareup/moshi/JsonReader$b;", "options", "Lcom/squareup/moshi/JsonReader$b;", "", "Lcom/reddit/domain/model/CommunityRule;", "listOfCommunityRuleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "listOfStringAdapter", "Lcom/reddit/domain/model/SiteRuleFlow;", "listOfSiteRuleFlowAdapter", "Lcom/squareup/moshi/y;", "moshi", "<init>", "(Lcom/squareup/moshi/y;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class RulesWrapperJsonAdapter extends JsonAdapter<RulesWrapper>
{
    private final JsonAdapter<List<CommunityRule>> listOfCommunityRuleAdapter;
    private final JsonAdapter<List<SiteRuleFlow>> listOfSiteRuleFlowAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonReader$b options;
    
    public RulesWrapperJsonAdapter(final y y) {
        e.f((Object)y, "moshi");
        this.options = JsonReader$b.a(new String[] { "rules", "site_rules", "site_rules_flow" });
        final a$b d = a0.d((Class)List.class, new Type[] { CommunityRule.class });
        final EmptySet instance = EmptySet.INSTANCE;
        this.listOfCommunityRuleAdapter = (JsonAdapter<List<CommunityRule>>)y.c((Type)d, (Set)instance, "communityRule");
        this.listOfStringAdapter = (JsonAdapter<List<String>>)y.c((Type)a0.d((Class)List.class, new Type[] { String.class }), (Set)instance, "siteRules");
        this.listOfSiteRuleFlowAdapter = (JsonAdapter<List<SiteRuleFlow>>)y.c((Type)a0.d((Class)List.class, new Type[] { SiteRuleFlow.class }), (Set)instance, "siteRulesFlow");
    }
    
    public RulesWrapper fromJson(final JsonReader jsonReader) {
        e.f((Object)jsonReader, "reader");
        jsonReader.h();
        List<CommunityRule> list = null;
        List<SiteRuleFlow> list3;
        List<SiteRuleFlow> list2 = list3 = null;
        while (jsonReader.hasNext()) {
            final int e = jsonReader.E(this.options);
            if (e != -1) {
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            continue;
                        }
                        list3 = (List)this.listOfSiteRuleFlowAdapter.fromJson(jsonReader);
                        if (list3 != null) {
                            continue;
                        }
                        throw a.n("siteRulesFlow", "site_rules_flow", jsonReader);
                    }
                    else {
                        list2 = (List)this.listOfStringAdapter.fromJson(jsonReader);
                        if (list2 != null) {
                            continue;
                        }
                        throw a.n("siteRules", "site_rules", jsonReader);
                    }
                }
                else {
                    list = (List)this.listOfCommunityRuleAdapter.fromJson(jsonReader);
                    if (list != null) {
                        continue;
                    }
                    throw a.n("communityRule", "rules", jsonReader);
                }
            }
            else {
                jsonReader.H();
                jsonReader.F1();
            }
        }
        jsonReader.r();
        if (list == null) {
            throw a.h("communityRule", "rules", jsonReader);
        }
        if (list2 == null) {
            throw a.h("siteRules", "site_rules", jsonReader);
        }
        if (list3 != null) {
            return new RulesWrapper(list, (List<String>)list2, list3);
        }
        throw a.h("siteRulesFlow", "site_rules_flow", jsonReader);
    }
    
    public void toJson(final x x, final RulesWrapper rulesWrapper) {
        e.f((Object)x, "writer");
        if (rulesWrapper != null) {
            x.h();
            x.u("rules");
            this.listOfCommunityRuleAdapter.toJson(x, (Object)rulesWrapper.getCommunityRule());
            x.u("site_rules");
            this.listOfStringAdapter.toJson(x, (Object)rulesWrapper.getSiteRules());
            x.u("site_rules_flow");
            this.listOfSiteRuleFlowAdapter.toJson(x, (Object)rulesWrapper.getSiteRulesFlow());
            x.s();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
    
    public String toString() {
        return "GeneratedJsonAdapter(RulesWrapper)";
    }
}
