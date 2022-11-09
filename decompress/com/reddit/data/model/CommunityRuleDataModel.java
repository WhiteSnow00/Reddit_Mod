// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012" }, d2 = { "Lcom/reddit/data/model/CommunityRuleDataModel;", "", "name", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class CommunityRuleDataModel
{
    private final String description;
    private final String name;
    
    public CommunityRuleDataModel(final String name, final String description) {
        f.f((Object)name, "name");
        f.f((Object)description, "description");
        this.name = name;
        this.description = description;
    }
    
    public final String component1() {
        return this.name;
    }
    
    public final String component2() {
        return this.description;
    }
    
    public final CommunityRuleDataModel copy(final String s, final String s2) {
        f.f((Object)s, "name");
        f.f((Object)s2, "description");
        return new CommunityRuleDataModel(s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommunityRuleDataModel)) {
            return false;
        }
        final CommunityRuleDataModel communityRuleDataModel = (CommunityRuleDataModel)o;
        return f.a((Object)this.name, (Object)communityRuleDataModel.name) && f.a((Object)this.description, (Object)communityRuleDataModel.description);
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public final String getName() {
        return this.name;
    }
    
    @Override
    public int hashCode() {
        return this.description.hashCode() + this.name.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("CommunityRuleDataModel(name=");
        k.append(this.name);
        k.append(", description=");
        return b.k(k, this.description, ')');
    }
}
