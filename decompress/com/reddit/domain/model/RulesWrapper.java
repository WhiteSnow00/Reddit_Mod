// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import p1.h;
import ph0.a;
import ng2.e;
import com.squareup.moshi.n;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/model/RulesWrapper;", "", "communityRule", "", "Lcom/reddit/domain/model/CommunityRule;", "siteRules", "", "siteRulesFlow", "Lcom/reddit/domain/model/SiteRuleFlow;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCommunityRule", "()Ljava/util/List;", "getSiteRules", "getSiteRulesFlow", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class RulesWrapper
{
    private final List<CommunityRule> communityRule;
    private final List<String> siteRules;
    private final List<SiteRuleFlow> siteRulesFlow;
    
    public RulesWrapper(@n(name = "rules") final List<CommunityRule> communityRule, @n(name = "site_rules") final List<String> siteRules, @n(name = "site_rules_flow") final List<SiteRuleFlow> siteRulesFlow) {
        e.f((Object)communityRule, "communityRule");
        e.f((Object)siteRules, "siteRules");
        e.f((Object)siteRulesFlow, "siteRulesFlow");
        this.communityRule = communityRule;
        this.siteRules = siteRules;
        this.siteRulesFlow = siteRulesFlow;
    }
    
    public static RulesWrapper copy$default(final RulesWrapper rulesWrapper, List communityRule, List siteRules, List siteRulesFlow, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            communityRule = rulesWrapper.communityRule;
        }
        if ((n & 0x2) != 0x0) {
            siteRules = rulesWrapper.siteRules;
        }
        if ((n & 0x4) != 0x0) {
            siteRulesFlow = rulesWrapper.siteRulesFlow;
        }
        return rulesWrapper.copy(communityRule, siteRules, siteRulesFlow);
    }
    
    public final List<CommunityRule> component1() {
        return this.communityRule;
    }
    
    public final List<String> component2() {
        return this.siteRules;
    }
    
    public final List<SiteRuleFlow> component3() {
        return this.siteRulesFlow;
    }
    
    public final RulesWrapper copy(@n(name = "rules") final List<CommunityRule> list, @n(name = "site_rules") final List<String> list2, @n(name = "site_rules_flow") final List<SiteRuleFlow> list3) {
        e.f((Object)list, "communityRule");
        e.f((Object)list2, "siteRules");
        e.f((Object)list3, "siteRulesFlow");
        return new RulesWrapper(list, list2, list3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RulesWrapper)) {
            return false;
        }
        final RulesWrapper rulesWrapper = (RulesWrapper)o;
        return e.a((Object)this.communityRule, (Object)rulesWrapper.communityRule) && e.a((Object)this.siteRules, (Object)rulesWrapper.siteRules) && e.a((Object)this.siteRulesFlow, (Object)rulesWrapper.siteRulesFlow);
    }
    
    public final List<CommunityRule> getCommunityRule() {
        return this.communityRule;
    }
    
    public final List<String> getSiteRules() {
        return this.siteRules;
    }
    
    public final List<SiteRuleFlow> getSiteRulesFlow() {
        return this.siteRulesFlow;
    }
    
    @Override
    public int hashCode() {
        return this.siteRulesFlow.hashCode() + a.b((List)this.siteRules, this.communityRule.hashCode() * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("RulesWrapper(communityRule=");
        t.append(this.communityRule);
        t.append(", siteRules=");
        t.append(this.siteRules);
        t.append(", siteRulesFlow=");
        return h.d(t, (List)this.siteRulesFlow, ')');
    }
}
