// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import sg2.e;
import com.squareup.moshi.n;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/domain/chat/model/InviteToChannelRequestBody;", "", "users", "", "Lcom/reddit/domain/chat/model/User;", "(Ljava/util/List;)V", "getUsers", "()Ljava/util/List;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class InviteToChannelRequestBody
{
    private final List<User> users;
    
    public InviteToChannelRequestBody(@n(name = "users") final List<User> users) {
        e.f((Object)users, "users");
        this.users = users;
    }
    
    public final List<User> getUsers() {
        return this.users;
    }
}
