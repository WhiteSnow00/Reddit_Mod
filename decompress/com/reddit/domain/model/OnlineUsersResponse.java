// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ak0.m;
import ah2.f;
import com.squareup.moshi.n;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0004H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/model/OnlineUsersResponse;", "", "onlineUserFullNames", "", "", "(Ljava/util/List;)V", "getOnlineUserFullNames", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class OnlineUsersResponse
{
    private final List<String> onlineUserFullNames;
    
    public OnlineUsersResponse(@n(name = "present_user_fullnames") final List<String> onlineUserFullNames) {
        f.f((Object)onlineUserFullNames, "onlineUserFullNames");
        this.onlineUserFullNames = onlineUserFullNames;
    }
    
    public final List<String> component1() {
        return this.onlineUserFullNames;
    }
    
    public final OnlineUsersResponse copy(@n(name = "present_user_fullnames") final List<String> list) {
        f.f((Object)list, "onlineUserFullNames");
        return new OnlineUsersResponse(list);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof OnlineUsersResponse && f.a((Object)this.onlineUserFullNames, (Object)((OnlineUsersResponse)o).onlineUserFullNames));
    }
    
    public final List<String> getOnlineUserFullNames() {
        return this.onlineUserFullNames;
    }
    
    @Override
    public int hashCode() {
        return this.onlineUserFullNames.hashCode();
    }
    
    @Override
    public String toString() {
        return m.n(a.k("OnlineUsersResponse(onlineUserFullNames="), (List)this.onlineUserFullNames, ')');
    }
}
