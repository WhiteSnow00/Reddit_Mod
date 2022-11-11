// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import sg2.e;
import com.squareup.moshi.n;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011" }, d2 = { "Lcom/reddit/domain/model/SiteRulesWrapper;", "", "sitewide_rules", "", "Lcom/reddit/domain/model/SiteRuleFlow;", "(Ljava/util/List;)V", "getSitewide_rules", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SiteRulesWrapper
{
    private final List<SiteRuleFlow> sitewide_rules;
    
    public SiteRulesWrapper(@n(name = "sitewide_rules") final List<SiteRuleFlow> sitewide_rules) {
        e.f((Object)sitewide_rules, "sitewide_rules");
        this.sitewide_rules = sitewide_rules;
    }
    
    public final List<SiteRuleFlow> component1() {
        return this.sitewide_rules;
    }
    
    public final SiteRulesWrapper copy(@n(name = "sitewide_rules") final List<SiteRuleFlow> list) {
        e.f((Object)list, "sitewide_rules");
        return new SiteRulesWrapper(list);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof SiteRulesWrapper && e.a((Object)this.sitewide_rules, (Object)((SiteRulesWrapper)o).sitewide_rules));
    }
    
    public final List<SiteRuleFlow> getSitewide_rules() {
        return this.sitewide_rules;
    }
    
    @Override
    public int hashCode() {
        return this.sitewide_rules.hashCode();
    }
    
    @Override
    public String toString() {
        return d.o(a.r("SiteRulesWrapper(sitewide_rules="), (List)this.sitewide_rules, ')');
    }
}
